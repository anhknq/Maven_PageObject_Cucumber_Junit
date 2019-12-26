$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("T01_register.feature");
formatter.feature({
  "line": 2,
  "name": "REGISTER",
  "description": "As a user\nI want to register an account\nSo that verify register function work well",
  "id": "register",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@register"
    }
  ]
});
formatter.before({
  "duration": 9511433600,
  "status": "passed"
});
formatter.before({
  "duration": 3998300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Register and Login to system",
  "description": "",
  "id": "register;register-and-login-to-system",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@paymentflow"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "get Login page Url",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "click Here link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "verify Register page displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "read data RegisterEmail",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "enter email",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click Submit button at Register page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "get Login info",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "open Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "enter Login info",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "click Login button at Login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.getLoginPageUrl()"
});
formatter.result({
  "duration": 352559700,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.clickHereLink()"
});
formatter.result({
  "duration": 2375454800,
  "status": "passed"
});
formatter.match({
  "location": "ResgisterPageSteps.verifyRegisterPageDisplayed()"
});
formatter.result({
  "duration": 171454000,
  "status": "passed"
});
formatter.match({
  "location": "ResgisterPageSteps.readDataRegisterEmail()"
});
formatter.result({
  "duration": 13100300,
  "status": "passed"
});
formatter.match({
  "location": "ResgisterPageSteps.enterEmail()"
});
formatter.result({
  "duration": 636850400,
  "status": "passed"
});
formatter.match({
  "location": "ResgisterPageSteps.clickSubmitButtonAtRegisterPage()"
});
formatter.result({
  "duration": 2163836700,
  "status": "passed"
});
formatter.match({
  "location": "ResgisterPageSteps.getLoginInfo()"
});
formatter.result({
  "duration": 1352227000,
  "status": "passed"
});
formatter.match({
  "location": "DynamicPageSteps.openLoginPage()"
});
formatter.result({
  "duration": 2572250100,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.enterLoginInfo()"
});
formatter.result({
  "duration": 512823600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.clickLoginButtonAtLoginPage()"
});
formatter.result({
  "duration": 1889876000,
  "status": "passed"
});
formatter.after({
  "duration": 148700,
  "status": "passed"
});
formatter.uri("T02_new_customer.feature");
formatter.feature({
  "line": 2,
  "name": "ADD NEW CUSTOMER",
  "description": "As a user\r\nI want to create a new customer\r\n  So that verify create new customer function work well",
  "id": "add-new-customer",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@newcustomer"
    }
  ]
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Create 2 customers and check created successfully",
  "description": "",
  "id": "add-new-customer;create-2-customers-and-check-created-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@paymentflow"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "read data NewCustomer_Input",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "open \"New Customer\" page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter New Customer details \u003cindex\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "sleep 3 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "verify message on page \"New Customer\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "verify registered Customer details \u003cindex\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "save New Customer Info",
  "keyword": "And "
});
formatter.examples({
  "line": 22,
  "name": "Index of Customer in list",
  "description": "",
  "id": "add-new-customer;create-2-customers-and-check-created-successfully;index-of-customer-in-list",
  "rows": [
    {
      "cells": [
        "index"
      ],
      "line": 23,
      "id": "add-new-customer;create-2-customers-and-check-created-successfully;index-of-customer-in-list;1"
    },
    {
      "cells": [
        "0"
      ],
      "line": 24,
      "id": "add-new-customer;create-2-customers-and-check-created-successfully;index-of-customer-in-list;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 153500,
  "status": "passed"
});
formatter.before({
  "duration": 90300,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Create 2 customers and check created successfully",
  "description": "",
  "id": "add-new-customer;create-2-customers-and-check-created-successfully;index-of-customer-in-list;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@paymentflow"
    },
    {
      "line": 1,
      "name": "@newcustomer"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "read data NewCustomer_Input",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "open \"New Customer\" page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter New Customer details 0",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "sleep 3 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "verify message on page \"New Customer\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "verify registered Customer details 0",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "save New Customer Info",
  "keyword": "And "
});
formatter.match({
  "location": "NewCustomerPageSteps.readDataNewCustomer_Input()"
});
formatter.result({
  "duration": 6152700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Customer",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.openPage(String)"
});
formatter.result({
  "duration": 1509356300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 27
    }
  ],
  "location": "NewCustomerPageSteps.enterNewCustomerDetails(int)"
});
formatter.result({
  "duration": 3435949200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 7
    }
  ],
  "location": "DynamicPageSteps.clickButton(String)"
});
formatter.result({
  "duration": 2125905300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.sleepSeconds(int)"
});
formatter.result({
  "duration": 2999721300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Customer",
      "offset": 24
    }
  ],
  "location": "DynamicPageSteps.verifyMessageOnPageDisplayed(String)"
});
formatter.result({
  "duration": 114316300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 35
    }
  ],
  "location": "NewCustomerPageSteps.verifyRegisteredCustomerDetails(int)"
});
formatter.result({
  "duration": 6322178600,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerPageSteps.saveNewCustomerInfo()"
});
formatter.result({
  "duration": 6312617900,
  "status": "passed"
});
formatter.after({
  "duration": 62100,
  "status": "passed"
});
formatter.uri("T03_edit_customer.feature");
formatter.feature({
  "line": 2,
  "name": "EDIT CUSTOMER",
  "description": "As a user\nI want to edit a customer\n  So that verify Edit function work well",
  "id": "edit-customer",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@editcustomer"
    }
  ]
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Edit customer and check edited successfully",
  "description": "",
  "id": "edit-customer;edit-customer-and-check-edited-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@paymentflow"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "read data EditCustomer",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "open \"Edit Customer\" page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "enter CustomerID at Edit Customer page \u003cindex\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "enter Edit Customer details \u003cindex\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "sleep 5 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "verify message on page \"Edit Customer\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "verify Updated Customer details \u003cindex\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "save Edit Customer Info",
  "keyword": "And "
});
formatter.examples({
  "line": 25,
  "name": "Index of Customer in list",
  "description": "",
  "id": "edit-customer;edit-customer-and-check-edited-successfully;index-of-customer-in-list",
  "rows": [
    {
      "cells": [
        "index"
      ],
      "line": 26,
      "id": "edit-customer;edit-customer-and-check-edited-successfully;index-of-customer-in-list;1"
    },
    {
      "cells": [
        "0"
      ],
      "line": 27,
      "id": "edit-customer;edit-customer-and-check-edited-successfully;index-of-customer-in-list;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 133200,
  "status": "passed"
});
formatter.before({
  "duration": 120000,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Edit customer and check edited successfully",
  "description": "",
  "id": "edit-customer;edit-customer-and-check-edited-successfully;index-of-customer-in-list;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@paymentflow"
    },
    {
      "line": 1,
      "name": "@editcustomer"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "read data EditCustomer",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "open \"Edit Customer\" page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "enter CustomerID at Edit Customer page 0",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "enter Edit Customer details 0",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "sleep 5 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "verify message on page \"Edit Customer\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "verify Updated Customer details 0",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "save Edit Customer Info",
  "keyword": "And "
});
formatter.match({
  "location": "EditCustomerPageSteps.readDataEditCustomer()"
});
formatter.result({
  "duration": 6054000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Edit Customer",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.openPage(String)"
});
formatter.result({
  "duration": 1522723900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 39
    }
  ],
  "location": "EditCustomerPageSteps.enterCustomerIDAtEditCustomerPage(int)"
});
formatter.result({
  "duration": 236571600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 7
    }
  ],
  "location": "DynamicPageSteps.clickButton(String)"
});
formatter.result({
  "duration": 1215480300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 28
    }
  ],
  "location": "EditCustomerPageSteps.enterEditCustomerDetails(int)"
});
formatter.result({
  "duration": 2485326700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 7
    }
  ],
  "location": "DynamicPageSteps.clickButton(String)"
});
formatter.result({
  "duration": 1996938800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.sleepSeconds(int)"
});
formatter.result({
  "duration": 5000178000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Edit Customer",
      "offset": 24
    }
  ],
  "location": "DynamicPageSteps.verifyMessageOnPageDisplayed(String)"
});
formatter.result({
  "duration": 124182100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 32
    }
  ],
  "location": "EditCustomerPageSteps.verifyUpdatedCustomerDetails(int)"
});
formatter.result({
  "duration": 6617094100,
  "status": "passed"
});
formatter.match({
  "location": "EditCustomerPageSteps.saveEditCustomerInfo()"
});
formatter.result({
  "duration": 6297859300,
  "status": "passed"
});
formatter.after({
  "duration": 65800,
  "status": "passed"
});
formatter.uri("T04_new_account.feature");
formatter.feature({
  "line": 2,
  "name": "ADD NEW ACCOUNT",
  "description": "As a user\r\nI want to create 2 new accounts\r\n  So that verify create new account function work well",
  "id": "add-new-account",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@newaccount"
    }
  ]
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Create two accounts and check created successfully, then verify \u0027Current Amount\u0027 and \u0027Initial Deposit\u0027 are equal",
  "description": "",
  "id": "add-new-account;create-two-accounts-and-check-created-successfully,-then-verify-\u0027current-amount\u0027-and-\u0027initial-deposit\u0027-are-equal",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@paymentflow"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "read data NewAccount",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "open \"New Account\" page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter New Account details \u003cindex\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click \"submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify message on page \"New Account\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify Created Account details \u003cindex\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "save New Account Info",
  "keyword": "And "
});
formatter.examples({
  "line": 21,
  "name": "Index of Account in list",
  "description": "",
  "id": "add-new-account;create-two-accounts-and-check-created-successfully,-then-verify-\u0027current-amount\u0027-and-\u0027initial-deposit\u0027-are-equal;index-of-account-in-list",
  "rows": [
    {
      "cells": [
        "index"
      ],
      "line": 22,
      "id": "add-new-account;create-two-accounts-and-check-created-successfully,-then-verify-\u0027current-amount\u0027-and-\u0027initial-deposit\u0027-are-equal;index-of-account-in-list;1"
    },
    {
      "cells": [
        "0"
      ],
      "line": 23,
      "id": "add-new-account;create-two-accounts-and-check-created-successfully,-then-verify-\u0027current-amount\u0027-and-\u0027initial-deposit\u0027-are-equal;index-of-account-in-list;2"
    },
    {
      "cells": [
        "1"
      ],
      "line": 24,
      "id": "add-new-account;create-two-accounts-and-check-created-successfully,-then-verify-\u0027current-amount\u0027-and-\u0027initial-deposit\u0027-are-equal;index-of-account-in-list;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 163300,
  "status": "passed"
});
formatter.before({
  "duration": 102400,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Create two accounts and check created successfully, then verify \u0027Current Amount\u0027 and \u0027Initial Deposit\u0027 are equal",
  "description": "",
  "id": "add-new-account;create-two-accounts-and-check-created-successfully,-then-verify-\u0027current-amount\u0027-and-\u0027initial-deposit\u0027-are-equal;index-of-account-in-list;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@paymentflow"
    },
    {
      "line": 1,
      "name": "@newaccount"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "read data NewAccount",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "open \"New Account\" page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter New Account details 0",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click \"submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify message on page \"New Account\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify Created Account details 0",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "save New Account Info",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccountPageSteps.readDataNewAccount()"
});
formatter.result({
  "duration": 25882800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Account",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.openPage(String)"
});
formatter.result({
  "duration": 1975006900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 26
    }
  ],
  "location": "NewAccountPageSteps.enterNewAccountDetails(int)"
});
formatter.result({
  "duration": 624330300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "submit",
      "offset": 7
    }
  ],
  "location": "DynamicPageSteps.clickButton(String)"
});
formatter.result({
  "duration": 1677521500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Account",
      "offset": 24
    }
  ],
  "location": "DynamicPageSteps.verifyMessageOnPageDisplayed(String)"
});
formatter.result({
  "duration": 84428800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 31
    }
  ],
  "location": "NewAccountPageSteps.verifyCreatedAccountDetails(int)"
});
formatter.result({
  "duration": 4457702300,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountPageSteps.saveNewAccountInfo()"
});
formatter.result({
  "duration": 3773509200,
  "status": "passed"
});
formatter.after({
  "duration": 54800,
  "status": "passed"
});
formatter.before({
  "duration": 87500,
  "status": "passed"
});
formatter.before({
  "duration": 45900,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Create two accounts and check created successfully, then verify \u0027Current Amount\u0027 and \u0027Initial Deposit\u0027 are equal",
  "description": "",
  "id": "add-new-account;create-two-accounts-and-check-created-successfully,-then-verify-\u0027current-amount\u0027-and-\u0027initial-deposit\u0027-are-equal;index-of-account-in-list;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@paymentflow"
    },
    {
      "line": 1,
      "name": "@newaccount"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "read data NewAccount",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "open \"New Account\" page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter New Account details 1",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click \"submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify message on page \"New Account\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify Created Account details 1",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "save New Account Info",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccountPageSteps.readDataNewAccount()"
});
formatter.result({
  "duration": 9229500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Account",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.openPage(String)"
});
formatter.result({
  "duration": 633718100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 26
    }
  ],
  "location": "NewAccountPageSteps.enterNewAccountDetails(int)"
});
formatter.result({
  "duration": 545604100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "submit",
      "offset": 7
    }
  ],
  "location": "DynamicPageSteps.clickButton(String)"
});
formatter.result({
  "duration": 1483735800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Account",
      "offset": 24
    }
  ],
  "location": "DynamicPageSteps.verifyMessageOnPageDisplayed(String)"
});
formatter.result({
  "duration": 71644300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 31
    }
  ],
  "location": "NewAccountPageSteps.verifyCreatedAccountDetails(int)"
});
formatter.result({
  "duration": 4163712700,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountPageSteps.saveNewAccountInfo()"
});
formatter.result({
  "duration": 3815671900,
  "status": "passed"
});
formatter.after({
  "duration": 54300,
  "status": "passed"
});
formatter.uri("T05_edit_account.feature");
formatter.feature({
  "line": 2,
  "name": "EDIT ACCOUNT",
  "description": "As a user\r\nI want to edit an account\r\n  So that verify edit account function work well",
  "id": "edit-account",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@editaccount"
    }
  ]
});
formatter.before({
  "duration": 161900,
  "status": "passed"
});
formatter.before({
  "duration": 106200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Edit first account and check type of Account is \u0027Current\u0027",
  "description": "",
  "id": "edit-account;edit-first-account-and-check-type-of-account-is-\u0027current\u0027",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@paymentflow"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "open \"Edit Account\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "enter AccountID at Edit Account page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "enter Edit Account details",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "sleep 5 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "verify message on page \"Edit Account\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "verify Updated Account details",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "save Edit Account Info",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Edit Account",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.openPage(String)"
});
formatter.result({
  "duration": 2797761700,
  "status": "passed"
});
formatter.match({
  "location": "EditAccountPageSteps.enterAccountIDAtEditAccountPage()"
});
formatter.result({
  "duration": 220143800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 7
    }
  ],
  "location": "DynamicPageSteps.clickButton(String)"
});
formatter.result({
  "duration": 2980021100,
  "status": "passed"
});
formatter.match({
  "location": "EditAccountPageSteps.enterEditAccountDetails()"
});
formatter.result({
  "duration": 275990600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 7
    }
  ],
  "location": "DynamicPageSteps.clickButton(String)"
});
formatter.result({
  "duration": 1755474600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.sleepSeconds(int)"
});
formatter.result({
  "duration": 5000585700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Edit Account",
      "offset": 24
    }
  ],
  "location": "DynamicPageSteps.verifyMessageOnPageDisplayed(String)"
});
formatter.result({
  "duration": 160181500,
  "status": "passed"
});
formatter.match({
  "location": "EditAccountPageSteps.verifyUpdatedAccountDetails()"
});
formatter.result({
  "duration": 4597526700,
  "status": "passed"
});
formatter.match({
  "location": "EditAccountPageSteps.saveEditAccountInfo()"
});
formatter.result({
  "duration": 3688426600,
  "status": "passed"
});
formatter.after({
  "duration": 59300,
  "status": "passed"
});
formatter.uri("T06_deposit.feature");
formatter.feature({
  "line": 2,
  "name": "DEPOSIT",
  "description": "As a user\r\nI want to tranfer money into an account\r\n  So that verify deposit function work well",
  "id": "deposit",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@deposit"
    }
  ]
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Transfer money into a current account and check account balance equal 55,000",
  "description": "",
  "id": "deposit;transfer-money-into-a-current-account-and-check-account-balance-equal-55,000",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@paymentflow"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "read data Transaction input",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "open \"Deposit\" page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter Deposit details \u003cindex\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify message on page Deposit displayed \u003cindex\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "update Balance of Account \u003cindex\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "verify Deposit details \u003cindex\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "save Transaction info",
  "keyword": "And "
});
formatter.examples({
  "line": 22,
  "name": "Transfer index",
  "description": "",
  "id": "deposit;transfer-money-into-a-current-account-and-check-account-balance-equal-55,000;transfer-index",
  "rows": [
    {
      "cells": [
        "index"
      ],
      "line": 23,
      "id": "deposit;transfer-money-into-a-current-account-and-check-account-balance-equal-55,000;transfer-index;1"
    },
    {
      "cells": [
        "0"
      ],
      "line": 24,
      "id": "deposit;transfer-money-into-a-current-account-and-check-account-balance-equal-55,000;transfer-index;2"
    },
    {
      "cells": [
        "1"
      ],
      "line": 25,
      "id": "deposit;transfer-money-into-a-current-account-and-check-account-balance-equal-55,000;transfer-index;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 75100,
  "status": "passed"
});
formatter.before({
  "duration": 45300,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Transfer money into a current account and check account balance equal 55,000",
  "description": "",
  "id": "deposit;transfer-money-into-a-current-account-and-check-account-balance-equal-55,000;transfer-index;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@paymentflow"
    },
    {
      "line": 1,
      "name": "@deposit"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "read data Transaction input",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "open \"Deposit\" page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter Deposit details 0",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify message on page Deposit displayed 0",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "update Balance of Account 0",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "verify Deposit details 0",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "save Transaction info",
  "keyword": "And "
});
formatter.match({
  "location": "DepositPageSteps.readDataTransactionInput()"
});
formatter.result({
  "duration": 7142400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deposit",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.openPage(String)"
});
formatter.result({
  "duration": 2535555900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 22
    }
  ],
  "location": "DepositPageSteps.enterDepositDetails(int)"
});
formatter.result({
  "duration": 662419300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 7
    }
  ],
  "location": "DynamicPageSteps.clickButton(String)"
});
formatter.result({
  "duration": 1643928100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 41
    }
  ],
  "location": "DepositPageSteps.verifyMessageOnPageDepositDisplayed(int)"
});
formatter.result({
  "duration": 85223200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 26
    }
  ],
  "location": "DepositPageSteps.updateBalanceOfAccount(int)"
});
formatter.result({
  "duration": 8172800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 23
    }
  ],
  "location": "DepositPageSteps.verifyDepositDetails(int)"
});
formatter.result({
  "duration": 3658691200,
  "status": "passed"
});
formatter.match({
  "location": "DepositPageSteps.saveTransactionInfo()"
});
formatter.result({
  "duration": 3392399400,
  "status": "passed"
});
formatter.after({
  "duration": 43700,
  "status": "passed"
});
formatter.before({
  "duration": 106700,
  "status": "passed"
});
formatter.before({
  "duration": 74200,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Transfer money into a current account and check account balance equal 55,000",
  "description": "",
  "id": "deposit;transfer-money-into-a-current-account-and-check-account-balance-equal-55,000;transfer-index;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@paymentflow"
    },
    {
      "line": 1,
      "name": "@deposit"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "read data Transaction input",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "open \"Deposit\" page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter Deposit details 1",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify message on page Deposit displayed 1",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "update Balance of Account 1",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "verify Deposit details 1",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "save Transaction info",
  "keyword": "And "
});
formatter.match({
  "location": "DepositPageSteps.readDataTransactionInput()"
});
formatter.result({
  "duration": 4088800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deposit",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.openPage(String)"
});
formatter.result({
  "duration": 2951099400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 22
    }
  ],
  "location": "DepositPageSteps.enterDepositDetails(int)"
});
formatter.result({
  "duration": 652281900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 7
    }
  ],
  "location": "DynamicPageSteps.clickButton(String)"
});
formatter.result({
  "duration": 1788024300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 41
    }
  ],
  "location": "DepositPageSteps.verifyMessageOnPageDepositDisplayed(int)"
});
formatter.result({
  "duration": 79708800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 26
    }
  ],
  "location": "DepositPageSteps.updateBalanceOfAccount(int)"
});
formatter.result({
  "duration": 7812600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 23
    }
  ],
  "location": "DepositPageSteps.verifyDepositDetails(int)"
});
formatter.result({
  "duration": 3467072300,
  "status": "passed"
});
formatter.match({
  "location": "DepositPageSteps.saveTransactionInfo()"
});
formatter.result({
  "duration": 3510439800,
  "status": "passed"
});
formatter.after({
  "duration": 44300,
  "status": "passed"
});
formatter.uri("T10_delete_account.feature");
formatter.feature({
  "line": 2,
  "name": "DELETE ACCOUNT",
  "description": "As a user\nI want to delete accounts\n  So that verify delete account function work well",
  "id": "delete-account",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@deleteaccount"
    }
  ]
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Delete all account of an customer and check deleted successfully",
  "description": "",
  "id": "delete-account;delete-all-account-of-an-customer-and-check-deleted-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@paymentflow"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 13,
      "value": "#delete all accounts of 1st customer of 1st email in list User"
    }
  ],
  "line": 14,
  "name": "open \"Delete Account\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "enter AccountID at Delete Account page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify alert message \"Do you really want to delete this Account?\" displayed and accept",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify alert message \"Account Deleted Sucessfully\" displayed and accept",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "delete account",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "open \"Edit Account\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "enter Deleted AccountID at Edit Account page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "verify alert message \"Account does not exist\" displayed and accept",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "Account index",
  "description": "",
  "id": "delete-account;delete-all-account-of-an-customer-and-check-deleted-successfully;account-index",
  "rows": [
    {
      "cells": [
        "index"
      ],
      "line": 26,
      "id": "delete-account;delete-all-account-of-an-customer-and-check-deleted-successfully;account-index;1"
    },
    {
      "cells": [
        "0"
      ],
      "line": 27,
      "id": "delete-account;delete-all-account-of-an-customer-and-check-deleted-successfully;account-index;2"
    },
    {
      "cells": [
        "1"
      ],
      "line": 28,
      "id": "delete-account;delete-all-account-of-an-customer-and-check-deleted-successfully;account-index;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 115300,
  "status": "passed"
});
formatter.before({
  "duration": 72800,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Delete all account of an customer and check deleted successfully",
  "description": "",
  "id": "delete-account;delete-all-account-of-an-customer-and-check-deleted-successfully;account-index;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@paymentflow"
    },
    {
      "line": 1,
      "name": "@deleteaccount"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 13,
      "value": "#delete all accounts of 1st customer of 1st email in list User"
    }
  ],
  "line": 14,
  "name": "open \"Delete Account\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "enter AccountID at Delete Account page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify alert message \"Do you really want to delete this Account?\" displayed and accept",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify alert message \"Account Deleted Sucessfully\" displayed and accept",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "delete account",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "open \"Edit Account\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "enter Deleted AccountID at Edit Account page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "verify alert message \"Account does not exist\" displayed and accept",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Delete Account",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.openPage(String)"
});
formatter.result({
  "duration": 2573533700,
  "status": "passed"
});
formatter.match({
  "location": "DeleteAccountPageSteps.enterAccountIDAtDeleteAccountPage()"
});
formatter.result({
  "duration": 225039300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 7
    }
  ],
  "location": "DynamicPageSteps.clickButton(String)"
});
formatter.result({
  "duration": 240892400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Do you really want to delete this Account?",
      "offset": 22
    }
  ],
  "location": "DynamicPageSteps.verifyAlertMessageDisplayedAndAccept(String)"
});
formatter.result({
  "duration": 2040372500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account Deleted Sucessfully",
      "offset": 22
    }
  ],
  "location": "DynamicPageSteps.verifyAlertMessageDisplayedAndAccept(String)"
});
formatter.result({
  "duration": 2023868400,
  "status": "passed"
});
formatter.match({
  "location": "DeleteAccountPageSteps.deleteAccount()"
});
formatter.result({
  "duration": 8670100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Edit Account",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.openPage(String)"
});
formatter.result({
  "duration": 1850600400,
  "status": "passed"
});
formatter.match({
  "location": "EditAccountPageSteps.enterDeletedAccountIDAtEditAccountPage()"
});
formatter.result({
  "duration": 198322700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 7
    }
  ],
  "location": "DynamicPageSteps.clickButton(String)"
});
formatter.result({
  "duration": 791205500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account does not exist",
      "offset": 22
    }
  ],
  "location": "DynamicPageSteps.verifyAlertMessageDisplayedAndAccept(String)"
});
formatter.result({
  "duration": 2008821700,
  "status": "passed"
});
formatter.after({
  "duration": 87000,
  "status": "passed"
});
formatter.before({
  "duration": 151800,
  "status": "passed"
});
formatter.before({
  "duration": 102400,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Delete all account of an customer and check deleted successfully",
  "description": "",
  "id": "delete-account;delete-all-account-of-an-customer-and-check-deleted-successfully;account-index;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@paymentflow"
    },
    {
      "line": 1,
      "name": "@deleteaccount"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 13,
      "value": "#delete all accounts of 1st customer of 1st email in list User"
    }
  ],
  "line": 14,
  "name": "open \"Delete Account\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "enter AccountID at Delete Account page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify alert message \"Do you really want to delete this Account?\" displayed and accept",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify alert message \"Account Deleted Sucessfully\" displayed and accept",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "delete account",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "open \"Edit Account\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "enter Deleted AccountID at Edit Account page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "verify alert message \"Account does not exist\" displayed and accept",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Delete Account",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.openPage(String)"
});
formatter.result({
  "duration": 1474511900,
  "status": "passed"
});
formatter.match({
  "location": "DeleteAccountPageSteps.enterAccountIDAtDeleteAccountPage()"
});
formatter.result({
  "duration": 217003100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 7
    }
  ],
  "location": "DynamicPageSteps.clickButton(String)"
});
formatter.result({
  "duration": 144673700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Do you really want to delete this Account?",
      "offset": 22
    }
  ],
  "location": "DynamicPageSteps.verifyAlertMessageDisplayedAndAccept(String)"
});
formatter.result({
  "duration": 2009286000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account Deleted Sucessfully",
      "offset": 22
    }
  ],
  "location": "DynamicPageSteps.verifyAlertMessageDisplayedAndAccept(String)"
});
formatter.result({
  "duration": 2025380700,
  "status": "passed"
});
formatter.match({
  "location": "DeleteAccountPageSteps.deleteAccount()"
});
formatter.result({
  "duration": 18983100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Edit Account",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.openPage(String)"
});
formatter.result({
  "duration": 1568360500,
  "status": "passed"
});
formatter.match({
  "location": "EditAccountPageSteps.enterDeletedAccountIDAtEditAccountPage()"
});
formatter.result({
  "duration": 207996100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 7
    }
  ],
  "location": "DynamicPageSteps.clickButton(String)"
});
formatter.result({
  "duration": 748851100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account does not exist",
      "offset": 22
    }
  ],
  "location": "DynamicPageSteps.verifyAlertMessageDisplayedAndAccept(String)"
});
formatter.result({
  "duration": 2014089100,
  "status": "passed"
});
formatter.after({
  "duration": 47600,
  "status": "passed"
});
formatter.uri("T11_delete_customer.feature");
formatter.feature({
  "line": 2,
  "name": "DELETE CUSTOMER",
  "description": "As a user\nI want to delete a customer\n  So that verify edit customer function work well",
  "id": "delete-customer",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@deletecustomer"
    }
  ]
});
formatter.before({
  "duration": 214700,
  "status": "passed"
});
formatter.before({
  "duration": 91800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Delete first customer and check deleted successfully",
  "description": "",
  "id": "delete-customer;delete-first-customer-and-check-deleted-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@paymentflow"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "open \"Delete Customer\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "enter CustomerID at Delete Customer page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "verify alert message \"Do you really want to delete this Customer?\" displayed and accept",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "verify alert message \"Customer deleted Successfully\" displayed and accept",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "delete customer",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "open \"Edit Customer\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "enter Deleted CustomerID at Edit Customer page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "click \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "verify alert message \"Customer does not exist!!\" displayed and accept",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Delete Customer",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.openPage(String)"
});
formatter.result({
  "duration": 1688747800,
  "status": "passed"
});
formatter.match({
  "location": "DeleteCustomerPageSteps.enterCustomerIDAtDeleteCustomerPage()"
});
formatter.result({
  "duration": 212638000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 7
    }
  ],
  "location": "DynamicPageSteps.clickButton(String)"
});
formatter.result({
  "duration": 124153900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Do you really want to delete this Customer?",
      "offset": 22
    }
  ],
  "location": "DynamicPageSteps.verifyAlertMessageDisplayedAndAccept(String)"
});
formatter.result({
  "duration": 2076810800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer deleted Successfully",
      "offset": 22
    }
  ],
  "location": "DynamicPageSteps.verifyAlertMessageDisplayedAndAccept(String)"
});
formatter.result({
  "duration": 2042448400,
  "status": "passed"
});
formatter.match({
  "location": "DeleteCustomerPageSteps.deleteCustomer()"
});
formatter.result({
  "duration": 67198500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Edit Customer",
      "offset": 6
    }
  ],
  "location": "DynamicPageSteps.openPage(String)"
});
formatter.result({
  "duration": 1769869800,
  "status": "passed"
});
formatter.match({
  "location": "EditCustomerPageSteps.enterDeletedCustomerIDAtEditCustomerPage()"
});
formatter.result({
  "duration": 209499900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 7
    }
  ],
  "location": "DynamicPageSteps.clickButton(String)"
});
formatter.result({
  "duration": 476262100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer does not exist!!",
      "offset": 22
    }
  ],
  "location": "DynamicPageSteps.verifyAlertMessageDisplayedAndAccept(String)"
});
formatter.result({
  "duration": 2014635200,
  "status": "passed"
});
formatter.after({
  "duration": 115800,
  "status": "passed"
});
});