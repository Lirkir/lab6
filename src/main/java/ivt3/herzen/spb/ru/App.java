package ivt3.herzen.spb.ru;

        import com.thoughtworks.selenium.*;
        import java.util.regex.Pattern;

public class App extends SeleneseTestCase {
    public void setUp() throws Exception {
        setUp("http://www.herzen.spb.ru/", "*chrome");
    }
    public void testTest3() throws Exception {
        selenium.open("/");
        selenium.click("link=Сведения об образовательной организации");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=Начата процедура выдвижения кандидатов на должность ректора университета.");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=Выписка из протокола заседания ученого совета университета от 24.12.2015 г. «О принятии Положения о порядке выборов ректора РГПУ им. А.И. Герцена».");
        selenium.waitForPageToLoad("30000");
    }
}
