class ArrayExample
{
    public static void main(String []args)
    {
        int a[] = {33, 3, 1, 5};
        int min = Findmin(a);  // Call the Findmin method here
        System.out.println(min);
    }

    public static int Findmin(int arr[])
    {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }
}
