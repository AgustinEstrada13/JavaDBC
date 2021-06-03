package entidades;

public class Alumno {

    private int legajo;
    private String apellido;
    private Materia materia;

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
	
    public String getApellido() {
        return apellido;
    }
	
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
	
    public Materia getMateria() {
        return materia;
    }
	
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
        
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nAlumno");
        sb.append("\n");
        sb.append(" -Legajo: ");
        sb.append(legajo);
        sb.append("\n");
        sb.append(" -Apellido: ");
        sb.append(apellido);
        sb.append("\n");
        sb.append(" -Materia: ");
        sb.append(materia);
        return sb.toString();
    }

}