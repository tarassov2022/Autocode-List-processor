package com.epam.tat.listprocessor.impl;

import com.epam.tat.listprocessor.IListProcessor;
import com.epam.tat.listprocessor.exception.ListProcessorException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Function Description:
 * Complete the functions below. All methods must work with list of String.
 *
 * In case of incorrect input values or inability to perform an action, the method should throw an appropriate
 * exception.
 *
 */
public class ListProcessor implements IListProcessor {

	/**
	 * Find the second by length string in a list.
	 *
	 * Ex.:
	 * From list:
	 * {"a", "aa", "aaaaa", "aaaa", "aaa"}
	 * will be return "aaaa"
	 *
	 * @param list - input data
	 * @return second by length string in the input list
	 */
	@Override
	public String getSecondStringByLength(List<String> list) {
		String longestByLength = "";
		String secondLongestByLength ="";
		if (list==null) throw new ListProcessorException("The list is null");
		if (list.isEmpty()||list.contains("")) throw new ListProcessorException("The list is empty or contains empty elements");
		if (list.size()==1) throw new ListProcessorException("There is only one element");
		for (String string : list) {
			if (string.length() > longestByLength.length()) {
				secondLongestByLength = longestByLength;
				longestByLength=string;
			}
			if(string.length()<longestByLength.length()&&string.length()>secondLongestByLength.length()){
				secondLongestByLength=string;
			}
		}

		if(secondLongestByLength=="") throw new ListProcessorException("These are identical length elements");

		return secondLongestByLength;

	}

	/**
	 * Sort list by string length.
	 *
	 * Ex.:
	 * From list:
	 * {"a", "aa", "aaA", "aAa", "aaa", "Aa"}
	 * will be return
	 * {"a", "Aa", "aa", "aAa", "aaA", "aaa"}
	 *
	 * @param list - input data
	 * @return sort list by string length

	 */
	@Override
	public List<String> getSortedListByLength(List<String> list) {
		if (list==null) throw new ListProcessorException("The list is null");
		if (list.isEmpty()||list.contains("")) throw new ListProcessorException("The list is empty or contains empty elements");
		//Collections.sort(list);
		Collections.sort(list, (s1, s2) -> s1.length() - s2.length());
		return list;

	}

	/**
	 * Sort list or array by count of vowels in string.
	 * If the number of vowels in several words is the same, the order is alphabetical.
	 *
	 * Ex.:
	 * From list:
	 * {"Puma", "Nike", "Timberland", "Adidas"}
	 * will be return
	 * {"Nike", "Puma", "Adidas", "Timberland"}
	 *
	 * @param list - input data
	 * @return sort list by string length
	 */
	@Override
	public List<String> getSortedListByCountOfVowels(List<String> list) {
		if (list==null) throw new ListProcessorException("The list is null");
		if (list.isEmpty()||list.contains("")) throw new ListProcessorException("The list is empty or contains empty elements");
		for (String string:list){
			char stringElement;
			boolean anyVowels=false;
			for(int j=0;j<string.length();j++)
			{
				stringElement=string.charAt(j);
				if(stringElement=='a'||stringElement=='e'||stringElement=='i'||stringElement=='o'||stringElement=='u'||stringElement=='A'||stringElement=='E'||stringElement=='I'||stringElement=='O'||stringElement=='U')
				{
					anyVowels=true;
				}
			}
			if(anyVowels==false)
				throw new ListProcessorException("There are no vowels!");


		}
		Collections.sort(list);
		Collections.sort(list,(o1, o2) -> o1.replaceAll("[^aeiouAEIOU]","").length()-o2.replaceAll("[^aeiouAEIOU]","").length());
		return list;


	}

