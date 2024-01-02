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

WebUI.setText(findTestObject('Approver/Cash Out/Reject/input_Email_email'), 'ahmd2@gmail.com')

WebUI.setEncryptedText(findTestObject('Approver/Cash Out/Reject/input_Password_password'), 'GYDmRgS5yd5PL6pQTxDpCg==')

WebUI.click(findTestObject('Object Repository/Approver/Cash Out/Reject/button_Log in'))

WebUI.click(findTestObject('Object Repository/Approver/Cash Out/Reject/i_Cash In_mdi mdi-account-cash'))

WebUI.click(findTestObject('Approver/Cash Out/Reject/button_Reject'))

WebUI.verifyElementVisible(findTestObject('Approver/Reject/div_Reject Transaction'))

WebUI.verifyElementVisible(findTestObject('Approver/Reject/div_Description'))

WebUI.verifyElementVisible(findTestObject('Approver/Reject/div_Reject'))

WebUI.click(findTestObject('Approver/Cash Out/Reject/button_Reject_1'))

WebUI.verifyElementVisible(findTestObject('Approver/Reject/div_Description is required'))

WebUI.closeBrowser()

