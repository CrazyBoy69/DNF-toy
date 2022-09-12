/**
 *
 */
public class Equipment {

    private String entry1;

    private String entry2;

    private String entry3;

    private String entry4;

    public Equipment(){};

    public Equipment (String entry1, String entry2, String entry3, String entry4){
        this.entry1 = entry1;
        this.entry2 = entry2;
        this.entry3 = entry3;
        this.entry4 = entry4;
    }

    public String getEntry1() {
        return entry1;
    }

    public void setEntry1(String entry1) {
        this.entry1 = entry1;
    }

    public String getEntry2() {
        return entry2;
    }

    public void setEntry2(String entry2) {
        this.entry2 = entry2;
    }

    public String getEntry3() {
        return entry3;
    }

    public void setEntry3(String entry3) {
        this.entry3 = entry3;
    }

    public String getEntry4() {
        return entry4;
    }

    public void setEntry4(String entry4) {
        this.entry4 = entry4;
    }
}
