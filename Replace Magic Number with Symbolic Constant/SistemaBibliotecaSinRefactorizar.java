public class SistemaBibliotecaSinRefactorizar {
    public double calcularMulta(int diasRetraso, boolean esLibroRaro) {

        double multa = 0;
        if (diasRetraso > 3) {
            multa = (diasRetraso - 3) * 0.50;
        }

        if (esLibroRaro && multa > 50.0) {
            multa = 50.0;
        }
        return multa;
    }
}