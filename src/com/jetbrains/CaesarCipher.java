package com.jetbrains;

class CaesarCipher
{
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        String text = "AnitaMiring";
        int s = 8;
        System.out.println("Text  : " + text);
        System.out.println("Shift : " + s);
        StringBuffer eText = encrypt(text, s);
        System.out.println("Cipher: " + eText);
        s = s%26;
        System.out.println("De-Cipher: " + encrypt(eText.toString(),26-s));
    }
}
