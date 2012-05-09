package dojo

import com.google.common.base.Predicate
import com.google.common.base.Function

object ImplicitJava {

  implicit def funcToPred[A](function: (A) => Boolean): Predicate[A] = new Predicate[A] {
    def apply(input: A) = function(input)
  }

  implicit def funcToFunc[A, B](function: (A) => B): Function[A, B] = new Function[A, B] {
    def apply(input: A) = function(input)
  }

}
