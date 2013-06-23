package fr.ali;
import static fr.ali.Converter.MAP_ARABIC_ROMAN;
import java.util.Iterator;
import java.util.Set;
/**
 *
 * @author Adouche Ali
 */
public class Roman {

    private String roman;
    public Roman(){
    }
    public Roman(String roman) {
        this.roman = roman;
    }

    public int convertToArabic() {
        int arabic = 0;
        arabic = increment(arabic);        
        return arabic;
    }

    private int increment(int arabic) {
        Set<Integer> keySet = MAP_ARABIC_ROMAN.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            String romanNumber = MAP_ARABIC_ROMAN.get(key);
            
            while (roman.startsWith(romanNumber)) {
                arabic += key;
                roman = roman.substring(romanNumber.length());
            }
        }
        return arabic;
    }
}
