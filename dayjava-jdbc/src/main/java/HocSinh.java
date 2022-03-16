import annotationdemo.DayLaDemo;


public class HocSinh {

    private int id;
    private String fullName;
    private int dob;

    public HocSinh(int id, String fullName, int dob) {
        this.id = id;
        this.fullName = fullName;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dob=" + dob +
                '}';
    }
}
