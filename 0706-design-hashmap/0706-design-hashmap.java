class MyHashMap {

    int[] key;
    int[] value;

    public MyHashMap() {
        key = new int[1000001];
        value = new int[1000001];

        Arrays.fill(key, -1);
    }

    public void put(int k, int v) {
        key[k] = k;
        value[k] = v;
    }

    public int get(int k) {
        if(key[k] == -1) {
            return -1;
        }

        return value[k];
    }

    public void remove(int k) {
        key[k] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */