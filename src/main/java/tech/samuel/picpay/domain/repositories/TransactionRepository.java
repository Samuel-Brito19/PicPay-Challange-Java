package tech.samuel.picpay.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.samuel.picpay.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
