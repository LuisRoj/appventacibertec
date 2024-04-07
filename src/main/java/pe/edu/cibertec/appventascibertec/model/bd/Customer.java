package pe.edu.cibertec.appventascibertec.model.bd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    private String customerid;
    /* @Column es para especificar el nombre del atributo de la base de datos. Si tiene el mismo nombre la variable y el atributo en la base de datos no hace falta agregarlo*/
    @Column(name="companyname")
    private String companyname;
    private String contactname;
    private String contacttitle;
    private String address;
    private String city;
    private String region;
    private String postalcode;
    private String country;
    private String phone;
    private String fax;
}
