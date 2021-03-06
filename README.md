# ConfusedSorter
Project for Data Structures and Algorithms class - Implements a sorter which reads from a txt file and sorts mainly natural numbers while also fulfilling given specifications

# Program is run by:

javac ConfusedSorter.java\
java ConfusedSorter input.txt output.txt

# Assignment specifications:

The problem: an only slightly confused number and symbol sorter\
The task your system has to perform is to sort a given list of natural numbers and symbols in descending order. In addition to the usual ordering on natural numbers, we have the following requirements on how the symbols are integrated:

0 < Do < 1\
100 < Re < 101\
1000 < Mi < 1001\
3 < & < 4\
3 < @ < &\
1005000 < % < 1005001\
55 < Asymbolwithareallylongname < 56\
20 < $ < 21\
15 < Fa < 16\
103 < One < 104\
One < Three < 104\
One < Two < Three\
If the given list contains any number of 666, then the result list should be sorted in ascending order, without any occurences of 666, but with one @ added (even if the list already contains @s).

Input file\
In an input file the given list for your system will be given by a line for each of the numbers/symbols in the list.

Output file\
In the output file, you output the result list one number/symbol in its own line in the required order. If during reading of the input list, your system encounters an input that is not a natural number or one of the symbols given above, it has to output:
Input error.\
and terminate. Regarding blanks and empty lines, the same requirements as in assignment 1 have to be fulfilled.
