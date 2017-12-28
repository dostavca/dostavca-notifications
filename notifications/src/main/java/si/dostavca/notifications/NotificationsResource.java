package si.dostavca.notifications;

import com.kumuluz.ee.logs.cdi.Log;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Log
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("notifications")
@RequestScoped
public class NotificationsResource {

    // Implement Twilio adapter for mobile notifications

    @Inject
    NotificationHolder notificationHolder;

    @Inject
    ConfigProperties configProperties;

    @GET
    @Path("all")
    public Response getNotifications() {
        if(configProperties.UndergoingMaintenance()) {
            return Response.ok("{\"message\": \"Notifications are currently under maintenance.\"}").build();
        } else {
            return Response.ok(notificationHolder.GetNotifications()).build();
        }
    }

    @POST
    @Path("add")
    public Response addNotification(Notification notification) {
        notificationHolder.AddNotification(notification);
        return Response.ok("{\"message\": \"Notification successfully added\",\"status\": 200}").build();
    }

}
