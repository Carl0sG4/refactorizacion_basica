import java.util.List;

public class GestorPedidosSinRefactorizar {
    public void procesarYEnviarPedido(String nombreCliente,
            List<Double> precios, boolean clientePremium) {

        // Validar pedido
        if (precios == null || precios.isEmpty()) {
            System.out.println("Error: El pedido no tiene productos.");
            return;
        }
        // Calcular total
        double total = 0;
        for (Double precio : precios) {
            total += precio;
        }
        // Aplicar descuento premium
        if (clientePremium) {
            total = total * 0.90;
        }
        // Imprimir resumen
        System.out.println("Resumen del pedido para: " +

                nombreCliente);

        System.out.println("Total a pagar: $" + total);
        // Enviar correo de confirmación

        System.out.println("Conectando al servidor SMTP...");
        System.out.println("Enviando email a " + nombreCliente +

                "@email.com");

        System.out.println("Correo enviado con éxito.");
    }
}