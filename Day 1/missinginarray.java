class missinginarray {
    int missingNum(int arr[]) {
        // code here
    long n=arr.length+1;
    long sum=0;
    for(int a:arr)
    {
        sum+=a;
    }
   long total = (n * (n + 1)) / 2;

        return (int)(total - sum);
    }
       
       
}