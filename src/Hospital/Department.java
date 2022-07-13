package Hospital;

public class Department {
    public int idDept;
    public String nameDept;
    public int docId;

    public Department(int idDept, String nameDept, int docId) {
        this.idDept = idDept;
        this.nameDept = nameDept;
        this.docId = docId;
    }

    public int getIdDept() {return idDept;}
    public void setIdDept(int idDept) {this.idDept = idDept;}
    public String getNameDept() {return nameDept;}
    public void setNameDept(String nameDept) {this.nameDept = nameDept;}
    public int getDocId() {return docId;}
    public void setDocId(int docId) {this.docId = docId;}

    public void AddDepartment (){}
    public void DeleteDepartment(){}
    public void AddDoctor(){}
    public void DeleteDoctor(){}

}
