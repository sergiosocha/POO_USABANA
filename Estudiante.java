package nivel4_migracion;

public class Estudiante {
        //Atributos
        private String id;
        private String name;
        private String lastName;
        private String program;
        private float nota;


        public Estudiante (){
            this.id = "";
            this.name = "";
            this.lastName = "";
            this.program = "";
            this.nota = 0;

        }
        public Estudiante(String id, String name, String lastName, String program, float nota){
            this.id = id;
            this.name = name;
            this.lastName = lastName;
            this.program = program;
            this.nota = nota;
        }
        public String getId(){

            return this.id;
        }
        public String getName(){

            return this.name;
        }
        public String getLastName(){

            return this.lastName;
        }
        public String getProgram(){

            return this.program;
        }
        public float getNota(){
            return this.nota;
        }


        public void setId(String id){
            this.id = id;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }
        public void setProgram(String program){
            this.program = program;
        }
        public void setNota(float nota){
            this.nota  = nota;
        }

        public String tostring(){
            return this.id+","+this.name+","+this.lastName+","+this.program+","+this.nota;
        }


}