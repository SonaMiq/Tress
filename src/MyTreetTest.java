public class MyTreetTest {
    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        int[] elements = {8, 4,5, 12, 2, 3, 10, 9, 11, 18, 13,21,1};
        for (int i : elements) {
            myTree.insertEl(i);
        }
        System.out.println(myTree.searchEl(18).right.val);
    }
}
