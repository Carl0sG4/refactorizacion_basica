/**
 * CLASE REFACTORIZADA: Aplicación del patrón Replace Magic Number with Symbolic Constant.
 * 
 * El objetivo de esta refactorización es eliminar el uso de valores numéricos literales 
 * dentro de la lógica, sustituyéndolos por constantes con nombres descriptivos. 
 * 
 * Esto mejora la legibilidad y permite cambiar reglas de negocio (como el coste de la multa) 
 * en un solo lugar sin riesgo de errores por repetición.
 */
public class SistemaBibliotecaRefactorizado {

    // --- Constantes Simbólicas ---
    // Se definen como 'static final' para que sean inmutables(son fijas) y utilizables en todo el código.
    
    public static final int MAX_DIAS_SIN_MULTA = 3;
    public static final double TASA_MULTA_POR_DIA = 0.50;
    public static final double LIMITE_MULTA_LIBRO_RARO = 50.0;

    /**
     * Se ha aplicado Replace Magic Number sustituyendo los valores fijos por constantes:
     * 
     * 1. '3' -> MAX_DIAS_SIN_MULTA: Clarifica cuántos días tiene el usuario antes de pagar.
     * 2. '0.50' -> TASA_MULTA_POR_DIA: Define el precio económico de la penalización diaria.
     * 3. '50.0' -> LIMITE_MULTA_LIBRO_RARO: Establece el tope máximo de cobro para casos especiales.
     * 
     * @param diasRetraso Cantidad de días que el usuario ha tardado en devolver el libro.
     * @param esLibroRaro Indica si el ejemplar es de colección o difícil de reponer.
     * @return El importe total de la multa calculada basándose en las constantes del sistema.
     */
    public double calcularMulta(int diasRetraso, boolean esLibroRaro) {

        double multa = 0;

        // Se utiliza la constante en lugar del número '3'
        if (diasRetraso > MAX_DIAS_SIN_MULTA) {
            // Se calcula la multa usando los días efectivos de retraso y la tasa definida
            multa = (diasRetraso - MAX_DIAS_SIN_MULTA) * TASA_MULTA_POR_DIA;
        }

        // Se aplica el límite máximo de multa para libros raros usando la constante
        if (esLibroRaro && multa > LIMITE_MULTA_LIBRO_RARO) {
            multa = LIMITE_MULTA_LIBRO_RARO;
        }

        return multa;
    }
}