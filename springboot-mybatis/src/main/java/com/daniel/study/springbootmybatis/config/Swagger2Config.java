package com.daniel.study.springbootmybatis.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * 2019-08-16 21:58:11
 *
 * @author FengYu
 */
@Configuration
@EnableSwagger2
@ConditionalOnExpression("${swagger.enable}")
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        List<Parameter> pars = new ArrayList<>();
        List<ResponseMessage> responseMessageList = new ArrayList<>();
        responseMessageList.add(new ResponseMessageBuilder().code(500).message("服务器发送异常").responseModel(new ModelRef("Error")).build());
        responseMessageList.add(new ResponseMessageBuilder().code(403).message("资源不可用").build());
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any()).build().globalOperationParameters(pars)
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.GET, responseMessageList);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Apex API").description("Apex 升级相关接口")
                .termsOfServiceUrl("https://www.cnblogs.com/xiebq/").version("1.0").build();
    }
}
