package PhoneNumber;

public class PhoneNumber {
    private String phoneNumber;
    private String numberInfo;

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getNumberInfo() {
        return this.numberInfo;
    }

    public PhoneNumber(String phoneNumber, String numberInfo) {
        this.phoneNumber = phoneNumber;
        this.numberInfo = numberInfo;
    }
}
