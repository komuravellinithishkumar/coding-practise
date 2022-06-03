import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.Stack;

class Bnode {
    int data;
    Bnode left;
    Bnode right;

    Bnode(int d) {
        this.data = d;
        left = null;
        right = null;
    }
}

public class BinaryTree {

    Bnode root;

    public void inorder(Bnode root) {
        if (root == null) {
            return;
        }
        this.inorder(root.left);
        // System.out.println(root.data);
        this.inorder(root.right);

    }

    public void preorder(Bnode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        this.preorder(root.left);
        this.preorder(root.right);

    }

    public void level(Bnode root) {
        Queue<Bnode> q = new LinkedList<Bnode>();
        List<List<Integer>> wraplist = new LinkedList<List<Integer>>();
        int count = 0;
        if (root == null) {
            System.out.println(wraplist);
        } else {
            q.add(root);

            while (!q.isEmpty()) {
                List<Integer> sublist = new LinkedList<>();
                int size = q.size();

                for (int i = 0; i < size; i++) {
                    if (q.peek().left != null) {
                        q.add(q.peek().left);
                    }
                    if (q.peek().right != null) {
                        q.add(q.peek().right);
                    }
                    sublist.add(q.poll().data);
                    count++;
                }
                wraplist.add(sublist);
            }
        }
        System.out.println(count);
        System.out.println(wraplist);
    }

    public int depth(Bnode root) {
        if (root == null) {
            // System.out.println("true");
            return 0;
        } else {
            int lh = depth(root.left);
            // System.out.println(lh);
            int rh = depth(root.right);

            // System.out.println(1+Math.max(lh,rh));
            // System.out.println(rh);
            return 1 + Math.max(lh, rh);
        }

    }

    public void iterator(Bnode root) {
        List<Integer> itr = new LinkedList<Integer>();

        if (root == null) {
            System.out.println(itr);
        }
        Stack<Bnode> st = new Stack<Bnode>();
        st.push(root);
        while (!st.isEmpty()) {
            root = st.pop();
            System.out.print(root);
            itr.add(root.data);
            if (root.right != null) {
                st.add(root.right);
            }
            if (root.left != null) {
                st.add(root.left);
            }

        }
        System.out.println(itr);

        // System.out.println(itr);

    }

    public static void main(String[] args) {
        BinaryTree Bt = new BinaryTree();

        Bt.root = new Bnode(5);
        Bt.root.left = new Bnode(6);
        Bt.root.right = new Bnode(7);
        Bt.root.left.left = new Bnode(3);
        // System.out.println(Bt.root.data);
        // System.out.println(Bt.root.left.data);
        // System.out.pntln(Bt.root.right.data);
        // System.out.println(Bt.root.left.left.data);ri

        // System.out.println()
        // Bt.inorder(Bt.root);
        // Bt.preorder(Bt.root);
        // Bt.level(Bt.root);
        // Bt.iterator(Bt.root);
        System.out.println(Bt.depth(Bt.root));
        // Bt.depth(Bt.root);
    }
}
