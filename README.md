# Ghost Blog Mac

This is a demonstration on how to automate a web application using Selenium WebDriver.

## Getting Started

To get started you will need to install the latest version of JDK on your machine. 
Version 8
You will also need to install Eclipse Neon. 
https://eclipse.org/


### Installing

To install the latest version on JDK visit http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
For Eclipse Neon visit https://eclipse.org/
## Running the tests

Once you have installed the JDK 8 and Eclipse on your machine. You will need to import the project into Eclipse. 
In Eclipse select File, Import, Git, Projects from Git and click Next
Select Clone URI and click Next
Enter URI https://github.com/ccates23/GhostBlogMac
Click Next
Make sure Master branched is checked and click Next
Enter the destination of the directory you want the project to be saved in and click Next
Once the project is imported into Eclipse you need to right click on GhostBlogMac folder and select Maven
Select Update Project and it will install the jar files necessary for this project
To run the test right click on GhostModule.java and select Run As
Run test as TestNG Test
A Chrome icon should pop up in the tool bar below and you can click on that to open the browser and watch the test execute
A report is generated in the the report folder following the test

## Built With

* Eclipse
* Maven
* Selenium 
* TestNG

## Authors

* **Chad Cates** 

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details


