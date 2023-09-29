

class Nqueens
{
    //To count total number of solutions possible
    static int ans=0;

    public static boolean isSafe(char board[][],int r,int c)
    {
        //JUST NEED TO CHECK WITH ABOVE ROWS AS BELOW ONES ARE NOT FILLED YET
        //UP
        
        for(int i=r;i>=0;i--)
        {
            if(board[i][c]=='Q')
                return false;
        }

        //UP-LEFT(DIAGNOL)
        for(int i = r, j = c;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
                return false;
        }

        //UP-RIGHT(DIAGNOL)

        for(int i=r,j=c; i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
                return false;
        }
        return true;
    }

    public static void nQueens(char board[][],int i)
    {
    
        //Base Case
        if(i==board.length)
        {
            System.out.println("---------------------------ChESS-----------------------------");
            printBoard(board);
            return;
        }
        //Recursive
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board, i, j))
            {
                board[i][j] = 'Q';

                nQueens(board, i+1);
                //BackTracking
                board[i][j] = 'X';
            }
            
        }
     
    }

    public static void printBoard(char[][] board)
    {
        ans++;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args)
    {
        int n = 10;

        char board[][] = new char[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j] = 'X';
            }
        }
        nQueens(board,0);
        System.out.println(ans);

    }
}

