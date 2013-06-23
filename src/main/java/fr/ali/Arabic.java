package fr.ali;

import static fr.ali.Converter.MAP_ARABIC_ROMAN;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Adouche Ali
 */
public class Arabic {

    private int arabic;

    public Arabic() {
    }

    public Arabic(int arabic) {
        this.arabic = arabic;
    }

    public String convertToRoman() {
        StringBuilder roman = new StringBuilder();
        append(roman);
        return roman.toString();
    }

    private void append(StringBuilder roman) {
        Set<Integer> arabicSet = MAP_ARABIC_ROMAN.keySet();
        Iterator<Integer> it = arabicSet.iterator();
        while (it.hasNext()) {
            int key = it.next();
            while (arabic >= key) {
                roman.append(MAP_ARABIC_ROMAN.get(key));
                arabic -= key;
            }
        }
    }
}
