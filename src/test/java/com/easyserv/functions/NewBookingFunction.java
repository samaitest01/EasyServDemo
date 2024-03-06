package com.easyserv.functions;

import com.easyserv.pageobject.NewBooking;
import org.apache.commons.lang.text.CompositeFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NewBookingFunction extends NewBooking {

    // Get tomorrow's date
    LocalDate tomorrow = LocalDate.now().plusDays(1);

    // Format tomorrow's date
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String tomorrowFormatted = tomorrow.format(formatter);

    public NewBookingFunction(WebDriver rdriver) {
        super(rdriver);

    }
    public void NewBooking() throws InterruptedException {
        NewBooking.click();
        CustomerSearchTest.click();
        CustomerSearchTest.sendKeys("Trung");
        CustomerName.click();
        NextButton.click();
        BookingDetailsService.click();
        AddItem.click();
        AddItemService.click();
        AddNotes.sendKeys("Test comments");
        Thread.sleep(3000);
        SelectDate.click();
        Thread.sleep(3000);
        SelectDate.sendKeys(tomorrowFormatted);
        SelectDate.click();
        Thread.sleep(3000);
        SelectTime.click();
        SelectTime.sendKeys(Keys.ENTER);




    }
}
