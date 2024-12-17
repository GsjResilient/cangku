package com.macro.mall.tiny.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SpringDoc API文档相关配置
 * Created by macro on 2022/3/4.
 */
@Configuration
public class SpringDocConfig {
    private static final String SECURITY_SCHEME_NAME = "Authorization";
    @Bean
    public OpenAPI MutualSelectOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("双选系统项目骨架"))
                .components(new Components()
                                .addSecuritySchemes(SECURITY_SCHEME_NAME,
                                        new SecurityScheme()
                                                .name(SECURITY_SCHEME_NAME)
                                                .type(SecurityScheme.Type.HTTP)
                                                .scheme("bearer")
                                                .bearerFormat("JWT")))
                .addSecurityItem(new SecurityRequirement().addList(SECURITY_SCHEME_NAME));
    }
    @Bean
    public GroupedOpenApi exampleGroup() {
        return GroupedOpenApi.builder()
                .group("example")
                .packagesToScan("com.example.controller") // 扫描特定包
                .build();
    }
    @Bean
    public GroupedOpenApi umsApi() {
        return GroupedOpenApi.builder()
                .packagesToScan("com.macro.mall.tiny.modules.ums.controller")
                .group("ums")
                .build();
    }
}
