package joanji.maven;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class App{

    public int contarLletres(String paraula) {
    	String[] seperarParaules = StringUtils.split(paraula, ' ');
	return (seperarParaules == null) ? 0 : seperarParaules.length;
    }

    public void greet() {
    	List<String> gree = new  ArrayList<>();
	gree.add("Hola");

	for (String greet : gree){
	   System.out.println("Buenos dias: " + greet);
	}
    }

    public App() {
        System.out.println (" En la aplicacion ");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
        System.out.println (" Iniciando aplicacion ");
        App app = new App();
	app.greet();
	int contar = app.contarLletres("Tengo tres palabras ");
	System.out.println("Cuenta de palabras: " + contar);
    }
}
