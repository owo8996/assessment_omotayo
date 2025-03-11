import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.verifyElementVisible(findTestObject('Object Repository/unsuccessful login/Page_Swag Labs/div_Swag Labs_login_wrapper-inner'))

WebUI.setText(findTestObject('Object Repository/unsuccessful login/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/unsuccessful login/Page_Swag Labs/input_Swag Labs_password'), 'de1j8W0J2iCqa7h9rBBo3z4wQ5Ts1yjK')

WebUI.click(findTestObject('Object Repository/unsuccessful login/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.verifyElementText(findTestObject('Object Repository/unsuccessful login/Page_Swag Labs/div_Epic sadface Username and password do n_e703ed'), 
    'Epic sadface: Username and password do not match any user in this service')

WebUI.verifyElementVisible(findTestObject('Object Repository/unsuccessful login/Page_Swag Labs/div_Epic sadface Username and password do n_e703ed'))

WebUI.closeBrowser()

