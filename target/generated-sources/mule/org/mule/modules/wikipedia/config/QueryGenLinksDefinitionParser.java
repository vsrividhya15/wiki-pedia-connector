
package org.mule.modules.wikipedia.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.wikipedia.processors.QueryGenLinksMessageProcessor;
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
public class QueryGenLinksDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(QueryGenLinksDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(QueryGenLinksMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [query-gen-links] within the connector [wiki-pedia] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [query-gen-links] within the connector [wiki-pedia] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("queryGenLinks");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [query-gen-links] within the connector [wiki-pedia] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "format", "format");
        parseProperty(builder, element, "prop", "prop");
        parseProperty(builder, element, "list", "list");
        parseProperty(builder, element, "gplnamespace", "gplnamespace");
        parseProperty(builder, element, "gpllimit", "gpllimit");
        parseProperty(builder, element, "gplcontinue", "gplcontinue");
        parseProperty(builder, element, "gpltitles", "gpltitles");
        parseProperty(builder, element, "gpldir", "gpldir");
        parseProperty(builder, element, "indexpageids", "indexpageids");
        parseProperty(builder, element, "export", "export");
        parseProperty(builder, element, "exportnowrap", "exportnowrap");
        parseProperty(builder, element, "iwurl", "iwurl");
        parseProperty(builder, element, "continueId", "continueId");
        parseProperty(builder, element, "titles", "titles");
        parseProperty(builder, element, "pageids", "pageids");
        parseProperty(builder, element, "revids", "revids");
        parseProperty(builder, element, "generator", "generator");
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
