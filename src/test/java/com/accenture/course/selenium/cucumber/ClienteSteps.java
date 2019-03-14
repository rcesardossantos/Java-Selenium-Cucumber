package com.accenture.course.selenium.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ClienteSteps {

	@Given("iniciar o site da Tricents e clico no link Automobile")
	public void clicarLinkAutomovel() {
		ClientePage clientePage = new ClientePage();
		clientePage.clicarLinkAutomovel();
	}

	@When("na tela de Enter Vehicle Data informo os dados do veiculo")
	public void informarDadosVeiculo() {
		ClientePage clientePage = new ClientePage();
		clientePage.informarDadosVeiculo();
	}

	@And("na tela Enter Vehicle Data clico em Next")
	public void dadosVeiculoClicarAvancar() {
		ClientePage clientePage = new ClientePage();
		clientePage.dadosVeiculoClicarAvancar();

	}

	@When("na tela Enter Insurant Data informo os dados do segurador")
	public void informarDadosSegurador() {
		ClientePage clientePage = new ClientePage();
		clientePage.informarDadosSegurador();
	}
	

	@And("na tela Enter Insurtant Data clico em Next")
	public void dadosSeguradorClicarAvancar() {
		ClientePage clientePage = new ClientePage();
		clientePage.dadosSeguradorClicarAvancar();
		
	}

	@When("na tela Enter Product Data informo os dados do produto")
	public void informarDadosProduto() {
		ClientePage clientePage = new ClientePage();
		clientePage.informarDadosProduto();
	}

	@And("na tela Enter Product Data clico em Next")
	public void dadosProdutoClicarAvancar() {
		ClientePage clientePage = new ClientePage();
		clientePage.dadosProdutoClicarAvancar();
	}

	@And("na tela Select Price Option seleciono a opçào Ultimate")
	public void selecionarOpcaoRadioButton() {
		ClientePage clientePage = new ClientePage();
		clientePage.selecionarOpcaoRadioButton();
	}

	@And("na tela Select Price Option clico em Next")
	public void opcaoSelecionadaClicarAvancar() {
		ClientePage clientePage = new ClientePage();
		clientePage.opcaoSelecionadaClicarAvancar();
	}

	@When("na tela Send Quote informo os dados pessoais para envio de orçamento")
	public void informarDadosPessoais() {
		ClientePage clientePage = new ClientePage();
		clientePage.informarDadosPessoais();
	}

	@And("na tela Send Quote clico em Send")
	public void dadosPessoaisClicarAvancar() {
		ClientePage clientePage = new ClientePage();
		clientePage.dadosPessoaisClicarAvancar();
	}
}