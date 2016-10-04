# Ghost Blog Mac

This is a demonstration on how to automate a web application using Selenium WebDriver.

## Getting Started

* To get started, you need to have the latest version of JDK installed on your machine (Version 8.) 
* You will also need to install Eclipse Neon.

## Installing

* To install the latest version of JDK: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
* For Eclipse Neon: https://eclipse.org/

## To Run The Test

1. Import the project into Eclipse:
	* Select File, Import, Git, Projects from Git --> Next
	* Select Clone URI --> Next
	* Enter URI (https://github.com/ccates23/GhostBlogMac) --> Next
2. Make sure master branch is checked --> Next
3. Enter the destination of the directory you want the project to be saved in --> Next
4. Once the project is imported into Eclipse, you need to:
	* Right click on the GhostBlogMac folder
	* Select Maven Select Update Project (which installs the necessary .JAR files to run the project)
5. To run the test:
	* Right click on GhostModule.java
	* Select Run As --> TesgtNG Test
	* A Chrome icon should pop up in the tool bar below.  You can click on that to open the browser to watch the test execute.
6. A report is generated in the report folder following the test.

## Built With

* Eclipse
* Maven
* Selenium
* TestNG

## Author

Chad Cates (cates.chad@gmail.com)

## License

MIT License

Copyright (c) 2016 Chad Cates

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.



