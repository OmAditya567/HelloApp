public class HelloApp {
    public static void main(String[] args) {
        // 1. Establish the default state
        String name = "World";

        // 2. Check if the user provided an argument
        if (args.length > 0) {
            name = args[0]; // Overwrite default with the first argument
        }

        // 3. Execute the output
        System.out.println("Hello " + name);
    }
}