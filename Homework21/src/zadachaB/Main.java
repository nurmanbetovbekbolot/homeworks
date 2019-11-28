package zadachaB;

public class Main {
    public static void main(String[] args) {
        Bekbolot bekbolot = new Bekbolot("23/01/1973","Talas","Nurmanbetov","Bekbolot","m",12);
        Work work1=new Work("full time",7,true,"Family Land",true,false,"teaching","headtrainer");
        Work work2=new Work("part time",2,true,"Son Kol",false,false,"service","waiter");
        Work[] works={work1,work2};
        Study study1 = new Study("public",9,true,"daily","School #21",14,300);
        Study study2 = new Study("private",9,true,"daily","IT-Academy",4,150);
        Study[] studies={study1,study2};
        bekbolot.setWorks(works);
        bekbolot.setStudies(studies);
        System.out.println(bekbolot);
    }
}
