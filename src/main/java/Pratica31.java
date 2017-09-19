import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woich
 */
public class Pratica31 {
    private static final String meuNome = "pedro HENRIque WOICIEchovski";;
    private static GregorianCalendar dataNascimento = new GregorianCalendar(1999, Calendar.JULY, 06);
    private static Date inicio, fim;
    public static long dias;
        
    /*Separa o nome completo em suas devidas partes*/
    private static String[] nome = meuNome.split (Pattern.quote (" "));
        
    /*Corrige Formatação dos nomes*/
    private static String pNomeCorrigino = nome[0].toUpperCase();
    private static String sNomeCorrigino = nome[1].toUpperCase();
        
    /*Corrige Formatação dos Sobrenome*/
    private static String sobrenomeCorrigido = nome[2].toLowerCase();
        
    private static char[] primeiroNome = pNomeCorrigino.toCharArray();
    private static char[] segundoNome = sNomeCorrigino.toCharArray();
        
    public static void main(String[] args){
        
        inicio = new Date();
        
        sobrenomeCorrigido = sobrenomeCorrigido.replace(sobrenomeCorrigido.substring(0, 1), sobrenomeCorrigido.substring(0, 1).toUpperCase());
            
        System.out.println(meuNome.toUpperCase());
            
        System.out.println(sobrenomeCorrigido + ", " + primeiroNome[0] + ". " + segundoNome[0] + ". ");
        
        dias = (inicio.getTime() - dataNascimento.getTime().getTime())/86400000;
        System.out.println(dias);
        
        fim = new Date();
        
        System.out.println(fim.getTime() - inicio.getTime());
        
    }
        
}
