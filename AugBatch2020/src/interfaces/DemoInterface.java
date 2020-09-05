package interfaces;
/*2. Interfaces
 * 
 * Provides a mechanism to achieve abstraction & multiple
 * inheritance.
 * 
 * Need of using interfaces:
 * 1. To achieve abstraction
 * 2. Support functionality of multiple inheritance.
 * 
 * Syntax:
 * 
 * interface  <interface Name>
 * {
 *    declare variables
 *    declare methods (abstract)
 * }
 * 
 * No implementation of non-abstract methods is allowed.
 * 
 * When we declare variables in interfaces,compiler
 * adds the following keywords automatically
 * -public
 * -static
 * -final
 * 
 * int num=9; -- compiler --public static final int num=9
 *
 *
 *when we declare methods in interfaces,
 *-public
 *-abstract 
 *
 *Relation between class & interface
 *
 *class1 extends class2 ( extends )
 *class1 implements interface1 (implements)
 *interface1 extends interface2
 *
 *
 *class A1{
 *
 *void m1()
 *{
 *  body of method
 *}
 *
 *void m2()
 *{
 * body of method
 *}
 *
 *}
 *
 *
 *class A2 extends A1
 *{
 *  void m3()
 *  {
 *  
 *  }
 *
 *}
 *
 */

public class DemoInterface {

}
