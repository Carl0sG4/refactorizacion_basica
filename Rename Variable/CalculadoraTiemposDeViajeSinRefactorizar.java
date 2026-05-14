public class CalculadoraTiemposDeViajeSinRefactorizar {
    // Calcula el tiempo en que dos vehículos en sentido contrario se encontrarán

    public double calcularT(double d, double v1, double v2) {
        double vt = v1 + v2;
        if (vt == 0) {
            return -1;
        }
        double t = d / vt;
        return t;
    }
}