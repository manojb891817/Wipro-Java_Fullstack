import java.util.Random;

class ColorTask implements Runnable {
    private final String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
    private final Random rand = new Random();

    @Override
    public void run() {
        while (true) {
            int index = rand.nextInt(colours.length);
            String colour = colours[index];
            System.out.println("Selected Colour: " + colour);

            if (colour.equals("red")) {
                System.out.println("Red found. Stopping thread.");
                break;
            }

            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ColourDisplay {
    public static void main(String[] args) {
        Thread colourThread = new Thread(new ColorTask());
        colourThread.start();
    }
}