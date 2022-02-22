import javax.swing.*;

public class Hello {

    String nameOfTheMan = "Ivan";
    int heidht = 186;

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello World");

        JFrame jFrame = new JFrame("Hello Java");
        jFrame.setSize(800, 600);

        JTextPane jTextPane = new JTextPane();
        jTextPane.setText("I LOVE JAVA");

        jFrame.add(jTextPane);

        jFrame.setVisible(true);
    }
}