public class teststudent {
    public static void main(String[] args) {
        student student = new student("ST-101", "Maria Gomez", 4.0, 3.5, 4.5);

        System.out.println("INFORMACION DEL ESTUDIANTE ");
        System.out.println("ID: " + student.getStudentId());
        System.out.println("Nombre: " + student.getName());
        System.out.println("Notas: " + student.getGrade1() + ", " + student.getGrade2() + ", " + student.getGrade3());
        System.out.printf("Promedio Inicial: %.2f%n%n", student.getAverage());

        System.out.println("MODIFICACION DE NOMBRE");
        boolean nameSuccess = student.setName("Juan José Betancur");
        System.out.println("Cambiar nombre a 'Juan Betancur': " + (nameSuccess ? "ACEPTADO" : "RECHAZADO"));
        
        nameSuccess = student.setName("   ");
        System.out.println("Cambiar nombre a vacio: " + (nameSuccess ? "ACEPTADO" : "RECHAZADO"));
        System.out.println("Nombre actual: " + student.getName() + "\n");

        System.out.println("MODIFICACION DE CALIFICACIONES");
        
        boolean gradeSuccess = student.setGrade2(5.0);
        System.out.println("Cambiar Nota 2 a 5.0: " + (gradeSuccess ? "ACEPTADO" : "RECHAZADO"));

        gradeSuccess = student.setGrade1(5.5); 
        System.out.println("Cambiar Nota 1 a 5.5: " + (gradeSuccess ? "ACEPTADO" : "RECHAZADO"));

        gradeSuccess = student.setGrade3(-1.0); 
        System.out.println("Cambiar Nota 3 a -1.0: " + (gradeSuccess ? "ACEPTADO" : "RECHAZADO"));

        // Comprobación final de notas y recálculo del promedio
        System.out.println("ESTADO Y PROMEDIO ");
        System.out.println("Notas finales: " + student.getGrade1() + ", " + student.getGrade2() + ", " + student.getGrade3());
        System.out.printf("Promedio Final: %.2f%n", student.getAverage());
    }
}