public class searcharray {
    void searchInArray() {
        int[] arr = { 1, 4, 6, 8 };
        int x = 6;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = arr[i];

            }
        }
        
        
        System.out.println("Found " + x + " at index " + ans);
    }

    public static void main(String[] args) {
        searcharray s = new searcharray();
        s.searchInArray();
    }
}
