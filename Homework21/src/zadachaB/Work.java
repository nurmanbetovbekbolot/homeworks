package zadachaB;

import java.util.Arrays;

public class Work extends Activity {
    String title;
    boolean requiresDegree;
    boolean hasLunchTime;
    String responsibilities;
    String position;


    public Work(String type, double duration, boolean hasPayment, String title, boolean requiresDegree, boolean hasLunchTime, String responsibilities, String position) {
        super(type, duration, hasPayment);
        this.title = title;
        this.requiresDegree = requiresDegree;
        this.hasLunchTime = hasLunchTime;
        this.responsibilities = responsibilities;
        this.position = position;
    }

    @Override
    public String toString() {
        return title;
    }

    public boolean isRequiresDegree() {
        return requiresDegree;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRequiresDegree(boolean requiresDegree) {
        this.requiresDegree = requiresDegree;
    }

    public boolean isHasLunchTime() {
        return hasLunchTime;
    }

    public void setHasLunchTime(boolean hasLunchTime) {
        this.hasLunchTime = hasLunchTime;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
