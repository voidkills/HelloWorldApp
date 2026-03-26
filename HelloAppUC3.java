public class HelloAppUC3 {
    public static void main(String[] args) {
        // Array Length Checking & Ternary Operator:
        // Safely check if an argument exists. 
        // If true (args.length > 0), assign args[0] to 'name'. 
        // If false, assign the default value "World".
        String name = (args.length > 0) ? args[0] : "World";
        
        // String Concatenation (Operator Overloading):
        // Combine strings with the + operator to create the final message
        System.out.println("Hello, " + name + "!");
    }
}