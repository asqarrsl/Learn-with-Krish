public class Employee{

    String id;
    String code;
    String NIC;
    String address;

    public Employee(String id, String code, String NIC, String address) {
        this.id = id;
        this.code = code;
        this.NIC = NIC;
        this.address = address;
    }

    public Employee(){
	}

	 public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
	 public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}