class Vehicle // Define a class named Vehicle
{
    String name; // Declare a String variable to store the name of the vehicle
    String model; // Declare a String variable to store the model of the vehicle

    // Override the toString method to provide a string representation of the Vehicle object
    public String toString() 
    {
        return name + " : " + model; // Return a string in the format "name : model"
    }

    // Method to compare this Vehicle object with another Vehicle object
    public String car(Vehicle that) 
    {
        // Check if both the name and model of the current and the provided Vehicle objects are the same
        if (this.name.equals(that.name) && this.model.equals(that.model))
            return "it's the same"; // Return "it's the same" if both are the same
        else
            return "it's not the same"; // Return "it's not the same" if either is different
    }
}

class Grow // Define a class named Grow
{
    String type; // Declare a String variable to store the type of the plant
    String color; // Declare a String variable to store the color of the plant

    // Override the toString method to provide a string representation of the Grow object
    public String toString() 
    {
        return type + " : " + color; // Return a string in the format "type : color"
    }

    // Method to compare this Grow object with another Grow object
    public Boolean fruits(Grow that) 
    {
        // Check if both the type and color of the current and the provided Grow objects are the same
        if (this.type.equals(that.type) && this.color.equals(that.color))
            return true; // Return true if both are the same
        else
            return false; // Return false if either is different
    }
}

class Equal // Define a class named Equal
{
    public static void main(String[] args) // Main method to execute the program
    {
        Vehicle r = new Vehicle(); // Create a new instance of the Vehicle class
        r.name = "Mustang"; // Set the name of the vehicle to "Mustang"
        r.model = "ecoboost"; // Set the model of the vehicle to "ecoboost"

        Vehicle q = new Vehicle(); // Create another instance of the Vehicle class
        q.name = "Mustang"; // Set the name of the vehicle to "Mustang"
        q.model = "ecoboost"; // Set the model of the vehicle to "ecoboost"

        String result = r.car(q); // Call the car method to compare the two Vehicle objects
        System.out.println(result); // Print the result of the comparison

        Grow ab = new Grow(); // Create a new instance of the Grow class
        ab.type = "Lemon"; // Set the type of the plant to "Lemon"
        ab.color = "Yellow"; // Set the color of the plant to "Yellow"

        Grow bc = new Grow(); // Create another instance of the Grow class
        bc.type = "Lemon"; // Set the type of the plant to "Lemon"
        bc.color = "Yellow"; // Set the color of the plant to "Yellow"

        Boolean result2 = ab.fruits(bc); // Call the fruits method to compare the two Grow objects
        System.out.println(result2); // Print the result of the comparison
    }
}
