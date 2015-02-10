package com.github.irobson.jgenderize;

import com.github.irobson.jgenderize.client.DefaultGenderize;
import com.github.irobson.jgenderize.client.Genderize;

/**
 *
 * @author Robson_Farias
 */
public class GenderizeIoAPI {
    private GenderizeIoAPI() { }
    
    public static Genderize create() {
        return new DefaultGenderize();
    }
}
