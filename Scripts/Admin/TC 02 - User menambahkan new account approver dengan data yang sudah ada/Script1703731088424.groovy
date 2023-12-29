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

WebUI.navigateToUrl('http://10.202.200.141/login')

WebUI.setText(findTestObject('Object Repository/Admin/Page_Ofin  New Partner/input_Email_email'), 'gemscool99@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Page_Ofin  New Partner/input_Password_password'), 'GYDmRgS5yd5PL6pQTxDpCg==')

WebUI.click(findTestObject('Object Repository/Admin/Page_Ofin  New Partner/button_Log in'))

WebUI.click(findTestObject('Object Repository/Admin/Page_Ofin  User Management/a_Add New'))

WebUI.setText(findTestObject('Object Repository/Admin/Page_Ofin  Create User/input_failed create user_name'), 'Muhammad')

WebUI.setText(findTestObject('Object Repository/Admin/Page_Ofin  Create User/input__email'), 'mbilalrafif@yahoo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Page_Ofin  Create User/input__password'), 'iGDxf8hSRT4=')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Page_Ofin  Create User/input__confirmPassword'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/Admin/Page_Ofin  Create User/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Admin/Page_Ofin  Create User/div_Email mbilalrafifyahoo.com is already registered'))

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Page_Ofin  User Management/h4_User Management'), 'Create User')

WebUI.closeBrowser()

