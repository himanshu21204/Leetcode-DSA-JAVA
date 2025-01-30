class LRUCache {
    class Node {
        int key;
        int val;
        Node prev;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }
    int capacity;
    HashMap<Integer,Node> map;
    Node old;
    Node New;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        this.old = new Node(0,0);
        this.New = new Node(0,0);
        this.old.next = this.New;
        this.New.prev = this.old;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    public void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    public void insert(Node node) {
        Node prev = New.prev;
        Node next = New;
        prev.next = next.prev = node;
        node.next = next;
        node.prev = prev;
    }
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        Node newNode = new Node(key, value);
        map.put(key, newNode);
        insert(newNode);

        if (map.size() > capacity) {
            Node lru = old.next;
            remove(lru);
            map.remove(lru.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */