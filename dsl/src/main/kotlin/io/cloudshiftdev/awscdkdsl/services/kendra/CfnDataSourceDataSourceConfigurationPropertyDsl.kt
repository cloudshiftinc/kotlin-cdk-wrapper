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

package io.cloudshiftdev.awscdkdsl.services.kendra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

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
 * .templateConfiguration(TemplateConfigurationProperty.builder()
 * .template("template")
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
@CdkDslMarker
public class CfnDataSourceDataSourceConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.DataSourceConfigurationProperty.Builder =
        CfnDataSource.DataSourceConfigurationProperty.builder()

    /**
     * @param confluenceConfiguration Provides the configuration information to connect to
     *   Confluence as your data source.
     */
    public fun confluenceConfiguration(confluenceConfiguration: IResolvable) {
        cdkBuilder.confluenceConfiguration(confluenceConfiguration)
    }

    /**
     * @param confluenceConfiguration Provides the configuration information to connect to
     *   Confluence as your data source.
     */
    public fun confluenceConfiguration(
        confluenceConfiguration: CfnDataSource.ConfluenceConfigurationProperty
    ) {
        cdkBuilder.confluenceConfiguration(confluenceConfiguration)
    }

    /**
     * @param databaseConfiguration Provides the configuration information to connect to a database
     *   as your data source.
     */
    public fun databaseConfiguration(databaseConfiguration: IResolvable) {
        cdkBuilder.databaseConfiguration(databaseConfiguration)
    }

    /**
     * @param databaseConfiguration Provides the configuration information to connect to a database
     *   as your data source.
     */
    public fun databaseConfiguration(
        databaseConfiguration: CfnDataSource.DatabaseConfigurationProperty
    ) {
        cdkBuilder.databaseConfiguration(databaseConfiguration)
    }

    /**
     * @param googleDriveConfiguration Provides the configuration information to connect to Google
     *   Drive as your data source.
     */
    public fun googleDriveConfiguration(googleDriveConfiguration: IResolvable) {
        cdkBuilder.googleDriveConfiguration(googleDriveConfiguration)
    }

    /**
     * @param googleDriveConfiguration Provides the configuration information to connect to Google
     *   Drive as your data source.
     */
    public fun googleDriveConfiguration(
        googleDriveConfiguration: CfnDataSource.GoogleDriveConfigurationProperty
    ) {
        cdkBuilder.googleDriveConfiguration(googleDriveConfiguration)
    }

    /**
     * @param oneDriveConfiguration Provides the configuration information to connect to Microsoft
     *   OneDrive as your data source.
     */
    public fun oneDriveConfiguration(oneDriveConfiguration: IResolvable) {
        cdkBuilder.oneDriveConfiguration(oneDriveConfiguration)
    }

    /**
     * @param oneDriveConfiguration Provides the configuration information to connect to Microsoft
     *   OneDrive as your data source.
     */
    public fun oneDriveConfiguration(
        oneDriveConfiguration: CfnDataSource.OneDriveConfigurationProperty
    ) {
        cdkBuilder.oneDriveConfiguration(oneDriveConfiguration)
    }

    /**
     * @param s3Configuration Provides the configuration information to connect to an Amazon S3
     *   bucket as your data source.
     */
    public fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    /**
     * @param s3Configuration Provides the configuration information to connect to an Amazon S3
     *   bucket as your data source.
     */
    public fun s3Configuration(s3Configuration: CfnDataSource.S3DataSourceConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    /**
     * @param salesforceConfiguration Provides the configuration information to connect to
     *   Salesforce as your data source.
     */
    public fun salesforceConfiguration(salesforceConfiguration: IResolvable) {
        cdkBuilder.salesforceConfiguration(salesforceConfiguration)
    }

    /**
     * @param salesforceConfiguration Provides the configuration information to connect to
     *   Salesforce as your data source.
     */
    public fun salesforceConfiguration(
        salesforceConfiguration: CfnDataSource.SalesforceConfigurationProperty
    ) {
        cdkBuilder.salesforceConfiguration(salesforceConfiguration)
    }

    /**
     * @param serviceNowConfiguration Provides the configuration information to connect to
     *   ServiceNow as your data source.
     */
    public fun serviceNowConfiguration(serviceNowConfiguration: IResolvable) {
        cdkBuilder.serviceNowConfiguration(serviceNowConfiguration)
    }

    /**
     * @param serviceNowConfiguration Provides the configuration information to connect to
     *   ServiceNow as your data source.
     */
    public fun serviceNowConfiguration(
        serviceNowConfiguration: CfnDataSource.ServiceNowConfigurationProperty
    ) {
        cdkBuilder.serviceNowConfiguration(serviceNowConfiguration)
    }

    /**
     * @param sharePointConfiguration Provides the configuration information to connect to Microsoft
     *   SharePoint as your data source.
     */
    public fun sharePointConfiguration(sharePointConfiguration: IResolvable) {
        cdkBuilder.sharePointConfiguration(sharePointConfiguration)
    }

    /**
     * @param sharePointConfiguration Provides the configuration information to connect to Microsoft
     *   SharePoint as your data source.
     */
    public fun sharePointConfiguration(
        sharePointConfiguration: CfnDataSource.SharePointConfigurationProperty
    ) {
        cdkBuilder.sharePointConfiguration(sharePointConfiguration)
    }

    /** @param templateConfiguration the value to be set. */
    public fun templateConfiguration(templateConfiguration: IResolvable) {
        cdkBuilder.templateConfiguration(templateConfiguration)
    }

    /** @param templateConfiguration the value to be set. */
    public fun templateConfiguration(
        templateConfiguration: CfnDataSource.TemplateConfigurationProperty
    ) {
        cdkBuilder.templateConfiguration(templateConfiguration)
    }

    /**
     * @param webCrawlerConfiguration Provides the configuration information required for Amazon
     *   Kendra Web Crawler.
     */
    public fun webCrawlerConfiguration(webCrawlerConfiguration: IResolvable) {
        cdkBuilder.webCrawlerConfiguration(webCrawlerConfiguration)
    }

    /**
     * @param webCrawlerConfiguration Provides the configuration information required for Amazon
     *   Kendra Web Crawler.
     */
    public fun webCrawlerConfiguration(
        webCrawlerConfiguration: CfnDataSource.WebCrawlerConfigurationProperty
    ) {
        cdkBuilder.webCrawlerConfiguration(webCrawlerConfiguration)
    }

    /**
     * @param workDocsConfiguration Provides the configuration information to connect to Amazon
     *   WorkDocs as your data source.
     */
    public fun workDocsConfiguration(workDocsConfiguration: IResolvable) {
        cdkBuilder.workDocsConfiguration(workDocsConfiguration)
    }

    /**
     * @param workDocsConfiguration Provides the configuration information to connect to Amazon
     *   WorkDocs as your data source.
     */
    public fun workDocsConfiguration(
        workDocsConfiguration: CfnDataSource.WorkDocsConfigurationProperty
    ) {
        cdkBuilder.workDocsConfiguration(workDocsConfiguration)
    }

    public fun build(): CfnDataSource.DataSourceConfigurationProperty = cdkBuilder.build()
}
