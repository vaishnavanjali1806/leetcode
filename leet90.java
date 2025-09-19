class Spreadsheet {

    
    private final Map<String, Integer> map;

    // Constructor: We create a new spreadsheet with a given number of rows.
    // (The 'rows' parameter isn't used, which is a bit quirky! 🤔)
    public Spreadsheet(int rows) {
        this.map = new HashMap<>(); // We prepare a fresh, empty memory.
    }
    
    // Write a number into a named cell. Like writing "5" on the page labeled "A1".
    public void setCell(String cell, int value) {
        map.put(cell, value); // Puts the value into our memory under the cell name.
    }
    
    // Erase a cell from the notebook.
    public void resetCell(String cell) {
        map.remove(cell); // Finds the cell name in memory and deletes it.
    }
    
    // The magic method! Give it a string, and it gives you back a number.
    public int getValue(String formula) {
        // Find the position of the '+' sign in the formula string.
        // Example: For "=A1+5", plusIndex will be 3 (the index of '+').
        int plusIndex = formula.indexOf('+');
        
        // Split the formula into two parts around the '+' sign.
        // Part 1: From right after the '=' sign (index 1) to the '+' sign.
        String cell1 = formula.substring(1, plusIndex); // For "=A1+5", this is "A1"
        // Part 2: Everything after the '+' sign.
        String cell2 = formula.substring(plusIndex + 1); // For "=A1+5", this is "5"
        
       
        int val1 = parseValue(cell1); 
        int val2 = parseValue(cell2); 
       
        return val1 + val2;
    }

    // The decoder ring! This helper method translates a string into a number.
    private int parseValue(String input) {
      
        return (input.charAt(0) > '9')
                ? map.getOrDefault(input, 0) 
                : Integer.parseInt(input);    
    }
}
