package com.easyserv.functions;

import com.easyserv.pageobject.NewBooking;
import org.apache.commons.lang.text.CompositeFormat;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NewBookingFunction extends NewBooking {

    // Get tomorrow's date
    LocalDate tomorrowDate = LocalDate.now().plusDays(1);

    // Format the date as needed, for example, to yyyy-MM-dd format
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String formattedTomorrowDate = tomorrowDate.format(formatter);
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
        SelectDate.sendKeys(formattedTomorrowDate);
        Thread.sleep(3000);
        SelectTime.click();
        SelectTime.sendKeys(Keys.ENTER);




    }
}
