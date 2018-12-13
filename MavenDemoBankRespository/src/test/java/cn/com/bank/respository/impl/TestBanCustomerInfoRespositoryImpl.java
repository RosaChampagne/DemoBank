package cn.com.bank.respository.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.com.bank.DemoBankRespositoryStart;
import cn.com.bank.entity.BankCustomerInfo;
import cn.com.bank.respository.IBankCustomerInfoRespository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoBankRespositoryStart.class)
public class TestBanCustomerInfoRespositoryImpl {
    @Autowired
    private IBankCustomerInfoRespository cInfoRespository;

    @Test
    public void testAddCustomerInfo() {
        BankCustomerInfo customerInfo = new BankCustomerInfo();
        customerInfo.setCmName("test1");
        customerInfo.setCmPhone("0101010101");
        customerInfo.setCmHeadImg("testImg");

        this.cInfoRespository.addCustomerInfo(customerInfo);
        System.out.println(customerInfo);
        Assert.assertNotNull(customerInfo);
    }

    @Test
    public void test() {
        List<BankCustomerInfo> customerInfos = this.cInfoRespository.selectAllCustomer();
        for (BankCustomerInfo bankCustomerInfo : customerInfos) {
            System.out.println(bankCustomerInfo);
        }
        Assert.assertTrue(customerInfos.size()>0);
    }

}
