package fr.spoonlabs.flacoco.localization.spectrum.formulas;

public class OchiaiFormula implements Formula {

	public OchiaiFormula() {
	}

	public double compute(int nPassingNotExecuting, int nFailingNotExecuting, int nPassingExecuting,
			int nFailingExecuting) {

//		if ((nFailingExecuting + nPassingExecuting == 0) || (nFailingExecuting + nFailingNotExecuting == 0)) {
//			return 0;
//		}

		if ((nFailingExecuting + nFailingNotExecuting == 0) || (nPassingExecuting+nPassingNotExecuting ==0) || ((nFailingExecuting/(nFailingExecuting+nFailingNotExecuting)) + (nPassingExecuting/(nPassingExecuting+nPassingNotExecuting))) == 0) {
			return 0;
		}

//		if (( nPassingExecuting + ((nFailingExecuting+nFailingNotExecuting)-(nFailingExecuting))) == 0) {
//			return 0;
//		}

//		return nFailingExecuting
//				/ (Math.sqrt((nFailingExecuting + nFailingNotExecuting) * (nFailingExecuting + nPassingExecuting)));

		return ((nFailingExecuting/(nFailingExecuting+nFailingNotExecuting))
				/ ((nFailingExecuting/(nFailingExecuting+nFailingNotExecuting)) + (nPassingExecuting/(nPassingExecuting+nPassingNotExecuting))));



//		return (nFailingExecuting / ( nPassingExecuting + ((nFailingExecuting+nFailingNotExecuting)-(nFailingExecuting))));

	}

}
