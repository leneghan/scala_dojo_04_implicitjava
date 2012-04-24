package dojo

import com.google.common.base.Predicate

object ImplicitJava {

  implicit def funcToPred(function: (User) => Boolean) : Predicate[User] = {
      new Predicate[User] {
        def apply(input: User) = function(input)
      }
  }

  implicit def userToExtendedUserImplicit(user : User) : ExtendedUser =
  {
    new ExtendedUser(user.getId(), user.getName, user.isMale, user.getAge());

  }
  //implicit def asJavaIterator[A](i : scala.collection.Iterator[A]) : java.util.Iterator[A] = { /* compiled code */ }
  
}
