package py.cube.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import py.cube.dao.ContactosDao;
import py.cube.model.Contactos;

@ApplicationScoped
public class ContactosService {
    @Inject
    ContactosDao contactosDao;

    public void save(Contactos contacto) {
        contactosDao.update(contacto);
    }

    public List<Contactos> getAll() {
        return contactosDao.findAll().all();
    }
}
