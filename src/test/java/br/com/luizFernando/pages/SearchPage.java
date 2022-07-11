package br.com.luizFernando.pages;

import br.com.luizFernando.maps.SearchMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    private WebDriver driver;
    private SearchMap searchMap;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        searchMap = new SearchMap();
        PageFactory.initElements(driver, searchMap);
    }

    public String validarProduto() {
        return searchMap.txtProduto.getText();
    }
}
