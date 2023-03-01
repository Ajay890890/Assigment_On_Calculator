package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

	private WebDriver driver;

	// WebElement
	@FindBy(xpath = "//span[text()='×']")
	private WebElement multiplicationBtn;
	@FindBy(xpath = "//span[text()='/']")
	private WebElement divideBtn;
	@FindBy(xpath = "//span[text()='+']")
	private WebElement plusBtn;
	@FindBy(xpath = "//span[text()='–']")
	private WebElement minusBtn;
	@FindBy(xpath = "//span[text()='1']")
	private WebElement oneBtn;
	@FindBy(xpath = "//span[text()='2']")
	private WebElement twoBtn;
	@FindBy(xpath = "//span[text()='3']")
	private WebElement threeBtn;
	@FindBy(xpath = "//span[text()='4']")
	private WebElement fourBtn;
	@FindBy(xpath = "//span[text()='5']")
	private WebElement fiveBtn;
	@FindBy(xpath = "//span[text()='6']")
	private WebElement sixBtn;
	@FindBy(xpath = "//span[text()='7']")
	private WebElement sevenBtn;
	@FindBy(xpath = "//span[text()='8']")
	private WebElement eightBtn;
	@FindBy(xpath = "//span[text()='9']")
	private WebElement nineBtn;
	@FindBy(xpath = "//span[text()='0']")
	private WebElement zeroBtn;

	@FindBy(id = "sciOutPut")
	private WebElement outputField;

	// Constructor
	public CalculatorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);// driver initialization w.r.t page
		this.driver = driver;
	}

	// Action Methods
	public void addition(Integer N1, Integer N2) {
		String num1 = String.valueOf(N1);
		for (int i = 0; i <= num1.length() - 1; i++) {

			if (num1.charAt(i) == '-') {
				minusBtn.click();
			}
			if (num1.charAt(i) == '1') {
				oneBtn.click();
			}
			if (num1.charAt(i) == '2') {
				twoBtn.click();
			}
			if (num1.charAt(i) == '3') {
				threeBtn.click();
			}
			if (num1.charAt(i) == '4') {
				fourBtn.click();
			}
			if (num1.charAt(i) == '5') {
				fiveBtn.click();
			}
			if (num1.charAt(i) == '6') {
				sixBtn.click();
			}
			if (num1.charAt(i) == '7') {
				sevenBtn.click();
			}
			if (num1.charAt(i) == '8') {
				eightBtn.click();
			}
			if (num1.charAt(i) == '9') {
				nineBtn.click();
			}
			if (num1.charAt(i) == '0') {
				zeroBtn.click();
			}

		}
		plusBtn.click();
		String num2 = String.valueOf(N2);
		for (int i = 0; i <= num2.length() - 1; i++) {

			if (num2.charAt(i) == '-') {
				minusBtn.click();
			}
			if (num2.charAt(i) == '1') {
				oneBtn.click();
			}
			if (num2.charAt(i) == '2') {
				twoBtn.click();
			}
			if (num2.charAt(i) == '3') {
				threeBtn.click();
			}
			if (num2.charAt(i) == '4') {
				fourBtn.click();
			}
			if (num2.charAt(i) == '5') {
				fiveBtn.click();
			}
			if (num2.charAt(i) == '6') {
				sixBtn.click();
			}
			if (num2.charAt(i) == '7') {
				sevenBtn.click();
			}
			if (num2.charAt(i) == '8') {
				eightBtn.click();
			}
			if (num2.charAt(i) == '9') {
				nineBtn.click();
			}
			if (num2.charAt(i) == '0') {
				zeroBtn.click();
			}

		}
	}

//Substraction
	public void substraction(int m, int n) {
		String num1 = String.valueOf(m);
		for (int i = 0; i <= num1.length() - 1; i++) {

			if (num1.charAt(i) == '-') {
				minusBtn.click();
			}
			if (num1.charAt(i) == '1') {
				oneBtn.click();
			}
			if (num1.charAt(i) == '2') {
				twoBtn.click();
			}
			if (num1.charAt(i) == '3') {
				threeBtn.click();
			}
			if (num1.charAt(i) == '4') {
				fourBtn.click();
			}
			if (num1.charAt(i) == '5') {
				fiveBtn.click();
			}
			if (num1.charAt(i) == '6') {
				sixBtn.click();
			}
			if (num1.charAt(i) == '7') {
				sevenBtn.click();
			}
			if (num1.charAt(i) == '8') {
				eightBtn.click();
			}
			if (num1.charAt(i) == '9') {
				nineBtn.click();
			}
			if (num1.charAt(i) == '0') {
				zeroBtn.click();
			}

		}
		minusBtn.click();
		String num2 = String.valueOf(n);
		for (int i = 0; i <= num2.length() - 1; i++) {

			if (num2.charAt(i) == '-') {
				minusBtn.click();
			}
			if (num2.charAt(i) == '1') {
				oneBtn.click();
			}
			if (num2.charAt(i) == '2') {
				twoBtn.click();
			}
			if (num2.charAt(i) == '3') {
				threeBtn.click();
			}
			if (num2.charAt(i) == '4') {
				fourBtn.click();
			}
			if (num2.charAt(i) == '5') {
				fiveBtn.click();
			}
			if (num2.charAt(i) == '6') {
				sixBtn.click();
			}
			if (num2.charAt(i) == '7') {
				sevenBtn.click();
			}
			if (num2.charAt(i) == '8') {
				eightBtn.click();
			}
			if (num2.charAt(i) == '9') {
				nineBtn.click();
			}
			if (num2.charAt(i) == '0') {
				zeroBtn.click();
			}

		}

	}

