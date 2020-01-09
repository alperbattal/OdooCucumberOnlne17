<<<<<<< HEAD
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Sales.feature");
formatter.feature({
  "name": "Sales",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Sales"
    }
  ]
});
formatter.background({
  "name": "open login page and login as sales manager",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinitions.user_can_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can login with username \"salesmanager60@info.com\" and password \"salesmanager\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinitions.user_can_login_with_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify column names",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sales"
    }
  ]
});
formatter.step({
  "name": "user navigates to \"Sales\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SalesDefinitions.user_navigates_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that column names are displayed",
  "rows": [
    {
      "cells": [
        "Quotation Number"
      ]
    },
    {
      "cells": [
        "Quotation Date"
      ]
    },
    {
      "cells": [
        "Customer"
      ]
    },
    {
      "cells": [
        "Salesperson"
      ]
    },
    {
      "cells": [
        "Total"
      ]
    },
    {
      "cells": [
        "Status"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SalesDefinitions.user_verifies_that_column_names_are_displayed(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
=======
>>>>>>> master
