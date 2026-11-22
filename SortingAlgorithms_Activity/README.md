# Sorting Algorithms Activity

## Program Overview
This Java program shows how **Bubble Sort**, **Selection Sort**, and **Insertion Sort** work for our **IT20 (Data Structures and Algorithms)** class. It takes an unsorted list of numbers and arranges them from lowest to highest using all three methods.

---

## How Each Sorting Algorithm Works

### 1. Bubble Sort
Bubble Sort checks two numbers side by side and swaps them if they are in the wrong order. It keeps doing this pass after pass until the biggest numbers "bubble up" to the end and the whole list is sorted.

### 2. Selection Sort
Selection Sort splits the list into a sorted side and an unsorted side. In each round, it looks through the unsorted numbers to find the smallest one and swaps it into the next spot on the sorted side.

### 3. Insertion Sort
Insertion Sort sorts the list one number at a time. It takes the next unsorted number and shifts bigger numbers to the right until it finds the exact spot where that number belongs.

---

## Differences Between the Three Sorting Algorithms
- **Bubble Sort** does a lot of back-and-forth swapping between neighboring numbers.
- **Selection Sort** searches for the smallest number first, so it only swaps once per pass.
- **Insertion Sort** shifts numbers over to insert each item into place instead of constantly swapping pairs.

---

## Reflection Questions

### 1. How does each sorting algorithm arrange numbers? What makes their processes different?
- **Bubble Sort** pushes large numbers to the end by swapping neighbors repeatedly.
- **Selection Sort** hunts for the smallest remaining number and moves it to the front.
- **Insertion Sort** picks one number at a time and slides it into its proper place among the already-sorted numbers.
- **What makes them different:** Bubble Sort relies on frequent swaps, Selection Sort looks for the minimum value first, and Insertion Sort shifts elements to insert items directly where they belong.

### 2. Among the three sorting algorithms, which one do you think is the easiest to understand and implement? Why?
**Bubble Sort** is the easiest to understand and code because comparing two numbers next to each other and swapping them is very straightforward and only needs simple loops.

### 3. If the numbers are already sorted, which algorithm do you think would perform better? Explain your answer based on how the algorithms work.
**Insertion Sort** works best on an already sorted list because it just checks each number against the one before it, sees that it is already in order, and moves on without shifting anything. Selection Sort would still scan the whole unsorted section every single time even though nothing needs to move.

### 4. What will happen if you add more numbers to your array? How might this affect the performance of each sorting algorithm?
If I add more numbers, all three algorithms will run noticeably slower. Because they use nested loops, adding more numbers multiplies the number of comparisons and swaps they have to do.

### 5. As a future programmer, why is it important to understand different sorting algorithms instead of using just one?
Different programs handle different amounts of data and have different speed or memory needs. Knowing multiple sorting algorithms helps me pick the best tool for the job instead of forcing one slow method to work for everything.
