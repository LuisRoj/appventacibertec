package pe.edu.cibertec.appventascibertec.model.bd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class Category {
    private Integer categoryid;
    @Column(name = "categoryname")
    private String categoryname;
    @Column(name = "description")
    private String description;

}
