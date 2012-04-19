<br />
<div class="wiki-content" style="font-size: 10pt; line-height: 13pt;">
<h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
Summary</h4>
<div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
Today we look at how easily you can write Scala that works with Java code as well as looking at a powerful language feature, implicit conversions and parameters.</div>
<ul style="font-size: 10pt; line-height: 13pt;">
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">Implicit Parameters -&nbsp;<a class="external-link" href="http://www.scala-lang.org/node/114" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">http://www.scala-lang.org/node/114</a></li>
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">Implicit related blog -&nbsp;<a class="external-link" href="http://www.codecommit.com/blog/scala/scala-for-java-refugees-part-6" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">http://www.codecommit.com/blog/scala/scala-for-java-refugees-part-6</a></li>
</ul>
<h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
<a href="" name="ScalaDojo04-implicitjava-ImplicitJava"></a>Implicit Java</h4>
<div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
This week you will find some Java classes as well as the usual Scala ones. You will be implementing functions on the&nbsp;<em>UserLookup</em>&nbsp;Scala class, which itself queries a Java implemented&nbsp;<em>DataSource</em>&nbsp;class through its&nbsp;<em>findUsers</em>method, from which will be returned a Java collection of User's. As usual work though by getting the tests to pass one at a time, and keep an eye on the couple of comments which hint at the direction you may want to take.</div>
<h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
<a href="" name="ScalaDojo04-implicitjava-Buildingtheproject"></a>Building the project</h4>
<div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
You can either build and run the tests with either Maven or the Simple Build Tool. SBT is incredabilly easy to to install and it is highly recommended you give it a try as it is the standard Scala build tool.</div>
<ul style="font-size: 10pt; line-height: 13pt;">
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">SimpleBuildTool install steps -&nbsp;<a class="external-link" href="https://github.com/harrah/xsbt/wiki/Getting-Started-Setup" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">https://github.com/harrah/xsbt/wiki/Getting-Started-Setup</a></li>
</ul>
<h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
<a href="" name="ScalaDojo04-implicitjava-Gettingthecode"></a>Getting the code</h4>
<div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
To get started you can&nbsp;<a class="external-link" href="https://github.com/leneghan/scala_dojo_04_implicitjava" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">go to the repo</a>&nbsp;and fork the project into your own github repository by clicking the fork button on the top right. This is the preferred method as it means we can easily share our solutions with each other but if you don't wish to do this you can create a local copy from my repository by simply executing the git clone command.</div>
<ol style="font-size: 10pt; line-height: 13pt;">
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">go to&nbsp;<a class="external-link" href="https://github.com/leneghan/scala_dojo_04_implicitjava" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">https://github.com/leneghan/scala_dojo_04_implicitjava</a></li>
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">click fork button on the top right of the screen</li>
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;"><em>git clone&nbsp;<a class="external-link" href="https://github.com/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">https://github.com/</a>&lt;GIT_HUB_NAME&gt;/scala_dojo_04_implicitjava.git</em></li>
</ol>
<div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
or</div>
<div class="preformatted panel" style="background-attachment: initial; background-clip: initial; background-color: white; background-image: initial; background-origin: initial; border-bottom-color: rgb(102, 153, 204); border-bottom-style: solid; border-bottom-width: 1px; border-left-color: rgb(102, 153, 204); border-left-style: solid; border-left-width: 1px; border-right-color: rgb(102, 153, 204); border-right-style: solid; border-right-width: 1px; border-top-color: rgb(102, 153, 204); border-top-style: solid; border-top-width: 1px; margin-bottom: 10px; margin-left: 20px; margin-right: 20px; margin-top: 10px; overflow-x: hidden; overflow-y: hidden; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
<div class="preformattedContent panelContent" style="background-attachment: initial; background-clip: initial; background-image: initial; background-origin: initial; font-size: 0.95em; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 12px; padding-left: 10px; padding-right: 10px; padding-top: 12px; text-align: left;">
<pre style="font-family: 'Courier New', Courier, monospace; line-height: 1.3; overflow-x: auto; overflow-y: auto; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">git clone https://github.com/leneghan/scala_dojo_04_implicitjava.git
</pre>
</div>
</div>
<h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
<a href="" name="ScalaDojo04-implicitjava-Gettingstartedwithgit"></a>Getting started with git</h4>
<div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
If you dont have git currently installed you can download it&nbsp;<a class="external-link" href="http://git-scm.com/download" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">here from the git website</a>. When using Git I found this one page cheat sheet useful, it also comes with some pointers about good VCS practice,&nbsp;<a class="external-link" href="http://www.git-tower.com/files/cheatsheet/Git_Cheat_Sheet_grey.pdf" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">Git_Cheat_Sheet_grey.pdf</a></div>
<h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
<a href="" name="ScalaDojo04-implicitjava-Resources"></a>Resources</h4>
<ul style="font-size: 10pt; line-height: 13pt;">
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;"><a class="external-link" href="http://www.scalatest.org/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">ScalaTest website</a></li>
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;"><a class="external-link" href="http://twitter.github.com/scala_school/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">Twitters Scala School</a></li>
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;"><a class="external-link" href="https://github.com/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">GitHub website</a></li>
<li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;"><a class="external-link" href="http://git-scm.com/download" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">Git download location</a></li>
</ul>
</div>
<div class="pageSection" id="labels-section" style="clear: both; margin-bottom: 5px; margin-top: 40px;">
<div class="labels-editor">
<span class="label-title" id="labels-section-title" style="background-color: white; display: inline; float: left; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 13px; padding-right: 5px; text-align: left;"><b>Labels:</b></span><div>
<b><br /></b></div>
<div class="content-column" id="labels-section-content" style="background-color: white; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 14px; line-height: 16px; padding-left: 55px; text-align: left;">
</div>
</div>
</div>
