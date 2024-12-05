# Kotlin MutableList/MutableSet removeIf Unexpected Behavior

This repository demonstrates a potential issue when using the `removeIf` function with `MutableList` and `MutableSet` in Kotlin.  The issue arises when elements are removed during iteration, which can lead to elements being skipped.

The `bug.kt` file contains code that illustrates this behavior. The `bugSolution.kt` file provides a solution that avoids this issue.

## Problem
The `removeIf` function iterates through the collection and removes elements that satisfy the predicate. If the predicate modifies the collection's structure (like removing an element), the iterator's behavior becomes unpredictable, potentially causing elements to be skipped. 

## Solution
The recommended solution is to iterate through a copy of the collection, or use a different approach that doesn't modify the collection during iteration.
