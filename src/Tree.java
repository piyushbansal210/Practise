public class Tree{

    private class Node{
        private Node leftChild;
        private Node rightChild;
        private int value;
        private Node(int value){
            this.value=value;
        }
    }

    public Node root;

    public void value(Node node){
        System.out.println(node.value);
    }

    public void insert(int n){
        Node node = new Node(n);
        if(root==null){
            root = node;
            return;
        }
        var current=root;
        while(true){
            if(n<current.value){
                if(current.leftChild==null){
                    current.leftChild=node;
                    break;                
                }
                current=current.leftChild;
            }
            else{
                if(current.rightChild==null){
                    current.rightChild=node;
                    break;
                }
                current=current.rightChild;
            }
        }
    }
    public boolean find(int n){
        var current=root;
        while(current!=null){
            if(n<current.value){
                current=current.leftChild;
            }
            else if(n>current.value){
                current=current.rightChild;
            }
            else
                return true;
        }
        return false;
    }
    
    //Level Order Traversal BFS
    //Scans all the nodes on the same level
    public void BFS(int val){

    }

    public void PreOrder(){
        PreOrder(root);
    }

    public void PostOrder(){
        PostOrder(root);
    }

    public void InOrder(){
        InOrder(root);
    }

    //Root,Left,Right DFS
    public void PreOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.value+" ");
        PreOrder(root.leftChild);
        PreOrder(root.rightChild);
    }

    //Left,Right, Root DFS
    public void PostOrder(Node root){
        if(root==null){
            return;
        }
        PostOrder(root.leftChild);
        PostOrder(root.rightChild);
        System.out.print(root.value+" ");
    }

    //Left, Root, Right  DFS
    public void InOrder(Node root){
        if(root==null){
            return;
        }
        InOrder(root.leftChild);
        System.out.print(root.value+" ");
        InOrder(root.rightChild);
    }

    public int height(Node root){
        if(root.leftChild==null && root.rightChild==null) return 0;
        return 1+Math.max(
            height(root.leftChild),
            height(root.rightChild)
        );
    }
    public int min(Node root){
        if(root.leftChild==null && root.rightChild==null) return 0;

        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return Math.min(Math.min(left,right),root.value);
    }

    public boolean equals(Tree other){
        if(other == null) return false;
        return equals(root, other.root);
    }
    public boolean equals(Node first, Node second){
        if(first==null && second==null){
            return true;
        }
        if(first!=null && second!=null){
            return first.value == second.value
                    && equals(first.leftChild , second.leftChild)
                    && equals(first.rightChild , second.rightChild);
        }
        return false;
    }

    public boolean validateBST(){
        return validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean validateBST(Node root, int min, int max){
        if(root==null) return true;
        if(root.value<min || root.value>max) return false;
        return validateBST(root.leftChild, min, root.value-1) 
            && validateBST(root.rightChild, root.value+1, max);       
    }

}