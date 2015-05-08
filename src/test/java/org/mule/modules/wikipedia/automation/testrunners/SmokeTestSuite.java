
package org.mule.modules.wikipedia.automation.testrunners;

import org.junit.runner.RunWith;
import org.mule.modules.wikipedia.automation.SmokeTests;
import org.mule.modules.wikipedia.automation.testcases.GetParamInfoTestCases;
import org.mule.modules.wikipedia.automation.testcases.GetmainModuleTestCases;
import org.mule.modules.wikipedia.automation.testcases.LoginTestCases;
import org.mule.modules.wikipedia.automation.testcases.LogoutTestCases;
import org.mule.modules.wikipedia.automation.testcases.OpenSearchTestCases;
import org.mule.modules.wikipedia.automation.testcases.ParseContentTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeAllCategoriesTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeAllDeletedRevisionsTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeAllFileUsagesTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeAllImagesTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeAllLinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeAllPagesTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeAllRedirectsTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeAllTransclusionsTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeBackLinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeCategoriesTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeCategoryMembersTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeDeletedRevisionsTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeDuplicateFilesTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeEmbeddedInTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeExturlUsageTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeFileUsageTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeImageUsageTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeImagesTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeInterwikiBackLinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeLangBackLinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeLinkShereTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeLinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeMessageCollectionTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgePagesWithPropTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgePrefixSearchTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeProtectedTitlesTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeQueryPageTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeRandomTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeRecentChangesTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeRedirectsTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeRevisionsTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeSearchTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeTemplatesTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeTranscludedinTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeWatchListRawTestCases;
import org.mule.modules.wikipedia.automation.testcases.PurgeWatchListTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenAllDeletedRevisionsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenAllFileUsagesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenAllImagesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenAllLinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenAllPagesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenAllRedirectsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenAllTransclusionsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenAllcategoriesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenBackLinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenCategoriesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenCategoryMembersTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenDeletedRevisionsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenDuplicateFilesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenEmbeddedInTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenExtUrlUsageTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenFileUsageTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenImageUsageTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenImagesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenIwBackLinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenLangBackLinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenLinkShereTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenLinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenMessageCollectionTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenPagesWithPropTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenPrefixSearchTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenProtectedTitlesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenQueryPageTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenRandomTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenRecentChangesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenRedirectsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenRevisionsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenSearchTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenTemplatesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenTranscludedInTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenWatchListRawTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryGenWatchListTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListAbuseFiltersTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListAbuseLogTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListAllCategoriesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListAllDeletedRevisionsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListAllFileuUsagesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListAllImagesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListAllLinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListAllPagesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListAllRedirectsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListAllTransclusionsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListAllUsersTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListBackLinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListBetaFeaturesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListCategoryMembersTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListCentralNoticeLogsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListCheckUserLogTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListCheckUserTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListEmbeddedInTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListExturlusageTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListFileArchiveTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListGadgetCategoriesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListGadgetsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListGlobalAllUsersTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListGlobalBlocksTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListGlobalGroupsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListImageUsageTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListIwBackLinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListLogEventsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListMessageCollectionTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListPagePropNamesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListPageswithpropTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListPrefixSearchTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListProtectedTitlesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListQueryPageTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListRandomTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListRecentChangesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListSearchTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListTagsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListUserContribsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListUsersTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListWatchListRawTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListWatchListTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListWikiSetsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListblocksTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListdeletedrevsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryListlangbacklinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryMetaAllMessagesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryMetaFileRepoInfoTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryMetaUserInfoTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryMetasSiteInfoTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryMetatokensTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropCategoriesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropCategoryInfoTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropContributorsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropDeletedRevisionsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropDuplicateFilesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropExtLinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropExtractsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropFileusageTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropGlobalUsageTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropImageInfoTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropImagesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropInfoTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropIwLinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropLinkShereTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropPageImagesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropPagePropsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropPageTermsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropRedirectsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropRevisionsTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropStashImageinfoTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropTemplatesTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropTranscludedinTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryPropVideoInfoTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryProplanglinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryProplinksTestCases;
import org.mule.modules.wikipedia.automation.testcases.QueryTestCases;

