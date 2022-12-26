/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import enums.EMELIYYAT;
import java.util.Arrays;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EMELIYYAT e = EMELIYYAT.TOPLA;
        // calssin adini gostermek
        System.out.println(e.getClass().getName());

        // super classin adini gostermek
        System.out.println(e.getClass().getSuperclass().getName());
        System.out.println("");

        // interface sayina baxmaq
        System.out.println(e.getClass().getInterfaces().length);
        System.out.println("");

        // values() EMELIYYAT tipinin butun yaranmis obyektleri array kimi qaytarir
        System.out.println(Arrays.toString(EMELIYYAT.values()));
        System.out.println("");

        // name == EMELIYYAT adina baxmaq
        System.out.println(e.name());
        // ordinal == EMELIYYAT sirasina baxmaq, array kimi 0-dan baslayir
        System.out.println(e.ordinal());
        System.out.println("");

        // hesablamaq ve simbolu tapmaq
        double net = e.hesabla(10, 5);
        System.out.println(net);
        System.out.println(e.getOperationSymbol());
    }

}
