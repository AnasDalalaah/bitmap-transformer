/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class BitmapTest {
    @Test public void testConvertBW() {
        Bitmap classUnderTest = new Bitmap("Coffee", "convertBW", "convertBW");
        assertTrue("app should create a file named CopyCoffee in the main resources file.", Files.exists(Paths.get("./src/main/resources/convertBW.bmp")));
    }

    @Test public void testFlipImage() {
        Bitmap classUnderTest = new Bitmap("Coffee", "flipImage", "flipImage");
        assertTrue("app should create a file named CopyCoffee in the main resources file.", Files.exists(Paths.get("./src/main/resources/flipImage.bmp")));
    }

    @Test public void testHalfSizeIt() {
        Bitmap classUnderTest = new Bitmap("Coffee", "halfSizeIt", "halfSizeIt");
        assertTrue("app should create a file named CopyCoffee in the main resources file.", Files.exists(Paths.get("./src/main/resources/halfSizeIt.bmp")));
    }
}
