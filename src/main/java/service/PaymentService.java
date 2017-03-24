package service;

import dao.PaymentDao;
import entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    PaymentDao paymentDao;

    public List<Payment> getAll() {
        List<Payment> payments = (List<Payment>) paymentDao.findAll();
        return payments;
    }

    public Payment getById(Integer id) {
        return paymentDao.findOne(id);
    }

    public void addPayment(Payment payment) {
        paymentDao.save(payment);
    }

    public void addPayments(List<Payment> payments) {
        paymentDao.save(payments);
    }

    public void deletePayment(Payment payment) {
        paymentDao.delete(payment);
    }

    public void deletePayment(Integer id) {
        paymentDao.delete(id);
    }

    public void deletePayments(List<Payment> payments) {
        paymentDao.delete(payments);
    }
}
