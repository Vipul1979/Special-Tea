import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBeforeAftersample {

    @BeforeClass
            public static void beforeclass()throws Exception {
        System.out.println("Execute Before Class...");
    }
    @AfterClass
            public static void afterclass()throws Exception {
        System.out.println("Execute After Class...");
    }
        @Before
            public void setup()throws Exception{
            System.out.println("Execute Before every test case...");

            }
            @Test
        public void test1(){
            System.out.println("Execute test1...");

            }
            @Test
            public void test2(){
            System.out.println("Execute test2...");
            }
        @After
        public void after()throws Exception{
        System.out.println("Execute after every test...");

    }
}
/* Ans:
Execute Before Class...
Execute Before every test case...
Execute test1...
Execute after every test...
Execute Before every test case...
Execute test2...
Execute after every test...
Execute After Class...
*/