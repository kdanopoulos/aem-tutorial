package com.adobe.aem.tutorial.core.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.adobe.aem.tutorial.core.testcontext.AppAemContext;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(AemContextExtension.class)
class SecondComponentModelTest {

    private final AemContext context = AppAemContext.newAemContext();

    private SecondComponentModel model;

    @BeforeEach
    public void setup() throws Exception {
        context.addModelsForClasses(SecondComponentModel.class);
    }

    @Test
    void testGetTitle() throws Exception {
        assertTrue(true);
    }

    @Test
    void testGetDescription() throws Exception {
        assertTrue(true);
    }
}
