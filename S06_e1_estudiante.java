package Semana6;

public class S06_e1_estudiante {
    //Atributos
    private String codigo;
    private String nombres;
    private String apellidos;
    private String programa;
    private float nota;

    //Métodos constructores
    public S06_e1_estudiante() {
        this.codigo = "";
        this.nombres = "";
        this.apellidos = "";
        this.programa = "";
        this.nota = 0;
    }

    public S06_e1_estudiante(String codigo, String nombres, String apellidos, String programa, float nota) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.programa = programa;
        this.nota = nota;
    }

    //Métodos analizadores
    public String getCodigo() {
        return this.codigo;
    }
    public String getNombres() {
        return this.nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    public String getPrograma() {
        return this.programa;
    }
    public float getNota() {
        return this.nota;
    }

    //Métodos modificadores
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setPrograma(String programa) {
        this.programa = programa;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }

    public String toString() {
        return this.codigo + ", " + this.nombres + ", " + this.apellidos + ", " + this.programa + ", " + this.nota;
    }
}
