package com.accenture.course.selenium.cucumber.utils;

import java.io.File;

public class Constants {
	
	//Caminho para os drivers no projeto. Boa pr�tica para evitar erros na escrita e padronização para versionamento do projeto
	public static final String PATH_CHROMEDRIVER = new File("").getAbsolutePath() + "/src/test/resources/chromedriver/chromedriver.exe";
	public static final String PATH_FIREFOXDRIVER = new File("").getAbsolutePath() + "\\src\\main\\java\\com\\accenture\\resources\\geckodriver.exe";
	public static final String PATH_IEDRIVER32 = new File("").getAbsolutePath() + "\\src\\main\\java\\com\\accenture\\resources\\IEDriverServer32.exe";
	public static final String PATH_IEDRIVER64 = new File("").getAbsolutePath() + "\\src\\main\\java\\com\\accenture\\resources\\IEDriverServer.exe";
}
