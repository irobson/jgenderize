package com.github.irobson.jgenderize;

import com.github.irobson.jgenderize.client.Genderize;
import com.github.irobson.jgenderize.model.NameGender;
import java.util.List;
import java.util.Locale;
import junit.framework.Assert;
import org.junit.Test;

public class GenderizeIoAPITest {

    @Test
    public void testGetSingleNameGender() {
        Genderize api = GenderizeIoAPI.create();
        NameGender gender = api.getGender("Kim");
        Assert.assertTrue(gender.isFemale());
    }

    @Test
    public void testGetSingleNameGenderByLocalization() {
        Genderize api = GenderizeIoAPI.create();
        NameGender gender = api.getGender("Kim", new Locale("da", "DK"));
        Assert.assertTrue(gender.isMale());
    }

    @Test
    public void testGetMultiNameGenderByLocalization() {
        Genderize api = GenderizeIoAPI.create();
        List<NameGender> genders = api.getGenders(new String[]{"Robson", "Gilmar", "Marlise"}, new Locale("pt", "BR"));
        Assert.assertEquals(3, genders.size());
        Assert.assertTrue(genders.get(0).isMale());
        Assert.assertTrue(genders.get(1).isMale());
        Assert.assertTrue(genders.get(2).isFemale());
    }

    @Test
    public void testGetMultiNameGender() {
        Genderize api = GenderizeIoAPI.create();
        List<NameGender> genders = api.getGenders("Robson", "John", "Anna");
        Assert.assertEquals(3, genders.size());
        Assert.assertTrue(genders.get(0).isMale());
        Assert.assertTrue(genders.get(1).isMale());
        Assert.assertTrue(genders.get(2).isFemale());
    }

}
