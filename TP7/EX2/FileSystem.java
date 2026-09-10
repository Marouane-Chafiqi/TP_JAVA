package formationjava;

public class FileSystem {
    FsItem[] items = new FsItem[4];
    int count = 0;

    public void addRoot(FsItem item) {
        if (count == items.length) {
            FsItem[] tmp = new FsItem[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                tmp[i] = items[i];
            }
            items = tmp;
        }
        items[count] = item;
        count++;
    }

    public void listAll() {
        for (int i = 0; i < count; i++) {
            FsItem f = items[i];
            if (f instanceof Directory) {
                Directory d = (Directory) f;
                d.list(0);
            } else {
                System.out.println(f);
            }
        }
    }

    public long totalSize() {
        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + items[i].getSize();
        }
        return sum;
    }
}