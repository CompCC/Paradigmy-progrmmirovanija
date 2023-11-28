public class dexBinar {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(toBase(15, 16));
        System.out.println(toBase2(15, 16));
    }

    public static String toBase(int number, int base) {
        return Long.toUnsignedString(number, base);
    }

    public static String toBase2(int number, int base) {
        String resStr = "";
        int res;
        while (number > 0) {
            res = number % base;
            String resChar = "";
            if (res > 9) {
                resChar = String.valueOf((char) (res + 55));
            } else {
                resChar = Integer.toString(res);
            }
            resStr = resChar + res;
            number = number / base;
        }
        return resStr;
    }

}
