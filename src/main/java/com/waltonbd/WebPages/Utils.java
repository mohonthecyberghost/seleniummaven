package com.waltonbd.WebPages;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {

	public static void CaptureScreenShot(WebDriver driver, String fileName, String type) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;

		if (type.equals("FILE")) {
			// Output Type : File
			File file = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("./Screenshots/" + fileName));
		}

		else if (type.equals("BASE64")) {
			// Output Type : BASE64
			String base64Code = ts.getScreenshotAs(OutputType.BASE64);
			byte[] byteArray = Base64.getDecoder().decode(base64Code);
			FileOutputStream fos = new FileOutputStream(new File("./Screenshots/"+ fileName));
			fos.write(byteArray);
			fos.close();
		}

		else if (type.equals("BYTES")) {
			// Output Type : BYTES
			byte[] byteArr = ts.getScreenshotAs(OutputType.BYTES);
			FileOutputStream fos_byte = new FileOutputStream(new File("./Screenshots/"+ fileName));
			fos_byte.write(byteArr);
			fos_byte.close();
		}
	}

}
