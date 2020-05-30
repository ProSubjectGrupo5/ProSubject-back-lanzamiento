package Selenium;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProsubjectBackendApirestApplicationSelenTests {
	
	  //SELENIUM
	  @Test
	  public void testLoginProfesor() {
//		System.setProperty("webdriver.chrome.driver", "D:\\UNIVERSIDAD 2019-2020\\España\\4Curso\\ISPP\\sprint 1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		
		driver.get("https://prosubject-v3.herokuapp.com/inicio");
	   // driver.manage().window().setSize(new Dimension(1552, 840));
	    //driver.findElement(By.cssSelector(".dropdown-toggle")).click();
	    driver.findElement(By.linkText("Iniciar sesión")).click();
	    driver.findElement(By.name("username")).sendKeys("alejandrocano");
	    driver.findElement(By.name("password")).sendKeys("alejandrocano");
	    driver.findElement(By.cssSelector(".ng-dirty:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".btn")).click();
	    
	    driver.quit();
		
	  }
	  
	  @Test
	  public void testLoginAlum() {
//		System.setProperty("webdriver.chrome.driver", "D:\\UNIVERSIDAD 2019-2020\\España\\4Curso\\ISPP\\sprint 1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		    
		driver.get("https://prosubject-v3.herokuapp.com/inicio");
	   // driver.manage().window().setSize(new Dimension(1146, 663));
	    //driver.findElement(By.cssSelector(".dropdown-toggle")).click();
	    driver.findElement(By.linkText("Iniciar sesión")).click();
	    driver.findElement(By.name("username")).sendKeys("anaromcac");
	    driver.findElement(By.name("password")).sendKeys("anaromcac");
	    driver.findElement(By.cssSelector(".btn")).click();
	    
	    driver.quit();
	  }
	  
	  
//	  @Test
//	  public void testRegistroAlumRepetido() {
//		System.setProperty("webdriver.chrome.driver", "D:\\UNIVERSIDAD 2019-2020\\España\\4Curso\\ISPP\\sprint 1\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		  
//		driver.get("https://prosubject-v3.herokuapp.com/inicio");
//	    driver.manage().window().setSize(new Dimension(1146, 662));
//	    driver.findElement(By.cssSelector(".far")).click();
//	    driver.findElement(By.linkText("Registro")).click();
//	    driver.findElement(By.name("nombre")).click();
//	    driver.findElement(By.name("nombre")).sendKeys("Jesus");
//	    driver.findElement(By.name("apellido1")).sendKeys("Elias");
//	    driver.findElement(By.name("apellido2")).sendKeys("Rodriguez");
//	    driver.findElement(By.name("dni")).sendKeys("17842170N");
//	    driver.findElement(By.name("telefono")).click();
//	    driver.findElement(By.cssSelector("app-registro > .row")).click();
//	    driver.findElement(By.name("username")).sendKeys("jesu");
//	    driver.findElement(By.name("email")).click();
//	    driver.findElement(By.name("email")).sendKeys("jesuselias@gmail.com");
//	    driver.findElement(By.name("username")).click();
//	    driver.findElement(By.name("username")).sendKeys("jesuelia98");
//	    driver.findElement(By.cssSelector(".ng-invalid:nth-child(4) > .row:nth-child(1)")).click();
//	    driver.findElement(By.name("password")).sendKeys("jesuelia");
//	    driver.findElement(By.name("confirmPassword")).click();
//	    driver.findElement(By.name("confirmPassword")).sendKeys("jesuelia");
//	    driver.findElement(By.cssSelector("label:nth-child(6)")).click();
//	    driver.findElement(By.cssSelector(".btn")).click();
	    
//	  }
	  
//	  MisClasesAlum
//	  @Test
//	  public void testAlumMisClases() {
//		System.setProperty("webdriver.chrome.driver", "D:\\UNIVERSIDAD 2019-2020\\España\\4Curso\\ISPP\\sprint 1\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		
//		driver.get("https://prosubject-v3.herokuapp.com/inicio");
//	    driver.manage().window().setSize(new Dimension(1154, 674));
//	    driver.findElement(By.cssSelector(".dropdown-toggle")).click();
//	    driver.findElement(By.linkText("Login")).click();
//	    driver.findElement(By.name("username")).click();
//	    driver.findElement(By.name("username")).sendKeys("anaromcac");
//	    driver.findElement(By.cssSelector(".card-body")).click();
//	    driver.findElement(By.name("password")).click();
//	    driver.findElement(By.name("password")).sendKeys("anaromcac");
//	    driver.findElement(By.cssSelector(".btn")).click();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    driver.findElement(By.linkText("Mis clases")).click();
//			
//	  }
	  
	  //BusqAsigAlum
//	  @Test
//	  public void testAlumBusquedaAsig() {
//		System.setProperty("webdriver.chrome.driver", "D:\\UNIVERSIDAD 2019-2020\\España\\4Curso\\ISPP\\sprint 1\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		
//		driver.get("https://prosubject-v3.herokuapp.com/inicio");
//	    driver.manage().window().setSize(new Dimension(1154, 674));
//	    driver.findElement(By.cssSelector(".far")).click();
//	    driver.findElement(By.linkText("Login")).click();
//	    driver.findElement(By.cssSelector(".form-group:nth-child(1)")).click();
//	    driver.findElement(By.name("username")).click();
//	    driver.findElement(By.name("username")).sendKeys("anaromcac");
//	    driver.findElement(By.cssSelector(".card-body")).click();
//	    driver.findElement(By.name("password")).click();
//	    driver.findElement(By.name("password")).sendKeys("anaromcac");
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    driver.findElement(By.cssSelector(".btn")).click();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    driver.findElement(By.linkText("Busqueda de espacios")).click();
//	    {
//	      WebElement element = driver.findElement(By.linkText("Busqueda de espacios"));
//	      Actions builder = new Actions(driver);
//	      builder.moveToElement(element).perform();
//	    }
//	    {
//	      WebElement element = driver.findElement(By.tagName("body"));
//	      Actions builder = new Actions(driver);
//	      builder.moveToElement(element, 0, 0).perform();
//	    }
		
//		driver.get("https://prosubject-v3.herokuapp.com/inicio");
//		driver.manage().window().setSize(new Dimension(1146, 663));
//		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
//		driver.findElement(By.linkText("Login")).click();
//		driver.findElement(By.name("username")).sendKeys("anaromcac");
//		driver.findElement(By.name("password")).sendKeys("anaromcac");
//		driver.findElement(By.cssSelector(".btn")).click();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.findElement(By.linkText("Busqueda de espacios")).click();
//		driver.findElement(By.xpath("/html/body/app-root/app-pages/div/app-header/nav/div/div/ul/li[2]/a")).click();
		
	    
//	    driver.findElement(By.xpath("/html/body/app-root/app-pages/div/div/app-busqueda-asignatura/div/div[1]/div/form/div[2]/div[2]/input")).sendKeys("PRIMERO");
		
//		driver.get("https://prosubject-v3.herokuapp.com/inicio");
//	    driver.findElement(By.cssSelector(".dropdown-toggle")).click();
//	    driver.findElement(By.linkText("Login")).click();
//	    driver.findElement(By.name("username")).click();
//	    driver.findElement(By.name("username")).sendKeys("anaromcac");
//	    driver.findElement(By.cssSelector(".card-body")).click();
//	    driver.findElement(By.name("password")).click();
//	    driver.findElement(By.name("password")).sendKeys("anaromcac");
//	    driver.findElement(By.cssSelector(".btn")).click();
//	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	    driver.findElement(By.linkText("Busqueda de espacios")).click();
//	    driver.findElement(By.xpath("/html/body/app-root/app-pages/div/div/app-busqueda-asignatura/div/div[1]/div/form/div[2]/div[2]/input")).click();
//	    driver.findElement(By.xpath("/html/body/app-root/app-pages/div/div/app-busqueda-asignatura/div/div[1]/div/form/div[2]/div[2]/input")).sendKeys("PRIMERO");
//	    driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
//	    driver.findElement(By.cssSelector(".col-md-4:nth-child(3) > .form-control")).sendKeys("Fundamentos de programación");
//	    driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
		
//	  }

}
