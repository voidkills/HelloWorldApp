public class HelloAppUC2 {
    public static void main(String[] args) {
        // Error Prevention & Conditional Logic: 
        // Check if the args array has elements to avoid ArrayIndexOutOfBoundsException
        if (args.length > 0) {
            // Array Indexing: Access the first command-line argument
            String name = args[0];
            
            // String Concatenation: Combine strings with the + operator
            System.out.println("Hello, " + name + "!");
        } else {
            // Default Value: Fallback message if no arguments are provided
            System.out.println("Hello, World!");
        }
    }
}