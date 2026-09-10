package formationjava;

public class Directory extends FsItem {
    FsItem[] children = new FsItem[4];
    int count = 0;

    public Directory(String name) {
        super(name);
    }

    public void add(FsItem item) {
        if (count == children.length) {
            FsItem[] tmp = new FsItem[children.length * 2];
            for (int i = 0; i < children.length; i++) {
                tmp[i] = children[i];
            }
            children = tmp;
        }
        children[count] = item;
        count++;
    }

    public long getSize() {
        long total = 0;
        for (int i = 0; i < count; i++) {
            total = total + children[i].getSize();
        }
        return total;
    }

    public void list(int indent) {
        printIndent(indent);
        System.out.println(this);

        for (int i = 0; i < count; i++) {
            FsItem f = children[i];
            if (f instanceof Directory) {
                Directory d = (Directory) f;
                d.list(indent + 1);
            } else {
                printIndent(indent + 1);
                System.out.println(f);
            }
        }
    }

    // Method sahla bach tkteb spaces bدل .repeat()
    private void printIndent(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("  ");
        }
    }
}