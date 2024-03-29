import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel {
    private static final int size = 200;
    private static final int gap = 4;
    private static List<Integer> numbers = new ArrayList<>();

    private static void swapColors(Graphics g, int i, int j, int x, int y) {
        g.setColor(Color.GREEN);
        g.drawLine(j, size, j, size - y);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        g.setColor(Color.BLACK);
        g.drawLine(j, size, j, size - y);

        g.setColor(Color.WHITE);
        g.drawLine(j, size, j, size - x);

        g.setColor(Color.BLACK);
        g.drawLine(i, size, i, size - x);

        g.setColor(Color.GREEN);
        g.drawLine(i, size, i, size - y);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        g.setColor(Color.WHITE);
        g.drawLine(i, size, i, size - y);
    }

    private static void swap(List<Integer> arr, int i, int j) {
        Collections.swap(arr, i, j);
    }

    private static void selectionSort(Graphics g) {
        for (int i = 0; i < size - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < size; j++) {
                if (numbers.get(j) < numbers.get(minIdx)) {
                    minIdx = j;
                }
            }
            swap(numbers, i, minIdx);
            swapColors(g, gap * i + 1, gap * minIdx + 1, numbers.get(minIdx), numbers.get(i));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 1; i <= gap * size; i += gap) {
            g.drawLine(i, size, i, size - numbers.get(i / gap));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Selection Sort Visualization");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(gap * size + 1, size + 1);
        frame.setResizable(false);

        Main panel = new Main();
        frame.add(panel);
        frame.setVisible(true);
        for (int i = 1; i <= size; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers, new Random());

        try {
            Thread.sleep(200); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectionSort(panel.getGraphics());
        panel.repaint();
        System.out.println(numbers);

        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.exit(0);
    }
}
