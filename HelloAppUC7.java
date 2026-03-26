public class HelloAppUC7 {
    public static void main(String[] args) {
        // Conditional Logic & Default Values: 
        // Check if no arguments are provided to display the fallback message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // String.join() Method & Delimiter Management:
            // This static utility method automatically joins the array elements 
            // with the specified delimiter, completely avoiding trailing commas!
            String names = String.join(", ", args);
            
            // Print the final, cleanly formatted greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}