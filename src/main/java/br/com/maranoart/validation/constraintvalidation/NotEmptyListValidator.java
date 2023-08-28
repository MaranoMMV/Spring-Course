package br.com.maranoart.validation.constraintvalidation;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.maranoart.validation.NotEmptyList;

public class NotEmptyListValidator implements ConstraintValidator<NotEmptyList, List>{

    @Override
    public boolean isValid(List list, ConstraintValidatorContext contextValidatorContext) {
        return list != null && !list.isEmpty() ;
    }

    @Override
    public void initialize(NotEmptyList constraintAnnotation){
        constraintAnnotation.message();
    }

    
}