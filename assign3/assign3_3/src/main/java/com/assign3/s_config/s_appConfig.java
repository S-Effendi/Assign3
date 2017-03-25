package com.assign3.s_config;

import com.assign3.s_identity.Species1;
import com.assign3.s_identity.Species2;
import com.assign3.s_identity.Species3;
import com.assign3.s_identity.SpeciesInteface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by S_Effendi on 2017/03/25.
 */

@Configuration
public class s_appConfig {
    @Bean(name="Mammal")
     public SpeciesInteface getMammal(){
        return  new Species1();
    }

    @Bean (name="Reptile")
    public SpeciesInteface getReptile(){

         return new Species2();
    }

    @Bean (name="Bird")
    public SpeciesInteface getBird(){
        return new Species3();
    }
}
