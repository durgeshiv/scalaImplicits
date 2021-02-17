package com.durgeshSoftware.scalaImplicits


object placingImplicits extends App {

  //We'll try to demonstrate ordering/ placing  implicits correctly
  // lets  see sorted method over list - used to arrange it in sorted order

  val list = List(1,5,9,2,8)
  println(list.sorted)
  // if  you hover over sorted, it is using an implicit method to order the
  // elements of a string.
  // This means there is already a implicit method defined for same
  // and the location it looks for is scala.Predefs package - which is automatically imported when writing code

  // list.sorted will give ordering based on increasing fashion and will return
  // List(1,2,5,8,9) as result

  // Let's try to define our own reverse ordering and make it implicit
  implicit val reverseOrderingList: Ordering[Int] = Ordering.fromLessThan(_ > _)
  println(list.sorted)
  // o/p of line 9 ::: List(1, 2, 5, 8, 9)  - this is because of the default behavior
  // o/p of line 20 ::: List(9, 8, 5, 2, 1) - this is because we have defined implicit method and that has
  // took priority over the default one

  // If at all we try to define one more implicit , scala compiler will get confused as it
  // which one to take, i.e which one has priority over another.

  /**  These are basically IMPLICIT PARAMETERS
   * Possibility of implicit values are, the priority is set as below ::
   * 1. val/var
   * 2. obejct
   * 3. Accessor methods - i.e. defs with no parantheses
   *          which means if I put parantheses as reverseOrderingList() <-- this will not behave as implicit
   *
   *    **** Also, these can only de defined inside object/class/trait and not on top level.****
    */

  /**
   * Now, letsdo an exercise to create implicit ordering function <-- see exercise1.scala
   */

}
