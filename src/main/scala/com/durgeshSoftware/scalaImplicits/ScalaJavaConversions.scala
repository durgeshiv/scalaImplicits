package com.durgeshSoftware.scalaImplicits

import scala.collection.mutable

/**
 * Written by Durgesh Agnihotri- 1614886089
 */

/**
 * We know that scala runs on JVM. And sometimes we need to operate with java libraries.
 * Now that, collections in Scala are very much different than Java.
 * Also, that scala focuses heavily on immutability as compared with Java.
 *
 * But still we want to convert scala collections into java or vice versa.
 * For this we need to import collection.javaConverters
 */
object ScalaJavaConversions extends App {

  import collection.JavaConverters._

  /** this JavaConverters is and object extending DecorateAsScala & DecorateAsJava
   * where DecorateAsJava --> is a trait extending JavaConverters with some implicit defs defined in it
   * & DecorateAsJavaScala --> is a trait extending ScalaConverters with some implicit defs defined in it
   */

  /**
   * These(implicit defs) are required when we want to make a conversion between common collection types
   */

  //Lets import java util as an alias in order to distinguish b/w scala and java
  import java.{util => ju }

  // Lets create a java set
  val javaSet : ju.Set[Int] = new ju.HashSet[Int]()
  // lets add elements to it.
  (1 to 10).foreach(javaSet.add)
  //lets print above javaSEt
  println(javaSet) // this is printing a Java set [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]



}
