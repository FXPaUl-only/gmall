package cn.fxpaul.gmall.pms;

import cn.fxpaul.gmall.pms.entity.Product;
import cn.fxpaul.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    private ProductService productService;


    /**
     *测试查询
     */
    @Test
    void contextLoads() {
        Product byId = productService.getById(1);
        System.out.println(byId.getName());


    }

}
