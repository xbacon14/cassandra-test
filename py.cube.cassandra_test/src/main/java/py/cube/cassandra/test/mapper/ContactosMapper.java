package py.cube.cassandra.test.mapper;

import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;

import py.cube.cassandra.test.dao.ContactosDao;

@Mapper
public interface ContactosMapper {
    @DaoFactory
    ContactosDao contactosDao();
}
