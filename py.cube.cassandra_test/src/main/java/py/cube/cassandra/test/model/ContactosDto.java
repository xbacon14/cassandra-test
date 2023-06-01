package py.cube.cassandra.test.model;

public class ContactosDto {
    private String contactoid;
    private String contactonombre;
    private String contactotelefono;

    public String getContactoid() {
        return contactoid;
    }

    public void setContactoid(String contactoid) {
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

    public ContactosDto(String contactoid, String contactonombre, String contactotelefono) {
        this.contactoid = contactoid;
        this.contactonombre = contactonombre;
        this.contactotelefono = contactotelefono;
    }

    public ContactosDto() {
    }

}
