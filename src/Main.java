

public class Main {
    public static void main(String[] args) {
        Tree tr = new Tree();
        tr.insert(7);
        tr.insert(4);
        tr.insert(9);
        tr.insert(1);
        tr.insert(6);
        tr.insert(8);
        tr.insert(10);
        
        Tree tr2 = new Tree();
        tr2.insert(7);
        tr2.insert(4);
        tr2.insert(9);
        tr2.insert(1);
        tr2.insert(6);
        tr2.insert(8);
        tr2.insert(10);
        
        System.out.println(tr.equals(tr2));
    }
}