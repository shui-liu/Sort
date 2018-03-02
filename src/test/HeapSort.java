package test;

/**
 * ������
 * ԭ�����Ƚ����н���Ϊ�󶥶ѣ����ظ������Ѷ���ĩβԪ�أ��ָ�����������������ֱ������Ԫ������ ʱ�临�Ӷȣ�O(nlgn);
 * �ռ临�Ӷȣ�O(1); �ȶ���false
 */
public class HeapSort {
	public void adjust(int[] a, int i, int len) {
		int temp, j;
		temp = a[i];
		for (j = 2 * i + 1; j < len; j = j * 2 + 1) {
			if (j < len - 1 && a[j] < a[j + 1])
				j++;
			if (temp >= a[j])
				break;
			a[i] = a[j];
			i = j;
		}
		a[i] = temp;
	}

	public void sort(int[] a) {
		// �����󶥶�
		for (int i = a.length / 2 - 1; i > -1; i--) {
			adjust(a, i, a.length);
		}
		// �����Ѷ���ĩβԪ�أ����ָ��󶥶�
		for (int i = a.length - 1; i > 0; i--) {
			int temp = a[i];
			a[i] = a[0];
			a[0] = temp;
			adjust(a, 0, i);
		}
	}
}