//division
	public void division(int m, int n) {

		String num1 = String.valueOf(m);
		for (int i = 0; i <= num1.length() - 1; i++) {

			if (num1.charAt(i) == '-') {
				minusBtn.click();
			}
			if (num1.charAt(i) == '1') {
				oneBtn.click();
			}
			if (num1.charAt(i) == '2') {
				twoBtn.click();
			}
			if (num1.charAt(i) == '3') {
				threeBtn.click();
			}
			if (num1.charAt(i) == '4') {
				fourBtn.click();
			}
			if (num1.charAt(i) == '5') {
				fiveBtn.click();
			}
			if (num1.charAt(i) == '6') {
				sixBtn.click();
			}
			if (num1.charAt(i) == '7') {
				sevenBtn.click();
			}
			if (num1.charAt(i) == '8') {
				eightBtn.click();
			}
			if (num1.charAt(i) == '9') {
				nineBtn.click();
			}
			if (num1.charAt(i) == '0') {
				zeroBtn.click();
			}

		}
		divideBtn.click();
		String num2 = String.valueOf(n);
		for (int i = 0; i <= num2.length() - 1; i++) {

			if (num2.charAt(i) == '-') {
				minusBtn.click();
			}
			if (num2.charAt(i) == '1') {
				oneBtn.click();
			}
			if (num2.charAt(i) == '2') {
				twoBtn.click();
			}
			if (num2.charAt(i) == '3') {
				threeBtn.click();
			}
			if (num2.charAt(i) == '4') {
				fourBtn.click();
			}
			if (num2.charAt(i) == '5') {
				fiveBtn.click();
			}
			if (num2.charAt(i) == '6') {
				sixBtn.click();
			}
			if (num2.charAt(i) == '7') {
				sevenBtn.click();
			}
			if (num2.charAt(i) == '8') {
				eightBtn.click();
			}
			if (num2.charAt(i) == '9') {
				nineBtn.click();
			}
			if (num2.charAt(i) == '0') {
				zeroBtn.click();
			}

		}

	}

//multiplication
	public void multiplication(int m, int n) {

		String num1 = String.valueOf(m);
		for (int i = 0; i <= num1.length() - 1; i++) {

			if (num1.charAt(i) == '-') {
				minusBtn.click();
			}
			if (num1.charAt(i) == '1') {
				oneBtn.click();
			}
			if (num1.charAt(i) == '2') {
				twoBtn.click();
			}
			if (num1.charAt(i) == '3') {
				threeBtn.click();
			}
			if (num1.charAt(i) == '4') {
				fourBtn.click();
			}
			if (num1.charAt(i) == '5') {
				fiveBtn.click();
			}
			if (num1.charAt(i) == '6') {
				sixBtn.click();
			}
			if (num1.charAt(i) == '7') {
				sevenBtn.click();
			}
			if (num1.charAt(i) == '8') {
				eightBtn.click();
			}
			if (num1.charAt(i) == '9') {
				nineBtn.click();
			}
			if (num1.charAt(i) == '0') {
				zeroBtn.click();
			}

		}
		multiplicationBtn.click();
		String num2 = String.valueOf(n);
		for (int i = 0; i <= num2.length() - 1; i++) {

			if (num2.charAt(i) == '-') {
				minusBtn.click();
			}
			if (num2.charAt(i) == '1') {
				oneBtn.click();
			}
			if (num2.charAt(i) == '2') {
				twoBtn.click();
			}
			if (num2.charAt(i) == '3') {
				threeBtn.click();
			}
			if (num2.charAt(i) == '4') {
				fourBtn.click();
			}
			if (num2.charAt(i) == '5') {
				fiveBtn.click();
			}
			if (num2.charAt(i) == '6') {
				sixBtn.click();
			}
			if (num2.charAt(i) == '7') {
				sevenBtn.click();
			}
			if (num2.charAt(i) == '8') {
				eightBtn.click();
			}
			if (num2.charAt(i) == '9') {
				nineBtn.click();
			}
			if (num2.charAt(i) == '0') {
				zeroBtn.click();
			}

		}
	}

	public int getAddition() {
		return Integer.parseInt(outputField.getText().trim());
	}

	public Integer getSubstraction() {
		return Integer.parseInt(outputField.getText().trim());
	}

	public Integer getMultiplication() {
		return Integer.parseInt(outputField.getText().trim());
	}

	public Integer getDivision() {
		return Integer.parseInt(outputField.getText().trim());
	}

}
