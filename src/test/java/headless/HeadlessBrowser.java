package headless;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.base.Baseclass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class HeadlessBrowser extends Baseclass {



	@Test
	public void starttest() {
		
		LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        //String test =Testing
        
		test = extent.createTest("Test1");
		System.out.println("Page Title is" + driver.getTitle());

		System.out.println("Page Title is" + driver.getTitle());
		
		test.log(Status.INFO, formattedTime);

	}

}
