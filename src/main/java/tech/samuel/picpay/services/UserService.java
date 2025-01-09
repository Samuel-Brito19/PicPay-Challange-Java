package tech.samuel.picpay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.samuel.picpay.domain.user.User;
import tech.samuel.picpay.domain.user.UserType;
import tech.samuel.picpay.repositories.UserRepository;

import java.math.BigDecimal;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if(sender.getUserType() == UserType.MERCHANT) {
            throw new Exception("Usário do tipo lojista não está autorizado a realizar transação");
        }
    }
}
