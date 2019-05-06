package design;

public abstract class AbstractOOP implements Employee {
    public final String owner = "Md Showkat";
    static String addressHeadOffice = "89-25, 172nd st, NY, 11432";

    public void describeCompany() {
        System.out.println(owner + " is the owner of the company located at : " + addressHeadOffice + ".");
    }

    public abstract void describeCompany(String Mission);

}
