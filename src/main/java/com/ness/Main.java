package com.ness;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;
import org.imgscalr.Scalr.Method;
import org.imgscalr.Scalr.Mode;

public class Main {
    public static void main(String[] args) throws IOException {
        // Load the image file
        File imageFile = new File("src/main/java/com/ness/input.jpg");
        BufferedImage image = ImageIO.read(imageFile);

        // Create a new image with the same parameters as original
        BufferedImage result = Scalr.resize(image, Method.SPEED, Mode.FIT_EXACT, image.getWidth(), image.getHeight());

        // Create a graphics object to draw onto the image
        Graphics2D graphics = result.createGraphics();

        // Set the font and color for the text
        Font font = new Font("Arial", Font.BOLD, 35);
        graphics.setFont(font);
        graphics.setColor(Color.BLACK);

        // Write the text onto the image
        graphics.drawString("Norbert Vozar", image.getWidth() / 20, image.getHeight() /2);

        // Save the resulting image to a file
        ImageIO.write(result, "jpg", new File("src/main/java/com/ness/output.jpg"));
        System.out.println("Done.");
    }
}

