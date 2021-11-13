package logica;

import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersi = new ControladoraPersistencia();

    //Alta
    public void altaMascota(String nombrePerro, String raza, String color, String alergico, String atEspecial, String nombreDuenio, String celDuenio, String observaciones) {
        Mascota masco = new Mascota();
        masco.setNombre_perro(nombrePerro);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtención_especial(atEspecial);
        masco.setNombre_duenio(nombreDuenio);
        masco.setCelular_duenio(celDuenio);
        masco.setObservaciones(observaciones);

        controlPersi.altaMascota(masco);
    }

    public void altaMascota(Mascota masco) {
        controlPersi.altaMascota(masco);
    }

}
