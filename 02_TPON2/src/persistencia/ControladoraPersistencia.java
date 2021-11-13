package persistencia;

import logica.Mascota;

public class ControladoraPersistencia {

    MascotaJpaController masJPA = new MascotaJpaController();

    //Alta
    public void altaMascota(Mascota masco) {
        masJPA.create(masco);
    }

}
