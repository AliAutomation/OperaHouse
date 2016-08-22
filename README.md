# OperaHouse
==================================================================================
                             BDD Cucumber Selenium Webdriver 
==================================================================================
Overview :

Behavioral Driven Development (BDD) testing uses natural language to describe the “desired behavior” of the system that can be understood by the developer, tester and the customer. In this Project we are implementing   BDD framework in webdriver selenium using cucumber-jvm. Cucumber –JVM is based on cucumber framework which allows to writes feature file in plain text using Gherkin language, This feature is supported by step definitions file which has implemented automation code of Webdriver.


# How to run scripts
==================================================================================
                                  Features file 
==================================================================================
1. Update the URL ,Browser , Platform (windows , mobile ) with respect to Functionality on Config.Properties (src/main/resources/profile)

2. Select the feature file you want to run all scenarios related with a particular functionality are under a particular feature file 
(src/test/resources/feature.web)

=========================================================================================
                                    Junit test 
==========================================================================================

1. Update the URL , Browser , Platform (windows , mobile )  with respect to Functionality on Config.Properties (srsc/main/resources/profile)

2. There is Unique annotation assigned to particular feature file unpdate the tags you want exceute and run it as Run as Junit file 
(src/test/java/com.sydenyopera.test/TestRunWebSuite.java)


=========================================================================================
                                       Maven 
==========================================================================================

1. Update the URL , Browser , Platform (windows , mobile ) with respect to Functionality on Config.Properties (srsc/main/resources/profile)

2. There is Unique annotation assigned to particular feature file unpdate the tags you want exceute and run it as Run as Junit file 
(src/test/java/com.sydenyopera.test/TestRunWebSuite.java )

3. Run the POM.xml  as  Maven test 