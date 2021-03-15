package base_class;


	
	
	

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Base_Class {

		public static WebDriver driver;

		//******browser launch***********

		public static WebDriver getBrowser(String browser) {

			try {
				if (browser.equalsIgnoreCase("chrome")) {

					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
					driver = new ChromeDriver();

				}
				else if (browser.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();


				}
				else if (browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
					driver = new FirefoxDriver();


				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			return driver;
		}

		//*************geturl************

		public static void getUrl(String url) {

			try {
				driver.get(url);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//*********curentUrl*******

		public static void curent_Url() {
			System.out.println(driver.getCurrentUrl());
		}

		//*********send keys********

		public static void inputValueElement(WebElement element,String value) {
			element.sendKeys(value);
		}

		//*************click*************

		public static void clickOnElement(WebElement element) {
			element.click();
		}

		//**********close**********

		public static void close() {
			driver.close();
		}

		//**********quit**********

		public static void quit() {
			driver.quit();
		}

		//********navigate to********

		public static void to(String url) {

			driver. navigate().to(url);

		}

		//**********navigate*************

		public static void navigate (String comand) {
			try {
				if (comand.equalsIgnoreCase("forward")) {
					driver.navigate().forward();
				}
				else if (comand.equalsIgnoreCase("backward")) {
					driver.navigate().back();
				}
				else if (comand.equalsIgnoreCase("refresh")) {
					driver.navigate().refresh();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}}

		//************webelement methods*************

		public static void is_Methods(String comand ,WebElement element) {
			if (comand.equalsIgnoreCase("displayed")) {
				System.out.println(element.isDisplayed());

			}
			else if (comand.equalsIgnoreCase("enabled")) {
				System.out.println(element.isEnabled());
			}
			else if (comand.equalsIgnoreCase("selected")) {
				System.out.println(element.isSelected());
			}

		}

		//*************ALERT***************

		public static void alert(String comand) {


			try {
				if (comand.equalsIgnoreCase("ok")) {

					driver.switchTo().alert().accept();
					driver.switchTo().defaultContent();
				}
				else if (comand.equalsIgnoreCase("close")) {

					driver.switchTo().alert().dismiss();
					driver.switchTo().defaultContent();

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		//************prompt***********

		public static void prompt(String comand,String text) {
			try {
				if (comand.equalsIgnoreCase("ok")) {
					driver.switchTo().alert().sendKeys(text);
					driver.switchTo().alert().accept();
					driver.switchTo().defaultContent();

				}
				else if (comand.equalsIgnoreCase("cancel")) {
					driver.switchTo().alert().sendKeys("text");
					driver.switchTo().alert().dismiss();
					driver.switchTo().defaultContent();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//**********ACTIONS*************

		public static void action(WebElement element ,String comand) {
			Actions a = new Actions(driver);

			try {
				if (comand.equalsIgnoreCase("move")) {
					a.moveToElement(element).build().perform();

				}
				else if (comand.equalsIgnoreCase("click")) {
					a.moveToElement(element).click().build().perform();

				}
				else if (comand.equalsIgnoreCase("doubleClick")) {
					a.contextClick(element).build().perform();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//*************ROBOT***************

		public static void robot(String comand) throws AWTException {
			Robot r = new Robot();
			try {
				if (comand.equalsIgnoreCase("down")) {
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
				}
				else if (comand.equalsIgnoreCase("up")) {
					r.keyPress(KeyEvent.VK_UP);
					r.keyRelease(KeyEvent.VK_UP);

				}
				else if (comand.equalsIgnoreCase("right")) {
					r.keyPress(KeyEvent.VK_RIGHT);
					r.keyRelease(KeyEvent.VK_RIGHT);

				}
				else if (comand.equalsIgnoreCase("left")) {
					r.keyPress(KeyEvent.VK_LEFT);
					r.keyRelease(KeyEvent.VK_LEFT);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//*********window handle***********

		public static void curentWindow() {

			String handle = driver.getWindowHandle();
			System.out.println(handle);
		}

		//*********window handles*******

		public static void windowHandles(String value) {
			Set<String> handles = driver.getWindowHandles();
			for (String all_Id : handles) {
				String titles = driver.switchTo().window(all_Id).getTitle();
				System.out.println(titles);
			}

			for (String id : handles) {
				if (driver.switchTo().window(id).getTitle().equalsIgnoreCase(value)) {
					break;

				}

			}

		}

		//***********frame***********

		public static void frame(String type ,String id,String value,WebElement element) {

			try {
				if (type.equalsIgnoreCase("index")) {

					int index = Integer.parseInt(value);
					driver.switchTo().frame(index);
				}
				else if (type.equalsIgnoreCase("name")) {


					driver.switchTo().frame(id);
				}
				else if (type.equalsIgnoreCase("element")) {
					driver.switchTo().frame(element);

				}

			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}

		//***********parent frame*********

		public static void parent_Frame(String comand) {
			try {
				if (comand.equalsIgnoreCase("parent")) {
					driver.switchTo().parentFrame();
				}
				else if (comand.equals("default")) {
					driver.switchTo().defaultContent();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//**********take screenshot**********

		public static void screenshot(String path) throws Exception {

			TakesScreenshot ts =(TakesScreenshot)driver;

			File src = ts.getScreenshotAs(OutputType.FILE);

			File destination = new File(path);

			FileUtils.copyFile(src, destination);


		}

		//*************dropdown*************

		public static void drop_Down(WebElement element,String type,String value,String index) {

			Select s = new Select(element);

			try {
				if (type.equalsIgnoreCase("index")) {
					s.selectByIndex(Integer.parseInt(index));
				}
				else if (type.equalsIgnoreCase("value")) {
					s.selectByValue(value);
				}
				else if (type.equalsIgnoreCase("text")) {
					s.selectByVisibleText(value);	
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

		}

		//***********multidropdown**************

		public static void multi_Dropdown(WebElement element,String comand) {
			Select s =new Select(element);
			System.out.println(s.isMultiple());
			try {
				if (comand.equalsIgnoreCase("options") && s.isMultiple()) {


					List<WebElement> options = s.getOptions();
					for (WebElement all_Options : options) {
						System.out.println(all_Options.getText());
					}
				}
				else if (comand.equalsIgnoreCase("allselected") && s.isMultiple()) {

					List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
					for (WebElement all_selected : allSelectedOptions) {
						System.out.println(all_selected.getText());

					}}
				else if (comand.equalsIgnoreCase("firstselect")) {

					WebElement firstSelectedOption = s.getFirstSelectedOption();
					System.out.println(firstSelectedOption);

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		//*************wait*************

		public static void waits(String comand,int seconds,TimeUnit unit,WebElement element) {

			try {
				if (comand.equalsIgnoreCase("pagetime")) {

					driver.manage().timeouts().pageLoadTimeout(seconds, unit);
				}
				else if (comand.equalsIgnoreCase("implicit")) {

					driver.manage().timeouts().implicitlyWait(seconds, unit);
				}
				else if (comand.equalsIgnoreCase("explicit")) {
					WebDriverWait wt = new WebDriverWait(driver, seconds);
					wt.until(ExpectedConditions.elementToBeClickable(element));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		//********scroll***********

		public static void scroll(WebElement element) {

			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", element);

		}



	}

























































