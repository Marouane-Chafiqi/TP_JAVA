package formationjava;

public class FileItem extends FsItem {
    long size;

    public FileItem(String name, long size) {
        super(name);
        this.size = size;
    }

    public long getSize() {
        return size;
    }
}