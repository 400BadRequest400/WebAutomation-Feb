package regression;

import base.CommonAPI;
import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Login extends CommonAPI {
    @Test
    public static void signin (String id, String pass) {
        typeByXpath("//*[@id=\"email\"]", id);
        typeByXpath("//*[@id=\"pass\"]", pass);
        clickByXpath("//*[@id=\"u_0_2\"]");
    }
    public void register() {
        typeByXpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']","rabah");
        typeByXpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='lastname']","11111111");
        typeByXpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_email__']","rabah@gmail.com");
        sleepFor(2);
        typeByXpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_passwd__']","testabcd1234");
        clickByXpath("//select[@name='birthday_month']");
        clickByXpath("//*[@id='month']/option[10]");

        clickByXpath("//select[@name='birthday_day']");
        clickByXpath("//*[@id='day']/option[17]");

        clickByXpath("//select[@name='birthday_year']");
        clickByXpath("//*[@id='year']/option[40]");
        clickByXpath("//*[@id='u_0_a']");
        clickByXpath("//*[@id=\"u_0_15\"]");
    }
}
