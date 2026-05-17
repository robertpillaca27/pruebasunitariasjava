public class PagoServicio {

    public static double calcularImpuesto(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("Monto inválido");
        }
        return monto * 0.18;
    }

    public static boolean validarMonto(double monto) {
        return monto >= 10 && monto <= 5000;
    }

    // Método main incluido en la misma clase
    public static void main(String[] args) {

        double monto1 = 100;
        double monto2 = 5;
        double monto3 = -50;

        // Validación de montos
        System.out.println("Validar monto 100: " + validarMonto(monto1));
        System.out.println("Validar monto 5: " + validarMonto(monto2));

        // Cálculo de impuesto (caso válido)
        double impuesto = calcularImpuesto(monto1);
        System.out.println("Impuesto de 100: " + impuesto);

        // Manejo de error (caso inválido)
        try {
            calcularImpuesto(monto3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al calcular impuesto: " + e.getMessage());
        }
    }
}