package com.jetbrains;

public class SubstitutionCipher {

    final static String key = "]kYV}(!7P$n5_0i R:?jOWtF/=-pe'AD&r@6%ZXs\"v*N"
            + "[#wSl9zq2^+g;LoB`aGh{3.HIu4fbK)mU8|dMET><,Qc\\C1yxJ";

    static String text = "Anita Miring";

    public static void main(String[] args) {
        String enc = encode(text);
        System.out.println("Encoded: " + enc);
        System.out.println("\nDecoded: " + decode(enc));
    }

    static String encode(String s) {
        StringBuilder sb = new StringBuilder(s.length());

        for (char c : s.toCharArray()){
            sb.append(key.charAt((int) c - 32));
        }

        return sb.toString();
    }

    static String decode(String s) {
        StringBuilder sb = new StringBuilder(s.length());

        for (char c : s.toCharArray())
        {
            sb.append((char) (key.indexOf((int) c) + 32));
        }

        return sb.toString();
    }
}
