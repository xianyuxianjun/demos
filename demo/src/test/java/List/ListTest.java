package List;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    //初始化列表
    //无初始化值
    List<Integer> nums1 = new ArrayList<>();

    //有初始化值
    Integer[] numbers = new Integer[]{1,2,3,4,5};
    List<Integer> nums = new ArrayList<>(Arrays.asList(numbers));

    //访问元素
    int num = nums.get(1);

    @Test
    //更新元素
    void update(){
        int index = 0;
        int val = 1;
        nums.set(index,val);
    }

    //清空列表
    void clear(){
        nums.clear();
    }

    //在尾部添加元素
    void add(){
        nums.add(1);
        nums.add(2);

        //在中间插入元素
        nums.add(3,6);

        //删除元素
        nums.remove(3);
    }

    void bl(){
        int count = 0;
        for(int i=0;i<nums.size();i++){
            count += nums.get(i);
        }

        //直接遍历列表元素
        for(int num:nums){
            count+=num;
        }
    }
}
