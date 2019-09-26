# QuickSort-MergeSort-Practice
Implement an interface two different ways, using Quick Sort and Merge Sort respectively, in an application that sorts circles by radius. 


CS-2013 Lab 10 - Sorts and the Strategy Pattern
Implement an interface two different ways, using Quick Sort and Merge Sort respectively, in an application that sorts circles by radius. 

A Circle has a radius, a getRadius method, a getArea method, and a toString that returns a String like this: Circle with radius: 0.7881120695012456, area 1.951308021061287

The SortStrategy interface contains one method, public int sort(Circle[] arrayIn);
SortStrategy is implemented by two classes, QuickSortStrategy and MergeSortStrategy, which each implement the sort method using the appropriate algorithm.  Since an array is a reference type, there is no need to return the sorted array.  However, the sort method must return the number of pairwise comparisons made during the sort.

A SortResult represents the result of sorting a list of Circles using both algorithms.  SortResult should have an array of circles, and ints for the number of comparisons made during the merge sort and the number of comparisons made during the quick sort.  It will also need getters for these variables.

Sorter has the following:
a method that creates an array of ten Circles and populates it with Circles that have random radii. 
a method to show all the Circles in an array (their toStrings)

A sort() method that makes a copy of an array of Circles, sorts the original array using quick sort and sorts the copy using merge sort (think about why!), then creates a SortResult with the sorted values and the comparison counts from the sorts.

A showResult() method that takes a SortResult as its only parameter and shows the comparison counts form each sort algorithm, like this:
# Comparisons quick sort: 23; # comparisons merge sort: 19

SorterDriver creates a Sorter and runs methods from Sorter to sort a random array of Circles using the two algorithms and show the results.  Here is output from a sample run of my solution:
Unsorted list:
Circle with radius: 55.02214838132733, area 9510.973249347251
Circle with radius: 65.2774516253876, area 13386.78399779406
Circle with radius: 54.48821806103131, area 9327.281483655306
Circle with radius: 27.70384932107641, area 2411.1826258570964
Circle with radius: 32.61394713307221, area 3341.61643658366
Circle with radius: 54.33239236429166, area 9274.009347993866
Circle with radius: 5.441632617819048, area 93.02684846619786
Circle with radius: 49.15011888943843, area 7589.252774420895
Circle with radius: 21.870781082584735, area 1502.7213602978077
Circle with radius: 46.18534207330155, area 6701.286749215964


Sorted list:
Circle with radius: 5.441632617819048, area 93.02684846619786
Circle with radius: 21.870781082584735, area 1502.7213602978077
Circle with radius: 27.70384932107641, area 2411.1826258570964
Circle with radius: 32.61394713307221, area 3341.61643658366
Circle with radius: 46.18534207330155, area 6701.286749215964
Circle with radius: 49.15011888943843, area 7589.252774420895
Circle with radius: 54.33239236429166, area 9274.009347993866
Circle with radius: 54.48821806103131, area 9327.281483655306
Circle with radius: 55.02214838132733, area 9510.973249347251
Circle with radius: 65.2774516253876, area 13386.78399779406


# Comparisons quick sort: 23; # comparisons merge sort: 19

 
Turn in your .java classes without file compression as well as an executable .jar file that runs SorterDriver.
