public class Slot {
    private String sId;
    private SlotStatus status;
    private float size;
    private int ratePerMonth;

    public Slot(String sId, SlotStatus status, float size, int ratePerMonth) {
        this.sId = sId;
        this.status = status;
        this.size = size;
        this.ratePerMonth = ratePerMonth;
    }

    public String getsId() {
        return sId;
    }

}
