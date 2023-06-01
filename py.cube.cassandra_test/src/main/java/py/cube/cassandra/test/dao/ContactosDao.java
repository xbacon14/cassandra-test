package py.cube.cassandra.test.dao;

import com.datastax.oss.driver.api.core.PagingIterable;
import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.Select;
import com.datastax.oss.driver.api.mapper.annotations.Update;

import py.cube.cassandra.test.model.Contactos;

@Dao
public interface ContactosDao {

    @Update
    void update(Contactos contactos);

    @Select
    PagingIterable<Contactos> findAll();
}