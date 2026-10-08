class Solution {
    public int romanToInt(String s) {
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");
        
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == 'I') total += 1;
            else if (ch == 'V') total += 5;
            else if (ch == 'X') total += 10;
            else if (ch == 'L') total += 50;
            else if (ch == 'C') total += 100;
            else if (ch == 'D') total += 500;
            else if (ch == 'M') total += 1000;
        }
        
        return total;
    }
}