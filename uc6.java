public class HelloAppUC6 {
    public static void main(String[] args) {

        // If no arguments, print default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String result = "Hello, ";

            // Append names with delimiter
            for (String name : args) {
                result += name + ", ";
            }

            // Remove trailing ", " using substring
            result = result.substring(0, result.length() - 2);

            // Print final result
            System.out.println(result + "!");
        }
    }
}
