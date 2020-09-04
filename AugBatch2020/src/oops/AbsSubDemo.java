package oops;

 public class AbsSubDemo extends AbsDemo{

	 
	 AbsSubDemo()
	 {
		 super();
		 //System.out.println("ABs SUb demo constructor calling");
	 }
	@Override
	void show() {
		System.out.println("Abstract implemented");
	}

	//display--concrete
	//show -- abstract --defined
	//getDetails -- abstract
	//showDetails -- abstract
	

}
