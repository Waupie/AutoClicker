import java.awt.*;

public class ClickEngine {
    private Robot robot;
    private int delay;

    public ClickEngine() {
        try {
            robot = new Robot();
        } catch (Exception e) {
            e.printStackTrace();
        }
        delay = 300;
    }

    public void clickMouse(int button) {
        try {
            robot.mousePress(button);
            robot.delay(250);
            robot.mouseRelease(button);
            robot.delay(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDelay(int ms) {
        this.delay = ms * 1000;
    }

}
