import functions.ImageFilter;
import utils.ImageUtils;
import utils.RgbMaster;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        final BufferedImage image = ImageUtils.getImage("image/crab.png");
        final RgbMaster rgbMaster = new RgbMaster(image);
        rgbMaster.changeImage(ImageFilter::sepia);
        ImageUtils.saveImage(rgbMaster.getImage(), "image/cloned_crab.png");
    }
}
