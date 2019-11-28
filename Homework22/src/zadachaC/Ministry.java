package zadachaC;

public class Ministry {
    String budget;
    int amountofworkers;
    String address;
    String headofministry;
    String[] activities;

    public Ministry(String budget, int amountofworkers, String address, String headofministry, String[] activities) {
        this.budget = budget;
        this.amountofworkers = amountofworkers;
        this.address = address;
        this.headofministry = headofministry;
        this.activities = activities;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public int getAmountofworkers() {
        return amountofworkers;
    }

    public void setAmountofworkers(int amountofworkers) {
        this.amountofworkers = amountofworkers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHeadofministry() {
        return headofministry;
    }

    public void setHeadofministry(String headofministry) {
        this.headofministry = headofministry;
    }

    public String[] getActivities() {
        return activities;
    }

    public void setActivities(String[] activities) {
        this.activities = activities;
    }
}