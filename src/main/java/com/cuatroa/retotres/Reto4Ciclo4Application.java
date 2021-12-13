package com.cuatroa.retotres;
import com.cuatroa.retotres.model.Product;
import com.cuatroa.retotres.model.Order;
import com.cuatroa.retotres.model.User;
import com.cuatroa.retotres.repository.crud.ProductCrudRepository;
import com.cuatroa.retotres.repository.crud.OrderCrudRepository;
import com.cuatroa.retotres.repository.crud.UserCrudRepository;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto4Ciclo4Application implements CommandLineRunner {

    @Autowired
    private ProductCrudRepository interfaceChocolate;
    @Autowired
    private UserCrudRepository interfaceUser;
    @Autowired
    private OrderCrudRepository interfaceOrder;

    public static void main(String[] args) {
        SpringApplication.run(Reto4Ciclo4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        interfaceChocolate.deleteAll();
        interfaceUser.deleteAll();
        interfaceOrder.deleteAll(); 

    }
}
