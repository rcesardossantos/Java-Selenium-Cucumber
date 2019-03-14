#Author: rodrigo.c.a.santos@accenture.com

@tag
Feature: Formulario para aquisição de seguro
Eu como usuario, desejo preencher um formulário completo de seguro de um veiculo para seja feita a cotação.

  @tag1
  Scenario: Preencher formulário 
  
		Given iniciar o site da Tricents e clico no link Automobile
		When na tela de Enter Vehicle Data informo os dados do veiculo
		And na tela Enter Vehicle Data clico em Next
		When na tela Enter Insurant Data informo os dados do segurador 
		And na tela Enter Insurtant Data clico em Next
		When na tela Enter Product Data informo os dados do produto
		And na tela Enter Product Data clico em Next
		And na tela Select Price Option seleciono a opçào Ultimate
		And na tela Select Price Option clico em Next
		When na tela Send Quote informo os dados pessoais para envio de orçamento
		And na tela Send Quote clico em Send

		
								