package lk.kochasoft.studentcare.dto.student;

public class CreateStudentDTO {
    private String name;
    private String address;

    public CreateStudentDTO(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public CreateStudentDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CreateStudentDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
