package egovframework.example.sample.service.impl;

import egovframework.example.sample.service.CustomerApiService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerApiServiceImpl implements CustomerApiService {

    private RestTemplate restTemplate;
    public CustomerApiServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public String getCustomerDetail(String customerId) {
        return restTemplate.getForObject("http://localhost:8081/recipe/" + customerId,
                String.class);
    }
}
