package com.accenture.course.selenium.cucumber;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ClientePage extends ClienteElementsMap {

	public ClientePage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void clicarLinkAutomovel() {
		linkAutomobile.click();
	}

	public void informarDadosVeiculo() {

		Select cmbMake = new Select(make);
		cmbMake.selectByVisibleText("Ford");

		engineperformance.sendKeys("200");
		dateofmanufacture.sendKeys("03/11/2019");

		Select cmbSeats = new Select(numberofseats);
		cmbSeats.selectByVisibleText("2");

		Select cmbFuel = new Select(fuel);
		cmbFuel.selectByVisibleText("Diesel");

		listprice.sendKeys("3212");
		licenseplatenumber.sendKeys("99876");
		annualmileage.sendKeys("32458");
	}

	public void dadosVeiculoClicarAvancar() {
		nextenterinsurantdata.click();
	}

	public void informarDadosSegurador() {
		firstname.sendKeys("Carlos");
		lastname.sendKeys("Souza");
		birthdate.sendKeys("03/10/1985");

		streetaddress.sendKeys("Rua dos testes");

		Select cmbCountry = new Select(country);
		cmbCountry.selectByVisibleText("Brazil");

		zipcode.sendKeys("09989098");
		city.sendKeys("São Paulo");

		Select cmbOccupation = new Select(occupation);
		cmbOccupation.selectByVisibleText("Employee");

		speeding.click();
	}

	public void dadosSeguradorClicarAvancar() {
		nextenterproductdata.click();
	}

	public void informarDadosProduto() {

		startdate.sendKeys("04/27/2019");

		Select cmbInsurance = new Select(insurancesum);
		cmbInsurance.selectByVisibleText("10.000.000,00");

		Select cmbMerit = new Select(meritrating);
		cmbMerit.selectByVisibleText("Super Bonus");

		Select cmbDamage = new Select(damageinsurance);
		cmbDamage.selectByVisibleText("No Coverage");

		LegalDefenseInsurance.click();

		Select cmbCourtesy = new Select(courtesycar);
		cmbCourtesy.selectByVisibleText("No");
	}

	public void dadosProdutoClicarAvancar() {
		nextselectpriceoption.click();
	}

	public void selecionarOpcaoRadioButton() {
		optionUltimate.click();
	}

	public void opcaoSelecionadaClicarAvancar() {
		saveFormPriceOption.click();
	}

	public void informarDadosPessoais() {
		email.sendKeys("automacao@teste.com.br");
		phone.sendKeys("5511999999999");
		username.sendKeys("SeleniumAuto");
		password.sendKeys("Teste123456");
		confirmPassword.sendKeys("Teste123456");
		comments.sendKeys("Testes de comentário");
	}

	public void dadosPessoaisClicarAvancar() {
		sendForm.click();
	}

}
