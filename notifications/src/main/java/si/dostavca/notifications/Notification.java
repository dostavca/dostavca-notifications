package si.dostavca.notifications;

import java.io.Serializable;

public class Notification implements Serializable {

    private String message;
    private int uid;
    private boolean received;

    public Notification() {
    }

    public Notification(String message, int uid, boolean received) {
        this.message = message;
        this.uid = uid;
        this.received = received;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public boolean isReceived() {
        return received;
    }

    public void setReceived(boolean received) {
        this.received = received;
    }
}
