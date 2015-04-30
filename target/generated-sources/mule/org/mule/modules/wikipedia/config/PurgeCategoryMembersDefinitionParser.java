
package org.mule.modules.wikipedia.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.wikipedia.processors.PurgeCategoryMembersMessageProcessor;
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
public class PurgeCategoryMembersDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(PurgeCategoryMembersDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(PurgeCategoryMembersMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [purge-category-members] within the connector [wiki-pedia] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [purge-category-members] within the connector [wiki-pedia] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("purgeCategoryMembers");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [purge-category-members] within the connector [wiki-pedia] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "format", "format");
        parseProperty(builder, element, "forcelinkupdate", "forcelinkupdate");
        parseProperty(builder, element, "forcerecursivelinkupdate", "forcerecursivelinkupdate");
        parseProperty(builder, element, "continueStr", "continueStr");
        parseProperty(builder, element, "titles", "titles");
        parseProperty(builder, element, "pageids", "pageids");
        parseProperty(builder, element, "revids", "revids");
        parseProperty(builder, element, "gcmtitle", "gcmtitle");
        parseProperty(builder, element, "gcmpageid", "gcmpageid");
        parseProperty(builder, element, "gcmprop", "gcmprop");
        parseProperty(builder, element, "gcmnamespace", "gcmnamespace");
        parseProperty(builder, element, "gcmtype", "gcmtype");
        parseProperty(builder, element, "gcmcontinue", "gcmcontinue");
        parseProperty(builder, element, "gcmlimit", "gcmlimit");
        parseProperty(builder, element, "gcmsort", "gcmsort");
        parseProperty(builder, element, "gcmdir", "gcmdir");
        parseProperty(builder, element, "gcmstart", "gcmstart");
        parseProperty(builder, element, "gcmend", "gcmend");
        parseProperty(builder, element, "gcmstarthexsortkey", "gcmstarthexsortkey");
        parseProperty(builder, element, "gcmendhexsortkey", "gcmendhexsortkey");
        parseProperty(builder, element, "gcmstartsortkeyprefix", "gcmstartsortkeyprefix");
        parseProperty(builder, element, "gcmendsortkeyprefix", "gcmendsortkeyprefix");
        parseProperty(builder, element, "redirects", "redirects");
        parseProperty(builder, element, "converttitles", "converttitles");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
