import java.util.*;
public class Troll {
    public static String disemvowel(String str) {
List<Character> vowels = List.of('a','e','i','o','u');
      String result  = "";
      for(char a: str.toCharArray()){
        if(Character.isLowerCase(a)){
        if(vowels.contains(a)){
          continue;
        }
        }else{
          a= Character.toLowerCase(a);
          if(vowels.contains(a)){
          continue;
        }
          a= Character.toUpperCase(a);
      }
        result+=a;
      }
      
      return result;
    }
}
