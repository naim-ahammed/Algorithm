package algoClass;

public class TrafficLight {

    enum LightColor {
        RED, YELLOW, GREEN
    }

    private LightColor currentColor;

    public TrafficLight() {
        this.currentColor = LightColor.RED; // Initial state
    }

    public void changeColor() {
        switch (currentColor) {
            case RED:
                currentColor = LightColor.GREEN;
                break;
            case YELLOW:
                currentColor = LightColor.RED;
                break;
            case GREEN:
                currentColor = LightColor.YELLOW;
                break;
        }
    }

    public void displayCurrentColor() {
        System.out.println("Current Light Color: " + currentColor);
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        // Simulate the traffic light changing colors
        for (int i = 0; i < 10; i++) {
            trafficLight.displayCurrentColor();
            trafficLight.changeColor();

            try {
                Thread.sleep(1000); // Pause for 1 second to simulate time passing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}