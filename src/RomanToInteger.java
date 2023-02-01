public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0;
        char[] chars = s.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            switch (chars[i]) {
                case 'I':
                    if (result < 3) result++;
                    else result --;
                    break;
                case 'V':
                    result +=5;
                    break;
                case 'X':
                    if (result < 50) result += 10;
                    else result -=10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if (result < 500) result +=100;
                    else result -= 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();

        System.out.println(romanToInteger.romanToInt("III"));
        System.out.println(romanToInteger.romanToInt("IV"));
        System.out.println(romanToInteger.romanToInt("XXII"));
        System.out.println(romanToInteger.romanToInt("XLVI"));
    }
}
