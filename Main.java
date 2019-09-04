import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import java.lang.Thread;

public class Main implements KeyListener {

    static boolean running = true;

    public static void main(String[] args) {
        int clicks;
        int delay;
        int clickCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("---AutoClicker---");

        System.out.println("Enter seconds between clicks: ");
        delay = scanner.nextInt();
        System.out.println();

        System.out.println("Programs will start in 3 seconds.");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ClickEngine clicker = new ClickEngine();
        clicker.setDelay(delay);


        while(running) {
            clicker.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
            clickCount++;
        }

        System.out.println("AutoClicker complete with " + clickCount + " clicks.");

    }

    public void stop() {
        running = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_X) {
            //stop();
            System.out.println("Hello there!");
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
