package com.ling.mybatis.begin;

import com.fasterxml.classmate.TypeResolver;
import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import com.ling.mybatis.begin.bean.config.SysPropertyCommon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
@ComponentScan(basePackages ={"com.ling.mybatis.begin.controller"})
public class SwaggerConfig {
    @Autowired
    private TypeResolver typeResolver;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2) //
                .additionalModels(typeResolver.resolve(SysPropertyCommon.class)) //
                .apiInfo(apiInfo())//
                .select() //
                .apis(RequestHandlerSelectors.basePackage("com.ling.mybatis.begin")) //
                .paths(PathSelectors.any()) //
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("com-ling-mybatis-begin APIs")
                .description("com-ling-mybatis-begin-api")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }
}
