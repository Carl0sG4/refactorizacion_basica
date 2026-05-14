/**
 * CLASE REFACTORIZADA: Aplicación del patrón Rename Variable.
 * 
 * El objetivo de esta refactorización es eliminar la dificultad de descifrar
 * variables de una sola letra, sustituyéndolas por nombres que revelen su intención.
 */
public class CalculadoraTiemposDeViajeRefactorizado {

    /**
     * Se ha aplicado Rename Variable en la firma y el cuerpo del método:
     * 
     * 1. 'd' -> 'distanciaEntreVehiculos': Define la situación de la distancia inicial.
     * 2. 'v1' y 'v2' -> 'velocidadVehiculoX': Aclara que el dato es una magnitud de velocidad.
     * 3. 'vt' -> 'velocidadTotal': Explica con claridad su propósito.
     * 4. 't' -> 'tiempoHastaEncuentro': Indica exactamente qué resultado devuelve el cálculo.
     * 
     * @param distanciaEntreVehiculos Nombre descriptivo para la antigua variable 'd'.
     * @param velocidadVehiculo1      Nombre descriptivo para la antigua variable 'v1'.
     * @param velocidadVehiculo2      Nombre descriptivo para la antigua variable 'v2'.
     * @return El resultado almacenado anteriormente en 't', ahora con nombre auto-explicativo.
     */
    public double calcularTiempoEncuentro(double distanciaEntreVehiculos, double velocidadVehiculo1,
            double velocidadVehiculo2) {

        // Se renombra 'vt' para que el desarrollador entienda la lógica de la suma de inmediato.
        double velocidadTotal = velocidadVehiculo1 + velocidadVehiculo2;

        if (velocidadTotal == 0) {
            return -1;
        }

        // Se renombra 't' para evitar ambigüedades sobre qué tiempo se está calculando.
        double tiempoHastaEncuentro = distanciaEntreVehiculos / velocidadTotal;

        return tiempoHastaEncuentro;
    }
}