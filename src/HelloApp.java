public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Start building the greeting string
            String greeting = "Hello, ";

            // Append each name with a trailing delimiter
            for (String name : args) {
                greeting += name + ", ";
            }

            // Remove the final trailing ", " (which is 2 characters long)
            greeting = greeting.substring(0, greeting.length() - 2);

            // Add the final exclamation mark and print
            System.out.println(greeting + "!");
        }
    }
}