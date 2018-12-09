$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login page functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify user can login with valid login and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@before"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User login as \u0027Default User\u0027 at Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDefinition.enterLoginAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see sms password required widget present at Login page",
  "keyword": "When "
});
formatter.match({
  "location": "LoginDefinition.enterSmsPasswor()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see elements at Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.verifySmsPasswordRequiredPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user can login with invalid login and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@before"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User login as \u0027Invalid User\u0027 at Login page and InvalidPassword",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDefinition.enterLoginAndInvalidPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see error message \u0027Invalid login or password\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.verifyInvalidLoginAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User registration without entering username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@before"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter email InvalidLogin and password InvalidPassword and make submit at Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDefinition.notEnterLoginAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see error \u0027Invalid login or password\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.verifyLoginAndPasswordFields()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});