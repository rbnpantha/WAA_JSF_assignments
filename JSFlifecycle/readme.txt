Step 1: Since it is a initial request there is nothing to restore hence an empty view is created which is posted back.
Step 2: The values entered by the user for car details are set here like car id=3, name=”Alto” and color=”blue”.
Step 3: Here the validations related to car id, name and color are checked. Since there are no validations set no processing is done here. Suppose, we make car id as mandatory and submit the page with the car id as null, the validator generates error messages and proceeds to the last step which is the render response.

Step 4: In the model phase the values from the page are extracted and inserted into the corresponding variables in the car bean. Clear all method is mapped and functionality of clear all is accomplished here if requested.

Step 5: Here the click of reset button is handled. The view to be rendered is constructed here. This is the result of triggering a functionality in step 4. For example, when we clear the fields, the bean method is executed and the new view is constructed with all the field values set to null.
Step 6: The view page addDetailsPage.xhtml with the final result and field values is rendered. In this example it is a page with all the fields set to blank values.