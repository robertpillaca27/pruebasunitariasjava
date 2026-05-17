public class EcommerceServicio {

    public static boolean validarDescuento(int descuento) {
        return descuento >= 0 && descuento <= 100;
    }

    public static boolean procesarPago(boolean tarjetaValida, boolean fondos) {
        return tarjetaValida && fondos;
    }

    // 🔹 Método main para pruebas
    public static void main(String[] args) {

        // ✅ Pruebas de descuentos (BVA)
        int d1 = -1;
        int d2 = 0;
        int d3 = 50;
        int d4 = 100;
        int d5 = 101;

        System.out.println("Descuento -1%: " + validarDescuento(d1));
        System.out.println("Descuento 0%: " + validarDescuento(d2));
        System.out.println("Descuento 50%: " + validarDescuento(d3));
        System.out.println("Descuento 100%: " + validarDescuento(d4));
        System.out.println("Descuento 101%: " + validarDescuento(d5));

        // ✅ Pruebas de pago (EP)
        boolean tarjetaValida = true;
        boolean tarjetaInvalida = false;
        boolean conFondos = true;
        boolean sinFondos = false;

        System.out.println("Pago válido: " + procesarPago(tarjetaValida, conFondos));
        System.out.println("Tarjeta inválida: " + procesarPago(tarjetaInvalida, conFondos));
        System.out.println("Sin fondos: " + procesarPago(tarjetaValida, sinFondos));
    }
}