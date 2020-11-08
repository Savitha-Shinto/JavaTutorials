package oops;


class SainsburysHeadOffice{
    String headOfficeLocation;
    public String getHeadOfficeLocation() {
        return headOfficeLocation;
    }

    public void setHeadOfficeLocation(String headOfficeLocation) {
        this.headOfficeLocation = headOfficeLocation;
    }

    public void getEmployeeCount(){
        System.out.println("Total Number of Sainsbury's employees are 25000");
    }

}
class Sainsburys extends SainsburysHeadOffice{
    String location;
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void getEmployeeCount(String Location){
        System.out.println("Total Number of employees in "+ Location + " Sainsbury's is 20");
    }

    public int getEmployeeCount( boolean is24_7Shop){
        String YesNo = is24_7Shop ? "Yes " : "No ";
        String Not = is24_7Shop ? "" : "not ";
        System.out.println( YesNo + getLocation() + " Sainsbury's is " + Not + "a 24/7 shop ");

        if(is24_7Shop == true) {
            return 20;
        } else {
            return 10;
        }

    }

}

public class OverloadingExamples {
    public static void main(String args[]){
        Sainsburys fleet = new Sainsburys();
        fleet.setLocation("Fleet");
        fleet.setHeadOfficeLocation("London");
        fleet.getEmployeeCount();
        fleet.getEmployeeCount("Fleet");
        System.out.println("--------------------------------------------------");
        System.out.println( fleet.getLocation() + " Employee Count is " + fleet.getEmployeeCount(true));
        System.out.println("--------------------------------------------------");
        System.out.println( fleet.getLocation() + " Employee Count is " + fleet.getEmployeeCount(false));
        System.out.println("--------------------------------------------------");

    }
}