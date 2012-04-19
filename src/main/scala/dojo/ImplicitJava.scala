package dojo

import com.google.common.base.Predicate

object ImplicitJava {

  def funcToPred(function: (User) => Boolean) : Predicate[User] = null

}
