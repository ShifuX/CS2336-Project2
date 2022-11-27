public class TreeNode<E> {
    protected TreeNode<E> left;
    protected TreeNode<E> right;
    protected E element;
    protected Node<Article> head;

    public TreeNode(E e) {
        element = e;
    }

    public void addFirst(Article a) {
        Node<Article> newNode = new Node<>(a);
        newNode.next = head;
        head = newNode;
    }

}
