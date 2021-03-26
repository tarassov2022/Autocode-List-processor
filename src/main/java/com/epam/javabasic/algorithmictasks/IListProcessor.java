package com.epam.javabasic.algorithmictasks;

import java.util.List;

/**
 * Please, see readme.md file! All detailed instructions are laid there.
 * <p>
 * Created by anton_chyrko on 12/21/20.
 */
public interface IListProcessor {

	String getSecondStringByLength(List<String> list);

	List<String> getSortedListByLength(List<String> list);

	List<String> getSortedListByCountOfVowels(List<String> list);

	List<String> getSortedListByCountOfConsonants(List<String> list);

	List<String> changeByPlacesFirstAndLastSymbolsInEachSecondStringOfList(List<String> list);

	List<String> revertStringsOfList(List<String> list);
}
