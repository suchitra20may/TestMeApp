Feature: Register 

@Data-Driven
Scenario: Register to TestMeApp
Given user open the TestMeApp
When user click signup
And  Enter username as "suchit0110"
And  Enter firstname as "suchitra"
And  Enter lastname as "gore"
And  Enter password as "zener"
And  Enter confirm password as "zener"
And  user select gender as "female"
And  Enter email as "suchitra.gore@accenture.com"
And  Enter mobile as "9425772412"
And  dob as "20/05/1997"
And  address as "Gwalior"
And  user select security question as "What is Your pet name?"
And  Enter answer as "zener"
Then user click  Register


@login
Scenario: Login using datatable
Given user open TestMeApp
When user click signin
And user enter credentials as
   |lalitha|
   |Password123|

 
