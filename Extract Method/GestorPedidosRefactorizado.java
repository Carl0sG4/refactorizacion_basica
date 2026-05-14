import java.util.List;

/**
 * Clase encargada de gestionar el flujo completo de un pedido,
 * incluyendo su validación, cálculo de costes y notificaciones al cliente.
 */
public class GestorPedidosRefactorizado {

    /**
     * Método principal que orquesta el procesamiento del pedido.
     * Valida los productos, calcula el importe, aplica descuentos si corresponde,
     * muestra un resumen por pantalla y notifica al cliente por correo electrónico.
     *
     * @param nombreCliente  El nombre del cliente que realiza el pedido.
     * @param precios        Lista con los precios de los productos incluidos en el
     *                       pedido.
     * @param clientePremium Indica si el cliente tiene una cuenta premium para
     *                       aplicar descuentos.
     */
    public void procesarYEnviarPedido(String nombreCliente, List<Double> precios, boolean clientePremium) {

        if (!esPedidoValido(precios)) {
            return;
        }

        double total = calcularTotal(precios);

        // Aplicar descuento premium
        if (clientePremium) {
            total = descuentoPremiun(total);
        }

        imprimirResumen(nombreCliente, total);

        enviarCorreo(nombreCliente);
    }

    // --- Métodos Extraídos Privados (Buena práctica, encapsular métodos que solo
    // utiliza esta clase) ---

    /**
     * Verifica que el pedido contenga productos válidos para ser procesado.
     *
     * @param precios Lista de precios a evaluar.
     * @return true si la lista contiene elementos válidos, false si es nula o está
     *         vacía.
     */
    private boolean esPedidoValido(List<Double> precios) {
        // Validar pedido
        if (precios == null || precios.isEmpty()) {
            System.out.println("Error: El pedido no tiene productos.");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Calcula el importe total sumando el precio de todos los artículos de la
     * lista.
     *
     * @param precios Lista de precios de los productos.
     * @return La suma total de los precios.
     */
    private double calcularTotal(List<Double> precios) {
        // Calcular total
        double total = 0;
        for (Double precio : precios) {
            total += precio;
        }
        return total;
    }

    /**
     * Aplica un descuento del 10% al importe total para los clientes con
     * suscripción premium.
     *
     * @param total El importe total antes de aplicar el descuento.
     * @return El importe total final con el descuento ya aplicado.
     */
    private double descuentoPremiun(double total) {
        return total = total * 0.90;
    }

    /**
     * Imprime por consola el resumen detallado de la compra.
     *
     * @param nombre El nombre del cliente al que pertenece el pedido.
     * @param total  El importe final a pagar.
     */
    private void imprimirResumen(String nombre, double total) {
        // Imprimir resumen
        System.out.println("Resumen del pedido para: " + nombre);
        System.out.println("Total a pagar: $" + total);
    }

    /**
     * Simula el envío de un correo electrónico de confirmación de pedido al
     * cliente.
     *
     * @param nombre El nombre del cliente que se utilizará para construir su
     *               dirección de correo.
     */
    private void enviarCorreo(String nombre) {
        // Enviar correo de confirmación
        System.out.println("Conectando al servidor SMTP...");
        System.out.println("Enviando email a " + nombre + "@email.com");
        System.out.println("Correo enviado con éxito.");
    }
}