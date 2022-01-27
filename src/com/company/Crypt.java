package com.company;
private char[] letters;

public class Crypt {
    public static void main(String[] args) {
        encrypt();
        exempel2();
        exempel3();
    }

    // Visar hur exemplet i teorigenomgången funkar i Java
    private static void encrypt() {
        String message = "Hej";

        letters = message.toCharArray();
        char key = '1';
        String crypt = "";

        for(int i =0;i<letters.length;i++) {

            for(int j =0;j<list.size();j++) {
                if(letters[i]==list.get(j)) {
                    letters[i]=shuffledList.get(j);
                    break;
                }

       /* for (int i = 0 ; i < message.length() ; i++) {
            System.out.println(Integer.toBinaryString(message.charAt(i)));
            System.out.println("0" + Integer.toBinaryString(key));
            System.out.println(Integer.toBinaryString(message.charAt(i)^key));
            System.out.println((message.charAt(i)^key) + "\n");
            crypt += (char)(message.charAt(i)^key);
        } */
        System.out.println(crypt);
    }

    // Visar hur XOR-kryptering funkar på byte-nivå
    public static void exempel2() {
        byte A = 72;
        byte B = 40;
        // måste casta till byte eftersom det alltid blir en int
        byte C = (byte)(A^B);
        System.out.println(A + "^" + B + "=" +C);
    }

    // Visar hur XOR-kryptering funkar på char-nivå
    public static void exempel3() {
        char m = 'H';
        char k = '(';
        // måste casta till char eftersom det alltid blir en int
        char c = (char)(m^k);
        System.out.println(m + "^" + k + "=" + c);
    }
}