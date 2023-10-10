package web.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import web.model.User;
import web.service.UserService;

@Component
public class UserValidator implements Validator {

    private final UserService userService;
    @Autowired
    public UserValidator(UserService userService) {
        this.userService = userService;
    }
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        if (userService.show(user.getEmail()).isPresent()){
            System.err.println("Проверяем mail");
            errors.rejectValue("email", "","Email is already taken");
        };
    }
}
