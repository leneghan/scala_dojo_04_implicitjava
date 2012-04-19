h4. Summary

Today we look at how easily you can write Scala that works with Java code as well as looking at a powerful language feature, implicit conversions and parameters.

* Implicit Parameters - [|http://www.scala-lang.org/node/114] 
* Implicit related blog - [|http://www.codecommit.com/blog/scala/scala-for-java-refugees-part-6]

h4. Implicit Java

This week you will find some Java classes as well as the usual Scala ones. You will be implementing functions on the _UserLookup_ Scala class, which itself queries a Java implemented _DataSource_ class through its _findUsers_ method, from which will be returned a Java collection of User's. As usual work though by getting the tests to pass one at a time, and keep an eye on the couple of comments which hint at the direction you may want to take.

h4. Building the project

You can either build and run the tests with either Maven or the Simple Build Tool. SBT is incredabilly easy to to install and it is highly recommended you give it a try as it is the standard Scala build tool.

* SimpleBuildTool install steps - [|https://github.com/harrah/xsbt/wiki/Getting-Started-Setup]

h4. Getting the code

To get started you can [go to the repo|https://github.com/leneghan/scala_dojo_04_implicitjava] and fork the project into your own github repository by clicking the fork button on the top right. This is the preferred method as it means we can easily share our solutions with each other but if you don't wish to do this you can create a local copy from my repository by simply executing the git clone command.

# go to [https://github.com/leneghan/scala_dojo_04_implicitjava]
# click fork button on the top right of the screen
# _git clone https://github.com/<GIT_HUB_NAME>/scala_dojo_04_implicitjava.git_

or
{noformat}
git clone https://github.com/leneghan/scala_dojo_04_implicitjava.git
{noformat}

h4. Getting started with git

If you dont have git currently installed you can download it [here from the git website|http://git-scm.com/download]. When using Git I found this one page cheat sheet useful, it also comes with some pointers about good VCS practice, [Git_Cheat_Sheet_grey.pdf|http://www.git-tower.com/files/cheatsheet/Git_Cheat_Sheet_grey.pdf]

h4. Resources

* [ScalaTest website|http://www.scalatest.org/]
* [Twitters Scala School|http://twitter.github.com/scala_school/]
* [GitHub website|https://github.com/]
* [Git download location|http://git-scm.com/download]
