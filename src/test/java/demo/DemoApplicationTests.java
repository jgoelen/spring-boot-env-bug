package demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class DemoApplicationTests {

  @Autowired
  RoleServiceProperties roleServiceProperties;

  @Test
  public void contextLoads() {
      Assert.assertNotNull(System.getenv("ROLE_SERVICE_TIMEOUT"));
      Assert.assertNotNull(roleServiceProperties.getTimeout());
      Assert.assertNotNull(roleServiceProperties.getUrl());
  }


}
