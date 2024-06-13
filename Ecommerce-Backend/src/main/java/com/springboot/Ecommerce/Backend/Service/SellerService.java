package com.springboot.Ecommerce.Backend.Service;
import com.springboot.Ecommerce.Backend.Exception.*;
import com.springboot.Ecommerce.Backend.Models.Seller;
import com.springboot.Ecommerce.Backend.Models.SellerDTO;
import com.springboot.Ecommerce.Backend.Models.SessionDTO;

import java.util.List;

public interface SellerService {

    public Seller addSeller(Seller seller);

    public List<Seller> getAllSellers() throws SellerException;

    public Seller getSellerById(Integer sellerId)throws SellerException;

    public Seller getSellerByMobile(String mobile, String token) throws SellerException;

    public Seller getCurrentlyLoggedInSeller(String token) throws SellerException;

    public SessionDTO updateSellerPassword(SellerDTO sellerDTO, String token) throws SellerException;

    public Seller updateSeller(Seller seller, String token)throws SellerException;

    public Seller updateSellerMobile(SellerDTO sellerdto, String token)throws SellerException;

    public Seller deleteSellerById(Integer sellerId, String token)throws SellerException;
}
