package br.com.luizFernando.pages;

import br.com.luizFernando.maps.PrincipalMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    public WebDriver driver;
    private PrincipalMap principalMap;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
        principalMap = new PrincipalMap();
        PageFactory.initElements(driver, principalMap);
    }

    public void informarProduto() {
        principalMap.inputSearch.sendKeys("Blouse");
    }

    public void pesquisarProduto() {
        principalMap.btnBuscar.click();
    }









}
