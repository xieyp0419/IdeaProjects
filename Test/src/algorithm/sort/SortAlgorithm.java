package algorithm.sort;

public class SortAlgorithm {
    /**
     * 选择排序：从第一个元素开始，拿第一个元素与第二个元素比较得出其中更小值，
     * 依次类推得出这个数组中最小的元素及其下标
     * 然后把最小值与第一个值进行交换，然后再依次找出第二小的值等...
     **/
    public static void selectSort(int[] array) {
        int i;
        int j;
        int temp = 0;//存放小值
        int flag = 0;//存放小值的下标
        int n = array.length;//数组长度
        for (i = 0; i < n; i++) {
            temp = array[i];
            flag = i;
            for (j = i + 1; j < n; j++) {
                if (array[j] < temp) {
                    temp = array[j];
                    flag = j;
                }
            }
            if (flag != i) {
                array[flag] = array[i];
                array[i] = temp;
            }
        }
    }

    /**
     * 插入排序：事先认为数组第一个元素是一个有序数组，然后以第二个元素开始插入这个有序数组中
     * temp用来存放需要插入的元素，插入元素与有序数组中的元素进行倒序比较，然后交换值。
     *
     * @param array
     */
    public static void insertSort(int[] array) {
        if (array != null) {
            for (int i = 1; i < array.length; i++) {
                int temp = array[i];//插入的值
                int j = i;//比较的次数
                if (array[j - 1] > temp) {
                    while (j >= 1 && array[j - 1] > temp) {
                        array[j] = array[j - 1];
                        j--;
                    }
                }
                array[j] = temp;
            }
        }
    }

    /**
     * 冒泡排序：从当前元素起。依次比较每一对相邻元素，若逆序则交换
     *
     * @param array
     */
    public static void BubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {//外循环为排序趟数，len个进行len-1躺
            for (int j = 0; j < array.length - 1 - i; j++) {//内循环为每趟比较次数，第i趟比较len-1-i次
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int i = 0;
        int[] a = {5, 4, 9, 8, 7, 6, 0,1,3,2};
//        selectSort(a);
//        insertSort(a);
//        BubbleSort(a);
        quickSort(a);
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
    }

    /**
     * 快速排序
     *
     * @param array
     */
    private static void quickSort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] a, int left, int right) {
        if (left > right) {
            return;
        }
        //base存放基准数
        int base = a[left];
        int i = left, j = right;
        while (i != j) {
            //先从右边开始往左找，直到找到比base值小的数
            while (i < j && a[j] >= base) {
                j--;
            }
            //再从左往右边找，直到找到比base值大的数
            while (i < j && a[i] <= base) {
                i++;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        //将基准数放到中间的位置
        a[left] = a[i];
        a[i] = base;
        // 递归，继续向基准的左右两边执行和上面同样的操作
        // i的索引处为上面已确定好的基准值的位置，无需再处理
        sort(a, left, i - 1);
        sort(a, i + 1, right);
    }
}
