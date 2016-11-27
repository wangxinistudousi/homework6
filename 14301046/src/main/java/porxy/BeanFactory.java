package porxy;

public interface BeanFactory {
	Object getBean(String beanName);
	void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
