package py.cube.cassandra.test.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import py.cube.cassandra.test.dao.ContactosDao;
import py.cube.cassandra.test.model.Contactos;

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
