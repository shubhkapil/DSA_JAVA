

class Rat_In_Maze 
{

    public static boolean possible_paths(int i,int j,int[][] arr,String str)
    {
        System.out.println(arr[i][j]);
        print(arr);
        
        //Base Case
        if(arr[i][j]==0)
            return false;
        if(i==arr.length-1 && j==arr.length-1)
        {
            System.out.println(str);
            print(arr);
            return true;
        }
        //Recursive Case
        while((i>=0 && i<arr.length-1) && (j>=0 && j<arr.length-1))
        {
            //Right Case 
            arr[i][j]=-1;
            if(possible_paths(i, j+1, arr, str+"R"))
                arr[i][j]=1;
            
            //LEFT
            else if(possible_paths(i, j-1, arr, str+"L"))
                arr[i][j]=1;

            //UP
            else if(possible_paths(i-1, j, arr, str+"U"))
                arr[i][j]=1;

            //DOWN
            else if(possible_paths(i+1, j, arr, str+"D"))
                arr[i][j]=1;
            
            else
                arr[i][j]=0;

        }
        return false;
    }

    public static void print(int[][] arr) {
        for(int i =0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int [][] arr = {{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        String str = "";
        System.out.println(possible_paths(0,0,arr,str));
    }
}