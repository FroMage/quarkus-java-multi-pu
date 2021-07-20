package ac.me.entity;


import javax.enterprise.context.RequestScoped;

import io.quarkus.hibernate.orm.PersistenceUnit;
import io.quarkus.hibernate.orm.runtime.tenant.TenantResolver;

@PersistenceUnit("admin") 
@RequestScoped 
public class AdminTenantResolver implements TenantResolver {

    @Override
    public String getDefaultTenantId() {
        return "admin";
    }

    @Override
    public String resolveTenantId() {
        // resolve to default tenant config
        return getDefaultTenantId();
    }

}