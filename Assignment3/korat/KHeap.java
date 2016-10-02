import korat.finitization.*;
import korat.finitization.impl.*;

public class KHeap {
    private int k;
    private int size;
    private int array[];

    public boolean repOK() {
        // returns true if shape and heap property are satisfied
        // complete this method
    	
    	if (array == null)
    		return false;
    	if (size < 0 || size > array.length)
    		return false;
    	for (int i = 0; i < size; i++) {
    		int elem_i = array[i];
    		if (elem_i == -1)
    			return false;
    		if (i > 0) {
    			int elem_parent = array[(i - 1) / k];
    			if (elem_i > elem_parent)
    				return false;
    		}
    	}
    	for (int i = size; i < array.length; i++)
    		if (array[i] != -1)
    			return false;
    	return true;
    }

    public static IFinitization finKHeap(int k, int maxSize, int maxArrayLength, int maxArrayValue) {
        //complete the remaining method
        IFinitization f = FinitizationFactory.create(KHeap.class);
        IIntSet sizes = f.createIntSet(0, 1, maxSize);
        IIntSet arrayLength = f.createIntSet(0, 1, maxArrayLength);
        IIntSet arrayValues = f.createIntSet(-1, 1, maxArrayValue);
        IArraySet arrays = f.createArraySet(int[].class, arrayLength, arrayValues, 1);
        IIntSet ks = f.createIntSet(k, k);
        f.set("k", ks);
        f.set("size", sizes);
        f.set("array", arrays);
        return f;
    }
}
