package bean;

import java.util.Date;
import java.util.UUID;

public class TodoListItem {
    private String uuid;
    private Date start_time;
    private Date end_time;
    private String description;

    public TodoListItem(Date start_time, Date end_time, String description) {
        this.uuid = UUID.randomUUID().toString();
        this.start_time = start_time;
        this.end_time = end_time;
        this.description = description;
    }

    public String getUuid() {
        return uuid;
    }


    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        return ((TodoListItem) obj).getUuid().equals(uuid)
                && ((TodoListItem) obj).getStart_time().equals(start_time)
                && ((TodoListItem) obj).getEnd_time().equals(end_time)
                && ((TodoListItem) obj).getDescription().equals(description);
    }

    @Override
    public String toString() {
        return "TodoListItem | " +
                "uuid='" + uuid + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", description='" + description + '\'' ;
    }
}
