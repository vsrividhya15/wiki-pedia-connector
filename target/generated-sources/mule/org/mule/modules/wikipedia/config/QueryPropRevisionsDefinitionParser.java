
package org.mule.modules.wikipedia.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.wikipedia.processors.QueryPropRevisionsMessageProcessor;
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
public class QueryPropRevisionsDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(QueryPropRevisionsDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(QueryPropRevisionsMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [query-prop-revisions] within the connector [wiki-pedia] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [query-prop-revisions] within the connector [wiki-pedia] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("queryPropRevisions");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [query-prop-revisions] within the connector [wiki-pedia] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "format", "format");
        parseProperty(builder, element, "list", "list");
        parseProperty(builder, element, "meta", "meta");
        parseProperty(builder, element, "rvprop", "rvprop");
        parseProperty(builder, element, "rvlimit", "rvlimit");
        parseProperty(builder, element, "rvexpandtemplates", "rvexpandtemplates");
        parseProperty(builder, element, "rvgeneratexml", "rvgeneratexml");
        parseProperty(builder, element, "rvparse", "rvparse");
        parseProperty(builder, element, "rvsection", "rvsection");
        parseProperty(builder, element, "rvdiffto", "rvdiffto");
        parseProperty(builder, element, "rvdifftotext", "rvdifftotext");
        parseProperty(builder, element, "rvcontentformat", "rvcontentformat");
        parseProperty(builder, element, "rvstartid", "rvstartid");
        parseProperty(builder, element, "rvendid", "rvendid");
        parseProperty(builder, element, "rvstart", "rvstart");
        parseProperty(builder, element, "rvend", "rvend");
        parseProperty(builder, element, "rvdir", "rvdir");
        parseProperty(builder, element, "rvuser", "rvuser");
        parseProperty(builder, element, "rvexcludeuser", "rvexcludeuser");
        parseProperty(builder, element, "rvtag", "rvtag");
        parseProperty(builder, element, "rvcontinue", "rvcontinue");
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
