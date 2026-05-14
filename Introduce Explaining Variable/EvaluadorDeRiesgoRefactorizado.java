/**
 * CLASE REFACTORIZADA: Aplicación del patrón Introduce Explaining Variable.
 * 
 * El objetivo de esta refactorización es simplificar expresiones: condicionales 
 * complejas o difíciles de leer. Al asignar partes de la lógica a variables 
 * booleanas con nombres descriptivos, hacemos que el propósito de la validación 
 * sea evidente de inmediato.
 */
public class EvaluadorDeRiesgoRefactorizado {

    /**
     * Se ha aplicado Introduce Explaining Variable para descomponer la lógica de aprobación:
     * 
     * 1. 'tieneIngresosSuficientes': Captura la lógica del ahorro neto anual.
     * 2. 'tieneCreditoExcelente': Define el umbral de puntuación FICO más alto.
     * 3. 'tieneCreditoAceptableYEstabilidad': Combina el puntaje mínimo con la antigüedad laboral.
     * 4. 'cumplePerfilCrediticio': Agrupa los dos posibles escenarios de solvencia financiera.
     * 
     * @param ingresosAnuales      Suma total de ingresos del solicitante al año.
     * @param gastosAnuales        Suma total de gastos fijos y variables al año.
     * @param puntajeFICO          Indicador de historial crediticio (sistema FICO).
     * @param mesesEnEmpleoActual  Tiempo de permanencia en el trabajo actual.
     * @return true si el perfil cumple con los criterios de riesgo bajo, false en caso contrario.
     */
    public boolean aprobarHipoteca(double ingresosAnuales, double gastosAnuales, int puntajeFICO,
            int mesesEnEmpleoActual) {

        // Variables explicativas que dividen la expresión compleja original
        boolean tieneIngresosSuficientes = (ingresosAnuales - gastosAnuales > 30000);
        boolean tieneCreditoExcelente = (puntajeFICO >= 720);
        boolean tieneCreditoAceptableYEstabilidad = (puntajeFICO >= 680 && mesesEnEmpleoActual >= 24);

        // Combinamos las condiciones en una variable final de perfil
        boolean cumplePerfilCrediticio = tieneCreditoExcelente || tieneCreditoAceptableYEstabilidad;

        // El 'if' ahora es extremadamente fácil de leer y entender
        if (tieneIngresosSuficientes && cumplePerfilCrediticio) {
            System.out.println("Hipoteca pre-aprobada.");
            return true;
        } else {
            System.out.println("Riesgo demasiado alto.");
            return false;
        }
    }
}