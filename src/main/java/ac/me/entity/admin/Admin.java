package ac.me.entity.admin;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Admin extends PanacheEntity {
    public String name;
}