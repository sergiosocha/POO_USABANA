package nivel4_migracion;

import javax.swing.*;
import java.util.ArrayList;

public class Entrada {
    gestionEstudiante gestor;

    //private boolean verify;
    //Variables de clase

    //Metodos
    public static void main(String [] entrada){

        new Entrada();
    }
    private void menu(){


        int option;
        do{
        option=Integer.parseInt(JOptionPane.showInputDialog("Menu \n"+
                "1. Agregar un estudiante \n "+
                "2. Ver estudiante \n" +
                "3. Ver todos \n" +
                "4. Modificar estudiante \n" +
                "5. Eliminar estudiante\n"+
                "0. Salir"
        ));

            switch (option) {
                case 1 :
                    this.gestor.nuevoEstudiante();
                    break;
                case 2 :
                    this.gestor.verEstudiante();
                    break;
                case 3:
                    this.gestor.verTodos();
                    break;
                case 4:
                    this.menuModificaciones();
                    break;
                case 5:
                    this.gestor.deleteStudent();
                    break;

                case 0 :
                    break;
                default :
                    option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion valida"));
                    break;
            }
        }while(option!=0);

    }
    private void menuModificaciones(){
        int option;
        do{
        option=Integer.parseInt(JOptionPane.showInputDialog("MODIFICAIONES \n"+
                "1. Modificar Codigo \n "+
                "2. Modificar nombre \n" +
                "3. Modificar apellido\n" +
                "4. Modificar programa\n"+
                "5. Modificar nota \n"+
                "6. Volver al menu principal \n" +
                "0. Salir"
        ));

            switch (option) {
                case 1 :
                    this.gestor.modifyId();
                    break;
                case 2 :
                    this.gestor.modifyName();
                    break;
                case 3:
                    this.gestor.modifyLastName();
                    break;
                case 4:
                    this.gestor.modifyProgram();
                    break;
                case 5:
                    this.gestor.modifyNota();
                    break;
                case 0 :
                    break;
                default :
                    option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion valida"));
                    break;
            }
        }while(option!=0);
    }

    public Entrada(){
        this.gestor = new gestionEstudiante();

        this.menu();
    }


    /*private boolean codeExist(){
        boolean existe = false;
        String option = "";
        option = JOptionPane.showInputDialog("Ingrese el codigo del estudiante : ");
        for(Estudiante stud: this.students ){
            if(stud.getId().equalsIgnoreCase(option)){

                JOptionPane.showMessageDialog(null,"El codigo existe");
                return true;
                break;
            }

        }
        if(!existe){
            JOptionPane.showMessageDialog(null, "El codigo no existe");
            this.codeExist();
        }
    }*/


}
