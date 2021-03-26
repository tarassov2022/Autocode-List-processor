package com.epam.javabasic.algorithmictasks;

import com.epam.javabasic.algorithmictasks.impl.ListProcessor;
import org.junit.jupiter.api.BeforeEach;

/**
 * Created by anton_chyrko on 12/22/20.
 */
abstract class AbstractTest {

	IListProcessor testClass;

	@BeforeEach
	void setUp() {
		testClass = new ListProcessor();
	}
}
