package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class GestorServicios {

    // Crear la instacias y ordenarlas
    public ServicioTuristico[] crearServicios() {
        // Rutas gastronomicas
        RutaGastronomica ruta1 = new RutaGastronomica("Comida hecha en casa", 4, 5);
        RutaGastronomica ruta2 = new RutaGastronomica("Comida en el parque", 3, 3);
        // Paseos Laustres
        PaseoLacustre paseo1 = new PaseoLacustre("viaje al sur", 2, "barco 1");
        PaseoLacustre paseo2 = new PaseoLacustre("viaje al norte", 5, "barco 2");
        // Excursiones
        ExcursionCultural excursion1 = new ExcursionCultural("Salida a la esquina", 3, "Casona");
        ExcursionCultural excursion2 = new ExcursionCultural("salida a la nada", 4, "tren");

        // Agrupar los datos en un Array
        return new ServicioTuristico[]{
                ruta1, ruta2,
                paseo1, paseo2,
                excursion1, excursion2
        };
    }
}