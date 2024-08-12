//package dio.web.api.doc;
//
//import org.springframework.context.annotation.Bean;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.Contact;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.Arrays;
//import java.util.HashSet;
//
//@Configuration //anotação para indicar que essa classe é uma config do Swagger
//@EnableSwagger2 //anotação para indicar que essa classe é um Swagger
//public class SwaggerConfig {
//
//    // função de contato da nossa API
//    private Contact contato(){
//        return new Contact(
//                "Seu nome",
//                "http://www.seusite.com.br",
//                "voce@seusite.com.br"
//        );
//    }
//
//    // função de informações da nossa API
//    private ApiInfoBuilder informacoesApi(){
//        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
//
//        apiInfoBuilder.title("Title - Rest API");
//        apiInfoBuilder.description("API exemplo de uso de Springboot REST API");
//        apiInfoBuilder.termsOfServiceUrl("Termo de uso: open Source");
//        apiInfoBuilder.license("Licença - Sua Empresa");
//        apiInfoBuilder.licenseUrl("http://www.seusite.com.br");
//        apiInfoBuilder.contact(this.contato());
//
//        return apiInfoBuilder;
//    }
//
//    //bean que será gerado pelo container que roda a documentação da nossa API
//    @Bean
//    public Docket detalheApi() {
//        Docket docket = new Docket(DocumentationType.SWAGGER_2);
//
//        docket
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("dio.web.api.controller")) //Vamos direcionar qual pacote principal possui os controller que estamos documentando
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(this.informacoesApi().build()) //estas são as infos da minha api
//                .consumes(new HashSet<>(Arrays.asList("application/json"))) //ele é config para consumir JSONs
//                .produces(new HashSet<String>(Arrays.asList("application/json")));//ele é config para produzir JSONs
//
//        return docket;
//    }
//}
