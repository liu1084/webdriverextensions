package com.github.webdriverextensions.internal;

import com.github.webdriverextensions.ThreadDriver;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;

public class ExperimentalBot {

    /* Browser */
    public static String browser() {
        return ((HasCapabilities) ThreadDriver.getDriver()).getCapabilities().getBrowserName();
    }

    public static boolean browserIs(String browserName) {
        String currentBrowserName = ((HasCapabilities) ThreadDriver.getDriver()).getCapabilities().getBrowserName();
        return StringUtils.equalsIgnoreCase(currentBrowserName, browserName);
    }

    public static boolean browserIsAndroid() {
        return browserIs(BrowserType.ANDROID);
    }

    public static boolean browserIsChrome() {
        return browserIs(BrowserType.CHROME) || browserIs(BrowserType.GOOGLECHROME);
    }

    public static boolean browserIsFirefox() {
        return browserIs(BrowserType.FIREFOX);
    }

    public static boolean browserIsHtmlUnit() {
        return browserIs(BrowserType.HTMLUNIT);
    }

    public static boolean browserIsIPad() {
        return browserIs(BrowserType.IPAD);
    }

    public static boolean browserIsIPhone() {
        return browserIs(BrowserType.IPHONE);
    }

    public static boolean browserIsInternetExplorer() {
        return browserIs(BrowserType.IE) || browserIs(BrowserType.IEXPLORE);
    }

    public static boolean browserIsOpera() {
        return browserIs(BrowserType.OPERA);
    }

    public static boolean browserIsPhantomJS() {
        return browserIs(BrowserType.PHANTOMJS);
    }

    public static boolean browserIsSafari() {
        return browserIs(BrowserType.SAFARI);
    }

    /* Browser Version */
    public static String browserVersion() {
        return ((HasCapabilities) ThreadDriver.getDriver()).getCapabilities().getVersion();
    }

    public static boolean versionIs(String version) {
        String currentVersion = ((HasCapabilities) ThreadDriver.getDriver()).getCapabilities().getVersion();
        return StringUtils.equalsIgnoreCase(currentVersion, version);
    }

    /* Platform */
    public static Platform platform() {
        return ((HasCapabilities) ThreadDriver.getDriver()).getCapabilities().getPlatform();
    }

    public static boolean platformIs(Platform platform) {
        Platform currentPlatform = ((HasCapabilities) ThreadDriver.getDriver()).getCapabilities().getPlatform();
        return currentPlatform.is(platform);
    }

    public static boolean platformIsWindowsXP() {
        return platformIs(Platform.XP);
    }

    public static boolean platformIsWindowsVista() {
        return platformIs(Platform.VISTA);
    }

    public static boolean platformIsWindows8() {
        return platformIs(Platform.WIN8);
    }

    public static boolean platformIsUnix() {
        return platformIs(Platform.UNIX);
    }

    public static boolean platformIsLinux() {
        return platformIs(Platform.LINUX);
    }

    public static boolean platformIsAndroid() {
        return platformIs(Platform.ANDROID);
    }

    public static boolean platformIsMac() {
        return platformIs(Platform.MAC);
    }

    /* Execute Javascript */
    public static Object executeJavascript(String script, Object... args) {
        return ((JavascriptExecutor) ThreadDriver.getDriver()).executeScript(script, args);
    }

    public static Object executeJavascriptAsynchronously(String script, Object... args) {
        return ((JavascriptExecutor) ThreadDriver.getDriver()).executeAsyncScript(script, args);
    }
}
