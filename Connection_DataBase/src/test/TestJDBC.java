package test;

import entidades.Alumno;
import entidades.Materia;
import jdbc.AlumnoJDBC;
import jdbc.MateriaJDBC;

public class TestJDBC {
    
    public static void main(String args[]) {
        TestJDBC test = new TestJDBC();
        
        test.crearTablaMateria();
        test.guardarMaterias();
        test.buscarMateriaPorCodigo();
        test.buscarMateriaPorNombre();
        
        test.crearTablaAlumno();
        test.guardarAlumnos();
        test.buscarAlumno();
    }
    
    public void crearTablaMateria() {
        MateriaJDBC materiaJDBC = new MateriaJDBC();
        materiaJDBC.crearTabla();
    }
    
    public void crearTablaAlumno() {
        AlumnoJDBC alumnoJDBC = new AlumnoJDBC();
        alumnoJDBC.crearTabla();
    }
    
    public void guardarMaterias() {
        MateriaJDBC materiaJDBC = new MateriaJDBC();
        
        Materia mat1 = new Materia();
        mat1.setCodigo(1);
        mat1.setNombre("Introducción a los Algoritmos");
        mat1.setCuatrimestre("1");
        
        Materia mat2 = new Materia();
        mat2.setCodigo(2);
        mat2.setNombre("Programación Orientada a Objetos");
        mat2.setCuatrimestre("2");
        
        Materia mat3 = new Materia();
        mat3.setCodigo(3);
        mat3.setNombre("Paradigmas de Programación");
        mat3.setCuatrimestre("2");
        
        materiaJDBC.guardarMateria(mat1);
        materiaJDBC.guardarMateria(mat2);
        materiaJDBC.guardarMateria(mat3);
    }
    
    public void guardarAlumnos() {
        AlumnoJDBC alumnoJDBC = new AlumnoJDBC();
        MateriaJDBC materiaJDBC = new MateriaJDBC();
        
        Materia materia1 = materiaJDBC.buscarMateriaPorCodigo(3);
        
        Alumno alumno1 = new Alumno();
        alumno1.setLegajo(1);
        alumno1.setApellido("de las Heras");
        alumno1.setMateria(materia1);
        alumnoJDBC.guardarAlumno(alumno1);
        
        
        Materia materia2 = materiaJDBC.buscarMateriaPorNombre("Programación Orientada a Objetos");
        
        Alumno alumno2 = new Alumno();
        alumno2.setLegajo(2);
        alumno2.setApellido("Pérez");
        alumno2.setMateria(materia2);
        alumnoJDBC.guardarAlumno(alumno2);
        
        Alumno alumno3 = new Alumno();
        alumno3.setLegajo(3);
        alumno3.setApellido("López");
        alumno3.setMateria(materia2);
        alumnoJDBC.guardarAlumno(alumno3);
        
        Materia materia3 = materiaJDBC.buscarMateriaPorNombre("Paradigmas de Programación");
        
        Alumno alumno4 = new Alumno();
        alumno4.setLegajo(4);
        alumno4.setApellido("Flores");
        alumno4.setMateria(materia3);
        alumnoJDBC.guardarAlumno(alumno4);
    }
    
    public void buscarMateriaPorCodigo() {
        MateriaJDBC materiaJDBC = new MateriaJDBC();
        Materia materia = materiaJDBC.buscarMateriaPorCodigo(1);
        if (materia != null) {
            System.out.println("Resultado de la búsqueda de materia: " + materia.toString());
        }
        else {
            System.out.println("No se encontraron resultados para la búsqueda");
        }
    }
    
    public void buscarMateriaPorNombre() {
        MateriaJDBC materiaJDBC = new MateriaJDBC();
        Materia materia = materiaJDBC.buscarMateriaPorNombre("Programación Orientada a Objetos");
        if (materia != null) {
            System.out.println("Resultado de la búsqueda de materia: " + materia.toString());
        }
        else {
            System.out.println("No se encontraron resultados para la búsqueda");
        }
    }
    
    public void buscarAlumno() {
        AlumnoJDBC alumnoJDBC = new AlumnoJDBC();
        Alumno alumno = alumnoJDBC.buscarAlumnoPorApellido("de las Heras");
        if (alumno != null) {
            System.out.println("Resultado de la búsqueda de alumno: " + alumno.toString());
        }
        else {
            System.out.println("No se encontraron resultados para la búsqueda");
        }
    }

}