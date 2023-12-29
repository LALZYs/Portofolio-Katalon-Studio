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

WebUI.setText(findTestObject('Object Repository/Admin/Requester/Cash Out/input_Email_email'), 'ahmd1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Requester/Cash Out/input_Password_password'), 'GYDmRgS5yd5PL6pQTxDpCg==')

WebUI.click(findTestObject('Object Repository/Admin/Requester/Cash Out/button_Log in'))

WebUI.click(findTestObject('Object Repository/Admin/Requester/Cash Out/i_Cash In_mdi mdi-account-cash'))

WebUI.setText(findTestObject('Object Repository/Admin/Requester/Cash Out/input_Issuer ID_issuerId'), '123')

WebUI.setText(findTestObject('Object Repository/Admin/Requester/Cash Out/input_No Rekening Tujuan_noRekeningTujuan'), '26464363')

WebUI.setText(findTestObject('Object Repository/Admin/Requester/Cash Out/input_Amount_amount'), '590')

WebUI.setText(findTestObject('Object Repository/Admin/Requester/Cash Out/textarea_Keterangan_keterangan'), '13221312')

WebUI.click(findTestObject('Object Repository/Admin/Requester/Cash Out/button_Clear'))

WebUI.verifyElementVisible(findTestObject('Admin/Requester/Cash Out/label_Form Cash Out'))

WebUI.closeBrowser()

