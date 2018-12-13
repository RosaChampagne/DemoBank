package cn.com.bank.respository;

import java.util.List;

import cn.com.bank.entity.BankCustomerInfo;

public interface IBankCustomerInfoRespository {
    public BankCustomerInfo addCustomerInfo(BankCustomerInfo customerInfo);
    public List<BankCustomerInfo> selectAllCustomer();
}
