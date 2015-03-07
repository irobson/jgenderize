package com.github.irobson.jgenderize.client;

import com.github.irobson.jgenderize.model.NameGender;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

public class DefaultGenderize implements Genderize, Serializable {

    private final Client client = ClientBuilder.newBuilder().newClient();
    
    private static final String GENDERIZE_IO_API_URL = "https://api.genderize.io/";

    public NameGender getGender(String name, Locale locale) {
        WebTarget target = client.target(GENDERIZE_IO_API_URL).queryParam("name", name);
        if (locale != null) {
            target = target.queryParam("country_id", locale.getCountry());
            target = target.queryParam("language_id", locale.getLanguage());
        }
        return target.request(MediaType.APPLICATION_JSON_TYPE).get(NameGender.class);
    }

    public List<NameGender> getGenders(String[] names, Locale locale) {
        GenericType<List<NameGender>> genericType = new GenericType<List<NameGender>>() {
        };

        WebTarget target = client.target(GENDERIZE_IO_API_URL);
        for (int i = 0; i < names.length; i++) {
            target = target.queryParam(String.format("name[%d]", i), names[i]);
        }
        if (locale != null) {
            target = target.queryParam("country_id", locale.getCountry());
            target = target.queryParam("language_id", locale.getLanguage());
        }
        return target.request(MediaType.APPLICATION_JSON_TYPE).get(genericType);
    }

    public NameGender getGender(String name) {
        return getGender(name, null);
    }

    public List<NameGender> getGenders(String... names) {
        return getGenders(names, null);
    }

}
