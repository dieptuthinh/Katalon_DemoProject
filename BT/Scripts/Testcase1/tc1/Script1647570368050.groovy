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

WebUI.openBrowser('https://demoqa.com/')

WebUI.click(findTestObject('Object Repository/tc1/Page_ToolsQA/div_Forms'))

WebUI.click(findTestObject('Object Repository/tc1/Page_ToolsQA/li_Practice Form'))

WebUI.verifyTextPresent('Student Registration Form', false)

WebUI.setText(findTestObject('tc1/Page_ToolsQA/input', [('id') : 'firstName']), 'Thinh')

WebUI.setText(findTestObject('tc1/Page_ToolsQA/input', [('id') : 'lastName']), 'Thinh')

WebUI.setText(findTestObject('tc1/Page_ToolsQA/input', [('id') : 'userEmail']), 'a@gmail.com')

WebUI.click(findTestObject('tc1/Page_ToolsQA/Gender', [('sex') : 'Female']))

WebUI.setText(findTestObject('tc1/Page_ToolsQA/input', [('id') : 'userNumber']), '0123456789')

WebUI.click(findTestObject('tc1/Page_ToolsQA/input', [('id') : 'dateOfBirthInput']))

WebUI.click(findTestObject('Object Repository/tc1/Page_ToolsQA/month'))

WebUI.click(findTestObject('Object Repository/tc1/Page_ToolsQA/month option'))

WebUI.click(findTestObject('Object Repository/tc1/Page_ToolsQA/year'))

WebUI.click(findTestObject('Object Repository/tc1/Page_ToolsQA/year option'))

WebUI.click(findTestObject('Object Repository/tc1/Page_ToolsQA/date'))

WebUI.click(findTestObject('Object Repository/tc1/Page_ToolsQA/subject'))

WebUI.setText(findTestObject('tc1/Page_ToolsQA/input', [('id') : 'subjectsInput']), 'Maths')

WebUI.sendKeys(findTestObject('tc1/Page_ToolsQA/input', [('id') : 'subjectsInput']), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('tc1/Page_ToolsQA/input', [('id') : 'subjectsInput']), 'English')

WebUI.sendKeys(findTestObject('tc1/Page_ToolsQA/input', [('id') : 'subjectsInput']), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('tc1/Page_ToolsQA/hobbies', [('hobby') : 'Sport']))

WebUI.click(findTestObject('tc1/Page_ToolsQA/hobbies', [('hobby') : 'Reading']))

WebUI.uploadFile(findTestObject('Object Repository/tc1/Page_ToolsQA/input', [('id') : 'uploadPicture']), 'C:\\Users\\dtthinh\\Katalon Studio\\BT\\BT\\Screenshot\\Ui_figma.png')

WebUI.setText(findTestObject('tc1/Page_ToolsQA/input', [('id') : 'currentAddress']), 'If you want more infomation please raise your hand')

WebUI.setText(findTestObject('Object Repository/tc1/Page_ToolsQA/input', [('id') : 'react-select-3-input']), 'NCR')

WebUI.sendKeys(findTestObject('tc1/Page_ToolsQA/input', [('id') : 'react-select-3-input']), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/tc1/Page_ToolsQA/input', [('id') : 'react-select-4-input']), 'Gurgaon')

WebUI.sendKeys(findTestObject('tc1/Page_ToolsQA/input', [('id') : 'react-select-4-input']), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot('C:\\Users\\dtthinh\\Katalon Studio\\BT\\BT\\Screenshot\\1.png')

WebUI.sendKeys(findTestObject('tc1/Page_ToolsQA/input', [('id') : 'submit']), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot('C:\\Users\\dtthinh\\Katalon Studio\\BT\\BT\\Screenshot\\2.png')

WebUI.sendKeys(findTestObject('tc1/Page_ToolsQA/input', [('id') : 'closeLargeModal']), Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

