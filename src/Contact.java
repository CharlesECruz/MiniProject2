public class Contact {
    private String mobile;
    private String home;
    private String work;
    private String name;
    private String city;


    public Contact(String mobile, String home, String work, String name, String city) {
        this.mobile = mobile;
        this.home = home;
        this.work = work;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        String output = "<";
        output += this.name+"> (mobile ="+this.mobile+", ";
        if (!this.home.isEmpty()){
            output += "home ="+this.home+", ";
        }
        if (!this.work.isEmpty()){
            output += "work = "+this.work+", ";
        }
        output += "city = "+this.city+")";
        return output;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
