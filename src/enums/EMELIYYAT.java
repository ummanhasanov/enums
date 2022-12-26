/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enums;

/**
 *
 * @author Umman Hasan
 */
public enum EMELIYYAT
// TOPLA, CIX, VUR, BOL => her birinin EMELIYYAT tipinde obyekti yaranir
{
// TOPLA, CIX, VUR, BOL; == TOPLA(), CIX(), VUR(), BOL(); => default olaraq
    TOPLA('+'), CIX('-'), VUR('*'), BOL('/');
    private char c;

    private EMELIYYAT(char c) {
        this.c = c;
    }

    private EMELIYYAT() {
    }

    public char getOperationSymbol(){
        return this.c;
    }
    public double hesabla(double a, double b) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                break;
        }
        return -1;
    }

}
