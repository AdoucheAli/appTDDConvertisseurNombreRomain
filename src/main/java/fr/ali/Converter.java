/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ali;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Adouche Ali
 */
public class Converter {

    public static final Map<Integer, String> MAP_ARABIC_ROMAN;

    static {
        MAP_ARABIC_ROMAN = new LinkedHashMap<Integer, String>();
        MAP_ARABIC_ROMAN.put(1000, "M");
        MAP_ARABIC_ROMAN.put(900, "CM");
        MAP_ARABIC_ROMAN.put(500, "D");
        MAP_ARABIC_ROMAN.put(400, "CD");
        MAP_ARABIC_ROMAN.put(100, "C");
        MAP_ARABIC_ROMAN.put(90, "XC");
        MAP_ARABIC_ROMAN.put(50, "L");
        MAP_ARABIC_ROMAN.put(40, "XL");
        MAP_ARABIC_ROMAN.put(10, "X");
        MAP_ARABIC_ROMAN.put(9, "IX");
        MAP_ARABIC_ROMAN.put(5, "V");
        MAP_ARABIC_ROMAN.put(4, "IV");
        MAP_ARABIC_ROMAN.put(1, "I");
    }

    public static int toArabic(String roman) {
        return new Roman(roman).convertToArabic();
    }

    public static String toRoman(int arabic) {
        return new Arabic(arabic).convertToRoman();
    }
}
