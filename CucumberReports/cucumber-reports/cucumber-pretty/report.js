$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SeleniumTest1.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: rana05.akki@gmail.com"
    }
  ],
  "line": 3,
  "name": "Selenium Test Assignments Features",
  "description": "",
  "id": "selenium-test-assignments-features",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@SeleniumAssignment"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "Login Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on home page of application \"https://jqueryui.com/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://jqueryui.com/",
      "offset": 34
    }
  ],
  "location": "Selectable_StepDef.i_am_on_home_page_of_application(String)"
});
formatter.result({
  "duration": 5687302500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Test Drag and Drop Scenario",
  "description": "",
  "id": "selenium-test-assignments-features;test-drag-and-drop-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@DragAndDrop"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I select Droppable option from left menu under interactions",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Drag Drag me to my target component to Drop here component",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be able to able to drag and drop",
  "keyword": "Then "
});
formatter.match({
  "location": "Droppable_StepDef.i_select_Droppable_option_from_left_menu_under_interactions()"
});
formatter.result({
  "duration": 2637796700,
  "status": "passed"
});
formatter.match({
  "location": "Droppable_StepDef.drag_Drag_me_to_my_target_component_to_Drop_here_component()"
});
formatter.result({
  "duration": 671906200,
  "status": "passed"
});
formatter.match({
  "location": "Droppable_StepDef.i_should_be_able_to_able_to_drag_and_drop()"
});
formatter.result({
  "duration": 71289100,
  "status": "passed"
});
formatter.after({
  "duration": 190087900,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Test Multiple Select Options",
  "description": "",
  "id": "selenium-test-assignments-features;test-multiple-select-options",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@MultipleSelect"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I select Selectable option from left menu under interactions",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Select items \"\u003cItems\u003e\" from options",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should be able to verify that the multiple select option is allowed",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "selenium-test-assignments-features;test-multiple-select-options;",
  "rows": [
    {
      "cells": [
        "Items"
      ],
      "line": 21,
      "id": "selenium-test-assignments-features;test-multiple-select-options;;1"
    },
    {
      "cells": [
        "Item 1;Item 3;Item 5"
      ],
      "line": 22,
      "id": "selenium-test-assignments-features;test-multiple-select-options;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 5,
  "name": "Login Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on home page of application \"https://jqueryui.com/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://jqueryui.com/",
      "offset": 34
    }
  ],
  "location": "Selectable_StepDef.i_am_on_home_page_of_application(String)"
});
formatter.result({
  "duration": 5169280600,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Test Multiple Select Options",
  "description": "",
  "id": "selenium-test-assignments-features;test-multiple-select-options;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@MultipleSelect"
    },
    {
      "line": 2,
      "name": "@SeleniumAssignment"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I select Selectable option from left menu under interactions",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Select items \"Item 1;Item 3;Item 5\" from options",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should be able to verify that the multiple select option is allowed",
  "keyword": "Then "
});
formatter.match({
  "location": "Selectable_StepDef.i_select_Selectable_option_from_left_menu_under_interactions()"
});
formatter.result({
  "duration": 2926694800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Item 1;Item 3;Item 5",
      "offset": 14
    }
  ],
  "location": "Selectable_StepDef.select_items_from_options(String)"
});
formatter.result({
  "duration": 7220814400,
  "status": "passed"
});
formatter.match({
  "location": "Selectable_StepDef.i_should_be_able_to_verify_that_the_multiple_select_option_is_allowed()"
});
formatter.result({
  "duration": 25300,
  "status": "passed"
});
formatter.after({
  "duration": 344160000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 26,
  "name": "Test Control Group",
  "description": "",
  "id": "selenium-test-assignments-features;test-control-group",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 25,
      "name": "@ControlGroup"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "I select Controlgroup option from left menu under interactions",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "enter booking details for Horizontal orientation like Vehicle Option \"\u003cVehicleOption1\u003e\" Type \"\u003cVehicleType1\u003e\" number \"\u003cNumber1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "enter booking details for Vertical orintation like Vehicle Option \"\u003cVehicleOption2\u003e\" Type \"\u003cVehicleType2\u003e\" number \"\u003cNumber2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "opt for Insurance for either case",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "click on Book Now Button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Booking should be Successful",
  "keyword": "Then "
});
formatter.examples({
  "line": 34,
  "name": "",
  "description": "",
  "id": "selenium-test-assignments-features;test-control-group;",
  "rows": [
    {
      "cells": [
        "VehicleOption1",
        "VehicleOption2",
        "VehicleType1",
        "VehicleType2",
        "Number1",
        "Number2"
      ],
      "line": 35,
      "id": "selenium-test-assignments-features;test-control-group;;1"
    },
    {
      "cells": [
        "SUV",
        "Truck",
        "Automatic",
        "Standard",
        "2",
        "1"
      ],
      "line": 36,
      "id": "selenium-test-assignments-features;test-control-group;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 5,
  "name": "Login Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on home page of application \"https://jqueryui.com/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://jqueryui.com/",
      "offset": 34
    }
  ],
  "location": "Selectable_StepDef.i_am_on_home_page_of_application(String)"
});
formatter.result({
  "duration": 6094194400,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Test Control Group",
  "description": "",
  "id": "selenium-test-assignments-features;test-control-group;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SeleniumAssignment"
    },
    {
      "line": 25,
      "name": "@ControlGroup"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "I select Controlgroup option from left menu under interactions",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "enter booking details for Horizontal orientation like Vehicle Option \"SUV\" Type \"Automatic\" number \"2\"",
  "matchedColumns": [
    0,
    2,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "enter booking details for Vertical orintation like Vehicle Option \"Truck\" Type \"Standard\" number \"1\"",
  "matchedColumns": [
    1,
    3,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "opt for Insurance for either case",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "click on Book Now Button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Booking should be Successful",
  "keyword": "Then "
});
formatter.match({
  "location": "ControlGroup_StepDef.i_select_Controlgroup_option_from_left_menu_under_interactions()"
});
formatter.result({
  "duration": 4008647700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SUV",
      "offset": 70
    },
    {
      "val": "Automatic",
      "offset": 81
    },
    {
      "val": "2",
      "offset": 100
    }
  ],
  "location": "ControlGroup_StepDef.enter_booking_details_for_Horizontal_orientation_like_Vehicle_Option_Type_number(String,String,String)"
});
formatter.result({
  "duration": 902649500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Truck",
      "offset": 67
    },
    {
      "val": "Standard",
      "offset": 80
    },
    {
      "val": "1",
      "offset": 98
    }
  ],
  "location": "ControlGroup_StepDef.enter_booking_details_for_Vertical_orintation_like_Vehicle_Option_Type_number(String,String,String)"
});
formatter.result({
  "duration": 661097200,
  "status": "passed"
});
formatter.match({
  "location": "ControlGroup_StepDef.opt_for_Insurance_for_either_case()"
});
formatter.result({
  "duration": 336905900,
  "status": "passed"
});
formatter.match({
  "location": "ControlGroup_StepDef.click_on_Book_Now_Button()"
});
formatter.result({
  "duration": 138331600,
  "status": "passed"
});
formatter.match({
  "location": "ControlGroup_StepDef.booking_should_be_Successful()"
});
formatter.result({
  "duration": 29600,
  "status": "passed"
});
formatter.after({
  "duration": 177247900,
  "status": "passed"
});
});