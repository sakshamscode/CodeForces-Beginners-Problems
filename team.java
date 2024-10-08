package codeforces;
import java.util.*;
public class team {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        int total = 0;

        while(n-->0){
            int vote=0;
            for(int i=0;i<3;i++){
                int a = sc.nextInt();
                if(hs.contains(a)) {
                    vote++;
                }
            }
            if(vote>=2) total++;
        }
        System.out.println(total);
    }
}
