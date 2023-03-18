package email.model;

public class Email {
    private String id;
    private String langueges;
    private String pageSize;
    private String spamsFilter;
    private String signature;

    public Email() {
    }

    public Email(String id, String langueges, String pageSize, String spamsFilter, String signature) {
        this.id = id;
        this.langueges = langueges;
        this.pageSize = pageSize;
        this.spamsFilter = spamsFilter;
        this.signature = signature;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLangueges() {
        return langueges;
    }

    public void setLangueges(String langueges) {
        this.langueges = langueges;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getSpamsFilter() {
        return spamsFilter;
    }

    public void setSpamsFilter(String spamsFilter) {
        this.spamsFilter = spamsFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "Email{" +
                "id='" + id + '\'' +
                ", langueges='" + langueges + '\'' +
                ", pageSize='" + pageSize + '\'' +
                ", spamsFilter='" + spamsFilter + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }
}
