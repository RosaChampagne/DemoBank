package cn.com.bank.respository;

import java.util.List;

import cn.com.bank.entity.BankCustomerInfo;

public interface IBankCustomerInfoRespository {
    /**
     * 11修改
     * @param customerInfo
     * @return
     */
    public BankCustomerInfo addCustomerInfo(BankCustomerInfo customerInfo);
    public List<BankCustomerInfo> selectAllCustomer();
}
