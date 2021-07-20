package ac.me.entity;


import javax.enterprise.context.RequestScoped;

import io.quarkus.hibernate.orm.PersistenceUnit;
import io.quarkus.hibernate.orm.runtime.tenant.TenantResolver;

@PersistenceUnit("cust") 
@RequestScoped 
public class CustTenantResolver implements TenantResolver {

    @Override
    public String getDefaultTenantId() {
        return "cust";
    }

    @Override
    public String resolveTenantId() {
        // resolve to default tenant config
        return getDefaultTenantId();
    }

}