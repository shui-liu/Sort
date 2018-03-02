package test;

public class Main {
	public static void main(String[] args) {
		int n = 100;
		int[] a = new int[n];
		System.out.println("原始序列：");
		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + "\t");
		}
		// InsertSort test = new InsertSort();
		// SelectionSort test = new SelectionSort();
		// BubbleSort test = new BubbleSort();
		// QuickSort test = new QuickSort();
		// ShellSort test = new ShellSort();
		// HeapSort test = new HeapSort();
		MergeSort test = new MergeSort();
		test.sort(a);
		System.out.println("\n" + "已排序列：");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
