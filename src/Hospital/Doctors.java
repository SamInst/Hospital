package Hospital;

public class Doctors {
    private int doctorId;
    private String doctorName;
    private long phoneNo;
    private String specialization;
    private String location;
    private float priceQuerry;

    public Doctors(int doctorId, String name, long phoneNo, String specialization, String location, float priceQuerry) {
        this.doctorId = doctorId;
        this.doctorName = name;
        this.phoneNo = phoneNo;
        this.specialization = specialization;
        this.location = location;
        this.priceQuerry = priceQuerry;
    }

    public Doctors() {

    }

    public void setPhoneNo(long phoneNo) {this.phoneNo = phoneNo;}
    public float getPriceQuerry() {return priceQuerry;}
    public void setPriceQuerry(float priceQuerry) {this.priceQuerry = priceQuerry;}
    public int getDoctorId() {return doctorId;}
    public void setDoctorId(int doctorId) {this.doctorId = doctorId;}
    public String getDoctorName() {return doctorName;}
    public void setDoctorName(String name) {this.doctorName = name;}
    public long getPhoneNo() {return phoneNo;}
    public void setPhoneNo(int phoneNo) {this.phoneNo = phoneNo;}
    public String getSpecialization() {return specialization;}
    public void setSpecialization(String specialization) {this.specialization = specialization;}
    public String getLocation() {return location;}
    public void setLocation(String location) {this.location = location;}

    @Override
    public String toString() {
        return "--------------------------\n" +
                "DoctorId: " + doctorId + "\n" +
                "Name: " + doctorName + "\n" +
                "PhoneNo: " + phoneNo + "\n" +
                "Specialization: " + specialization + "\n" +
                "location: " + location + "\n" +
                "Price Querry: " + priceQuerry;
    }
    public void PrescribeMeds(){
        System.out.print("Doctor "+ getDoctorName() + ", specialist in " +
        getSpecialization() + ", Locate: "+getLocation());
    }
    public void CheckReports(){}
    public void PrescribeTest(){}
    public void DrawSalary(){}

}
