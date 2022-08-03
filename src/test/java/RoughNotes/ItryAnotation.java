package RoughNotes;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ItryAnotation implements IRetryAnalyzer {
	
	int start= 1;
	int end= 3;
	public boolean retry(ITestResult result) {
		
		if(start<=end) {
			
			start++;
			return true;
		}
		return false;
	}

}
