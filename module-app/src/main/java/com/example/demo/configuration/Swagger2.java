package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 描述：Swagger配置类
 * 创建人：liuyong@dianxiaohuo.net
 * 创建时间： 2019-02-27:10:19
 */
@Configuration //表明这是一个配置类
@EnableSwagger2 //开启swagger
public class Swagger2 {

    /**
     * swagger是否可用,默认true
     */
    @Value("${swagger.enable}")
    private boolean enable;

    /**
     * 文档标题Title
     */
    @Value("${swagger.title}")
    private String title;

    /**
     * 包的位置
     */
    @Value("${swagger.base-package}")
    private String basePackage;

    @Value("${swagger.base-paths}")
    private String basePaths;

    /**
     * 注入Docket
     * @return
     */
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(this.enable)
                .apiInfo(apiinfo())
                .select() //扫描
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .paths(PathSelectors.regex(basePaths))
//                .paths(PathSelectors.any()) //要展示的路径，PathSelectors.any()任何路径
                .build();
    }

    /**
     * 自定义信息
     * @return
     */
    private ApiInfo apiinfo() {
        return new ApiInfoBuilder()
                .title(this.title)
                .description("RESTful风格,简单优雅！")
                .build();
    }
}
