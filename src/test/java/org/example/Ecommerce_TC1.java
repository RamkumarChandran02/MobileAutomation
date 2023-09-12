package org.example;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Ecommerce_TC1 extends AppiumBuilder{

    @Test
    public void FillForm(){

        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ramkumar");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))"));
        driver.findElement(By.xpath("//android.widget.RadioButton[@text='Argentina']")).click();

    }

}
