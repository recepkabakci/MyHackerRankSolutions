package com.recepkabakci;

import java.util.List;

public class DiaogonalDifference {
	public static int diagonalDifference(List<List<Integer>> arr) {
        int n=arr.size();
        int leftToRight=0;
        int rightToLeft=0;
        for(int i =0;i<n;i++){
           for(int j =0;j<n;j++) {
               if(i==j){
                   leftToRight+=arr.get(i).get(i);
               }
               if(j==n-i-1){
                   rightToLeft+=arr.get(i).get(j);
               }
           }
        }
        return Math.abs(( leftToRight-rightToLeft));

}


}
