package br.com.masterclass.superpecas.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //chamando configuration
public class ModelMapperConfig {

    @Bean //chamando bean (especifica propriedades, valores padrão, dependências e outros detalhes de configuração)
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}