	/**
	 * Sort list or array by count of consonants in string.
	 * If the number of consonants in several words is the same, the order is alphabetical.
	 *
	 * Ex.:
	 * From list:
	 * {"Puma", "Nike", "Timberland", "Adidas"}
	 * will be return
	 * {"Nike", "Puma", "Adidas", "Timberland"}
	 *
	 * @param list - input data
	 * @return sort list by string length
	 */
	@Override
	public List<String> getSortedListByCountOfConsonants(List<String> list) {
		if (list==null) throw new ListProcessorException("The list is null");
		if (list.isEmpty()||list.contains("")) throw new ListProcessorException("The list is empty or contains empty elements");
		for (String string:list){
			char stringElement;
			boolean anyConsonants=false;
			for(int j=0;j<string.length();j++)
			{
				stringElement=string.charAt(j);
				if(stringElement=='b'||stringElement=='B'||stringElement=='c'||stringElement=='C'||stringElement=='d'||
						stringElement=='D'||stringElement=='f'||stringElement=='F'||stringElement=='g'||stringElement=='G'||
						stringElement=='j'||stringElement=='J'||stringElement=='k'||stringElement=='K'||stringElement=='l'||
						stringElement=='L'||stringElement=='m'||stringElement=='M'||stringElement=='n'||stringElement=='N'||
						stringElement=='p'||stringElement=='P'||stringElement=='q'||stringElement=='Q'||stringElement=='s'||
						stringElement=='S'||stringElement=='t'||stringElement=='T'||stringElement=='v'||stringElement=='V'||
						stringElement=='x'||stringElement=='X'||stringElement=='z'||stringElement=='Z'||stringElement=='h'||
						stringElement=='H'||stringElement=='r'||stringElement=='R'||stringElement=='w'||stringElement=='W'||
						stringElement=='y'||stringElement=='Y')
				{
					anyConsonants=true;
				}
			}
			if(anyConsonants==false)
				throw new ListProcessorException("There are no consonants!");


		}
		Collections.sort(list);
		Collections.sort(list,(o1, o2) -> o1.replaceAll("[^bBcCdDfFgGjJkKlLmMnNpPqQsStTvVxXzZhHrRwWyY]","").length()-o2.replaceAll("[^bBcCdDfFgGjJkKlLmMnNpPqQsStTvVxXzZhHrRwWyY]","").length());
		return list;

	}

	/**
	 * Change by places first and last symbols in each second string of list.
	 *
	 * Ex.:
	 * From list:
	 * {"Puma", "Nike", "Timberland", "Adidas"}
	 * will be return
	 * {"Puma", "eikN", "Timberland", "sdidaA"}
	 *
	 * @param list - input data
	 * @return sort list by string length
	 */
	@Override
	public List<String> changeByPlacesFirstAndLastSymbolsInEachSecondStringOfList(List<String> list) {
		if (list==null) throw new ListProcessorException("The list is null");
		if (list.isEmpty()) throw new ListProcessorException("The list is empty");
		if (list.size()==1) throw new ListProcessorException("There is only one element");

		List <String> listChanged =new ArrayList<>();
		for (String listElement: list){
			if (list.indexOf(listElement)%2==0||listElement.length() <2) listChanged.add(listElement);
			else	listChanged.add((listElement.substring(listElement.length() - 1)
							+ listElement.substring(1, listElement.length() - 1)
							+ listElement.substring(0, 1)));
		}
		return listChanged;

	}

	/**
	 * Revert strings of list.
	 *
	 * Ex.:
	 * From list:
	 * {"Puma", "Nike", "Timberland", "Adidas"}
	 * will be return
	 * {"amuP", "ekiN", "dnalrebmiT", "sadidA"}
	 *
	 * @param list - input data
	 * @return sort list by string length
	 */
	@Override
	public List<String> reverseStringsOfList(List<String> list) {
		if (list==null) throw new ListProcessorException("The list is null");
		if (list.isEmpty()) throw new ListProcessorException("The list is empty or contains empty elements");
		List <String> listReversed =new ArrayList<>();
		for (String listElement: list){
			if (listElement.length() < 2) listReversed.add(listElement);
			else	listReversed.add(new StringBuilder(listElement).reverse().toString());
		}
		return listReversed;


	}
}
