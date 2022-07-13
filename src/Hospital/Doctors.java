package Hospital;

public class Doctors {
    private int doctorId;
    private String doctorName;
    private long phoneNo;
    private String specialization;
    private String location;

    public Doctors(int doctorId, String name, long phoneNo, String specialization, String location) {
        this.doctorId = doctorId;
        this.doctorName = name;
        this.phoneNo = phoneNo;
        this.specialization = specialization;
        this.location = location;
    }
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
                "location: " + location;
    }

    public void PrescribeMeds(){

        System.out.print("The Doctor "+ getDoctorName() + ", specialist in " + getSpecialization() + ", Located in "+getLocation()+"" +
                ", attended the patient ");

    }
    public void CheckReports(){}
    public void PrescribeTest(){}
    public void DrawSalary(){}

}
