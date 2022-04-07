package spring.study.scan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.study.SpringStudyApplication;

public class BeanScanTest {

	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringStudyApplication.class);

	@Test
	@DisplayName("빈 설정 메타정보 확인")
	void findApplicationBean() {
		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);
			if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
				System.out.println("beanDefinitionName = " + beanDefinitionName + " beanDefinition = " + beanDefinition);
			}

		}
	}
}
