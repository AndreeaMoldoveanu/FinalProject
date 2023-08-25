package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class SortByNamePage extends BasePage {
    public SortByNamePage (WebDriver driver){super(driver);}

         By SortByNameInputField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/form/div[2]/select");
         public void SortByNameDropdown(){driver.findElement(SortByNameInputField).click();}
        By SortByName = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/form/div[2]/select/option[1]");
        public void SelectByNameAZ(){driver.findElement(SortByName).click();}
        By SortByName2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/form/div[2]/select/option[2]");
        public void SelectByNameZA(){driver.findElement(SortByName2).click();}
        By SortByPrice = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/form/div[2]/select/option[3]");
        public void SortByPriceLow(){driver.findElement(SortByPrice).click();}

        By SortByPrice2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/form/div[2]/select/option[4]");
        public void SortByPriceHigh(){driver.findElement(SortByPrice2).click();}

        By SelectCheapestProduct = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/button[1]");
        public void AddCheapestProductToCart(){driver.findElement(SelectCheapestProduct).click();}
        By cartNavBar = By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/a[1]");
        public void clickOnCartBtnNavBar(){driver.findElement(cartNavBar).click();}
        By MultiplyProductsToCart = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[1]/div/button[2]");
        public void MultiplyProductsToCart(){driver.findElement(MultiplyProductsToCart).click();};

    }

