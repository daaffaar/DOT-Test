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

Mobile.startApplication('C:\\Users\\Daffa Ramadhan\\Downloads\\com.yoesuv.androidroom-v3(2.1.2)-release.apk', false)

// insert new task

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'My Task']), 'My Task')

Mobile.verifyElementExist(findTestObject('Object Repository/ButtonDeleteAll'), GlobalVariable.G_Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/ButtonInsertNewTask'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/ButtonInsertNewTask'), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Insert New Task']), 'Insert New Task')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Task Title']), 'Task Title')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Task Content']), 'Task Content')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'CANCEL']), 'CANCEL')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'SAVE']), 'SAVE')

Mobile.setText(findTestObject('Object Repository/ElementByText', [('element') : 'Task Title']), 'DOT Task Hiring', GlobalVariable.G_Timeout)

Mobile.setText(findTestObject('Object Repository/ElementByText', [('element') : 'Task Content']), 'Automation Mobile Katalon, Fundamental QA, Acceptance Criteria dan Test Scenario', 
	GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/ElementByText', [('element') : 'SAVE']), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'DOT Task Hiring']), 'DOT Task Hiring')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Automation Mobile Katalon, Fundamental QA, Acceptance Criteria dan Test Scenario']), 
	'Automation Mobile Katalon, Fundamental QA, Acceptance Criteria dan Test Scenario')

// insert new task 2

Mobile.tap(findTestObject('Object Repository/ButtonInsertNewTask'), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Insert New Task']), 'Insert New Task')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Task Title']), 'Task Title')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Task Content']), 'Task Content')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'CANCEL']), 'CANCEL')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'SAVE']), 'SAVE')

Mobile.setText(findTestObject('Object Repository/ElementByText', [('element') : 'Task Title']), 'PR HARI INI', GlobalVariable.G_Timeout)

Mobile.setText(findTestObject('Object Repository/ElementByText', [('element') : 'Task Content']), 'KALKULUS, PROBSTAT DAN KIMIA',
	GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/ElementByText', [('element') : 'SAVE']), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'PR HARI INI']), 'PR HARI INI')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'KALKULUS, PROBSTAT DAN KIMIA']),	'KALKULUS, PROBSTAT DAN KIMIA')

// insert new task 3

Mobile.tap(findTestObject('Object Repository/ButtonInsertNewTask'), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Insert New Task']), 'Insert New Task')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Task Title']), 'Task Title')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Task Content']), 'Task Content')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'CANCEL']), 'CANCEL')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'SAVE']), 'SAVE')

Mobile.setText(findTestObject('Object Repository/ElementByText', [('element') : 'Task Title']), 'GYM', GlobalVariable.G_Timeout)

Mobile.setText(findTestObject('Object Repository/ElementByText', [('element') : 'Task Content']), 'Leg Day',
	GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/ElementByText', [('element') : 'SAVE']), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'GYM']), 'GYM')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Leg Day']),	'Leg Day')

// cancel dan edit task

Mobile.verifyElementExist(findTestObject('Object Repository/MenuMore'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/MenuMore'), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'EDIT']), 'EDIT')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'DELETE']), 'DELETE')

Mobile.tap(findTestObject('Object Repository/ElementByText', [('element') : 'EDIT']), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/ElementByText', [('element') : 'CANCEL']), GlobalVariable.G_Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/MenuMore'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/MenuMore'), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'EDIT']), 'EDIT')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'DELETE']), 'DELETE')

Mobile.tap(findTestObject('Object Repository/ElementByText', [('element') : 'EDIT']), GlobalVariable.G_Timeout)

Mobile.setText(findTestObject('Object Repository/ElementByText', [('element') : 'DOT Task Hiring']), 'DOT Task Hiring Test', GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/ElementByText', [('element') : 'UPDATE']), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'DOT Task Hiring Test']), 'DOT Task Hiring Test')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Automation Mobile Katalon, Fundamental QA, Acceptance Criteria dan Test Scenario']),
	'Automation Mobile Katalon, Fundamental QA, Acceptance Criteria dan Test Scenario')

// delete 1 task

Mobile.verifyElementExist(findTestObject('Object Repository/MenuMore'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/MenuMore'), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'EDIT']), 'EDIT')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'DELETE']), 'DELETE')

Mobile.tap(findTestObject('Object Repository/ElementByText', [('element') : 'DELETE']), GlobalVariable.G_Timeout)

// delete all task

Mobile.verifyElementExist(findTestObject('Object Repository/ButtonDeleteAll'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/ButtonDeleteAll'), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'CANCEL']), 'CANCEL')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'OK']), 'OK')

Mobile.tap(findTestObject('Object Repository/ElementByText', [('element') : 'CANCEL']), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'PR HARI INI']), 'PR HARI INI')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'GYM']), 'GYM')

Mobile.verifyElementExist(findTestObject('Object Repository/ButtonDeleteAll'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/ButtonDeleteAll'), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'CANCEL']), 'CANCEL')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'OK']), 'OK')

Mobile.tap(findTestObject('Object Repository/ElementByText', [('element') : 'OK']), GlobalVariable.G_Timeout)

// Negative Test

// Failed Insert New Task Task Title And Task Content Empty

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'My Task']), 'My Task')

Mobile.verifyElementExist(findTestObject('Object Repository/ButtonDeleteAll'), GlobalVariable.G_Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/ButtonInsertNewTask'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/ButtonInsertNewTask'), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Insert New Task']), 'Insert New Task')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Task Title']), 'Task Title')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Task Content']), 'Task Content')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'CANCEL']), 'CANCEL')

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'SAVE']), 'SAVE')

Mobile.tap(findTestObject('Object Repository/ElementByText', [('element') : 'SAVE']), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Title is Empty']), 'Title is Empty')

Mobile.verifyElementExist(findTestObject('Object Repository/FieldEmptyError'), GlobalVariable.G_Timeout)

// Failed Insert New Task Task Content Empty

Mobile.setText(findTestObject('Object Repository/ElementByText', [('element') : 'Task Title']), 'test', GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/ElementByText', [('element') : 'SAVE']), GlobalVariable.G_Timeout)

Mobile.verifyElementText(findTestObject('Object Repository/ElementByText', [('element') : 'Content is Empty']), 'Content is Empty')

Mobile.verifyElementExist(findTestObject('Object Repository/FieldEmptyError'), GlobalVariable.G_Timeout)