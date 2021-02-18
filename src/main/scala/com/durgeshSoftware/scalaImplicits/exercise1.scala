package com.durgeshSoftware.scalaImplicits

object exercise1 extends App{

  /**
   * Q1. Lets order a List persons as defined below on basis of their name, alphabetical order.
   */

  case class Person(name: String, age: Int)
  val lst = List(Person("Marry", 25), Person("Alwyn", 40), Person("Chris", 31))
  //implicit def nameAlphbeticalOrder: Ordering[Person] = Ordering.fromLessThan((a,b) => a.name < b.name)
  //val sortedList = lst.sorted
  //println(sortedList)

  /**
   * Q2. Lets order a List persons as defined below on basis of their age, decreasing order.
   */


  implicit def ageReverseOrder: Ordering[Person] = Ordering.fromLessThan((a,b) => a.age > b.age)
  val sortedList = lst.sorted
  println(sortedList)
}
