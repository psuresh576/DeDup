package com.suresh.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Suresh Pelluru.
 * 
 * This class is used to remove the duplicates from an array using 3
 * implementation approaches.
 * 
 * Implementation-1 - Brute Force Method 
 * Implementation-2 - Set approach
 * Implementation-3 - HashTable approach
 * 
 */
public class DeDup {
	public int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
			18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
			19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	public static void main(String[] args) {
		DeDup deDup = new DeDup();

		long startTimer = System.nanoTime();
		System.out.println("Brut Force method: " + deDup.deDupBrutForce());
		System.out.println("Time took by Brut Force: " + (System.nanoTime() - startTimer));

		startTimer = System.nanoTime();
		System.out.println("Set method: " + deDup.deDupSet());
		System.out.println("Time took by Set method: " + (System.nanoTime() - startTimer));

		startTimer = System.nanoTime();
		System.out.println("Hash Table method: " + deDup.deDupHashTable());
		System.out.println("Time took by Hash Table method: " + (System.nanoTime() - startTimer));
	}

	// Implementation-1 - Brute Force Method

	/**
	 * This method used to remove the duplicates from array using Brute Force
	 * Method approach
	 * 
	 * @return ArrayList<Integer>
	 */
	ArrayList<Integer> deDupBrutForce() {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (Integer integer : randomIntegers) {
			if (!temp.contains(integer)) {
				temp.add(integer);
			}
		}
		return temp;
	}

	// Implementation-2 - Set approach

	/**
	 * This method used to remove the duplicates from array using Set approach
	 * 
	 * @return Set<Integer>
	 */
	Set<Integer> deDupSet() {
		// #4 - to retain Original order use LinkedHashSet
		Set<Integer> temp = new LinkedHashSet<Integer>();
		for (Integer integer : randomIntegers) {
			temp.add(integer);
		}
		return temp;
	}

	// Implementation-3 - HashTable approach

	/**
	 * This method used to remove the duplicates from array using HashTable
	 * approach
	 * 
	 * @return Collection<Integer>
	 */
	Collection<Integer> deDupHashTable() {
		Map<Integer, Integer> integerMap = new LinkedHashMap<Integer, Integer>();
		for (Integer integer : randomIntegers) {
			if (integerMap.get(integer) == null) {
				integerMap.put(integer, integer);
			}
		}
		return integerMap.values();
	}
}
