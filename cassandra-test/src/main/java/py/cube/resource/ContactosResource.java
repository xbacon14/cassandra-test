package py.cube.resource;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import py.cube.model.Contactos;
import py.cube.model.ContactosDto;
import py.cube.service.ContactosService;

@Path("/contacto")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContactosResource {

    @Inject
    ContactosService contactoService;

    @GET
    public List<ContactosDto> getAll() {
        return contactoService.getAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @POST
    public void add(ContactosDto dto) {
        contactoService.save(convertFromDto(dto));
    }

    private ContactosDto convertToDto(Contactos contacto) {
        return new ContactosDto(contacto.getContactoid(), contacto.getContactonombre(), contacto.getContactotelefono());
    }

    private Contactos convertFromDto(ContactosDto contactoDto) {
        return new Contactos(contactoDto.getContactoid(), contactoDto.getContactonombre(),
                contactoDto.getContactotelefono());
    }

}
