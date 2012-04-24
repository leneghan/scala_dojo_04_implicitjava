package dojo

import com.google.common.base.Predicate

object ImplicitJava {

  implicit def funcToPred(function: (User) => Boolean) : Predicate[User] = {
    new Predicate[User] {
      def apply(p1: User): Boolean = function(p1)
    }
  }
  
  implicit def userToExtendedUser(user:User) : ExtendedUser = {
    new ExtendedUser(user.getId, user.getName, user.isMale, user.getAge)
  }

}
