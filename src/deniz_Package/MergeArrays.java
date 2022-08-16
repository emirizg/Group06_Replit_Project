package deniz_Package;
import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {


        public static int[] mergR(int[] a,int[] b) {

            int[] arr= new int[a.length+b.length];

            int j =0;
            for(int i = 0 ; i<a.length; i++){

                arr[j]=a[i];
                j++;
                for(int z=0; z<b.length;z++){

                    arr[j]=b[z];
                }
            }


return  arr;



        }//end mergR

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int [] nums = new int[in.nextInt()];
            int [] nums2 = new int[in.nextInt()];
            for(int i=0; i < nums.length; i++) {
                nums[i] = in.nextInt();
            }
            for(int i=0; i < nums2.length; i++) {
                nums2[i] = in.nextInt();
            }

            System.out.println(Arrays.toString(mergR(nums, nums2)));
        }
    }
