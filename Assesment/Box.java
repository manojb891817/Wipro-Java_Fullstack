public class Box {
    // Instance variables
    private final double width;
    private final double height;
    private final double depth;

    // Parameterized constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    public double getVolume() {
        return width * height * depth;
    }

    // Main method to test the Box class
    public static void main(String[] args) {
        // Create a Box object
        Box myBox = new Box(3.5, 4.2, 5.0);

        // Display the volume
        System.out.println("Volume of the box: " + myBox.getVolume());
    }
}