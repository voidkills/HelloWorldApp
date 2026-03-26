public class HelloAppUC6 {
    public static void main(String[] args) {
        // Default Values & Array Length Check:
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // StringBuilder: Efficient string construction
            StringBuilder nameBuilder = new StringBuilder();
            
            // Enhanced For Loop: Simplified iteration
            for (String name : args) {
                // Delimiter Handling: Always append the same delimiter after every name
                nameBuilder.append(name).append(", ");
            }
            
            // substring() Method & Trailing Character Removal:
            // Extract from index 0 up to (length - 2) to drop the final ", "
            String finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            
            // Print the final personalized greeting
            System.out.println("Hello, " + finalNames + "!");
            
            /*
             * HINT ALTERNATIVE (setLength):
             * Instead of creating a new string with substring(), you can truncate the builder itself:
             * nameBuilder.setLength(nameBuilder.length() - 2);
             * System.out.println("Hello, " + nameBuilder.toString() + "!");
             */
        }
    }
}
