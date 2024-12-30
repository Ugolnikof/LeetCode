import java.util.Arrays;
import java.util.OptionalDouble;

public class MinMaxAvgNumbers {
    public void setArray(double[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Math.round(Math.random()*100);
        }
    }

    public double findMax(double[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }

    public double findMin(double[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    public OptionalDouble findAvg(double[] nums) {
        return Arrays.stream(nums).average();
    }
}
