package com.assign3;
import com.assign3.s_config.s_appConfig;
import com.assign3.s_identity.Species1;
import com.assign3.s_identity.Species2;
import com.assign3.s_identity.SpeciesInteface;
import com.assign3.s_info.SpeciesData;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Created by S_Effendi_211039853 on 2017/03/25.
 */
public class SpeciesTest extends TestCase {
    private SpeciesInteface s_identity;
    private SpeciesInteface s_identity1;
    private SpeciesInteface s_identity2;

    public void setUp() throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(s_appConfig.class);
        s_identity = (SpeciesInteface)context.getBean("Mammal");

        ApplicationContext context1 = new AnnotationConfigApplicationContext(s_appConfig.class);
        s_identity1 = (SpeciesInteface)context1.getBean("Reptile");

        ApplicationContext context2 = new AnnotationConfigApplicationContext(s_appConfig.class);
        s_identity2 = (SpeciesInteface)context2.getBean("Bird");
    }

    public void testSpecies() throws Exception {
        SpeciesData data = s_identity.getSpeciesType();

        assertEquals(data.getReq(), "Oxygen");
    }

    public void testSpecies1() throws Exception {
        SpeciesData data1 = s_identity1.getSpeciesType();

        assertEquals(data1.getDiet(), "Carnivore");
    }

    public void testSpecies2() throws Exception {
        SpeciesData data2 = s_identity2.getSpeciesType();

        assertEquals(data2.getName(), "Parrot");
    }
}
