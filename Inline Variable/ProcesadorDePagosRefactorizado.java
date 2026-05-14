/**
 * CLASE REFACTORIZADA: Aplicación del patrón Inline Variable.
 * 
 * El objetivo es limpiar el código eliminando variables temporales innecesarias 
 * que no aportan claridad y solo sirven para almacenar un valor antes de devolverlo.
 */
public class ProcesadorDePagosRefactorizado {

    /**
     * Se ha aplicado Inline Variable:
     * 
     * 1. Se eliminaron 'tasaImpuesto' y 'precioFinal' para devolver el cálculo en una sola línea.
     * 
     * @param precioBase El importe original antes de impuestos.
     * @return El resultado de la operación directamente.
     */
    public double aplicarImpuesto(double precioBase) {
        return precioBase * 1.21;
    }

    /**
     * Se ha aplicado Inline Variable:
     * 
     * 1. Se eliminó la variable 'excedido' ya que la comparación lógica se entiende perfectamente en el return.
     * 
     * @param totalGastado Cantidad total consumida.
     * @param limiteCuenta Límite máximo de la cuenta.
     * @return El resultado de la comparación de forma directa.
     */
    public boolean superaElLimite(double totalGastado, double limiteCuenta) {
        return totalGastado > limiteCuenta;
    }
}