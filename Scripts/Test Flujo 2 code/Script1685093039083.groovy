import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Frame as Frame
import javax.swing.JOptionPane as JOptionPane
import java.awt.Font as Font
import javax.swing.JFileChooser as JFileChooser
import javax.swing.UIManager as UIManager
import javax.swing.filechooser.FileSystemView as FileSystemView
import com.kms.katalon.core.annotation.Keyword as Keyword
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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.setViewPortSize(3920, 3080)

WebUI.navigateToUrl('https://uat.aulaplaneta.com/')

WebUI.setText(findTestObject('Object Repository/Page_aulaPlaneta/input_Nombre_form-control ng-untouched ng-d_b6159e'), 'Profesor_estres_1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_aulaPlaneta/input_Contrasea_form-control ng-untouched n_eceae4'), 
    'aSjXa3TkIdaC2ltQJ6F5Vw==')

WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_Entrar'))

'Added recently'
WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_more_vert'))

WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_people_altModificar Asignacin'))

'\r\n'
WebUI.check(findTestObject('Page_aulaPlaneta/box_5A'))

WebUI.delay(2)

E5A_Checked = WebUI.getAttribute(findTestObject('Page_aulaPlaneta/box_5A'), 'class')

WebUI.click(findTestObject('Page_aulaPlaneta/button_Aceptar'))

WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/mat-icon_keyboard_arrow_down'))

WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_logoutCerrar sesin'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_aulaPlaneta/input_Nombre_form-control ng-untouched ng-d_b6159e'), 'Alumno_estres_1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_aulaPlaneta/input_Contrasea_form-control ng-untouched n_eceae4'), 
    'aSjXa3TkIdaC2ltQJ6F5Vw==')

WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_Entrar'))

WebUI.scrollToPosition(0, 22)

WebUI.click(findTestObject('Page_aulaPlaneta/a_Ciencias de la naturaleza'))

'If=Box_5A checked // Else=Box_5A not checked'
if (E5A_Checked == 'mat-checkbox mat-accent cdk-focused cdk-mouse-focused mat-checkbox-checked') {
    'Verify Element Visible'
    WebUI.verifyElementVisible(findTestObject('Page_Mis materias - aulaPlaneta/span_Copia profesor 1'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/mat-icon_keyboard_arrow_down'))

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_logoutCerrar sesin'))

    WebUI.setText(findTestObject('Object Repository/Page_aulaPlaneta/input_Nombre_form-control ng-untouched ng-d_b6159e'), 
        'Profesor_estres_1')

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_aulaPlaneta/input_Contrasea_form-control ng-untouched n_eceae4'), 
        'aSjXa3TkIdaC2ltQJ6F5Vw==')

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_Entrar'))

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_more_vert'))

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_people_altModificar Asignacin'))

    '\r\n'
    WebUI.check(findTestObject('Page_aulaPlaneta/box_5A'))

    WebUI.delay(2)

    E5A_Checked = WebUI.getAttribute(findTestObject('Page_aulaPlaneta/box_5A'), 'class')

    WebUI.click(findTestObject('Page_aulaPlaneta/button_Aceptar'))

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/mat-icon_keyboard_arrow_down'))

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_logoutCerrar sesin'))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Object Repository/Page_aulaPlaneta/input_Nombre_form-control ng-untouched ng-d_b6159e'), 
        'Alumno_estres_1')

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_aulaPlaneta/input_Contrasea_form-control ng-untouched n_eceae4'), 
        'aSjXa3TkIdaC2ltQJ6F5Vw==')

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_Entrar'))

    WebUI.click(findTestObject('Page_aulaPlaneta/a_Ciencias de la naturaleza'))

    'Verify Element Not Visible'
    WebUI.verifyElementNotVisible(findTestObject('Page_Mis materias - aulaPlaneta/span_Copia profesor 1'), FailureHandling.STOP_ON_FAILURE)
} else {
    'Verify Element Not Visible'
    WebUI.verifyElementNotVisible(findTestObject('Page_Mis materias - aulaPlaneta/span_Copia profesor 1'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/mat-icon_keyboard_arrow_down'))

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_logoutCerrar sesin'))

    WebUI.setText(findTestObject('Object Repository/Page_aulaPlaneta/input_Nombre_form-control ng-untouched ng-d_b6159e'), 
        'Profesor_estres_1')

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_aulaPlaneta/input_Contrasea_form-control ng-untouched n_eceae4'), 
        'aSjXa3TkIdaC2ltQJ6F5Vw==')

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_Entrar'))

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_more_vert'))

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_people_altModificar Asignacin'))

    '\r\n'
    WebUI.check(findTestObject('Page_aulaPlaneta/box_5A'))

    WebUI.delay(2)

    E5A_Checked = WebUI.getAttribute(findTestObject('Page_aulaPlaneta/box_5A'), 'class')

    WebUI.click(findTestObject('Page_aulaPlaneta/button_Aceptar'))

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/mat-icon_keyboard_arrow_down'))

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_logoutCerrar sesin'))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Object Repository/Page_aulaPlaneta/input_Nombre_form-control ng-untouched ng-d_b6159e'), 
        'Alumno_estres_1')

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_aulaPlaneta/input_Contrasea_form-control ng-untouched n_eceae4'), 
        'aSjXa3TkIdaC2ltQJ6F5Vw==')

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_Entrar'))

    WebUI.click(findTestObject('Page_aulaPlaneta/a_Ciencias de la naturaleza'))

    'Verify Element Visible'
    WebUI.verifyElementVisible(findTestObject('Page_Mis materias - aulaPlaneta/span_Copia profesor 1'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/mat-icon_keyboard_arrow_down'))

WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_logoutCerrar sesin'))

WebUI.closeBrowser()

