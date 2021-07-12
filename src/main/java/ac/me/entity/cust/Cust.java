package ac.me.entity.cust;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Cust extends PanacheEntity {
    String name = "";
}
