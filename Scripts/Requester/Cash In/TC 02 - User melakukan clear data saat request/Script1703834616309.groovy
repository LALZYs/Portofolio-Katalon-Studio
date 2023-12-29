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

WebUI.setText(findTestObject('Object Repository/Admin/Requester/Cash In/TC 02/input_Email_email'), 'ahmd1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Requester/Cash In/TC 02/input_Password_password'), 'GYDmRgS5yd5PL6pQTxDpCg==')

WebUI.click(findTestObject('Object Repository/Admin/Requester/Cash In/TC 02/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Admin/Requester/Cash In/TC 02/input_Issuer ID_issuerId'), '03')

WebUI.setText(findTestObject('Object Repository/Admin/Requester/Cash In/TC 02/input_No Rekening Tujuan_noRekeningTujuan'), 
    '6631007790')

WebUI.setText(findTestObject('Object Repository/Admin/Requester/Cash In/TC 02/input_Amount_amount'), '88.00')

WebUI.setText(findTestObject('Object Repository/Admin/Requester/Cash In/TC 02/textarea_Keterangan_keterangan'), 'TESTING 4')

WebUI.click(findTestObject('Object Repository/Admin/Requester/Cash In/TC 02/button_Clear'))

WebUI.verifyElementVisible(findTestObject('Admin/Requester/Cash In/label_Form Cash In'))

WebUI.closeBrowser()

