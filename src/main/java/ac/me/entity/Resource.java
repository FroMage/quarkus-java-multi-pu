package ac.me.entity;

import ac.me.entity.admin.Admin;
import ac.me.entity.cust.Cust;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/api")
public class Resource {

    @GET
    @Path("admin")
    @Transactional
    public List<Admin> findAllAdmin() {
        return Admin.listAll();
    }

    @GET
    @Path("cust")
    @Transactional
    public List<Cust> findAllCust() {
        return Cust.listAll();
    }
}
