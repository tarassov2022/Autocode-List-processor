package com.epam.javabasic.algorithmictasks;

import com.epam.javabasic.algorithmictasks.impl.ArrayProcessor;
import org.junit.jupiter.api.BeforeEach;

/**
 * Created by anton_chyrko on 12/22/20.
 */
abstract class AbstractTest {

	IArrayProcessor testClass;

	@BeforeEach
	void setUp() {
		testClass = new ArrayProcessor();
	}
}
