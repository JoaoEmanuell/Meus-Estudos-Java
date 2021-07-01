
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emanuel
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        Date data = new Date();
        
        System.out.print("A hora do sistema é ");
        
        System.out.println(data.toString());
        
        Locale loc = Locale.getDefault();

        String idioma = loc.getDisplayLanguage();

        System.out.println("Seu sistema está em " + idioma);
        
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(tamanhoTela.getSize());
    }
}
