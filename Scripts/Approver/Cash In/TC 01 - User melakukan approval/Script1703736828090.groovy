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

WebUI.setText(findTestObject('Object Repository/Approver/input_Email_email'), 'mbilalrafif@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Approver/input_Password_password'), '2VQR8GtCg31QG1LHCZmJmg==')

WebUI.click(findTestObject('Object Repository/Approver/button_Log in'))

WebUI.click(findTestObject('Approver/Approve/button_Approve'))

WebUI.verifyElementVisible(findTestObject('Approver/Approve/div_Approve Transaction'))

WebUI.verifyElementVisible(findTestObject('Approver/Approve/div_Description'))

WebUI.verifyElementVisible(findTestObject('Approver/input_Description_descriptionApprove'))

WebUI.setText(findTestObject('Object Repository/Approver/input_Description_descriptionApprove'), 'oke')

WebUI.verifyElementVisible(findTestObject('Approver/Approve/div_Approve'))

WebUI.click(findTestObject('Object Repository/Approver/button_Approve_1'))

WebUI.closeBrowser()

