package smaikap.test.com.testbeerapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smaikap on 10/25/15.
 */
public class BeerExpert {
    public static List<String> getBeerBrand(String color) {
        List<String> brands = new ArrayList<String>();
        if("light".equalsIgnoreCase(color)) {
            brands.add("Toit tintin");
            brands.add("Toit belgin ale");
        } else if("brown".equalsIgnoreCase(color)) {
            brands.add("Toit wiss");
            brands.add("Biere draught");
        } else if("dark".equalsIgnoreCase(color)) {
            brands.add("Toit Ocktober Fest Special");
            brands.add("Biere seasonal");
        } else if("amber".equalsIgnoreCase(color)) {
            brands.add("Sorry ... can't fine any ...");
        }
        return brands;
    }
}