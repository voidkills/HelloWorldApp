public class HelloAppUC4 {
    public static void main(String[] args) {
        // Conditional Branching: Check if any command-line arguments exist
        if (args.length > 0) {
            // StringBuilder: Efficiently build the combined names string without creating multiple String objects
            StringBuilder namesList = new StringBuilder();
            
            // For Loop & Array Handling: Iterate through the args array
            for (int i = 0; i < args.length; i++) {
                namesList.append(args[i]);
                
                // Add a comma and space after each name, except the very last one
                if (i < args.length - 1) {
                    namesList.append(", ");
                }
            }
            
            // String Concatenation: Combine the greeting with the built names list
            System.out.println("Hello, " + namesList.toString() + "!");
            
            /*
             * HINT ALTERNATIVE:
             * You could replace the entire StringBuilder and For Loop above with this single line:
             * String namesList = String.join(", ", args);
             * System.out.println("Hello, " + namesList + "!");
             */
        } else {
            // Default Value: Fallback message if no names are provided
            System.out.println("Hello, World!");
        }
    }
}
