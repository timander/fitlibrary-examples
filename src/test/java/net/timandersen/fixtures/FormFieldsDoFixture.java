package net.timandersen.fixtures;

import fitlibrary.DoFixture;
import net.timandersen.testutil.FormFields;
import java.util.Arrays;


public class FormFieldsDoFixture extends DoFixture {


    public boolean submitsFormWith(FormFields fields) {
        System.out.println("fields.firstName = " + fields.firstName);
        //translate your fields into a MockHttpRequest
        //invoke your controller
        return true;
    }

    public String[] seesValidationErrors() {
        return Arrays.asList("some.problem.happend").toArray(new String[]{});
    }

}
