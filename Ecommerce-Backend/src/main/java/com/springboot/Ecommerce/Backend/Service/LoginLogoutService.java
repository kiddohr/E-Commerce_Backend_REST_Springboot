package com.springboot.Ecommerce.Backend.Service;

import com.springboot.Ecommerce.Backend.Models.CustomerDTO;
import com.springboot.Ecommerce.Backend.Models.SellerDTO;
import com.springboot.Ecommerce.Backend.Models.SessionDTO;
import com.springboot.Ecommerce.Backend.Models.UserSession;

public interface LoginLogoutService {

    public UserSession loginCustomer(CustomerDTO customer);

    public SessionDTO logoutCustomer(SessionDTO session);

    public void checkTokenStatus(String token);

    public void deleteExpiredTokens();


    public UserSession loginSeller(SellerDTO seller);

    public SessionDTO logoutSeller(SessionDTO session);
}
