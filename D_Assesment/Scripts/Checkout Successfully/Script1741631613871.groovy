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

WebUI.callTestCase(findTestCase('Add Product to Cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/button_Checkout'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_Checkout Your Information_checkout_info'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_Checkout Your Information_firstName'), 'John')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_Checkout Your Information_lastName'), 'Doe')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_Checkout Your Information_postalCode'), '100234')

WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_Cancel_continue'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_Cancel_continue'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_QTYDescription1Sauce Labs Backpackcarry_5c1396'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_Total 60.45'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/button_Finish'))

WebUI.verifyElementText(findTestObject('Object Repository/Checkout/Page_Swag Labs/h2_Thank you for your order'), 'Thank you for your order!')

WebUI.verifyElementText(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_Your order has been dispatched, and wil_39390f'), 
    'Your order has been dispatched, and will arrive just as fast as the pony can get there!')

WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Page_Swag Labs/button_Back Home'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/button_Back Home'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/a_Logout'))

WebUI.closeBrowser()

