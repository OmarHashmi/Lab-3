public class BuddyInfo {
    public static void main(String[] args) {
        BuddyInfo yoyi=new BuddyInfo("Yoyi Yoyi",
                                    "Station 13 Genetic Research",
                                    "613.592.3631");

        System.out.printf("Hello %s, who lives at %s, I'll call you at %s!\n",yoyi.getName(),yoyi.getAddress(),yoyi.getPhone());
    }

    private String name;
    private String address;
    private String phone;

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
}
