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

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource
import software.constructs.Construct

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
@CdkDslMarker
public class CfnDataSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDataSource.Builder = CfnDataSource.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Configuration information for altering document metadata and content during the document
     * ingestion process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration)
     *
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     *   metadata and content during the document ingestion process.
     */
    public fun customDocumentEnrichmentConfiguration(
        customDocumentEnrichmentConfiguration: IResolvable
    ) {
        cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration)
    }

    /**
     * Configuration information for altering document metadata and content during the document
     * ingestion process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration)
     *
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     *   metadata and content during the document ingestion process.
     */
    public fun customDocumentEnrichmentConfiguration(
        customDocumentEnrichmentConfiguration:
            CfnDataSource.CustomDocumentEnrichmentConfigurationProperty
    ) {
        cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration)
    }

    /**
     * Configuration information for an Amazon Kendra data source.
     *
     * The contents of the configuration depend on the type of data source. You can only specify one
     * type of data source in the configuration.
     *
     * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM`
     * .
     *
     * The `Configuration` parameter is required for all other data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-datasourceconfiguration)
     *
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source.
     */
    public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
        cdkBuilder.dataSourceConfiguration(dataSourceConfiguration)
    }

    /**
     * Configuration information for an Amazon Kendra data source.
     *
     * The contents of the configuration depend on the type of data source. You can only specify one
     * type of data source in the configuration.
     *
     * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM`
     * .
     *
     * The `Configuration` parameter is required for all other data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-datasourceconfiguration)
     *
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source.
     */
    public fun dataSourceConfiguration(
        dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty
    ) {
        cdkBuilder.dataSourceConfiguration(dataSourceConfiguration)
    }

    /**
     * A description for the data source connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-description)
     *
     * @param description A description for the data source connector.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The identifier of the index you want to use with the data source connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-indexid)
     *
     * @param indexId The identifier of the index you want to use with the data source connector.
     */
    public fun indexId(indexId: String) {
        cdkBuilder.indexId(indexId)
    }

    /**
     * The name of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-name)
     *
     * @param name The name of the data source.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of a role with permission to access the data source.
     *
     * You can't specify the `RoleArn` parameter when the `Type` parameter is set to `CUSTOM` .
     *
     * The `RoleArn` parameter is required for all other data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the data
     *   source.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * Sets the frequency that Amazon Kendra checks the documents in your data source and updates
     * the index.
     *
     * If you don't set a schedule, Amazon Kendra doesn't periodically update the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-schedule)
     *
     * @param schedule Sets the frequency that Amazon Kendra checks the documents in your data
     *   source and updates the index.
     */
    public fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The type of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-type)
     *
     * @param type The type of the data source.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDataSource {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
