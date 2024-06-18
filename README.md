# Equals() Method - Nonprimitive Data Type

## Description
This repository demonstrates how to compare non-primitive data types in Java. It includes examples of custom comparison methods for objects of different classes and highlights best practices for object comparison.

## Contents
- **Vehicle Class**: Represents a vehicle with `name` and `model` attributes. Includes a method to compare two `Vehicle` objects.
- **Grow Class**: Represents a plant with `type` and `color` attributes. Includes a method to compare two `Grow` objects.
- **Practice Class**: Contains the `main` method to execute and demonstrate the object comparison functionality.

## Classes and Methods

### Vehicle Class
- **Attributes**:
  - `name`: The name of the vehicle.
  - `model`: The model of the vehicle.
- **Methods**:
  - `toString()`: Returns a string representation of the vehicle in the format `name : model`.
  - `car(Vehicle that)`: Compares the current vehicle with another vehicle and returns whether they are the same.

### Grow Class
- **Attributes**:
  - `type`: The type of the plant.
  - `color`: The color of the plant.
- **Methods**:
  - `toString()`: Returns a string representation of the plant in the format `type : color`.
  - `fruits(Grow that)`: Compares the current plant with another plant and returns whether they are the same.

### Practice Class
- **Purpose**: Demonstrates the creation of `Vehicle` and `Grow` objects and their comparisons using the custom methods defined in their respective classes.
- **Output**:
  - `it's the same`
  - `true`

## How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/NonPrimitiveComparison.git
   ```
2. Navigate to the project directory:
   ```sh
   cd NonPrimitiveComparison
   ```
3. Compile the Java files:
   ```sh
   javac practice.java
   ```
4. Run the program:
   ```sh
   java practice
   ```

## Example Output
```
it's the same
true
```

## Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue for any improvements or suggestions.
