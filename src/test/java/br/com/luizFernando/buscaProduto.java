package br.com.luizFernando;

import br.com.luizFernando.pages.PrincipalPage;
import br.com.luizFernando.pages.SearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;


public class buscaProduto {
    WebDriver driver;
    PrincipalPage principalPage;
    SearchPage searchPage;

    @Before
    public void inicializaTeste() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        principalPage = new PrincipalPage(driver);
        searchPage = new SearchPage(driver);
    }

    @Test
    public void CT001() throws InterruptedException {
        //Inserir produto
        principalPage.informarProduto();

        //Clicar em pesquisar
        principalPage.pesquisarProduto();
        Thread.sleep(3000);

        //Validar pequisa pelo produto
        String produto = searchPage.validarProduto();
        assertEquals("\"BLOUSE\"", produto);
    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }
}