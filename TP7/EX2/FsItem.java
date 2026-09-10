package formationjava;

public abstract class FsItem {
    String name;

    public FsItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract long getSize();

    public String toString() {
        return name + " (" + getSize() + " B)";
    }
}