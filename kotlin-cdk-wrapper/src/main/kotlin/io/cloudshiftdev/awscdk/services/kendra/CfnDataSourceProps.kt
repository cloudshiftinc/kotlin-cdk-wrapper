@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kendra

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kendra.*;
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
 * .build())
 * .description("description")
 * .languageCode("languageCode")
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
public interface CfnDataSourceProps {
  /**
   * Configuration information for altering document metadata and content during the document
   * ingestion process.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration)
   */
  public fun customDocumentEnrichmentConfiguration(): Any? =
      unwrap(this).getCustomDocumentEnrichmentConfiguration()

  /**
   * Configuration information for an Amazon Kendra data source.
   *
   * The contents of the configuration depend on the type of data source. You can only specify one
   * type of data source in the configuration.
   *
   * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM` .
   *
   * The `Configuration` parameter is required for all other data sources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-datasourceconfiguration)
   */
  public fun dataSourceConfiguration(): Any? = unwrap(this).getDataSourceConfiguration()

  /**
   * A description for the data source connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The identifier of the index you want to use with the data source connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-indexid)
   */
  public fun indexId(): String

  /**
   * The code for a language.
   *
   * This shows a supported language for all documents in the data source. English is supported by
   * default. For more information on supported languages, including their codes, see [Adding documents
   * in languages other than
   * English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-languagecode)
   */
  public fun languageCode(): String? = unwrap(this).getLanguageCode()

  /**
   * The name of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-name)
   */
  public fun name(): String

