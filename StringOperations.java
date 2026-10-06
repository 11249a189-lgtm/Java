                                                                              STRING OPERATIONS IN JAVA
AIM:
    To write a Java program to perform various string operations using built-in String methods.
ALGORITHM:
Start the program.
Declare two strings, str1 = "Hello" and str2 = "World".
Find the length of the string.
Concatenate the two strings.
Convert strings to uppercase and lowercase.
Find a character at a specific index.
Extract a substring.
Compare two strings.
Compare strings ignoring case.
Replace characters in a string.
Check whether a string contains specific text.
Check whether a string starts and ends with specific text.
Find the index of a character.
Remove leading and trailing spaces using trim().
Stop the program.

PROGRAM:    
public class StringOperations {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        // 1. Length of string
        System.out.println("Length: " + str1.length());

        // 2. Concatenation
        System.out.println("Concatenation: " + str1.concat(" " + str2));

        // 3. Convert to Uppercase
        System.out.println("Uppercase: " + str1.toUpperCase());

        // 4. Convert to Lowercase
        System.out.println("Lowercase: " + str2.toLowerCase());

        // 5. Character at index
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 6. Substring
        System.out.println("Substring: " + str1.substring(1, 4));

        // 7. Compare strings
        System.out.println("Equals: " + str1.equals(str2));

        // 8. Compare ignoring case
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("HELLO"));

        // 9. Replace characters
        System.out.println("Replace: " + str1.replace('l', 'x'));

        // 10. Check if string contains text
        System.out.println("Contains 'ell': " + str1.contains("ell"));

        // 11. Starts with
        System.out.println("Starts with 'He': " + str1.startsWith("He"));

        // 12. Ends with
        System.out.println("Ends with 'lo': " + str1.endsWith("lo"));

        // 13. Index of character
        System.out.println("Index of 'l': " + str1.indexOf('l'));

        // 14. Trim spaces
        String str3 = "   Java Programming   ";
        System.out.println("Trimmed: '" + str3.trim() + "'");
    }
}

OUTPUT:
Length: 5
Concatenation: Hello World
Uppercase: HELLO
Lowercase: world
Character at index 1: e
Substring: ell
Equals: false
Equals Ignore Case: true
Replace: Hexxo
Contains 'ell': true
Starts with 'He': true
Ends with 'lo': true
Index of 'l': 2
Trimmed: 'Java Programming'

    RESULT:
            Thus, the Java program to perform various string operations such as concatenation, comparison, substring, replacement, searching, and trimming was successfully executed.
