package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintValidator;

public class PartInventoryValidator implements ConstraintValidator<ValidInventory, Part> {

    @Autowired
    private ApplicationContext context;
    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidInventory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() >= part.getMinimum();
    }


}
