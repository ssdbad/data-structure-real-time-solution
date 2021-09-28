package interviewPrep.round_two.char_frequency;

import java.util.LinkedHashMap;
import java.util.Map;

public class MinMaxCharFrequency {
    static int maxVal = -1;
    static int minValue = 100;
    public static void main(String[] args) {
        String input  ="org.springframework.beans.factory.annotation.Autowired";
        char[] array = input.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<array.length; i++){
            if(map.containsKey(array[i])){
                map.replace(array[i], map.get(array[i]), map.get(array[i])+1);
            }else{
                map.put(array[i], 1);
            }
        }
        System.out.println(map);

        
        map.forEach((key,value) -> {
            if(value > maxVal){
                maxVal = value;
            }
            if(value < minValue){
                minValue = value;
            }
        });

    }
}
