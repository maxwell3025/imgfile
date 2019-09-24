package imgfile;

import java.awt.image.BufferedImage;

public class imagestuff {

	public static void main(String[] args) {
	}
	public static void writeimg(BufferedImage in, String destination){
		int width = in.getWidth();
		int height = in.getHeight();
		int area = width*height;
		byte[] out = new byte[area*4+8];
	}

}
