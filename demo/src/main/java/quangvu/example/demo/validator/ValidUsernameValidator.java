package quangvu.example.demo.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import quangvu.example.demo.repository.IUserRepository;
import quangvu.example.demo.validator.annotation.ValidUsername;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername,String> {
    @Autowired
    private IUserRepository userRepository;
    @Override
    public boolean isValid(String username, ConstraintValidatorContext context){
        if(userRepository==null)
            return true;
        return userRepository.findByUsername(username) == null;
    }
}
