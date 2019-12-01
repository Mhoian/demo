$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@before"
    }
  ]
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
  "location": "LoginDefinition.enterDefaultEmailAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter default sms-password and make submit at Login page",
  "keyword": "When "
});
formatter.match({
  "location": "LoginDefinition.enterDefaultSmsPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see title at Home page Головна",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userSeeElementsAtHomePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify user can login with valid or invalid login and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User set login \u003clogin\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "User set password \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "User click submit login form at Login page",
  "keyword": "And "
});
formatter.step({
  "name": "User can see error Невірний логін або пароль",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "login",
        "password"
      ]
    },
    {
      "cells": [
        "testcom",
        "somePassWithVeryLongValue"
      ]
    },
    {
      "cells": [
        "кирилица",
        "парольна руском"
      ]
    },
    {
      "cells": [
        "!@#$%%^",
        "!@#$$%%^Ввіаіа"
      ]
    },
    {
      "cells": [
        "front",
        "wegfwrgwrgwrg"
      ]
    },
    {
      "cells": [
        "admin",
        "@W2w2w2w"
      ]
    },
    {
      "cells": [
        "manager",
        "@W2w2w2w"
      ]
    },
    {
      "cells": [
        "testcom",
        "@W2w2w2w"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify user can login with valid or invalid login and password",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "User set login testcom",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDefinition.userSetLoginLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User set password somePassWithVeryLongValue",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userSetPasswordPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click submit login form at Login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDefinition.clickSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see error Невірний логін або пароль",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userCanSeeError(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user can login with valid or invalid login and password",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "User set login кирилица",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDefinition.userSetLoginLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User set password парольна руском",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userSetPasswordPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click submit login form at Login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDefinition.clickSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see error Невірний логін або пароль",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userCanSeeError(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user can login with valid or invalid login and password",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "User set login !@#$%%^",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDefinition.userSetLoginLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User set password !@#$$%%^Ввіаіа",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userSetPasswordPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click submit login form at Login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDefinition.clickSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see error Невірний логін або пароль",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userCanSeeError(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user can login with valid or invalid login and password",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "User set login front",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDefinition.userSetLoginLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User set password wegfwrgwrgwrg",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userSetPasswordPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click submit login form at Login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDefinition.clickSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see error Невірний логін або пароль",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userCanSeeError(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user can login with valid or invalid login and password",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "User set login admin",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDefinition.userSetLoginLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User set password @W2w2w2w",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userSetPasswordPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click submit login form at Login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDefinition.clickSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see error Невірний логін або пароль",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userCanSeeError(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user can login with valid or invalid login and password",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "User set login manager",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDefinition.userSetLoginLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User set password @W2w2w2w",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userSetPasswordPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click submit login form at Login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDefinition.clickSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see error Невірний логін або пароль",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userCanSeeError(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user can login with valid or invalid login and password",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "User set login testcom",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDefinition.userSetLoginLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User set password @W2w2w2w",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userSetPasswordPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click submit login form at Login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDefinition.clickSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see error Невірний логін або пароль",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userCanSeeError(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validation of login and password fields",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User set login \u003clogin\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "User set password \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "User click submit login form at Login page",
  "keyword": "And "
});
formatter.step({
  "name": "User see error requrid fields Обов\u0027язкове поле",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "login",
        "password"
      ]
    },
    {
      "cells": [
        "",
        "somePassWithVeryLongValue"
      ]
    },
    {
      "cells": [
        "testcom",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validation of login and password fields",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "User set login ",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDefinition.userSetLoginLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User set password somePassWithVeryLongValue",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userSetPasswordPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click submit login form at Login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDefinition.clickSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see error requrid fields Обов\u0027язкове поле",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userSeeErrorRequridFields(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation of login and password fields",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "User set login testcom",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDefinition.userSetLoginLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User set password ",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userSetPasswordPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click submit login form at Login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDefinition.clickSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see error requrid fields Обов\u0027язкове поле",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.userSeeErrorRequridFields(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/Payments.feature");
formatter.feature({
  "name": "Payments",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@beforeWithLogin"
    }
  ]
});
formatter.scenario({
  "name": "Creating a new payment in Ukraine",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@beforeWithLogin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User click on menu hryvnia operation",
  "keyword": "Given "
});
formatter.match({
  "location": "PaymentsDefinition.hryvniaOperationLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User goes to the Payments menu",
  "keyword": "When "
});
formatter.match({
  "location": "PaymentsDefinition.userGoesToThePaymentsMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click button create payment",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentsDefinition.buttonCreatePayment()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});