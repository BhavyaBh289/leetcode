public class HashMap_706 {
    public static void main(String[]args){
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]

    }
}
class MyHashMap {

    int[]array=new int[1000001];
    boolean [] keydone= new boolean[1000001];
    public MyHashMap() {

    }
    public void put(int key, int value) {
        array[key]=value;
        keydone[key]=true;
    }

    public int get(int key) {
        if(keydone[key]){
            return array[key];
        }
        return -1;
    }

    public void remove(int key) {
        keydone[key]=false;
    }
}