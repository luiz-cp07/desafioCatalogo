package br.com.luizFernando.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchMap {
    @FindBy(xpath= "//*[@id='center_column']/h1/span[1]")
    public WebElement txtProduto;
}
