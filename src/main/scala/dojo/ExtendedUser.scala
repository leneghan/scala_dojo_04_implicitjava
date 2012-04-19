package dojo

class ExtendedUser(id:Int, name:String, male:Boolean, age:Int) extends User(id, name, male, age) {

  def isEligible() = male && age > 35

}
