import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
Thread.sleep(5000);
double wed = selenium.getEval("  " + "new Date(new Date().setDate(new Date().getDate() +7)).toLocaleDateString('en-us', {month: '2-digit', day: '2-digit', year: 'numeric'});").toDouble()
double mon = selenium.getEval(" var wed = \"" + wed + "\";var storedVars = { 'wed': wed }; " + "new Date(new Date().setDate(new Date().getDate() +5)).toLocaleDateString('en-us', {month: '2-digit', day: '2-digit', year: 'numeric'});").toDouble()
selenium.open("https://emerson.sharepoint.com/sites/AutoSolSYSS/SysSManila/Facilities/Lists/FAC120F%20%20Request%20for%20Park%20Slot/NewForm.aspx")
selenium.click("id=combobox-id__20")
selenium.click("xpath=//button[@id='sug-20']/span/div")
selenium.click("id=combobox-id__22")
selenium.type("id=combobox-id__22", ("Lim, Leo").toString())
selenium.click("xpath=//button[@id='sug-0']/span/div/div/div[2]/div/div")
selenium.type("xpath=//div[@id='appRoot']/div/div[3]/div[2]/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div[4]/span/div/div/div/input", ("Parking for RTO").toString())
selenium.type("xpath=//div[@id='appRoot']/div/div[3]/div[2]/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div[5]/span/div/div/div/input", ("Michael Vicente").toString())
selenium.type("xpath=//div[@id='appRoot']/div/div[3]/div[2]/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div[6]/span/div/div/div/input", ("Toyota Raize").toString())
selenium.type("xpath=//div[@id='appRoot']/div/div[3]/div[2]/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div[7]/span/div/div/div/input", "Z4Y169")
selenium.type("id=sp-DateTimePicker-DateTimeTextField", (wed).toString())
selenium.click("id=sp-DateTimePicker-DateTimeTextField")
selenium.click("xpath=//div[@id='appRoot']/div/div[3]/div[2]/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div[8]/div")
selenium.click("xpath=//div[@id='appRoot']/div/div[3]/div[2]/div[2]/div[3]/div[3]/div/div")
selenium.click("xpath=//div[@id='appRoot']/div/div[3]/div[2]/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div[4]/div/button")
selenium.open("https://emerson.sharepoint.com/sites/AutoSolSYSS/SysSManila/Facilities/Lists/FAC120F%20%20Request%20for%20Park%20Slot/NewForm.aspx")
selenium.click("id=combobox-id__20")
selenium.click("xpath=//button[@id='sug-20']/span/div")
selenium.click("id=combobox-id__22")
selenium.type("id=combobox-id__22", ("Lim, Leo").toString())
selenium.click("xpath=//button[@id='sug-0']/span/div/div/div[2]/div/div")
selenium.type("xpath=//div[@id='appRoot']/div/div[3]/div[2]/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div[4]/span/div/div/div/input", ("Parking for RTO").toString())
selenium.type("xpath=//div[@id='appRoot']/div/div[3]/div[2]/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div[5]/span/div/div/div/input", ("Michael Vicente").toString())
selenium.type("xpath=//div[@id='appRoot']/div/div[3]/div[2]/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div[6]/span/div/div/div/input", ("Toyota Raize").toString())
selenium.type("xpath=//div[@id='appRoot']/div/div[3]/div[2]/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div[7]/span/div/div/div/input", "Z4Y169")
selenium.type("id=sp-DateTimePicker-DateTimeTextField", (mon).toString())
selenium.click("id=sp-DateTimePicker-DateTimeTextField")
selenium.click("xpath=//div[@id='appRoot']/div/div[3]/div[2]/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div[2]/div[8]/div")
selenium.click("xpath=//div[@id='appRoot']/div/div[3]/div[2]/div[2]/div[3]/div[3]/div/div")
selenium.click("xpath=//div[@id='appRoot']/div/div[3]/div[2]/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div[4]/div/button")
