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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://kmg.hcm.pl/testowanie/index.html')

WebUI.setText(findTestObject('logowanie_edycja_Page_PSTO webMessenger/input_Zarejestruj konto_userLogin'), 'ewelinaholderna')

WebUI.setEncryptedText(findTestObject('logowanie_edycja_Page_PSTO webMessenger/input_Zarejestruj konto_passwordLogin'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('logowanie_edycja_Page_PSTO webMessenger/input_Zarejestruj konto_login'))

WebUI.scrollToElement(findTestObject('logowanie_edycja_Page_PSTO webMessenger - Zalogowano/img_Zarejestruj konto_profile'), 
    2)

WebUI.click(findTestObject('logowanie_edycja_Page_PSTO webMessenger - Zalogowano/img_Zarejestruj konto_profile'))

WebUI.setEncryptedText(findTestObject('logowanie_edycja_Page_PSTO webMessenger - Zalogowano/input_Zmien haslo_oldPass'), 
    'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('logowanie_edycja_Page_PSTO webMessenger - Zalogowano/input_Zmien haslo_editPass'), 
    'qeJ0sjJnwEs=')

WebUI.setEncryptedText(findTestObject('logowanie_edycja_Page_PSTO webMessenger - Zalogowano/input_Zmien haslo_editPassRepeat'), 
    'qeJ0sjJnwEs=')

WebUI.click(findTestObject('logowanie_edycja_Page_PSTO webMessenger - Zalogowano/input_Zmien haslo_changePassword'))

WebUI.click(findTestObject('logowanie_edycja_Page_PSTO webMessenger - Zalogowano/img_Zarejestruj konto_close'))

WebUI.setText(findTestObject('logowanie_edycja_Page_PSTO webMessenger/input_Zarejestruj konto_userLogin'), 'ewelinaholderna')

WebUI.setEncryptedText(findTestObject('logowanie_edycja_Page_PSTO webMessenger/input_Zarejestruj konto_passwordLogin'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('logowanie_edycja_Page_PSTO webMessenger/input_Zarejestruj konto_login'))

WebUI.waitForAlert(2)

alert_text = WebUI.getAlertText()

WebUI.verifyEqual(alert_text, 'Podano błędną nazwę użytkownika lub hasło!')

WebUI.setText(findTestObject('logowanie_edycja_Page_PSTO webMessenger/input_Zarejestruj konto_userLogin'), 'ewelinaholderna')

WebUI.setEncryptedText(findTestObject('logowanie_edycja_Page_PSTO webMessenger/input_Zarejestruj konto_passwordLogin'), 
    'qeJ0sjJnwEs=')

WebUI.click(findTestObject('logowanie_edycja_Page_PSTO webMessenger/input_Zarejestruj konto_login'))

WebUI.click(findTestObject('logowanie_edycja_Page_PSTO webMessenger - Zalogowano/img_Zarejestruj konto_profile'))

WebUI.setEncryptedText(findTestObject('logowanie_edycja_Page_PSTO webMessenger - Zalogowano/input_Zmien haslo_oldPass'), 
    'qeJ0sjJnwEs=')

WebUI.setEncryptedText(findTestObject('logowanie_edycja_Page_PSTO webMessenger - Zalogowano/input_Zmien haslo_editPass'), 
    'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('logowanie_edycja_Page_PSTO webMessenger - Zalogowano/input_Zmien haslo_editPassRepeat'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('logowanie_edycja_Page_PSTO webMessenger - Zalogowano/input_Zmien haslo_changePassword'))

WebUI.click(findTestObject('logowanie_edycja_Page_PSTO webMessenger - Zalogowano/img_Zarejestruj konto_close'))

WebUI.closeBrowser()

