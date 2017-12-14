package si.dostavca.notifications;

import com.kumuluz.ee.discovery.annotations.RegisterService;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@RegisterService
@ApplicationPath("v1")
public class NotificationsApplication extends Application {
}
