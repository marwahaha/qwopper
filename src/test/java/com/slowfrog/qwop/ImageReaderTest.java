package com.slowfrog.qwop;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ImageReaderTest {

    @Test
    public void readImages() throws IOException {
        BufferedImage img = ImageIO.read(getClass().getClassLoader().getResourceAsStream("./dist_11.2.png"));
        float result = ImageReader.readDistance(img);
        assertThat(result, equalTo(11.2f));
    }
}
