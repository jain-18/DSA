package Strings;

public class LeetCode13 {
    public static void main(String[] args) {
        String roman = "III";
        int ans = 0;
        for(int i = 0;i<roman.length();i++){
            if(i+1 < roman.length() && valueOfRoman(roman.charAt(i)) < valueOfRoman(roman.charAt(i+1))){
                ans = ans + (valueOfRoman(roman.charAt(i+1))- valueOfRoman(roman.charAt(i)));
                i++;
            }else {
                ans = ans + valueOfRoman(roman.charAt(i));
            }
        }
        System.out.println(ans);
        
    }
    private static int valueOfRoman(char c){
        if(c == 'I'){
            return 1;
        }else if(c == 'V'){
            return 5;
        }else if(c == 'X'){
            return 10;
        }else if(c == 'L'){
            return 50;
        }else if(c == 'C'){
            return 100;
        }else if(c == 'D'){
            return 500;
        }else if(c == 'M'){
            return 1000;
        }else{
            return 0;
        }
    }
}
