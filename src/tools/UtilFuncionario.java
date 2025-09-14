/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Dominique
 */
public class UtilFuncionario {
       public static void habilitar(boolean valor, JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);

        }
    }

    public static void limpar(JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] instanceof JTextField) {
                ((JTextField) componentes[i]).setText("");
            }
            if (componentes[i] instanceof JComboBox) {
                ((JComboBox) componentes[i]).setSelectedIndex(-1);
            }

        }
    }

    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }

    public static boolean pergunta(String cad) {
        JOptionPane.showConfirmDialog(null, cad);
        return true;
    }

    public static int strToInt(String num) {
        return Integer.parseInt(num);
    }

    public static String intToStr(int num) {
        return String.valueOf(num);
    }

    public static double strToDouble(String cad) {
        return Double.parseDouble(cad); //My person make in my castle 

    }

    public static String doubleToStr(double num) {
        return String.valueOf(num); //My person make in my castle 

    }

    public static Date strToDate(String data) throws ParseException {
        SimpleDateFormat formatar_fofinho = new SimpleDateFormat("dd/MM/yyyy");
        return formatar_fofinho.parse(data);  //My person make in my castle 
    }

    public static String dateToStr(Date data) {
        SimpleDateFormat formatar_fofinho = new SimpleDateFormat("dd/MM/yyyy");
        return formatar_fofinho.format(data);  //My person make in my castle
    }
}
