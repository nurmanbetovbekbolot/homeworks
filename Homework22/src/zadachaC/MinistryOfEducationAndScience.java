package zadachaC;

public class MinistryOfEducationAndScience extends Ministry{
    String[] studyplans;
    String[] dateofexams;
    int amountOfExams;
    boolean schoolsWereVisited;

    public MinistryOfEducationAndScience(String budget, int amountofworkers, String address, String headofministry, String[] activities) {
        super(budget, amountofworkers, address, headofministry, activities);
    }


}
