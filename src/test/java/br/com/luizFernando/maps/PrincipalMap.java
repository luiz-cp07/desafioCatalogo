package br.com.luizFernando.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class PrincipalMap {
        @FindBy(xpath = "//*[@id='search_query_top']")
        public WebElement inputSearch;

        @FindBy(name = "submit_search")
        public WebElement btnBuscar;

    }
