
package org.mule.modules.wikipedia.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/wiki-pedia</code>.
 * 
 */
@Generated(value = "Mule DevKit Version 3.6.0", date = "2015-04-30T10:58:05+10:00", comments = "Build UNNAMED.2363.ef5c8a7")
public class WikiPediaNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(WikiPediaNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [wiki-pedia] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [wiki-pedia] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config-type", new WikiPediaConnectorConnectorConnectionStrategyConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config-type", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("query", new QueryDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-categories", new QueryPropCategoriesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-categories", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-category-info", new QueryPropCategoryInfoDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-category-info", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-contributors", new QueryPropContributorsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-contributors", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-deleted-revisions", new QueryPropDeletedRevisionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-deleted-revisions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-duplicate-files", new QueryPropDuplicateFilesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-duplicate-files", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-ext-links", new QueryPropExtLinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-ext-links", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-extracts", new QueryPropExtractsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-extracts", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-fileusage", new QueryPropFileusageDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-fileusage", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-global-usage", new QueryPropGlobalUsageDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-global-usage", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-image-info", new QueryPropImageInfoDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-image-info", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-images", new QueryPropImagesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-images", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-info", new QueryPropInfoDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-info", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-iw-links", new QueryPropIwLinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-iw-links", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-proplanglinks", new QueryProplanglinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-proplanglinks", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-proplinks", new QueryProplinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-proplinks", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-link-shere", new QueryPropLinkShereDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-link-shere", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-page-images", new QueryPropPageImagesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-page-images", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-page-props", new QueryPropPagePropsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-page-props", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-page-terms", new QueryPropPageTermsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-page-terms", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-redirects", new QueryPropRedirectsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-redirects", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-revisions", new QueryPropRevisionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-revisions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-stash-imageinfo", new QueryPropStashImageinfoDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-stash-imageinfo", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-templates", new QueryPropTemplatesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-templates", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-transcludedin", new QueryPropTranscludedinDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-transcludedin", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-prop-video-info", new QueryPropVideoInfoDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-prop-video-info", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-abuse-filters", new QueryListAbuseFiltersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-abuse-filters", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-abuse-log", new QueryListAbuseLogDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-abuse-log", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-all-categories", new QueryListAllCategoriesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-all-categories", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-all-deleted-revisions", new QueryListAllDeletedRevisionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-all-deleted-revisions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-all-fileu-usages", new QueryListAllFileuUsagesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-all-fileu-usages", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-all-images", new QueryListAllImagesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-all-images", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-all-links", new QueryListAllLinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-all-links", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-all-pages", new QueryListAllPagesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-all-pages", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-all-redirects", new QueryListAllRedirectsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-all-redirects", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-all-transclusions", new QueryListAllTransclusionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-all-transclusions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-all-users", new QueryListAllUsersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-all-users", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-back-links", new QueryListBackLinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-back-links", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-beta-features", new QueryListBetaFeaturesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-beta-features", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-listblocks", new QueryListblocksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-listblocks", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-category-members", new QueryListCategoryMembersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-category-members", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-central-notice-logs", new QueryListCentralNoticeLogsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-central-notice-logs", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-check-user", new QueryListCheckUserDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-check-user", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-check-user-log", new QueryListCheckUserLogDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-check-user-log", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-listdeletedrevs", new QueryListdeletedrevsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-listdeletedrevs", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-embedded-in", new QueryListEmbeddedInDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-embedded-in", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-exturlusage", new QueryListExturlusageDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-exturlusage", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-file-archive", new QueryListFileArchiveDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-file-archive", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-gadget-categories", new QueryListGadgetCategoriesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-gadget-categories", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-gadgets", new QueryListGadgetsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-gadgets", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-global-all-users", new QueryListGlobalAllUsersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-global-all-users", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-global-blocks", new QueryListGlobalBlocksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-global-blocks", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-global-groups", new QueryListGlobalGroupsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-global-groups", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-image-usage", new QueryListImageUsageDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-image-usage", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-iw-back-links", new QueryListIwBackLinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-iw-back-links", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-listlangbacklinks", new QueryListlangbacklinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-listlangbacklinks", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-log-events", new QueryListLogEventsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-log-events", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-message-collection", new QueryListMessageCollectionDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-message-collection", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-listmmsites", new QueryListmmsitesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-listmmsites", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-page-prop-names", new QueryListPagePropNamesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-page-prop-names", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-pageswithprop", new QueryListPageswithpropDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-pageswithprop", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-prefix-search", new QueryListPrefixSearchDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-prefix-search", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-protected-titles", new QueryListProtectedTitlesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-protected-titles", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-query-page", new QueryListQueryPageDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-query-page", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-random", new QueryListRandomDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-random", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-recent-changes", new QueryListRecentChangesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-recent-changes", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-search", new QueryListSearchDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-search", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-tags", new QueryListTagsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-tags", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-user-contribs", new QueryListUserContribsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-user-contribs", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-users", new QueryListUsersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-users", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-watch-list", new QueryListWatchListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-watch-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-watch-list-raw", new QueryListWatchListRawDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-watch-list-raw", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-list-wiki-sets", new QueryListWikiSetsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-list-wiki-sets", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-meta-all-messages", new QueryMetaAllMessagesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-meta-all-messages", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-meta-file-repo-info", new QueryMetaFileRepoInfoDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-meta-file-repo-info", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-meta-global-user-info", new QueryMetaGlobalUserInfoDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-meta-global-user-info", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-meta-language-stats", new QueryMetaLanguageStatsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-meta-language-stats", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-meta-message-groups", new QueryMetaMessageGroupsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-meta-message-groups", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-meta-message-group-stats", new QueryMetaMessageGroupStatsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-meta-message-group-stats", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-meta-notifications", new QueryMetaNotificationsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-meta-notifications", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-meta-messageranslations", new QueryMetaMessageranslationsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-meta-messageranslations", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-metas-site-info", new QueryMetasSiteInfoDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-metas-site-info", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-metatokens", new QueryMetatokensDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-metatokens", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-meta-user-info", new QueryMetaUserInfoDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-meta-user-info", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-meta-wiki-base", new QueryMetaWikiBaseDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-meta-wiki-base", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-allcategories", new QueryGenAllcategoriesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-allcategories", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-all-deleted-revisions", new QueryGenAllDeletedRevisionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-all-deleted-revisions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-all-file-usages", new QueryGenAllFileUsagesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-all-file-usages", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-all-images", new QueryGenAllImagesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-all-images", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-all-redirects", new QueryGenAllRedirectsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-all-redirects", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-all-transclusions", new QueryGenAllTransclusionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-all-transclusions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-all-pages", new QueryGenAllPagesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-all-pages", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-all-links", new QueryGenAllLinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-all-links", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-back-links", new QueryGenBackLinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-back-links", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-categories", new QueryGenCategoriesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-categories", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-category-members", new QueryGenCategoryMembersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-category-members", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-deleted-revisions", new QueryGenDeletedRevisionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-deleted-revisions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-duplicate-files", new QueryGenDuplicateFilesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-duplicate-files", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-embedded-in", new QueryGenEmbeddedInDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-embedded-in", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-ext-url-usage", new QueryGenExtUrlUsageDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-ext-url-usage", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-file-usage", new QueryGenFileUsageDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-file-usage", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-images", new QueryGenImagesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-images", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-image-usage", new QueryGenImageUsageDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-image-usage", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-iw-back-links", new QueryGenIwBackLinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-iw-back-links", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-lang-back-links", new QueryGenLangBackLinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-lang-back-links", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-links", new QueryGenLinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-links", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-link-shere", new QueryGenLinkShereDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-link-shere", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-message-collection", new QueryGenMessageCollectionDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-message-collection", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-pages-with-prop", new QueryGenPagesWithPropDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-pages-with-prop", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-prefix-search", new QueryGenPrefixSearchDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-prefix-search", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-protected-titles", new QueryGenProtectedTitlesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-protected-titles", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-query-page", new QueryGenQueryPageDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-query-page", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-random", new QueryGenRandomDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-random", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-recent-changes", new QueryGenRecentChangesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-recent-changes", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-redirects", new QueryGenRedirectsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-redirects", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-revisions", new QueryGenRevisionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-revisions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-search", new QueryGenSearchDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-search", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-templates", new QueryGenTemplatesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-templates", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-transcluded-in", new QueryGenTranscludedInDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-transcluded-in", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-watch-list", new QueryGenWatchListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-watch-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query-gen-watch-list-raw", new QueryGenWatchListRawDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query-gen-watch-list-raw", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("login", new LoginDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("login", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("getmain-module", new GetmainModuleDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("getmain-module", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("logout", new LogoutDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("logout", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("open-search", new OpenSearchDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("open-search", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("parse-content", new ParseContentDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("parse-content", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-all-categories", new PurgeAllCategoriesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-all-categories", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-all-deleted-revisions", new PurgeAllDeletedRevisionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-all-deleted-revisions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-all-file-usages", new PurgeAllFileUsagesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-all-file-usages", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-all-images", new PurgeAllImagesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-all-images", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-all-links", new PurgeAllLinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-all-links", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-all-pages", new PurgeAllPagesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-all-pages", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-all-redirects", new PurgeAllRedirectsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-all-redirects", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-all-transclusions", new PurgeAllTransclusionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-all-transclusions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-back-links", new PurgeBackLinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-back-links", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-categories", new PurgeCategoriesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-categories", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-category-members", new PurgeCategoryMembersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-category-members", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-deleted-revisions", new PurgeDeletedRevisionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-deleted-revisions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-duplicate-files", new PurgeDuplicateFilesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-duplicate-files", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-embedded-in", new PurgeEmbeddedInDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-embedded-in", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-exturl-usage", new PurgeExturlUsageDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-exturl-usage", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-file-usage", new PurgeFileUsageDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-file-usage", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-images", new PurgeImagesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-images", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-image-usage", new PurgeImageUsageDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-image-usage", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-interwiki-back-links", new PurgeInterwikiBackLinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-interwiki-back-links", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-lang-back-links", new PurgeLangBackLinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-lang-back-links", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-links", new PurgeLinksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-links", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-link-shere", new PurgeLinkShereDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-link-shere", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-message-collection", new PurgeMessageCollectionDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-message-collection", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-pages-with-prop", new PurgePagesWithPropDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-pages-with-prop", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-prefix-search", new PurgePrefixSearchDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-prefix-search", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-protected-titles", new PurgeProtectedTitlesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-protected-titles", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-query-page", new PurgeQueryPageDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-query-page", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-random", new PurgeRandomDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-random", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-recent-changes", new PurgeRecentChangesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-recent-changes", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-redirects", new PurgeRedirectsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-redirects", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-revisions", new PurgeRevisionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-revisions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-search", new PurgeSearchDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-search", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-templates", new PurgeTemplatesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-templates", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-transcludedin", new PurgeTranscludedinDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-transcludedin", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-watch-list", new PurgeWatchListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-watch-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("purge-watch-list-raw", new PurgeWatchListRawDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("purge-watch-list-raw", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-param-info", new GetParamInfoDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-param-info", "@Processor", ex);
        }
    }

}
