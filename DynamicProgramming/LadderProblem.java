package DynamicProgramming;
/*
Count ways to reach the nth stair using step 1, 2 or 3
A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time. Implement a method to count how many possible ways the child can run up the stairs.

There are two methods to solve this problem
1. Recursive Method
2. Dynamic Programming

Examples :

Input : 4
Output : 7

Input : 3
Output : 4
 */
public class LadderProblem {
    public static void main(String[] args) {
        int n=4;
        int Rec=countwaysRec(n);
        int Dyn=countwaysDyn(n);
        System.out.println(Rec);
        System.out.println(Dyn);
    }
    public static int countwaysRec(int n)
    {
        if(n==0||n==1)
            return 1;
        if(n==2)
            return 2;
        return countwaysRec(n-1)+countwaysRec(n-2);
    }
    public static int countwaysDyn(int n)
    {
        int ans[]= new int[n+1];
        ans[0]=1;
        ans[1]=1;
        for (int i = 2; i <=n ; i++) {
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans[n];
    }
}
