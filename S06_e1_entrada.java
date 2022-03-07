package Semana6;

import javax.swing.*;
import java.util.ArrayList;

public class S06_e1_entrada {
    private ArrayList<S06_e1_estudiante> listaEstudiantes;

    public static void main(String[] args) {
        new S06_e1_entrada();
    }

    public S06_e1_entrada() {
        this.listaEstudiantes = new ArrayList();
        this.menu();
    }

    private void menu() {
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                    ==[Info Estudiantes]==
                    Menú de opciones:
                    
                    1. Agregar estudiante
                    2. Ver estudiante
                    3. Ver todo
                    4. Modificar estudiante
                    5. Eliminar estudiante
                    
                    0. SALIR
                    """));
            switch (opcion) {
                case 1:
                    this.nuevoEstudiante();
                    break;
                case 2:
                    if (!listaEstudiantes.isEmpty()) {
                        this.verEstudiante();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "La lista de estudiantes está vacía. Agregue un estudiante,");
                    }
                    break;
                case 3:
                    if (!listaEstudiantes.isEmpty()) {
                        this.verTodos();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "La lista de estudiantes está vacía. Agregue un estudiante.");
                    }
                    break;
                case 4:
                    if (!listaEstudiantes.isEmpty()) {
                        this.modificarEstudiante();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "La lista de estudiantes está vacía. Agregue un estudiante.");
                    }
                    break;
                case 5:
                    if (!listaEstudiantes.isEmpty()) {
                        this.eliminarEstudiante();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "La lista de estudiantes está vacía. Agregue un estudiante.");
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    break;
            }
        } while (opcion != 0);
    }

    private void nuevoEstudiante() {
        String codigo = "", n_codigo, nombres, apellidos, programa;
        float nota;
        boolean existe = false;

        do {
            n_codigo = JOptionPane.showInputDialog("Digite el código del estudiante: ");
            for (S06_e1_estudiante stud: this.listaEstudiantes) {
                if (stud.getCodigo().equals(n_codigo)) {
                    JOptionPane.showMessageDialog(null, "Ese código ya fue asignado a otro estudiante.");
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                codigo = n_codigo;
            }
        } while (existe);
        nombres = JOptionPane.showInputDialog("Digite el nombre del estudiante: ");
        apellidos = JOptionPane.showInputDialog("Digite los apellidos del estudiante: ");
        programa = JOptionPane.showInputDialog("Digite el programa del estudiante: ");
        do {
            nota = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del estudiante: "));
            if (nota < 0 || nota > 5) {
                JOptionPane.showMessageDialog(null, "Nota inválida.");
            }
        } while (nota < 0 || nota > 5);
        S06_e1_estudiante student = new S06_e1_estudiante(codigo, nombres, apellidos, programa, nota);
        this.listaEstudiantes.add(student);
    }

    private void verEstudiante() {
        String codigo;
        boolean existe = false;

        codigo = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        for (S06_e1_estudiante stud: this.listaEstudiantes) {
            if (stud.getCodigo().equals(codigo)) {
                JOptionPane.showMessageDialog(null, stud);
                existe = true;
                break;
            }
        }
        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese código no existe.");
        }
    }

    private void verTodos() {
        String msj = "";

        for (S06_e1_estudiante stud: this.listaEstudiantes) {
            msj += stud + "\n";
        }
        JOptionPane.showMessageDialog(null, msj);
    }

    private void modificarEstudiante() {
        int opcion;
        String codigo;
        boolean existe = false;

        codigo = JOptionPane.showInputDialog("Digite el código del estudiante que desea modificar:");
        for (S06_e1_estudiante stud: this.listaEstudiantes) {
            if (stud.getCodigo().equals(codigo)) {
                do {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("==[Modificar Estudiante ID: " + codigo +"]==" + """
                    
                    Menú de opciones:
                    
                    1. Modificar código
                    2. Modificar nombre
                    3. Modificar apellido
                    4. Modificar programa
                    5. Modificar nota
                    
                    0. MENÚ PRINCIPAL
                    """));
                    switch (opcion) {
                        case 1 -> this.modifCodigo(stud);
                        case 2 -> this.modifNombre(stud);
                        case 3 -> this.modifApellido(stud);
                        case 4 -> this.modifPrograma(stud);
                        case 5 -> this.modifNota(stud);
                        case 0 -> this.menu();
                        default -> JOptionPane.showMessageDialog(null, "Opción inválida");
                    }
                } while (opcion != 0);
                existe = true;
                break;
            }
        }
        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese código no existe.");
        }
    }

    private void modifCodigo(S06_e1_estudiante stud) {
        String n_codigo;
        boolean existe = false;

        do {
            n_codigo = JOptionPane.showInputDialog("Ingrese el nuevo código del estudiante:");
            for (S06_e1_estudiante stud2: this.listaEstudiantes) {
                if (stud2.getCodigo().equals(n_codigo) && stud2 != stud) {
                    JOptionPane.showMessageDialog(null, "Ese código ya fue asignado a otro estudiante.");
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                stud.setCodigo(n_codigo);
            }
        } while (existe);
    }

    private void modifNombre(S06_e1_estudiante stud) {
        stud.setNombres(JOptionPane.showInputDialog("Ingrese el nuevo nombre del estudiante:"));
    }

    private void modifApellido(S06_e1_estudiante stud) {
        stud.setApellidos(JOptionPane.showInputDialog("Ingrese el nuevo apellido del estudiante:"));
    }

    private void modifPrograma(S06_e1_estudiante stud) {
        stud.setPrograma(JOptionPane.showInputDialog("Ingrese el nuevo programa del estudiante:"));
    }

    private void modifNota(S06_e1_estudiante stud) {
        float nota;

        do {
            nota = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del estudiante: "));
            if (nota < 0 || nota > 5) {
                JOptionPane.showMessageDialog(null, "Nota inválida.");
            }
        } while (nota < 0 || nota > 5);
        stud.setNota(nota);
    }

    private void eliminarEstudiante() {
        String codigo;
        boolean existe = false;

        codigo = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        for (S06_e1_estudiante stud: this.listaEstudiantes) {
            if (stud.getCodigo().equals(codigo)) {
                this.listaEstudiantes.remove(stud);
                JOptionPane.showMessageDialog(null, "Se eliminó al estudiante.");
                existe = true;
                break;
            }
        }
        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese código no existe.");
        }
    }
}
