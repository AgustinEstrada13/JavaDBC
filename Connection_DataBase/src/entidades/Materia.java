package entidades;

public class Materia {

    private int codigo;
    private String nombre;
    private String cuatrimestre;
    
    public int getCodigo() {
        return codigo;
    }
	
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
	
    public String getNombre() {
        return nombre;
    }
	
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	
    public String getCuatrimestre() {
        return cuatrimestre;
    }
	
    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }
	
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nMateria");
        sb.append("\n");
        sb.append(" -Código: ");
        sb.append(codigo);
        sb.append("\n");
        sb.append(" -Nombre: ");
        sb.append(nombre);
        sb.append("\n");
        sb.append(" -Cuatrimestre: ");
        sb.append(cuatrimestre);
        return sb.toString();
    }
	
}