public class QuickUnion {
    //connected
    //union
    //constructor
    //root
    private int[] id;

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int p) {

        while (p != id[p]) p = id[p];
        return p;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        // change p's root to q's root
        int p_root = root(p);
        int q_root = root(q);

        id[p_root] = q_root;
    }
}
