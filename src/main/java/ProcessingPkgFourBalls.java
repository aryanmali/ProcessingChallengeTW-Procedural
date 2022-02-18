import processing.core.PApplet;

public class ProcessingPkgFourBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int xCoordinate = 0;

    public static void main(String[] args) {
        PApplet.main("ProcessingPkgFourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(xCoordinate++,HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(xCoordinate * 2,HEIGHT/5 * 2, DIAMETER, DIAMETER);
        ellipse(xCoordinate * 3,HEIGHT/5 * 3, DIAMETER, DIAMETER);
        ellipse(xCoordinate * 4,HEIGHT/5 * 4, DIAMETER, DIAMETER);
    }
}
