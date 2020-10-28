package unl.cse.recursion;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SierpinskiTriangle extends JFrame {

	private static Random r = new Random();

	public SierpinskiTriangle() {
		super("Sierpinski Triangle");
		setVisible(true);
		setBackground(new Color(0, 0, 0));
		setSize(700, 550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel jp = new SierpinskiPanel();
		add(jp);
	}

	private class SierpinskiPanel extends JPanel {

		public void SeirpTri(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int n) {

			if (n == 0) {
				// pretty!
				// g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
				g.drawLine(x1, y1, x2, y2); // if n = 0 draw the triangle
				g.drawLine(x2, y2, x3, y3);
				g.drawLine(x3, y3, x1, y1);
				return;
			}

			// make 3 new triangles by connecting
			// the midpoints of the previous triangle
			int xa, ya, xb, yb, xc, yc;
			xa = (x1 + x2) / 2;
			ya = (y1 + y2) / 2;
			xb = (x1 + x3) / 2;
			yb = (y1 + y3) / 2;
			xc = (x2 + x3) / 2;
			yc = (y2 + y3) / 2;
			// recursively call the function using the 3 triangles
			SeirpTri(g, x1, y1, xa, ya, xb, yb, n - 1);
			SeirpTri(g, xa, ya, x2, y2, xc, yc, n - 1);
			SeirpTri(g, xb, yb, xc, yc, x3, y3, n - 1);
		}

		@Override
		public void paintComponent(Graphics g) {
			int recursions = 10;
			// call the recursive function sending in the number of recursions
			g.setColor(new Color(0, 255, 0));
			SeirpTri(g, 319, 0, 0, 479, 639, 479, recursions);
		}
	}

	public static void main(String[] args) {
		SierpinskiTriangle t = new SierpinskiTriangle();
	}

}
