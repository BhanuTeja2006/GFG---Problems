class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        ArrayList<Integer>arr = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += a[i][i];
        }
        arr.add(sum);
        Arrays.sort(b);
        int max = b[b.length-1];
        arr.add(max);
        return arr;
    }
}