  /**
   * The Amazon Resource Name (ARN) of a role with permission to access the data source.
   *
   * You can't specify the `RoleArn` parameter when the `Type` parameter is set to `CUSTOM` .
   *
   * The `RoleArn` parameter is required for all other data sources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * Sets the frequency that Amazon Kendra checks the documents in your data source and updates the
   * index.
   *
   * If you don't set a schedule, Amazon Kendra doesn't periodically update the index.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-schedule)
   */
  public fun schedule(): String? = unwrap(this).getSchedule()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process.
     */
    public
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: IResolvable)

    /**
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process.
     */
    public
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty)

    /**
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9eda522c9f39dac439b0a9f4f1e2aadb01ae59be55d8b470f9ca4563b44c90ce")
    public
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty.Builder.() -> Unit)

    /**
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source.
     * The contents of the configuration depend on the type of data source. You can only specify one
     * type of data source in the configuration.
     *
     * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM`
     * .
     *
     * The `Configuration` parameter is required for all other data sources.
     */
    public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable)

    /**
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source.
     * The contents of the configuration depend on the type of data source. You can only specify one
     * type of data source in the configuration.
     *
     * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM`
     * .
     *
     * The `Configuration` parameter is required for all other data sources.
     */
    public
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty)

    /**
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source.
     * The contents of the configuration depend on the type of data source. You can only specify one
     * type of data source in the configuration.
     *
     * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM`
     * .
     *
     * The `Configuration` parameter is required for all other data sources.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec157f003c905715a686cc1bdfdfb78d9e147be840e23eb7b6b3cd78b8bb88e6")
    public
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description A description for the data source connector.
     */
    public fun description(description: String)

    /**
     * @param indexId The identifier of the index you want to use with the data source connector. 
     */
    public fun indexId(indexId: String)

    /**
     * @param languageCode The code for a language.
     * This shows a supported language for all documents in the data source. English is supported by
     * default. For more information on supported languages, including their codes, see [Adding
     * documents in languages other than
     * English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html) .
     */
    public fun languageCode(languageCode: String)

    /**
     * @param name The name of the data source. 
     */
    public fun name(name: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the data
     * source.
     * You can't specify the `RoleArn` parameter when the `Type` parameter is set to `CUSTOM` .
     *
     * The `RoleArn` parameter is required for all other data sources.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param schedule Sets the frequency that Amazon Kendra checks the documents in your data
     * source and updates the index.
     * If you don't set a schedule, Amazon Kendra doesn't periodically update the index.
     */
    public fun schedule(schedule: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of the data source. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnDataSourceProps.Builder =
        software.amazon.awscdk.services.kendra.CfnDataSourceProps.builder()

    /**
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process.
     */
    override
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: IResolvable) {
      cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process.
     */
    override
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty) {
      cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration.let(CfnDataSource.CustomDocumentEnrichmentConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9eda522c9f39dac439b0a9f4f1e2aadb01ae59be55d8b470f9ca4563b44c90ce")
    override
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty.Builder.() -> Unit):
        Unit =
        customDocumentEnrichmentConfiguration(CfnDataSource.CustomDocumentEnrichmentConfigurationProperty(customDocumentEnrichmentConfiguration))

    /**
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source.
     * The contents of the configuration depend on the type of data source. You can only specify one
     * type of data source in the configuration.
     *
     * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM`
     * .
     *
     * The `Configuration` parameter is required for all other data sources.
     */
    override fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source.
     * The contents of the configuration depend on the type of data source. You can only specify one
     * type of data source in the configuration.
     *
     * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM`
     * .
     *
     * The `Configuration` parameter is required for all other data sources.
     */
    override
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(CfnDataSource.DataSourceConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source.
     * The contents of the configuration depend on the type of data source. You can only specify one
     * type of data source in the configuration.
     *
     * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM`
     * .
     *
     * The `Configuration` parameter is required for all other data sources.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec157f003c905715a686cc1bdfdfb78d9e147be840e23eb7b6b3cd78b8bb88e6")
    override
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        dataSourceConfiguration(CfnDataSource.DataSourceConfigurationProperty(dataSourceConfiguration))

    /**
     * @param description A description for the data source connector.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param indexId The identifier of the index you want to use with the data source connector. 
     */
    override fun indexId(indexId: String) {
      cdkBuilder.indexId(indexId)
    }

    /**
     * @param languageCode The code for a language.
     * This shows a supported language for all documents in the data source. English is supported by
     * default. For more information on supported languages, including their codes, see [Adding
     * documents in languages other than
     * English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html) .
     */
    override fun languageCode(languageCode: String) {
      cdkBuilder.languageCode(languageCode)
    }

    /**
     * @param name The name of the data source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the data
     * source.
     * You can't specify the `RoleArn` parameter when the `Type` parameter is set to `CUSTOM` .
     *
     * The `RoleArn` parameter is required for all other data sources.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param schedule Sets the frequency that Amazon Kendra checks the documents in your data
     * source and updates the index.
     * If you don't set a schedule, Amazon Kendra doesn't periodically update the index.
     */
    override fun schedule(schedule: String) {
      cdkBuilder.schedule(schedule)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of the data source. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.kendra.CfnDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kendra.CfnDataSourceProps,
  ) : CdkObject(cdkObject), CfnDataSourceProps {
    /**
     * Configuration information for altering document metadata and content during the document
     * ingestion process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration)
     */
    override fun customDocumentEnrichmentConfiguration(): Any? =
        unwrap(this).getCustomDocumentEnrichmentConfiguration()

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
     */
    override fun dataSourceConfiguration(): Any? = unwrap(this).getDataSourceConfiguration()

    /**
     * A description for the data source connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The identifier of the index you want to use with the data source connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-indexid)
     */
    override fun indexId(): String = unwrap(this).getIndexId()

    /**
     * The code for a language.
     *
     * This shows a supported language for all documents in the data source. English is supported by
     * default. For more information on supported languages, including their codes, see [Adding
     * documents in languages other than
     * English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-languagecode)
     */
    override fun languageCode(): String? = unwrap(this).getLanguageCode()

    /**
     * The name of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) of a role with permission to access the data source.
     *
     * You can't specify the `RoleArn` parameter when the `Type` parameter is set to `CUSTOM` .
     *
     * The `RoleArn` parameter is required for all other data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * Sets the frequency that Amazon Kendra checks the documents in your data source and updates
     * the index.
     *
     * If you don't set a schedule, Amazon Kendra doesn't periodically update the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-schedule)
     */
    override fun schedule(): String? = unwrap(this).getSchedule()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSourceProps):
        CfnDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDataSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataSourceProps):
        software.amazon.awscdk.services.kendra.CfnDataSourceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.kendra.CfnDataSourceProps
  }
}
