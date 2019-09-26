package lab10;

import java.util.Random;

public class Sorter {
	Circle c1 = new Circle();
	public Circle[] circleArray = new Circle[10];
	public Circle[] circleArrayMerge = new Circle[10];
	public double[] temp = new double[1];
	public int quickSortCounter = 0;
	public int mergeSortCounter = 0;
	
	public Circle[] arrayCreator() {
		Random rand = new Random();
		
		for(int i = 0; i <= circleArray.length-1; i++) {
			
			Circle temp = new Circle(rand.nextDouble());
			circleArray[i] = temp;
			System.out.println(circleArray[i]);
		}
		
		
		return circleArray;
	}
	
	
	
	public String showAll() {
		for(int i = 0; i <= circleArray.length-1; i++) {
			circleArray[i].toString();
			
		}
		
		
		return null;
	}
	
	public Circle[] sort(Circle[] circleArray, int beginning, int end) {
		int i = beginning;
        int j = end;
        circleArrayMerge = circleArray;
        double pivot = circleArray[i+(j-i)/2].getRadius();
        while (i <= j) {
            while (circleArray[i].getRadius() < pivot) {
            	
                i++;
            }
            while (circleArray[j].getRadius() > pivot) {
                j--;
            }
            if (i <= j) {
            	Circle temp = circleArray[i];
            	circleArray[i] = circleArray[j];
            	circleArray[j] = temp;
            	
                i++;
                j--;
            }
        }
        
        if (beginning < j) {
        	quickSortCounter++;
            sort(circleArray,beginning, j);
        	
        }
        if (i < end) {
        	quickSortCounter++;
        	sort(circleArray,i, end);
        	
        }
        
		

       
             

     
        	int start = beginning;
        	int finish = end;
            for (int a = start; a <= finish; a++) {
                circleArrayMerge[a] = circleArray[a];
            }
            int q = start;
            int w = (start+(finish-start))/2;
            int middle = w;
            int e = start;
            while (q <= middle && w <= finish) {
                if (circleArrayMerge[q].getRadius() <= circleArrayMerge[w].getRadius()) {
                    circleArray[e] = circleArrayMerge[q];
                    mergeSortCounter++;
                    q++;
                } else {
                	mergeSortCounter++;
                    circleArray[e] = circleArrayMerge[w];
                    w++;
                }
                e++;
            }
            while (q <= middle) {
                circleArray[e] = circleArrayMerge[q];
                e++;
                q++;
            }
     
        
        
        
		return this.circleArray;
	}
	
	public void printIt(Circle[] circleArray) {
		System.out.println("			Quick Sort");
        for(int k = 0; k <= circleArray.length-1; k++) {
        
			System.out.println(circleArray[k]);
			
		}
        System.out.println("			Merge Sort");
        for(int f = 0; f <= circleArrayMerge.length-1; f++) {
            
			System.out.println(circleArrayMerge[f]);
			
		}
        System.out.println("# of Comparisons quick sort: " + quickSortCounter + " # of Comparisons merge sort: " + mergeSortCounter);
	}
	
	
}
