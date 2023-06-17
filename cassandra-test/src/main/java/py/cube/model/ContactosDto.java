package py.cube.model;

import java.util.UUID;

public class ContactosDto {
    private UUID contactoid;
    private String contactonombre;
    private String contactotelefono;

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

    public ContactosDto(UUID contactoid, String contactonombre, String contactotelefono) {
        this.contactoid = contactoid;
        this.contactonombre = contactonombre;
        this.contactotelefono = contactotelefono;
    }

    public ContactosDto() {
    }

}
