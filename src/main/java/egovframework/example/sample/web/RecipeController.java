package egovframework.example.sample.web;

import egovframework.example.sample.service.CustomerApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe/customerinfo")
public class RecipeController {

    @Autowired
    private CustomerApiService customerApiService;

    @GetMapping(path = "/{customerId}")
    public String getCustomerInfo(@PathVariable String customerId) {
        String customerInfo = customerApiService.getCustomerDetail(customerId);
        System.out.println("response customerInfo : " + customerInfo);
        return String.format("[Customer id = %s at %s %s ]", customerId,
                System.currentTimeMillis(), customerInfo);
    }

}
