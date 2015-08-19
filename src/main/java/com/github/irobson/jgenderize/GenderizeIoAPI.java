package com.github.irobson.jgenderize;

import com.github.irobson.jgenderize.client.DefaultGenderize;
import com.github.irobson.jgenderize.client.Genderize;


public class GenderizeIoAPI {
    private GenderizeIoAPI() { }
    
    public static Genderize create() {
        return new DefaultGenderize();
    }

    /**
     * @param apiKey Genderize.io API key.
     * @return A client instance that can make more queries than one without a key.
     */
    public static Genderize create(String apiKey) {
        return new DefaultGenderize(apiKey);
    }
}
