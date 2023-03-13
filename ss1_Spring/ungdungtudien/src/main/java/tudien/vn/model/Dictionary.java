package tudien.vn.model;

public class Dictionary {
    private String anh;
    private String viet;

    public Dictionary() {
    }

    public Dictionary(String anh, String viet) {
        this.anh = anh;
        this.viet = viet;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getViet() {
        return viet;
    }

    public void setViet(String viet) {
        this.viet = viet;
    }
}
