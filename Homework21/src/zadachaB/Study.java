package zadachaB;

public class Study extends Activity {
    String form;
    String title;
    int numberofTeachers;
    int numberofStudents;

    public Study(String type, double duration, boolean hasPayment) {
        super(type, duration, hasPayment);
    }

    public Study(String type, double duration, boolean hasPayment, String form, String title, int numberofTeachers, int numberofStudents) {
        super(type, duration, hasPayment);
        this.form = form;
        this.title = title;
        this.numberofTeachers = numberofTeachers;
        this.numberofStudents = numberofStudents;
    }

    @Override
    public String toString() {
        return  title;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberofTeachers() {
        return numberofTeachers;
    }

    public void setNumberofTeachers(int numberofTeachers) {
        this.numberofTeachers = numberofTeachers;
    }

    public int getNumberofStudents() {
        return numberofStudents;
    }

    public void setNumberofStudents(int numberofStudents) {
        this.numberofStudents = numberofStudents;
    }
}
