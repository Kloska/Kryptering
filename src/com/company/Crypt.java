package com.company;

public class Crypt {
    static String value = "SampleStringToBeEncrypted";
    static String keyval = "thisIsAKey";

    public static void main(String args[]) { // test
        int[] encrypted = encrypt(value,keyval);
        for(int i = 0; i < encrypted.length; i++)
            System.out.printf("%d,", encrypted[i]);
        System.out.println("");
    }

    private static int[] encrypt(String str, String key) {
        int[] output = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            int o = (Integer.valueOf(str.charAt(i)) ^ Integer.valueOf(key.charAt(i % (key.length() - 1)))) + '0';
            output[i] = o;
        }
        return output;
    }
}
