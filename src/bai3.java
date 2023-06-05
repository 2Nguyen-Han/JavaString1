public class bai3 {
    public static void main(String[] args)
    {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);


        // Concatenate the two strings together.
        String str3 = str1.concat(str2);

        // Display the new String.
        System.out.println("The concatenated string: " + str3);
    }

    public static class bai2 {
        public static void main(String[] args) {
            String str1 = "This is exercise 1";
            String str2 = "This is Exercise 1";

            System.out.println("String 1: " + str1);
            System.out.println("String 2: " + str2);

            // Compare the two strings.
            int result = str1.compareToIgnoreCase(str2);

            // Display the results of the comparison.
            if (result < 0)
            {
                System.out.println("\"" + str1 + "\"" +
                        " is less than " +
                        "\"" + str2 + "\"");
            }
            else if (result == 0)
            {
                System.out.println("\"" + str1 + "\"" +
                        " is equal to " +
                        "\"" + str2 + "\"");
            }
            else // if (result > 0)
            {
                System.out.println("\"" + str1 + "\"" +
                        " is greater than " +
                        "\"" + str2 + "\"");
            }
        }
    }
}
