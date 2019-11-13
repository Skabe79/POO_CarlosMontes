/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu_gato;
import java.util.Scanner;
/**
 *
 * @author Carlos Montes Leyva
 */
public class Calculadora {
    private double a;
    private double b;
    private double res;
    private double modulo;
    public Calculadora() {
        this.a=0;
        this.b=0;
    }
    public void menu(){
        String sim;
        System.out.println("Introsuca la operacion a hacer:");
        Scanner simbolo= new Scanner(System.in);
        sim=simbolo.nextLine();
        switch (sim){
            case "+":
                System.out.println(suma());
                menu();
                break;
            case "/":
                System.out.println(div());
                menu();
                break;
            case "*":
                System.out.println(mult());
                menu();
                break;
            case "-":
                System.out.println(rest());
                menu();
                break;
            case "%":
                System.out.println(mod());
                menu();
                break;
            case "pow":
                System.out.println(pot());
                menu();
                break;
            case "sqrt":
                System.out.println(raizcuad());
                menu();
                break;
            case "estado":
                System.out.println(toString());
                menu();
                break;
            case "salir":
                return ;
            default:
                menu();
        }
    }
    public double suma(){
        Scanner d1 = new Scanner(System.in);
        setA(d1);
        Scanner d2 = new Scanner(System.in);
        setB(d2);
        this.res=getA()+getB();
        return this.res;
    }
    public double mod(){
        Scanner d1 = new Scanner(System.in);
        setA(d1);
        Scanner d2 = new Scanner(System.in);
        setB(d2);
        this.res=getA()%getB();
        this.modulo=this.res;
        return this.res;
    }
    public double div(){
        Scanner d1 = new Scanner(System.in);
        setA(d1);
        Scanner d2 = new Scanner(System.in);
        setB(d2);
        this.res= getA()/getB();
        return this.res;
    }
    public double mult(){
        Scanner d1 = new Scanner(System.in);
        setA(d1);
        Scanner d2 = new Scanner(System.in);
        setB(d2);
        this.res= getA()*getB();
        return this.res;
    }
    public double pot(){
        Scanner d1 = new Scanner(System.in);
        setA(d1);
        Scanner d2 = new Scanner(System.in);
        setB(d2);
        this.res= Math.pow(getA(), getB());
        return this.res;
    }
    public double rest(){
        Scanner d1 = new Scanner(System.in);
        setA(d1);
        Scanner d2 = new Scanner(System.in);
        setB(d2);
        this.res= getA()-getB();
        return this.res;
    }
    public double raizcuad(){
        Scanner d1 = new Scanner(System.in);
        setA(d1);
        this.res= Math.sqrt(getA());
        return this.res;
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Scanner a) {
        this.a = a.nextDouble();
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Scanner b) {
        this.b = b.nextDouble();
    }

    /**
     * @return the Res
     */
    public double getRes() {
        return res;
    }

    /**
     * @return the modulo
     */
    public double getModulo() {
        return modulo;
    }

    @Override
    public String toString() {
        String estado="Mi variable a= "+getA()+"\nMi variable b= "+getB()+"\n"
                + "mi resultado actual de la anterior operacion es: "+getRes()+""
                + "\nMi valor de modulo es= "+getModulo()+"\n";
        return estado; //To change body of generated methods, choose Tools | Templates.
    }
    
}
