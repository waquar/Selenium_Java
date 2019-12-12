package basicfeatures;

import org.testng.annotations.DataProvider;

public class Dataproviderhere {

	@DataProvider(name = "datahere")
	Object [][] testdata(){
		return new Object[][] {
			{"2+3", "5"},
			{"2*3", "7"},
			{"20/2", "10"}
		};
	}
}
