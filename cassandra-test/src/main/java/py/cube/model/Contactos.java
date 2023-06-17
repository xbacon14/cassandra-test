package py.cube.model;

import java.time.Instant;
import java.util.UUID;

import com.datastax.oss.driver.api.mapper.annotations.Entity;
import com.datastax.oss.driver.api.mapper.annotations.PartitionKey;

@Entity
public class Contactos {
    @PartitionKey
    private UUID contactoid;
    private String contactonombre;
    private String contactotelefono;
    private Instant createdat;

    public UUID getContactoid() {
        return contactoid;
    }

    public void setContactoid(UUID contactoid) {
        this.contactoid = contactoid;
    }

    public String getContactonombre() {
        return contactonombre;
    }

    public void setContactonombre(String contactonombre) {
        this.contactonombre = contactonombre;
    }

    public String getContactotelefono() {
        return contactotelefono;
    }

    public void setContactotelefono(String contactotelefono) {
        this.contactotelefono = contactotelefono;
    }

    public Instant getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Instant createdat) {
        this.createdat = createdat;
    }

    public Contactos(UUID contactoid, String contactonombre, String contactotelefono, Instant createdat) {
        this.contactoid = contactoid;
        this.contactonombre = contactonombre;
        this.contactotelefono = contactotelefono;
        this.createdat = createdat;
    }

    public Contactos() {
    }

    public Contactos(UUID contactoid, String contactonombre, String contactotelefono) {
        this.contactoid = contactoid;
        this.contactonombre = contactonombre;
        this.contactotelefono = contactotelefono;
    }

}
