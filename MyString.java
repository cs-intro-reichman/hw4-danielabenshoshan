public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        char [] lowerCaseArr = new char[str.length()]; 
        String output = ""; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            if ((int) ch >= 65 && (int) ch <= 90) {
                ch = (char) ((int) ch + 32); 
            }
            lowerCaseArr[i] = ch; 
        }
        for (int i = 0; i < lowerCaseArr.length; i++) {
            output += lowerCaseArr[i]; 
        }
        return output;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if(str2.length() == 0){
            return true;
        }
        if( str1.length()< str2.length()){
            return false;
        }
        for ( int i = 0; i< (str1.length()-str2.length()); i++ ){
            boolean flag= true;
            for ( int j=0; j< str2.length(); j++){
                if( str1.charAt(i+j) != str2.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return true;
            }
        }
        return false;
    }
}
