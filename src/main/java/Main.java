import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Objects;

public class Main {

    private static final long tenSecond = (long) Math.pow(10, 4);

    public static void main(final String[] args) {
//        cardioBoxing();
//        jumpingRope();
        sheathing();
    }

    private static void sheathing() {
        playSound("ready.wav");
        waitTenSeconds();
        for (int i = 0; i < 5; i++) {
            System.out.println("Wave " + (i + 1));
            playSound("fight.wav");
            waitSixtySeconds();
            playSound("fight.wav");
            waitSixtySeconds();
            playSound("youwin.wav");
            waitTwentySeconds();
        }
        playSound("gameover.wav");
        waitTenSeconds();
    }

    private static void jumpingRope() {
        playSound("ready.wav");
        waitTenSeconds();
        for (int i = 0; i < 5; i++) {
            System.out.println("Wave " + (i + 1));
            playSound("fight.wav");
            waitSixtySeconds();
            waitSixtySeconds();
            waitSixtySeconds();
            playSound("youwin.wav");
            waitSixtySeconds();
        }
        playSound("gameover.wav");
        waitTenSeconds();
    }

    private static void cardioBoxing() {
        playSound("ready.wav");
        waitTenSeconds();
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Wave " + (i + 1));
                playSound("fight.wav");
                waitThirtySeconds();
                playSound("youwin.wav");
                waitTenSeconds();
            }
//            for (int i = 0; i < 3; i++) {
//                System.out.println("Wave " + (i + 1));
//                playSound("fight.wav");
//                waitTwentySeconds();
//                playSound("youwin.wav");
//                waitFiveSeconds();
//                playSound("fight.wav");
//                waitTwentySeconds();
//                playSound("youwin.wav");
//                waitTenSeconds();
//            }
            playSound("gameover.wav");
            waitFiveSeconds();
        }
        waitTenSeconds();
    }


    private static void playSound(final String url) {
        try {
            final Clip clip = AudioSystem.getClip();
            final AudioInputStream inputStream = AudioSystem.getAudioInputStream(Objects.requireNonNull(Main.class.getResourceAsStream(url)));
            clip.open(inputStream);
            clip.start();
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    private static void waitTwentySeconds() {
        try {
            Thread.sleep(tenSecond * 2);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void waitTenSeconds() {
        try {
            Thread.sleep(tenSecond);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void waitFiveSeconds() {
        try {
            Thread.sleep(tenSecond / 2);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void waitFortyFiveSeconds() {
        try {
            Thread.sleep((long) (tenSecond * 4.5));
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void waitThirtySeconds() {
        try {
            Thread.sleep((long) (tenSecond * 3.0));
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void waitFifteenSeconds() {
        try {
            Thread.sleep((long) (tenSecond * 1.5));
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void waitSixtySeconds() {
        try {
            Thread.sleep(tenSecond * 6);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void wait120Seconds() {
        try {
            Thread.sleep(tenSecond * 12);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void waitFiftySeconds() {
        try {
            Thread.sleep(tenSecond * 5);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }
}
