package dojo

import com.google.common.base.Predicate

object ImplicitJava {

  def funcToPred(function: (User) => Boolean) : Predicate[User] = {
      new Predicate[User] {
        def apply(input: User) = function(input)
      }
  }

}
