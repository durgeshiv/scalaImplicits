package com.durgeshSoftware.scalaImplicits

import com.durgeshSoftware.scalaImplicits.placingImplicits.Person

/**
 * Written by Durgesh Agnihotri - 1614636351
 */
object multipleImplicitImplementation extends App {

  // defining same list as previously
  val lst = List(Person("Marry", 25), Person("Alwyn", 40), Person("Chris", 31))

  // implementing implicit by importing it, to order list by age ::

  import implicitDef2._
  val sortedList = lst.sorted
  println(sortedList)

}

object implicitDef1 {
  implicit def nameAlphbeticalOrder: Ordering[Person] = Ordering.fromLessThan((a,b) => a.name < b.name)
}

object implicitDef2 {
  implicit def ageReverseOrder: Ordering[Person] = Ordering.fromLessThan((a,b) => a.age > b.age)
}
