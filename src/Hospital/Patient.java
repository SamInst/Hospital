package Hospital;

public class Patient {
    private int patientId;
    private String patientName;
    private int patientPhoneNumber;
    private String address;
    private int age;
    private String sex;

    private int roomNo;

    public Patient(int patientId, String patientName, int patientPhoneNumber, String address, int age, String sex, int roomNo) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientPhoneNumber = patientPhoneNumber;
        this.address = address;
        this.age = age;
        this.sex = sex;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return  "patientId=" + patientId + "\n" +
                "patientName='" + patientName + "\n" +
                "patientPhoneNumber=" + patientPhoneNumber + "\n" +
                "Address='" + address + "\n" +
                "Age=" + age + "\n" +
                "Sex='" + sex + "\n" +
                "RoomNo=" + roomNo;
    }

    public int getPatientId() {return patientId;}
    public void setPatientId(int patientId) {this.patientId = patientId;}
    public String getPatientName() {return patientName;}
    public void setPatientName(String patientName) {this.patientName = patientName;}
    public int getPatientPhoneNumber() {return patientPhoneNumber;}
    public void setPatientPhoneNumber(int patientPhoneNumber) {this.patientPhoneNumber = patientPhoneNumber;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getSex() {return sex;}
    public void setSex(String sex) {this.sex = sex;}
    public int getRoomNo() {return roomNo;}
    public void setRoomNo(int roomNo) {this.roomNo = roomNo;}
}
