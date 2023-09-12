package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppiumBuilder {

    private String App = "E:\\Learning\\Mobile_Automation\\Appium\\src\\test\\resources\\General-Store.apk";
    private AppiumDriverLocalService appiumDriverLocalService;
    public AndroidDriver driver;


    @BeforeClass
    public void AppiumTest() throws MalformedURLException{

        appiumDriverLocalService = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//ramkumar.c//node_modules//appium//build//lib//main.js"))
                .withIPAddress("127.0.0.1").usingAnyFreePort().build();

      appiumDriverLocalService.start();

        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setDeviceName("Pixel_7_Pro");
        uiAutomator2Options.setApp(App);

         driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),uiAutomator2Options);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }


    @AfterClass
    public void tearDown(){

        driver.quit();
        appiumDriverLocalService.stop();

    }

}

