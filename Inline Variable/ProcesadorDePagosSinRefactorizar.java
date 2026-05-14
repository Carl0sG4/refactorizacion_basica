public class ProcesadorDePagosSinRefactorizar {
    public double aplicarImpuesto(double precioBase) {
        double tasaImpuesto = 1.21;
        double precioFinal = precioBase * tasaImpuesto;
        return precioFinal;
    }

    public boolean superaElLimite(double totalGastado, double limiteCuenta) {

        boolean excedido = totalGastado > limiteCuenta;
        return excedido;
    }
}