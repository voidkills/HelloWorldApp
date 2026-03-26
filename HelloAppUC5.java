public class HelloAppUC5 {
    public static void main(String[] args) {
        // Array Length Check & Default Handling: 
        // Gracefully handle the scenario where no input is provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // StringBuilder: Efficient concatenation when combining multiple values
            StringBuilder namesList = new StringBuilder();
            boolean isFirst = true;
            
            // Enhanced For Loop (For-Each): 
            // Cleaner iteration over array elements without index management
            for (String name : args) {
                // Conditional Delimiter Logic:
                // Add a comma and space before every name EXCEPT the first one
                if (!isFirst) {
                    namesList.append(", ");
                }
                namesList.append(name);
                isFirst = false; // Set to false after the first iteration
            }
            
            // String Concatenation: Build the final greeting message
            System.out.println("Hello, " + namesList.toString() + "!");
        }
    }
}
