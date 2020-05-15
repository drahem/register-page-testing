# register-page-testing
### This is an automation script using Selenium and TestNG to test a register page.

### testing scope : 
    - in scope : functions related to register process,
      1- verifiy if all input fields meets the requirements 
         (first name - last name - email - phone - password)
      2- verify the verification email sent or not.
      
    - out of scope : all non-functional tests -load and performance test- also UI test.


# to run this project on your machine:
1- install java and eclipse IDE.
2- install TestNG extension to eclipse (from eclipse marketplace). 
3- add selenium JARs as external JARs to the project (JARs exist in folder "selenium").
4- the class newtest : it contains all methods used to perform test cases.
5- after running the project successfully an auto-generated report would be created contaiining the testing results, it can be found at:
    folder->test-output/index.html and test-output/emailable-report.html
5- the test can be run only once successfully, to rerun it again a change would be done,emails used in all functions would be changed.

## attached to this project two excel files containg test cases report for manual testing and bugs report for manually detected defects.
## also attached the automation reports in two .html files "index.html" & "emailable-report.html"


  
