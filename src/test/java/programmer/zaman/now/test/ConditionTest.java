package programmer.zaman.now.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

public class ConditionTest {

    @Test
    void testSystemProperties() {
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testRunOnlyOnWindows() {

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisabledRunOnWindows() {

    }

    @Test
    @EnabledOnJre({JRE.JAVA_8})
    void testEnabledOnJava8() {

    }

    @Test
    @DisabledOnJre({JRE.JAVA_8})
    void testDisabledOnJava8() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void testEnabledOnJava11To17() {

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void testDisabledOnJava11To17() {

    }

    @Test
    @EnabledIfSystemProperties(
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Eclipse Adoptium")
    )
    void testEnabledOnJavaVendorEclipse() {

    }

    @Test
    @DisabledIfSystemProperties(
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Eclipse Adoptium")
    )
    void testDisabledOnJavaVendorEclipse() {

    }

    @Test
    @EnabledIfEnvironmentVariables(
            @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    )
    void testEnabledOnProfileDev() {

    }

    @Test
    @DisabledIfEnvironmentVariables(
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    )
    void testDisabledOnProfileDev() {

    }
}
