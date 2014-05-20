package runner;

import jgibblda.Estimator;
import jgibblda.Inferencer;
import jgibblda.LDACmdOption;
import jgibblda.Model;

public class Runner {

	
	public void run() {
		LDACmdOption ldaOption = new LDACmdOption(); 
		ldaOption.alpha = 0.0001;
		ldaOption.beta = 0.5;
		ldaOption.dir = "/Users/jackpay/Documents/PhD/JGibbLDA-v.1.0";
		ldaOption.inf = false;
		ldaOption.dfile =  "func-test.txt";
		ldaOption.est = true;
		ldaOption.K = 3;
		ldaOption.modelName = "newmodel";
		Estimator est = new Estimator();
		est.init(ldaOption);
		est.estimate();
	}
	
	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.run();
	}
}
