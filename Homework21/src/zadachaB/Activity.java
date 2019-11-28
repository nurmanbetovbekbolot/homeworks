package zadachaB;

public class Activity {
    String type;
    double duration;
    boolean hasPayment;

    public Activity(String type, double duration, boolean hasPayment) {
        this.type = type;
        this.duration = duration;
        this.hasPayment = hasPayment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public boolean isHasPayment() {
        return hasPayment;
    }

    public void setHasPayment(boolean hasPayment) {
        this.hasPayment = hasPayment;
    }
}
