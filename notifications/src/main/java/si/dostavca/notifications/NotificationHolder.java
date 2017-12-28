package si.dostavca.notifications;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class NotificationHolder {

    private List<Notification> notifications = new ArrayList<>();

    public void AddNotification(Notification notification) {
        notifications.add(notification);
    }

    public List<Notification> GetNotifications() {
        return notifications;
    }

}
