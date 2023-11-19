/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javachallenges;

/**
 *
 * @author sit_gam
 */
public class JavaChallenges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        checkStringPalindrome("Clevertech");
        checkMethod();
    }
    
    private static boolean checkStringPalindrome(String mStringOriginal) {
        //Reverse the original string
        String resersedString = stringReversal(mStringOriginal);
        //Check that the reversed string is the same as the original string.
        return resersedString.equalsIgnoreCase(mStringOriginal);
    }  
    
    private static String stringReversal(String mStringToReverse) {
        String reversedStringResult = "";
        //Perform string reversal by traversing original string back to front. 
        for(int i = (mStringToReverse.length()- 1); i >= 0; i--) {
            reversedStringResult = reversedStringResult + 
                    mStringToReverse.charAt(i);
        }
        return reversedStringResult;
    }
    
    private static void checkMethod() {
        int count = 0;
        try {
            count++;
            try {
                count++;
                throw new Exception();
            } catch (Exception ex) {
                throw new Exception();
            }
        } catch(Exception ex) {
            count++;
        }
        System.out.println("1.0 =============== count: " + count);
    }
}