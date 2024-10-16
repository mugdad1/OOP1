

package mugdad1.lab7;

/**
 *
 * @author mugdad
 */
public class Lab7 {

    public static void main(String[] args) {
       /* 
       *String str4 = "Demo";
        *String str2 = new String("Demo");
        *String str3 = "Demo";
        if(str1 == str2)
            System.out.println("str1 and str2 refer same obj");
        else
            System.out.println("str1 and str2 refer diff obj");
        if(str1 == str3)
            System.out.println("str1 and str2 refer same obj");
        else
            System.out.println("str1 and str2 refer diff obj");
        if(str2==str3)
            System.out.println("str1 and str2 refer same obj");

        else
            System.out.println("str1 and str2 refer diff obj");*/
        String str1= "Java is an Object-Oriented Programming Languge ";
        String str2 = "Programming";
        float x = -4.5f;
        float y = 3.7f;
        System.out.println(str1.length());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.trim());
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(5));
        System.out.println(str1.substring(11));
        System.out.println(str1.substring(11,26));
        System.out.println(str1.indexOf("O"));
        System.out.println(str1.indexOf("O", 13));
        System.out.println(str1.equals(str2));
        System.out.println(str1.startsWith("Jav"));
        System.out.println(str1.startsWith(" Jav"));
        System.out.println(str1.endsWith("Language"));
        System.out.println(str1.endsWith("Language "));
        System.out.println(str1.contains(str2));
        System.out.println(Math.abs(x));
        System.out.println(Math.ceil(x));
        System.out.println(Math.ceil(y));
        System.out.println(Math.floor(x));
        System.out.println(Math.floor(y));
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));
        System.out.println(Math.pow(y,3));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.cos(0));
        System.out.println(Math.sin(0));
        System.out.println(Math.tan(0));
        
    }
}


