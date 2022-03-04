package nivel2;

import javax.security.auth.login.Configuration;
import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;


public class Ejercicio2 {
    private double[] numbers;
    private double prom;
    private double[] copyNumbers;
    private boolean bool;


    public static void main (String [] args){

        new Ejercicio2();
    }
    public Ejercicio2(){
        this.numbers = null;
        this.prom = 0;
        this.menu();
        this.bool = false;

    }

    private  void operaciones(){


        //double[] numbers = this.generadorDeDatos();
        this.generadorDeDatos();
        this.muestra();
        this.organizarDatos();
        this.Promedio();
        this.muestraMejor();
        this.muestrPeor();
        this.desviacionEstandar();


    }

    private void menu(){
        int option;
        option=Integer.parseInt(JOptionPane.showInputDialog("Menu \n"+
                                                            "1. Generar Datos \n "+
                                                            "2. Ver muestra \n" +
                                                            "3. Muestra Ordenada \n" +
                                                            "4. Ver mayor dato \n"+
                                                            "5. Ver menor dato \n"+
                                                            "6. Ver mayores datos \n"+
                                                            "7. Ver menores datos \n" +
                                                            "8. Ver Promedio \n" +
                                                            "9. Ver desviacion \n" +
                                                            "0. Salir"
                                                            ));
        do{
            switch (option) {
                case 1 -> this.generadorDeDatos();

                case 2 -> this.muestra();
                case 3 -> this.organizarDatos();
                case 4 -> this.mejor();
                case 5 -> this.menor();
                case 6 -> this.muestraMejor();
                case 7 -> this.muestrPeor();
                case 8 -> this.Promedio();
                case 9 -> this.desviacionEstandar();
                case 0 -> {
                }
                default -> option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion valida"));
            }
        }while(option!=0);

    }
    private double[] generadorDeDatos(){
        int range = 0;
        range = Integer.parseInt( JOptionPane.showInputDialog("Ingrese rango de datos"));
        numbers = new double[range];
        double aux = 0;
        for(int i = 0; i< numbers.length;i++){ // Generador de numeros random, almacenamiento en array
            aux = (float) (Math.random()*99+1);
            BigDecimal dec = new BigDecimal(aux).setScale(2, RoundingMode.UP); //Redondeo en dos decimales
            numbers[i] = dec.doubleValue();
        }
        this.copyNumbers = numbers;
        this.bool = true;

        return  numbers;
    }

    private void muestra() {
        for (int i = 0; i < copyNumbers.length; i++) { // Generador de numeros random, almacenamiento en array
            System.out.print(copyNumbers[i] + "\t");

        }

    }

    private void organizarDatos(){
        double sumDat = 0,aux = 0;
        Arrays.sort(numbers);
        for(int j = 0; j < numbers.length;j++){ // Ordenamiento de menor a mayor
            System.out.print(numbers + "\t");
        }
    }

    private void Promedio(){
        double sumDat = 0;
        for(int j = 0; j < numbers.length;j++){ // Ordenamiento de menor a mayor
            sumDat = sumDat + numbers[j];
        }
        double prom = 0;
        this.prom = sumDat/ numbers.length;
        BigDecimal dec = new BigDecimal(prom).setScale(2, RoundingMode.UP);
        prom = dec.doubleValue();
        System.out.println("Promedio " + prom);


    }

    private void menor(){
        System.out.println("Menor: " + numbers[0]);
    }
    private void mejor(){
        System.out.println("Mayor: " + numbers[numbers.length-1]);
    }
    private void muestraMejor(){


        System.out.println("Numeros mayores: ");
        int cont =0;
        for(int i = numbers.length-1; i>=3 ; i--){//Imprimir los x numeros mayores
            System.out.print(numbers[i] + "\t");
            cont++;
            if(cont == 3){
                break;
            }
        }

    }
    private void muestrPeor(){

        System.out.println();
        System.out.println("Numeros menores: ");
        for(int i = 0 ; i<3;i++){//Imprimir los x numeros menores
            System.out.print(numbers[i] + "\t");
        }
    }

    private void desviacionEstandar( ){
        double sumVar = 0, var = 0,desvEst = 0;

        for(int i = 0; i< numbers.length;i++){ // Desviacion estandar y variacion de los datos
            sumVar = Math.pow(numbers[i] -prom,2);
            var = var + sumVar;
        }
        var = var / (numbers.length-1);

        desvEst = Math.sqrt(var);
        BigDecimal rem = new BigDecimal(desvEst).setScale(2, RoundingMode.UP);
        desvEst = rem.doubleValue();
        System.out.println("Desviacion Estandar: " + desvEst);

    }

}