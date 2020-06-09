package cn.seven.config;

import cn.seven.interceptor.PreInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName:    webConfig
 * Package:    cn.seven.config
 * Description:
 * Datetime:    2020/5/5   20:48
 *
 * @Author: charon
 */
@Configuration
@EnableWebMvc
public class InterceptorConfig implements WebMvcConfigurer {

    /**配置拦截器路径*/
    static  final String[] ORIGINS = {"GET","POST","PUT","DELETE","QUERY"};

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截的路径
        String[] addPathPatterns ={"/boot/getUser"};
        //不拦截的路径
        String[] excludePathPatterns = {"/boot/getUserById/**"};
        //注册拦截器
        registry.addInterceptor(new PreInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }

    /**
     * 解决跨域请求路径 @EnableWebMvc这个注解非常重要，不加的话不成功
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*").allowCredentials(true).allowedMethods(ORIGINS).maxAge(3600);
    }

}
