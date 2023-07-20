@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.kendra

import software.amazon.awscdk.services.kendra.CfnDataSource
import software.amazon.awscdk.services.kendra.CfnDataSourceProps
import software.amazon.awscdk.services.kendra.CfnFaq
import software.amazon.awscdk.services.kendra.CfnFaqProps
import software.amazon.awscdk.services.kendra.CfnIndex
import software.amazon.awscdk.services.kendra.CfnIndexProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object kendra {
    public inline fun cfnDataSource(
        scope: Construct,
        id: String,
        block: CfnDataSourceDsl.() -> Unit = {},
    ): CfnDataSource {
        val builder = CfnDataSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceAccessControlListConfigurationProperty(
        block: CfnDataSourceAccessControlListConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.AccessControlListConfigurationProperty {
        val builder = CfnDataSourceAccessControlListConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceAclConfigurationProperty(
        block: CfnDataSourceAclConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.AclConfigurationProperty {
        val builder = CfnDataSourceAclConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceColumnConfigurationProperty(
        block: CfnDataSourceColumnConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.ColumnConfigurationProperty {
        val builder = CfnDataSourceColumnConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceConfluenceAttachmentConfigurationProperty(
        block: CfnDataSourceConfluenceAttachmentConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.ConfluenceAttachmentConfigurationProperty {
        val builder = CfnDataSourceConfluenceAttachmentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceConfluenceAttachmentToIndexFieldMappingProperty(
        block: CfnDataSourceConfluenceAttachmentToIndexFieldMappingPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty {
        val builder = CfnDataSourceConfluenceAttachmentToIndexFieldMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceConfluenceBlogConfigurationProperty(
        block: CfnDataSourceConfluenceBlogConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.ConfluenceBlogConfigurationProperty {
        val builder = CfnDataSourceConfluenceBlogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceConfluenceBlogToIndexFieldMappingProperty(
        block: CfnDataSourceConfluenceBlogToIndexFieldMappingPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty {
        val builder = CfnDataSourceConfluenceBlogToIndexFieldMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceConfluenceConfigurationProperty(
        block: CfnDataSourceConfluenceConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.ConfluenceConfigurationProperty {
        val builder = CfnDataSourceConfluenceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceConfluencePageConfigurationProperty(
        block: CfnDataSourceConfluencePageConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.ConfluencePageConfigurationProperty {
        val builder = CfnDataSourceConfluencePageConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceConfluencePageToIndexFieldMappingProperty(
        block: CfnDataSourceConfluencePageToIndexFieldMappingPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.ConfluencePageToIndexFieldMappingProperty {
        val builder = CfnDataSourceConfluencePageToIndexFieldMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceConfluenceSpaceConfigurationProperty(
        block: CfnDataSourceConfluenceSpaceConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.ConfluenceSpaceConfigurationProperty {
        val builder = CfnDataSourceConfluenceSpaceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceConfluenceSpaceToIndexFieldMappingProperty(
        block: CfnDataSourceConfluenceSpaceToIndexFieldMappingPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty {
        val builder = CfnDataSourceConfluenceSpaceToIndexFieldMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceConnectionConfigurationProperty(
        block: CfnDataSourceConnectionConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.ConnectionConfigurationProperty {
        val builder = CfnDataSourceConnectionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceCustomDocumentEnrichmentConfigurationProperty(
        block: CfnDataSourceCustomDocumentEnrichmentConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.CustomDocumentEnrichmentConfigurationProperty {
        val builder = CfnDataSourceCustomDocumentEnrichmentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceDataSourceConfigurationProperty(
        block: CfnDataSourceDataSourceConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.DataSourceConfigurationProperty {
        val builder = CfnDataSourceDataSourceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceDataSourceToIndexFieldMappingProperty(
        block: CfnDataSourceDataSourceToIndexFieldMappingPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.DataSourceToIndexFieldMappingProperty {
        val builder = CfnDataSourceDataSourceToIndexFieldMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceDataSourceVpcConfigurationProperty(
        block: CfnDataSourceDataSourceVpcConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.DataSourceVpcConfigurationProperty {
        val builder = CfnDataSourceDataSourceVpcConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceDatabaseConfigurationProperty(
        block: CfnDataSourceDatabaseConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.DatabaseConfigurationProperty {
        val builder = CfnDataSourceDatabaseConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceDocumentAttributeConditionProperty(
        block: CfnDataSourceDocumentAttributeConditionPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.DocumentAttributeConditionProperty {
        val builder = CfnDataSourceDocumentAttributeConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceDocumentAttributeTargetProperty(
        block: CfnDataSourceDocumentAttributeTargetPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.DocumentAttributeTargetProperty {
        val builder = CfnDataSourceDocumentAttributeTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceDocumentAttributeValueProperty(
        block: CfnDataSourceDocumentAttributeValuePropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.DocumentAttributeValueProperty {
        val builder = CfnDataSourceDocumentAttributeValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceDocumentsMetadataConfigurationProperty(
        block: CfnDataSourceDocumentsMetadataConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.DocumentsMetadataConfigurationProperty {
        val builder = CfnDataSourceDocumentsMetadataConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceGoogleDriveConfigurationProperty(
        block: CfnDataSourceGoogleDriveConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.GoogleDriveConfigurationProperty {
        val builder = CfnDataSourceGoogleDriveConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceHookConfigurationProperty(
        block: CfnDataSourceHookConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.HookConfigurationProperty {
        val builder = CfnDataSourceHookConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceInlineCustomDocumentEnrichmentConfigurationProperty(
        block: CfnDataSourceInlineCustomDocumentEnrichmentConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty {
        val builder = CfnDataSourceInlineCustomDocumentEnrichmentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceOneDriveConfigurationProperty(
        block: CfnDataSourceOneDriveConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.OneDriveConfigurationProperty {
        val builder = CfnDataSourceOneDriveConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceOneDriveUsersProperty(
        block: CfnDataSourceOneDriveUsersPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.OneDriveUsersProperty {
        val builder = CfnDataSourceOneDriveUsersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceProps(block: CfnDataSourcePropsDsl.() -> Unit = {}): CfnDataSourceProps {
        val builder = CfnDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceProxyConfigurationProperty(
        block: CfnDataSourceProxyConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.ProxyConfigurationProperty {
        val builder = CfnDataSourceProxyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceS3DataSourceConfigurationProperty(
        block: CfnDataSourceS3DataSourceConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.S3DataSourceConfigurationProperty {
        val builder = CfnDataSourceS3DataSourceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceS3PathProperty(
        block: CfnDataSourceS3PathPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.S3PathProperty {
        val builder = CfnDataSourceS3PathPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceSalesforceChatterFeedConfigurationProperty(
        block: CfnDataSourceSalesforceChatterFeedConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.SalesforceChatterFeedConfigurationProperty {
        val builder = CfnDataSourceSalesforceChatterFeedConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceSalesforceConfigurationProperty(
        block: CfnDataSourceSalesforceConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.SalesforceConfigurationProperty {
        val builder = CfnDataSourceSalesforceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceSalesforceCustomKnowledgeArticleTypeConfigurationProperty(
        block: CfnDataSourceSalesforceCustomKnowledgeArticleTypeConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty {
        val builder = CfnDataSourceSalesforceCustomKnowledgeArticleTypeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceSalesforceKnowledgeArticleConfigurationProperty(
        block: CfnDataSourceSalesforceKnowledgeArticleConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty {
        val builder = CfnDataSourceSalesforceKnowledgeArticleConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceSalesforceStandardKnowledgeArticleTypeConfigurationProperty(
        block: CfnDataSourceSalesforceStandardKnowledgeArticleTypeConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty {
        val builder = CfnDataSourceSalesforceStandardKnowledgeArticleTypeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceSalesforceStandardObjectAttachmentConfigurationProperty(
        block: CfnDataSourceSalesforceStandardObjectAttachmentConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty {
        val builder = CfnDataSourceSalesforceStandardObjectAttachmentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceSalesforceStandardObjectConfigurationProperty(
        block: CfnDataSourceSalesforceStandardObjectConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.SalesforceStandardObjectConfigurationProperty {
        val builder = CfnDataSourceSalesforceStandardObjectConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceServiceNowConfigurationProperty(
        block: CfnDataSourceServiceNowConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.ServiceNowConfigurationProperty {
        val builder = CfnDataSourceServiceNowConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceServiceNowKnowledgeArticleConfigurationProperty(
        block: CfnDataSourceServiceNowKnowledgeArticleConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty {
        val builder = CfnDataSourceServiceNowKnowledgeArticleConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceServiceNowServiceCatalogConfigurationProperty(
        block: CfnDataSourceServiceNowServiceCatalogConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.ServiceNowServiceCatalogConfigurationProperty {
        val builder = CfnDataSourceServiceNowServiceCatalogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceSharePointConfigurationProperty(
        block: CfnDataSourceSharePointConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.SharePointConfigurationProperty {
        val builder = CfnDataSourceSharePointConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceSqlConfigurationProperty(
        block: CfnDataSourceSqlConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.SqlConfigurationProperty {
        val builder = CfnDataSourceSqlConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceWebCrawlerAuthenticationConfigurationProperty(
        block: CfnDataSourceWebCrawlerAuthenticationConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.WebCrawlerAuthenticationConfigurationProperty {
        val builder = CfnDataSourceWebCrawlerAuthenticationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceWebCrawlerBasicAuthenticationProperty(
        block: CfnDataSourceWebCrawlerBasicAuthenticationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.WebCrawlerBasicAuthenticationProperty {
        val builder = CfnDataSourceWebCrawlerBasicAuthenticationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceWebCrawlerConfigurationProperty(
        block: CfnDataSourceWebCrawlerConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.WebCrawlerConfigurationProperty {
        val builder = CfnDataSourceWebCrawlerConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceWebCrawlerSeedUrlConfigurationProperty(
        block: CfnDataSourceWebCrawlerSeedUrlConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.WebCrawlerSeedUrlConfigurationProperty {
        val builder = CfnDataSourceWebCrawlerSeedUrlConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceWebCrawlerSiteMapsConfigurationProperty(
        block: CfnDataSourceWebCrawlerSiteMapsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.WebCrawlerSiteMapsConfigurationProperty {
        val builder = CfnDataSourceWebCrawlerSiteMapsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceWebCrawlerUrlsProperty(
        block: CfnDataSourceWebCrawlerUrlsPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.WebCrawlerUrlsProperty {
        val builder = CfnDataSourceWebCrawlerUrlsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataSourceWorkDocsConfigurationProperty(
        block: CfnDataSourceWorkDocsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDataSource.WorkDocsConfigurationProperty {
        val builder = CfnDataSourceWorkDocsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFaq(
        scope: Construct,
        id: String,
        block: CfnFaqDsl.() -> Unit = {},
    ): CfnFaq {
        val builder = CfnFaqDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFaqProps(block: CfnFaqPropsDsl.() -> Unit = {}): CfnFaqProps {
        val builder = CfnFaqPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFaqS3PathProperty(block: CfnFaqS3PathPropertyDsl.() -> Unit = {}): CfnFaq.S3PathProperty {
        val builder = CfnFaqS3PathPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIndex(
        scope: Construct,
        id: String,
        block: CfnIndexDsl.() -> Unit = {},
    ): CfnIndex {
        val builder = CfnIndexDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIndexCapacityUnitsConfigurationProperty(
        block: CfnIndexCapacityUnitsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnIndex.CapacityUnitsConfigurationProperty {
        val builder = CfnIndexCapacityUnitsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIndexDocumentMetadataConfigurationProperty(
        block: CfnIndexDocumentMetadataConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnIndex.DocumentMetadataConfigurationProperty {
        val builder = CfnIndexDocumentMetadataConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIndexJsonTokenTypeConfigurationProperty(
        block: CfnIndexJsonTokenTypeConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnIndex.JsonTokenTypeConfigurationProperty {
        val builder = CfnIndexJsonTokenTypeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIndexJwtTokenTypeConfigurationProperty(
        block: CfnIndexJwtTokenTypeConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnIndex.JwtTokenTypeConfigurationProperty {
        val builder = CfnIndexJwtTokenTypeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIndexProps(block: CfnIndexPropsDsl.() -> Unit = {}): CfnIndexProps {
        val builder = CfnIndexPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIndexRelevanceProperty(block: CfnIndexRelevancePropertyDsl.() -> Unit = {}): CfnIndex.RelevanceProperty {
        val builder = CfnIndexRelevancePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIndexSearchProperty(block: CfnIndexSearchPropertyDsl.() -> Unit = {}): CfnIndex.SearchProperty {
        val builder = CfnIndexSearchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIndexServerSideEncryptionConfigurationProperty(
        block: CfnIndexServerSideEncryptionConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnIndex.ServerSideEncryptionConfigurationProperty {
        val builder = CfnIndexServerSideEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIndexUserTokenConfigurationProperty(
        block: CfnIndexUserTokenConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnIndex.UserTokenConfigurationProperty {
        val builder = CfnIndexUserTokenConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIndexValueImportanceItemProperty(
        block: CfnIndexValueImportanceItemPropertyDsl.() -> Unit =
            {},
    ): CfnIndex.ValueImportanceItemProperty {
        val builder = CfnIndexValueImportanceItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
