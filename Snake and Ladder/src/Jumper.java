public abstract class Jumper {
    private String name;
    private final int start;
    private final int end;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public Jumper(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }
}
