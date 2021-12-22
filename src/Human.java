public class Human {
    private String name;
    private Long age;
    private String gender;
    private String address;

    public Human() {
    }


    public void showString() {
        System.out.println(String.format("Name: %s\nAge: %s\nGender: %s\nAddress: %s\n", this.name, this.age, this.gender, this.address));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
