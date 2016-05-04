import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.myblog.action.RegisterAction;


public class test {
	public static void main(String[] args){
		ApplicationContext c1 = new FileSystemXmlApplicationContext(new String[] {"classpath:applicationContext.xml"});
		RegisterAction registerAction =(RegisterAction)c1.getBean("RegisterAction");
		
	}

}
