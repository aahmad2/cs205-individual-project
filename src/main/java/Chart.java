public class Chart {
    private String name;
    private Object[] ranks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object[] getRanks() {
        return ranks;
    }

    public void setRanks(Object[] ranks) {
        this.ranks = ranks;
    }

    public Chart(String name) {
        this.name = name;
    }
}
