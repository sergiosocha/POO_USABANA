package nivel4_migracion;

import javax.swing.*;
import java.util.ArrayList;

public class gestionEstudiante {
    private ArrayList<Estudiante> students;
    Entrada entrada;

    private void gestionEstudiante(){
        this.entrada = new Entrada();
        this.students = new ArrayList<>();
    }
    public void nuevoEstudiante() {

        String id, name, lastName, program;
        float nota;

        id = JOptionPane.showInputDialog("Introduzca el ID");
        name = JOptionPane.showInputDialog("Introduzca el nombre");
        lastName = JOptionPane.showInputDialog("Introduzca el apellido");
        program = JOptionPane.showInputDialog("Introduzca el programa");
        nota = Float.parseFloat(JOptionPane.showInputDialog("Intruzca la nota del estudiante"));


        Estudiante Student = new Estudiante(id,name,lastName,program,nota);

        this.students.add(Student);



    }
    public void verEstudiante(){
        String Id;
        boolean verExist = false;
        Id = JOptionPane.showInputDialog("Ingrese el codigo del estudiante");
        for(Estudiante stud: this.students ){
            if(stud.getId().equals(Id)){
                System.out.println(stud);
                verExist = true;
                break;
            }

        }
        if(!verExist){
            JOptionPane.showMessageDialog(null, "No existe el estudiante");
        }


    }
    public void verTodos(){
        for(Estudiante stud: this.students){
            System.out.println(stud);
        }
    }
    public void modifyId(){
        String Id, newId;
        boolean verify = false;
        Id = JOptionPane.showInputDialog("Ingrese el codigo del estudiante");
        for(Estudiante stud: this.students ){
            if(stud.getId().equalsIgnoreCase(Id)){
                newId = JOptionPane.showInputDialog("Ingrese el codigo del estudiante");
                stud.setId(newId);
                verify = true;
                break;
            }

        }
        if(!verify){
            JOptionPane.showMessageDialog(null,"No existe el codigo");
            this.modifyId();
        }

    }
    public void modifyName(){
        String name, newName;
        boolean verify = false;
        name = JOptionPane.showInputDialog("Ingrese el codigo del estudiante");
        for(Estudiante stud: this.students ){
            if(stud.getId().equalsIgnoreCase(name)){
                newName = JOptionPane.showInputDialog("Ingrese el nuevo nombre del estudiante");
                stud.setName(newName);
                verify = true;
                break;
            }

        }
        if(!verify){
            JOptionPane.showMessageDialog(null,"No existe el nombre");
            this.modifyName();
        }

    }
    public void modifyLastName(){
        String name, newName;
        boolean verify = false;
        name = JOptionPane.showInputDialog("Ingrese el codigo del estudiante");
        for(Estudiante stud: this.students ){
            if(stud.getId().equalsIgnoreCase(name)){
                newName = JOptionPane.showInputDialog("Ingrese el nuevo apellido del estudiante");
                stud.setLastName(newName);
                verify = true;
                break;
            }

        }
        if(!verify){
            JOptionPane.showMessageDialog(null,"No existe el apellido");
            this.modifyLastName();
        }


    }
    public void modifyProgram(){
        String name, newName;
        boolean verify = false;
        name = JOptionPane.showInputDialog("Ingrese el codigo del estudiante");
        for(Estudiante stud: this.students ){
            if(stud.getId().equalsIgnoreCase(name)){
                newName = JOptionPane.showInputDialog("Ingrese el nuevo programa del estudiante");
                stud.setProgram(newName);
                verify = true;
                break;
            }

        }
        if(!verify){
            JOptionPane.showMessageDialog(null,"No existe el codigo");
            this.modifyProgram();
        }

    }
    public void modifyNota(){
        String name;
        float newName;
        boolean verify = false;
        name = JOptionPane.showInputDialog("Ingrese el codigo del estudiante");
        for(Estudiante stud: this.students ){
            if(stud.getId().equalsIgnoreCase(name)){
                newName = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nueva nota del estudiante"));
                stud.setNota(newName);
                verify = true;
                break;
            }

        }
        if(!verify){
            JOptionPane.showMessageDialog(null,"No existe el codigo");
            this.modifyNota();
        }

    }
    public void deleteStudent(){
        String name;

        boolean verify = false;
        name = JOptionPane.showInputDialog("Ingrese el codigo del estudiante que desea eliminar");
        for(Estudiante stud: this.students ){
            if(stud.getId().equalsIgnoreCase(name)){
                this.students.remove(stud);
                verify = true;
                break;
            }

        }
        if(!verify){
            JOptionPane.showMessageDialog(null,"No existe el codigo");
            this.deleteStudent();
        }

    }

}
