import java.util.Scanner;
public class SortHashMap {
    /*public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator =  new Comparator<K>() {
            public int compare(K k1, K k2) {
                int compare = map.get(k2).compareTo(map.get(k1));
                if (compare == 0) return 1;
                else return compare;
            }
        };
        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }*/
    class node {

        node left, right;
        int data;
        boolean color; // красный - true, черный - false

        node(int data) {
            this.data = data;
            left = null;
            right = null;
            color = true; //Новый узел - красный
        }
    }
    private static node root = null;
        node rotateLeft(node myNode) {   // Поворот узла против часовой стрелки
        System.out.printf("Поворот влево\n");
        node child = myNode.right;
        node childLeft = child.left;

        child.left = myNode;
        myNode.right = childLeft;

        return child;
    }

        node rotateRight(node myNode) { // Поворот узла по часовой стрелке
        System.out.printf("Поворот вправо\n");
        node child = myNode.left;
        node childRight = child.right;

        child.right = myNode;
        myNode.left = childRight;

        return child;
    }

    boolean isRed(node myNode) { //Проверка на красность
        if (myNode == null) {
            return false;
        }
        return (myNode.color == true);
    }

    void swapColors(node node1, node node2) { // Изменение цвета двух узлов
        boolean temp = node1.color;
        node1.color = node2.color;
        node2.color = temp;
    }

    node insert(node myNode, int data) { // Вставка в дерево
        if (myNode == null) {
            return new node(data);
        }

        if (data < myNode.data) {
            myNode.left = insert(myNode.left, data);
        } else if (data > myNode.data) {
            myNode.right = insert(myNode.right, data);
        } else {
            return myNode;
        }

        // 1. Правый дочерний элемент красный, а левый дочерний элемент черный или не существует.
        if (isRed(myNode.right) && !isRed(myNode.left)) {
            myNode = rotateLeft(myNode);
            swapColors(myNode, myNode.left);
        }

        // 2. левый ребенок, а также левый внук выделены красным цветом
        if (isRed(myNode.left) && isRed(myNode.left.left)) {
            myNode = rotateRight(myNode);
            swapColors(myNode, myNode.right);
        }

        // 3. Левый, и правый дочерние элементы окрашены в красный цвет.
        if (isRed(myNode.left) && isRed(myNode.right)) {
            myNode.color = !myNode.color;
            myNode.left.color = false;
            myNode.right.color = false;
        }

        return myNode;
    }

        void inorder(node node) {
        if (node != null)
        {
            inorder(node.left);
            char c = '●';
            if (node.color == false)
                c = '◯';
            System.out.print(node.data + ""+c+" ");
            inorder(node.right);
        }
    }
    public static void main(String[] args) {

        SortHashMap node = new SortHashMap();
        Scanner scan = new Scanner(System.in);

        char ch;
        do {
            System.out.println("Введите целое число");

            int num = scan.nextInt();
            root = node.insert(root, num);

            node.inorder(root);
            System.out.println("\nЕсли хотите продожить введите \"!\"");
            ch = scan.next().charAt(0);
        }
        while (ch == '!');
    }
}

