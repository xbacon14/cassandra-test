package py.cube.mapper;

import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;

import py.cube.dao.ContactosDao;


@Mapper
public interface ContactosMapper {
    @DaoFactory
    ContactosDao contactosDao();
}
