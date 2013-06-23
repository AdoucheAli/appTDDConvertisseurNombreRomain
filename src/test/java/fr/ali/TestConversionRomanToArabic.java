/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ali;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author Adouche Ali
 */
public class TestConversionRomanToArabic {

    @Test
    public void should_convert_I_To_1() {
        ckeckToArabic("I", 1);
    }

    @Test
    public void should_convert_II_To_2() {
        ckeckToArabic("II", 2);
    }

    @Test
    public void should_convert_III_To_3() {
        ckeckToArabic("III", 3);
    }

    @Test
    public void should_convert_IV_To_4() {
        ckeckToArabic("IV", 4);
    }

    @Test
    public void should_convert_V_To_5() {
        ckeckToArabic("V", 5);
    }

    @Test
    public void should_convert_VI_To_6() {
        ckeckToArabic("VI", 6);
    }

    @Test
    public void should_convert_VII_To_7() {
        ckeckToArabic("VII", 7);
    }

    @Test
    public void should_convert_VIII_To_8() {
        ckeckToArabic("VIII", 8);
    }

    @Test
    public void should_convert_IX_To_9() {
        ckeckToArabic("IX", 9);
    }

    @Test
    public void should_convert_X_To_10() {
        ckeckToArabic("X", 10);
    }

    @Test
    public void should_convert_XL_To_40() {
        ckeckToArabic("XL", 40);
    }

    @Test
    public void should_convert_L_To_50() {
        ckeckToArabic("L", 50);
    }

    @Test
    public void should_convert_LX_To_60() {
        ckeckToArabic("LX", 60);
    }

    @Test
    public void should_convert_C_To_100() {
        ckeckToArabic("C", 100);
    }

    @Test
    public void should_convert_CMXCIX_To_999() {
        ckeckToArabic("CMXCIX", 999);
    }

     @Test
    public void should_convert_MCMXCIX_to_1999() {
        ckeckToArabic("MCMXCIX", 1999);
    }

    @Test
    public void should_convert_MMVII_To_2007() {
        ckeckToArabic("MMVII", 2007);
    }


     @Test
    public void should_convert_MMXIV_To_2014() {
        ckeckToArabic("MMXIV", 2014);
    }
    private void ckeckToArabic(String roman, int arabic) {
        assertThat(Converter.toArabic(roman), is(arabic));
    }
}
