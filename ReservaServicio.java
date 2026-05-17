public class ReservaServicio {

    public static boolean validarTiempoRespuesta(int tiempoMs) {
        return tiempoMs <= 5000;
    }

    public static boolean procesarRespuesta(boolean apiOk) {
        return apiOk;
    }

    // 🔹 Método main (OBLIGATORIO para ejecutar)
    public static void main(String[] args) {

        int tiempo1 = 3000;
        int tiempo2 = 5000;
        int tiempo3 = 6000;

        System.out.println("Tiempo 3000 ms: " + validarTiempoRespuesta(tiempo1));
        System.out.println("Tiempo 5000 ms: " + validarTiempoRespuesta(tiempo2));
        System.out.println("Tiempo 6000 ms: " + validarTiempoRespuesta(tiempo3));

        boolean apiCorrecta = true;
        boolean apiFalla = false;

        System.out.println("API correcta: " + procesarRespuesta(apiCorrecta));
        System.out.println("API falla: " + procesarRespuesta(apiFalla));
    }
}