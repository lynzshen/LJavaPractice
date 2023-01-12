class Assigment5 {
    Assigment5.Node root = null;

    Assigment5() {
    }

    void insert(int key) {
        this.root = this.insertRec(this.root, key);
    }

    Assigment5.Node insertRec(Assigment5.Node root, int key) {
        if (root == null) {
            root = new Assigment5.Node(key);
            return root;
        } else {
            if (key < root.key) {
                root.lefty = this.insertRec(root.lefty, key);
            } else if (key > root.key) {
                root.righty = this.insertRec(root.righty, key);
            }

            return root;
        }
    }

    void InorderTrav(Assigment5.Node root) {
        if (root != null) {
            this.InorderTrav(root.lefty);
            System.out.print(root.key + " ");
            this.InorderTrav(root.righty);
        }

    }

    void treeins(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            this.insert(arr[i]);
        }

    }

    public static void main(String[] args) {
        Assigment5 tree = new Assigment5();
        int[] arr = new int[]{4, 8, 3, 2, 1};
        tree.treeins(arr);
        tree.InorderTrav(tree.root);
    }

    class Node {
        int key;
        Assigment5.Node lefty;
        Assigment5.Node righty;

        public Node(int item) {
            this.key = item;
            this.lefty = this.righty = null;
        }
    }
}