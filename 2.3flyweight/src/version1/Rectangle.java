package version1;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle implements Shape {

	public Rectangle() {
		System.out.println("Rectangle object created");
	}
	@Override
	public void draw(Graphics g, int x, int y, int width, int height,
			Color color) {
		g.setColor(color);
		g.drawRect(x, y, width, height);
	}

}
