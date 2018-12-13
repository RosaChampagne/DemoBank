package cn.com.bank.respository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

import cn.com.bank.entity.BankCustomerInfo;
import cn.com.bank.mapper.BankCustomerInfoMapper;
import cn.com.bank.respository.IBankCustomerInfoRespository;

@Service(
        version="${dubbo.service.version}",
        application="${dubbo.application.id}",
        protocol="${dubbo.protocol.id}",
        registry="${dubbo.registry.id}"
        )
public class BankCustomerInfoRespositoryImpl implements IBankCustomerInfoRespository {

    @Autowired
    private BankCustomerInfoMapper customerMapper;
    @Override
    public BankCustomerInfo addCustomerInfo(BankCustomerInfo customerInfo) {
        BankCustomerInfo customerInfo2 = null;
        int count = this.customerMapper.insert(customerInfo);
        if (count > 0) {
            customerInfo2 = customerInfo;
        }
        return customerInfo2;
    }

    @Override
    public List<BankCustomerInfo> selectAllCustomer() {
        return this.customerMapper.selectByExample(null);
    }

}
