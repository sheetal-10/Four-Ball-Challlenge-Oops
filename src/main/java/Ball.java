import processing.core.PApplet;

public class Ball {
   private int x;
   private final int y;
   private final int speed;

    public Ball(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void move() {
        x += speed;
    }

    public void draw(PApplet pApplet){
        pApplet.ellipse(x, y, 10, 10);

    }
}
