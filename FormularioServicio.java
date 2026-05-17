public class FormularioServicio {

    public static boolean validarFormulario(String nombre) {
        if (nombre == null) return false;
        return nombre.length() > 0 && nombre.length() <= 50;
    }

    // Método main para pruebas
    public static void main(String[] args) {

        String caso1 = "Robert";           // válido
        String caso2 = "";                 // inválido (vacío)
        String caso3 = null;               // inválido (null)
        String caso4 = "a".repeat(50);     // válido (límite)
        String caso5 = "a".repeat(51);     // inválido (excede)

        System.out.println("Caso 1 (válido): " + validarFormulario(caso1));
        System.out.println("Caso 2 (vacío): " + validarFormulario(caso2));
        System.out.println("Caso 3 (null): " + validarFormulario(caso3));
        System.out.println("Caso 4 (50 caracteres): " + validarFormulario(caso4));
        System.out.println("Caso 5 (51 caracteres): " + validarFormulario(caso5));
    }
}