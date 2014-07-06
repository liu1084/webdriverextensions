package com.github.webdriverextensions.generator;

import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import com.github.webdriverextensions.internal.generator.AbstractGeneratorProcessor;
import com.github.webdriverextensions.internal.generator.AbstractSiteBuilder;

@SupportedAnnotationTypes({"com.github.webdriverextensions.generator.annotations.Generate"})
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class AbstractSiteGeneratorProcessor extends AbstractGeneratorProcessor {

    @Override
    public void generateClass() {
        TypeElement siteClass = getAnnotatedSiteClasses().iterator().next();
        debug("Generating AbstractSite for class: " + siteClass.getSimpleName() + " with Page Classes: " + getAnnotatedPageClasses());
        AbstractSiteBuilder smb = new AbstractSiteBuilder(processingEnv,
                siteClass,
                getAnnotatedPageClasses());
        smb.build();
    }
}
