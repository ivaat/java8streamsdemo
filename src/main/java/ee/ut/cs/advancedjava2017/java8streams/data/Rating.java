package ee.ut.cs.advancedjava2017.java8streams.data;

public class Rating {
    private String Source;
    private String Value;

    public String getSource() {
        return Source;
    }

    public String getValue() {
        return Value;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "Source='" + Source + '\'' +
                ", Value='" + Value + '\'' +
                '}';
    }
}
