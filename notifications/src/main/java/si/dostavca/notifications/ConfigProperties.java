package si.dostavca.notifications;

import com.kumuluz.ee.configuration.cdi.ConfigBundle;
import com.kumuluz.ee.configuration.cdi.ConfigValue;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@ConfigBundle("maintenance")
public class ConfigProperties {

    // Url in etcd
    // /environments/dev/services/dostavca-notifications/1.0.0/config/maintenance/value

    @ConfigValue(watch = true)
    private String value;

    public boolean UndergoingMaintenance() {
        return value.equals("true");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
