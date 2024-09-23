package com.DDF;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JxlExample {
    /*
    For interacting with web browser we have used selenium jar right like that for interacting with
    Excel there are 2 popular jars 1. Apache POI 2. Jxl.   Now we are going to see jxl
    Steps with jxl jars
       Content         Meaning
    1. File Location - In which location we have saved that excel sheet
    2. Get Workbook  - Normally, If we create any of the excel by using File---New it will ask
    like blank workbook so everything will save like workbook.
    3. Get Sheet     - Inside the workbook we have multiple sheets like sheet1, sheet2, sheet3 we
    can directly mention with the sheet name or we can mention by using Index 0, 1, 2
    4. Get Rows      - Inside the sheet we have rows.
    5. Get Columns     - Inside the sheet we have columns.
    6. Iterate and get cell values..
    In Jxl we have to save that excel in 97 - 2003 format then only we are able to use that jxl jar..
     */
    /*
    Steps :
    1. Copy pasted the same code from previous class(Login)
    2. Now we dont have any data so I have changed it to null.
    3. create one method for excel datas.
    4. Return the datas into new 2 dimensional data so add a line return tetsdata.
    5. So add that data type as String[][] instead of void in that method.
    6. Now add a line data = exceldata becoz,
       * 1st it will go @test annotation used method, from there we have used dataProviders
       so it will come for data provider method inside that we have called exceldata method
       it will move to that method and do all the executions. after that it will return that
       data to the data provider method for variable(data). then those datas will be passed for
       Uname and Pword variables and it will start to exceute..
     */
    String[][] data = null;

    @DataProvider(name = "loginDatas")
    /*
    Suppose if we see any of the tutorials it is mentioned like object[][] instead of String[][]
    becoz actually we don't know right which data will come may be it has some complex datas
    like numerics, scientific expression, so object[][] it is the great parent it will accept all the
    data types.
     */
    public String[][] loginUsingDataProvider() throws BiffException, IOException {
        //String[][] data;
        data = excelData();
        return data;
        //return excelData();
        //By using this am going to return the datas in the actual tetscase.
        // Now I am going write the data above
    }

    // Writing method for reading excel data which I have created in downloads folder
    /*
    Datas In excel C = Column  R = Rows            Datas in two dimensional array
    (0C, 0R)Username       (1C, 0R)password        (0R, 0C)Admin1      (0R, 1C)Admin12
    (0C, 1R)Admin1         (1C, 1R)Admin12         (1R, 0C)Admin       (1R, 1C)Admin11
    (0C, 2R)Admin          (1C, 2R)Admin11         (2R, 0C)Admin13     (2R, 1C)Admin134
    (0C, 3R)Admin13        (1C, 3R)Admin134        (3R, 0C)Admi        (3R, 1C)Admin
    (0C, 4R)Admi           (1C, 4R)Admin
     */
    public String[][] excelData() throws IOException, BiffException {//"C:\Users\UC506533\Downloads\testdata.xlt"
        FileInputStream input = new FileInputStream("\"C:\\Users\\UC506533\\Downloads\\testdata.xlt\"");
        Workbook workbook = Workbook.getWorkbook(input);
        Sheet sheet = workbook.getSheet(0); //we can either give sheet1 or index of the sheet
        int rowCount = sheet.getRows();
        int columnCount = sheet.getColumns();
        String[][] testData = new String[rowCount-1][columnCount]; /* If we kept it as empty array it will throw error
                                                                   either we have to mention the size or the data.*/
        for(int i=1; i<rowCount; i++) { //int i=1; becoz we have not consider the 0th row which is username password in the testdata excel
            for(int j=0; j<columnCount; j++) { // refer excel data above now I am getting the positions
                     testData[i-1][j] = sheet.getCell(j, i).getContents();
                     /*
                     The above line refers we are taking the contents from the created testdata excel
                     and storing in the two dimensional test data array.
                      */
            }
        }

        return testData; // now we are returning the test data then only the data will go into the test and execute

    }
    @Test(dataProvider = "loginDatas")
    // We need to give the same name which we have given in the above data provider method
    // It will run like loops like how many set of data we have given it will that much times.
    // We have given 4 set of datas it will run for 4 times...
    public void login(String Uname, String Pword) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(7000);
        WebElement userName = driver.findElement(By.xpath("//input[@name = \"username\"]"));
        userName.sendKeys(Uname);
        WebElement password = driver.findElement(By.xpath("//input[@name = \"password\"]"));
        password.sendKeys(Pword);
        WebElement loginButton = driver.findElement(By.xpath("//button[@type = \"submit\"]"));
        loginButton.click();
        driver.quit();
    }
}
