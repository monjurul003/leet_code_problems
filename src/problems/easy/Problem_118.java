package problems.easy;

import java.util.ArrayList;
import java.util.List;

/*118. Pascal's Triangle
*
* Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]


* */
public class Problem_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows < 1){
            return triangle;
        }
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        triangle.add(firstrow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i-1);
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            for (int j = 1; j < i; j++) {
                curRow.add(prevRow.get(j) + prevRow.get(j-1));
            }
            curRow.add(1);
            triangle.add(curRow);
        }
        return triangle;
    }
}
