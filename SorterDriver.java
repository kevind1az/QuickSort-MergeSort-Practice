package lab10;

public class SorterDriver {
	public static void main(String[]args) {
		Sorter s1 = new Sorter();
		Circle[] circleArray = s1.circleArray;
		s1.arrayCreator();
		s1.showAll();
		circleArray = s1.circleArray;
		s1.sort(circleArray, 0, circleArray.length-1);
		circleArray = s1.circleArray;
		s1.printIt(circleArray);

		
	}
}
