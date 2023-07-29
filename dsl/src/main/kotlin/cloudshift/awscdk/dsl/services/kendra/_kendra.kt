@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.kendra

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource
import software.amazon.awscdk.services.kendra.CfnDataSourceProps
import software.amazon.awscdk.services.kendra.CfnFaq
import software.amazon.awscdk.services.kendra.CfnFaqProps
import software.amazon.awscdk.services.kendra.CfnIndex
import software.amazon.awscdk.services.kendra.CfnIndexProps
import software.constructs.Construct

public object kendra {
    /**
     * Creates a data source connector that you want to use with an Amazon Kendra index.
     *
     * You specify a name, data source connector type and description for your data source. You also
     * specify configuration information for the data source connector.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * CfnDataSource cfnDataSource = CfnDataSource.Builder.create(this, "MyCfnDataSource")
     * .indexId("indexId")
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .customDocumentEnrichmentConfiguration(CustomDocumentEnrichmentConfigurationProperty.builder()
     * .inlineConfigurations(List.of(InlineCustomDocumentEnrichmentConfigurationProperty.builder()
     * .condition(DocumentAttributeConditionProperty.builder()
     * .conditionDocumentAttributeKey("conditionDocumentAttributeKey")
     * .operator("operator")
     * // the properties below are optional
     * .conditionOnValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .build())
     * .documentContentDeletion(false)
     * .target(DocumentAttributeTargetProperty.builder()
     * .targetDocumentAttributeKey("targetDocumentAttributeKey")
     * // the properties below are optional
     * .targetDocumentAttributeValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .targetDocumentAttributeValueDeletion(false)
     * .build())
     * .build()))
     * .postExtractionHookConfiguration(HookConfigurationProperty.builder()
     * .lambdaArn("lambdaArn")
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .invocationCondition(DocumentAttributeConditionProperty.builder()
     * .conditionDocumentAttributeKey("conditionDocumentAttributeKey")
     * .operator("operator")
     * // the properties below are optional
     * .conditionOnValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .build())
     * .build())
     * .preExtractionHookConfiguration(HookConfigurationProperty.builder()
     * .lambdaArn("lambdaArn")
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .invocationCondition(DocumentAttributeConditionProperty.builder()
     * .conditionDocumentAttributeKey("conditionDocumentAttributeKey")
     * .operator("operator")
     * // the properties below are optional
     * .conditionOnValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .build())
     * .build())
     * .roleArn("roleArn")
     * .build())
     * .dataSourceConfiguration(DataSourceConfigurationProperty.builder()
     * .confluenceConfiguration(ConfluenceConfigurationProperty.builder()
     * .secretArn("secretArn")
     * .serverUrl("serverUrl")
     * .version("version")
     * // the properties below are optional
     * .attachmentConfiguration(ConfluenceAttachmentConfigurationProperty.builder()
     * .attachmentFieldMappings(List.of(ConfluenceAttachmentToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .crawlAttachments(false)
     * .build())
     * .blogConfiguration(ConfluenceBlogConfigurationProperty.builder()
     * .blogFieldMappings(List.of(ConfluenceBlogToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .pageConfiguration(ConfluencePageConfigurationProperty.builder()
     * .pageFieldMappings(List.of(ConfluencePageToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .spaceConfiguration(ConfluenceSpaceConfigurationProperty.builder()
     * .crawlArchivedSpaces(false)
     * .crawlPersonalSpaces(false)
     * .excludeSpaces(List.of("excludeSpaces"))
     * .includeSpaces(List.of("includeSpaces"))
     * .spaceFieldMappings(List.of(ConfluenceSpaceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build())
     * .databaseConfiguration(DatabaseConfigurationProperty.builder()
     * .columnConfiguration(ColumnConfigurationProperty.builder()
     * .changeDetectingColumns(List.of("changeDetectingColumns"))
     * .documentDataColumnName("documentDataColumnName")
     * .documentIdColumnName("documentIdColumnName")
     * // the properties below are optional
     * .documentTitleColumnName("documentTitleColumnName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .connectionConfiguration(ConnectionConfigurationProperty.builder()
     * .databaseHost("databaseHost")
     * .databaseName("databaseName")
     * .databasePort(123)
     * .secretArn("secretArn")
     * .tableName("tableName")
     * .build())
     * .databaseEngineType("databaseEngineType")
     * // the properties below are optional
     * .aclConfiguration(AclConfigurationProperty.builder()
     * .allowedGroupsColumnName("allowedGroupsColumnName")
     * .build())
     * .sqlConfiguration(SqlConfigurationProperty.builder()
     * .queryIdentifiersEnclosingOption("queryIdentifiersEnclosingOption")
     * .build())
     * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build())
     * .googleDriveConfiguration(GoogleDriveConfigurationProperty.builder()
     * .secretArn("secretArn")
     * // the properties below are optional
     * .excludeMimeTypes(List.of("excludeMimeTypes"))
     * .excludeSharedDrives(List.of("excludeSharedDrives"))
     * .excludeUserAccounts(List.of("excludeUserAccounts"))
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .build())
     * .oneDriveConfiguration(OneDriveConfigurationProperty.builder()
     * .oneDriveUsers(OneDriveUsersProperty.builder()
     * .oneDriveUserList(List.of("oneDriveUserList"))
     * .oneDriveUserS3Path(S3PathProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .build())
     * .secretArn("secretArn")
     * .tenantDomain("tenantDomain")
     * // the properties below are optional
     * .disableLocalGroups(false)
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .build())
     * .s3Configuration(S3DataSourceConfigurationProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .accessControlListConfiguration(AccessControlListConfigurationProperty.builder()
     * .keyPath("keyPath")
     * .build())
     * .documentsMetadataConfiguration(DocumentsMetadataConfigurationProperty.builder()
     * .s3Prefix("s3Prefix")
     * .build())
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .inclusionPrefixes(List.of("inclusionPrefixes"))
     * .build())
     * .salesforceConfiguration(SalesforceConfigurationProperty.builder()
     * .secretArn("secretArn")
     * .serverUrl("serverUrl")
     * // the properties below are optional
     * .chatterFeedConfiguration(SalesforceChatterFeedConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .includeFilterTypes(List.of("includeFilterTypes"))
     * .build())
     * .crawlAttachments(false)
     * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
     * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
     * .knowledgeArticleConfiguration(SalesforceKnowledgeArticleConfigurationProperty.builder()
     * .includedStates(List.of("includedStates"))
     * // the properties below are optional
     * .customKnowledgeArticleTypeConfigurations(List.of(SalesforceCustomKnowledgeArticleTypeConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * .name("name")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build()))
     * .standardKnowledgeArticleTypeConfiguration(SalesforceStandardKnowledgeArticleTypeConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .build())
     * .standardObjectAttachmentConfiguration(SalesforceStandardObjectAttachmentConfigurationProperty.builder()
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .standardObjectConfigurations(List.of(SalesforceStandardObjectConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * .name("name")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build()))
     * .build())
     * .serviceNowConfiguration(ServiceNowConfigurationProperty.builder()
     * .hostUrl("hostUrl")
     * .secretArn("secretArn")
     * .serviceNowBuildVersion("serviceNowBuildVersion")
     * // the properties below are optional
     * .authenticationType("authenticationType")
     * .knowledgeArticleConfiguration(ServiceNowKnowledgeArticleConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .crawlAttachments(false)
     * .documentTitleFieldName("documentTitleFieldName")
     * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .filterQuery("filterQuery")
     * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
     * .build())
     * .serviceCatalogConfiguration(ServiceNowServiceCatalogConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .crawlAttachments(false)
     * .documentTitleFieldName("documentTitleFieldName")
     * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
     * .build())
     * .build())
     * .sharePointConfiguration(SharePointConfigurationProperty.builder()
     * .secretArn("secretArn")
     * .sharePointVersion("sharePointVersion")
     * .urls(List.of("urls"))
     * // the properties below are optional
     * .crawlAttachments(false)
     * .disableLocalGroups(false)
     * .documentTitleFieldName("documentTitleFieldName")
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .sslCertificateS3Path(S3PathProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .useChangeLog(false)
     * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build())
     * .webCrawlerConfiguration(WebCrawlerConfigurationProperty.builder()
     * .urls(WebCrawlerUrlsProperty.builder()
     * .seedUrlConfiguration(WebCrawlerSeedUrlConfigurationProperty.builder()
     * .seedUrls(List.of("seedUrls"))
     * // the properties below are optional
     * .webCrawlerMode("webCrawlerMode")
     * .build())
     * .siteMapsConfiguration(WebCrawlerSiteMapsConfigurationProperty.builder()
     * .siteMaps(List.of("siteMaps"))
     * .build())
     * .build())
     * // the properties below are optional
     * .authenticationConfiguration(WebCrawlerAuthenticationConfigurationProperty.builder()
     * .basicAuthentication(List.of(WebCrawlerBasicAuthenticationProperty.builder()
     * .credentials("credentials")
     * .host("host")
     * .port(123)
     * .build()))
     * .build())
     * .crawlDepth(123)
     * .maxContentSizePerPageInMegaBytes(123)
     * .maxLinksPerPage(123)
     * .maxUrlsPerMinuteCrawlRate(123)
     * .proxyConfiguration(ProxyConfigurationProperty.builder()
     * .host("host")
     * .port(123)
     * // the properties below are optional
     * .credentials("credentials")
     * .build())
     * .urlExclusionPatterns(List.of("urlExclusionPatterns"))
     * .urlInclusionPatterns(List.of("urlInclusionPatterns"))
     * .build())
     * .workDocsConfiguration(WorkDocsConfigurationProperty.builder()
     * .organizationId("organizationId")
     * // the properties below are optional
     * .crawlComments(false)
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .useChangeLog(false)
     * .build())
     * .build())
     * .description("description")
     * .roleArn("roleArn")
     * .schedule("schedule")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html)
     */
    public inline fun cfnDataSource(
        scope: Construct,
        id: String,
        block: CfnDataSourceDsl.() -> Unit = {},
    ): CfnDataSource {
        val builder = CfnDataSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies access control list files for the documents in a data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * AccessControlListConfigurationProperty accessControlListConfigurationProperty =
     * AccessControlListConfigurationProperty.builder()
     * .keyPath("keyPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-accesscontrollistconfiguration.html)
     */
    public inline fun cfnDataSourceAccessControlListConfigurationProperty(
        block: CfnDataSourceAccessControlListConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.AccessControlListConfigurationProperty {
        val builder = CfnDataSourceAccessControlListConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information about the column that should be used for filtering the query response by
     * groups.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * AclConfigurationProperty aclConfigurationProperty = AclConfigurationProperty.builder()
     * .allowedGroupsColumnName("allowedGroupsColumnName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-aclconfiguration.html)
     */
    public inline fun cfnDataSourceAclConfigurationProperty(
        block: CfnDataSourceAclConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.AclConfigurationProperty {
        val builder = CfnDataSourceAclConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information about how Amazon Kendra should use the columns of a database in an
     * index.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ColumnConfigurationProperty columnConfigurationProperty = ColumnConfigurationProperty.builder()
     * .changeDetectingColumns(List.of("changeDetectingColumns"))
     * .documentDataColumnName("documentDataColumnName")
     * .documentIdColumnName("documentIdColumnName")
     * // the properties below are optional
     * .documentTitleColumnName("documentTitleColumnName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-columnconfiguration.html)
     */
    public inline fun cfnDataSourceColumnConfigurationProperty(
        block: CfnDataSourceColumnConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ColumnConfigurationProperty {
        val builder = CfnDataSourceColumnConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of attachment settings for the Confluence data source.
     *
     * Attachment settings are optional, if you don't specify settings attachments, Amazon Kendra
     * won't index them.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ConfluenceAttachmentConfigurationProperty confluenceAttachmentConfigurationProperty =
     * ConfluenceAttachmentConfigurationProperty.builder()
     * .attachmentFieldMappings(List.of(ConfluenceAttachmentToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .crawlAttachments(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceattachmentconfiguration.html)
     */
    public inline fun cfnDataSourceConfluenceAttachmentConfigurationProperty(
        block: CfnDataSourceConfluenceAttachmentConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ConfluenceAttachmentConfigurationProperty {
        val builder = CfnDataSourceConfluenceAttachmentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Maps attributes or field names of Confluence attachments to Amazon Kendra index field names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
     * more information, see
     * [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     * . The Confuence data source field names must exist in your Confluence custom metadata.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ConfluenceAttachmentToIndexFieldMappingProperty confluenceAttachmentToIndexFieldMappingProperty
     * = ConfluenceAttachmentToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceattachmenttoindexfieldmapping.html)
     */
    public inline fun cfnDataSourceConfluenceAttachmentToIndexFieldMappingProperty(
        block: CfnDataSourceConfluenceAttachmentToIndexFieldMappingPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty {
        val builder = CfnDataSourceConfluenceAttachmentToIndexFieldMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of blog settings for the Confluence data source.
     *
     * Blogs are always indexed unless filtered from the index by the `ExclusionPatterns` or
     * `InclusionPatterns` fields in the `ConfluenceConfiguration` object.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ConfluenceBlogConfigurationProperty confluenceBlogConfigurationProperty =
     * ConfluenceBlogConfigurationProperty.builder()
     * .blogFieldMappings(List.of(ConfluenceBlogToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceblogconfiguration.html)
     */
    public inline fun cfnDataSourceConfluenceBlogConfigurationProperty(
        block: CfnDataSourceConfluenceBlogConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ConfluenceBlogConfigurationProperty {
        val builder = CfnDataSourceConfluenceBlogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Maps attributes or field names of Confluence blog to Amazon Kendra index field names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
     * more information, see
     * [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     * . The Confluence data source field names must exist in your Confluence custom metadata.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ConfluenceBlogToIndexFieldMappingProperty confluenceBlogToIndexFieldMappingProperty =
     * ConfluenceBlogToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceblogtoindexfieldmapping.html)
     */
    public inline fun cfnDataSourceConfluenceBlogToIndexFieldMappingProperty(
        block: CfnDataSourceConfluenceBlogToIndexFieldMappingPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty {
        val builder = CfnDataSourceConfluenceBlogToIndexFieldMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information to connect to Confluence as your data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ConfluenceConfigurationProperty confluenceConfigurationProperty =
     * ConfluenceConfigurationProperty.builder()
     * .secretArn("secretArn")
     * .serverUrl("serverUrl")
     * .version("version")
     * // the properties below are optional
     * .attachmentConfiguration(ConfluenceAttachmentConfigurationProperty.builder()
     * .attachmentFieldMappings(List.of(ConfluenceAttachmentToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .crawlAttachments(false)
     * .build())
     * .blogConfiguration(ConfluenceBlogConfigurationProperty.builder()
     * .blogFieldMappings(List.of(ConfluenceBlogToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .pageConfiguration(ConfluencePageConfigurationProperty.builder()
     * .pageFieldMappings(List.of(ConfluencePageToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .spaceConfiguration(ConfluenceSpaceConfigurationProperty.builder()
     * .crawlArchivedSpaces(false)
     * .crawlPersonalSpaces(false)
     * .excludeSpaces(List.of("excludeSpaces"))
     * .includeSpaces(List.of("includeSpaces"))
     * .spaceFieldMappings(List.of(ConfluenceSpaceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html)
     */
    public inline fun cfnDataSourceConfluenceConfigurationProperty(
        block: CfnDataSourceConfluenceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ConfluenceConfigurationProperty {
        val builder = CfnDataSourceConfluenceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of the page settings for the Confluence data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ConfluencePageConfigurationProperty confluencePageConfigurationProperty =
     * ConfluencePageConfigurationProperty.builder()
     * .pageFieldMappings(List.of(ConfluencePageToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencepageconfiguration.html)
     */
    public inline fun cfnDataSourceConfluencePageConfigurationProperty(
        block: CfnDataSourceConfluencePageConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ConfluencePageConfigurationProperty {
        val builder = CfnDataSourceConfluencePageConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Maps attributes or field names of Confluence pages to Amazon Kendra index field names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
     * more information, see
     * [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     * . The Confluence data source field names must exist in your Confluence custom metadata.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ConfluencePageToIndexFieldMappingProperty confluencePageToIndexFieldMappingProperty =
     * ConfluencePageToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencepagetoindexfieldmapping.html)
     */
    public inline fun cfnDataSourceConfluencePageToIndexFieldMappingProperty(
        block: CfnDataSourceConfluencePageToIndexFieldMappingPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ConfluencePageToIndexFieldMappingProperty {
        val builder = CfnDataSourceConfluencePageToIndexFieldMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration information for indexing Confluence spaces.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ConfluenceSpaceConfigurationProperty confluenceSpaceConfigurationProperty =
     * ConfluenceSpaceConfigurationProperty.builder()
     * .crawlArchivedSpaces(false)
     * .crawlPersonalSpaces(false)
     * .excludeSpaces(List.of("excludeSpaces"))
     * .includeSpaces(List.of("includeSpaces"))
     * .spaceFieldMappings(List.of(ConfluenceSpaceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespaceconfiguration.html)
     */
    public inline fun cfnDataSourceConfluenceSpaceConfigurationProperty(
        block: CfnDataSourceConfluenceSpaceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ConfluenceSpaceConfigurationProperty {
        val builder = CfnDataSourceConfluenceSpaceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Maps attributes or field names of Confluence spaces to Amazon Kendra index field names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
     * more information, see
     * [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     * . The Confluence data source field names must exist in your Confluence custom metadata.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ConfluenceSpaceToIndexFieldMappingProperty confluenceSpaceToIndexFieldMappingProperty =
     * ConfluenceSpaceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespacetoindexfieldmapping.html)
     */
    public inline fun cfnDataSourceConfluenceSpaceToIndexFieldMappingProperty(
        block: CfnDataSourceConfluenceSpaceToIndexFieldMappingPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty {
        val builder = CfnDataSourceConfluenceSpaceToIndexFieldMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information that's required to connect to a database.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ConnectionConfigurationProperty connectionConfigurationProperty =
     * ConnectionConfigurationProperty.builder()
     * .databaseHost("databaseHost")
     * .databaseName("databaseName")
     * .databasePort(123)
     * .secretArn("secretArn")
     * .tableName("tableName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-connectionconfiguration.html)
     */
    public inline fun cfnDataSourceConnectionConfigurationProperty(
        block: CfnDataSourceConnectionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ConnectionConfigurationProperty {
        val builder = CfnDataSourceConnectionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information for altering document metadata and content during the
     * document ingestion process.
     *
     * For more information, see
     * [Customizing document metadata during the ingestion process](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * CustomDocumentEnrichmentConfigurationProperty customDocumentEnrichmentConfigurationProperty =
     * CustomDocumentEnrichmentConfigurationProperty.builder()
     * .inlineConfigurations(List.of(InlineCustomDocumentEnrichmentConfigurationProperty.builder()
     * .condition(DocumentAttributeConditionProperty.builder()
     * .conditionDocumentAttributeKey("conditionDocumentAttributeKey")
     * .operator("operator")
     * // the properties below are optional
     * .conditionOnValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .build())
     * .documentContentDeletion(false)
     * .target(DocumentAttributeTargetProperty.builder()
     * .targetDocumentAttributeKey("targetDocumentAttributeKey")
     * // the properties below are optional
     * .targetDocumentAttributeValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .targetDocumentAttributeValueDeletion(false)
     * .build())
     * .build()))
     * .postExtractionHookConfiguration(HookConfigurationProperty.builder()
     * .lambdaArn("lambdaArn")
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .invocationCondition(DocumentAttributeConditionProperty.builder()
     * .conditionDocumentAttributeKey("conditionDocumentAttributeKey")
     * .operator("operator")
     * // the properties below are optional
     * .conditionOnValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .build())
     * .build())
     * .preExtractionHookConfiguration(HookConfigurationProperty.builder()
     * .lambdaArn("lambdaArn")
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .invocationCondition(DocumentAttributeConditionProperty.builder()
     * .conditionDocumentAttributeKey("conditionDocumentAttributeKey")
     * .operator("operator")
     * // the properties below are optional
     * .conditionOnValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .build())
     * .build())
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-customdocumentenrichmentconfiguration.html)
     */
    public inline fun cfnDataSourceCustomDocumentEnrichmentConfigurationProperty(
        block: CfnDataSourceCustomDocumentEnrichmentConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.CustomDocumentEnrichmentConfigurationProperty {
        val builder = CfnDataSourceCustomDocumentEnrichmentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information for an Amazon Kendra data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * DataSourceConfigurationProperty dataSourceConfigurationProperty =
     * DataSourceConfigurationProperty.builder()
     * .confluenceConfiguration(ConfluenceConfigurationProperty.builder()
     * .secretArn("secretArn")
     * .serverUrl("serverUrl")
     * .version("version")
     * // the properties below are optional
     * .attachmentConfiguration(ConfluenceAttachmentConfigurationProperty.builder()
     * .attachmentFieldMappings(List.of(ConfluenceAttachmentToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .crawlAttachments(false)
     * .build())
     * .blogConfiguration(ConfluenceBlogConfigurationProperty.builder()
     * .blogFieldMappings(List.of(ConfluenceBlogToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .pageConfiguration(ConfluencePageConfigurationProperty.builder()
     * .pageFieldMappings(List.of(ConfluencePageToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .spaceConfiguration(ConfluenceSpaceConfigurationProperty.builder()
     * .crawlArchivedSpaces(false)
     * .crawlPersonalSpaces(false)
     * .excludeSpaces(List.of("excludeSpaces"))
     * .includeSpaces(List.of("includeSpaces"))
     * .spaceFieldMappings(List.of(ConfluenceSpaceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build())
     * .databaseConfiguration(DatabaseConfigurationProperty.builder()
     * .columnConfiguration(ColumnConfigurationProperty.builder()
     * .changeDetectingColumns(List.of("changeDetectingColumns"))
     * .documentDataColumnName("documentDataColumnName")
     * .documentIdColumnName("documentIdColumnName")
     * // the properties below are optional
     * .documentTitleColumnName("documentTitleColumnName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .connectionConfiguration(ConnectionConfigurationProperty.builder()
     * .databaseHost("databaseHost")
     * .databaseName("databaseName")
     * .databasePort(123)
     * .secretArn("secretArn")
     * .tableName("tableName")
     * .build())
     * .databaseEngineType("databaseEngineType")
     * // the properties below are optional
     * .aclConfiguration(AclConfigurationProperty.builder()
     * .allowedGroupsColumnName("allowedGroupsColumnName")
     * .build())
     * .sqlConfiguration(SqlConfigurationProperty.builder()
     * .queryIdentifiersEnclosingOption("queryIdentifiersEnclosingOption")
     * .build())
     * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build())
     * .googleDriveConfiguration(GoogleDriveConfigurationProperty.builder()
     * .secretArn("secretArn")
     * // the properties below are optional
     * .excludeMimeTypes(List.of("excludeMimeTypes"))
     * .excludeSharedDrives(List.of("excludeSharedDrives"))
     * .excludeUserAccounts(List.of("excludeUserAccounts"))
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .build())
     * .oneDriveConfiguration(OneDriveConfigurationProperty.builder()
     * .oneDriveUsers(OneDriveUsersProperty.builder()
     * .oneDriveUserList(List.of("oneDriveUserList"))
     * .oneDriveUserS3Path(S3PathProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .build())
     * .secretArn("secretArn")
     * .tenantDomain("tenantDomain")
     * // the properties below are optional
     * .disableLocalGroups(false)
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .build())
     * .s3Configuration(S3DataSourceConfigurationProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .accessControlListConfiguration(AccessControlListConfigurationProperty.builder()
     * .keyPath("keyPath")
     * .build())
     * .documentsMetadataConfiguration(DocumentsMetadataConfigurationProperty.builder()
     * .s3Prefix("s3Prefix")
     * .build())
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .inclusionPrefixes(List.of("inclusionPrefixes"))
     * .build())
     * .salesforceConfiguration(SalesforceConfigurationProperty.builder()
     * .secretArn("secretArn")
     * .serverUrl("serverUrl")
     * // the properties below are optional
     * .chatterFeedConfiguration(SalesforceChatterFeedConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .includeFilterTypes(List.of("includeFilterTypes"))
     * .build())
     * .crawlAttachments(false)
     * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
     * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
     * .knowledgeArticleConfiguration(SalesforceKnowledgeArticleConfigurationProperty.builder()
     * .includedStates(List.of("includedStates"))
     * // the properties below are optional
     * .customKnowledgeArticleTypeConfigurations(List.of(SalesforceCustomKnowledgeArticleTypeConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * .name("name")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build()))
     * .standardKnowledgeArticleTypeConfiguration(SalesforceStandardKnowledgeArticleTypeConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .build())
     * .standardObjectAttachmentConfiguration(SalesforceStandardObjectAttachmentConfigurationProperty.builder()
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .standardObjectConfigurations(List.of(SalesforceStandardObjectConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * .name("name")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build()))
     * .build())
     * .serviceNowConfiguration(ServiceNowConfigurationProperty.builder()
     * .hostUrl("hostUrl")
     * .secretArn("secretArn")
     * .serviceNowBuildVersion("serviceNowBuildVersion")
     * // the properties below are optional
     * .authenticationType("authenticationType")
     * .knowledgeArticleConfiguration(ServiceNowKnowledgeArticleConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .crawlAttachments(false)
     * .documentTitleFieldName("documentTitleFieldName")
     * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .filterQuery("filterQuery")
     * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
     * .build())
     * .serviceCatalogConfiguration(ServiceNowServiceCatalogConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .crawlAttachments(false)
     * .documentTitleFieldName("documentTitleFieldName")
     * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
     * .build())
     * .build())
     * .sharePointConfiguration(SharePointConfigurationProperty.builder()
     * .secretArn("secretArn")
     * .sharePointVersion("sharePointVersion")
     * .urls(List.of("urls"))
     * // the properties below are optional
     * .crawlAttachments(false)
     * .disableLocalGroups(false)
     * .documentTitleFieldName("documentTitleFieldName")
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .sslCertificateS3Path(S3PathProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .useChangeLog(false)
     * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build())
     * .webCrawlerConfiguration(WebCrawlerConfigurationProperty.builder()
     * .urls(WebCrawlerUrlsProperty.builder()
     * .seedUrlConfiguration(WebCrawlerSeedUrlConfigurationProperty.builder()
     * .seedUrls(List.of("seedUrls"))
     * // the properties below are optional
     * .webCrawlerMode("webCrawlerMode")
     * .build())
     * .siteMapsConfiguration(WebCrawlerSiteMapsConfigurationProperty.builder()
     * .siteMaps(List.of("siteMaps"))
     * .build())
     * .build())
     * // the properties below are optional
     * .authenticationConfiguration(WebCrawlerAuthenticationConfigurationProperty.builder()
     * .basicAuthentication(List.of(WebCrawlerBasicAuthenticationProperty.builder()
     * .credentials("credentials")
     * .host("host")
     * .port(123)
     * .build()))
     * .build())
     * .crawlDepth(123)
     * .maxContentSizePerPageInMegaBytes(123)
     * .maxLinksPerPage(123)
     * .maxUrlsPerMinuteCrawlRate(123)
     * .proxyConfiguration(ProxyConfigurationProperty.builder()
     * .host("host")
     * .port(123)
     * // the properties below are optional
     * .credentials("credentials")
     * .build())
     * .urlExclusionPatterns(List.of("urlExclusionPatterns"))
     * .urlInclusionPatterns(List.of("urlInclusionPatterns"))
     * .build())
     * .workDocsConfiguration(WorkDocsConfigurationProperty.builder()
     * .organizationId("organizationId")
     * // the properties below are optional
     * .crawlComments(false)
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .useChangeLog(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html)
     */
    public inline fun cfnDataSourceDataSourceConfigurationProperty(
        block: CfnDataSourceDataSourceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.DataSourceConfigurationProperty {
        val builder = CfnDataSourceDataSourceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Maps a column or attribute in the data source to an index field.
     *
     * You must first create the fields in the index using the
     * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * DataSourceToIndexFieldMappingProperty dataSourceToIndexFieldMappingProperty =
     * DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourcetoindexfieldmapping.html)
     */
    public inline fun cfnDataSourceDataSourceToIndexFieldMappingProperty(
        block: CfnDataSourceDataSourceToIndexFieldMappingPropertyDsl.() -> Unit = {}
    ): CfnDataSource.DataSourceToIndexFieldMappingProperty {
        val builder = CfnDataSourceDataSourceToIndexFieldMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information to connect to an Amazon VPC.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * DataSourceVpcConfigurationProperty dataSourceVpcConfigurationProperty =
     * DataSourceVpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourcevpcconfiguration.html)
     */
    public inline fun cfnDataSourceDataSourceVpcConfigurationProperty(
        block: CfnDataSourceDataSourceVpcConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.DataSourceVpcConfigurationProperty {
        val builder = CfnDataSourceDataSourceVpcConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information to connect to a index.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * DatabaseConfigurationProperty databaseConfigurationProperty =
     * DatabaseConfigurationProperty.builder()
     * .columnConfiguration(ColumnConfigurationProperty.builder()
     * .changeDetectingColumns(List.of("changeDetectingColumns"))
     * .documentDataColumnName("documentDataColumnName")
     * .documentIdColumnName("documentIdColumnName")
     * // the properties below are optional
     * .documentTitleColumnName("documentTitleColumnName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .connectionConfiguration(ConnectionConfigurationProperty.builder()
     * .databaseHost("databaseHost")
     * .databaseName("databaseName")
     * .databasePort(123)
     * .secretArn("secretArn")
     * .tableName("tableName")
     * .build())
     * .databaseEngineType("databaseEngineType")
     * // the properties below are optional
     * .aclConfiguration(AclConfigurationProperty.builder()
     * .allowedGroupsColumnName("allowedGroupsColumnName")
     * .build())
     * .sqlConfiguration(SqlConfigurationProperty.builder()
     * .queryIdentifiersEnclosingOption("queryIdentifiersEnclosingOption")
     * .build())
     * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-databaseconfiguration.html)
     */
    public inline fun cfnDataSourceDatabaseConfigurationProperty(
        block: CfnDataSourceDatabaseConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.DatabaseConfigurationProperty {
        val builder = CfnDataSourceDatabaseConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The condition used for the target document attribute or metadata field when ingesting
     * documents into Amazon Kendra.
     *
     * You use this with
     * [DocumentAttributeTarget to apply the condition](https://docs.aws.amazon.com/kendra/latest/dg/API_DocumentAttributeTarget.html)
     * .
     *
     * For example, you can create the 'Department' target field and have it prefill department
     * names associated with the documents based on information in the 'Source_URI' field. Set the
     * condition that if the 'Source_URI' field contains 'financial' in its URI value, then prefill
     * the target field 'Department' with the target value 'Finance' for the document.
     *
     * Amazon Kendra cannot create a target field if it has not already been created as an index
     * field. After you create your index field, you can create a document metadata field using
     * `DocumentAttributeTarget` . Amazon Kendra then will map your newly created metadata field to
     * your index field.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * DocumentAttributeConditionProperty documentAttributeConditionProperty =
     * DocumentAttributeConditionProperty.builder()
     * .conditionDocumentAttributeKey("conditionDocumentAttributeKey")
     * .operator("operator")
     * // the properties below are optional
     * .conditionOnValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributecondition.html)
     */
    public inline fun cfnDataSourceDocumentAttributeConditionProperty(
        block: CfnDataSourceDocumentAttributeConditionPropertyDsl.() -> Unit = {}
    ): CfnDataSource.DocumentAttributeConditionProperty {
        val builder = CfnDataSourceDocumentAttributeConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The target document attribute or metadata field you want to alter when ingesting documents
     * into Amazon Kendra.
     *
     * For example, you can delete customer identification numbers associated with the documents,
     * stored in the document metadata field called 'Customer_ID'. You set the target key as
     * 'Customer_ID' and the deletion flag to `TRUE` . This removes all customer ID values in the
     * field 'Customer_ID'. This would scrub personally identifiable information from each
     * document's metadata.
     *
     * Amazon Kendra cannot create a target field if it has not already been created as an index
     * field. After you create your index field, you can create a document metadata field using
     * `DocumentAttributeTarget` . Amazon Kendra then will map your newly created metadata field to
     * your index field.
     *
     * You can also use this with
     * [DocumentAttributeCondition](https://docs.aws.amazon.com/kendra/latest/dg/API_DocumentAttributeCondition.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * DocumentAttributeTargetProperty documentAttributeTargetProperty =
     * DocumentAttributeTargetProperty.builder()
     * .targetDocumentAttributeKey("targetDocumentAttributeKey")
     * // the properties below are optional
     * .targetDocumentAttributeValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .targetDocumentAttributeValueDeletion(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributetarget.html)
     */
    public inline fun cfnDataSourceDocumentAttributeTargetProperty(
        block: CfnDataSourceDocumentAttributeTargetPropertyDsl.() -> Unit = {}
    ): CfnDataSource.DocumentAttributeTargetProperty {
        val builder = CfnDataSourceDocumentAttributeTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The value of a document attribute.
     *
     * You can only provide one value for a document attribute.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * DocumentAttributeValueProperty documentAttributeValueProperty =
     * DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributevalue.html)
     */
    public inline fun cfnDataSourceDocumentAttributeValueProperty(
        block: CfnDataSourceDocumentAttributeValuePropertyDsl.() -> Unit = {}
    ): CfnDataSource.DocumentAttributeValueProperty {
        val builder = CfnDataSourceDocumentAttributeValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Document metadata files that contain information such as the document access control
     * information, source URI, document author, and custom attributes.
     *
     * Each metadata file contains metadata about a single document.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * DocumentsMetadataConfigurationProperty documentsMetadataConfigurationProperty =
     * DocumentsMetadataConfigurationProperty.builder()
     * .s3Prefix("s3Prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentsmetadataconfiguration.html)
     */
    public inline fun cfnDataSourceDocumentsMetadataConfigurationProperty(
        block: CfnDataSourceDocumentsMetadataConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.DocumentsMetadataConfigurationProperty {
        val builder = CfnDataSourceDocumentsMetadataConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information to connect to Google Drive as your data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * GoogleDriveConfigurationProperty googleDriveConfigurationProperty =
     * GoogleDriveConfigurationProperty.builder()
     * .secretArn("secretArn")
     * // the properties below are optional
     * .excludeMimeTypes(List.of("excludeMimeTypes"))
     * .excludeSharedDrives(List.of("excludeSharedDrives"))
     * .excludeUserAccounts(List.of("excludeUserAccounts"))
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html)
     */
    public inline fun cfnDataSourceGoogleDriveConfigurationProperty(
        block: CfnDataSourceGoogleDriveConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.GoogleDriveConfigurationProperty {
        val builder = CfnDataSourceGoogleDriveConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information for invoking a Lambda function in AWS Lambda to alter
     * document metadata and content when ingesting documents into Amazon Kendra.
     *
     * You can configure your Lambda function using
     * [PreExtractionHookConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_CustomDocumentEnrichmentConfiguration.html)
     * if you want to apply advanced alterations on the original or raw documents. If you want to
     * apply advanced alterations on the Amazon Kendra structured documents, you must configure your
     * Lambda function using
     * [PostExtractionHookConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_CustomDocumentEnrichmentConfiguration.html)
     * . You can only invoke one Lambda function. However, this function can invoke other functions
     * it requires.
     *
     * For more information, see
     * [Customizing document metadata during the ingestion process](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * HookConfigurationProperty hookConfigurationProperty = HookConfigurationProperty.builder()
     * .lambdaArn("lambdaArn")
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .invocationCondition(DocumentAttributeConditionProperty.builder()
     * .conditionDocumentAttributeKey("conditionDocumentAttributeKey")
     * .operator("operator")
     * // the properties below are optional
     * .conditionOnValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-hookconfiguration.html)
     */
    public inline fun cfnDataSourceHookConfigurationProperty(
        block: CfnDataSourceHookConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.HookConfigurationProperty {
        val builder = CfnDataSourceHookConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information for applying basic logic to alter document metadata
     * and content when ingesting documents into Amazon Kendra.
     *
     * To apply advanced logic, to go beyond what you can do with basic logic, see
     * [HookConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_HookConfiguration.html)
     * .
     *
     * For more information, see
     * [Customizing document metadata during the ingestion process](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * InlineCustomDocumentEnrichmentConfigurationProperty
     * inlineCustomDocumentEnrichmentConfigurationProperty =
     * InlineCustomDocumentEnrichmentConfigurationProperty.builder()
     * .condition(DocumentAttributeConditionProperty.builder()
     * .conditionDocumentAttributeKey("conditionDocumentAttributeKey")
     * .operator("operator")
     * // the properties below are optional
     * .conditionOnValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .build())
     * .documentContentDeletion(false)
     * .target(DocumentAttributeTargetProperty.builder()
     * .targetDocumentAttributeKey("targetDocumentAttributeKey")
     * // the properties below are optional
     * .targetDocumentAttributeValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .targetDocumentAttributeValueDeletion(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-inlinecustomdocumentenrichmentconfiguration.html)
     */
    public inline fun cfnDataSourceInlineCustomDocumentEnrichmentConfigurationProperty(
        block: CfnDataSourceInlineCustomDocumentEnrichmentConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty {
        val builder = CfnDataSourceInlineCustomDocumentEnrichmentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information to connect to OneDrive as your data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * OneDriveConfigurationProperty oneDriveConfigurationProperty =
     * OneDriveConfigurationProperty.builder()
     * .oneDriveUsers(OneDriveUsersProperty.builder()
     * .oneDriveUserList(List.of("oneDriveUserList"))
     * .oneDriveUserS3Path(S3PathProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .build())
     * .secretArn("secretArn")
     * .tenantDomain("tenantDomain")
     * // the properties below are optional
     * .disableLocalGroups(false)
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html)
     */
    public inline fun cfnDataSourceOneDriveConfigurationProperty(
        block: CfnDataSourceOneDriveConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.OneDriveConfigurationProperty {
        val builder = CfnDataSourceOneDriveConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * User accounts whose documents should be indexed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * OneDriveUsersProperty oneDriveUsersProperty = OneDriveUsersProperty.builder()
     * .oneDriveUserList(List.of("oneDriveUserList"))
     * .oneDriveUserS3Path(S3PathProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveusers.html)
     */
    public inline fun cfnDataSourceOneDriveUsersProperty(
        block: CfnDataSourceOneDriveUsersPropertyDsl.() -> Unit = {}
    ): CfnDataSource.OneDriveUsersProperty {
        val builder = CfnDataSourceOneDriveUsersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDataSource`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * CfnDataSourceProps cfnDataSourceProps = CfnDataSourceProps.builder()
     * .indexId("indexId")
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .customDocumentEnrichmentConfiguration(CustomDocumentEnrichmentConfigurationProperty.builder()
     * .inlineConfigurations(List.of(InlineCustomDocumentEnrichmentConfigurationProperty.builder()
     * .condition(DocumentAttributeConditionProperty.builder()
     * .conditionDocumentAttributeKey("conditionDocumentAttributeKey")
     * .operator("operator")
     * // the properties below are optional
     * .conditionOnValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .build())
     * .documentContentDeletion(false)
     * .target(DocumentAttributeTargetProperty.builder()
     * .targetDocumentAttributeKey("targetDocumentAttributeKey")
     * // the properties below are optional
     * .targetDocumentAttributeValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .targetDocumentAttributeValueDeletion(false)
     * .build())
     * .build()))
     * .postExtractionHookConfiguration(HookConfigurationProperty.builder()
     * .lambdaArn("lambdaArn")
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .invocationCondition(DocumentAttributeConditionProperty.builder()
     * .conditionDocumentAttributeKey("conditionDocumentAttributeKey")
     * .operator("operator")
     * // the properties below are optional
     * .conditionOnValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .build())
     * .build())
     * .preExtractionHookConfiguration(HookConfigurationProperty.builder()
     * .lambdaArn("lambdaArn")
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .invocationCondition(DocumentAttributeConditionProperty.builder()
     * .conditionDocumentAttributeKey("conditionDocumentAttributeKey")
     * .operator("operator")
     * // the properties below are optional
     * .conditionOnValue(DocumentAttributeValueProperty.builder()
     * .dateValue("dateValue")
     * .longValue(123)
     * .stringListValue(List.of("stringListValue"))
     * .stringValue("stringValue")
     * .build())
     * .build())
     * .build())
     * .roleArn("roleArn")
     * .build())
     * .dataSourceConfiguration(DataSourceConfigurationProperty.builder()
     * .confluenceConfiguration(ConfluenceConfigurationProperty.builder()
     * .secretArn("secretArn")
     * .serverUrl("serverUrl")
     * .version("version")
     * // the properties below are optional
     * .attachmentConfiguration(ConfluenceAttachmentConfigurationProperty.builder()
     * .attachmentFieldMappings(List.of(ConfluenceAttachmentToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .crawlAttachments(false)
     * .build())
     * .blogConfiguration(ConfluenceBlogConfigurationProperty.builder()
     * .blogFieldMappings(List.of(ConfluenceBlogToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .pageConfiguration(ConfluencePageConfigurationProperty.builder()
     * .pageFieldMappings(List.of(ConfluencePageToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .spaceConfiguration(ConfluenceSpaceConfigurationProperty.builder()
     * .crawlArchivedSpaces(false)
     * .crawlPersonalSpaces(false)
     * .excludeSpaces(List.of("excludeSpaces"))
     * .includeSpaces(List.of("includeSpaces"))
     * .spaceFieldMappings(List.of(ConfluenceSpaceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build())
     * .databaseConfiguration(DatabaseConfigurationProperty.builder()
     * .columnConfiguration(ColumnConfigurationProperty.builder()
     * .changeDetectingColumns(List.of("changeDetectingColumns"))
     * .documentDataColumnName("documentDataColumnName")
     * .documentIdColumnName("documentIdColumnName")
     * // the properties below are optional
     * .documentTitleColumnName("documentTitleColumnName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .connectionConfiguration(ConnectionConfigurationProperty.builder()
     * .databaseHost("databaseHost")
     * .databaseName("databaseName")
     * .databasePort(123)
     * .secretArn("secretArn")
     * .tableName("tableName")
     * .build())
     * .databaseEngineType("databaseEngineType")
     * // the properties below are optional
     * .aclConfiguration(AclConfigurationProperty.builder()
     * .allowedGroupsColumnName("allowedGroupsColumnName")
     * .build())
     * .sqlConfiguration(SqlConfigurationProperty.builder()
     * .queryIdentifiersEnclosingOption("queryIdentifiersEnclosingOption")
     * .build())
     * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build())
     * .googleDriveConfiguration(GoogleDriveConfigurationProperty.builder()
     * .secretArn("secretArn")
     * // the properties below are optional
     * .excludeMimeTypes(List.of("excludeMimeTypes"))
     * .excludeSharedDrives(List.of("excludeSharedDrives"))
     * .excludeUserAccounts(List.of("excludeUserAccounts"))
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .build())
     * .oneDriveConfiguration(OneDriveConfigurationProperty.builder()
     * .oneDriveUsers(OneDriveUsersProperty.builder()
     * .oneDriveUserList(List.of("oneDriveUserList"))
     * .oneDriveUserS3Path(S3PathProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .build())
     * .secretArn("secretArn")
     * .tenantDomain("tenantDomain")
     * // the properties below are optional
     * .disableLocalGroups(false)
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .build())
     * .s3Configuration(S3DataSourceConfigurationProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .accessControlListConfiguration(AccessControlListConfigurationProperty.builder()
     * .keyPath("keyPath")
     * .build())
     * .documentsMetadataConfiguration(DocumentsMetadataConfigurationProperty.builder()
     * .s3Prefix("s3Prefix")
     * .build())
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .inclusionPrefixes(List.of("inclusionPrefixes"))
     * .build())
     * .salesforceConfiguration(SalesforceConfigurationProperty.builder()
     * .secretArn("secretArn")
     * .serverUrl("serverUrl")
     * // the properties below are optional
     * .chatterFeedConfiguration(SalesforceChatterFeedConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .includeFilterTypes(List.of("includeFilterTypes"))
     * .build())
     * .crawlAttachments(false)
     * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
     * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
     * .knowledgeArticleConfiguration(SalesforceKnowledgeArticleConfigurationProperty.builder()
     * .includedStates(List.of("includedStates"))
     * // the properties below are optional
     * .customKnowledgeArticleTypeConfigurations(List.of(SalesforceCustomKnowledgeArticleTypeConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * .name("name")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build()))
     * .standardKnowledgeArticleTypeConfiguration(SalesforceStandardKnowledgeArticleTypeConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .build())
     * .standardObjectAttachmentConfiguration(SalesforceStandardObjectAttachmentConfigurationProperty.builder()
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .standardObjectConfigurations(List.of(SalesforceStandardObjectConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * .name("name")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build()))
     * .build())
     * .serviceNowConfiguration(ServiceNowConfigurationProperty.builder()
     * .hostUrl("hostUrl")
     * .secretArn("secretArn")
     * .serviceNowBuildVersion("serviceNowBuildVersion")
     * // the properties below are optional
     * .authenticationType("authenticationType")
     * .knowledgeArticleConfiguration(ServiceNowKnowledgeArticleConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .crawlAttachments(false)
     * .documentTitleFieldName("documentTitleFieldName")
     * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .filterQuery("filterQuery")
     * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
     * .build())
     * .serviceCatalogConfiguration(ServiceNowServiceCatalogConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .crawlAttachments(false)
     * .documentTitleFieldName("documentTitleFieldName")
     * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
     * .build())
     * .build())
     * .sharePointConfiguration(SharePointConfigurationProperty.builder()
     * .secretArn("secretArn")
     * .sharePointVersion("sharePointVersion")
     * .urls(List.of("urls"))
     * // the properties below are optional
     * .crawlAttachments(false)
     * .disableLocalGroups(false)
     * .documentTitleFieldName("documentTitleFieldName")
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .sslCertificateS3Path(S3PathProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .useChangeLog(false)
     * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build())
     * .webCrawlerConfiguration(WebCrawlerConfigurationProperty.builder()
     * .urls(WebCrawlerUrlsProperty.builder()
     * .seedUrlConfiguration(WebCrawlerSeedUrlConfigurationProperty.builder()
     * .seedUrls(List.of("seedUrls"))
     * // the properties below are optional
     * .webCrawlerMode("webCrawlerMode")
     * .build())
     * .siteMapsConfiguration(WebCrawlerSiteMapsConfigurationProperty.builder()
     * .siteMaps(List.of("siteMaps"))
     * .build())
     * .build())
     * // the properties below are optional
     * .authenticationConfiguration(WebCrawlerAuthenticationConfigurationProperty.builder()
     * .basicAuthentication(List.of(WebCrawlerBasicAuthenticationProperty.builder()
     * .credentials("credentials")
     * .host("host")
     * .port(123)
     * .build()))
     * .build())
     * .crawlDepth(123)
     * .maxContentSizePerPageInMegaBytes(123)
     * .maxLinksPerPage(123)
     * .maxUrlsPerMinuteCrawlRate(123)
     * .proxyConfiguration(ProxyConfigurationProperty.builder()
     * .host("host")
     * .port(123)
     * // the properties below are optional
     * .credentials("credentials")
     * .build())
     * .urlExclusionPatterns(List.of("urlExclusionPatterns"))
     * .urlInclusionPatterns(List.of("urlInclusionPatterns"))
     * .build())
     * .workDocsConfiguration(WorkDocsConfigurationProperty.builder()
     * .organizationId("organizationId")
     * // the properties below are optional
     * .crawlComments(false)
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .useChangeLog(false)
     * .build())
     * .build())
     * .description("description")
     * .roleArn("roleArn")
     * .schedule("schedule")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html)
     */
    public inline fun cfnDataSourceProps(
        block: CfnDataSourcePropsDsl.() -> Unit = {}
    ): CfnDataSourceProps {
        val builder = CfnDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information for a web proxy to connect to website hosts.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ProxyConfigurationProperty proxyConfigurationProperty = ProxyConfigurationProperty.builder()
     * .host("host")
     * .port(123)
     * // the properties below are optional
     * .credentials("credentials")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-proxyconfiguration.html)
     */
    public inline fun cfnDataSourceProxyConfigurationProperty(
        block: CfnDataSourceProxyConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ProxyConfigurationProperty {
        val builder = CfnDataSourceProxyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information to connect to an Amazon S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * S3DataSourceConfigurationProperty s3DataSourceConfigurationProperty =
     * S3DataSourceConfigurationProperty.builder()
     * .bucketName("bucketName")
     * // the properties below are optional
     * .accessControlListConfiguration(AccessControlListConfigurationProperty.builder()
     * .keyPath("keyPath")
     * .build())
     * .documentsMetadataConfiguration(DocumentsMetadataConfigurationProperty.builder()
     * .s3Prefix("s3Prefix")
     * .build())
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .inclusionPrefixes(List.of("inclusionPrefixes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3datasourceconfiguration.html)
     */
    public inline fun cfnDataSourceS3DataSourceConfigurationProperty(
        block: CfnDataSourceS3DataSourceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.S3DataSourceConfigurationProperty {
        val builder = CfnDataSourceS3DataSourceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information required to find a specific file in an Amazon S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * S3PathProperty s3PathProperty = S3PathProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3path.html)
     */
    public inline fun cfnDataSourceS3PathProperty(
        block: CfnDataSourceS3PathPropertyDsl.() -> Unit = {}
    ): CfnDataSource.S3PathProperty {
        val builder = CfnDataSourceS3PathPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration information for syncing a Salesforce chatter feed.
     *
     * The contents of the object comes from the Salesforce FeedItem table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * SalesforceChatterFeedConfigurationProperty salesforceChatterFeedConfigurationProperty =
     * SalesforceChatterFeedConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .includeFilterTypes(List.of("includeFilterTypes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcechatterfeedconfiguration.html)
     */
    public inline fun cfnDataSourceSalesforceChatterFeedConfigurationProperty(
        block: CfnDataSourceSalesforceChatterFeedConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.SalesforceChatterFeedConfigurationProperty {
        val builder = CfnDataSourceSalesforceChatterFeedConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information to connect to Salesforce as your data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * SalesforceConfigurationProperty salesforceConfigurationProperty =
     * SalesforceConfigurationProperty.builder()
     * .secretArn("secretArn")
     * .serverUrl("serverUrl")
     * // the properties below are optional
     * .chatterFeedConfiguration(SalesforceChatterFeedConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .includeFilterTypes(List.of("includeFilterTypes"))
     * .build())
     * .crawlAttachments(false)
     * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
     * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
     * .knowledgeArticleConfiguration(SalesforceKnowledgeArticleConfigurationProperty.builder()
     * .includedStates(List.of("includedStates"))
     * // the properties below are optional
     * .customKnowledgeArticleTypeConfigurations(List.of(SalesforceCustomKnowledgeArticleTypeConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * .name("name")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build()))
     * .standardKnowledgeArticleTypeConfiguration(SalesforceStandardKnowledgeArticleTypeConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .build())
     * .standardObjectAttachmentConfiguration(SalesforceStandardObjectAttachmentConfigurationProperty.builder()
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .standardObjectConfigurations(List.of(SalesforceStandardObjectConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * .name("name")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html)
     */
    public inline fun cfnDataSourceSalesforceConfigurationProperty(
        block: CfnDataSourceSalesforceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.SalesforceConfigurationProperty {
        val builder = CfnDataSourceSalesforceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information for indexing Salesforce custom articles.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * SalesforceCustomKnowledgeArticleTypeConfigurationProperty
     * salesforceCustomKnowledgeArticleTypeConfigurationProperty =
     * SalesforceCustomKnowledgeArticleTypeConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * .name("name")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration.html)
     */
    public inline fun cfnDataSourceSalesforceCustomKnowledgeArticleTypeConfigurationProperty(
        block:
            CfnDataSourceSalesforceCustomKnowledgeArticleTypeConfigurationPropertyDsl.() -> Unit =
            {}
    ): CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty {
        val builder = CfnDataSourceSalesforceCustomKnowledgeArticleTypeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information for the knowledge article types that Amazon Kendra
     * indexes.
     *
     * Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge
     * articles, or the custom fields of custom knowledge articles, but not both
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * SalesforceKnowledgeArticleConfigurationProperty salesforceKnowledgeArticleConfigurationProperty
     * = SalesforceKnowledgeArticleConfigurationProperty.builder()
     * .includedStates(List.of("includedStates"))
     * // the properties below are optional
     * .customKnowledgeArticleTypeConfigurations(List.of(SalesforceCustomKnowledgeArticleTypeConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * .name("name")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build()))
     * .standardKnowledgeArticleTypeConfiguration(SalesforceStandardKnowledgeArticleTypeConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceknowledgearticleconfiguration.html)
     */
    public inline fun cfnDataSourceSalesforceKnowledgeArticleConfigurationProperty(
        block: CfnDataSourceSalesforceKnowledgeArticleConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty {
        val builder = CfnDataSourceSalesforceKnowledgeArticleConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information for standard Salesforce knowledge articles.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * SalesforceStandardKnowledgeArticleTypeConfigurationProperty
     * salesforceStandardKnowledgeArticleTypeConfigurationProperty =
     * SalesforceStandardKnowledgeArticleTypeConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardknowledgearticletypeconfiguration.html)
     */
    public inline fun cfnDataSourceSalesforceStandardKnowledgeArticleTypeConfigurationProperty(
        block:
            CfnDataSourceSalesforceStandardKnowledgeArticleTypeConfigurationPropertyDsl.() -> Unit =
            {}
    ): CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty {
        val builder = CfnDataSourceSalesforceStandardKnowledgeArticleTypeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information for processing attachments to Salesforce standard
     * objects.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * SalesforceStandardObjectAttachmentConfigurationProperty
     * salesforceStandardObjectAttachmentConfigurationProperty =
     * SalesforceStandardObjectAttachmentConfigurationProperty.builder()
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardobjectattachmentconfiguration.html)
     */
    public inline fun cfnDataSourceSalesforceStandardObjectAttachmentConfigurationProperty(
        block: CfnDataSourceSalesforceStandardObjectAttachmentConfigurationPropertyDsl.() -> Unit =
            {}
    ): CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty {
        val builder = CfnDataSourceSalesforceStandardObjectAttachmentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies configuration information for indexing a single standard object.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * SalesforceStandardObjectConfigurationProperty salesforceStandardObjectConfigurationProperty =
     * SalesforceStandardObjectConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * .name("name")
     * // the properties below are optional
     * .documentTitleFieldName("documentTitleFieldName")
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardobjectconfiguration.html)
     */
    public inline fun cfnDataSourceSalesforceStandardObjectConfigurationProperty(
        block: CfnDataSourceSalesforceStandardObjectConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.SalesforceStandardObjectConfigurationProperty {
        val builder = CfnDataSourceSalesforceStandardObjectConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information to connect to ServiceNow as your data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ServiceNowConfigurationProperty serviceNowConfigurationProperty =
     * ServiceNowConfigurationProperty.builder()
     * .hostUrl("hostUrl")
     * .secretArn("secretArn")
     * .serviceNowBuildVersion("serviceNowBuildVersion")
     * // the properties below are optional
     * .authenticationType("authenticationType")
     * .knowledgeArticleConfiguration(ServiceNowKnowledgeArticleConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .crawlAttachments(false)
     * .documentTitleFieldName("documentTitleFieldName")
     * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .filterQuery("filterQuery")
     * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
     * .build())
     * .serviceCatalogConfiguration(ServiceNowServiceCatalogConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .crawlAttachments(false)
     * .documentTitleFieldName("documentTitleFieldName")
     * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowconfiguration.html)
     */
    public inline fun cfnDataSourceServiceNowConfigurationProperty(
        block: CfnDataSourceServiceNowConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ServiceNowConfigurationProperty {
        val builder = CfnDataSourceServiceNowConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information for crawling knowledge articles in the ServiceNow
     * site.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ServiceNowKnowledgeArticleConfigurationProperty serviceNowKnowledgeArticleConfigurationProperty
     * = ServiceNowKnowledgeArticleConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .crawlAttachments(false)
     * .documentTitleFieldName("documentTitleFieldName")
     * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .filterQuery("filterQuery")
     * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html)
     */
    public inline fun cfnDataSourceServiceNowKnowledgeArticleConfigurationProperty(
        block: CfnDataSourceServiceNowKnowledgeArticleConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty {
        val builder = CfnDataSourceServiceNowKnowledgeArticleConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information for crawling service catalog items in the ServiceNow
     * site.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ServiceNowServiceCatalogConfigurationProperty serviceNowServiceCatalogConfigurationProperty =
     * ServiceNowServiceCatalogConfigurationProperty.builder()
     * .documentDataFieldName("documentDataFieldName")
     * // the properties below are optional
     * .crawlAttachments(false)
     * .documentTitleFieldName("documentTitleFieldName")
     * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowservicecatalogconfiguration.html)
     */
    public inline fun cfnDataSourceServiceNowServiceCatalogConfigurationProperty(
        block: CfnDataSourceServiceNowServiceCatalogConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ServiceNowServiceCatalogConfigurationProperty {
        val builder = CfnDataSourceServiceNowServiceCatalogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information to connect to Microsoft SharePoint as your data
     * source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * SharePointConfigurationProperty sharePointConfigurationProperty =
     * SharePointConfigurationProperty.builder()
     * .secretArn("secretArn")
     * .sharePointVersion("sharePointVersion")
     * .urls(List.of("urls"))
     * // the properties below are optional
     * .crawlAttachments(false)
     * .disableLocalGroups(false)
     * .documentTitleFieldName("documentTitleFieldName")
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .sslCertificateS3Path(S3PathProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * .useChangeLog(false)
     * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html)
     */
    public inline fun cfnDataSourceSharePointConfigurationProperty(
        block: CfnDataSourceSharePointConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.SharePointConfigurationProperty {
        val builder = CfnDataSourceSharePointConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information that configures Amazon Kendra to use a SQL database.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * SqlConfigurationProperty sqlConfigurationProperty = SqlConfigurationProperty.builder()
     * .queryIdentifiersEnclosingOption("queryIdentifiersEnclosingOption")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sqlconfiguration.html)
     */
    public inline fun cfnDataSourceSqlConfigurationProperty(
        block: CfnDataSourceSqlConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.SqlConfigurationProperty {
        val builder = CfnDataSourceSqlConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information to connect to websites that require user
     * authentication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * WebCrawlerAuthenticationConfigurationProperty webCrawlerAuthenticationConfigurationProperty =
     * WebCrawlerAuthenticationConfigurationProperty.builder()
     * .basicAuthentication(List.of(WebCrawlerBasicAuthenticationProperty.builder()
     * .credentials("credentials")
     * .host("host")
     * .port(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerauthenticationconfiguration.html)
     */
    public inline fun cfnDataSourceWebCrawlerAuthenticationConfigurationProperty(
        block: CfnDataSourceWebCrawlerAuthenticationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.WebCrawlerAuthenticationConfigurationProperty {
        val builder = CfnDataSourceWebCrawlerAuthenticationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information to connect to websites that require basic user
     * authentication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * WebCrawlerBasicAuthenticationProperty webCrawlerBasicAuthenticationProperty =
     * WebCrawlerBasicAuthenticationProperty.builder()
     * .credentials("credentials")
     * .host("host")
     * .port(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerbasicauthentication.html)
     */
    public inline fun cfnDataSourceWebCrawlerBasicAuthenticationProperty(
        block: CfnDataSourceWebCrawlerBasicAuthenticationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.WebCrawlerBasicAuthenticationProperty {
        val builder = CfnDataSourceWebCrawlerBasicAuthenticationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information required for Amazon Kendra Web Crawler.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * WebCrawlerConfigurationProperty webCrawlerConfigurationProperty =
     * WebCrawlerConfigurationProperty.builder()
     * .urls(WebCrawlerUrlsProperty.builder()
     * .seedUrlConfiguration(WebCrawlerSeedUrlConfigurationProperty.builder()
     * .seedUrls(List.of("seedUrls"))
     * // the properties below are optional
     * .webCrawlerMode("webCrawlerMode")
     * .build())
     * .siteMapsConfiguration(WebCrawlerSiteMapsConfigurationProperty.builder()
     * .siteMaps(List.of("siteMaps"))
     * .build())
     * .build())
     * // the properties below are optional
     * .authenticationConfiguration(WebCrawlerAuthenticationConfigurationProperty.builder()
     * .basicAuthentication(List.of(WebCrawlerBasicAuthenticationProperty.builder()
     * .credentials("credentials")
     * .host("host")
     * .port(123)
     * .build()))
     * .build())
     * .crawlDepth(123)
     * .maxContentSizePerPageInMegaBytes(123)
     * .maxLinksPerPage(123)
     * .maxUrlsPerMinuteCrawlRate(123)
     * .proxyConfiguration(ProxyConfigurationProperty.builder()
     * .host("host")
     * .port(123)
     * // the properties below are optional
     * .credentials("credentials")
     * .build())
     * .urlExclusionPatterns(List.of("urlExclusionPatterns"))
     * .urlInclusionPatterns(List.of("urlInclusionPatterns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html)
     */
    public inline fun cfnDataSourceWebCrawlerConfigurationProperty(
        block: CfnDataSourceWebCrawlerConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.WebCrawlerConfigurationProperty {
        val builder = CfnDataSourceWebCrawlerConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information of the seed or starting point URLs to crawl.
     *
     * *When selecting websites to index, you must adhere to the
     * [Amazon Acceptable Use Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms.
     * Remember that you must only use the Amazon Kendra web crawler to index your own webpages, or
     * webpages that you have authorization to index.*
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * WebCrawlerSeedUrlConfigurationProperty webCrawlerSeedUrlConfigurationProperty =
     * WebCrawlerSeedUrlConfigurationProperty.builder()
     * .seedUrls(List.of("seedUrls"))
     * // the properties below are optional
     * .webCrawlerMode("webCrawlerMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerseedurlconfiguration.html)
     */
    public inline fun cfnDataSourceWebCrawlerSeedUrlConfigurationProperty(
        block: CfnDataSourceWebCrawlerSeedUrlConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.WebCrawlerSeedUrlConfigurationProperty {
        val builder = CfnDataSourceWebCrawlerSeedUrlConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information of the sitemap URLs to crawl.
     *
     * *When selecting websites to index, you must adhere to the
     * [Amazon Acceptable Use Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms.
     * Remember that you must only use the Amazon Kendra web crawler to index your own webpages, or
     * webpages that you have authorization to index.*
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * WebCrawlerSiteMapsConfigurationProperty webCrawlerSiteMapsConfigurationProperty =
     * WebCrawlerSiteMapsConfigurationProperty.builder()
     * .siteMaps(List.of("siteMaps"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlersitemapsconfiguration.html)
     */
    public inline fun cfnDataSourceWebCrawlerSiteMapsConfigurationProperty(
        block: CfnDataSourceWebCrawlerSiteMapsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.WebCrawlerSiteMapsConfigurationProperty {
        val builder = CfnDataSourceWebCrawlerSiteMapsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites
     * you want to crawl.
     *
     * You can include website subdomains. You can list up to 100 seed URLs and up to three sitemap
     * URLs.
     *
     * You can only crawl websites that use the secure communication protocol, Hypertext Transfer
     * Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that
     * the website is blocked from crawling.
     *
     * *When selecting websites to index, you must adhere to the
     * [Amazon Acceptable Use Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms.
     * Remember that you must only use the Amazon Kendra web crawler to index your own webpages, or
     * webpages that you have authorization to index.*
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * WebCrawlerUrlsProperty webCrawlerUrlsProperty = WebCrawlerUrlsProperty.builder()
     * .seedUrlConfiguration(WebCrawlerSeedUrlConfigurationProperty.builder()
     * .seedUrls(List.of("seedUrls"))
     * // the properties below are optional
     * .webCrawlerMode("webCrawlerMode")
     * .build())
     * .siteMapsConfiguration(WebCrawlerSiteMapsConfigurationProperty.builder()
     * .siteMaps(List.of("siteMaps"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerurls.html)
     */
    public inline fun cfnDataSourceWebCrawlerUrlsProperty(
        block: CfnDataSourceWebCrawlerUrlsPropertyDsl.() -> Unit = {}
    ): CfnDataSource.WebCrawlerUrlsProperty {
        val builder = CfnDataSourceWebCrawlerUrlsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information to connect to Amazon WorkDocs as your data source.
     *
     * Amazon WorkDocs connector is available in Oregon, North Virginia, Sydney, Singapore and
     * Ireland regions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * WorkDocsConfigurationProperty workDocsConfigurationProperty =
     * WorkDocsConfigurationProperty.builder()
     * .organizationId("organizationId")
     * // the properties below are optional
     * .crawlComments(false)
     * .exclusionPatterns(List.of("exclusionPatterns"))
     * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
     * .dataSourceFieldName("dataSourceFieldName")
     * .indexFieldName("indexFieldName")
     * // the properties below are optional
     * .dateFieldFormat("dateFieldFormat")
     * .build()))
     * .inclusionPatterns(List.of("inclusionPatterns"))
     * .useChangeLog(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-workdocsconfiguration.html)
     */
    public inline fun cfnDataSourceWorkDocsConfigurationProperty(
        block: CfnDataSourceWorkDocsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDataSource.WorkDocsConfigurationProperty {
        val builder = CfnDataSourceWorkDocsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an new set of frequently asked question (FAQ) questions and answers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * CfnFaq cfnFaq = CfnFaq.Builder.create(this, "MyCfnFaq")
     * .indexId("indexId")
     * .name("name")
     * .roleArn("roleArn")
     * .s3Path(S3PathProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * // the properties below are optional
     * .description("description")
     * .fileFormat("fileFormat")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html)
     */
    public inline fun cfnFaq(
        scope: Construct,
        id: String,
        block: CfnFaqDsl.() -> Unit = {},
    ): CfnFaq {
        val builder = CfnFaqDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFaq`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * CfnFaqProps cfnFaqProps = CfnFaqProps.builder()
     * .indexId("indexId")
     * .name("name")
     * .roleArn("roleArn")
     * .s3Path(S3PathProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build())
     * // the properties below are optional
     * .description("description")
     * .fileFormat("fileFormat")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html)
     */
    public inline fun cfnFaqProps(block: CfnFaqPropsDsl.() -> Unit = {}): CfnFaqProps {
        val builder = CfnFaqPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information required to find a specific file in an Amazon S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * S3PathProperty s3PathProperty = S3PathProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-faq-s3path.html)
     */
    public inline fun cfnFaqS3PathProperty(
        block: CfnFaqS3PathPropertyDsl.() -> Unit = {}
    ): CfnFaq.S3PathProperty {
        val builder = CfnFaqS3PathPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an Amazon Kendra index.
     *
     * Once the index is active you can add documents to your index using the
     * [BatchPutDocument](https://docs.aws.amazon.com/kendra/latest/dg/BatchPutDocument.html)
     * operation or using one of the supported data sources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * CfnIndex cfnIndex = CfnIndex.Builder.create(this, "MyCfnIndex")
     * .edition("edition")
     * .name("name")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .capacityUnits(CapacityUnitsConfigurationProperty.builder()
     * .queryCapacityUnits(123)
     * .storageCapacityUnits(123)
     * .build())
     * .description("description")
     * .documentMetadataConfigurations(List.of(DocumentMetadataConfigurationProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .relevance(RelevanceProperty.builder()
     * .duration("duration")
     * .freshness(false)
     * .importance(123)
     * .rankOrder("rankOrder")
     * .valueImportanceItems(List.of(ValueImportanceItemProperty.builder()
     * .key("key")
     * .value(123)
     * .build()))
     * .build())
     * .search(SearchProperty.builder()
     * .displayable(false)
     * .facetable(false)
     * .searchable(false)
     * .sortable(false)
     * .build())
     * .build()))
     * .serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userContextPolicy("userContextPolicy")
     * .userTokenConfigurations(List.of(UserTokenConfigurationProperty.builder()
     * .jsonTokenTypeConfiguration(JsonTokenTypeConfigurationProperty.builder()
     * .groupAttributeField("groupAttributeField")
     * .userNameAttributeField("userNameAttributeField")
     * .build())
     * .jwtTokenTypeConfiguration(JwtTokenTypeConfigurationProperty.builder()
     * .keyLocation("keyLocation")
     * // the properties below are optional
     * .claimRegex("claimRegex")
     * .groupAttributeField("groupAttributeField")
     * .issuer("issuer")
     * .secretManagerArn("secretManagerArn")
     * .url("url")
     * .userNameAttributeField("userNameAttributeField")
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html)
     */
    public inline fun cfnIndex(
        scope: Construct,
        id: String,
        block: CfnIndexDsl.() -> Unit = {},
    ): CfnIndex {
        val builder = CfnIndexDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies additional capacity units configured for your Enterprise Edition index.
     *
     * You can add and remove capacity units to fit your usage requirements.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * CapacityUnitsConfigurationProperty capacityUnitsConfigurationProperty =
     * CapacityUnitsConfigurationProperty.builder()
     * .queryCapacityUnits(123)
     * .storageCapacityUnits(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-capacityunitsconfiguration.html)
     */
    public inline fun cfnIndexCapacityUnitsConfigurationProperty(
        block: CfnIndexCapacityUnitsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnIndex.CapacityUnitsConfigurationProperty {
        val builder = CfnIndexCapacityUnitsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the properties, such as relevance tuning and searchability, of an index field.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * DocumentMetadataConfigurationProperty documentMetadataConfigurationProperty =
     * DocumentMetadataConfigurationProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .relevance(RelevanceProperty.builder()
     * .duration("duration")
     * .freshness(false)
     * .importance(123)
     * .rankOrder("rankOrder")
     * .valueImportanceItems(List.of(ValueImportanceItemProperty.builder()
     * .key("key")
     * .value(123)
     * .build()))
     * .build())
     * .search(SearchProperty.builder()
     * .displayable(false)
     * .facetable(false)
     * .searchable(false)
     * .sortable(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-documentmetadataconfiguration.html)
     */
    public inline fun cfnIndexDocumentMetadataConfigurationProperty(
        block: CfnIndexDocumentMetadataConfigurationPropertyDsl.() -> Unit = {}
    ): CfnIndex.DocumentMetadataConfigurationProperty {
        val builder = CfnIndexDocumentMetadataConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information for the JSON token type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * JsonTokenTypeConfigurationProperty jsonTokenTypeConfigurationProperty =
     * JsonTokenTypeConfigurationProperty.builder()
     * .groupAttributeField("groupAttributeField")
     * .userNameAttributeField("userNameAttributeField")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jsontokentypeconfiguration.html)
     */
    public inline fun cfnIndexJsonTokenTypeConfigurationProperty(
        block: CfnIndexJsonTokenTypeConfigurationPropertyDsl.() -> Unit = {}
    ): CfnIndex.JsonTokenTypeConfigurationProperty {
        val builder = CfnIndexJsonTokenTypeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information for the JWT token type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * JwtTokenTypeConfigurationProperty jwtTokenTypeConfigurationProperty =
     * JwtTokenTypeConfigurationProperty.builder()
     * .keyLocation("keyLocation")
     * // the properties below are optional
     * .claimRegex("claimRegex")
     * .groupAttributeField("groupAttributeField")
     * .issuer("issuer")
     * .secretManagerArn("secretManagerArn")
     * .url("url")
     * .userNameAttributeField("userNameAttributeField")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html)
     */
    public inline fun cfnIndexJwtTokenTypeConfigurationProperty(
        block: CfnIndexJwtTokenTypeConfigurationPropertyDsl.() -> Unit = {}
    ): CfnIndex.JwtTokenTypeConfigurationProperty {
        val builder = CfnIndexJwtTokenTypeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIndex`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * CfnIndexProps cfnIndexProps = CfnIndexProps.builder()
     * .edition("edition")
     * .name("name")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .capacityUnits(CapacityUnitsConfigurationProperty.builder()
     * .queryCapacityUnits(123)
     * .storageCapacityUnits(123)
     * .build())
     * .description("description")
     * .documentMetadataConfigurations(List.of(DocumentMetadataConfigurationProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .relevance(RelevanceProperty.builder()
     * .duration("duration")
     * .freshness(false)
     * .importance(123)
     * .rankOrder("rankOrder")
     * .valueImportanceItems(List.of(ValueImportanceItemProperty.builder()
     * .key("key")
     * .value(123)
     * .build()))
     * .build())
     * .search(SearchProperty.builder()
     * .displayable(false)
     * .facetable(false)
     * .searchable(false)
     * .sortable(false)
     * .build())
     * .build()))
     * .serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userContextPolicy("userContextPolicy")
     * .userTokenConfigurations(List.of(UserTokenConfigurationProperty.builder()
     * .jsonTokenTypeConfiguration(JsonTokenTypeConfigurationProperty.builder()
     * .groupAttributeField("groupAttributeField")
     * .userNameAttributeField("userNameAttributeField")
     * .build())
     * .jwtTokenTypeConfiguration(JwtTokenTypeConfigurationProperty.builder()
     * .keyLocation("keyLocation")
     * // the properties below are optional
     * .claimRegex("claimRegex")
     * .groupAttributeField("groupAttributeField")
     * .issuer("issuer")
     * .secretManagerArn("secretManagerArn")
     * .url("url")
     * .userNameAttributeField("userNameAttributeField")
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html)
     */
    public inline fun cfnIndexProps(block: CfnIndexPropsDsl.() -> Unit = {}): CfnIndexProps {
        val builder = CfnIndexPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information for tuning the relevance of a field in a search.
     *
     * When a query includes terms that match the field, the results are given a boost in the
     * response based on these tuning parameters.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * RelevanceProperty relevanceProperty = RelevanceProperty.builder()
     * .duration("duration")
     * .freshness(false)
     * .importance(123)
     * .rankOrder("rankOrder")
     * .valueImportanceItems(List.of(ValueImportanceItemProperty.builder()
     * .key("key")
     * .value(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-relevance.html)
     */
    public inline fun cfnIndexRelevanceProperty(
        block: CfnIndexRelevancePropertyDsl.() -> Unit = {}
    ): CfnIndex.RelevanceProperty {
        val builder = CfnIndexRelevancePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides information about how a custom index field is used during a search.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * SearchProperty searchProperty = SearchProperty.builder()
     * .displayable(false)
     * .facetable(false)
     * .searchable(false)
     * .sortable(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-search.html)
     */
    public inline fun cfnIndexSearchProperty(
        block: CfnIndexSearchPropertyDsl.() -> Unit = {}
    ): CfnIndex.SearchProperty {
        val builder = CfnIndexSearchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt data indexed
     * by Amazon Kendra.
     *
     * We suggest that you use a CMK from your account to help secure your index. Amazon Kendra
     * doesn't support asymmetric CMKs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ServerSideEncryptionConfigurationProperty serverSideEncryptionConfigurationProperty =
     * ServerSideEncryptionConfigurationProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-serversideencryptionconfiguration.html)
     */
    public inline fun cfnIndexServerSideEncryptionConfigurationProperty(
        block: CfnIndexServerSideEncryptionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnIndex.ServerSideEncryptionConfigurationProperty {
        val builder = CfnIndexServerSideEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the configuration information for a token.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * UserTokenConfigurationProperty userTokenConfigurationProperty =
     * UserTokenConfigurationProperty.builder()
     * .jsonTokenTypeConfiguration(JsonTokenTypeConfigurationProperty.builder()
     * .groupAttributeField("groupAttributeField")
     * .userNameAttributeField("userNameAttributeField")
     * .build())
     * .jwtTokenTypeConfiguration(JwtTokenTypeConfigurationProperty.builder()
     * .keyLocation("keyLocation")
     * // the properties below are optional
     * .claimRegex("claimRegex")
     * .groupAttributeField("groupAttributeField")
     * .issuer("issuer")
     * .secretManagerArn("secretManagerArn")
     * .url("url")
     * .userNameAttributeField("userNameAttributeField")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-usertokenconfiguration.html)
     */
    public inline fun cfnIndexUserTokenConfigurationProperty(
        block: CfnIndexUserTokenConfigurationPropertyDsl.() -> Unit = {}
    ): CfnIndex.UserTokenConfigurationProperty {
        val builder = CfnIndexUserTokenConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a key-value pair of the search boost value for a document when the key is part of
     * the metadata of a document.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendra.*;
     * ValueImportanceItemProperty valueImportanceItemProperty = ValueImportanceItemProperty.builder()
     * .key("key")
     * .value(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-valueimportanceitem.html)
     */
    public inline fun cfnIndexValueImportanceItemProperty(
        block: CfnIndexValueImportanceItemPropertyDsl.() -> Unit = {}
    ): CfnIndex.ValueImportanceItemProperty {
        val builder = CfnIndexValueImportanceItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
