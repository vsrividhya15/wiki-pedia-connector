
package org.mule.modules.wikipedia.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.wikipedia.processors.PurgeAllImagesMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.6.0", date = "2015-04-30T10:58:05+10:00", comments = "Build UNNAMED.2363.ef5c8a7")
public class PurgeAllImagesDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(PurgeAllImagesDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(PurgeAllImagesMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [purge-all-images] within the connector [wiki-pedia] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [purge-all-images] within the connector [wiki-pedia] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("purgeAllImages");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [purge-all-images] within the connector [wiki-pedia] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "format", "format");
        parseProperty(builder, element, "forcelinkupdate", "forcelinkupdate");
        parseProperty(builder, element, "forcerecursivelinkupdate", "forcerecursivelinkupdate");
        parseProperty(builder, element, "continueStr", "continueStr");
        parseProperty(builder, element, "titles", "titles");
        parseProperty(builder, element, "pageids", "pageids");
        parseProperty(builder, element, "revids", "revids");
        parseProperty(builder, element, "gaisort", "gaisort");
        parseProperty(builder, element, "gaidir", "gaidir");
        parseProperty(builder, element, "gaifrom", "gaifrom");
        parseProperty(builder, element, "gaito", "gaito");
        parseProperty(builder, element, "gaicontinue", "gaicontinue");
        parseProperty(builder, element, "gaistart", "gaistart");
        parseProperty(builder, element, "gaiend", "gaiend");
        parseProperty(builder, element, "gaiprop", "gaiprop");
        parseProperty(builder, element, "gaiprefix", "gaiprefix");
        parseProperty(builder, element, "gaiminsize", "gaiminsize");
        parseProperty(builder, element, "gaimaxsize", "gaimaxsize");
        parseProperty(builder, element, "gaisha1", "gaisha1");
        parseProperty(builder, element, "gaisha1base36", "gaisha1base36");
        parseProperty(builder, element, "gaiuser", "gaiuser");
        parseProperty(builder, element, "gaifilterbots", "gaifilterbots");
        parseProperty(builder, element, "gaimime", "gaimime");
        parseProperty(builder, element, "gailimit", "gailimit");
        parseProperty(builder, element, "redirects", "redirects");
        parseProperty(builder, element, "converttitles", "converttitles");
        parseProperty(builder, element, "maxlag", "maxlag");
        parseProperty(builder, element, "smaxage", "smaxage");
        parseProperty(builder, element, "maxage", "maxage");
        parseProperty(builder, element, "assertUser", "assertUser");
        parseProperty(builder, element, "requestid", "requestid");
        parseProperty(builder, element, "servedby", "servedby");
        parseProperty(builder, element, "curtimestamp", "curtimestamp");
        parseProperty(builder, element, "origin", "origin");
        parseProperty(builder, element, "uselang", "uselang");
        parseProperty(builder, element, "centralauthtoken", "centralauthtoken");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
