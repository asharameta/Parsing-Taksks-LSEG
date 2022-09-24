package org.example;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        String link = "https://www.ote-cr.cz/en/statistics/electricity-imbalances";
//        //First
//        try{
//        Document doc = Jsoup.connect(link).get();
//        var table = doc.select("table");
//            BufferedWriter bw = new BufferedWriter(new FileWriter("first.html"));
//            bw.write(table.toString());
//            bw.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        ///-----------------------------------------------------------------------------------


    //Second
//        try{
//            Document doc = Jsoup.connect(link).get();
//            var value = doc.getElementsByClass("report_attachment_links").first().child(0).attr("href");
//            System.out.println(link+value);
//            URL url = new URL(link+value);
//            BufferedInputStream bis = new BufferedInputStream(url.openStream());
//            FileOutputStream fis = new FileOutputStream("second.xls");
//            byte[] buffer = new byte[1024];
//            int count = 0;
//            while((count = bis.read(buffer,0,1024))!=-1){
//                fis.write(buffer,0,count);
//            }
//            fis.close();
//            bis.close();
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//
//        try {
//          FileInputStream fis = new FileInputStream(new File("second.xls"));
//
//            Workbook workbook = WorkbookFactory.create(fis);
//            Sheet sheet = workbook.getSheetAt(0);
//
//
//            String title = sheet.getRow(5).getCell(1).toString().substring(0,sheet.getRow(5).getCell(1).toString().indexOf('(')-2);
//            String data = sheet.getRow(2).getCell(0).toString().substring(sheet.getRow(2).getCell(0).toString().indexOf("-")+2,sheet.getRow(2).getCell(0).toString().length());
//
//
//            for(int i = 6;i<30;i++){
//                Row tmpRow = sheet.getRow(i);
//                int time = (int)Math.round(Double.valueOf((tmpRow.getCell(0).toString())));
//                System.out.println(title+";"+data+" "+(time-1+":00")+"; "+tmpRow.getCell(1));
//            }
//
//            fis.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }


        ///-----------------------------------------------------------------------------------


        //Third
//        System.setProperty("webdriver.gecko.driver","selenium\\geckodriver.exe");
//        WebDriver webDriver = new FirefoxDriver();
//        webDriver.get("https://www.okg.se/en");
//        JavascriptExecutor js = (JavascriptExecutor) webDriver;
//
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight/2.5)");
//
//        TimeUnit.SECONDS.sleep(4);
//
//        Document doc = Jsoup.parse(webDriver.getPageSource());
//        String number = doc.select("text").text();
//
//        webDriver.quit();
//
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println("value:"+number+", time:"+dtf.format(now));


        //-----------------------------------------------------------------------


//        //Fourth
//        try{
//            URL url = new URL("https://www.nhc.noaa.gov/data/hurdat/hurdat2-nepac-1949-2016-041317.txt");
//            BufferedInputStream bis = new BufferedInputStream(url.openStream());
//            FileOutputStream fis = new FileOutputStream("fourth.txt");
//            byte[] buffer = new byte[1024];
//            int count = 0;
//            while((count = bis.read(buffer,0,1024))!=-1){
//                fis.write(buffer,0,count);
//            }
//            fis.close();
//            bis.close();
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//
//        File file = new File("fourth.txt");
//        Scanner scan = new Scanner(file);
//
//
//        while(scan.hasNextLine()){
//            String year = scan.nextLine();
//            if(Character.isLetter(year.charAt(0)) && Integer.parseInt(year.substring(4,8))>=2015){
//                if(year.charAt(27)=='A') {
//                    String title = year.substring(18, 28).replaceAll(" ", "");
//                    year = scan.nextLine();
//                    while (!Character.isLetter(year.charAt(0))) {
//                        String maxSustainedWindSpeed = year.substring(38, 41);
//                        year = scan.nextLine();
//                        System.out.println(title + " " + maxSustainedWindSpeed);
//                    }
//                }
//            }
//        }

    }
}