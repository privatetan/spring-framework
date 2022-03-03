import config.SysConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudyMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SysConfig.class);
		System.out.println(annotationConfigApplicationContext);
	}
}
