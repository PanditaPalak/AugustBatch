package multithreading;

public class MultiDemo {

}

/*Multitasking
 * 
 * :
 * 
 * 2 categories:
 * 1.process based
 * 2.Thread based
 * 
 * Thread schedular is vendor dependent...
 * therfore the behaviour of jvm i also vendor dependent
 * 
 * 3..thread...TS
 * 
 * 1st --> 10 sec
 * 2nd -->30 sec
 * 3rd --> 200 sec
 * 
 * 2 ways:
 *  1 :  BY extending Thread class
 *  2 :  By implementing Interfaces
 *  
 *                  Runnable (I)
 *        
 *  Thread class                Test implements Runnable
 *  Test extends Thread                (2nd way)
 *  (one way)
 *  
 * 
 * priorities of thread:
 * 
 * range - (1-10)
 * 
 * max priority(10)
 * min priority(1)
 * norm priority(5)
 * 
 * */
