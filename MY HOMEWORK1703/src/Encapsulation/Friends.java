package Encapsulation;

public class Friends {
    private int ketanage;
    private int vipuldob;
    private String sandip;
    public static void main(String[] args){
        Friends wembley=new Friends();
        wembley.setKetanage(40);
        wembley.setVipuldob(11111978);
        wembley.setSandip("all are good and honest friends");
        System.out.println("Ketan age="+wembley.getKetanage());
        System.out.println("vipul Dob ="+wembley.getVipuldob());
        System.out.println("sandip="+wembley.getSandip());

    }


    public int getKetanage() {
        return ketanage;
    }

    public void setKetanage(int ketanage) {
        this.ketanage = ketanage;
    }

    public int getVipuldob() {
        return vipuldob;
    }

    public void setVipuldob(int vipuldob) {
        this.vipuldob = vipuldob;
    }

    public String getSandip() {
        return sandip;
    }

    public void setSandip(String sandip) {
        this.sandip = sandip;
    }
}