@RunWith(org.junit.experimental.categories.Categories.class)
@org.junit.experimental.categories.Categories.IncludeCategory(SmokeTests.class)
@org.junit.runners.Suite.SuiteClasses({
    QueryTestCases.class,
    QueryPropCategoriesTestCases.class,
    QueryPropCategoryInfoTestCases.class,
    QueryPropContributorsTestCases.class,
    QueryPropDeletedRevisionsTestCases.class,
    QueryPropDuplicateFilesTestCases.class,
    QueryPropExtLinksTestCases.class,
    QueryPropExtractsTestCases.class,
    QueryPropFileusageTestCases.class,
    QueryPropGlobalUsageTestCases.class,
    QueryPropImageInfoTestCases.class,
    QueryPropImagesTestCases.class,
    QueryPropInfoTestCases.class,
    QueryPropIwLinksTestCases.class,
    QueryProplanglinksTestCases.class,
    QueryProplinksTestCases.class,
    QueryPropLinkShereTestCases.class,
    QueryPropPageImagesTestCases.class,
    QueryPropPagePropsTestCases.class,
    QueryPropPageTermsTestCases.class,
    QueryPropRedirectsTestCases.class,
    QueryPropRevisionsTestCases.class,
    QueryPropStashImageinfoTestCases.class,
    QueryPropTemplatesTestCases.class,
    QueryPropTranscludedinTestCases.class,
    QueryPropVideoInfoTestCases.class,
    QueryListAbuseFiltersTestCases.class,
    QueryListAbuseLogTestCases.class,
    QueryListAllCategoriesTestCases.class,
    QueryListAllDeletedRevisionsTestCases.class,
    QueryListAllFileuUsagesTestCases.class,
    QueryListAllImagesTestCases.class,
    QueryListAllLinksTestCases.class,
    QueryListAllPagesTestCases.class,
    QueryListAllRedirectsTestCases.class,
    QueryListAllTransclusionsTestCases.class,
    QueryListAllUsersTestCases.class,
    QueryListBackLinksTestCases.class,
    QueryListBetaFeaturesTestCases.class,
    QueryListblocksTestCases.class,
    QueryListCategoryMembersTestCases.class,
    QueryListCentralNoticeLogsTestCases.class,
    QueryListCheckUserTestCases.class,
    QueryListCheckUserLogTestCases.class,
    QueryListdeletedrevsTestCases.class,
    QueryListEmbeddedInTestCases.class,
    QueryListExturlusageTestCases.class,
    QueryListFileArchiveTestCases.class,
    QueryListGadgetCategoriesTestCases.class,
    QueryListGadgetsTestCases.class,
    QueryListGlobalAllUsersTestCases.class,
    QueryListGlobalBlocksTestCases.class,
    QueryListGlobalGroupsTestCases.class,
    QueryListImageUsageTestCases.class,
    QueryListIwBackLinksTestCases.class,
    QueryListlangbacklinksTestCases.class,
    QueryListLogEventsTestCases.class,
    QueryListMessageCollectionTestCases.class,
    QueryListPagePropNamesTestCases.class,
    QueryListPageswithpropTestCases.class,
    QueryListPrefixSearchTestCases.class,
    QueryListProtectedTitlesTestCases.class,
    QueryListQueryPageTestCases.class,
    QueryListRandomTestCases.class,
    QueryListRecentChangesTestCases.class,
    QueryListSearchTestCases.class,
    QueryListTagsTestCases.class,
    QueryListUserContribsTestCases.class,
    QueryListUsersTestCases.class,
    QueryListWatchListTestCases.class,
    QueryListWatchListRawTestCases.class,
    QueryListWikiSetsTestCases.class,
    QueryMetaAllMessagesTestCases.class,
    QueryMetaFileRepoInfoTestCases.class,
    QueryMetasSiteInfoTestCases.class,
    QueryMetatokensTestCases.class,
    QueryMetaUserInfoTestCases.class,
    QueryGenAllcategoriesTestCases.class,
    QueryGenAllDeletedRevisionsTestCases.class,
    QueryGenAllFileUsagesTestCases.class,
    QueryGenAllImagesTestCases.class,
    QueryGenAllRedirectsTestCases.class,
    QueryGenAllTransclusionsTestCases.class,
    QueryGenAllPagesTestCases.class,
    QueryGenAllLinksTestCases.class,
    QueryGenBackLinksTestCases.class,
    QueryGenCategoriesTestCases.class,
    QueryGenCategoryMembersTestCases.class,
    QueryGenDeletedRevisionsTestCases.class,
    QueryGenDuplicateFilesTestCases.class,
    QueryGenEmbeddedInTestCases.class,
    QueryGenExtUrlUsageTestCases.class,
    QueryGenFileUsageTestCases.class,
    QueryGenImagesTestCases.class,
    QueryGenImageUsageTestCases.class,
    QueryGenIwBackLinksTestCases.class,
    QueryGenLangBackLinksTestCases.class,
    QueryGenLinksTestCases.class,
    QueryGenLinkShereTestCases.class,
    QueryGenMessageCollectionTestCases.class,
    QueryGenPagesWithPropTestCases.class,
    QueryGenPrefixSearchTestCases.class,
    QueryGenProtectedTitlesTestCases.class,
    QueryGenQueryPageTestCases.class,
    QueryGenRandomTestCases.class,
    QueryGenRecentChangesTestCases.class,
    QueryGenRedirectsTestCases.class,
    QueryGenRevisionsTestCases.class,
    QueryGenSearchTestCases.class,
    QueryGenTemplatesTestCases.class,
    QueryGenTranscludedInTestCases.class,
    QueryGenWatchListTestCases.class,
    QueryGenWatchListRawTestCases.class,
    LoginTestCases.class,
    GetmainModuleTestCases.class,
    LogoutTestCases.class,
    OpenSearchTestCases.class,
    ParseContentTestCases.class,
    PurgeAllCategoriesTestCases.class,
    PurgeAllDeletedRevisionsTestCases.class,
    PurgeAllFileUsagesTestCases.class,
    PurgeAllImagesTestCases.class,
    PurgeAllLinksTestCases.class,
    PurgeAllPagesTestCases.class,
    PurgeAllRedirectsTestCases.class,
    PurgeAllTransclusionsTestCases.class,
    PurgeBackLinksTestCases.class,
    PurgeCategoriesTestCases.class,
    PurgeCategoryMembersTestCases.class,
    PurgeDeletedRevisionsTestCases.class,
    PurgeDuplicateFilesTestCases.class,
    PurgeEmbeddedInTestCases.class,
    PurgeExturlUsageTestCases.class,
    PurgeFileUsageTestCases.class,
    PurgeImagesTestCases.class,
    PurgeImageUsageTestCases.class,
    PurgeInterwikiBackLinksTestCases.class,
    PurgeLangBackLinksTestCases.class,
    PurgeLinksTestCases.class,
    PurgeLinkShereTestCases.class,
    PurgeMessageCollectionTestCases.class,
    PurgePagesWithPropTestCases.class,
    PurgePrefixSearchTestCases.class,
    PurgeProtectedTitlesTestCases.class,
    PurgeQueryPageTestCases.class,
    PurgeRandomTestCases.class,
    PurgeRecentChangesTestCases.class,
    PurgeRedirectsTestCases.class,
    PurgeRevisionsTestCases.class,
    PurgeSearchTestCases.class,
    PurgeTemplatesTestCases.class,
    PurgeTranscludedinTestCases.class,
    PurgeWatchListTestCases.class,
    PurgeWatchListRawTestCases.class,
    GetParamInfoTestCases.class
})
public class SmokeTestSuite {


}
