public class HelloAppUC7 {
    public static void main(String[] args) {

        // If no arguments, print default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join all names with comma and space
            String names = String.join(", ", args);

            // Print final greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}
