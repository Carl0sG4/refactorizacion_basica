public class EvaluadorDeRiesgoSinRefactorizar {
    public boolean aprobarHipoteca(double ingresosAnuales, double gastosAnuales, int puntajeFICO,
            int mesesEnEmpleoActual) {
        if ((ingresosAnuales - gastosAnuales > 30000) &&

                (puntajeFICO >= 720 || (puntajeFICO >= 680 && mesesEnEmpleoActual >= 24))) {

            System.out.println("Hipoteca pre-aprobada.");
            return true;
        } else {
            System.out.println("Riesgo demasiado alto.");
            return false;
        }
    }
}