package si.dostavca.notifications;

import com.kumuluz.ee.logs.cdi.Log;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Log
@Path("notifications")
@RequestScoped
public class NotificationsResource {
}
