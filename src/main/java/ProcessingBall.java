import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class ProcessingBall extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int SPEED_1 = 1;
    int SPEED_2 = 2;
    int SPEED_3 = 3;
    int SPEED_4 = 4;

    List<Ball> balls;

    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;

    public static void main(String[] args) {
        PApplet.main("ProcessingBall", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    public void setup() {
        ball1 = new Ball(0, HEIGHT / 4, SPEED_1);
        ball2 = new Ball(0, HEIGHT * 2 / 4, SPEED_2);
        ball3 = new Ball(0, HEIGHT * 3 / 4, SPEED_3);
        ball4 = new Ball(0, HEIGHT * 4 / 4, SPEED_4);

        balls = Arrays.asList(ball1, ball2, ball3, ball4);
    }

    @Override
    public void draw() {
        balls.forEach(Ball::move);
        balls.forEach(ball -> ball.draw(this));

    }
}
