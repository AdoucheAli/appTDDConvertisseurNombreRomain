package fr.ali;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author Adouche Ali
 */
public class TestConversionArabicToRoman {

    @Test
    public void should_convert_1_To_I() {
        ckeckToRoman(1, "I");
    }

    @Test
    public void should_convert_2_To_II() {
        ckeckToRoman(2, "II");
    }

    @Test
    public void should_convert_3_To_III() {
        ckeckToRoman(3, "III");
    }

    @Test
    public void should_convert_4_To_IV() {
        ckeckToRoman(4, "IV");
    }

    @Test
    public void should_convert_5_To_V() {
        ckeckToRoman(5, "V");
    }

    @Test
    public void should_convert_6_To_VI() {
        ckeckToRoman(6, "VI");
    }

    @Test
    public void should_convert_7_To_VII() {
        ckeckToRoman(7, "VII");
    }

    @Test
    public void should_convert_8_To_VIII() {
        ckeckToRoman(8, "VIII");
    }

    @Test
    public void should_convert_9_To_IX() {
        ckeckToRoman(9, "IX");
    }

    @Test
    public void should_convert_10_To_X() {
        ckeckToRoman(10, "X");
    }

    @Test
    public void should_convert_40_To_XL() {
        ckeckToRoman(40, "XL");
    }

    @Test
    public void should_convert_50_To_L() {
        ckeckToRoman(50, "L");
    }

    @Test
    public void should_convert_90_To_XC() {
        ckeckToRoman(90, "XC");
    }

    @Test
    public void should_convert_100_To_C() {
        ckeckToRoman(100, "C");
    }

    @Test
    public void should_convert_400_To_CD() {
        ckeckToRoman(400, "CD");
    }

    @Test
    public void should_convert_500_To_D() {
        ckeckToRoman(500, "D");
    }

    @Test
    public void should_convert_900_To_CM() {
        ckeckToRoman(900, "CM");
    }

    @Test
    public void should_convert_999_To_CMXCIX() {
        ckeckToRoman(999, "CMXCIX");
    }
    
    @Test
    public void should_convert_1000_To_M() {
        ckeckToRoman(1000, "M");
    }
    
    @Test
    public void should_convert_1999_To_MCMXCIX() {
        ckeckToRoman(1999, "MCMXCIX");
    }

    @Test
    public void should_convert_2008_To_MMVIII() {
        ckeckToRoman(2008, "MMVIII");
    }


     @Test
    public void should_convert_2013_To_MMXIII() {
        ckeckToRoman(2013, "MMXIII");
    }
     

    private void ckeckToRoman(int arabic, String roman) {
        assertThat(Converter.toRoman(arabic), is(roman));
    }
}
