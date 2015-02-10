package com.github.irobson.jgenderize;

import com.github.irobson.jgenderize.client.Genderize;
import com.github.irobson.jgenderize.client.DefaultGenderize;
import com.github.irobson.jgenderize.model.NameGender;
import java.util.List;

/**
 *
 * @author Robson_Farias
 */
public class Test {
    public static void main(String args[]) {
        Genderize genderizer = GenderizeIoAPI.create();
        System.out.println(genderizer.getGenders("Robson", "silvana", "Damião"));
    }
}
