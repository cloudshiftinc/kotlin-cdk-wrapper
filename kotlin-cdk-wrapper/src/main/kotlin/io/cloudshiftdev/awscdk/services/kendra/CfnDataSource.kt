@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kendra

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a data source connector that you want to use with an Amazon Kendra index.
 *
 * You specify a name, data source connector type and description for your data source. You also
 * specify configuration information for the data source connector.
 *
 *
 * `CreateDataSource` does *not* support connectors which [require a `TemplateConfiguration`
 * object](https://docs.aws.amazon.com/kendra/latest/dg/ds-schemas.html) for connecting to Amazon
 * Kendra .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kendra.*;
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
public open class CfnDataSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the data source. For example:.
   *
   * `arn:aws:kendra:us-west-2:111122223333:index/335c3741-41df-46a6-b5d3-61f85b787884/data-source/b8cae438-6787-4091-8897-684a652bbb0a`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The identifier for the data source. For example:.
   *
   * `b8cae438-6787-4091-8897-684a652bbb0a` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Configuration information for altering document metadata and content during the document
   * ingestion process.
   */
  public open fun customDocumentEnrichmentConfiguration(): Any? =
      unwrap(this).getCustomDocumentEnrichmentConfiguration()

  /**
   * Configuration information for altering document metadata and content during the document
   * ingestion process.
   */
  public open fun customDocumentEnrichmentConfiguration(`value`: IResolvable) {
    unwrap(this).setCustomDocumentEnrichmentConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration information for altering document metadata and content during the document
   * ingestion process.
   */
  public open
      fun customDocumentEnrichmentConfiguration(`value`: CustomDocumentEnrichmentConfigurationProperty) {
    unwrap(this).setCustomDocumentEnrichmentConfiguration(`value`.let(CustomDocumentEnrichmentConfigurationProperty::unwrap))
  }

  /**
   * Configuration information for altering document metadata and content during the document
   * ingestion process.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a4ca08a04153bd5a6977617c222c40b1c90c209434779da80b97206cef6b0bd3")
  public open
      fun customDocumentEnrichmentConfiguration(`value`: CustomDocumentEnrichmentConfigurationProperty.Builder.() -> Unit):
      Unit =
      customDocumentEnrichmentConfiguration(CustomDocumentEnrichmentConfigurationProperty(`value`))

  /**
   * Configuration information for an Amazon Kendra data source.
   */
  public open fun dataSourceConfiguration(): Any? = unwrap(this).getDataSourceConfiguration()

  /**
   * Configuration information for an Amazon Kendra data source.
   */
  public open fun dataSourceConfiguration(`value`: IResolvable) {
    unwrap(this).setDataSourceConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration information for an Amazon Kendra data source.
   */
  public open fun dataSourceConfiguration(`value`: DataSourceConfigurationProperty) {
    unwrap(this).setDataSourceConfiguration(`value`.let(DataSourceConfigurationProperty::unwrap))
  }

  /**
   * Configuration information for an Amazon Kendra data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e25b7ed5f0c2564b4215fca214d2846aa61a129e90a366c97a90dfab9cb81eca")
  public open
      fun dataSourceConfiguration(`value`: DataSourceConfigurationProperty.Builder.() -> Unit): Unit
      = dataSourceConfiguration(DataSourceConfigurationProperty(`value`))

  /**
   * A description for the data source connector.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the data source connector.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The identifier of the index you want to use with the data source connector.
   */
  public open fun indexId(): String = unwrap(this).getIndexId()

  /**
   * The identifier of the index you want to use with the data source connector.
   */
  public open fun indexId(`value`: String) {
    unwrap(this).setIndexId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The code for a language.
   */
  public open fun languageCode(): String? = unwrap(this).getLanguageCode()

  /**
   * The code for a language.
   */
  public open fun languageCode(`value`: String) {
    unwrap(this).setLanguageCode(`value`)
  }

  /**
   * The name of the data source.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the data source.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of a role with permission to access the data source.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of a role with permission to access the data source.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Sets the frequency that Amazon Kendra checks the documents in your data source and updates the
   * index.
   */
  public open fun schedule(): String? = unwrap(this).getSchedule()

  /**
   * Sets the frequency that Amazon Kendra checks the documents in your data source and updates the
   * index.
   */
  public open fun schedule(`value`: String) {
    unwrap(this).setSchedule(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of the data source.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of the data source.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kendra.CfnDataSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Configuration information for altering document metadata and content during the document
     * ingestion process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration)
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process. 
     */
    public
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: IResolvable)

    /**
     * Configuration information for altering document metadata and content during the document
     * ingestion process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration)
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process. 
     */
    public
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CustomDocumentEnrichmentConfigurationProperty)

    /**
     * Configuration information for altering document metadata and content during the document
     * ingestion process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration)
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09a24b55237400780b4036c110934fe50e5d4eee1f31ff47c56735f466c92960")
    public
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CustomDocumentEnrichmentConfigurationProperty.Builder.() -> Unit)

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
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source. 
     */
    public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable)

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
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source. 
     */
    public fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty)

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
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feac19ef158c17713136dc6e927a341682e4c0881325337d9e9743c12659145f")
    public
        fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty.Builder.() -> Unit)

    /**
     * A description for the data source connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-description)
     * @param description A description for the data source connector. 
     */
    public fun description(description: String)

    /**
     * The identifier of the index you want to use with the data source connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-indexid)
     * @param indexId The identifier of the index you want to use with the data source connector. 
     */
    public fun indexId(indexId: String)

    /**
     * The code for a language.
     *
     * This shows a supported language for all documents in the data source. English is supported by
     * default. For more information on supported languages, including their codes, see [Adding
     * documents in languages other than
     * English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-languagecode)
     * @param languageCode The code for a language. 
     */
    public fun languageCode(languageCode: String)

    /**
     * The name of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-name)
     * @param name The name of the data source. 
     */
    public fun name(name: String)

    /**
     * The Amazon Resource Name (ARN) of a role with permission to access the data source.
     *
     * You can't specify the `RoleArn` parameter when the `Type` parameter is set to `CUSTOM` .
     *
     * The `RoleArn` parameter is required for all other data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the data
     * source. 
     */
    public fun roleArn(roleArn: String)

    /**
     * Sets the frequency that Amazon Kendra checks the documents in your data source and updates
     * the index.
     *
     * If you don't set a schedule, Amazon Kendra doesn't periodically update the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-schedule)
     * @param schedule Sets the frequency that Amazon Kendra checks the documents in your data
     * source and updates the index. 
     */
    public fun schedule(schedule: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-type)
     * @param type The type of the data source. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnDataSource.Builder =
        software.amazon.awscdk.services.kendra.CfnDataSource.Builder.create(scope, id)

    /**
     * Configuration information for altering document metadata and content during the document
     * ingestion process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration)
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process. 
     */
    override
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: IResolvable) {
      cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Configuration information for altering document metadata and content during the document
     * ingestion process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration)
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process. 
     */
    override
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CustomDocumentEnrichmentConfigurationProperty) {
      cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration.let(CustomDocumentEnrichmentConfigurationProperty::unwrap))
    }

    /**
     * Configuration information for altering document metadata and content during the document
     * ingestion process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration)
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09a24b55237400780b4036c110934fe50e5d4eee1f31ff47c56735f466c92960")
    override
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CustomDocumentEnrichmentConfigurationProperty.Builder.() -> Unit):
        Unit =
        customDocumentEnrichmentConfiguration(CustomDocumentEnrichmentConfigurationProperty(customDocumentEnrichmentConfiguration))

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
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source. 
     */
    override fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(IResolvable::unwrap))
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
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source. 
     */
    override fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(DataSourceConfigurationProperty::unwrap))
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
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feac19ef158c17713136dc6e927a341682e4c0881325337d9e9743c12659145f")
    override
        fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty.Builder.() -> Unit):
        Unit = dataSourceConfiguration(DataSourceConfigurationProperty(dataSourceConfiguration))

    /**
     * A description for the data source connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-description)
     * @param description A description for the data source connector. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The identifier of the index you want to use with the data source connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-indexid)
     * @param indexId The identifier of the index you want to use with the data source connector. 
     */
    override fun indexId(indexId: String) {
      cdkBuilder.indexId(indexId)
    }

    /**
     * The code for a language.
     *
     * This shows a supported language for all documents in the data source. English is supported by
     * default. For more information on supported languages, including their codes, see [Adding
     * documents in languages other than
     * English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-languagecode)
     * @param languageCode The code for a language. 
     */
    override fun languageCode(languageCode: String) {
      cdkBuilder.languageCode(languageCode)
    }

    /**
     * The name of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-name)
     * @param name The name of the data source. 
     */
    override fun name(name: String) {
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
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the data
     * source. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * Sets the frequency that Amazon Kendra checks the documents in your data source and updates
     * the index.
     *
     * If you don't set a schedule, Amazon Kendra doesn't periodically update the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-schedule)
     * @param schedule Sets the frequency that Amazon Kendra checks the documents in your data
     * source and updates the index. 
     */
    override fun schedule(schedule: String) {
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
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-type)
     * @param type The type of the data source. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.kendra.CfnDataSource = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kendra.CfnDataSource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource):
        CfnDataSource = CfnDataSource(cdkObject)

    internal fun unwrap(wrapped: CfnDataSource):
        software.amazon.awscdk.services.kendra.CfnDataSource = wrapped.cdkObject
  }

  /**
   * Provides the configuration information to connect to an Amazon VPC.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
   * DataSourceVpcConfigurationProperty dataSourceVpcConfigurationProperty =
   * DataSourceVpcConfigurationProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourcevpcconfiguration.html)
   */
  public interface DataSourceVpcConfigurationProperty {
    /**
     * A list of identifiers of security groups within your Amazon VPC.
     *
     * The security groups should enable Amazon Kendra to connect to the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourcevpcconfiguration.html#cfn-kendra-datasource-datasourcevpcconfiguration-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * A list of identifiers for subnets within your Amazon VPC.
     *
     * The subnets should be able to connect to each other in the VPC, and they should have outgoing
     * access to the Internet through a NAT device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourcevpcconfiguration.html#cfn-kendra-datasource-datasourcevpcconfiguration-subnetids)
     */
    public fun subnetIds(): List<String>

    /**
     * A builder for [DataSourceVpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds A list of identifiers of security groups within your Amazon VPC. 
       * The security groups should enable Amazon Kendra to connect to the data source.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds A list of identifiers of security groups within your Amazon VPC. 
       * The security groups should enable Amazon Kendra to connect to the data source.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds A list of identifiers for subnets within your Amazon VPC. 
       * The subnets should be able to connect to each other in the VPC, and they should have
       * outgoing access to the Internet through a NAT device.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds A list of identifiers for subnets within your Amazon VPC. 
       * The subnets should be able to connect to each other in the VPC, and they should have
       * outgoing access to the Internet through a NAT device.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty.builder()

      /**
       * @param securityGroupIds A list of identifiers of security groups within your Amazon VPC. 
       * The security groups should enable Amazon Kendra to connect to the data source.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds A list of identifiers of security groups within your Amazon VPC. 
       * The security groups should enable Amazon Kendra to connect to the data source.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds A list of identifiers for subnets within your Amazon VPC. 
       * The subnets should be able to connect to each other in the VPC, and they should have
       * outgoing access to the Internet through a NAT device.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds A list of identifiers for subnets within your Amazon VPC. 
       * The subnets should be able to connect to each other in the VPC, and they should have
       * outgoing access to the Internet through a NAT device.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty,
    ) : CdkObject(cdkObject), DataSourceVpcConfigurationProperty {
      /**
       * A list of identifiers of security groups within your Amazon VPC.
       *
       * The security groups should enable Amazon Kendra to connect to the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourcevpcconfiguration.html#cfn-kendra-datasource-datasourcevpcconfiguration-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * A list of identifiers for subnets within your Amazon VPC.
       *
       * The subnets should be able to connect to each other in the VPC, and they should have
       * outgoing access to the Internet through a NAT device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourcevpcconfiguration.html#cfn-kendra-datasource-datasourcevpcconfiguration-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataSourceVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty):
          DataSourceVpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceVpcConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty
    }
  }

  /**
   * Provides the configuration information to connect to Microsoft SharePoint as your data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface SharePointConfigurationProperty {
    /**
     * `TRUE` to index document attachments.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-crawlattachments)
     */
    public fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

    /**
     * `TRUE` to disable local groups information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-disablelocalgroups)
     */
    public fun disableLocalGroups(): Any? = unwrap(this).getDisableLocalGroups()

    /**
     * The Microsoft SharePoint attribute field that contains the title of the document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-documenttitlefieldname)
     */
    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    /**
     * A list of regular expression patterns.
     *
     * Documents that match the patterns are excluded from the index. Documents that don't match the
     * patterns are included in the index. If a document matches both an exclusion pattern and an
     * inclusion pattern, the document is not included in the index.
     *
     * The regex is applied to the display URL of the SharePoint document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-exclusionpatterns)
     */
    public fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
        emptyList()

    /**
     * A list of `DataSourceToIndexFieldMapping` objects that map Microsoft SharePoint attributes or
     * fields to Amazon Kendra index fields.
     *
     * You must first create the index fields using the
     * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation
     * before you map SharePoint attributes. For more information, see [Mapping Data Source
     * Fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-fieldmappings)
     */
    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    /**
     * A list of regular expression patterns to include certain documents in your SharePoint.
     *
     * Documents that match the patterns are included in the index. Documents that don't match the
     * patterns are excluded from the index. If a document matches both an inclusion and exclusion
     * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
     *
     * The regex applies to the display URL of the SharePoint document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-inclusionpatterns)
     */
    public fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
        emptyList()

    /**
     * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that contains the user name
     * and password required to connect to the SharePoint instance.
     *
     * For more information, see [Microsoft
     * SharePoint](https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-secretarn)
     */
    public fun secretArn(): String

    /**
     * The version of Microsoft SharePoint that you use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-sharepointversion)
     */
    public fun sharePointVersion(): String

    /**
     * Information required to find a specific file in an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-sslcertificates3path)
     */
    public fun sslCertificateS3Path(): Any? = unwrap(this).getSslCertificateS3Path()

    /**
     * The Microsoft SharePoint site URLs for the documents you want to index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-urls)
     */
    public fun urls(): List<String>

    /**
     * `TRUE` to use the SharePoint change log to determine which documents require updating in the
     * index.
     *
     * Depending on the change log's size, it may take longer for Amazon Kendra to use the change
     * log than to scan all of your documents in SharePoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-usechangelog)
     */
    public fun useChangeLog(): Any? = unwrap(this).getUseChangeLog()

    /**
     * Provides information for connecting to an Amazon VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-vpcconfiguration)
     */
    public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

    /**
     * A builder for [SharePointConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crawlAttachments `TRUE` to index document attachments.
       */
      public fun crawlAttachments(crawlAttachments: Boolean)

      /**
       * @param crawlAttachments `TRUE` to index document attachments.
       */
      public fun crawlAttachments(crawlAttachments: IResolvable)

      /**
       * @param disableLocalGroups `TRUE` to disable local groups information.
       */
      public fun disableLocalGroups(disableLocalGroups: Boolean)

      /**
       * @param disableLocalGroups `TRUE` to disable local groups information.
       */
      public fun disableLocalGroups(disableLocalGroups: IResolvable)

      /**
       * @param documentTitleFieldName The Microsoft SharePoint attribute field that contains the
       * title of the document.
       */
      public fun documentTitleFieldName(documentTitleFieldName: String)

      /**
       * @param exclusionPatterns A list of regular expression patterns.
       * Documents that match the patterns are excluded from the index. Documents that don't match
       * the patterns are included in the index. If a document matches both an exclusion pattern and an
       * inclusion pattern, the document is not included in the index.
       *
       * The regex is applied to the display URL of the SharePoint document.
       */
      public fun exclusionPatterns(exclusionPatterns: List<String>)

      /**
       * @param exclusionPatterns A list of regular expression patterns.
       * Documents that match the patterns are excluded from the index. Documents that don't match
       * the patterns are included in the index. If a document matches both an exclusion pattern and an
       * inclusion pattern, the document is not included in the index.
       *
       * The regex is applied to the display URL of the SharePoint document.
       */
      public fun exclusionPatterns(vararg exclusionPatterns: String)

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Microsoft
       * SharePoint attributes or fields to Amazon Kendra index fields.
       * You must first create the index fields using the
       * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation
       * before you map SharePoint attributes. For more information, see [Mapping Data Source
       * Fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) .
       */
      public fun fieldMappings(fieldMappings: IResolvable)

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Microsoft
       * SharePoint attributes or fields to Amazon Kendra index fields.
       * You must first create the index fields using the
       * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation
       * before you map SharePoint attributes. For more information, see [Mapping Data Source
       * Fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) .
       */
      public fun fieldMappings(fieldMappings: List<Any>)

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Microsoft
       * SharePoint attributes or fields to Amazon Kendra index fields.
       * You must first create the index fields using the
       * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation
       * before you map SharePoint attributes. For more information, see [Mapping Data Source
       * Fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) .
       */
      public fun fieldMappings(vararg fieldMappings: Any)

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain documents
       * in your SharePoint.
       * Documents that match the patterns are included in the index. Documents that don't match the
       * patterns are excluded from the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The regex applies to the display URL of the SharePoint document.
       */
      public fun inclusionPatterns(inclusionPatterns: List<String>)

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain documents
       * in your SharePoint.
       * Documents that match the patterns are included in the index. Documents that don't match the
       * patterns are excluded from the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The regex applies to the display URL of the SharePoint document.
       */
      public fun inclusionPatterns(vararg inclusionPatterns: String)

      /**
       * @param secretArn The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
       * contains the user name and password required to connect to the SharePoint instance. 
       * For more information, see [Microsoft
       * SharePoint](https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html) .
       */
      public fun secretArn(secretArn: String)

      /**
       * @param sharePointVersion The version of Microsoft SharePoint that you use. 
       */
      public fun sharePointVersion(sharePointVersion: String)

      /**
       * @param sslCertificateS3Path Information required to find a specific file in an Amazon S3
       * bucket.
       */
      public fun sslCertificateS3Path(sslCertificateS3Path: IResolvable)

      /**
       * @param sslCertificateS3Path Information required to find a specific file in an Amazon S3
       * bucket.
       */
      public fun sslCertificateS3Path(sslCertificateS3Path: S3PathProperty)

      /**
       * @param sslCertificateS3Path Information required to find a specific file in an Amazon S3
       * bucket.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2127e493613bd538dabcc5b42d3edd169d9f2c98a2067b34e2faeb5848504144")
      public fun sslCertificateS3Path(sslCertificateS3Path: S3PathProperty.Builder.() -> Unit)

      /**
       * @param urls The Microsoft SharePoint site URLs for the documents you want to index. 
       */
      public fun urls(urls: List<String>)

      /**
       * @param urls The Microsoft SharePoint site URLs for the documents you want to index. 
       */
      public fun urls(vararg urls: String)

      /**
       * @param useChangeLog `TRUE` to use the SharePoint change log to determine which documents
       * require updating in the index.
       * Depending on the change log's size, it may take longer for Amazon Kendra to use the change
       * log than to scan all of your documents in SharePoint.
       */
      public fun useChangeLog(useChangeLog: Boolean)

      /**
       * @param useChangeLog `TRUE` to use the SharePoint change log to determine which documents
       * require updating in the index.
       * Depending on the change log's size, it may take longer for Amazon Kendra to use the change
       * log than to scan all of your documents in SharePoint.
       */
      public fun useChangeLog(useChangeLog: IResolvable)

      /**
       * @param vpcConfiguration Provides information for connecting to an Amazon VPC.
       */
      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      /**
       * @param vpcConfiguration Provides information for connecting to an Amazon VPC.
       */
      public fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty)

      /**
       * @param vpcConfiguration Provides information for connecting to an Amazon VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b23baf699d4733b7ee2ece45ce9c72df4129e855c5c040cbeaa1a3d84f649f1f")
      public
          fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty.builder()

      /**
       * @param crawlAttachments `TRUE` to index document attachments.
       */
      override fun crawlAttachments(crawlAttachments: Boolean) {
        cdkBuilder.crawlAttachments(crawlAttachments)
      }

      /**
       * @param crawlAttachments `TRUE` to index document attachments.
       */
      override fun crawlAttachments(crawlAttachments: IResolvable) {
        cdkBuilder.crawlAttachments(crawlAttachments.let(IResolvable::unwrap))
      }

      /**
       * @param disableLocalGroups `TRUE` to disable local groups information.
       */
      override fun disableLocalGroups(disableLocalGroups: Boolean) {
        cdkBuilder.disableLocalGroups(disableLocalGroups)
      }

      /**
       * @param disableLocalGroups `TRUE` to disable local groups information.
       */
      override fun disableLocalGroups(disableLocalGroups: IResolvable) {
        cdkBuilder.disableLocalGroups(disableLocalGroups.let(IResolvable::unwrap))
      }

      /**
       * @param documentTitleFieldName The Microsoft SharePoint attribute field that contains the
       * title of the document.
       */
      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      /**
       * @param exclusionPatterns A list of regular expression patterns.
       * Documents that match the patterns are excluded from the index. Documents that don't match
       * the patterns are included in the index. If a document matches both an exclusion pattern and an
       * inclusion pattern, the document is not included in the index.
       *
       * The regex is applied to the display URL of the SharePoint document.
       */
      override fun exclusionPatterns(exclusionPatterns: List<String>) {
        cdkBuilder.exclusionPatterns(exclusionPatterns)
      }

      /**
       * @param exclusionPatterns A list of regular expression patterns.
       * Documents that match the patterns are excluded from the index. Documents that don't match
       * the patterns are included in the index. If a document matches both an exclusion pattern and an
       * inclusion pattern, the document is not included in the index.
       *
       * The regex is applied to the display URL of the SharePoint document.
       */
      override fun exclusionPatterns(vararg exclusionPatterns: String): Unit =
          exclusionPatterns(exclusionPatterns.toList())

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Microsoft
       * SharePoint attributes or fields to Amazon Kendra index fields.
       * You must first create the index fields using the
       * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation
       * before you map SharePoint attributes. For more information, see [Mapping Data Source
       * Fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) .
       */
      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Microsoft
       * SharePoint attributes or fields to Amazon Kendra index fields.
       * You must first create the index fields using the
       * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation
       * before you map SharePoint attributes. For more information, see [Mapping Data Source
       * Fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) .
       */
      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Microsoft
       * SharePoint attributes or fields to Amazon Kendra index fields.
       * You must first create the index fields using the
       * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation
       * before you map SharePoint attributes. For more information, see [Mapping Data Source
       * Fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) .
       */
      override fun fieldMappings(vararg fieldMappings: Any): Unit =
          fieldMappings(fieldMappings.toList())

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain documents
       * in your SharePoint.
       * Documents that match the patterns are included in the index. Documents that don't match the
       * patterns are excluded from the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The regex applies to the display URL of the SharePoint document.
       */
      override fun inclusionPatterns(inclusionPatterns: List<String>) {
        cdkBuilder.inclusionPatterns(inclusionPatterns)
      }

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain documents
       * in your SharePoint.
       * Documents that match the patterns are included in the index. Documents that don't match the
       * patterns are excluded from the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The regex applies to the display URL of the SharePoint document.
       */
      override fun inclusionPatterns(vararg inclusionPatterns: String): Unit =
          inclusionPatterns(inclusionPatterns.toList())

      /**
       * @param secretArn The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
       * contains the user name and password required to connect to the SharePoint instance. 
       * For more information, see [Microsoft
       * SharePoint](https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html) .
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      /**
       * @param sharePointVersion The version of Microsoft SharePoint that you use. 
       */
      override fun sharePointVersion(sharePointVersion: String) {
        cdkBuilder.sharePointVersion(sharePointVersion)
      }

      /**
       * @param sslCertificateS3Path Information required to find a specific file in an Amazon S3
       * bucket.
       */
      override fun sslCertificateS3Path(sslCertificateS3Path: IResolvable) {
        cdkBuilder.sslCertificateS3Path(sslCertificateS3Path.let(IResolvable::unwrap))
      }

      /**
       * @param sslCertificateS3Path Information required to find a specific file in an Amazon S3
       * bucket.
       */
      override fun sslCertificateS3Path(sslCertificateS3Path: S3PathProperty) {
        cdkBuilder.sslCertificateS3Path(sslCertificateS3Path.let(S3PathProperty::unwrap))
      }

      /**
       * @param sslCertificateS3Path Information required to find a specific file in an Amazon S3
       * bucket.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2127e493613bd538dabcc5b42d3edd169d9f2c98a2067b34e2faeb5848504144")
      override fun sslCertificateS3Path(sslCertificateS3Path: S3PathProperty.Builder.() -> Unit):
          Unit = sslCertificateS3Path(S3PathProperty(sslCertificateS3Path))

      /**
       * @param urls The Microsoft SharePoint site URLs for the documents you want to index. 
       */
      override fun urls(urls: List<String>) {
        cdkBuilder.urls(urls)
      }

      /**
       * @param urls The Microsoft SharePoint site URLs for the documents you want to index. 
       */
      override fun urls(vararg urls: String): Unit = urls(urls.toList())

      /**
       * @param useChangeLog `TRUE` to use the SharePoint change log to determine which documents
       * require updating in the index.
       * Depending on the change log's size, it may take longer for Amazon Kendra to use the change
       * log than to scan all of your documents in SharePoint.
       */
      override fun useChangeLog(useChangeLog: Boolean) {
        cdkBuilder.useChangeLog(useChangeLog)
      }

      /**
       * @param useChangeLog `TRUE` to use the SharePoint change log to determine which documents
       * require updating in the index.
       * Depending on the change log's size, it may take longer for Amazon Kendra to use the change
       * log than to scan all of your documents in SharePoint.
       */
      override fun useChangeLog(useChangeLog: IResolvable) {
        cdkBuilder.useChangeLog(useChangeLog.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConfiguration Provides information for connecting to an Amazon VPC.
       */
      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConfiguration Provides information for connecting to an Amazon VPC.
       */
      override fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(DataSourceVpcConfigurationProperty::unwrap))
      }

      /**
       * @param vpcConfiguration Provides information for connecting to an Amazon VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b23baf699d4733b7ee2ece45ce9c72df4129e855c5c040cbeaa1a3d84f649f1f")
      override
          fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(DataSourceVpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty,
    ) : CdkObject(cdkObject), SharePointConfigurationProperty {
      /**
       * `TRUE` to index document attachments.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-crawlattachments)
       */
      override fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

      /**
       * `TRUE` to disable local groups information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-disablelocalgroups)
       */
      override fun disableLocalGroups(): Any? = unwrap(this).getDisableLocalGroups()

      /**
       * The Microsoft SharePoint attribute field that contains the title of the document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-documenttitlefieldname)
       */
      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      /**
       * A list of regular expression patterns.
       *
       * Documents that match the patterns are excluded from the index. Documents that don't match
       * the patterns are included in the index. If a document matches both an exclusion pattern and an
       * inclusion pattern, the document is not included in the index.
       *
       * The regex is applied to the display URL of the SharePoint document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-exclusionpatterns)
       */
      override fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
          emptyList()

      /**
       * A list of `DataSourceToIndexFieldMapping` objects that map Microsoft SharePoint attributes
       * or fields to Amazon Kendra index fields.
       *
       * You must first create the index fields using the
       * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation
       * before you map SharePoint attributes. For more information, see [Mapping Data Source
       * Fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-fieldmappings)
       */
      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      /**
       * A list of regular expression patterns to include certain documents in your SharePoint.
       *
       * Documents that match the patterns are included in the index. Documents that don't match the
       * patterns are excluded from the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The regex applies to the display URL of the SharePoint document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-inclusionpatterns)
       */
      override fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
          emptyList()

      /**
       * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that contains the user name
       * and password required to connect to the SharePoint instance.
       *
       * For more information, see [Microsoft
       * SharePoint](https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-secretarn)
       */
      override fun secretArn(): String = unwrap(this).getSecretArn()

      /**
       * The version of Microsoft SharePoint that you use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-sharepointversion)
       */
      override fun sharePointVersion(): String = unwrap(this).getSharePointVersion()

      /**
       * Information required to find a specific file in an Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-sslcertificates3path)
       */
      override fun sslCertificateS3Path(): Any? = unwrap(this).getSslCertificateS3Path()

      /**
       * The Microsoft SharePoint site URLs for the documents you want to index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-urls)
       */
      override fun urls(): List<String> = unwrap(this).getUrls()

      /**
       * `TRUE` to use the SharePoint change log to determine which documents require updating in
       * the index.
       *
       * Depending on the change log's size, it may take longer for Amazon Kendra to use the change
       * log than to scan all of your documents in SharePoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-usechangelog)
       */
      override fun useChangeLog(): Any? = unwrap(this).getUseChangeLog()

      /**
       * Provides information for connecting to an Amazon VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html#cfn-kendra-datasource-sharepointconfiguration-vpcconfiguration)
       */
      override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SharePointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty):
          SharePointConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SharePointConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty
    }
  }

  /**
   * Provides the configuration information required for Amazon Kendra Web Crawler.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface WebCrawlerConfigurationProperty {
    /**
     * Configuration information required to connect to websites using authentication.
     *
     * You can connect to websites using basic authentication of user name and password. You use a
     * secret in [AWS Secrets
     * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) to store your
     * authentication credentials.
     *
     * You must provide the website host name and port number. For example, the host name of
     * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
     * HTTPS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-authenticationconfiguration)
     */
    public fun authenticationConfiguration(): Any? = unwrap(this).getAuthenticationConfiguration()

    /**
     * The 'depth' or number of levels from the seed level to crawl.
     *
     * For example, the seed URL page is depth 1 and any hyperlinks on this page that are also
     * crawled are depth 2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-crawldepth)
     */
    public fun crawlDepth(): Number? = unwrap(this).getCrawlDepth()

    /**
     * The maximum size (in MB) of a web page or attachment to crawl.
     *
     * Files larger than this size (in MB) are skipped/not crawled.
     *
     * The default maximum size of a web page or attachment is set to 50 MB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-maxcontentsizeperpageinmegabytes)
     */
    public fun maxContentSizePerPageInMegaBytes(): Number? =
        unwrap(this).getMaxContentSizePerPageInMegaBytes()

    /**
     * The maximum number of URLs on a web page to include when crawling a website.
     *
     * This number is per web page.
     *
     * As a website’s web pages are crawled, any URLs the web pages link to are also crawled. URLs
     * on a web page are crawled in order of appearance.
     *
     * The default maximum links per page is 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-maxlinksperpage)
     */
    public fun maxLinksPerPage(): Number? = unwrap(this).getMaxLinksPerPage()

    /**
     * The maximum number of URLs crawled per website host per minute.
     *
     * A minimum of one URL is required.
     *
     * The default maximum number of URLs crawled per website host per minute is 300.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-maxurlsperminutecrawlrate)
     */
    public fun maxUrlsPerMinuteCrawlRate(): Number? = unwrap(this).getMaxUrlsPerMinuteCrawlRate()

    /**
     * Configuration information required to connect to your internal websites via a web proxy.
     *
     * You must provide the website host name and port number. For example, the host name of
     * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
     * HTTPS.
     *
     * Web proxy credentials are optional and you can use them to connect to a web proxy server that
     * requires basic authentication. To store web proxy credentials, you use a secret in [AWS Secrets
     * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-proxyconfiguration)
     */
    public fun proxyConfiguration(): Any? = unwrap(this).getProxyConfiguration()

    /**
     * A list of regular expression patterns to exclude certain URLs to crawl.
     *
     * URLs that match the patterns are excluded from the index. URLs that don't match the patterns
     * are included in the index. If a URL matches both an inclusion and exclusion pattern, the
     * exclusion pattern takes precedence and the URL file isn't included in the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-urlexclusionpatterns)
     */
    public fun urlExclusionPatterns(): List<String> = unwrap(this).getUrlExclusionPatterns() ?:
        emptyList()

    /**
     * A list of regular expression patterns to include certain URLs to crawl.
     *
     * URLs that match the patterns are included in the index. URLs that don't match the patterns
     * are excluded from the index. If a URL matches both an inclusion and exclusion pattern, the
     * exclusion pattern takes precedence and the URL file isn't included in the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-urlinclusionpatterns)
     */
    public fun urlInclusionPatterns(): List<String> = unwrap(this).getUrlInclusionPatterns() ?:
        emptyList()

    /**
     * Specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites
     * you want to crawl.
     *
     * You can include website subdomains. You can list up to 100 seed URLs and up to three sitemap
     * URLs.
     *
     * You can only crawl websites that use the secure communication protocol, Hypertext Transfer
     * Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the
     * website is blocked from crawling.
     *
     * *When selecting websites to index, you must adhere to the [Amazon Acceptable Use
     * Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms. Remember that you must
     * only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have
     * authorization to index.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-urls)
     */
    public fun urls(): Any

    /**
     * A builder for [WebCrawlerConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authenticationConfiguration Configuration information required to connect to
       * websites using authentication.
       * You can connect to websites using basic authentication of user name and password. You use a
       * secret in [AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) to store your
       * authentication credentials.
       *
       * You must provide the website host name and port number. For example, the host name of
       * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
       * HTTPS.
       */
      public fun authenticationConfiguration(authenticationConfiguration: IResolvable)

      /**
       * @param authenticationConfiguration Configuration information required to connect to
       * websites using authentication.
       * You can connect to websites using basic authentication of user name and password. You use a
       * secret in [AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) to store your
       * authentication credentials.
       *
       * You must provide the website host name and port number. For example, the host name of
       * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
       * HTTPS.
       */
      public
          fun authenticationConfiguration(authenticationConfiguration: WebCrawlerAuthenticationConfigurationProperty)

      /**
       * @param authenticationConfiguration Configuration information required to connect to
       * websites using authentication.
       * You can connect to websites using basic authentication of user name and password. You use a
       * secret in [AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) to store your
       * authentication credentials.
       *
       * You must provide the website host name and port number. For example, the host name of
       * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
       * HTTPS.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9375cd609ac8ce64ac0fc38e414d174cee4fda680c1fbc196c808540d4bcb44")
      public
          fun authenticationConfiguration(authenticationConfiguration: WebCrawlerAuthenticationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param crawlDepth The 'depth' or number of levels from the seed level to crawl.
       * For example, the seed URL page is depth 1 and any hyperlinks on this page that are also
       * crawled are depth 2.
       */
      public fun crawlDepth(crawlDepth: Number)

      /**
       * @param maxContentSizePerPageInMegaBytes The maximum size (in MB) of a web page or
       * attachment to crawl.
       * Files larger than this size (in MB) are skipped/not crawled.
       *
       * The default maximum size of a web page or attachment is set to 50 MB.
       */
      public fun maxContentSizePerPageInMegaBytes(maxContentSizePerPageInMegaBytes: Number)

      /**
       * @param maxLinksPerPage The maximum number of URLs on a web page to include when crawling a
       * website.
       * This number is per web page.
       *
       * As a website’s web pages are crawled, any URLs the web pages link to are also crawled. URLs
       * on a web page are crawled in order of appearance.
       *
       * The default maximum links per page is 100.
       */
      public fun maxLinksPerPage(maxLinksPerPage: Number)

      /**
       * @param maxUrlsPerMinuteCrawlRate The maximum number of URLs crawled per website host per
       * minute.
       * A minimum of one URL is required.
       *
       * The default maximum number of URLs crawled per website host per minute is 300.
       */
      public fun maxUrlsPerMinuteCrawlRate(maxUrlsPerMinuteCrawlRate: Number)

      /**
       * @param proxyConfiguration Configuration information required to connect to your internal
       * websites via a web proxy.
       * You must provide the website host name and port number. For example, the host name of
       * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
       * HTTPS.
       *
       * Web proxy credentials are optional and you can use them to connect to a web proxy server
       * that requires basic authentication. To store web proxy credentials, you use a secret in [AWS
       * Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) .
       */
      public fun proxyConfiguration(proxyConfiguration: IResolvable)

      /**
       * @param proxyConfiguration Configuration information required to connect to your internal
       * websites via a web proxy.
       * You must provide the website host name and port number. For example, the host name of
       * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
       * HTTPS.
       *
       * Web proxy credentials are optional and you can use them to connect to a web proxy server
       * that requires basic authentication. To store web proxy credentials, you use a secret in [AWS
       * Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) .
       */
      public fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty)

      /**
       * @param proxyConfiguration Configuration information required to connect to your internal
       * websites via a web proxy.
       * You must provide the website host name and port number. For example, the host name of
       * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
       * HTTPS.
       *
       * Web proxy credentials are optional and you can use them to connect to a web proxy server
       * that requires basic authentication. To store web proxy credentials, you use a secret in [AWS
       * Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ce8baf561a2460e7a66d6a6a4fd470f85e30b1d5ffb8009028dcff89fc3f74e")
      public
          fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty.Builder.() -> Unit)

      /**
       * @param urlExclusionPatterns A list of regular expression patterns to exclude certain URLs
       * to crawl.
       * URLs that match the patterns are excluded from the index. URLs that don't match the
       * patterns are included in the index. If a URL matches both an inclusion and exclusion pattern,
       * the exclusion pattern takes precedence and the URL file isn't included in the index.
       */
      public fun urlExclusionPatterns(urlExclusionPatterns: List<String>)

      /**
       * @param urlExclusionPatterns A list of regular expression patterns to exclude certain URLs
       * to crawl.
       * URLs that match the patterns are excluded from the index. URLs that don't match the
       * patterns are included in the index. If a URL matches both an inclusion and exclusion pattern,
       * the exclusion pattern takes precedence and the URL file isn't included in the index.
       */
      public fun urlExclusionPatterns(vararg urlExclusionPatterns: String)

      /**
       * @param urlInclusionPatterns A list of regular expression patterns to include certain URLs
       * to crawl.
       * URLs that match the patterns are included in the index. URLs that don't match the patterns
       * are excluded from the index. If a URL matches both an inclusion and exclusion pattern, the
       * exclusion pattern takes precedence and the URL file isn't included in the index.
       */
      public fun urlInclusionPatterns(urlInclusionPatterns: List<String>)

      /**
       * @param urlInclusionPatterns A list of regular expression patterns to include certain URLs
       * to crawl.
       * URLs that match the patterns are included in the index. URLs that don't match the patterns
       * are excluded from the index. If a URL matches both an inclusion and exclusion pattern, the
       * exclusion pattern takes precedence and the URL file isn't included in the index.
       */
      public fun urlInclusionPatterns(vararg urlInclusionPatterns: String)

      /**
       * @param urls Specifies the seed or starting point URLs of the websites or the sitemap URLs
       * of the websites you want to crawl. 
       * You can include website subdomains. You can list up to 100 seed URLs and up to three
       * sitemap URLs.
       *
       * You can only crawl websites that use the secure communication protocol, Hypertext Transfer
       * Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the
       * website is blocked from crawling.
       *
       * *When selecting websites to index, you must adhere to the [Amazon Acceptable Use
       * Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms. Remember that you must
       * only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have
       * authorization to index.*
       */
      public fun urls(urls: IResolvable)

      /**
       * @param urls Specifies the seed or starting point URLs of the websites or the sitemap URLs
       * of the websites you want to crawl. 
       * You can include website subdomains. You can list up to 100 seed URLs and up to three
       * sitemap URLs.
       *
       * You can only crawl websites that use the secure communication protocol, Hypertext Transfer
       * Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the
       * website is blocked from crawling.
       *
       * *When selecting websites to index, you must adhere to the [Amazon Acceptable Use
       * Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms. Remember that you must
       * only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have
       * authorization to index.*
       */
      public fun urls(urls: WebCrawlerUrlsProperty)

      /**
       * @param urls Specifies the seed or starting point URLs of the websites or the sitemap URLs
       * of the websites you want to crawl. 
       * You can include website subdomains. You can list up to 100 seed URLs and up to three
       * sitemap URLs.
       *
       * You can only crawl websites that use the secure communication protocol, Hypertext Transfer
       * Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the
       * website is blocked from crawling.
       *
       * *When selecting websites to index, you must adhere to the [Amazon Acceptable Use
       * Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms. Remember that you must
       * only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have
       * authorization to index.*
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89c4546fdcecabe3d16ebadb3808f7692f825e5692f249b5b0d55db6cf17fd68")
      public fun urls(urls: WebCrawlerUrlsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty.builder()

      /**
       * @param authenticationConfiguration Configuration information required to connect to
       * websites using authentication.
       * You can connect to websites using basic authentication of user name and password. You use a
       * secret in [AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) to store your
       * authentication credentials.
       *
       * You must provide the website host name and port number. For example, the host name of
       * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
       * HTTPS.
       */
      override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param authenticationConfiguration Configuration information required to connect to
       * websites using authentication.
       * You can connect to websites using basic authentication of user name and password. You use a
       * secret in [AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) to store your
       * authentication credentials.
       *
       * You must provide the website host name and port number. For example, the host name of
       * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
       * HTTPS.
       */
      override
          fun authenticationConfiguration(authenticationConfiguration: WebCrawlerAuthenticationConfigurationProperty) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(WebCrawlerAuthenticationConfigurationProperty::unwrap))
      }

      /**
       * @param authenticationConfiguration Configuration information required to connect to
       * websites using authentication.
       * You can connect to websites using basic authentication of user name and password. You use a
       * secret in [AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) to store your
       * authentication credentials.
       *
       * You must provide the website host name and port number. For example, the host name of
       * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
       * HTTPS.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9375cd609ac8ce64ac0fc38e414d174cee4fda680c1fbc196c808540d4bcb44")
      override
          fun authenticationConfiguration(authenticationConfiguration: WebCrawlerAuthenticationConfigurationProperty.Builder.() -> Unit):
          Unit =
          authenticationConfiguration(WebCrawlerAuthenticationConfigurationProperty(authenticationConfiguration))

      /**
       * @param crawlDepth The 'depth' or number of levels from the seed level to crawl.
       * For example, the seed URL page is depth 1 and any hyperlinks on this page that are also
       * crawled are depth 2.
       */
      override fun crawlDepth(crawlDepth: Number) {
        cdkBuilder.crawlDepth(crawlDepth)
      }

      /**
       * @param maxContentSizePerPageInMegaBytes The maximum size (in MB) of a web page or
       * attachment to crawl.
       * Files larger than this size (in MB) are skipped/not crawled.
       *
       * The default maximum size of a web page or attachment is set to 50 MB.
       */
      override fun maxContentSizePerPageInMegaBytes(maxContentSizePerPageInMegaBytes: Number) {
        cdkBuilder.maxContentSizePerPageInMegaBytes(maxContentSizePerPageInMegaBytes)
      }

      /**
       * @param maxLinksPerPage The maximum number of URLs on a web page to include when crawling a
       * website.
       * This number is per web page.
       *
       * As a website’s web pages are crawled, any URLs the web pages link to are also crawled. URLs
       * on a web page are crawled in order of appearance.
       *
       * The default maximum links per page is 100.
       */
      override fun maxLinksPerPage(maxLinksPerPage: Number) {
        cdkBuilder.maxLinksPerPage(maxLinksPerPage)
      }

      /**
       * @param maxUrlsPerMinuteCrawlRate The maximum number of URLs crawled per website host per
       * minute.
       * A minimum of one URL is required.
       *
       * The default maximum number of URLs crawled per website host per minute is 300.
       */
      override fun maxUrlsPerMinuteCrawlRate(maxUrlsPerMinuteCrawlRate: Number) {
        cdkBuilder.maxUrlsPerMinuteCrawlRate(maxUrlsPerMinuteCrawlRate)
      }

      /**
       * @param proxyConfiguration Configuration information required to connect to your internal
       * websites via a web proxy.
       * You must provide the website host name and port number. For example, the host name of
       * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
       * HTTPS.
       *
       * Web proxy credentials are optional and you can use them to connect to a web proxy server
       * that requires basic authentication. To store web proxy credentials, you use a secret in [AWS
       * Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) .
       */
      override fun proxyConfiguration(proxyConfiguration: IResolvable) {
        cdkBuilder.proxyConfiguration(proxyConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param proxyConfiguration Configuration information required to connect to your internal
       * websites via a web proxy.
       * You must provide the website host name and port number. For example, the host name of
       * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
       * HTTPS.
       *
       * Web proxy credentials are optional and you can use them to connect to a web proxy server
       * that requires basic authentication. To store web proxy credentials, you use a secret in [AWS
       * Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) .
       */
      override fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty) {
        cdkBuilder.proxyConfiguration(proxyConfiguration.let(ProxyConfigurationProperty::unwrap))
      }

      /**
       * @param proxyConfiguration Configuration information required to connect to your internal
       * websites via a web proxy.
       * You must provide the website host name and port number. For example, the host name of
       * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
       * HTTPS.
       *
       * Web proxy credentials are optional and you can use them to connect to a web proxy server
       * that requires basic authentication. To store web proxy credentials, you use a secret in [AWS
       * Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ce8baf561a2460e7a66d6a6a4fd470f85e30b1d5ffb8009028dcff89fc3f74e")
      override
          fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty.Builder.() -> Unit):
          Unit = proxyConfiguration(ProxyConfigurationProperty(proxyConfiguration))

      /**
       * @param urlExclusionPatterns A list of regular expression patterns to exclude certain URLs
       * to crawl.
       * URLs that match the patterns are excluded from the index. URLs that don't match the
       * patterns are included in the index. If a URL matches both an inclusion and exclusion pattern,
       * the exclusion pattern takes precedence and the URL file isn't included in the index.
       */
      override fun urlExclusionPatterns(urlExclusionPatterns: List<String>) {
        cdkBuilder.urlExclusionPatterns(urlExclusionPatterns)
      }

      /**
       * @param urlExclusionPatterns A list of regular expression patterns to exclude certain URLs
       * to crawl.
       * URLs that match the patterns are excluded from the index. URLs that don't match the
       * patterns are included in the index. If a URL matches both an inclusion and exclusion pattern,
       * the exclusion pattern takes precedence and the URL file isn't included in the index.
       */
      override fun urlExclusionPatterns(vararg urlExclusionPatterns: String): Unit =
          urlExclusionPatterns(urlExclusionPatterns.toList())

      /**
       * @param urlInclusionPatterns A list of regular expression patterns to include certain URLs
       * to crawl.
       * URLs that match the patterns are included in the index. URLs that don't match the patterns
       * are excluded from the index. If a URL matches both an inclusion and exclusion pattern, the
       * exclusion pattern takes precedence and the URL file isn't included in the index.
       */
      override fun urlInclusionPatterns(urlInclusionPatterns: List<String>) {
        cdkBuilder.urlInclusionPatterns(urlInclusionPatterns)
      }

      /**
       * @param urlInclusionPatterns A list of regular expression patterns to include certain URLs
       * to crawl.
       * URLs that match the patterns are included in the index. URLs that don't match the patterns
       * are excluded from the index. If a URL matches both an inclusion and exclusion pattern, the
       * exclusion pattern takes precedence and the URL file isn't included in the index.
       */
      override fun urlInclusionPatterns(vararg urlInclusionPatterns: String): Unit =
          urlInclusionPatterns(urlInclusionPatterns.toList())

      /**
       * @param urls Specifies the seed or starting point URLs of the websites or the sitemap URLs
       * of the websites you want to crawl. 
       * You can include website subdomains. You can list up to 100 seed URLs and up to three
       * sitemap URLs.
       *
       * You can only crawl websites that use the secure communication protocol, Hypertext Transfer
       * Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the
       * website is blocked from crawling.
       *
       * *When selecting websites to index, you must adhere to the [Amazon Acceptable Use
       * Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms. Remember that you must
       * only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have
       * authorization to index.*
       */
      override fun urls(urls: IResolvable) {
        cdkBuilder.urls(urls.let(IResolvable::unwrap))
      }

      /**
       * @param urls Specifies the seed or starting point URLs of the websites or the sitemap URLs
       * of the websites you want to crawl. 
       * You can include website subdomains. You can list up to 100 seed URLs and up to three
       * sitemap URLs.
       *
       * You can only crawl websites that use the secure communication protocol, Hypertext Transfer
       * Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the
       * website is blocked from crawling.
       *
       * *When selecting websites to index, you must adhere to the [Amazon Acceptable Use
       * Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms. Remember that you must
       * only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have
       * authorization to index.*
       */
      override fun urls(urls: WebCrawlerUrlsProperty) {
        cdkBuilder.urls(urls.let(WebCrawlerUrlsProperty::unwrap))
      }

      /**
       * @param urls Specifies the seed or starting point URLs of the websites or the sitemap URLs
       * of the websites you want to crawl. 
       * You can include website subdomains. You can list up to 100 seed URLs and up to three
       * sitemap URLs.
       *
       * You can only crawl websites that use the secure communication protocol, Hypertext Transfer
       * Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the
       * website is blocked from crawling.
       *
       * *When selecting websites to index, you must adhere to the [Amazon Acceptable Use
       * Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms. Remember that you must
       * only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have
       * authorization to index.*
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89c4546fdcecabe3d16ebadb3808f7692f825e5692f249b5b0d55db6cf17fd68")
      override fun urls(urls: WebCrawlerUrlsProperty.Builder.() -> Unit): Unit =
          urls(WebCrawlerUrlsProperty(urls))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty,
    ) : CdkObject(cdkObject), WebCrawlerConfigurationProperty {
      /**
       * Configuration information required to connect to websites using authentication.
       *
       * You can connect to websites using basic authentication of user name and password. You use a
       * secret in [AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) to store your
       * authentication credentials.
       *
       * You must provide the website host name and port number. For example, the host name of
       * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
       * HTTPS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-authenticationconfiguration)
       */
      override fun authenticationConfiguration(): Any? =
          unwrap(this).getAuthenticationConfiguration()

      /**
       * The 'depth' or number of levels from the seed level to crawl.
       *
       * For example, the seed URL page is depth 1 and any hyperlinks on this page that are also
       * crawled are depth 2.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-crawldepth)
       */
      override fun crawlDepth(): Number? = unwrap(this).getCrawlDepth()

      /**
       * The maximum size (in MB) of a web page or attachment to crawl.
       *
       * Files larger than this size (in MB) are skipped/not crawled.
       *
       * The default maximum size of a web page or attachment is set to 50 MB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-maxcontentsizeperpageinmegabytes)
       */
      override fun maxContentSizePerPageInMegaBytes(): Number? =
          unwrap(this).getMaxContentSizePerPageInMegaBytes()

      /**
       * The maximum number of URLs on a web page to include when crawling a website.
       *
       * This number is per web page.
       *
       * As a website’s web pages are crawled, any URLs the web pages link to are also crawled. URLs
       * on a web page are crawled in order of appearance.
       *
       * The default maximum links per page is 100.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-maxlinksperpage)
       */
      override fun maxLinksPerPage(): Number? = unwrap(this).getMaxLinksPerPage()

      /**
       * The maximum number of URLs crawled per website host per minute.
       *
       * A minimum of one URL is required.
       *
       * The default maximum number of URLs crawled per website host per minute is 300.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-maxurlsperminutecrawlrate)
       */
      override fun maxUrlsPerMinuteCrawlRate(): Number? =
          unwrap(this).getMaxUrlsPerMinuteCrawlRate()

      /**
       * Configuration information required to connect to your internal websites via a web proxy.
       *
       * You must provide the website host name and port number. For example, the host name of
       * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for
       * HTTPS.
       *
       * Web proxy credentials are optional and you can use them to connect to a web proxy server
       * that requires basic authentication. To store web proxy credentials, you use a secret in [AWS
       * Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-proxyconfiguration)
       */
      override fun proxyConfiguration(): Any? = unwrap(this).getProxyConfiguration()

      /**
       * A list of regular expression patterns to exclude certain URLs to crawl.
       *
       * URLs that match the patterns are excluded from the index. URLs that don't match the
       * patterns are included in the index. If a URL matches both an inclusion and exclusion pattern,
       * the exclusion pattern takes precedence and the URL file isn't included in the index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-urlexclusionpatterns)
       */
      override fun urlExclusionPatterns(): List<String> = unwrap(this).getUrlExclusionPatterns() ?:
          emptyList()

      /**
       * A list of regular expression patterns to include certain URLs to crawl.
       *
       * URLs that match the patterns are included in the index. URLs that don't match the patterns
       * are excluded from the index. If a URL matches both an inclusion and exclusion pattern, the
       * exclusion pattern takes precedence and the URL file isn't included in the index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-urlinclusionpatterns)
       */
      override fun urlInclusionPatterns(): List<String> = unwrap(this).getUrlInclusionPatterns() ?:
          emptyList()

      /**
       * Specifies the seed or starting point URLs of the websites or the sitemap URLs of the
       * websites you want to crawl.
       *
       * You can include website subdomains. You can list up to 100 seed URLs and up to three
       * sitemap URLs.
       *
       * You can only crawl websites that use the secure communication protocol, Hypertext Transfer
       * Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the
       * website is blocked from crawling.
       *
       * *When selecting websites to index, you must adhere to the [Amazon Acceptable Use
       * Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms. Remember that you must
       * only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have
       * authorization to index.*
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html#cfn-kendra-datasource-webcrawlerconfiguration-urls)
       */
      override fun urls(): Any = unwrap(this).getUrls()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WebCrawlerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty):
          WebCrawlerConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebCrawlerConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty
    }
  }

  /**
   * The condition used for the target document attribute or metadata field when ingesting documents
   * into Amazon Kendra.
   *
   * You use this with [DocumentAttributeTarget to apply the
   * condition](https://docs.aws.amazon.com/kendra/latest/dg/API_DocumentAttributeTarget.html) .
   *
   * For example, you can create the 'Department' target field and have it prefill department names
   * associated with the documents based on information in the 'Source_URI' field. Set the condition
   * that if the 'Source_URI' field contains 'financial' in its URI value, then prefill the target
   * field 'Department' with the target value 'Finance' for the document.
   *
   * Amazon Kendra cannot create a target field if it has not already been created as an index
   * field. After you create your index field, you can create a document metadata field using
   * `DocumentAttributeTarget` . Amazon Kendra then will map your newly created metadata field to your
   * index field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface DocumentAttributeConditionProperty {
    /**
     * The identifier of the document attribute used for the condition.
     *
     * For example, 'Source_URI' could be an identifier for the attribute or metadata field that
     * contains source URIs associated with the documents.
     *
     * Amazon Kendra currently does not support `_document_body` as an attribute key used for the
     * condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributecondition.html#cfn-kendra-datasource-documentattributecondition-conditiondocumentattributekey)
     */
    public fun conditionDocumentAttributeKey(): String

    /**
     * The value used by the operator.
     *
     * For example, you can specify the value 'financial' for strings in the 'Source_URI' field that
     * partially match or contain this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributecondition.html#cfn-kendra-datasource-documentattributecondition-conditiononvalue)
     */
    public fun conditionOnValue(): Any? = unwrap(this).getConditionOnValue()

    /**
     * The condition operator.
     *
     * For example, you can use 'Contains' to partially match a string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributecondition.html#cfn-kendra-datasource-documentattributecondition-operator)
     */
    public fun `operator`(): String

    /**
     * A builder for [DocumentAttributeConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditionDocumentAttributeKey The identifier of the document attribute used for the
       * condition. 
       * For example, 'Source_URI' could be an identifier for the attribute or metadata field that
       * contains source URIs associated with the documents.
       *
       * Amazon Kendra currently does not support `_document_body` as an attribute key used for the
       * condition.
       */
      public fun conditionDocumentAttributeKey(conditionDocumentAttributeKey: String)

      /**
       * @param conditionOnValue The value used by the operator.
       * For example, you can specify the value 'financial' for strings in the 'Source_URI' field
       * that partially match or contain this value.
       */
      public fun conditionOnValue(conditionOnValue: IResolvable)

      /**
       * @param conditionOnValue The value used by the operator.
       * For example, you can specify the value 'financial' for strings in the 'Source_URI' field
       * that partially match or contain this value.
       */
      public fun conditionOnValue(conditionOnValue: DocumentAttributeValueProperty)

      /**
       * @param conditionOnValue The value used by the operator.
       * For example, you can specify the value 'financial' for strings in the 'Source_URI' field
       * that partially match or contain this value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("285b669c46af63d22de26994b154bd53be93f4c75d0166c78845717e213f8bad")
      public
          fun conditionOnValue(conditionOnValue: DocumentAttributeValueProperty.Builder.() -> Unit)

      /**
       * @param operator The condition operator. 
       * For example, you can use 'Contains' to partially match a string.
       */
      public fun `operator`(`operator`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeConditionProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeConditionProperty.builder()

      /**
       * @param conditionDocumentAttributeKey The identifier of the document attribute used for the
       * condition. 
       * For example, 'Source_URI' could be an identifier for the attribute or metadata field that
       * contains source URIs associated with the documents.
       *
       * Amazon Kendra currently does not support `_document_body` as an attribute key used for the
       * condition.
       */
      override fun conditionDocumentAttributeKey(conditionDocumentAttributeKey: String) {
        cdkBuilder.conditionDocumentAttributeKey(conditionDocumentAttributeKey)
      }

      /**
       * @param conditionOnValue The value used by the operator.
       * For example, you can specify the value 'financial' for strings in the 'Source_URI' field
       * that partially match or contain this value.
       */
      override fun conditionOnValue(conditionOnValue: IResolvable) {
        cdkBuilder.conditionOnValue(conditionOnValue.let(IResolvable::unwrap))
      }

      /**
       * @param conditionOnValue The value used by the operator.
       * For example, you can specify the value 'financial' for strings in the 'Source_URI' field
       * that partially match or contain this value.
       */
      override fun conditionOnValue(conditionOnValue: DocumentAttributeValueProperty) {
        cdkBuilder.conditionOnValue(conditionOnValue.let(DocumentAttributeValueProperty::unwrap))
      }

      /**
       * @param conditionOnValue The value used by the operator.
       * For example, you can specify the value 'financial' for strings in the 'Source_URI' field
       * that partially match or contain this value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("285b669c46af63d22de26994b154bd53be93f4c75d0166c78845717e213f8bad")
      override
          fun conditionOnValue(conditionOnValue: DocumentAttributeValueProperty.Builder.() -> Unit):
          Unit = conditionOnValue(DocumentAttributeValueProperty(conditionOnValue))

      /**
       * @param operator The condition operator. 
       * For example, you can use 'Contains' to partially match a string.
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeConditionProperty,
    ) : CdkObject(cdkObject), DocumentAttributeConditionProperty {
      /**
       * The identifier of the document attribute used for the condition.
       *
       * For example, 'Source_URI' could be an identifier for the attribute or metadata field that
       * contains source URIs associated with the documents.
       *
       * Amazon Kendra currently does not support `_document_body` as an attribute key used for the
       * condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributecondition.html#cfn-kendra-datasource-documentattributecondition-conditiondocumentattributekey)
       */
      override fun conditionDocumentAttributeKey(): String =
          unwrap(this).getConditionDocumentAttributeKey()

      /**
       * The value used by the operator.
       *
       * For example, you can specify the value 'financial' for strings in the 'Source_URI' field
       * that partially match or contain this value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributecondition.html#cfn-kendra-datasource-documentattributecondition-conditiononvalue)
       */
      override fun conditionOnValue(): Any? = unwrap(this).getConditionOnValue()

      /**
       * The condition operator.
       *
       * For example, you can use 'Contains' to partially match a string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributecondition.html#cfn-kendra-datasource-documentattributecondition-operator)
       */
      override fun `operator`(): String = unwrap(this).getOperator()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentAttributeConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeConditionProperty):
          DocumentAttributeConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentAttributeConditionProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeConditionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeConditionProperty
    }
  }

  /**
   * Configuration of the page settings for the Confluence data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface ConfluencePageConfigurationProperty {
    /**
     * Maps attributes or field names of Confluence pages to Amazon Kendra index field names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
     * more information, see [Mapping data source
     * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
     * source field names must exist in your Confluence custom metadata.
     *
     * If you specify the `PageFieldMappings` parameter, you must specify at least one field
     * mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencepageconfiguration.html#cfn-kendra-datasource-confluencepageconfiguration-pagefieldmappings)
     */
    public fun pageFieldMappings(): Any? = unwrap(this).getPageFieldMappings()

    /**
     * A builder for [ConfluencePageConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pageFieldMappings Maps attributes or field names of Confluence pages to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `PageFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      public fun pageFieldMappings(pageFieldMappings: IResolvable)

      /**
       * @param pageFieldMappings Maps attributes or field names of Confluence pages to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `PageFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      public fun pageFieldMappings(pageFieldMappings: List<Any>)

      /**
       * @param pageFieldMappings Maps attributes or field names of Confluence pages to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `PageFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      public fun pageFieldMappings(vararg pageFieldMappings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty.builder()

      /**
       * @param pageFieldMappings Maps attributes or field names of Confluence pages to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `PageFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      override fun pageFieldMappings(pageFieldMappings: IResolvable) {
        cdkBuilder.pageFieldMappings(pageFieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param pageFieldMappings Maps attributes or field names of Confluence pages to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `PageFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      override fun pageFieldMappings(pageFieldMappings: List<Any>) {
        cdkBuilder.pageFieldMappings(pageFieldMappings)
      }

      /**
       * @param pageFieldMappings Maps attributes or field names of Confluence pages to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `PageFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      override fun pageFieldMappings(vararg pageFieldMappings: Any): Unit =
          pageFieldMappings(pageFieldMappings.toList())

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty,
    ) : CdkObject(cdkObject), ConfluencePageConfigurationProperty {
      /**
       * Maps attributes or field names of Confluence pages to Amazon Kendra index field names.
       *
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `PageFieldMappings` parameter, you must specify at least one field
       * mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencepageconfiguration.html#cfn-kendra-datasource-confluencepageconfiguration-pagefieldmappings)
       */
      override fun pageFieldMappings(): Any? = unwrap(this).getPageFieldMappings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluencePageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty):
          ConfluencePageConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluencePageConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty
    }
  }

  /**
   * Configuration information for indexing Confluence spaces.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface ConfluenceSpaceConfigurationProperty {
    /**
     * `TRUE` to index archived spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespaceconfiguration.html#cfn-kendra-datasource-confluencespaceconfiguration-crawlarchivedspaces)
     */
    public fun crawlArchivedSpaces(): Any? = unwrap(this).getCrawlArchivedSpaces()

    /**
     * `TRUE` to index personal spaces.
     *
     * You can add restrictions to items in personal spaces. If personal spaces are indexed, queries
     * without user context information may return restricted items from a personal space in their
     * results. For more information, see [Filtering on user
     * context](https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespaceconfiguration.html#cfn-kendra-datasource-confluencespaceconfiguration-crawlpersonalspaces)
     */
    public fun crawlPersonalSpaces(): Any? = unwrap(this).getCrawlPersonalSpaces()

    /**
     * A list of space keys of Confluence spaces.
     *
     * If you include a key, the blogs, documents, and attachments in the space are not indexed. If
     * a space is in both the `ExcludeSpaces` and the `IncludeSpaces` list, the space is excluded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespaceconfiguration.html#cfn-kendra-datasource-confluencespaceconfiguration-excludespaces)
     */
    public fun excludeSpaces(): List<String> = unwrap(this).getExcludeSpaces() ?: emptyList()

    /**
     * A list of space keys for Confluence spaces.
     *
     * If you include a key, the blogs, documents, and attachments in the space are indexed. Spaces
     * that aren't in the list aren't indexed. A space in the list must exist. Otherwise, Amazon Kendra
     * logs an error when the data source is synchronized. If a space is in both the `IncludeSpaces`
     * and the `ExcludeSpaces` list, the space is excluded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespaceconfiguration.html#cfn-kendra-datasource-confluencespaceconfiguration-includespaces)
     */
    public fun includeSpaces(): List<String> = unwrap(this).getIncludeSpaces() ?: emptyList()

    /**
     * Maps attributes or field names of Confluence spaces to Amazon Kendra index field names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
     * more information, see [Mapping data source
     * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
     * source field names must exist in your Confluence custom metadata.
     *
     * If you specify the `SpaceFieldMappings` parameter, you must specify at least one field
     * mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespaceconfiguration.html#cfn-kendra-datasource-confluencespaceconfiguration-spacefieldmappings)
     */
    public fun spaceFieldMappings(): Any? = unwrap(this).getSpaceFieldMappings()

    /**
     * A builder for [ConfluenceSpaceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crawlArchivedSpaces `TRUE` to index archived spaces.
       */
      public fun crawlArchivedSpaces(crawlArchivedSpaces: Boolean)

      /**
       * @param crawlArchivedSpaces `TRUE` to index archived spaces.
       */
      public fun crawlArchivedSpaces(crawlArchivedSpaces: IResolvable)

      /**
       * @param crawlPersonalSpaces `TRUE` to index personal spaces.
       * You can add restrictions to items in personal spaces. If personal spaces are indexed,
       * queries without user context information may return restricted items from a personal space in
       * their results. For more information, see [Filtering on user
       * context](https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html) .
       */
      public fun crawlPersonalSpaces(crawlPersonalSpaces: Boolean)

      /**
       * @param crawlPersonalSpaces `TRUE` to index personal spaces.
       * You can add restrictions to items in personal spaces. If personal spaces are indexed,
       * queries without user context information may return restricted items from a personal space in
       * their results. For more information, see [Filtering on user
       * context](https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html) .
       */
      public fun crawlPersonalSpaces(crawlPersonalSpaces: IResolvable)

      /**
       * @param excludeSpaces A list of space keys of Confluence spaces.
       * If you include a key, the blogs, documents, and attachments in the space are not indexed.
       * If a space is in both the `ExcludeSpaces` and the `IncludeSpaces` list, the space is excluded.
       */
      public fun excludeSpaces(excludeSpaces: List<String>)

      /**
       * @param excludeSpaces A list of space keys of Confluence spaces.
       * If you include a key, the blogs, documents, and attachments in the space are not indexed.
       * If a space is in both the `ExcludeSpaces` and the `IncludeSpaces` list, the space is excluded.
       */
      public fun excludeSpaces(vararg excludeSpaces: String)

      /**
       * @param includeSpaces A list of space keys for Confluence spaces.
       * If you include a key, the blogs, documents, and attachments in the space are indexed.
       * Spaces that aren't in the list aren't indexed. A space in the list must exist. Otherwise,
       * Amazon Kendra logs an error when the data source is synchronized. If a space is in both the
       * `IncludeSpaces` and the `ExcludeSpaces` list, the space is excluded.
       */
      public fun includeSpaces(includeSpaces: List<String>)

      /**
       * @param includeSpaces A list of space keys for Confluence spaces.
       * If you include a key, the blogs, documents, and attachments in the space are indexed.
       * Spaces that aren't in the list aren't indexed. A space in the list must exist. Otherwise,
       * Amazon Kendra logs an error when the data source is synchronized. If a space is in both the
       * `IncludeSpaces` and the `ExcludeSpaces` list, the space is excluded.
       */
      public fun includeSpaces(vararg includeSpaces: String)

      /**
       * @param spaceFieldMappings Maps attributes or field names of Confluence spaces to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `SpaceFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      public fun spaceFieldMappings(spaceFieldMappings: IResolvable)

      /**
       * @param spaceFieldMappings Maps attributes or field names of Confluence spaces to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `SpaceFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      public fun spaceFieldMappings(spaceFieldMappings: List<Any>)

      /**
       * @param spaceFieldMappings Maps attributes or field names of Confluence spaces to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `SpaceFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      public fun spaceFieldMappings(vararg spaceFieldMappings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty.builder()

      /**
       * @param crawlArchivedSpaces `TRUE` to index archived spaces.
       */
      override fun crawlArchivedSpaces(crawlArchivedSpaces: Boolean) {
        cdkBuilder.crawlArchivedSpaces(crawlArchivedSpaces)
      }

      /**
       * @param crawlArchivedSpaces `TRUE` to index archived spaces.
       */
      override fun crawlArchivedSpaces(crawlArchivedSpaces: IResolvable) {
        cdkBuilder.crawlArchivedSpaces(crawlArchivedSpaces.let(IResolvable::unwrap))
      }

      /**
       * @param crawlPersonalSpaces `TRUE` to index personal spaces.
       * You can add restrictions to items in personal spaces. If personal spaces are indexed,
       * queries without user context information may return restricted items from a personal space in
       * their results. For more information, see [Filtering on user
       * context](https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html) .
       */
      override fun crawlPersonalSpaces(crawlPersonalSpaces: Boolean) {
        cdkBuilder.crawlPersonalSpaces(crawlPersonalSpaces)
      }

      /**
       * @param crawlPersonalSpaces `TRUE` to index personal spaces.
       * You can add restrictions to items in personal spaces. If personal spaces are indexed,
       * queries without user context information may return restricted items from a personal space in
       * their results. For more information, see [Filtering on user
       * context](https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html) .
       */
      override fun crawlPersonalSpaces(crawlPersonalSpaces: IResolvable) {
        cdkBuilder.crawlPersonalSpaces(crawlPersonalSpaces.let(IResolvable::unwrap))
      }

      /**
       * @param excludeSpaces A list of space keys of Confluence spaces.
       * If you include a key, the blogs, documents, and attachments in the space are not indexed.
       * If a space is in both the `ExcludeSpaces` and the `IncludeSpaces` list, the space is excluded.
       */
      override fun excludeSpaces(excludeSpaces: List<String>) {
        cdkBuilder.excludeSpaces(excludeSpaces)
      }

      /**
       * @param excludeSpaces A list of space keys of Confluence spaces.
       * If you include a key, the blogs, documents, and attachments in the space are not indexed.
       * If a space is in both the `ExcludeSpaces` and the `IncludeSpaces` list, the space is excluded.
       */
      override fun excludeSpaces(vararg excludeSpaces: String): Unit =
          excludeSpaces(excludeSpaces.toList())

      /**
       * @param includeSpaces A list of space keys for Confluence spaces.
       * If you include a key, the blogs, documents, and attachments in the space are indexed.
       * Spaces that aren't in the list aren't indexed. A space in the list must exist. Otherwise,
       * Amazon Kendra logs an error when the data source is synchronized. If a space is in both the
       * `IncludeSpaces` and the `ExcludeSpaces` list, the space is excluded.
       */
      override fun includeSpaces(includeSpaces: List<String>) {
        cdkBuilder.includeSpaces(includeSpaces)
      }

      /**
       * @param includeSpaces A list of space keys for Confluence spaces.
       * If you include a key, the blogs, documents, and attachments in the space are indexed.
       * Spaces that aren't in the list aren't indexed. A space in the list must exist. Otherwise,
       * Amazon Kendra logs an error when the data source is synchronized. If a space is in both the
       * `IncludeSpaces` and the `ExcludeSpaces` list, the space is excluded.
       */
      override fun includeSpaces(vararg includeSpaces: String): Unit =
          includeSpaces(includeSpaces.toList())

      /**
       * @param spaceFieldMappings Maps attributes or field names of Confluence spaces to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `SpaceFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      override fun spaceFieldMappings(spaceFieldMappings: IResolvable) {
        cdkBuilder.spaceFieldMappings(spaceFieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param spaceFieldMappings Maps attributes or field names of Confluence spaces to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `SpaceFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      override fun spaceFieldMappings(spaceFieldMappings: List<Any>) {
        cdkBuilder.spaceFieldMappings(spaceFieldMappings)
      }

      /**
       * @param spaceFieldMappings Maps attributes or field names of Confluence spaces to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `SpaceFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      override fun spaceFieldMappings(vararg spaceFieldMappings: Any): Unit =
          spaceFieldMappings(spaceFieldMappings.toList())

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty,
    ) : CdkObject(cdkObject), ConfluenceSpaceConfigurationProperty {
      /**
       * `TRUE` to index archived spaces.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespaceconfiguration.html#cfn-kendra-datasource-confluencespaceconfiguration-crawlarchivedspaces)
       */
      override fun crawlArchivedSpaces(): Any? = unwrap(this).getCrawlArchivedSpaces()

      /**
       * `TRUE` to index personal spaces.
       *
       * You can add restrictions to items in personal spaces. If personal spaces are indexed,
       * queries without user context information may return restricted items from a personal space in
       * their results. For more information, see [Filtering on user
       * context](https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespaceconfiguration.html#cfn-kendra-datasource-confluencespaceconfiguration-crawlpersonalspaces)
       */
      override fun crawlPersonalSpaces(): Any? = unwrap(this).getCrawlPersonalSpaces()

      /**
       * A list of space keys of Confluence spaces.
       *
       * If you include a key, the blogs, documents, and attachments in the space are not indexed.
       * If a space is in both the `ExcludeSpaces` and the `IncludeSpaces` list, the space is excluded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespaceconfiguration.html#cfn-kendra-datasource-confluencespaceconfiguration-excludespaces)
       */
      override fun excludeSpaces(): List<String> = unwrap(this).getExcludeSpaces() ?: emptyList()

      /**
       * A list of space keys for Confluence spaces.
       *
       * If you include a key, the blogs, documents, and attachments in the space are indexed.
       * Spaces that aren't in the list aren't indexed. A space in the list must exist. Otherwise,
       * Amazon Kendra logs an error when the data source is synchronized. If a space is in both the
       * `IncludeSpaces` and the `ExcludeSpaces` list, the space is excluded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespaceconfiguration.html#cfn-kendra-datasource-confluencespaceconfiguration-includespaces)
       */
      override fun includeSpaces(): List<String> = unwrap(this).getIncludeSpaces() ?: emptyList()

      /**
       * Maps attributes or field names of Confluence spaces to Amazon Kendra index field names.
       *
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `SpaceFieldMappings` parameter, you must specify at least one field
       * mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespaceconfiguration.html#cfn-kendra-datasource-confluencespaceconfiguration-spacefieldmappings)
       */
      override fun spaceFieldMappings(): Any? = unwrap(this).getSpaceFieldMappings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluenceSpaceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty):
          ConfluenceSpaceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceSpaceConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty
    }
  }

  /**
   * Provides the configuration information to connect to ServiceNow as your data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface ServiceNowConfigurationProperty {
    /**
     * The type of authentication used to connect to the ServiceNow instance.
     *
     * If you choose `HTTP_BASIC` , Amazon Kendra is authenticated using the user name and password
     * provided in the AWS Secrets Manager secret in the `SecretArn` field. If you choose `OAUTH2` ,
     * Amazon Kendra is authenticated using the credentials of client ID, client secret, user name and
     * password.
     *
     * When you use `OAUTH2` authentication, you must generate a token and a client secret using the
     * ServiceNow console. For more information, see [Using a ServiceNow data
     * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowconfiguration.html#cfn-kendra-datasource-servicenowconfiguration-authenticationtype)
     */
    public fun authenticationType(): String? = unwrap(this).getAuthenticationType()

    /**
     * The ServiceNow instance that the data source connects to.
     *
     * The host endpoint should look like the following: *{instance}.service-now.com.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowconfiguration.html#cfn-kendra-datasource-servicenowconfiguration-hosturl)
     */
    public fun hostUrl(): String

    /**
     * Configuration information for crawling knowledge articles in the ServiceNow site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowconfiguration.html#cfn-kendra-datasource-servicenowconfiguration-knowledgearticleconfiguration)
     */
    public fun knowledgeArticleConfiguration(): Any? =
        unwrap(this).getKnowledgeArticleConfiguration()

    /**
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the user name
     * and password required to connect to the ServiceNow instance.
     *
     * You can also provide OAuth authentication credentials of user name, password, client ID, and
     * client secret. For more information, see [Using a ServiceNow data
     * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowconfiguration.html#cfn-kendra-datasource-servicenowconfiguration-secretarn)
     */
    public fun secretArn(): String

    /**
     * Configuration information for crawling service catalogs in the ServiceNow site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowconfiguration.html#cfn-kendra-datasource-servicenowconfiguration-servicecatalogconfiguration)
     */
    public fun serviceCatalogConfiguration(): Any? = unwrap(this).getServiceCatalogConfiguration()

    /**
     * The identifier of the release that the ServiceNow host is running.
     *
     * If the host is not running the `LONDON` release, use `OTHERS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowconfiguration.html#cfn-kendra-datasource-servicenowconfiguration-servicenowbuildversion)
     */
    public fun serviceNowBuildVersion(): String

    /**
     * A builder for [ServiceNowConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authenticationType The type of authentication used to connect to the ServiceNow
       * instance.
       * If you choose `HTTP_BASIC` , Amazon Kendra is authenticated using the user name and
       * password provided in the AWS Secrets Manager secret in the `SecretArn` field. If you choose
       * `OAUTH2` , Amazon Kendra is authenticated using the credentials of client ID, client secret,
       * user name and password.
       *
       * When you use `OAUTH2` authentication, you must generate a token and a client secret using
       * the ServiceNow console. For more information, see [Using a ServiceNow data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html) .
       */
      public fun authenticationType(authenticationType: String)

      /**
       * @param hostUrl The ServiceNow instance that the data source connects to. 
       * The host endpoint should look like the following: *{instance}.service-now.com.*
       */
      public fun hostUrl(hostUrl: String)

      /**
       * @param knowledgeArticleConfiguration Configuration information for crawling knowledge
       * articles in the ServiceNow site.
       */
      public fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: IResolvable)

      /**
       * @param knowledgeArticleConfiguration Configuration information for crawling knowledge
       * articles in the ServiceNow site.
       */
      public
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: ServiceNowKnowledgeArticleConfigurationProperty)

      /**
       * @param knowledgeArticleConfiguration Configuration information for crawling knowledge
       * articles in the ServiceNow site.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7dff183ee3b02978e1302255425930d8fea7d80745b0c3f3c3b26f43dd458b7f")
      public
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: ServiceNowKnowledgeArticleConfigurationProperty.Builder.() -> Unit)

      /**
       * @param secretArn The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that
       * contains the user name and password required to connect to the ServiceNow instance. 
       * You can also provide OAuth authentication credentials of user name, password, client ID,
       * and client secret. For more information, see [Using a ServiceNow data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html) .
       */
      public fun secretArn(secretArn: String)

      /**
       * @param serviceCatalogConfiguration Configuration information for crawling service catalogs
       * in the ServiceNow site.
       */
      public fun serviceCatalogConfiguration(serviceCatalogConfiguration: IResolvable)

      /**
       * @param serviceCatalogConfiguration Configuration information for crawling service catalogs
       * in the ServiceNow site.
       */
      public
          fun serviceCatalogConfiguration(serviceCatalogConfiguration: ServiceNowServiceCatalogConfigurationProperty)

      /**
       * @param serviceCatalogConfiguration Configuration information for crawling service catalogs
       * in the ServiceNow site.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2279aa4b9e87d489a0b396992572b5ff2ec71a23436393be77757e9500ca350f")
      public
          fun serviceCatalogConfiguration(serviceCatalogConfiguration: ServiceNowServiceCatalogConfigurationProperty.Builder.() -> Unit)

      /**
       * @param serviceNowBuildVersion The identifier of the release that the ServiceNow host is
       * running. 
       * If the host is not running the `LONDON` release, use `OTHERS` .
       */
      public fun serviceNowBuildVersion(serviceNowBuildVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty.builder()

      /**
       * @param authenticationType The type of authentication used to connect to the ServiceNow
       * instance.
       * If you choose `HTTP_BASIC` , Amazon Kendra is authenticated using the user name and
       * password provided in the AWS Secrets Manager secret in the `SecretArn` field. If you choose
       * `OAUTH2` , Amazon Kendra is authenticated using the credentials of client ID, client secret,
       * user name and password.
       *
       * When you use `OAUTH2` authentication, you must generate a token and a client secret using
       * the ServiceNow console. For more information, see [Using a ServiceNow data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html) .
       */
      override fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
      }

      /**
       * @param hostUrl The ServiceNow instance that the data source connects to. 
       * The host endpoint should look like the following: *{instance}.service-now.com.*
       */
      override fun hostUrl(hostUrl: String) {
        cdkBuilder.hostUrl(hostUrl)
      }

      /**
       * @param knowledgeArticleConfiguration Configuration information for crawling knowledge
       * articles in the ServiceNow site.
       */
      override fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: IResolvable) {
        cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param knowledgeArticleConfiguration Configuration information for crawling knowledge
       * articles in the ServiceNow site.
       */
      override
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: ServiceNowKnowledgeArticleConfigurationProperty) {
        cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration.let(ServiceNowKnowledgeArticleConfigurationProperty::unwrap))
      }

      /**
       * @param knowledgeArticleConfiguration Configuration information for crawling knowledge
       * articles in the ServiceNow site.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7dff183ee3b02978e1302255425930d8fea7d80745b0c3f3c3b26f43dd458b7f")
      override
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: ServiceNowKnowledgeArticleConfigurationProperty.Builder.() -> Unit):
          Unit =
          knowledgeArticleConfiguration(ServiceNowKnowledgeArticleConfigurationProperty(knowledgeArticleConfiguration))

      /**
       * @param secretArn The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that
       * contains the user name and password required to connect to the ServiceNow instance. 
       * You can also provide OAuth authentication credentials of user name, password, client ID,
       * and client secret. For more information, see [Using a ServiceNow data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html) .
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      /**
       * @param serviceCatalogConfiguration Configuration information for crawling service catalogs
       * in the ServiceNow site.
       */
      override fun serviceCatalogConfiguration(serviceCatalogConfiguration: IResolvable) {
        cdkBuilder.serviceCatalogConfiguration(serviceCatalogConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param serviceCatalogConfiguration Configuration information for crawling service catalogs
       * in the ServiceNow site.
       */
      override
          fun serviceCatalogConfiguration(serviceCatalogConfiguration: ServiceNowServiceCatalogConfigurationProperty) {
        cdkBuilder.serviceCatalogConfiguration(serviceCatalogConfiguration.let(ServiceNowServiceCatalogConfigurationProperty::unwrap))
      }

      /**
       * @param serviceCatalogConfiguration Configuration information for crawling service catalogs
       * in the ServiceNow site.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2279aa4b9e87d489a0b396992572b5ff2ec71a23436393be77757e9500ca350f")
      override
          fun serviceCatalogConfiguration(serviceCatalogConfiguration: ServiceNowServiceCatalogConfigurationProperty.Builder.() -> Unit):
          Unit =
          serviceCatalogConfiguration(ServiceNowServiceCatalogConfigurationProperty(serviceCatalogConfiguration))

      /**
       * @param serviceNowBuildVersion The identifier of the release that the ServiceNow host is
       * running. 
       * If the host is not running the `LONDON` release, use `OTHERS` .
       */
      override fun serviceNowBuildVersion(serviceNowBuildVersion: String) {
        cdkBuilder.serviceNowBuildVersion(serviceNowBuildVersion)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty,
    ) : CdkObject(cdkObject), ServiceNowConfigurationProperty {
      /**
       * The type of authentication used to connect to the ServiceNow instance.
       *
       * If you choose `HTTP_BASIC` , Amazon Kendra is authenticated using the user name and
       * password provided in the AWS Secrets Manager secret in the `SecretArn` field. If you choose
       * `OAUTH2` , Amazon Kendra is authenticated using the credentials of client ID, client secret,
       * user name and password.
       *
       * When you use `OAUTH2` authentication, you must generate a token and a client secret using
       * the ServiceNow console. For more information, see [Using a ServiceNow data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowconfiguration.html#cfn-kendra-datasource-servicenowconfiguration-authenticationtype)
       */
      override fun authenticationType(): String? = unwrap(this).getAuthenticationType()

      /**
       * The ServiceNow instance that the data source connects to.
       *
       * The host endpoint should look like the following: *{instance}.service-now.com.*
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowconfiguration.html#cfn-kendra-datasource-servicenowconfiguration-hosturl)
       */
      override fun hostUrl(): String = unwrap(this).getHostUrl()

      /**
       * Configuration information for crawling knowledge articles in the ServiceNow site.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowconfiguration.html#cfn-kendra-datasource-servicenowconfiguration-knowledgearticleconfiguration)
       */
      override fun knowledgeArticleConfiguration(): Any? =
          unwrap(this).getKnowledgeArticleConfiguration()

      /**
       * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the user
       * name and password required to connect to the ServiceNow instance.
       *
       * You can also provide OAuth authentication credentials of user name, password, client ID,
       * and client secret. For more information, see [Using a ServiceNow data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-servicenow.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowconfiguration.html#cfn-kendra-datasource-servicenowconfiguration-secretarn)
       */
      override fun secretArn(): String = unwrap(this).getSecretArn()

      /**
       * Configuration information for crawling service catalogs in the ServiceNow site.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowconfiguration.html#cfn-kendra-datasource-servicenowconfiguration-servicecatalogconfiguration)
       */
      override fun serviceCatalogConfiguration(): Any? =
          unwrap(this).getServiceCatalogConfiguration()

      /**
       * The identifier of the release that the ServiceNow host is running.
       *
       * If the host is not running the `LONDON` release, use `OTHERS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowconfiguration.html#cfn-kendra-datasource-servicenowconfiguration-servicenowbuildversion)
       */
      override fun serviceNowBuildVersion(): String = unwrap(this).getServiceNowBuildVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServiceNowConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty):
          ServiceNowConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceNowConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty
    }
  }

  /**
   * Provides the configuration information to connect to websites that require user authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface WebCrawlerAuthenticationConfigurationProperty {
    /**
     * The list of configuration information that's required to connect to and crawl a website host
     * using basic authentication credentials.
     *
     * The list includes the name and port number of the website host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerauthenticationconfiguration.html#cfn-kendra-datasource-webcrawlerauthenticationconfiguration-basicauthentication)
     */
    public fun basicAuthentication(): Any? = unwrap(this).getBasicAuthentication()

    /**
     * A builder for [WebCrawlerAuthenticationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param basicAuthentication The list of configuration information that's required to connect
       * to and crawl a website host using basic authentication credentials.
       * The list includes the name and port number of the website host.
       */
      public fun basicAuthentication(basicAuthentication: IResolvable)

      /**
       * @param basicAuthentication The list of configuration information that's required to connect
       * to and crawl a website host using basic authentication credentials.
       * The list includes the name and port number of the website host.
       */
      public fun basicAuthentication(basicAuthentication: List<Any>)

      /**
       * @param basicAuthentication The list of configuration information that's required to connect
       * to and crawl a website host using basic authentication credentials.
       * The list includes the name and port number of the website host.
       */
      public fun basicAuthentication(vararg basicAuthentication: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty.builder()

      /**
       * @param basicAuthentication The list of configuration information that's required to connect
       * to and crawl a website host using basic authentication credentials.
       * The list includes the name and port number of the website host.
       */
      override fun basicAuthentication(basicAuthentication: IResolvable) {
        cdkBuilder.basicAuthentication(basicAuthentication.let(IResolvable::unwrap))
      }

      /**
       * @param basicAuthentication The list of configuration information that's required to connect
       * to and crawl a website host using basic authentication credentials.
       * The list includes the name and port number of the website host.
       */
      override fun basicAuthentication(basicAuthentication: List<Any>) {
        cdkBuilder.basicAuthentication(basicAuthentication)
      }

      /**
       * @param basicAuthentication The list of configuration information that's required to connect
       * to and crawl a website host using basic authentication credentials.
       * The list includes the name and port number of the website host.
       */
      override fun basicAuthentication(vararg basicAuthentication: Any): Unit =
          basicAuthentication(basicAuthentication.toList())

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty,
    ) : CdkObject(cdkObject), WebCrawlerAuthenticationConfigurationProperty {
      /**
       * The list of configuration information that's required to connect to and crawl a website
       * host using basic authentication credentials.
       *
       * The list includes the name and port number of the website host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerauthenticationconfiguration.html#cfn-kendra-datasource-webcrawlerauthenticationconfiguration-basicauthentication)
       */
      override fun basicAuthentication(): Any? = unwrap(this).getBasicAuthentication()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          WebCrawlerAuthenticationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty):
          WebCrawlerAuthenticationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebCrawlerAuthenticationConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty
    }
  }

  /**
   * The target document attribute or metadata field you want to alter when ingesting documents into
   * Amazon Kendra.
   *
   * For example, you can delete customer identification numbers associated with the documents,
   * stored in the document metadata field called 'Customer_ID'. You set the target key as
   * 'Customer_ID' and the deletion flag to `TRUE` . This removes all customer ID values in the field
   * 'Customer_ID'. This would scrub personally identifiable information from each document's metadata.
   *
   * Amazon Kendra cannot create a target field if it has not already been created as an index
   * field. After you create your index field, you can create a document metadata field using
   * `DocumentAttributeTarget` . Amazon Kendra then will map your newly created metadata field to your
   * index field.
   *
   * You can also use this with
   * [DocumentAttributeCondition](https://docs.aws.amazon.com/kendra/latest/dg/API_DocumentAttributeCondition.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface DocumentAttributeTargetProperty {
    /**
     * The identifier of the target document attribute or metadata field.
     *
     * For example, 'Department' could be an identifier for the target attribute or metadata field
     * that includes the department names associated with the documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributetarget.html#cfn-kendra-datasource-documentattributetarget-targetdocumentattributekey)
     */
    public fun targetDocumentAttributeKey(): String

    /**
     * The target value you want to create for the target attribute.
     *
     * For example, 'Finance' could be the target value for the target attribute key 'Department'.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributetarget.html#cfn-kendra-datasource-documentattributetarget-targetdocumentattributevalue)
     */
    public fun targetDocumentAttributeValue(): Any? = unwrap(this).getTargetDocumentAttributeValue()

    /**
     * `TRUE` to delete the existing target value for your specified target attribute key.
     *
     * You cannot create a target value and set this to `TRUE` . To create a target value (
     * `TargetDocumentAttributeValue` ), set this to `FALSE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributetarget.html#cfn-kendra-datasource-documentattributetarget-targetdocumentattributevaluedeletion)
     */
    public fun targetDocumentAttributeValueDeletion(): Any? =
        unwrap(this).getTargetDocumentAttributeValueDeletion()

    /**
     * A builder for [DocumentAttributeTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetDocumentAttributeKey The identifier of the target document attribute or
       * metadata field. 
       * For example, 'Department' could be an identifier for the target attribute or metadata field
       * that includes the department names associated with the documents.
       */
      public fun targetDocumentAttributeKey(targetDocumentAttributeKey: String)

      /**
       * @param targetDocumentAttributeValue The target value you want to create for the target
       * attribute.
       * For example, 'Finance' could be the target value for the target attribute key 'Department'.
       */
      public fun targetDocumentAttributeValue(targetDocumentAttributeValue: IResolvable)

      /**
       * @param targetDocumentAttributeValue The target value you want to create for the target
       * attribute.
       * For example, 'Finance' could be the target value for the target attribute key 'Department'.
       */
      public
          fun targetDocumentAttributeValue(targetDocumentAttributeValue: DocumentAttributeValueProperty)

      /**
       * @param targetDocumentAttributeValue The target value you want to create for the target
       * attribute.
       * For example, 'Finance' could be the target value for the target attribute key 'Department'.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("774f20a498c29bf09d11321926ba0c355f86d6248d70891bb628bc865d6fb5d2")
      public
          fun targetDocumentAttributeValue(targetDocumentAttributeValue: DocumentAttributeValueProperty.Builder.() -> Unit)

      /**
       * @param targetDocumentAttributeValueDeletion `TRUE` to delete the existing target value for
       * your specified target attribute key.
       * You cannot create a target value and set this to `TRUE` . To create a target value (
       * `TargetDocumentAttributeValue` ), set this to `FALSE` .
       */
      public fun targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion: Boolean)

      /**
       * @param targetDocumentAttributeValueDeletion `TRUE` to delete the existing target value for
       * your specified target attribute key.
       * You cannot create a target value and set this to `TRUE` . To create a target value (
       * `TargetDocumentAttributeValue` ), set this to `FALSE` .
       */
      public
          fun targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeTargetProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeTargetProperty.builder()

      /**
       * @param targetDocumentAttributeKey The identifier of the target document attribute or
       * metadata field. 
       * For example, 'Department' could be an identifier for the target attribute or metadata field
       * that includes the department names associated with the documents.
       */
      override fun targetDocumentAttributeKey(targetDocumentAttributeKey: String) {
        cdkBuilder.targetDocumentAttributeKey(targetDocumentAttributeKey)
      }

      /**
       * @param targetDocumentAttributeValue The target value you want to create for the target
       * attribute.
       * For example, 'Finance' could be the target value for the target attribute key 'Department'.
       */
      override fun targetDocumentAttributeValue(targetDocumentAttributeValue: IResolvable) {
        cdkBuilder.targetDocumentAttributeValue(targetDocumentAttributeValue.let(IResolvable::unwrap))
      }

      /**
       * @param targetDocumentAttributeValue The target value you want to create for the target
       * attribute.
       * For example, 'Finance' could be the target value for the target attribute key 'Department'.
       */
      override
          fun targetDocumentAttributeValue(targetDocumentAttributeValue: DocumentAttributeValueProperty) {
        cdkBuilder.targetDocumentAttributeValue(targetDocumentAttributeValue.let(DocumentAttributeValueProperty::unwrap))
      }

      /**
       * @param targetDocumentAttributeValue The target value you want to create for the target
       * attribute.
       * For example, 'Finance' could be the target value for the target attribute key 'Department'.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("774f20a498c29bf09d11321926ba0c355f86d6248d70891bb628bc865d6fb5d2")
      override
          fun targetDocumentAttributeValue(targetDocumentAttributeValue: DocumentAttributeValueProperty.Builder.() -> Unit):
          Unit =
          targetDocumentAttributeValue(DocumentAttributeValueProperty(targetDocumentAttributeValue))

      /**
       * @param targetDocumentAttributeValueDeletion `TRUE` to delete the existing target value for
       * your specified target attribute key.
       * You cannot create a target value and set this to `TRUE` . To create a target value (
       * `TargetDocumentAttributeValue` ), set this to `FALSE` .
       */
      override
          fun targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion: Boolean) {
        cdkBuilder.targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion)
      }

      /**
       * @param targetDocumentAttributeValueDeletion `TRUE` to delete the existing target value for
       * your specified target attribute key.
       * You cannot create a target value and set this to `TRUE` . To create a target value (
       * `TargetDocumentAttributeValue` ), set this to `FALSE` .
       */
      override
          fun targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion: IResolvable) {
        cdkBuilder.targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeTargetProperty,
    ) : CdkObject(cdkObject), DocumentAttributeTargetProperty {
      /**
       * The identifier of the target document attribute or metadata field.
       *
       * For example, 'Department' could be an identifier for the target attribute or metadata field
       * that includes the department names associated with the documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributetarget.html#cfn-kendra-datasource-documentattributetarget-targetdocumentattributekey)
       */
      override fun targetDocumentAttributeKey(): String =
          unwrap(this).getTargetDocumentAttributeKey()

      /**
       * The target value you want to create for the target attribute.
       *
       * For example, 'Finance' could be the target value for the target attribute key 'Department'.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributetarget.html#cfn-kendra-datasource-documentattributetarget-targetdocumentattributevalue)
       */
      override fun targetDocumentAttributeValue(): Any? =
          unwrap(this).getTargetDocumentAttributeValue()

      /**
       * `TRUE` to delete the existing target value for your specified target attribute key.
       *
       * You cannot create a target value and set this to `TRUE` . To create a target value (
       * `TargetDocumentAttributeValue` ), set this to `FALSE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributetarget.html#cfn-kendra-datasource-documentattributetarget-targetdocumentattributevaluedeletion)
       */
      override fun targetDocumentAttributeValueDeletion(): Any? =
          unwrap(this).getTargetDocumentAttributeValueDeletion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentAttributeTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeTargetProperty):
          DocumentAttributeTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentAttributeTargetProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeTargetProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeTargetProperty
    }
  }

  /**
   * Provides the configuration information for the knowledge article types that Amazon Kendra
   * indexes.
   *
   * Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge
   * articles, or the custom fields of custom knowledge articles, but not both
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface SalesforceKnowledgeArticleConfigurationProperty {
    /**
     * Configuration information for custom Salesforce knowledge articles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceknowledgearticleconfiguration.html#cfn-kendra-datasource-salesforceknowledgearticleconfiguration-customknowledgearticletypeconfigurations)
     */
    public fun customKnowledgeArticleTypeConfigurations(): Any? =
        unwrap(this).getCustomKnowledgeArticleTypeConfigurations()

    /**
     * Specifies the document states that should be included when Amazon Kendra indexes knowledge
     * articles.
     *
     * You must specify at least one state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceknowledgearticleconfiguration.html#cfn-kendra-datasource-salesforceknowledgearticleconfiguration-includedstates)
     */
    public fun includedStates(): List<String>

    /**
     * Configuration information for standard Salesforce knowledge articles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceknowledgearticleconfiguration.html#cfn-kendra-datasource-salesforceknowledgearticleconfiguration-standardknowledgearticletypeconfiguration)
     */
    public fun standardKnowledgeArticleTypeConfiguration(): Any? =
        unwrap(this).getStandardKnowledgeArticleTypeConfiguration()

    /**
     * A builder for [SalesforceKnowledgeArticleConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customKnowledgeArticleTypeConfigurations Configuration information for custom
       * Salesforce knowledge articles.
       */
      public
          fun customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations: IResolvable)

      /**
       * @param customKnowledgeArticleTypeConfigurations Configuration information for custom
       * Salesforce knowledge articles.
       */
      public
          fun customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations: List<Any>)

      /**
       * @param customKnowledgeArticleTypeConfigurations Configuration information for custom
       * Salesforce knowledge articles.
       */
      public fun customKnowledgeArticleTypeConfigurations(vararg
          customKnowledgeArticleTypeConfigurations: Any)

      /**
       * @param includedStates Specifies the document states that should be included when Amazon
       * Kendra indexes knowledge articles. 
       * You must specify at least one state.
       */
      public fun includedStates(includedStates: List<String>)

      /**
       * @param includedStates Specifies the document states that should be included when Amazon
       * Kendra indexes knowledge articles. 
       * You must specify at least one state.
       */
      public fun includedStates(vararg includedStates: String)

      /**
       * @param standardKnowledgeArticleTypeConfiguration Configuration information for standard
       * Salesforce knowledge articles.
       */
      public
          fun standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration: IResolvable)

      /**
       * @param standardKnowledgeArticleTypeConfiguration Configuration information for standard
       * Salesforce knowledge articles.
       */
      public
          fun standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration: SalesforceStandardKnowledgeArticleTypeConfigurationProperty)

      /**
       * @param standardKnowledgeArticleTypeConfiguration Configuration information for standard
       * Salesforce knowledge articles.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46ca786b35ab5c6f82a4b8e6b9acd488d12446293d97a931e164dbb8f825d79c")
      public
          fun standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration: SalesforceStandardKnowledgeArticleTypeConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty.builder()

      /**
       * @param customKnowledgeArticleTypeConfigurations Configuration information for custom
       * Salesforce knowledge articles.
       */
      override
          fun customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations: IResolvable) {
        cdkBuilder.customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param customKnowledgeArticleTypeConfigurations Configuration information for custom
       * Salesforce knowledge articles.
       */
      override
          fun customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations: List<Any>) {
        cdkBuilder.customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations)
      }

      /**
       * @param customKnowledgeArticleTypeConfigurations Configuration information for custom
       * Salesforce knowledge articles.
       */
      override fun customKnowledgeArticleTypeConfigurations(vararg
          customKnowledgeArticleTypeConfigurations: Any): Unit =
          customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations.toList())

      /**
       * @param includedStates Specifies the document states that should be included when Amazon
       * Kendra indexes knowledge articles. 
       * You must specify at least one state.
       */
      override fun includedStates(includedStates: List<String>) {
        cdkBuilder.includedStates(includedStates)
      }

      /**
       * @param includedStates Specifies the document states that should be included when Amazon
       * Kendra indexes knowledge articles. 
       * You must specify at least one state.
       */
      override fun includedStates(vararg includedStates: String): Unit =
          includedStates(includedStates.toList())

      /**
       * @param standardKnowledgeArticleTypeConfiguration Configuration information for standard
       * Salesforce knowledge articles.
       */
      override
          fun standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration: IResolvable) {
        cdkBuilder.standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param standardKnowledgeArticleTypeConfiguration Configuration information for standard
       * Salesforce knowledge articles.
       */
      override
          fun standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration: SalesforceStandardKnowledgeArticleTypeConfigurationProperty) {
        cdkBuilder.standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration.let(SalesforceStandardKnowledgeArticleTypeConfigurationProperty::unwrap))
      }

      /**
       * @param standardKnowledgeArticleTypeConfiguration Configuration information for standard
       * Salesforce knowledge articles.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46ca786b35ab5c6f82a4b8e6b9acd488d12446293d97a931e164dbb8f825d79c")
      override
          fun standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration: SalesforceStandardKnowledgeArticleTypeConfigurationProperty.Builder.() -> Unit):
          Unit =
          standardKnowledgeArticleTypeConfiguration(SalesforceStandardKnowledgeArticleTypeConfigurationProperty(standardKnowledgeArticleTypeConfiguration))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty,
    ) : CdkObject(cdkObject), SalesforceKnowledgeArticleConfigurationProperty {
      /**
       * Configuration information for custom Salesforce knowledge articles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceknowledgearticleconfiguration.html#cfn-kendra-datasource-salesforceknowledgearticleconfiguration-customknowledgearticletypeconfigurations)
       */
      override fun customKnowledgeArticleTypeConfigurations(): Any? =
          unwrap(this).getCustomKnowledgeArticleTypeConfigurations()

      /**
       * Specifies the document states that should be included when Amazon Kendra indexes knowledge
       * articles.
       *
       * You must specify at least one state.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceknowledgearticleconfiguration.html#cfn-kendra-datasource-salesforceknowledgearticleconfiguration-includedstates)
       */
      override fun includedStates(): List<String> = unwrap(this).getIncludedStates()

      /**
       * Configuration information for standard Salesforce knowledge articles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceknowledgearticleconfiguration.html#cfn-kendra-datasource-salesforceknowledgearticleconfiguration-standardknowledgearticletypeconfiguration)
       */
      override fun standardKnowledgeArticleTypeConfiguration(): Any? =
          unwrap(this).getStandardKnowledgeArticleTypeConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceKnowledgeArticleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty):
          SalesforceKnowledgeArticleConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceKnowledgeArticleConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
   * TemplateConfigurationProperty templateConfigurationProperty =
   * TemplateConfigurationProperty.builder()
   * .template("template")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-templateconfiguration.html)
   */
  public interface TemplateConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-templateconfiguration.html#cfn-kendra-datasource-templateconfiguration-template)
     */
    public fun template(): String

    /**
     * A builder for [TemplateConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param template the value to be set. 
       */
      public fun template(template: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.TemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.TemplateConfigurationProperty.builder()

      /**
       * @param template the value to be set. 
       */
      override fun template(template: String) {
        cdkBuilder.template(template)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.TemplateConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.TemplateConfigurationProperty,
    ) : CdkObject(cdkObject), TemplateConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-templateconfiguration.html#cfn-kendra-datasource-templateconfiguration-template)
       */
      override fun template(): String = unwrap(this).getTemplate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.TemplateConfigurationProperty):
          TemplateConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.TemplateConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.TemplateConfigurationProperty
    }
  }

  /**
   * Provides the configuration information for invoking a Lambda function in AWS Lambda to alter
   * document metadata and content when ingesting documents into Amazon Kendra.
   *
   * You can configure your Lambda function using
   * [PreExtractionHookConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_CustomDocumentEnrichmentConfiguration.html)
   * if you want to apply advanced alterations on the original or raw documents. If you want to apply
   * advanced alterations on the Amazon Kendra structured documents, you must configure your Lambda
   * function using
   * [PostExtractionHookConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_CustomDocumentEnrichmentConfiguration.html)
   * . You can only invoke one Lambda function. However, this function can invoke other functions it
   * requires.
   *
   * For more information, see [Customizing document metadata during the ingestion
   * process](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface HookConfigurationProperty {
    /**
     * The condition used for when a Lambda function should be invoked.
     *
     * For example, you can specify a condition that if there are empty date-time values, then
     * Amazon Kendra should invoke a function that inserts the current date-time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-hookconfiguration.html#cfn-kendra-datasource-hookconfiguration-invocationcondition)
     */
    public fun invocationCondition(): Any? = unwrap(this).getInvocationCondition()

    /**
     * The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during
     * ingestion.
     *
     * For more information, see [IAM roles for Amazon
     * Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-hookconfiguration.html#cfn-kendra-datasource-hookconfiguration-lambdaarn)
     */
    public fun lambdaArn(): String

    /**
     * Stores the original, raw documents or the structured, parsed documents before and after
     * altering them.
     *
     * For more information, see [Data contracts for Lambda
     * functions](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#cde-data-contracts-lambda)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-hookconfiguration.html#cfn-kendra-datasource-hookconfiguration-s3bucket)
     */
    public fun s3Bucket(): String

    /**
     * A builder for [HookConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param invocationCondition The condition used for when a Lambda function should be invoked.
       * For example, you can specify a condition that if there are empty date-time values, then
       * Amazon Kendra should invoke a function that inserts the current date-time.
       */
      public fun invocationCondition(invocationCondition: IResolvable)

      /**
       * @param invocationCondition The condition used for when a Lambda function should be invoked.
       * For example, you can specify a condition that if there are empty date-time values, then
       * Amazon Kendra should invoke a function that inserts the current date-time.
       */
      public fun invocationCondition(invocationCondition: DocumentAttributeConditionProperty)

      /**
       * @param invocationCondition The condition used for when a Lambda function should be invoked.
       * For example, you can specify a condition that if there are empty date-time values, then
       * Amazon Kendra should invoke a function that inserts the current date-time.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82d73a148b5aa5a0fd24a5f19521070ac2298b04b99e5383a60507c731d552fa")
      public
          fun invocationCondition(invocationCondition: DocumentAttributeConditionProperty.Builder.() -> Unit)

      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of a role with permission to run a Lambda
       * function during ingestion. 
       * For more information, see [IAM roles for Amazon
       * Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html) .
       */
      public fun lambdaArn(lambdaArn: String)

      /**
       * @param s3Bucket Stores the original, raw documents or the structured, parsed documents
       * before and after altering them. 
       * For more information, see [Data contracts for Lambda
       * functions](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#cde-data-contracts-lambda)
       * .
       */
      public fun s3Bucket(s3Bucket: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.HookConfigurationProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.HookConfigurationProperty.builder()

      /**
       * @param invocationCondition The condition used for when a Lambda function should be invoked.
       * For example, you can specify a condition that if there are empty date-time values, then
       * Amazon Kendra should invoke a function that inserts the current date-time.
       */
      override fun invocationCondition(invocationCondition: IResolvable) {
        cdkBuilder.invocationCondition(invocationCondition.let(IResolvable::unwrap))
      }

      /**
       * @param invocationCondition The condition used for when a Lambda function should be invoked.
       * For example, you can specify a condition that if there are empty date-time values, then
       * Amazon Kendra should invoke a function that inserts the current date-time.
       */
      override fun invocationCondition(invocationCondition: DocumentAttributeConditionProperty) {
        cdkBuilder.invocationCondition(invocationCondition.let(DocumentAttributeConditionProperty::unwrap))
      }

      /**
       * @param invocationCondition The condition used for when a Lambda function should be invoked.
       * For example, you can specify a condition that if there are empty date-time values, then
       * Amazon Kendra should invoke a function that inserts the current date-time.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82d73a148b5aa5a0fd24a5f19521070ac2298b04b99e5383a60507c731d552fa")
      override
          fun invocationCondition(invocationCondition: DocumentAttributeConditionProperty.Builder.() -> Unit):
          Unit = invocationCondition(DocumentAttributeConditionProperty(invocationCondition))

      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of a role with permission to run a Lambda
       * function during ingestion. 
       * For more information, see [IAM roles for Amazon
       * Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html) .
       */
      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      /**
       * @param s3Bucket Stores the original, raw documents or the structured, parsed documents
       * before and after altering them. 
       * For more information, see [Data contracts for Lambda
       * functions](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#cde-data-contracts-lambda)
       * .
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.HookConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.HookConfigurationProperty,
    ) : CdkObject(cdkObject), HookConfigurationProperty {
      /**
       * The condition used for when a Lambda function should be invoked.
       *
       * For example, you can specify a condition that if there are empty date-time values, then
       * Amazon Kendra should invoke a function that inserts the current date-time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-hookconfiguration.html#cfn-kendra-datasource-hookconfiguration-invocationcondition)
       */
      override fun invocationCondition(): Any? = unwrap(this).getInvocationCondition()

      /**
       * The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during
       * ingestion.
       *
       * For more information, see [IAM roles for Amazon
       * Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-hookconfiguration.html#cfn-kendra-datasource-hookconfiguration-lambdaarn)
       */
      override fun lambdaArn(): String = unwrap(this).getLambdaArn()

      /**
       * Stores the original, raw documents or the structured, parsed documents before and after
       * altering them.
       *
       * For more information, see [Data contracts for Lambda
       * functions](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#cde-data-contracts-lambda)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-hookconfiguration.html#cfn-kendra-datasource-hookconfiguration-s3bucket)
       */
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HookConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.HookConfigurationProperty):
          HookConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HookConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.HookConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.HookConfigurationProperty
    }
  }

  /**
   * Provides the configuration information for indexing Salesforce custom articles.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface SalesforceCustomKnowledgeArticleTypeConfigurationProperty {
    /**
     * The name of the field in the custom knowledge article that contains the document data to
     * index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration.html#cfn-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration-documentdatafieldname)
     */
    public fun documentDataFieldName(): String

    /**
     * The name of the field in the custom knowledge article that contains the document title.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration.html#cfn-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration-documenttitlefieldname)
     */
    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    /**
     * Maps attributes or field names of the custom knowledge article to Amazon Kendra index field
     * names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
     * more information, see [Mapping data source
     * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
     * source field names must exist in your Salesforce custom metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration.html#cfn-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration-fieldmappings)
     */
    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration.html#cfn-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration-name)
     */
    public fun name(): String

    /**
     * A builder for [SalesforceCustomKnowledgeArticleTypeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param documentDataFieldName The name of the field in the custom knowledge article that
       * contains the document data to index. 
       */
      public fun documentDataFieldName(documentDataFieldName: String)

      /**
       * @param documentTitleFieldName The name of the field in the custom knowledge article that
       * contains the document title.
       */
      public fun documentTitleFieldName(documentTitleFieldName: String)

      /**
       * @param fieldMappings Maps attributes or field names of the custom knowledge article to
       * Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      public fun fieldMappings(fieldMappings: IResolvable)

      /**
       * @param fieldMappings Maps attributes or field names of the custom knowledge article to
       * Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      public fun fieldMappings(fieldMappings: List<Any>)

      /**
       * @param fieldMappings Maps attributes or field names of the custom knowledge article to
       * Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      public fun fieldMappings(vararg fieldMappings: Any)

      /**
       * @param name The name of the configuration. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty.builder()

      /**
       * @param documentDataFieldName The name of the field in the custom knowledge article that
       * contains the document data to index. 
       */
      override fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
      }

      /**
       * @param documentTitleFieldName The name of the field in the custom knowledge article that
       * contains the document title.
       */
      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      /**
       * @param fieldMappings Maps attributes or field names of the custom knowledge article to
       * Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param fieldMappings Maps attributes or field names of the custom knowledge article to
       * Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      /**
       * @param fieldMappings Maps attributes or field names of the custom knowledge article to
       * Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      override fun fieldMappings(vararg fieldMappings: Any): Unit =
          fieldMappings(fieldMappings.toList())

      /**
       * @param name The name of the configuration. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty,
    ) : CdkObject(cdkObject), SalesforceCustomKnowledgeArticleTypeConfigurationProperty {
      /**
       * The name of the field in the custom knowledge article that contains the document data to
       * index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration.html#cfn-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration-documentdatafieldname)
       */
      override fun documentDataFieldName(): String = unwrap(this).getDocumentDataFieldName()

      /**
       * The name of the field in the custom knowledge article that contains the document title.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration.html#cfn-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration-documenttitlefieldname)
       */
      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      /**
       * Maps attributes or field names of the custom knowledge article to Amazon Kendra index field
       * names.
       *
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration.html#cfn-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration-fieldmappings)
       */
      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      /**
       * The name of the configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration.html#cfn-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceCustomKnowledgeArticleTypeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty):
          SalesforceCustomKnowledgeArticleTypeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceCustomKnowledgeArticleTypeConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty
    }
  }

  /**
   * Provides the configuration information to connect to Confluence as your data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface ConfluenceConfigurationProperty {
    /**
     * Configuration information for indexing attachments to Confluence blogs and pages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-attachmentconfiguration)
     */
    public fun attachmentConfiguration(): Any? = unwrap(this).getAttachmentConfiguration()

    /**
     * Configuration information for indexing Confluence blogs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-blogconfiguration)
     */
    public fun blogConfiguration(): Any? = unwrap(this).getBlogConfiguration()

    /**
     * A list of regular expression patterns to exclude certain blog posts, pages, spaces, or
     * attachments in your Confluence.
     *
     * Content that matches the patterns are excluded from the index. Content that doesn't match the
     * patterns is included in the index. If content matches both an inclusion and exclusion pattern,
     * the exclusion pattern takes precedence and the content isn't included in the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-exclusionpatterns)
     */
    public fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
        emptyList()

    /**
     * A list of regular expression patterns to include certain blog posts, pages, spaces, or
     * attachments in your Confluence.
     *
     * Content that matches the patterns are included in the index. Content that doesn't match the
     * patterns is excluded from the index. If content matches both an inclusion and exclusion pattern,
     * the exclusion pattern takes precedence and the content isn't included in the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-inclusionpatterns)
     */
    public fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
        emptyList()

    /**
     * Configuration information for indexing Confluence pages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-pageconfiguration)
     */
    public fun pageConfiguration(): Any? = unwrap(this).getPageConfiguration()

    /**
     * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that contains the user name
     * and password required to connect to the Confluence instance.
     *
     * If you use Confluence Cloud, you use a generated API token as the password.
     *
     * You can also provide authentication credentials in the form of a personal access token. For
     * more information, see [Using a Confluence data
     * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-confluence.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-secretarn)
     */
    public fun secretArn(): String

    /**
     * The URL of your Confluence instance.
     *
     * Use the full URL of the server. For example, *https://server.example.com:port/ * . You can
     * also use an IP address, for example, *https://192.168.1.113/ * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-serverurl)
     */
    public fun serverUrl(): String

    /**
     * Configuration information for indexing Confluence spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-spaceconfiguration)
     */
    public fun spaceConfiguration(): Any? = unwrap(this).getSpaceConfiguration()

    /**
     * The version or the type of Confluence installation to connect to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-version)
     */
    public fun version(): String

    /**
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Confluence.
     *
     * For more information, see [Configuring a
     * VPC](https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-vpcconfiguration)
     */
    public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

    /**
     * A builder for [ConfluenceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attachmentConfiguration Configuration information for indexing attachments to
       * Confluence blogs and pages.
       */
      public fun attachmentConfiguration(attachmentConfiguration: IResolvable)

      /**
       * @param attachmentConfiguration Configuration information for indexing attachments to
       * Confluence blogs and pages.
       */
      public
          fun attachmentConfiguration(attachmentConfiguration: ConfluenceAttachmentConfigurationProperty)

      /**
       * @param attachmentConfiguration Configuration information for indexing attachments to
       * Confluence blogs and pages.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a93229e94c0a713647b91082f0d2734f6345754816985c19812aa93675a8ca4d")
      public
          fun attachmentConfiguration(attachmentConfiguration: ConfluenceAttachmentConfigurationProperty.Builder.() -> Unit)

      /**
       * @param blogConfiguration Configuration information for indexing Confluence blogs.
       */
      public fun blogConfiguration(blogConfiguration: IResolvable)

      /**
       * @param blogConfiguration Configuration information for indexing Confluence blogs.
       */
      public fun blogConfiguration(blogConfiguration: ConfluenceBlogConfigurationProperty)

      /**
       * @param blogConfiguration Configuration information for indexing Confluence blogs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("070d46cbf6cbda26dc2a798fafa2a64869e56ed765b1f8a3f39062df940a515e")
      public
          fun blogConfiguration(blogConfiguration: ConfluenceBlogConfigurationProperty.Builder.() -> Unit)

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain blog
       * posts, pages, spaces, or attachments in your Confluence.
       * Content that matches the patterns are excluded from the index. Content that doesn't match
       * the patterns is included in the index. If content matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the content isn't included in the index.
       */
      public fun exclusionPatterns(exclusionPatterns: List<String>)

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain blog
       * posts, pages, spaces, or attachments in your Confluence.
       * Content that matches the patterns are excluded from the index. Content that doesn't match
       * the patterns is included in the index. If content matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the content isn't included in the index.
       */
      public fun exclusionPatterns(vararg exclusionPatterns: String)

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain blog
       * posts, pages, spaces, or attachments in your Confluence.
       * Content that matches the patterns are included in the index. Content that doesn't match the
       * patterns is excluded from the index. If content matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the content isn't included in the index.
       */
      public fun inclusionPatterns(inclusionPatterns: List<String>)

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain blog
       * posts, pages, spaces, or attachments in your Confluence.
       * Content that matches the patterns are included in the index. Content that doesn't match the
       * patterns is excluded from the index. If content matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the content isn't included in the index.
       */
      public fun inclusionPatterns(vararg inclusionPatterns: String)

      /**
       * @param pageConfiguration Configuration information for indexing Confluence pages.
       */
      public fun pageConfiguration(pageConfiguration: IResolvable)

      /**
       * @param pageConfiguration Configuration information for indexing Confluence pages.
       */
      public fun pageConfiguration(pageConfiguration: ConfluencePageConfigurationProperty)

      /**
       * @param pageConfiguration Configuration information for indexing Confluence pages.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2817f144d572ac768d2a7fb4d11a22d4469a4dded7d9df3a788c1de0ec26a80f")
      public
          fun pageConfiguration(pageConfiguration: ConfluencePageConfigurationProperty.Builder.() -> Unit)

      /**
       * @param secretArn The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
       * contains the user name and password required to connect to the Confluence instance. 
       * If you use Confluence Cloud, you use a generated API token as the password.
       *
       * You can also provide authentication credentials in the form of a personal access token. For
       * more information, see [Using a Confluence data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-confluence.html) .
       */
      public fun secretArn(secretArn: String)

      /**
       * @param serverUrl The URL of your Confluence instance. 
       * Use the full URL of the server. For example, *https://server.example.com:port/ * . You can
       * also use an IP address, for example, *https://192.168.1.113/ * .
       */
      public fun serverUrl(serverUrl: String)

      /**
       * @param spaceConfiguration Configuration information for indexing Confluence spaces.
       */
      public fun spaceConfiguration(spaceConfiguration: IResolvable)

      /**
       * @param spaceConfiguration Configuration information for indexing Confluence spaces.
       */
      public fun spaceConfiguration(spaceConfiguration: ConfluenceSpaceConfigurationProperty)

      /**
       * @param spaceConfiguration Configuration information for indexing Confluence spaces.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49ba2bbc317db4f0cde9cb944797b99a0adcfebdaa1d5d8ec4748dca0830b906")
      public
          fun spaceConfiguration(spaceConfiguration: ConfluenceSpaceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param version The version or the type of Confluence installation to connect to. 
       */
      public fun version(version: String)

      /**
       * @param vpcConfiguration Configuration information for an Amazon Virtual Private Cloud to
       * connect to your Confluence.
       * For more information, see [Configuring a
       * VPC](https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html) .
       */
      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      /**
       * @param vpcConfiguration Configuration information for an Amazon Virtual Private Cloud to
       * connect to your Confluence.
       * For more information, see [Configuring a
       * VPC](https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html) .
       */
      public fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty)

      /**
       * @param vpcConfiguration Configuration information for an Amazon Virtual Private Cloud to
       * connect to your Confluence.
       * For more information, see [Configuring a
       * VPC](https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e3a149baf8e9e42acaf53635797748128816d30d56df2db6343cc8981ce503b")
      public
          fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty.builder()

      /**
       * @param attachmentConfiguration Configuration information for indexing attachments to
       * Confluence blogs and pages.
       */
      override fun attachmentConfiguration(attachmentConfiguration: IResolvable) {
        cdkBuilder.attachmentConfiguration(attachmentConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param attachmentConfiguration Configuration information for indexing attachments to
       * Confluence blogs and pages.
       */
      override
          fun attachmentConfiguration(attachmentConfiguration: ConfluenceAttachmentConfigurationProperty) {
        cdkBuilder.attachmentConfiguration(attachmentConfiguration.let(ConfluenceAttachmentConfigurationProperty::unwrap))
      }

      /**
       * @param attachmentConfiguration Configuration information for indexing attachments to
       * Confluence blogs and pages.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a93229e94c0a713647b91082f0d2734f6345754816985c19812aa93675a8ca4d")
      override
          fun attachmentConfiguration(attachmentConfiguration: ConfluenceAttachmentConfigurationProperty.Builder.() -> Unit):
          Unit =
          attachmentConfiguration(ConfluenceAttachmentConfigurationProperty(attachmentConfiguration))

      /**
       * @param blogConfiguration Configuration information for indexing Confluence blogs.
       */
      override fun blogConfiguration(blogConfiguration: IResolvable) {
        cdkBuilder.blogConfiguration(blogConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param blogConfiguration Configuration information for indexing Confluence blogs.
       */
      override fun blogConfiguration(blogConfiguration: ConfluenceBlogConfigurationProperty) {
        cdkBuilder.blogConfiguration(blogConfiguration.let(ConfluenceBlogConfigurationProperty::unwrap))
      }

      /**
       * @param blogConfiguration Configuration information for indexing Confluence blogs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("070d46cbf6cbda26dc2a798fafa2a64869e56ed765b1f8a3f39062df940a515e")
      override
          fun blogConfiguration(blogConfiguration: ConfluenceBlogConfigurationProperty.Builder.() -> Unit):
          Unit = blogConfiguration(ConfluenceBlogConfigurationProperty(blogConfiguration))

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain blog
       * posts, pages, spaces, or attachments in your Confluence.
       * Content that matches the patterns are excluded from the index. Content that doesn't match
       * the patterns is included in the index. If content matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the content isn't included in the index.
       */
      override fun exclusionPatterns(exclusionPatterns: List<String>) {
        cdkBuilder.exclusionPatterns(exclusionPatterns)
      }

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain blog
       * posts, pages, spaces, or attachments in your Confluence.
       * Content that matches the patterns are excluded from the index. Content that doesn't match
       * the patterns is included in the index. If content matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the content isn't included in the index.
       */
      override fun exclusionPatterns(vararg exclusionPatterns: String): Unit =
          exclusionPatterns(exclusionPatterns.toList())

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain blog
       * posts, pages, spaces, or attachments in your Confluence.
       * Content that matches the patterns are included in the index. Content that doesn't match the
       * patterns is excluded from the index. If content matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the content isn't included in the index.
       */
      override fun inclusionPatterns(inclusionPatterns: List<String>) {
        cdkBuilder.inclusionPatterns(inclusionPatterns)
      }

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain blog
       * posts, pages, spaces, or attachments in your Confluence.
       * Content that matches the patterns are included in the index. Content that doesn't match the
       * patterns is excluded from the index. If content matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the content isn't included in the index.
       */
      override fun inclusionPatterns(vararg inclusionPatterns: String): Unit =
          inclusionPatterns(inclusionPatterns.toList())

      /**
       * @param pageConfiguration Configuration information for indexing Confluence pages.
       */
      override fun pageConfiguration(pageConfiguration: IResolvable) {
        cdkBuilder.pageConfiguration(pageConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param pageConfiguration Configuration information for indexing Confluence pages.
       */
      override fun pageConfiguration(pageConfiguration: ConfluencePageConfigurationProperty) {
        cdkBuilder.pageConfiguration(pageConfiguration.let(ConfluencePageConfigurationProperty::unwrap))
      }

      /**
       * @param pageConfiguration Configuration information for indexing Confluence pages.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2817f144d572ac768d2a7fb4d11a22d4469a4dded7d9df3a788c1de0ec26a80f")
      override
          fun pageConfiguration(pageConfiguration: ConfluencePageConfigurationProperty.Builder.() -> Unit):
          Unit = pageConfiguration(ConfluencePageConfigurationProperty(pageConfiguration))

      /**
       * @param secretArn The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
       * contains the user name and password required to connect to the Confluence instance. 
       * If you use Confluence Cloud, you use a generated API token as the password.
       *
       * You can also provide authentication credentials in the form of a personal access token. For
       * more information, see [Using a Confluence data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-confluence.html) .
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      /**
       * @param serverUrl The URL of your Confluence instance. 
       * Use the full URL of the server. For example, *https://server.example.com:port/ * . You can
       * also use an IP address, for example, *https://192.168.1.113/ * .
       */
      override fun serverUrl(serverUrl: String) {
        cdkBuilder.serverUrl(serverUrl)
      }

      /**
       * @param spaceConfiguration Configuration information for indexing Confluence spaces.
       */
      override fun spaceConfiguration(spaceConfiguration: IResolvable) {
        cdkBuilder.spaceConfiguration(spaceConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param spaceConfiguration Configuration information for indexing Confluence spaces.
       */
      override fun spaceConfiguration(spaceConfiguration: ConfluenceSpaceConfigurationProperty) {
        cdkBuilder.spaceConfiguration(spaceConfiguration.let(ConfluenceSpaceConfigurationProperty::unwrap))
      }

      /**
       * @param spaceConfiguration Configuration information for indexing Confluence spaces.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49ba2bbc317db4f0cde9cb944797b99a0adcfebdaa1d5d8ec4748dca0830b906")
      override
          fun spaceConfiguration(spaceConfiguration: ConfluenceSpaceConfigurationProperty.Builder.() -> Unit):
          Unit = spaceConfiguration(ConfluenceSpaceConfigurationProperty(spaceConfiguration))

      /**
       * @param version The version or the type of Confluence installation to connect to. 
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      /**
       * @param vpcConfiguration Configuration information for an Amazon Virtual Private Cloud to
       * connect to your Confluence.
       * For more information, see [Configuring a
       * VPC](https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html) .
       */
      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConfiguration Configuration information for an Amazon Virtual Private Cloud to
       * connect to your Confluence.
       * For more information, see [Configuring a
       * VPC](https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html) .
       */
      override fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(DataSourceVpcConfigurationProperty::unwrap))
      }

      /**
       * @param vpcConfiguration Configuration information for an Amazon Virtual Private Cloud to
       * connect to your Confluence.
       * For more information, see [Configuring a
       * VPC](https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e3a149baf8e9e42acaf53635797748128816d30d56df2db6343cc8981ce503b")
      override
          fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(DataSourceVpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty,
    ) : CdkObject(cdkObject), ConfluenceConfigurationProperty {
      /**
       * Configuration information for indexing attachments to Confluence blogs and pages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-attachmentconfiguration)
       */
      override fun attachmentConfiguration(): Any? = unwrap(this).getAttachmentConfiguration()

      /**
       * Configuration information for indexing Confluence blogs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-blogconfiguration)
       */
      override fun blogConfiguration(): Any? = unwrap(this).getBlogConfiguration()

      /**
       * A list of regular expression patterns to exclude certain blog posts, pages, spaces, or
       * attachments in your Confluence.
       *
       * Content that matches the patterns are excluded from the index. Content that doesn't match
       * the patterns is included in the index. If content matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the content isn't included in the index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-exclusionpatterns)
       */
      override fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
          emptyList()

      /**
       * A list of regular expression patterns to include certain blog posts, pages, spaces, or
       * attachments in your Confluence.
       *
       * Content that matches the patterns are included in the index. Content that doesn't match the
       * patterns is excluded from the index. If content matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the content isn't included in the index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-inclusionpatterns)
       */
      override fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
          emptyList()

      /**
       * Configuration information for indexing Confluence pages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-pageconfiguration)
       */
      override fun pageConfiguration(): Any? = unwrap(this).getPageConfiguration()

      /**
       * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that contains the user name
       * and password required to connect to the Confluence instance.
       *
       * If you use Confluence Cloud, you use a generated API token as the password.
       *
       * You can also provide authentication credentials in the form of a personal access token. For
       * more information, see [Using a Confluence data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-confluence.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-secretarn)
       */
      override fun secretArn(): String = unwrap(this).getSecretArn()

      /**
       * The URL of your Confluence instance.
       *
       * Use the full URL of the server. For example, *https://server.example.com:port/ * . You can
       * also use an IP address, for example, *https://192.168.1.113/ * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-serverurl)
       */
      override fun serverUrl(): String = unwrap(this).getServerUrl()

      /**
       * Configuration information for indexing Confluence spaces.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-spaceconfiguration)
       */
      override fun spaceConfiguration(): Any? = unwrap(this).getSpaceConfiguration()

      /**
       * The version or the type of Confluence installation to connect to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-version)
       */
      override fun version(): String = unwrap(this).getVersion()

      /**
       * Configuration information for an Amazon Virtual Private Cloud to connect to your
       * Confluence.
       *
       * For more information, see [Configuring a
       * VPC](https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html#cfn-kendra-datasource-confluenceconfiguration-vpcconfiguration)
       */
      override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfluenceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty):
          ConfluenceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty
    }
  }

  /**
   * Provides the configuration information for standard Salesforce knowledge articles.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface SalesforceStandardKnowledgeArticleTypeConfigurationProperty {
    /**
     * The name of the field that contains the document data to index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardknowledgearticletypeconfiguration.html#cfn-kendra-datasource-salesforcestandardknowledgearticletypeconfiguration-documentdatafieldname)
     */
    public fun documentDataFieldName(): String

    /**
     * The name of the field that contains the document title.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardknowledgearticletypeconfiguration.html#cfn-kendra-datasource-salesforcestandardknowledgearticletypeconfiguration-documenttitlefieldname)
     */
    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    /**
     * Maps attributes or field names of the knowledge article to Amazon Kendra index field names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
     * more information, see [Mapping data source
     * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
     * source field names must exist in your Salesforce custom metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardknowledgearticletypeconfiguration.html#cfn-kendra-datasource-salesforcestandardknowledgearticletypeconfiguration-fieldmappings)
     */
    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    /**
     * A builder for [SalesforceStandardKnowledgeArticleTypeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param documentDataFieldName The name of the field that contains the document data to
       * index. 
       */
      public fun documentDataFieldName(documentDataFieldName: String)

      /**
       * @param documentTitleFieldName The name of the field that contains the document title.
       */
      public fun documentTitleFieldName(documentTitleFieldName: String)

      /**
       * @param fieldMappings Maps attributes or field names of the knowledge article to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      public fun fieldMappings(fieldMappings: IResolvable)

      /**
       * @param fieldMappings Maps attributes or field names of the knowledge article to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      public fun fieldMappings(fieldMappings: List<Any>)

      /**
       * @param fieldMappings Maps attributes or field names of the knowledge article to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      public fun fieldMappings(vararg fieldMappings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty.builder()

      /**
       * @param documentDataFieldName The name of the field that contains the document data to
       * index. 
       */
      override fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
      }

      /**
       * @param documentTitleFieldName The name of the field that contains the document title.
       */
      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      /**
       * @param fieldMappings Maps attributes or field names of the knowledge article to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param fieldMappings Maps attributes or field names of the knowledge article to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      /**
       * @param fieldMappings Maps attributes or field names of the knowledge article to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      override fun fieldMappings(vararg fieldMappings: Any): Unit =
          fieldMappings(fieldMappings.toList())

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty,
    ) : CdkObject(cdkObject), SalesforceStandardKnowledgeArticleTypeConfigurationProperty {
      /**
       * The name of the field that contains the document data to index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardknowledgearticletypeconfiguration.html#cfn-kendra-datasource-salesforcestandardknowledgearticletypeconfiguration-documentdatafieldname)
       */
      override fun documentDataFieldName(): String = unwrap(this).getDocumentDataFieldName()

      /**
       * The name of the field that contains the document title.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardknowledgearticletypeconfiguration.html#cfn-kendra-datasource-salesforcestandardknowledgearticletypeconfiguration-documenttitlefieldname)
       */
      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      /**
       * Maps attributes or field names of the knowledge article to Amazon Kendra index field names.
       *
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardknowledgearticletypeconfiguration.html#cfn-kendra-datasource-salesforcestandardknowledgearticletypeconfiguration-fieldmappings)
       */
      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceStandardKnowledgeArticleTypeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty):
          SalesforceStandardKnowledgeArticleTypeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceStandardKnowledgeArticleTypeConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty
    }
  }

  /**
   * Maps a column or attribute in the data source to an index field.
   *
   * You must first create the fields in the index using the
   * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface DataSourceToIndexFieldMappingProperty {
    /**
     * The name of the field in the data source.
     *
     * You must first create the index field using the `UpdateIndex` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourcetoindexfieldmapping.html#cfn-kendra-datasource-datasourcetoindexfieldmapping-datasourcefieldname)
     */
    public fun dataSourceFieldName(): String

    /**
     * The format for date fields in the data source.
     *
     * If the field specified in `DataSourceFieldName` is a date field, you must specify the date
     * format. If the field is not a date field, an exception is thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourcetoindexfieldmapping.html#cfn-kendra-datasource-datasourcetoindexfieldmapping-datefieldformat)
     */
    public fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

    /**
     * The name of the index field to map to the data source field.
     *
     * The index field type must match the data source field type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourcetoindexfieldmapping.html#cfn-kendra-datasource-datasourcetoindexfieldmapping-indexfieldname)
     */
    public fun indexFieldName(): String

    /**
     * A builder for [DataSourceToIndexFieldMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataSourceFieldName The name of the field in the data source. 
       * You must first create the index field using the `UpdateIndex` API.
       */
      public fun dataSourceFieldName(dataSourceFieldName: String)

      /**
       * @param dateFieldFormat The format for date fields in the data source.
       * If the field specified in `DataSourceFieldName` is a date field, you must specify the date
       * format. If the field is not a date field, an exception is thrown.
       */
      public fun dateFieldFormat(dateFieldFormat: String)

      /**
       * @param indexFieldName The name of the index field to map to the data source field. 
       * The index field type must match the data source field type.
       */
      public fun indexFieldName(indexFieldName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceToIndexFieldMappingProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceToIndexFieldMappingProperty.builder()

      /**
       * @param dataSourceFieldName The name of the field in the data source. 
       * You must first create the index field using the `UpdateIndex` API.
       */
      override fun dataSourceFieldName(dataSourceFieldName: String) {
        cdkBuilder.dataSourceFieldName(dataSourceFieldName)
      }

      /**
       * @param dateFieldFormat The format for date fields in the data source.
       * If the field specified in `DataSourceFieldName` is a date field, you must specify the date
       * format. If the field is not a date field, an exception is thrown.
       */
      override fun dateFieldFormat(dateFieldFormat: String) {
        cdkBuilder.dateFieldFormat(dateFieldFormat)
      }

      /**
       * @param indexFieldName The name of the index field to map to the data source field. 
       * The index field type must match the data source field type.
       */
      override fun indexFieldName(indexFieldName: String) {
        cdkBuilder.indexFieldName(indexFieldName)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceToIndexFieldMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceToIndexFieldMappingProperty,
    ) : CdkObject(cdkObject), DataSourceToIndexFieldMappingProperty {
      /**
       * The name of the field in the data source.
       *
       * You must first create the index field using the `UpdateIndex` API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourcetoindexfieldmapping.html#cfn-kendra-datasource-datasourcetoindexfieldmapping-datasourcefieldname)
       */
      override fun dataSourceFieldName(): String = unwrap(this).getDataSourceFieldName()

      /**
       * The format for date fields in the data source.
       *
       * If the field specified in `DataSourceFieldName` is a date field, you must specify the date
       * format. If the field is not a date field, an exception is thrown.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourcetoindexfieldmapping.html#cfn-kendra-datasource-datasourcetoindexfieldmapping-datefieldformat)
       */
      override fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

      /**
       * The name of the index field to map to the data source field.
       *
       * The index field type must match the data source field type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourcetoindexfieldmapping.html#cfn-kendra-datasource-datasourcetoindexfieldmapping-indexfieldname)
       */
      override fun indexFieldName(): String = unwrap(this).getIndexFieldName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataSourceToIndexFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceToIndexFieldMappingProperty):
          DataSourceToIndexFieldMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceToIndexFieldMappingProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceToIndexFieldMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceToIndexFieldMappingProperty
    }
  }

  /**
   * The value of a document attribute.
   *
   * You can only provide one value for a document attribute.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface DocumentAttributeValueProperty {
    /**
     * A date expressed as an ISO 8601 string.
     *
     * It is important for the time zone to be included in the ISO 8601 date-time format. For
     * example, 2012-03-25T12:30:10+01:00 is the ISO 8601 date-time format for March 25th 2012 at
     * 12:30PM (plus 10 seconds) in Central European Time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributevalue.html#cfn-kendra-datasource-documentattributevalue-datevalue)
     */
    public fun dateValue(): String? = unwrap(this).getDateValue()

    /**
     * A long integer value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributevalue.html#cfn-kendra-datasource-documentattributevalue-longvalue)
     */
    public fun longValue(): Number? = unwrap(this).getLongValue()

    /**
     * A list of strings.
     *
     * The default maximum length or number of strings is 10.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributevalue.html#cfn-kendra-datasource-documentattributevalue-stringlistvalue)
     */
    public fun stringListValue(): List<String> = unwrap(this).getStringListValue() ?: emptyList()

    /**
     * A string, such as "department".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributevalue.html#cfn-kendra-datasource-documentattributevalue-stringvalue)
     */
    public fun stringValue(): String? = unwrap(this).getStringValue()

    /**
     * A builder for [DocumentAttributeValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dateValue A date expressed as an ISO 8601 string.
       * It is important for the time zone to be included in the ISO 8601 date-time format. For
       * example, 2012-03-25T12:30:10+01:00 is the ISO 8601 date-time format for March 25th 2012 at
       * 12:30PM (plus 10 seconds) in Central European Time.
       */
      public fun dateValue(dateValue: String)

      /**
       * @param longValue A long integer value.
       */
      public fun longValue(longValue: Number)

      /**
       * @param stringListValue A list of strings.
       * The default maximum length or number of strings is 10.
       */
      public fun stringListValue(stringListValue: List<String>)

      /**
       * @param stringListValue A list of strings.
       * The default maximum length or number of strings is 10.
       */
      public fun stringListValue(vararg stringListValue: String)

      /**
       * @param stringValue A string, such as "department".
       */
      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeValueProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeValueProperty.builder()

      /**
       * @param dateValue A date expressed as an ISO 8601 string.
       * It is important for the time zone to be included in the ISO 8601 date-time format. For
       * example, 2012-03-25T12:30:10+01:00 is the ISO 8601 date-time format for March 25th 2012 at
       * 12:30PM (plus 10 seconds) in Central European Time.
       */
      override fun dateValue(dateValue: String) {
        cdkBuilder.dateValue(dateValue)
      }

      /**
       * @param longValue A long integer value.
       */
      override fun longValue(longValue: Number) {
        cdkBuilder.longValue(longValue)
      }

      /**
       * @param stringListValue A list of strings.
       * The default maximum length or number of strings is 10.
       */
      override fun stringListValue(stringListValue: List<String>) {
        cdkBuilder.stringListValue(stringListValue)
      }

      /**
       * @param stringListValue A list of strings.
       * The default maximum length or number of strings is 10.
       */
      override fun stringListValue(vararg stringListValue: String): Unit =
          stringListValue(stringListValue.toList())

      /**
       * @param stringValue A string, such as "department".
       */
      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeValueProperty,
    ) : CdkObject(cdkObject), DocumentAttributeValueProperty {
      /**
       * A date expressed as an ISO 8601 string.
       *
       * It is important for the time zone to be included in the ISO 8601 date-time format. For
       * example, 2012-03-25T12:30:10+01:00 is the ISO 8601 date-time format for March 25th 2012 at
       * 12:30PM (plus 10 seconds) in Central European Time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributevalue.html#cfn-kendra-datasource-documentattributevalue-datevalue)
       */
      override fun dateValue(): String? = unwrap(this).getDateValue()

      /**
       * A long integer value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributevalue.html#cfn-kendra-datasource-documentattributevalue-longvalue)
       */
      override fun longValue(): Number? = unwrap(this).getLongValue()

      /**
       * A list of strings.
       *
       * The default maximum length or number of strings is 10.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributevalue.html#cfn-kendra-datasource-documentattributevalue-stringlistvalue)
       */
      override fun stringListValue(): List<String> = unwrap(this).getStringListValue() ?:
          emptyList()

      /**
       * A string, such as "department".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentattributevalue.html#cfn-kendra-datasource-documentattributevalue-stringvalue)
       */
      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentAttributeValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeValueProperty):
          DocumentAttributeValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentAttributeValueProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeValueProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeValueProperty
    }
  }

  /**
   * Provides the configuration information to connect to OneDrive as your data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface OneDriveConfigurationProperty {
    /**
     * `TRUE` to disable local groups information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html#cfn-kendra-datasource-onedriveconfiguration-disablelocalgroups)
     */
    public fun disableLocalGroups(): Any? = unwrap(this).getDisableLocalGroups()

    /**
     * A list of regular expression patterns to exclude certain documents in your OneDrive.
     *
     * Documents that match the patterns are excluded from the index. Documents that don't match the
     * patterns are included in the index. If a document matches both an inclusion and exclusion
     * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
     *
     * The pattern is applied to the file name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html#cfn-kendra-datasource-onedriveconfiguration-exclusionpatterns)
     */
    public fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
        emptyList()

    /**
     * A list of `DataSourceToIndexFieldMapping` objects that map OneDrive data source attributes or
     * field names to Amazon Kendra index field names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to OneDrive fields. For
     * more information, see [Mapping data source
     * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The OneDrive data
     * source field names must exist in your OneDrive custom metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html#cfn-kendra-datasource-onedriveconfiguration-fieldmappings)
     */
    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    /**
     * A list of regular expression patterns to include certain documents in your OneDrive.
     *
     * Documents that match the patterns are included in the index. Documents that don't match the
     * patterns are excluded from the index. If a document matches both an inclusion and exclusion
     * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
     *
     * The pattern is applied to the file name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html#cfn-kendra-datasource-onedriveconfiguration-inclusionpatterns)
     */
    public fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
        emptyList()

    /**
     * A list of user accounts whose documents should be indexed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html#cfn-kendra-datasource-onedriveconfiguration-onedriveusers)
     */
    public fun oneDriveUsers(): Any

    /**
     * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that contains the user name
     * and password to connect to OneDrive.
     *
     * The user name should be the application ID for the OneDrive application, and the password is
     * the application key for the OneDrive application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html#cfn-kendra-datasource-onedriveconfiguration-secretarn)
     */
    public fun secretArn(): String

    /**
     * The Azure Active Directory domain of the organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html#cfn-kendra-datasource-onedriveconfiguration-tenantdomain)
     */
    public fun tenantDomain(): String

    /**
     * A builder for [OneDriveConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param disableLocalGroups `TRUE` to disable local groups information.
       */
      public fun disableLocalGroups(disableLocalGroups: Boolean)

      /**
       * @param disableLocalGroups `TRUE` to disable local groups information.
       */
      public fun disableLocalGroups(disableLocalGroups: IResolvable)

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain documents
       * in your OneDrive.
       * Documents that match the patterns are excluded from the index. Documents that don't match
       * the patterns are included in the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the file name.
       */
      public fun exclusionPatterns(exclusionPatterns: List<String>)

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain documents
       * in your OneDrive.
       * Documents that match the patterns are excluded from the index. Documents that don't match
       * the patterns are included in the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the file name.
       */
      public fun exclusionPatterns(vararg exclusionPatterns: String)

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map OneDrive
       * data source attributes or field names to Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to OneDrive fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The OneDrive data
       * source field names must exist in your OneDrive custom metadata.
       */
      public fun fieldMappings(fieldMappings: IResolvable)

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map OneDrive
       * data source attributes or field names to Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to OneDrive fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The OneDrive data
       * source field names must exist in your OneDrive custom metadata.
       */
      public fun fieldMappings(fieldMappings: List<Any>)

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map OneDrive
       * data source attributes or field names to Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to OneDrive fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The OneDrive data
       * source field names must exist in your OneDrive custom metadata.
       */
      public fun fieldMappings(vararg fieldMappings: Any)

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain documents
       * in your OneDrive.
       * Documents that match the patterns are included in the index. Documents that don't match the
       * patterns are excluded from the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the file name.
       */
      public fun inclusionPatterns(inclusionPatterns: List<String>)

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain documents
       * in your OneDrive.
       * Documents that match the patterns are included in the index. Documents that don't match the
       * patterns are excluded from the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the file name.
       */
      public fun inclusionPatterns(vararg inclusionPatterns: String)

      /**
       * @param oneDriveUsers A list of user accounts whose documents should be indexed. 
       */
      public fun oneDriveUsers(oneDriveUsers: IResolvable)

      /**
       * @param oneDriveUsers A list of user accounts whose documents should be indexed. 
       */
      public fun oneDriveUsers(oneDriveUsers: OneDriveUsersProperty)

      /**
       * @param oneDriveUsers A list of user accounts whose documents should be indexed. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("832281f44d77ef71aa969c9a77c034c404ef104bce394194024f7c50f951f426")
      public fun oneDriveUsers(oneDriveUsers: OneDriveUsersProperty.Builder.() -> Unit)

      /**
       * @param secretArn The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
       * contains the user name and password to connect to OneDrive. 
       * The user name should be the application ID for the OneDrive application, and the password
       * is the application key for the OneDrive application.
       */
      public fun secretArn(secretArn: String)

      /**
       * @param tenantDomain The Azure Active Directory domain of the organization. 
       */
      public fun tenantDomain(tenantDomain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty.builder()

      /**
       * @param disableLocalGroups `TRUE` to disable local groups information.
       */
      override fun disableLocalGroups(disableLocalGroups: Boolean) {
        cdkBuilder.disableLocalGroups(disableLocalGroups)
      }

      /**
       * @param disableLocalGroups `TRUE` to disable local groups information.
       */
      override fun disableLocalGroups(disableLocalGroups: IResolvable) {
        cdkBuilder.disableLocalGroups(disableLocalGroups.let(IResolvable::unwrap))
      }

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain documents
       * in your OneDrive.
       * Documents that match the patterns are excluded from the index. Documents that don't match
       * the patterns are included in the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the file name.
       */
      override fun exclusionPatterns(exclusionPatterns: List<String>) {
        cdkBuilder.exclusionPatterns(exclusionPatterns)
      }

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain documents
       * in your OneDrive.
       * Documents that match the patterns are excluded from the index. Documents that don't match
       * the patterns are included in the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the file name.
       */
      override fun exclusionPatterns(vararg exclusionPatterns: String): Unit =
          exclusionPatterns(exclusionPatterns.toList())

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map OneDrive
       * data source attributes or field names to Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to OneDrive fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The OneDrive data
       * source field names must exist in your OneDrive custom metadata.
       */
      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map OneDrive
       * data source attributes or field names to Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to OneDrive fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The OneDrive data
       * source field names must exist in your OneDrive custom metadata.
       */
      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map OneDrive
       * data source attributes or field names to Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to OneDrive fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The OneDrive data
       * source field names must exist in your OneDrive custom metadata.
       */
      override fun fieldMappings(vararg fieldMappings: Any): Unit =
          fieldMappings(fieldMappings.toList())

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain documents
       * in your OneDrive.
       * Documents that match the patterns are included in the index. Documents that don't match the
       * patterns are excluded from the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the file name.
       */
      override fun inclusionPatterns(inclusionPatterns: List<String>) {
        cdkBuilder.inclusionPatterns(inclusionPatterns)
      }

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain documents
       * in your OneDrive.
       * Documents that match the patterns are included in the index. Documents that don't match the
       * patterns are excluded from the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the file name.
       */
      override fun inclusionPatterns(vararg inclusionPatterns: String): Unit =
          inclusionPatterns(inclusionPatterns.toList())

      /**
       * @param oneDriveUsers A list of user accounts whose documents should be indexed. 
       */
      override fun oneDriveUsers(oneDriveUsers: IResolvable) {
        cdkBuilder.oneDriveUsers(oneDriveUsers.let(IResolvable::unwrap))
      }

      /**
       * @param oneDriveUsers A list of user accounts whose documents should be indexed. 
       */
      override fun oneDriveUsers(oneDriveUsers: OneDriveUsersProperty) {
        cdkBuilder.oneDriveUsers(oneDriveUsers.let(OneDriveUsersProperty::unwrap))
      }

      /**
       * @param oneDriveUsers A list of user accounts whose documents should be indexed. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("832281f44d77ef71aa969c9a77c034c404ef104bce394194024f7c50f951f426")
      override fun oneDriveUsers(oneDriveUsers: OneDriveUsersProperty.Builder.() -> Unit): Unit =
          oneDriveUsers(OneDriveUsersProperty(oneDriveUsers))

      /**
       * @param secretArn The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
       * contains the user name and password to connect to OneDrive. 
       * The user name should be the application ID for the OneDrive application, and the password
       * is the application key for the OneDrive application.
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      /**
       * @param tenantDomain The Azure Active Directory domain of the organization. 
       */
      override fun tenantDomain(tenantDomain: String) {
        cdkBuilder.tenantDomain(tenantDomain)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty,
    ) : CdkObject(cdkObject), OneDriveConfigurationProperty {
      /**
       * `TRUE` to disable local groups information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html#cfn-kendra-datasource-onedriveconfiguration-disablelocalgroups)
       */
      override fun disableLocalGroups(): Any? = unwrap(this).getDisableLocalGroups()

      /**
       * A list of regular expression patterns to exclude certain documents in your OneDrive.
       *
       * Documents that match the patterns are excluded from the index. Documents that don't match
       * the patterns are included in the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the file name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html#cfn-kendra-datasource-onedriveconfiguration-exclusionpatterns)
       */
      override fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
          emptyList()

      /**
       * A list of `DataSourceToIndexFieldMapping` objects that map OneDrive data source attributes
       * or field names to Amazon Kendra index field names.
       *
       * To create custom fields, use the `UpdateIndex` API before you map to OneDrive fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The OneDrive data
       * source field names must exist in your OneDrive custom metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html#cfn-kendra-datasource-onedriveconfiguration-fieldmappings)
       */
      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      /**
       * A list of regular expression patterns to include certain documents in your OneDrive.
       *
       * Documents that match the patterns are included in the index. Documents that don't match the
       * patterns are excluded from the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the file name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html#cfn-kendra-datasource-onedriveconfiguration-inclusionpatterns)
       */
      override fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
          emptyList()

      /**
       * A list of user accounts whose documents should be indexed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html#cfn-kendra-datasource-onedriveconfiguration-onedriveusers)
       */
      override fun oneDriveUsers(): Any = unwrap(this).getOneDriveUsers()

      /**
       * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that contains the user name
       * and password to connect to OneDrive.
       *
       * The user name should be the application ID for the OneDrive application, and the password
       * is the application key for the OneDrive application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html#cfn-kendra-datasource-onedriveconfiguration-secretarn)
       */
      override fun secretArn(): String = unwrap(this).getSecretArn()

      /**
       * The Azure Active Directory domain of the organization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveconfiguration.html#cfn-kendra-datasource-onedriveconfiguration-tenantdomain)
       */
      override fun tenantDomain(): String = unwrap(this).getTenantDomain()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OneDriveConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty):
          OneDriveConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OneDriveConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty
    }
  }

  /**
   * User accounts whose documents should be indexed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface OneDriveUsersProperty {
    /**
     * A list of users whose documents should be indexed.
     *
     * Specify the user names in email format, for example, `username&#64;tenantdomain` . If you
     * need to index the documents of more than 100 users, use the `OneDriveUserS3Path` field to
     * specify the location of a file containing a list of users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveusers.html#cfn-kendra-datasource-onedriveusers-onedriveuserlist)
     */
    public fun oneDriveUserList(): List<String> = unwrap(this).getOneDriveUserList() ?: emptyList()

    /**
     * The S3 bucket location of a file containing a list of users whose documents should be
     * indexed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveusers.html#cfn-kendra-datasource-onedriveusers-onedriveusers3path)
     */
    public fun oneDriveUserS3Path(): Any? = unwrap(this).getOneDriveUserS3Path()

    /**
     * A builder for [OneDriveUsersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param oneDriveUserList A list of users whose documents should be indexed.
       * Specify the user names in email format, for example, `username&#64;tenantdomain` . If you
       * need to index the documents of more than 100 users, use the `OneDriveUserS3Path` field to
       * specify the location of a file containing a list of users.
       */
      public fun oneDriveUserList(oneDriveUserList: List<String>)

      /**
       * @param oneDriveUserList A list of users whose documents should be indexed.
       * Specify the user names in email format, for example, `username&#64;tenantdomain` . If you
       * need to index the documents of more than 100 users, use the `OneDriveUserS3Path` field to
       * specify the location of a file containing a list of users.
       */
      public fun oneDriveUserList(vararg oneDriveUserList: String)

      /**
       * @param oneDriveUserS3Path The S3 bucket location of a file containing a list of users whose
       * documents should be indexed.
       */
      public fun oneDriveUserS3Path(oneDriveUserS3Path: IResolvable)

      /**
       * @param oneDriveUserS3Path The S3 bucket location of a file containing a list of users whose
       * documents should be indexed.
       */
      public fun oneDriveUserS3Path(oneDriveUserS3Path: S3PathProperty)

      /**
       * @param oneDriveUserS3Path The S3 bucket location of a file containing a list of users whose
       * documents should be indexed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0519f8aec787b99317fd3af06d3c129b2799c34b41915b30d58c5df23c3e66a")
      public fun oneDriveUserS3Path(oneDriveUserS3Path: S3PathProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty.builder()

      /**
       * @param oneDriveUserList A list of users whose documents should be indexed.
       * Specify the user names in email format, for example, `username&#64;tenantdomain` . If you
       * need to index the documents of more than 100 users, use the `OneDriveUserS3Path` field to
       * specify the location of a file containing a list of users.
       */
      override fun oneDriveUserList(oneDriveUserList: List<String>) {
        cdkBuilder.oneDriveUserList(oneDriveUserList)
      }

      /**
       * @param oneDriveUserList A list of users whose documents should be indexed.
       * Specify the user names in email format, for example, `username&#64;tenantdomain` . If you
       * need to index the documents of more than 100 users, use the `OneDriveUserS3Path` field to
       * specify the location of a file containing a list of users.
       */
      override fun oneDriveUserList(vararg oneDriveUserList: String): Unit =
          oneDriveUserList(oneDriveUserList.toList())

      /**
       * @param oneDriveUserS3Path The S3 bucket location of a file containing a list of users whose
       * documents should be indexed.
       */
      override fun oneDriveUserS3Path(oneDriveUserS3Path: IResolvable) {
        cdkBuilder.oneDriveUserS3Path(oneDriveUserS3Path.let(IResolvable::unwrap))
      }

      /**
       * @param oneDriveUserS3Path The S3 bucket location of a file containing a list of users whose
       * documents should be indexed.
       */
      override fun oneDriveUserS3Path(oneDriveUserS3Path: S3PathProperty) {
        cdkBuilder.oneDriveUserS3Path(oneDriveUserS3Path.let(S3PathProperty::unwrap))
      }

      /**
       * @param oneDriveUserS3Path The S3 bucket location of a file containing a list of users whose
       * documents should be indexed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0519f8aec787b99317fd3af06d3c129b2799c34b41915b30d58c5df23c3e66a")
      override fun oneDriveUserS3Path(oneDriveUserS3Path: S3PathProperty.Builder.() -> Unit): Unit =
          oneDriveUserS3Path(S3PathProperty(oneDriveUserS3Path))

      public fun build(): software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty,
    ) : CdkObject(cdkObject), OneDriveUsersProperty {
      /**
       * A list of users whose documents should be indexed.
       *
       * Specify the user names in email format, for example, `username&#64;tenantdomain` . If you
       * need to index the documents of more than 100 users, use the `OneDriveUserS3Path` field to
       * specify the location of a file containing a list of users.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveusers.html#cfn-kendra-datasource-onedriveusers-onedriveuserlist)
       */
      override fun oneDriveUserList(): List<String> = unwrap(this).getOneDriveUserList() ?:
          emptyList()

      /**
       * The S3 bucket location of a file containing a list of users whose documents should be
       * indexed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-onedriveusers.html#cfn-kendra-datasource-onedriveusers-onedriveusers3path)
       */
      override fun oneDriveUserS3Path(): Any? = unwrap(this).getOneDriveUserS3Path()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OneDriveUsersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty):
          OneDriveUsersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OneDriveUsersProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty
    }
  }

  /**
   * Provides the configuration information for altering document metadata and content during the
   * document ingestion process.
   *
   * For more information, see [Customizing document metadata during the ingestion
   * process](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface CustomDocumentEnrichmentConfigurationProperty {
    /**
     * Configuration information to alter document attributes or metadata fields and content when
     * ingesting documents into Amazon Kendra.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-customdocumentenrichmentconfiguration.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration-inlineconfigurations)
     */
    public fun inlineConfigurations(): Any? = unwrap(this).getInlineConfigurations()

    /**
     * Configuration information for invoking a Lambda function in AWS Lambda on the structured
     * documents with their metadata and text extracted.
     *
     * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
     * document metadata and content. For more information, see [Advanced data
     * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-customdocumentenrichmentconfiguration.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration-postextractionhookconfiguration)
     */
    public fun postExtractionHookConfiguration(): Any? =
        unwrap(this).getPostExtractionHookConfiguration()

    /**
     * Configuration information for invoking a Lambda function in AWS Lambda on the original or raw
     * documents before extracting their metadata and text.
     *
     * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
     * document metadata and content. For more information, see [Advanced data
     * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-customdocumentenrichmentconfiguration.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration-preextractionhookconfiguration)
     */
    public fun preExtractionHookConfiguration(): Any? =
        unwrap(this).getPreExtractionHookConfiguration()

    /**
     * The Amazon Resource Name (ARN) of a role with permission to run
     * `PreExtractionHookConfiguration` and `PostExtractionHookConfiguration` for altering document
     * metadata and content during the document ingestion process.
     *
     * For more information, see [IAM roles for Amazon
     * Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-customdocumentenrichmentconfiguration.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * A builder for [CustomDocumentEnrichmentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inlineConfigurations Configuration information to alter document attributes or
       * metadata fields and content when ingesting documents into Amazon Kendra.
       */
      public fun inlineConfigurations(inlineConfigurations: IResolvable)

      /**
       * @param inlineConfigurations Configuration information to alter document attributes or
       * metadata fields and content when ingesting documents into Amazon Kendra.
       */
      public fun inlineConfigurations(inlineConfigurations: List<Any>)

      /**
       * @param inlineConfigurations Configuration information to alter document attributes or
       * metadata fields and content when ingesting documents into Amazon Kendra.
       */
      public fun inlineConfigurations(vararg inlineConfigurations: Any)

      /**
       * @param postExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the structured documents with their metadata and text extracted.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Advanced data
       * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
       * .
       */
      public fun postExtractionHookConfiguration(postExtractionHookConfiguration: IResolvable)

      /**
       * @param postExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the structured documents with their metadata and text extracted.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Advanced data
       * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
       * .
       */
      public
          fun postExtractionHookConfiguration(postExtractionHookConfiguration: HookConfigurationProperty)

      /**
       * @param postExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the structured documents with their metadata and text extracted.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Advanced data
       * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("661bdfab95b4c4f7dc5bd929d1c69b1f860934f458a303688be5f26bf90003e8")
      public
          fun postExtractionHookConfiguration(postExtractionHookConfiguration: HookConfigurationProperty.Builder.() -> Unit)

      /**
       * @param preExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the original or raw documents before extracting their metadata and
       * text.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Advanced data
       * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
       * .
       */
      public fun preExtractionHookConfiguration(preExtractionHookConfiguration: IResolvable)

      /**
       * @param preExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the original or raw documents before extracting their metadata and
       * text.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Advanced data
       * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
       * .
       */
      public
          fun preExtractionHookConfiguration(preExtractionHookConfiguration: HookConfigurationProperty)

      /**
       * @param preExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the original or raw documents before extracting their metadata and
       * text.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Advanced data
       * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be71f589c859a4ce488fbe4bdf449b4b6cddb9162e4362bebbdd5298d572769d")
      public
          fun preExtractionHookConfiguration(preExtractionHookConfiguration: HookConfigurationProperty.Builder.() -> Unit)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of a role with permission to run
       * `PreExtractionHookConfiguration` and `PostExtractionHookConfiguration` for altering document
       * metadata and content during the document ingestion process.
       * For more information, see [IAM roles for Amazon
       * Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html) .
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.CustomDocumentEnrichmentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.CustomDocumentEnrichmentConfigurationProperty.builder()

      /**
       * @param inlineConfigurations Configuration information to alter document attributes or
       * metadata fields and content when ingesting documents into Amazon Kendra.
       */
      override fun inlineConfigurations(inlineConfigurations: IResolvable) {
        cdkBuilder.inlineConfigurations(inlineConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param inlineConfigurations Configuration information to alter document attributes or
       * metadata fields and content when ingesting documents into Amazon Kendra.
       */
      override fun inlineConfigurations(inlineConfigurations: List<Any>) {
        cdkBuilder.inlineConfigurations(inlineConfigurations)
      }

      /**
       * @param inlineConfigurations Configuration information to alter document attributes or
       * metadata fields and content when ingesting documents into Amazon Kendra.
       */
      override fun inlineConfigurations(vararg inlineConfigurations: Any): Unit =
          inlineConfigurations(inlineConfigurations.toList())

      /**
       * @param postExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the structured documents with their metadata and text extracted.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Advanced data
       * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
       * .
       */
      override fun postExtractionHookConfiguration(postExtractionHookConfiguration: IResolvable) {
        cdkBuilder.postExtractionHookConfiguration(postExtractionHookConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param postExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the structured documents with their metadata and text extracted.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Advanced data
       * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
       * .
       */
      override
          fun postExtractionHookConfiguration(postExtractionHookConfiguration: HookConfigurationProperty) {
        cdkBuilder.postExtractionHookConfiguration(postExtractionHookConfiguration.let(HookConfigurationProperty::unwrap))
      }

      /**
       * @param postExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the structured documents with their metadata and text extracted.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Advanced data
       * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("661bdfab95b4c4f7dc5bd929d1c69b1f860934f458a303688be5f26bf90003e8")
      override
          fun postExtractionHookConfiguration(postExtractionHookConfiguration: HookConfigurationProperty.Builder.() -> Unit):
          Unit =
          postExtractionHookConfiguration(HookConfigurationProperty(postExtractionHookConfiguration))

      /**
       * @param preExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the original or raw documents before extracting their metadata and
       * text.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Advanced data
       * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
       * .
       */
      override fun preExtractionHookConfiguration(preExtractionHookConfiguration: IResolvable) {
        cdkBuilder.preExtractionHookConfiguration(preExtractionHookConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param preExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the original or raw documents before extracting their metadata and
       * text.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Advanced data
       * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
       * .
       */
      override
          fun preExtractionHookConfiguration(preExtractionHookConfiguration: HookConfigurationProperty) {
        cdkBuilder.preExtractionHookConfiguration(preExtractionHookConfiguration.let(HookConfigurationProperty::unwrap))
      }

      /**
       * @param preExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the original or raw documents before extracting their metadata and
       * text.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Advanced data
       * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be71f589c859a4ce488fbe4bdf449b4b6cddb9162e4362bebbdd5298d572769d")
      override
          fun preExtractionHookConfiguration(preExtractionHookConfiguration: HookConfigurationProperty.Builder.() -> Unit):
          Unit =
          preExtractionHookConfiguration(HookConfigurationProperty(preExtractionHookConfiguration))

      /**
       * @param roleArn The Amazon Resource Name (ARN) of a role with permission to run
       * `PreExtractionHookConfiguration` and `PostExtractionHookConfiguration` for altering document
       * metadata and content during the document ingestion process.
       * For more information, see [IAM roles for Amazon
       * Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html) .
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.CustomDocumentEnrichmentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.CustomDocumentEnrichmentConfigurationProperty,
    ) : CdkObject(cdkObject), CustomDocumentEnrichmentConfigurationProperty {
      /**
       * Configuration information to alter document attributes or metadata fields and content when
       * ingesting documents into Amazon Kendra.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-customdocumentenrichmentconfiguration.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration-inlineconfigurations)
       */
      override fun inlineConfigurations(): Any? = unwrap(this).getInlineConfigurations()

      /**
       * Configuration information for invoking a Lambda function in AWS Lambda on the structured
       * documents with their metadata and text extracted.
       *
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Advanced data
       * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-customdocumentenrichmentconfiguration.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration-postextractionhookconfiguration)
       */
      override fun postExtractionHookConfiguration(): Any? =
          unwrap(this).getPostExtractionHookConfiguration()

      /**
       * Configuration information for invoking a Lambda function in AWS Lambda on the original or
       * raw documents before extracting their metadata and text.
       *
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Advanced data
       * manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-customdocumentenrichmentconfiguration.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration-preextractionhookconfiguration)
       */
      override fun preExtractionHookConfiguration(): Any? =
          unwrap(this).getPreExtractionHookConfiguration()

      /**
       * The Amazon Resource Name (ARN) of a role with permission to run
       * `PreExtractionHookConfiguration` and `PostExtractionHookConfiguration` for altering document
       * metadata and content during the document ingestion process.
       *
       * For more information, see [IAM roles for Amazon
       * Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-customdocumentenrichmentconfiguration.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomDocumentEnrichmentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.CustomDocumentEnrichmentConfigurationProperty):
          CustomDocumentEnrichmentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomDocumentEnrichmentConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.CustomDocumentEnrichmentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.CustomDocumentEnrichmentConfigurationProperty
    }
  }

  /**
   * The configuration information for syncing a Salesforce chatter feed.
   *
   * The contents of the object comes from the Salesforce FeedItem table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface SalesforceChatterFeedConfigurationProperty {
    /**
     * The name of the column in the Salesforce FeedItem table that contains the content to index.
     *
     * Typically this is the `Body` column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcechatterfeedconfiguration.html#cfn-kendra-datasource-salesforcechatterfeedconfiguration-documentdatafieldname)
     */
    public fun documentDataFieldName(): String

    /**
     * The name of the column in the Salesforce FeedItem table that contains the title of the
     * document.
     *
     * This is typically the `Title` column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcechatterfeedconfiguration.html#cfn-kendra-datasource-salesforcechatterfeedconfiguration-documenttitlefieldname)
     */
    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    /**
     * Maps fields from a Salesforce chatter feed into Amazon Kendra index fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcechatterfeedconfiguration.html#cfn-kendra-datasource-salesforcechatterfeedconfiguration-fieldmappings)
     */
    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    /**
     * Filters the documents in the feed based on status of the user.
     *
     * When you specify `ACTIVE_USERS` only documents from users who have an active account are
     * indexed. When you specify `STANDARD_USER` only documents for Salesforce standard users are
     * documented. You can specify both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcechatterfeedconfiguration.html#cfn-kendra-datasource-salesforcechatterfeedconfiguration-includefiltertypes)
     */
    public fun includeFilterTypes(): List<String> = unwrap(this).getIncludeFilterTypes() ?:
        emptyList()

    /**
     * A builder for [SalesforceChatterFeedConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param documentDataFieldName The name of the column in the Salesforce FeedItem table that
       * contains the content to index. 
       * Typically this is the `Body` column.
       */
      public fun documentDataFieldName(documentDataFieldName: String)

      /**
       * @param documentTitleFieldName The name of the column in the Salesforce FeedItem table that
       * contains the title of the document.
       * This is typically the `Title` column.
       */
      public fun documentTitleFieldName(documentTitleFieldName: String)

      /**
       * @param fieldMappings Maps fields from a Salesforce chatter feed into Amazon Kendra index
       * fields.
       */
      public fun fieldMappings(fieldMappings: IResolvable)

      /**
       * @param fieldMappings Maps fields from a Salesforce chatter feed into Amazon Kendra index
       * fields.
       */
      public fun fieldMappings(fieldMappings: List<Any>)

      /**
       * @param fieldMappings Maps fields from a Salesforce chatter feed into Amazon Kendra index
       * fields.
       */
      public fun fieldMappings(vararg fieldMappings: Any)

      /**
       * @param includeFilterTypes Filters the documents in the feed based on status of the user.
       * When you specify `ACTIVE_USERS` only documents from users who have an active account are
       * indexed. When you specify `STANDARD_USER` only documents for Salesforce standard users are
       * documented. You can specify both.
       */
      public fun includeFilterTypes(includeFilterTypes: List<String>)

      /**
       * @param includeFilterTypes Filters the documents in the feed based on status of the user.
       * When you specify `ACTIVE_USERS` only documents from users who have an active account are
       * indexed. When you specify `STANDARD_USER` only documents for Salesforce standard users are
       * documented. You can specify both.
       */
      public fun includeFilterTypes(vararg includeFilterTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty.builder()

      /**
       * @param documentDataFieldName The name of the column in the Salesforce FeedItem table that
       * contains the content to index. 
       * Typically this is the `Body` column.
       */
      override fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
      }

      /**
       * @param documentTitleFieldName The name of the column in the Salesforce FeedItem table that
       * contains the title of the document.
       * This is typically the `Title` column.
       */
      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      /**
       * @param fieldMappings Maps fields from a Salesforce chatter feed into Amazon Kendra index
       * fields.
       */
      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param fieldMappings Maps fields from a Salesforce chatter feed into Amazon Kendra index
       * fields.
       */
      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      /**
       * @param fieldMappings Maps fields from a Salesforce chatter feed into Amazon Kendra index
       * fields.
       */
      override fun fieldMappings(vararg fieldMappings: Any): Unit =
          fieldMappings(fieldMappings.toList())

      /**
       * @param includeFilterTypes Filters the documents in the feed based on status of the user.
       * When you specify `ACTIVE_USERS` only documents from users who have an active account are
       * indexed. When you specify `STANDARD_USER` only documents for Salesforce standard users are
       * documented. You can specify both.
       */
      override fun includeFilterTypes(includeFilterTypes: List<String>) {
        cdkBuilder.includeFilterTypes(includeFilterTypes)
      }

      /**
       * @param includeFilterTypes Filters the documents in the feed based on status of the user.
       * When you specify `ACTIVE_USERS` only documents from users who have an active account are
       * indexed. When you specify `STANDARD_USER` only documents for Salesforce standard users are
       * documented. You can specify both.
       */
      override fun includeFilterTypes(vararg includeFilterTypes: String): Unit =
          includeFilterTypes(includeFilterTypes.toList())

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty,
    ) : CdkObject(cdkObject), SalesforceChatterFeedConfigurationProperty {
      /**
       * The name of the column in the Salesforce FeedItem table that contains the content to index.
       *
       * Typically this is the `Body` column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcechatterfeedconfiguration.html#cfn-kendra-datasource-salesforcechatterfeedconfiguration-documentdatafieldname)
       */
      override fun documentDataFieldName(): String = unwrap(this).getDocumentDataFieldName()

      /**
       * The name of the column in the Salesforce FeedItem table that contains the title of the
       * document.
       *
       * This is typically the `Title` column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcechatterfeedconfiguration.html#cfn-kendra-datasource-salesforcechatterfeedconfiguration-documenttitlefieldname)
       */
      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      /**
       * Maps fields from a Salesforce chatter feed into Amazon Kendra index fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcechatterfeedconfiguration.html#cfn-kendra-datasource-salesforcechatterfeedconfiguration-fieldmappings)
       */
      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      /**
       * Filters the documents in the feed based on status of the user.
       *
       * When you specify `ACTIVE_USERS` only documents from users who have an active account are
       * indexed. When you specify `STANDARD_USER` only documents for Salesforce standard users are
       * documented. You can specify both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcechatterfeedconfiguration.html#cfn-kendra-datasource-salesforcechatterfeedconfiguration-includefiltertypes)
       */
      override fun includeFilterTypes(): List<String> = unwrap(this).getIncludeFilterTypes() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceChatterFeedConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty):
          SalesforceChatterFeedConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceChatterFeedConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty
    }
  }

  /**
   * Provides the configuration information for crawling service catalog items in the ServiceNow
   * site.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface ServiceNowServiceCatalogConfigurationProperty {
    /**
     * `TRUE` to index attachments to service catalog items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowservicecatalogconfiguration.html#cfn-kendra-datasource-servicenowservicecatalogconfiguration-crawlattachments)
     */
    public fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

    /**
     * The name of the ServiceNow field that is mapped to the index document contents field in the
     * Amazon Kendra index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowservicecatalogconfiguration.html#cfn-kendra-datasource-servicenowservicecatalogconfiguration-documentdatafieldname)
     */
    public fun documentDataFieldName(): String

    /**
     * The name of the ServiceNow field that is mapped to the index document title field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowservicecatalogconfiguration.html#cfn-kendra-datasource-servicenowservicecatalogconfiguration-documenttitlefieldname)
     */
    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    /**
     * A list of regular expression patterns to exclude certain attachments of catalogs in your
     * ServiceNow.
     *
     * Item that match the patterns are excluded from the index. Items that don't match the patterns
     * are included in the index. If an item matches both an inclusion and exclusion pattern, the
     * exclusion pattern takes precedence and the item isn't included in the index.
     *
     * The regex is applied to the file name of the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowservicecatalogconfiguration.html#cfn-kendra-datasource-servicenowservicecatalogconfiguration-excludeattachmentfilepatterns)
     */
    public fun excludeAttachmentFilePatterns(): List<String> =
        unwrap(this).getExcludeAttachmentFilePatterns() ?: emptyList()

    /**
     * Maps attributes or field names of catalogs to Amazon Kendra index field names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
     * more information, see [Mapping data source
     * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
     * source field names must exist in your ServiceNow custom metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowservicecatalogconfiguration.html#cfn-kendra-datasource-servicenowservicecatalogconfiguration-fieldmappings)
     */
    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    /**
     * A list of regular expression patterns to include certain attachments of catalogs in your
     * ServiceNow.
     *
     * Item that match the patterns are included in the index. Items that don't match the patterns
     * are excluded from the index. If an item matches both an inclusion and exclusion pattern, the
     * exclusion pattern takes precedence and the item isn't included in the index.
     *
     * The regex is applied to the file name of the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowservicecatalogconfiguration.html#cfn-kendra-datasource-servicenowservicecatalogconfiguration-includeattachmentfilepatterns)
     */
    public fun includeAttachmentFilePatterns(): List<String> =
        unwrap(this).getIncludeAttachmentFilePatterns() ?: emptyList()

    /**
     * A builder for [ServiceNowServiceCatalogConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crawlAttachments `TRUE` to index attachments to service catalog items.
       */
      public fun crawlAttachments(crawlAttachments: Boolean)

      /**
       * @param crawlAttachments `TRUE` to index attachments to service catalog items.
       */
      public fun crawlAttachments(crawlAttachments: IResolvable)

      /**
       * @param documentDataFieldName The name of the ServiceNow field that is mapped to the index
       * document contents field in the Amazon Kendra index. 
       */
      public fun documentDataFieldName(documentDataFieldName: String)

      /**
       * @param documentTitleFieldName The name of the ServiceNow field that is mapped to the index
       * document title field.
       */
      public fun documentTitleFieldName(documentTitleFieldName: String)

      /**
       * @param excludeAttachmentFilePatterns A list of regular expression patterns to exclude
       * certain attachments of catalogs in your ServiceNow.
       * Item that match the patterns are excluded from the index. Items that don't match the
       * patterns are included in the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       *
       * The regex is applied to the file name of the attachment.
       */
      public fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: List<String>)

      /**
       * @param excludeAttachmentFilePatterns A list of regular expression patterns to exclude
       * certain attachments of catalogs in your ServiceNow.
       * Item that match the patterns are excluded from the index. Items that don't match the
       * patterns are included in the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       *
       * The regex is applied to the file name of the attachment.
       */
      public fun excludeAttachmentFilePatterns(vararg excludeAttachmentFilePatterns: String)

      /**
       * @param fieldMappings Maps attributes or field names of catalogs to Amazon Kendra index
       * field names.
       * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
       * source field names must exist in your ServiceNow custom metadata.
       */
      public fun fieldMappings(fieldMappings: IResolvable)

      /**
       * @param fieldMappings Maps attributes or field names of catalogs to Amazon Kendra index
       * field names.
       * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
       * source field names must exist in your ServiceNow custom metadata.
       */
      public fun fieldMappings(fieldMappings: List<Any>)

      /**
       * @param fieldMappings Maps attributes or field names of catalogs to Amazon Kendra index
       * field names.
       * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
       * source field names must exist in your ServiceNow custom metadata.
       */
      public fun fieldMappings(vararg fieldMappings: Any)

      /**
       * @param includeAttachmentFilePatterns A list of regular expression patterns to include
       * certain attachments of catalogs in your ServiceNow.
       * Item that match the patterns are included in the index. Items that don't match the patterns
       * are excluded from the index. If an item matches both an inclusion and exclusion pattern, the
       * exclusion pattern takes precedence and the item isn't included in the index.
       *
       * The regex is applied to the file name of the attachment.
       */
      public fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: List<String>)

      /**
       * @param includeAttachmentFilePatterns A list of regular expression patterns to include
       * certain attachments of catalogs in your ServiceNow.
       * Item that match the patterns are included in the index. Items that don't match the patterns
       * are excluded from the index. If an item matches both an inclusion and exclusion pattern, the
       * exclusion pattern takes precedence and the item isn't included in the index.
       *
       * The regex is applied to the file name of the attachment.
       */
      public fun includeAttachmentFilePatterns(vararg includeAttachmentFilePatterns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty.builder()

      /**
       * @param crawlAttachments `TRUE` to index attachments to service catalog items.
       */
      override fun crawlAttachments(crawlAttachments: Boolean) {
        cdkBuilder.crawlAttachments(crawlAttachments)
      }

      /**
       * @param crawlAttachments `TRUE` to index attachments to service catalog items.
       */
      override fun crawlAttachments(crawlAttachments: IResolvable) {
        cdkBuilder.crawlAttachments(crawlAttachments.let(IResolvable::unwrap))
      }

      /**
       * @param documentDataFieldName The name of the ServiceNow field that is mapped to the index
       * document contents field in the Amazon Kendra index. 
       */
      override fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
      }

      /**
       * @param documentTitleFieldName The name of the ServiceNow field that is mapped to the index
       * document title field.
       */
      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      /**
       * @param excludeAttachmentFilePatterns A list of regular expression patterns to exclude
       * certain attachments of catalogs in your ServiceNow.
       * Item that match the patterns are excluded from the index. Items that don't match the
       * patterns are included in the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       *
       * The regex is applied to the file name of the attachment.
       */
      override fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: List<String>) {
        cdkBuilder.excludeAttachmentFilePatterns(excludeAttachmentFilePatterns)
      }

      /**
       * @param excludeAttachmentFilePatterns A list of regular expression patterns to exclude
       * certain attachments of catalogs in your ServiceNow.
       * Item that match the patterns are excluded from the index. Items that don't match the
       * patterns are included in the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       *
       * The regex is applied to the file name of the attachment.
       */
      override fun excludeAttachmentFilePatterns(vararg excludeAttachmentFilePatterns: String): Unit
          = excludeAttachmentFilePatterns(excludeAttachmentFilePatterns.toList())

      /**
       * @param fieldMappings Maps attributes or field names of catalogs to Amazon Kendra index
       * field names.
       * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
       * source field names must exist in your ServiceNow custom metadata.
       */
      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param fieldMappings Maps attributes or field names of catalogs to Amazon Kendra index
       * field names.
       * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
       * source field names must exist in your ServiceNow custom metadata.
       */
      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      /**
       * @param fieldMappings Maps attributes or field names of catalogs to Amazon Kendra index
       * field names.
       * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
       * source field names must exist in your ServiceNow custom metadata.
       */
      override fun fieldMappings(vararg fieldMappings: Any): Unit =
          fieldMappings(fieldMappings.toList())

      /**
       * @param includeAttachmentFilePatterns A list of regular expression patterns to include
       * certain attachments of catalogs in your ServiceNow.
       * Item that match the patterns are included in the index. Items that don't match the patterns
       * are excluded from the index. If an item matches both an inclusion and exclusion pattern, the
       * exclusion pattern takes precedence and the item isn't included in the index.
       *
       * The regex is applied to the file name of the attachment.
       */
      override fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: List<String>) {
        cdkBuilder.includeAttachmentFilePatterns(includeAttachmentFilePatterns)
      }

      /**
       * @param includeAttachmentFilePatterns A list of regular expression patterns to include
       * certain attachments of catalogs in your ServiceNow.
       * Item that match the patterns are included in the index. Items that don't match the patterns
       * are excluded from the index. If an item matches both an inclusion and exclusion pattern, the
       * exclusion pattern takes precedence and the item isn't included in the index.
       *
       * The regex is applied to the file name of the attachment.
       */
      override fun includeAttachmentFilePatterns(vararg includeAttachmentFilePatterns: String): Unit
          = includeAttachmentFilePatterns(includeAttachmentFilePatterns.toList())

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty,
    ) : CdkObject(cdkObject), ServiceNowServiceCatalogConfigurationProperty {
      /**
       * `TRUE` to index attachments to service catalog items.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowservicecatalogconfiguration.html#cfn-kendra-datasource-servicenowservicecatalogconfiguration-crawlattachments)
       */
      override fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

      /**
       * The name of the ServiceNow field that is mapped to the index document contents field in the
       * Amazon Kendra index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowservicecatalogconfiguration.html#cfn-kendra-datasource-servicenowservicecatalogconfiguration-documentdatafieldname)
       */
      override fun documentDataFieldName(): String = unwrap(this).getDocumentDataFieldName()

      /**
       * The name of the ServiceNow field that is mapped to the index document title field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowservicecatalogconfiguration.html#cfn-kendra-datasource-servicenowservicecatalogconfiguration-documenttitlefieldname)
       */
      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      /**
       * A list of regular expression patterns to exclude certain attachments of catalogs in your
       * ServiceNow.
       *
       * Item that match the patterns are excluded from the index. Items that don't match the
       * patterns are included in the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       *
       * The regex is applied to the file name of the attachment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowservicecatalogconfiguration.html#cfn-kendra-datasource-servicenowservicecatalogconfiguration-excludeattachmentfilepatterns)
       */
      override fun excludeAttachmentFilePatterns(): List<String> =
          unwrap(this).getExcludeAttachmentFilePatterns() ?: emptyList()

      /**
       * Maps attributes or field names of catalogs to Amazon Kendra index field names.
       *
       * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
       * source field names must exist in your ServiceNow custom metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowservicecatalogconfiguration.html#cfn-kendra-datasource-servicenowservicecatalogconfiguration-fieldmappings)
       */
      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      /**
       * A list of regular expression patterns to include certain attachments of catalogs in your
       * ServiceNow.
       *
       * Item that match the patterns are included in the index. Items that don't match the patterns
       * are excluded from the index. If an item matches both an inclusion and exclusion pattern, the
       * exclusion pattern takes precedence and the item isn't included in the index.
       *
       * The regex is applied to the file name of the attachment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowservicecatalogconfiguration.html#cfn-kendra-datasource-servicenowservicecatalogconfiguration-includeattachmentfilepatterns)
       */
      override fun includeAttachmentFilePatterns(): List<String> =
          unwrap(this).getIncludeAttachmentFilePatterns() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceNowServiceCatalogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty):
          ServiceNowServiceCatalogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceNowServiceCatalogConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty
    }
  }

  /**
   * Document metadata files that contain information such as the document access control
   * information, source URI, document author, and custom attributes.
   *
   * Each metadata file contains metadata about a single document.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
   * DocumentsMetadataConfigurationProperty documentsMetadataConfigurationProperty =
   * DocumentsMetadataConfigurationProperty.builder()
   * .s3Prefix("s3Prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentsmetadataconfiguration.html)
   */
  public interface DocumentsMetadataConfigurationProperty {
    /**
     * A prefix used to filter metadata configuration files in the AWS S3 bucket.
     *
     * The S3 bucket might contain multiple metadata files. Use `S3Prefix` to include only the
     * desired metadata files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentsmetadataconfiguration.html#cfn-kendra-datasource-documentsmetadataconfiguration-s3prefix)
     */
    public fun s3Prefix(): String? = unwrap(this).getS3Prefix()

    /**
     * A builder for [DocumentsMetadataConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Prefix A prefix used to filter metadata configuration files in the AWS S3 bucket.
       * The S3 bucket might contain multiple metadata files. Use `S3Prefix` to include only the
       * desired metadata files.
       */
      public fun s3Prefix(s3Prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty.builder()

      /**
       * @param s3Prefix A prefix used to filter metadata configuration files in the AWS S3 bucket.
       * The S3 bucket might contain multiple metadata files. Use `S3Prefix` to include only the
       * desired metadata files.
       */
      override fun s3Prefix(s3Prefix: String) {
        cdkBuilder.s3Prefix(s3Prefix)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty,
    ) : CdkObject(cdkObject), DocumentsMetadataConfigurationProperty {
      /**
       * A prefix used to filter metadata configuration files in the AWS S3 bucket.
       *
       * The S3 bucket might contain multiple metadata files. Use `S3Prefix` to include only the
       * desired metadata files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-documentsmetadataconfiguration.html#cfn-kendra-datasource-documentsmetadataconfiguration-s3prefix)
       */
      override fun s3Prefix(): String? = unwrap(this).getS3Prefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentsMetadataConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty):
          DocumentsMetadataConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentsMetadataConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty
    }
  }

  /**
   * Provides the configuration information for an Amazon Kendra data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface DataSourceConfigurationProperty {
    /**
     * Provides the configuration information to connect to Confluence as your data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-confluenceconfiguration)
     */
    public fun confluenceConfiguration(): Any? = unwrap(this).getConfluenceConfiguration()

    /**
     * Provides the configuration information to connect to a database as your data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-databaseconfiguration)
     */
    public fun databaseConfiguration(): Any? = unwrap(this).getDatabaseConfiguration()

    /**
     * Provides the configuration information to connect to Google Drive as your data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-googledriveconfiguration)
     */
    public fun googleDriveConfiguration(): Any? = unwrap(this).getGoogleDriveConfiguration()

    /**
     * Provides the configuration information to connect to Microsoft OneDrive as your data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-onedriveconfiguration)
     */
    public fun oneDriveConfiguration(): Any? = unwrap(this).getOneDriveConfiguration()

    /**
     * Provides the configuration information to connect to an Amazon S3 bucket as your data source.
     *
     *
     * Amazon Kendra now supports an upgraded Amazon S3 connector.
     *
     * You must now use the
     * [TemplateConfiguration](https://docs.aws.amazon.com/kendra/latest/APIReference/API_TemplateConfiguration.html)
     * object instead of the `S3DataSourceConfiguration` object to configure your connector.
     *
     * Connectors configured using the older console and API architecture will continue to function
     * as configured. However, you won't be able to edit or update them. If you want to edit or update
     * your connector configuration, you must create a new connector.
     *
     * We recommended migrating your connector workflow to the upgraded version. Support for
     * connectors configured using the older architecture is scheduled to end by June 2024.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-s3configuration)
     */
    public fun s3Configuration(): Any? = unwrap(this).getS3Configuration()

    /**
     * Provides the configuration information to connect to Salesforce as your data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-salesforceconfiguration)
     */
    public fun salesforceConfiguration(): Any? = unwrap(this).getSalesforceConfiguration()

    /**
     * Provides the configuration information to connect to ServiceNow as your data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-servicenowconfiguration)
     */
    public fun serviceNowConfiguration(): Any? = unwrap(this).getServiceNowConfiguration()

    /**
     * Provides the configuration information to connect to Microsoft SharePoint as your data
     * source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-sharepointconfiguration)
     */
    public fun sharePointConfiguration(): Any? = unwrap(this).getSharePointConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-templateconfiguration)
     */
    public fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

    /**
     * Provides the configuration information required for Amazon Kendra Web Crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-webcrawlerconfiguration)
     */
    public fun webCrawlerConfiguration(): Any? = unwrap(this).getWebCrawlerConfiguration()

    /**
     * Provides the configuration information to connect to Amazon WorkDocs as your data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-workdocsconfiguration)
     */
    public fun workDocsConfiguration(): Any? = unwrap(this).getWorkDocsConfiguration()

    /**
     * A builder for [DataSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param confluenceConfiguration Provides the configuration information to connect to
       * Confluence as your data source.
       */
      public fun confluenceConfiguration(confluenceConfiguration: IResolvable)

      /**
       * @param confluenceConfiguration Provides the configuration information to connect to
       * Confluence as your data source.
       */
      public fun confluenceConfiguration(confluenceConfiguration: ConfluenceConfigurationProperty)

      /**
       * @param confluenceConfiguration Provides the configuration information to connect to
       * Confluence as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74a304598badf31a242e6c219d463310ff0402d1ba504e05151fd9cd5e8a00fe")
      public
          fun confluenceConfiguration(confluenceConfiguration: ConfluenceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param databaseConfiguration Provides the configuration information to connect to a
       * database as your data source.
       */
      public fun databaseConfiguration(databaseConfiguration: IResolvable)

      /**
       * @param databaseConfiguration Provides the configuration information to connect to a
       * database as your data source.
       */
      public fun databaseConfiguration(databaseConfiguration: DatabaseConfigurationProperty)

      /**
       * @param databaseConfiguration Provides the configuration information to connect to a
       * database as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e7bc2443f8f4a793561df05be393d6f8db933294ac12f96e1513bfe364e0b5f")
      public
          fun databaseConfiguration(databaseConfiguration: DatabaseConfigurationProperty.Builder.() -> Unit)

      /**
       * @param googleDriveConfiguration Provides the configuration information to connect to Google
       * Drive as your data source.
       */
      public fun googleDriveConfiguration(googleDriveConfiguration: IResolvable)

      /**
       * @param googleDriveConfiguration Provides the configuration information to connect to Google
       * Drive as your data source.
       */
      public
          fun googleDriveConfiguration(googleDriveConfiguration: GoogleDriveConfigurationProperty)

      /**
       * @param googleDriveConfiguration Provides the configuration information to connect to Google
       * Drive as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("07e628e0081db648e12f378eaf2c8281429fa94cf03828149f039ebfad0ef9a5")
      public
          fun googleDriveConfiguration(googleDriveConfiguration: GoogleDriveConfigurationProperty.Builder.() -> Unit)

      /**
       * @param oneDriveConfiguration Provides the configuration information to connect to Microsoft
       * OneDrive as your data source.
       */
      public fun oneDriveConfiguration(oneDriveConfiguration: IResolvable)

      /**
       * @param oneDriveConfiguration Provides the configuration information to connect to Microsoft
       * OneDrive as your data source.
       */
      public fun oneDriveConfiguration(oneDriveConfiguration: OneDriveConfigurationProperty)

      /**
       * @param oneDriveConfiguration Provides the configuration information to connect to Microsoft
       * OneDrive as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61abe0808a502e3528ac6cac5bcef15cb4e47fccda7c506d23eb6557936b8b52")
      public
          fun oneDriveConfiguration(oneDriveConfiguration: OneDriveConfigurationProperty.Builder.() -> Unit)

      /**
       * @param s3Configuration Provides the configuration information to connect to an Amazon S3
       * bucket as your data source.
       *
       * Amazon Kendra now supports an upgraded Amazon S3 connector.
       *
       * You must now use the
       * [TemplateConfiguration](https://docs.aws.amazon.com/kendra/latest/APIReference/API_TemplateConfiguration.html)
       * object instead of the `S3DataSourceConfiguration` object to configure your connector.
       *
       * Connectors configured using the older console and API architecture will continue to
       * function as configured. However, you won't be able to edit or update them. If you want to edit
       * or update your connector configuration, you must create a new connector.
       *
       * We recommended migrating your connector workflow to the upgraded version. Support for
       * connectors configured using the older architecture is scheduled to end by June 2024.
       */
      public fun s3Configuration(s3Configuration: IResolvable)

      /**
       * @param s3Configuration Provides the configuration information to connect to an Amazon S3
       * bucket as your data source.
       *
       * Amazon Kendra now supports an upgraded Amazon S3 connector.
       *
       * You must now use the
       * [TemplateConfiguration](https://docs.aws.amazon.com/kendra/latest/APIReference/API_TemplateConfiguration.html)
       * object instead of the `S3DataSourceConfiguration` object to configure your connector.
       *
       * Connectors configured using the older console and API architecture will continue to
       * function as configured. However, you won't be able to edit or update them. If you want to edit
       * or update your connector configuration, you must create a new connector.
       *
       * We recommended migrating your connector workflow to the upgraded version. Support for
       * connectors configured using the older architecture is scheduled to end by June 2024.
       */
      public fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty)

      /**
       * @param s3Configuration Provides the configuration information to connect to an Amazon S3
       * bucket as your data source.
       *
       * Amazon Kendra now supports an upgraded Amazon S3 connector.
       *
       * You must now use the
       * [TemplateConfiguration](https://docs.aws.amazon.com/kendra/latest/APIReference/API_TemplateConfiguration.html)
       * object instead of the `S3DataSourceConfiguration` object to configure your connector.
       *
       * Connectors configured using the older console and API architecture will continue to
       * function as configured. However, you won't be able to edit or update them. If you want to edit
       * or update your connector configuration, you must create a new connector.
       *
       * We recommended migrating your connector workflow to the upgraded version. Support for
       * connectors configured using the older architecture is scheduled to end by June 2024.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d80e7f32b0239da0e288cfb5e46c690fb93a60eabfaa4d3a0c88fc8a498c82b2")
      public
          fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param salesforceConfiguration Provides the configuration information to connect to
       * Salesforce as your data source.
       */
      public fun salesforceConfiguration(salesforceConfiguration: IResolvable)

      /**
       * @param salesforceConfiguration Provides the configuration information to connect to
       * Salesforce as your data source.
       */
      public fun salesforceConfiguration(salesforceConfiguration: SalesforceConfigurationProperty)

      /**
       * @param salesforceConfiguration Provides the configuration information to connect to
       * Salesforce as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69fda77f8ee5736ab588d12e3ae1a53741e45921c8c36c01c831fd588bba4cc5")
      public
          fun salesforceConfiguration(salesforceConfiguration: SalesforceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param serviceNowConfiguration Provides the configuration information to connect to
       * ServiceNow as your data source.
       */
      public fun serviceNowConfiguration(serviceNowConfiguration: IResolvable)

      /**
       * @param serviceNowConfiguration Provides the configuration information to connect to
       * ServiceNow as your data source.
       */
      public fun serviceNowConfiguration(serviceNowConfiguration: ServiceNowConfigurationProperty)

      /**
       * @param serviceNowConfiguration Provides the configuration information to connect to
       * ServiceNow as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da8e0f0b2d4dd7ffce7fca5554d53ae3b646ca01891b474180434900a91bee6c")
      public
          fun serviceNowConfiguration(serviceNowConfiguration: ServiceNowConfigurationProperty.Builder.() -> Unit)

      /**
       * @param sharePointConfiguration Provides the configuration information to connect to
       * Microsoft SharePoint as your data source.
       */
      public fun sharePointConfiguration(sharePointConfiguration: IResolvable)

      /**
       * @param sharePointConfiguration Provides the configuration information to connect to
       * Microsoft SharePoint as your data source.
       */
      public fun sharePointConfiguration(sharePointConfiguration: SharePointConfigurationProperty)

      /**
       * @param sharePointConfiguration Provides the configuration information to connect to
       * Microsoft SharePoint as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37d9fd47feaec1504f846956b823b88829564367e5619a776ee765b16e562757")
      public
          fun sharePointConfiguration(sharePointConfiguration: SharePointConfigurationProperty.Builder.() -> Unit)

      /**
       * @param templateConfiguration the value to be set.
       */
      public fun templateConfiguration(templateConfiguration: IResolvable)

      /**
       * @param templateConfiguration the value to be set.
       */
      public fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty)

      /**
       * @param templateConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("761ddab5ea2fb8114d8e3a3aad1ad2a6b467ea256238d87e7c81bae2db508d34")
      public
          fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty.Builder.() -> Unit)

      /**
       * @param webCrawlerConfiguration Provides the configuration information required for Amazon
       * Kendra Web Crawler.
       */
      public fun webCrawlerConfiguration(webCrawlerConfiguration: IResolvable)

      /**
       * @param webCrawlerConfiguration Provides the configuration information required for Amazon
       * Kendra Web Crawler.
       */
      public fun webCrawlerConfiguration(webCrawlerConfiguration: WebCrawlerConfigurationProperty)

      /**
       * @param webCrawlerConfiguration Provides the configuration information required for Amazon
       * Kendra Web Crawler.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("438d237d9d26bf2eeea70a2713abe3dd404fa9d182ff774239a1b8cd85ec7548")
      public
          fun webCrawlerConfiguration(webCrawlerConfiguration: WebCrawlerConfigurationProperty.Builder.() -> Unit)

      /**
       * @param workDocsConfiguration Provides the configuration information to connect to Amazon
       * WorkDocs as your data source.
       */
      public fun workDocsConfiguration(workDocsConfiguration: IResolvable)

      /**
       * @param workDocsConfiguration Provides the configuration information to connect to Amazon
       * WorkDocs as your data source.
       */
      public fun workDocsConfiguration(workDocsConfiguration: WorkDocsConfigurationProperty)

      /**
       * @param workDocsConfiguration Provides the configuration information to connect to Amazon
       * WorkDocs as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6b0e34b2f6369dcf764dff33a0dfa88bfc8ef9f7cdc214f6022f8a5c620580f")
      public
          fun workDocsConfiguration(workDocsConfiguration: WorkDocsConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty.builder()

      /**
       * @param confluenceConfiguration Provides the configuration information to connect to
       * Confluence as your data source.
       */
      override fun confluenceConfiguration(confluenceConfiguration: IResolvable) {
        cdkBuilder.confluenceConfiguration(confluenceConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param confluenceConfiguration Provides the configuration information to connect to
       * Confluence as your data source.
       */
      override
          fun confluenceConfiguration(confluenceConfiguration: ConfluenceConfigurationProperty) {
        cdkBuilder.confluenceConfiguration(confluenceConfiguration.let(ConfluenceConfigurationProperty::unwrap))
      }

      /**
       * @param confluenceConfiguration Provides the configuration information to connect to
       * Confluence as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74a304598badf31a242e6c219d463310ff0402d1ba504e05151fd9cd5e8a00fe")
      override
          fun confluenceConfiguration(confluenceConfiguration: ConfluenceConfigurationProperty.Builder.() -> Unit):
          Unit = confluenceConfiguration(ConfluenceConfigurationProperty(confluenceConfiguration))

      /**
       * @param databaseConfiguration Provides the configuration information to connect to a
       * database as your data source.
       */
      override fun databaseConfiguration(databaseConfiguration: IResolvable) {
        cdkBuilder.databaseConfiguration(databaseConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param databaseConfiguration Provides the configuration information to connect to a
       * database as your data source.
       */
      override fun databaseConfiguration(databaseConfiguration: DatabaseConfigurationProperty) {
        cdkBuilder.databaseConfiguration(databaseConfiguration.let(DatabaseConfigurationProperty::unwrap))
      }

      /**
       * @param databaseConfiguration Provides the configuration information to connect to a
       * database as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e7bc2443f8f4a793561df05be393d6f8db933294ac12f96e1513bfe364e0b5f")
      override
          fun databaseConfiguration(databaseConfiguration: DatabaseConfigurationProperty.Builder.() -> Unit):
          Unit = databaseConfiguration(DatabaseConfigurationProperty(databaseConfiguration))

      /**
       * @param googleDriveConfiguration Provides the configuration information to connect to Google
       * Drive as your data source.
       */
      override fun googleDriveConfiguration(googleDriveConfiguration: IResolvable) {
        cdkBuilder.googleDriveConfiguration(googleDriveConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param googleDriveConfiguration Provides the configuration information to connect to Google
       * Drive as your data source.
       */
      override
          fun googleDriveConfiguration(googleDriveConfiguration: GoogleDriveConfigurationProperty) {
        cdkBuilder.googleDriveConfiguration(googleDriveConfiguration.let(GoogleDriveConfigurationProperty::unwrap))
      }

      /**
       * @param googleDriveConfiguration Provides the configuration information to connect to Google
       * Drive as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("07e628e0081db648e12f378eaf2c8281429fa94cf03828149f039ebfad0ef9a5")
      override
          fun googleDriveConfiguration(googleDriveConfiguration: GoogleDriveConfigurationProperty.Builder.() -> Unit):
          Unit =
          googleDriveConfiguration(GoogleDriveConfigurationProperty(googleDriveConfiguration))

      /**
       * @param oneDriveConfiguration Provides the configuration information to connect to Microsoft
       * OneDrive as your data source.
       */
      override fun oneDriveConfiguration(oneDriveConfiguration: IResolvable) {
        cdkBuilder.oneDriveConfiguration(oneDriveConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param oneDriveConfiguration Provides the configuration information to connect to Microsoft
       * OneDrive as your data source.
       */
      override fun oneDriveConfiguration(oneDriveConfiguration: OneDriveConfigurationProperty) {
        cdkBuilder.oneDriveConfiguration(oneDriveConfiguration.let(OneDriveConfigurationProperty::unwrap))
      }

      /**
       * @param oneDriveConfiguration Provides the configuration information to connect to Microsoft
       * OneDrive as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61abe0808a502e3528ac6cac5bcef15cb4e47fccda7c506d23eb6557936b8b52")
      override
          fun oneDriveConfiguration(oneDriveConfiguration: OneDriveConfigurationProperty.Builder.() -> Unit):
          Unit = oneDriveConfiguration(OneDriveConfigurationProperty(oneDriveConfiguration))

      /**
       * @param s3Configuration Provides the configuration information to connect to an Amazon S3
       * bucket as your data source.
       *
       * Amazon Kendra now supports an upgraded Amazon S3 connector.
       *
       * You must now use the
       * [TemplateConfiguration](https://docs.aws.amazon.com/kendra/latest/APIReference/API_TemplateConfiguration.html)
       * object instead of the `S3DataSourceConfiguration` object to configure your connector.
       *
       * Connectors configured using the older console and API architecture will continue to
       * function as configured. However, you won't be able to edit or update them. If you want to edit
       * or update your connector configuration, you must create a new connector.
       *
       * We recommended migrating your connector workflow to the upgraded version. Support for
       * connectors configured using the older architecture is scheduled to end by June 2024.
       */
      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      /**
       * @param s3Configuration Provides the configuration information to connect to an Amazon S3
       * bucket as your data source.
       *
       * Amazon Kendra now supports an upgraded Amazon S3 connector.
       *
       * You must now use the
       * [TemplateConfiguration](https://docs.aws.amazon.com/kendra/latest/APIReference/API_TemplateConfiguration.html)
       * object instead of the `S3DataSourceConfiguration` object to configure your connector.
       *
       * Connectors configured using the older console and API architecture will continue to
       * function as configured. However, you won't be able to edit or update them. If you want to edit
       * or update your connector configuration, you must create a new connector.
       *
       * We recommended migrating your connector workflow to the upgraded version. Support for
       * connectors configured using the older architecture is scheduled to end by June 2024.
       */
      override fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DataSourceConfigurationProperty::unwrap))
      }

      /**
       * @param s3Configuration Provides the configuration information to connect to an Amazon S3
       * bucket as your data source.
       *
       * Amazon Kendra now supports an upgraded Amazon S3 connector.
       *
       * You must now use the
       * [TemplateConfiguration](https://docs.aws.amazon.com/kendra/latest/APIReference/API_TemplateConfiguration.html)
       * object instead of the `S3DataSourceConfiguration` object to configure your connector.
       *
       * Connectors configured using the older console and API architecture will continue to
       * function as configured. However, you won't be able to edit or update them. If you want to edit
       * or update your connector configuration, you must create a new connector.
       *
       * We recommended migrating your connector workflow to the upgraded version. Support for
       * connectors configured using the older architecture is scheduled to end by June 2024.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d80e7f32b0239da0e288cfb5e46c690fb93a60eabfaa4d3a0c88fc8a498c82b2")
      override
          fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DataSourceConfigurationProperty(s3Configuration))

      /**
       * @param salesforceConfiguration Provides the configuration information to connect to
       * Salesforce as your data source.
       */
      override fun salesforceConfiguration(salesforceConfiguration: IResolvable) {
        cdkBuilder.salesforceConfiguration(salesforceConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param salesforceConfiguration Provides the configuration information to connect to
       * Salesforce as your data source.
       */
      override
          fun salesforceConfiguration(salesforceConfiguration: SalesforceConfigurationProperty) {
        cdkBuilder.salesforceConfiguration(salesforceConfiguration.let(SalesforceConfigurationProperty::unwrap))
      }

      /**
       * @param salesforceConfiguration Provides the configuration information to connect to
       * Salesforce as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69fda77f8ee5736ab588d12e3ae1a53741e45921c8c36c01c831fd588bba4cc5")
      override
          fun salesforceConfiguration(salesforceConfiguration: SalesforceConfigurationProperty.Builder.() -> Unit):
          Unit = salesforceConfiguration(SalesforceConfigurationProperty(salesforceConfiguration))

      /**
       * @param serviceNowConfiguration Provides the configuration information to connect to
       * ServiceNow as your data source.
       */
      override fun serviceNowConfiguration(serviceNowConfiguration: IResolvable) {
        cdkBuilder.serviceNowConfiguration(serviceNowConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param serviceNowConfiguration Provides the configuration information to connect to
       * ServiceNow as your data source.
       */
      override
          fun serviceNowConfiguration(serviceNowConfiguration: ServiceNowConfigurationProperty) {
        cdkBuilder.serviceNowConfiguration(serviceNowConfiguration.let(ServiceNowConfigurationProperty::unwrap))
      }

      /**
       * @param serviceNowConfiguration Provides the configuration information to connect to
       * ServiceNow as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da8e0f0b2d4dd7ffce7fca5554d53ae3b646ca01891b474180434900a91bee6c")
      override
          fun serviceNowConfiguration(serviceNowConfiguration: ServiceNowConfigurationProperty.Builder.() -> Unit):
          Unit = serviceNowConfiguration(ServiceNowConfigurationProperty(serviceNowConfiguration))

      /**
       * @param sharePointConfiguration Provides the configuration information to connect to
       * Microsoft SharePoint as your data source.
       */
      override fun sharePointConfiguration(sharePointConfiguration: IResolvable) {
        cdkBuilder.sharePointConfiguration(sharePointConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param sharePointConfiguration Provides the configuration information to connect to
       * Microsoft SharePoint as your data source.
       */
      override
          fun sharePointConfiguration(sharePointConfiguration: SharePointConfigurationProperty) {
        cdkBuilder.sharePointConfiguration(sharePointConfiguration.let(SharePointConfigurationProperty::unwrap))
      }

      /**
       * @param sharePointConfiguration Provides the configuration information to connect to
       * Microsoft SharePoint as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37d9fd47feaec1504f846956b823b88829564367e5619a776ee765b16e562757")
      override
          fun sharePointConfiguration(sharePointConfiguration: SharePointConfigurationProperty.Builder.() -> Unit):
          Unit = sharePointConfiguration(SharePointConfigurationProperty(sharePointConfiguration))

      /**
       * @param templateConfiguration the value to be set.
       */
      override fun templateConfiguration(templateConfiguration: IResolvable) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param templateConfiguration the value to be set.
       */
      override fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(TemplateConfigurationProperty::unwrap))
      }

      /**
       * @param templateConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("761ddab5ea2fb8114d8e3a3aad1ad2a6b467ea256238d87e7c81bae2db508d34")
      override
          fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty.Builder.() -> Unit):
          Unit = templateConfiguration(TemplateConfigurationProperty(templateConfiguration))

      /**
       * @param webCrawlerConfiguration Provides the configuration information required for Amazon
       * Kendra Web Crawler.
       */
      override fun webCrawlerConfiguration(webCrawlerConfiguration: IResolvable) {
        cdkBuilder.webCrawlerConfiguration(webCrawlerConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param webCrawlerConfiguration Provides the configuration information required for Amazon
       * Kendra Web Crawler.
       */
      override
          fun webCrawlerConfiguration(webCrawlerConfiguration: WebCrawlerConfigurationProperty) {
        cdkBuilder.webCrawlerConfiguration(webCrawlerConfiguration.let(WebCrawlerConfigurationProperty::unwrap))
      }

      /**
       * @param webCrawlerConfiguration Provides the configuration information required for Amazon
       * Kendra Web Crawler.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("438d237d9d26bf2eeea70a2713abe3dd404fa9d182ff774239a1b8cd85ec7548")
      override
          fun webCrawlerConfiguration(webCrawlerConfiguration: WebCrawlerConfigurationProperty.Builder.() -> Unit):
          Unit = webCrawlerConfiguration(WebCrawlerConfigurationProperty(webCrawlerConfiguration))

      /**
       * @param workDocsConfiguration Provides the configuration information to connect to Amazon
       * WorkDocs as your data source.
       */
      override fun workDocsConfiguration(workDocsConfiguration: IResolvable) {
        cdkBuilder.workDocsConfiguration(workDocsConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param workDocsConfiguration Provides the configuration information to connect to Amazon
       * WorkDocs as your data source.
       */
      override fun workDocsConfiguration(workDocsConfiguration: WorkDocsConfigurationProperty) {
        cdkBuilder.workDocsConfiguration(workDocsConfiguration.let(WorkDocsConfigurationProperty::unwrap))
      }

      /**
       * @param workDocsConfiguration Provides the configuration information to connect to Amazon
       * WorkDocs as your data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6b0e34b2f6369dcf764dff33a0dfa88bfc8ef9f7cdc214f6022f8a5c620580f")
      override
          fun workDocsConfiguration(workDocsConfiguration: WorkDocsConfigurationProperty.Builder.() -> Unit):
          Unit = workDocsConfiguration(WorkDocsConfigurationProperty(workDocsConfiguration))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty,
    ) : CdkObject(cdkObject), DataSourceConfigurationProperty {
      /**
       * Provides the configuration information to connect to Confluence as your data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-confluenceconfiguration)
       */
      override fun confluenceConfiguration(): Any? = unwrap(this).getConfluenceConfiguration()

      /**
       * Provides the configuration information to connect to a database as your data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-databaseconfiguration)
       */
      override fun databaseConfiguration(): Any? = unwrap(this).getDatabaseConfiguration()

      /**
       * Provides the configuration information to connect to Google Drive as your data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-googledriveconfiguration)
       */
      override fun googleDriveConfiguration(): Any? = unwrap(this).getGoogleDriveConfiguration()

      /**
       * Provides the configuration information to connect to Microsoft OneDrive as your data
       * source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-onedriveconfiguration)
       */
      override fun oneDriveConfiguration(): Any? = unwrap(this).getOneDriveConfiguration()

      /**
       * Provides the configuration information to connect to an Amazon S3 bucket as your data
       * source.
       *
       *
       * Amazon Kendra now supports an upgraded Amazon S3 connector.
       *
       * You must now use the
       * [TemplateConfiguration](https://docs.aws.amazon.com/kendra/latest/APIReference/API_TemplateConfiguration.html)
       * object instead of the `S3DataSourceConfiguration` object to configure your connector.
       *
       * Connectors configured using the older console and API architecture will continue to
       * function as configured. However, you won't be able to edit or update them. If you want to edit
       * or update your connector configuration, you must create a new connector.
       *
       * We recommended migrating your connector workflow to the upgraded version. Support for
       * connectors configured using the older architecture is scheduled to end by June 2024.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-s3configuration)
       */
      override fun s3Configuration(): Any? = unwrap(this).getS3Configuration()

      /**
       * Provides the configuration information to connect to Salesforce as your data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-salesforceconfiguration)
       */
      override fun salesforceConfiguration(): Any? = unwrap(this).getSalesforceConfiguration()

      /**
       * Provides the configuration information to connect to ServiceNow as your data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-servicenowconfiguration)
       */
      override fun serviceNowConfiguration(): Any? = unwrap(this).getServiceNowConfiguration()

      /**
       * Provides the configuration information to connect to Microsoft SharePoint as your data
       * source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-sharepointconfiguration)
       */
      override fun sharePointConfiguration(): Any? = unwrap(this).getSharePointConfiguration()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-templateconfiguration)
       */
      override fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

      /**
       * Provides the configuration information required for Amazon Kendra Web Crawler.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-webcrawlerconfiguration)
       */
      override fun webCrawlerConfiguration(): Any? = unwrap(this).getWebCrawlerConfiguration()

      /**
       * Provides the configuration information to connect to Amazon WorkDocs as your data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourceconfiguration.html#cfn-kendra-datasource-datasourceconfiguration-workdocsconfiguration)
       */
      override fun workDocsConfiguration(): Any? = unwrap(this).getWorkDocsConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty):
          DataSourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty
    }
  }

  /**
   * Specifies configuration information for indexing a single standard object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface SalesforceStandardObjectConfigurationProperty {
    /**
     * The name of the field in the standard object table that contains the document contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardobjectconfiguration.html#cfn-kendra-datasource-salesforcestandardobjectconfiguration-documentdatafieldname)
     */
    public fun documentDataFieldName(): String

    /**
     * The name of the field in the standard object table that contains the document title.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardobjectconfiguration.html#cfn-kendra-datasource-salesforcestandardobjectconfiguration-documenttitlefieldname)
     */
    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    /**
     * Maps attributes or field names of the standard object to Amazon Kendra index field names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
     * more information, see [Mapping data source
     * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
     * source field names must exist in your Salesforce custom metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardobjectconfiguration.html#cfn-kendra-datasource-salesforcestandardobjectconfiguration-fieldmappings)
     */
    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    /**
     * The name of the standard object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardobjectconfiguration.html#cfn-kendra-datasource-salesforcestandardobjectconfiguration-name)
     */
    public fun name(): String

    /**
     * A builder for [SalesforceStandardObjectConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param documentDataFieldName The name of the field in the standard object table that
       * contains the document contents. 
       */
      public fun documentDataFieldName(documentDataFieldName: String)

      /**
       * @param documentTitleFieldName The name of the field in the standard object table that
       * contains the document title.
       */
      public fun documentTitleFieldName(documentTitleFieldName: String)

      /**
       * @param fieldMappings Maps attributes or field names of the standard object to Amazon Kendra
       * index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      public fun fieldMappings(fieldMappings: IResolvable)

      /**
       * @param fieldMappings Maps attributes or field names of the standard object to Amazon Kendra
       * index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      public fun fieldMappings(fieldMappings: List<Any>)

      /**
       * @param fieldMappings Maps attributes or field names of the standard object to Amazon Kendra
       * index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      public fun fieldMappings(vararg fieldMappings: Any)

      /**
       * @param name The name of the standard object. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty.builder()

      /**
       * @param documentDataFieldName The name of the field in the standard object table that
       * contains the document contents. 
       */
      override fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
      }

      /**
       * @param documentTitleFieldName The name of the field in the standard object table that
       * contains the document title.
       */
      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      /**
       * @param fieldMappings Maps attributes or field names of the standard object to Amazon Kendra
       * index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param fieldMappings Maps attributes or field names of the standard object to Amazon Kendra
       * index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      /**
       * @param fieldMappings Maps attributes or field names of the standard object to Amazon Kendra
       * index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       */
      override fun fieldMappings(vararg fieldMappings: Any): Unit =
          fieldMappings(fieldMappings.toList())

      /**
       * @param name The name of the standard object. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty,
    ) : CdkObject(cdkObject), SalesforceStandardObjectConfigurationProperty {
      /**
       * The name of the field in the standard object table that contains the document contents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardobjectconfiguration.html#cfn-kendra-datasource-salesforcestandardobjectconfiguration-documentdatafieldname)
       */
      override fun documentDataFieldName(): String = unwrap(this).getDocumentDataFieldName()

      /**
       * The name of the field in the standard object table that contains the document title.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardobjectconfiguration.html#cfn-kendra-datasource-salesforcestandardobjectconfiguration-documenttitlefieldname)
       */
      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      /**
       * Maps attributes or field names of the standard object to Amazon Kendra index field names.
       *
       * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
       * source field names must exist in your Salesforce custom metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardobjectconfiguration.html#cfn-kendra-datasource-salesforcestandardobjectconfiguration-fieldmappings)
       */
      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      /**
       * The name of the standard object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardobjectconfiguration.html#cfn-kendra-datasource-salesforcestandardobjectconfiguration-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceStandardObjectConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty):
          SalesforceStandardObjectConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceStandardObjectConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty
    }
  }

  /**
   * Provides the configuration information of the sitemap URLs to crawl.
   *
   * *When selecting websites to index, you must adhere to the [Amazon Acceptable Use
   * Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms. Remember that you must only
   * use the Amazon Kendra web crawler to index your own webpages, or webpages that you have
   * authorization to index.*
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
   * WebCrawlerSiteMapsConfigurationProperty webCrawlerSiteMapsConfigurationProperty =
   * WebCrawlerSiteMapsConfigurationProperty.builder()
   * .siteMaps(List.of("siteMaps"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlersitemapsconfiguration.html)
   */
  public interface WebCrawlerSiteMapsConfigurationProperty {
    /**
     * The list of sitemap URLs of the websites you want to crawl.
     *
     * The list can include a maximum of three sitemap URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlersitemapsconfiguration.html#cfn-kendra-datasource-webcrawlersitemapsconfiguration-sitemaps)
     */
    public fun siteMaps(): List<String>

    /**
     * A builder for [WebCrawlerSiteMapsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param siteMaps The list of sitemap URLs of the websites you want to crawl. 
       * The list can include a maximum of three sitemap URLs.
       */
      public fun siteMaps(siteMaps: List<String>)

      /**
       * @param siteMaps The list of sitemap URLs of the websites you want to crawl. 
       * The list can include a maximum of three sitemap URLs.
       */
      public fun siteMaps(vararg siteMaps: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty.builder()

      /**
       * @param siteMaps The list of sitemap URLs of the websites you want to crawl. 
       * The list can include a maximum of three sitemap URLs.
       */
      override fun siteMaps(siteMaps: List<String>) {
        cdkBuilder.siteMaps(siteMaps)
      }

      /**
       * @param siteMaps The list of sitemap URLs of the websites you want to crawl. 
       * The list can include a maximum of three sitemap URLs.
       */
      override fun siteMaps(vararg siteMaps: String): Unit = siteMaps(siteMaps.toList())

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty,
    ) : CdkObject(cdkObject), WebCrawlerSiteMapsConfigurationProperty {
      /**
       * The list of sitemap URLs of the websites you want to crawl.
       *
       * The list can include a maximum of three sitemap URLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlersitemapsconfiguration.html#cfn-kendra-datasource-webcrawlersitemapsconfiguration-sitemaps)
       */
      override fun siteMaps(): List<String> = unwrap(this).getSiteMaps()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          WebCrawlerSiteMapsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty):
          WebCrawlerSiteMapsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebCrawlerSiteMapsConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty
    }
  }

  /**
   * Provides the configuration information that's required to connect to a database.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface ConnectionConfigurationProperty {
    /**
     * The name of the host for the database.
     *
     * Can be either a string (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-connectionconfiguration.html#cfn-kendra-datasource-connectionconfiguration-databasehost)
     */
    public fun databaseHost(): String

    /**
     * The name of the database containing the document data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-connectionconfiguration.html#cfn-kendra-datasource-connectionconfiguration-databasename)
     */
    public fun databaseName(): String

    /**
     * The port that the database uses for connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-connectionconfiguration.html#cfn-kendra-datasource-connectionconfiguration-databaseport)
     */
    public fun databasePort(): Number

    /**
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager .
     *
     * The credentials should be a user/password pair. For more information, see [Using a Database
     * Data Source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html) . For more
     * information about AWS Secrets Manager , see [What Is AWS Secrets
     * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) in the *AWS
     * Secrets Manager* user guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-connectionconfiguration.html#cfn-kendra-datasource-connectionconfiguration-secretarn)
     */
    public fun secretArn(): String

    /**
     * The name of the table that contains the document data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-connectionconfiguration.html#cfn-kendra-datasource-connectionconfiguration-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [ConnectionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param databaseHost The name of the host for the database. 
       * Can be either a string (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
       */
      public fun databaseHost(databaseHost: String)

      /**
       * @param databaseName The name of the database containing the document data. 
       */
      public fun databaseName(databaseName: String)

      /**
       * @param databasePort The port that the database uses for connections. 
       */
      public fun databasePort(databasePort: Number)

      /**
       * @param secretArn The Amazon Resource Name (ARN) of credentials stored in AWS Secrets
       * Manager . 
       * The credentials should be a user/password pair. For more information, see [Using a Database
       * Data Source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html) . For
       * more information about AWS Secrets Manager , see [What Is AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) in the *AWS
       * Secrets Manager* user guide.
       */
      public fun secretArn(secretArn: String)

      /**
       * @param tableName The name of the table that contains the document data. 
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty.builder()

      /**
       * @param databaseHost The name of the host for the database. 
       * Can be either a string (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
       */
      override fun databaseHost(databaseHost: String) {
        cdkBuilder.databaseHost(databaseHost)
      }

      /**
       * @param databaseName The name of the database containing the document data. 
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param databasePort The port that the database uses for connections. 
       */
      override fun databasePort(databasePort: Number) {
        cdkBuilder.databasePort(databasePort)
      }

      /**
       * @param secretArn The Amazon Resource Name (ARN) of credentials stored in AWS Secrets
       * Manager . 
       * The credentials should be a user/password pair. For more information, see [Using a Database
       * Data Source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html) . For
       * more information about AWS Secrets Manager , see [What Is AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) in the *AWS
       * Secrets Manager* user guide.
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      /**
       * @param tableName The name of the table that contains the document data. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty,
    ) : CdkObject(cdkObject), ConnectionConfigurationProperty {
      /**
       * The name of the host for the database.
       *
       * Can be either a string (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-connectionconfiguration.html#cfn-kendra-datasource-connectionconfiguration-databasehost)
       */
      override fun databaseHost(): String = unwrap(this).getDatabaseHost()

      /**
       * The name of the database containing the document data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-connectionconfiguration.html#cfn-kendra-datasource-connectionconfiguration-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * The port that the database uses for connections.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-connectionconfiguration.html#cfn-kendra-datasource-connectionconfiguration-databaseport)
       */
      override fun databasePort(): Number = unwrap(this).getDatabasePort()

      /**
       * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager .
       *
       * The credentials should be a user/password pair. For more information, see [Using a Database
       * Data Source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html) . For
       * more information about AWS Secrets Manager , see [What Is AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) in the *AWS
       * Secrets Manager* user guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-connectionconfiguration.html#cfn-kendra-datasource-connectionconfiguration-secretarn)
       */
      override fun secretArn(): String = unwrap(this).getSecretArn()

      /**
       * The name of the table that contains the document data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-connectionconfiguration.html#cfn-kendra-datasource-connectionconfiguration-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty):
          ConnectionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty
    }
  }

  /**
   * Provides the configuration information to connect to Amazon WorkDocs as your data source.
   *
   * Amazon WorkDocs connector is available in Oregon, North Virginia, Sydney, Singapore and Ireland
   * regions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface WorkDocsConfigurationProperty {
    /**
     * `TRUE` to include comments on documents in your index.
     *
     * Including comments in your index means each comment is a document that can be searched on.
     *
     * The default is set to `FALSE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-workdocsconfiguration.html#cfn-kendra-datasource-workdocsconfiguration-crawlcomments)
     */
    public fun crawlComments(): Any? = unwrap(this).getCrawlComments()

    /**
     * A list of regular expression patterns to exclude certain files in your Amazon WorkDocs site
     * repository.
     *
     * Files that match the patterns are excluded from the index. Files that don’t match the
     * patterns are included in the index. If a file matches both an inclusion and exclusion pattern,
     * the exclusion pattern takes precedence and the file isn't included in the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-workdocsconfiguration.html#cfn-kendra-datasource-workdocsconfiguration-exclusionpatterns)
     */
    public fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
        emptyList()

    /**
     * A list of `DataSourceToIndexFieldMapping` objects that map Amazon WorkDocs data source
     * attributes or field names to Amazon Kendra index field names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to Amazon WorkDocs fields.
     * For more information, see [Mapping data source
     * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Amazon WorkDocs
     * data source field names must exist in your Amazon WorkDocs custom metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-workdocsconfiguration.html#cfn-kendra-datasource-workdocsconfiguration-fieldmappings)
     */
    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    /**
     * A list of regular expression patterns to include certain files in your Amazon WorkDocs site
     * repository.
     *
     * Files that match the patterns are included in the index. Files that don't match the patterns
     * are excluded from the index. If a file matches both an inclusion and exclusion pattern, the
     * exclusion pattern takes precedence and the file isn't included in the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-workdocsconfiguration.html#cfn-kendra-datasource-workdocsconfiguration-inclusionpatterns)
     */
    public fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
        emptyList()

    /**
     * The identifier of the directory corresponding to your Amazon WorkDocs site repository.
     *
     * You can find the organization ID in the [AWS Directory
     * Service](https://docs.aws.amazon.com/directoryservicev2/) by going to *Active Directory* , then
     * *Directories* . Your Amazon WorkDocs site directory has an ID, which is the organization ID. You
     * can also set up a new Amazon WorkDocs directory in the AWS Directory Service console and enable
     * a Amazon WorkDocs site for the directory in the Amazon WorkDocs console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-workdocsconfiguration.html#cfn-kendra-datasource-workdocsconfiguration-organizationid)
     */
    public fun organizationId(): String

    /**
     * `TRUE` to use the Amazon WorkDocs change log to determine which documents require updating in
     * the index.
     *
     * Depending on the change log's size, it may take longer for Amazon Kendra to use the change
     * log than to scan all of your documents in Amazon WorkDocs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-workdocsconfiguration.html#cfn-kendra-datasource-workdocsconfiguration-usechangelog)
     */
    public fun useChangeLog(): Any? = unwrap(this).getUseChangeLog()

    /**
     * A builder for [WorkDocsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crawlComments `TRUE` to include comments on documents in your index.
       * Including comments in your index means each comment is a document that can be searched on.
       *
       * The default is set to `FALSE` .
       */
      public fun crawlComments(crawlComments: Boolean)

      /**
       * @param crawlComments `TRUE` to include comments on documents in your index.
       * Including comments in your index means each comment is a document that can be searched on.
       *
       * The default is set to `FALSE` .
       */
      public fun crawlComments(crawlComments: IResolvable)

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain files in
       * your Amazon WorkDocs site repository.
       * Files that match the patterns are excluded from the index. Files that don’t match the
       * patterns are included in the index. If a file matches both an inclusion and exclusion pattern,
       * the exclusion pattern takes precedence and the file isn't included in the index.
       */
      public fun exclusionPatterns(exclusionPatterns: List<String>)

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain files in
       * your Amazon WorkDocs site repository.
       * Files that match the patterns are excluded from the index. Files that don’t match the
       * patterns are included in the index. If a file matches both an inclusion and exclusion pattern,
       * the exclusion pattern takes precedence and the file isn't included in the index.
       */
      public fun exclusionPatterns(vararg exclusionPatterns: String)

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Amazon
       * WorkDocs data source attributes or field names to Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Amazon WorkDocs
       * fields. For more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Amazon WorkDocs
       * data source field names must exist in your Amazon WorkDocs custom metadata.
       */
      public fun fieldMappings(fieldMappings: IResolvable)

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Amazon
       * WorkDocs data source attributes or field names to Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Amazon WorkDocs
       * fields. For more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Amazon WorkDocs
       * data source field names must exist in your Amazon WorkDocs custom metadata.
       */
      public fun fieldMappings(fieldMappings: List<Any>)

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Amazon
       * WorkDocs data source attributes or field names to Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Amazon WorkDocs
       * fields. For more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Amazon WorkDocs
       * data source field names must exist in your Amazon WorkDocs custom metadata.
       */
      public fun fieldMappings(vararg fieldMappings: Any)

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain files in
       * your Amazon WorkDocs site repository.
       * Files that match the patterns are included in the index. Files that don't match the
       * patterns are excluded from the index. If a file matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the file isn't included in the index.
       */
      public fun inclusionPatterns(inclusionPatterns: List<String>)

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain files in
       * your Amazon WorkDocs site repository.
       * Files that match the patterns are included in the index. Files that don't match the
       * patterns are excluded from the index. If a file matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the file isn't included in the index.
       */
      public fun inclusionPatterns(vararg inclusionPatterns: String)

      /**
       * @param organizationId The identifier of the directory corresponding to your Amazon WorkDocs
       * site repository. 
       * You can find the organization ID in the [AWS Directory
       * Service](https://docs.aws.amazon.com/directoryservicev2/) by going to *Active Directory* ,
       * then *Directories* . Your Amazon WorkDocs site directory has an ID, which is the organization
       * ID. You can also set up a new Amazon WorkDocs directory in the AWS Directory Service console
       * and enable a Amazon WorkDocs site for the directory in the Amazon WorkDocs console.
       */
      public fun organizationId(organizationId: String)

      /**
       * @param useChangeLog `TRUE` to use the Amazon WorkDocs change log to determine which
       * documents require updating in the index.
       * Depending on the change log's size, it may take longer for Amazon Kendra to use the change
       * log than to scan all of your documents in Amazon WorkDocs.
       */
      public fun useChangeLog(useChangeLog: Boolean)

      /**
       * @param useChangeLog `TRUE` to use the Amazon WorkDocs change log to determine which
       * documents require updating in the index.
       * Depending on the change log's size, it may take longer for Amazon Kendra to use the change
       * log than to scan all of your documents in Amazon WorkDocs.
       */
      public fun useChangeLog(useChangeLog: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty.builder()

      /**
       * @param crawlComments `TRUE` to include comments on documents in your index.
       * Including comments in your index means each comment is a document that can be searched on.
       *
       * The default is set to `FALSE` .
       */
      override fun crawlComments(crawlComments: Boolean) {
        cdkBuilder.crawlComments(crawlComments)
      }

      /**
       * @param crawlComments `TRUE` to include comments on documents in your index.
       * Including comments in your index means each comment is a document that can be searched on.
       *
       * The default is set to `FALSE` .
       */
      override fun crawlComments(crawlComments: IResolvable) {
        cdkBuilder.crawlComments(crawlComments.let(IResolvable::unwrap))
      }

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain files in
       * your Amazon WorkDocs site repository.
       * Files that match the patterns are excluded from the index. Files that don’t match the
       * patterns are included in the index. If a file matches both an inclusion and exclusion pattern,
       * the exclusion pattern takes precedence and the file isn't included in the index.
       */
      override fun exclusionPatterns(exclusionPatterns: List<String>) {
        cdkBuilder.exclusionPatterns(exclusionPatterns)
      }

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain files in
       * your Amazon WorkDocs site repository.
       * Files that match the patterns are excluded from the index. Files that don’t match the
       * patterns are included in the index. If a file matches both an inclusion and exclusion pattern,
       * the exclusion pattern takes precedence and the file isn't included in the index.
       */
      override fun exclusionPatterns(vararg exclusionPatterns: String): Unit =
          exclusionPatterns(exclusionPatterns.toList())

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Amazon
       * WorkDocs data source attributes or field names to Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Amazon WorkDocs
       * fields. For more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Amazon WorkDocs
       * data source field names must exist in your Amazon WorkDocs custom metadata.
       */
      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Amazon
       * WorkDocs data source attributes or field names to Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Amazon WorkDocs
       * fields. For more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Amazon WorkDocs
       * data source field names must exist in your Amazon WorkDocs custom metadata.
       */
      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      /**
       * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Amazon
       * WorkDocs data source attributes or field names to Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Amazon WorkDocs
       * fields. For more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Amazon WorkDocs
       * data source field names must exist in your Amazon WorkDocs custom metadata.
       */
      override fun fieldMappings(vararg fieldMappings: Any): Unit =
          fieldMappings(fieldMappings.toList())

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain files in
       * your Amazon WorkDocs site repository.
       * Files that match the patterns are included in the index. Files that don't match the
       * patterns are excluded from the index. If a file matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the file isn't included in the index.
       */
      override fun inclusionPatterns(inclusionPatterns: List<String>) {
        cdkBuilder.inclusionPatterns(inclusionPatterns)
      }

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain files in
       * your Amazon WorkDocs site repository.
       * Files that match the patterns are included in the index. Files that don't match the
       * patterns are excluded from the index. If a file matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the file isn't included in the index.
       */
      override fun inclusionPatterns(vararg inclusionPatterns: String): Unit =
          inclusionPatterns(inclusionPatterns.toList())

      /**
       * @param organizationId The identifier of the directory corresponding to your Amazon WorkDocs
       * site repository. 
       * You can find the organization ID in the [AWS Directory
       * Service](https://docs.aws.amazon.com/directoryservicev2/) by going to *Active Directory* ,
       * then *Directories* . Your Amazon WorkDocs site directory has an ID, which is the organization
       * ID. You can also set up a new Amazon WorkDocs directory in the AWS Directory Service console
       * and enable a Amazon WorkDocs site for the directory in the Amazon WorkDocs console.
       */
      override fun organizationId(organizationId: String) {
        cdkBuilder.organizationId(organizationId)
      }

      /**
       * @param useChangeLog `TRUE` to use the Amazon WorkDocs change log to determine which
       * documents require updating in the index.
       * Depending on the change log's size, it may take longer for Amazon Kendra to use the change
       * log than to scan all of your documents in Amazon WorkDocs.
       */
      override fun useChangeLog(useChangeLog: Boolean) {
        cdkBuilder.useChangeLog(useChangeLog)
      }

      /**
       * @param useChangeLog `TRUE` to use the Amazon WorkDocs change log to determine which
       * documents require updating in the index.
       * Depending on the change log's size, it may take longer for Amazon Kendra to use the change
       * log than to scan all of your documents in Amazon WorkDocs.
       */
      override fun useChangeLog(useChangeLog: IResolvable) {
        cdkBuilder.useChangeLog(useChangeLog.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty,
    ) : CdkObject(cdkObject), WorkDocsConfigurationProperty {
      /**
       * `TRUE` to include comments on documents in your index.
       *
       * Including comments in your index means each comment is a document that can be searched on.
       *
       * The default is set to `FALSE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-workdocsconfiguration.html#cfn-kendra-datasource-workdocsconfiguration-crawlcomments)
       */
      override fun crawlComments(): Any? = unwrap(this).getCrawlComments()

      /**
       * A list of regular expression patterns to exclude certain files in your Amazon WorkDocs site
       * repository.
       *
       * Files that match the patterns are excluded from the index. Files that don’t match the
       * patterns are included in the index. If a file matches both an inclusion and exclusion pattern,
       * the exclusion pattern takes precedence and the file isn't included in the index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-workdocsconfiguration.html#cfn-kendra-datasource-workdocsconfiguration-exclusionpatterns)
       */
      override fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
          emptyList()

      /**
       * A list of `DataSourceToIndexFieldMapping` objects that map Amazon WorkDocs data source
       * attributes or field names to Amazon Kendra index field names.
       *
       * To create custom fields, use the `UpdateIndex` API before you map to Amazon WorkDocs
       * fields. For more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Amazon WorkDocs
       * data source field names must exist in your Amazon WorkDocs custom metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-workdocsconfiguration.html#cfn-kendra-datasource-workdocsconfiguration-fieldmappings)
       */
      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      /**
       * A list of regular expression patterns to include certain files in your Amazon WorkDocs site
       * repository.
       *
       * Files that match the patterns are included in the index. Files that don't match the
       * patterns are excluded from the index. If a file matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the file isn't included in the index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-workdocsconfiguration.html#cfn-kendra-datasource-workdocsconfiguration-inclusionpatterns)
       */
      override fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
          emptyList()

      /**
       * The identifier of the directory corresponding to your Amazon WorkDocs site repository.
       *
       * You can find the organization ID in the [AWS Directory
       * Service](https://docs.aws.amazon.com/directoryservicev2/) by going to *Active Directory* ,
       * then *Directories* . Your Amazon WorkDocs site directory has an ID, which is the organization
       * ID. You can also set up a new Amazon WorkDocs directory in the AWS Directory Service console
       * and enable a Amazon WorkDocs site for the directory in the Amazon WorkDocs console.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-workdocsconfiguration.html#cfn-kendra-datasource-workdocsconfiguration-organizationid)
       */
      override fun organizationId(): String = unwrap(this).getOrganizationId()

      /**
       * `TRUE` to use the Amazon WorkDocs change log to determine which documents require updating
       * in the index.
       *
       * Depending on the change log's size, it may take longer for Amazon Kendra to use the change
       * log than to scan all of your documents in Amazon WorkDocs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-workdocsconfiguration.html#cfn-kendra-datasource-workdocsconfiguration-usechangelog)
       */
      override fun useChangeLog(): Any? = unwrap(this).getUseChangeLog()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkDocsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty):
          WorkDocsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkDocsConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty
    }
  }

  /**
   * Provides the configuration information to connect to Salesforce as your data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface SalesforceConfigurationProperty {
    /**
     * Configuration information for Salesforce chatter feeds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-chatterfeedconfiguration)
     */
    public fun chatterFeedConfiguration(): Any? = unwrap(this).getChatterFeedConfiguration()

    /**
     * Indicates whether Amazon Kendra should index attachments to Salesforce objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-crawlattachments)
     */
    public fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

    /**
     * A list of regular expression patterns to exclude certain documents in your Salesforce.
     *
     * Documents that match the patterns are excluded from the index. Documents that don't match the
     * patterns are included in the index. If a document matches both an inclusion and exclusion
     * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
     *
     * The pattern is applied to the name of the attached file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-excludeattachmentfilepatterns)
     */
    public fun excludeAttachmentFilePatterns(): List<String> =
        unwrap(this).getExcludeAttachmentFilePatterns() ?: emptyList()

    /**
     * A list of regular expression patterns to include certain documents in your Salesforce.
     *
     * Documents that match the patterns are included in the index. Documents that don't match the
     * patterns are excluded from the index. If a document matches both an inclusion and exclusion
     * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
     *
     * The pattern is applied to the name of the attached file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-includeattachmentfilepatterns)
     */
    public fun includeAttachmentFilePatterns(): List<String> =
        unwrap(this).getIncludeAttachmentFilePatterns() ?: emptyList()

    /**
     * Configuration information for the knowledge article types that Amazon Kendra indexes.
     *
     * Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge
     * articles, or the custom fields of custom knowledge articles, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-knowledgearticleconfiguration)
     */
    public fun knowledgeArticleConfiguration(): Any? =
        unwrap(this).getKnowledgeArticleConfiguration()

    /**
     * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that contains the key/value
     * pairs required to connect to your Salesforce instance.
     *
     * The secret must contain a JSON structure with the following keys:
     *
     * * authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get an OAUTH token.
     * * consumerKey - The application public key generated when you created your Salesforce
     * application.
     * * consumerSecret - The application private key generated when you created your Salesforce
     * application.
     * * password - The password associated with the user logging in to the Salesforce instance.
     * * securityToken - The token associated with the user logging in to the Salesforce instance.
     * * username - The user name of the user logging in to the Salesforce instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-secretarn)
     */
    public fun secretArn(): String

    /**
     * The instance URL for the Salesforce site that you want to index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-serverurl)
     */
    public fun serverUrl(): String

    /**
     * Configuration information for processing attachments to Salesforce standard objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-standardobjectattachmentconfiguration)
     */
    public fun standardObjectAttachmentConfiguration(): Any? =
        unwrap(this).getStandardObjectAttachmentConfiguration()

    /**
     * Configuration of the Salesforce standard objects that Amazon Kendra indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-standardobjectconfigurations)
     */
    public fun standardObjectConfigurations(): Any? = unwrap(this).getStandardObjectConfigurations()

    /**
     * A builder for [SalesforceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param chatterFeedConfiguration Configuration information for Salesforce chatter feeds.
       */
      public fun chatterFeedConfiguration(chatterFeedConfiguration: IResolvable)

      /**
       * @param chatterFeedConfiguration Configuration information for Salesforce chatter feeds.
       */
      public
          fun chatterFeedConfiguration(chatterFeedConfiguration: SalesforceChatterFeedConfigurationProperty)

      /**
       * @param chatterFeedConfiguration Configuration information for Salesforce chatter feeds.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("68ea8e49d52c80abe84b7b1e8979979927fc2fa72e7d99362d95420fbe6ffc58")
      public
          fun chatterFeedConfiguration(chatterFeedConfiguration: SalesforceChatterFeedConfigurationProperty.Builder.() -> Unit)

      /**
       * @param crawlAttachments Indicates whether Amazon Kendra should index attachments to
       * Salesforce objects.
       */
      public fun crawlAttachments(crawlAttachments: Boolean)

      /**
       * @param crawlAttachments Indicates whether Amazon Kendra should index attachments to
       * Salesforce objects.
       */
      public fun crawlAttachments(crawlAttachments: IResolvable)

      /**
       * @param excludeAttachmentFilePatterns A list of regular expression patterns to exclude
       * certain documents in your Salesforce.
       * Documents that match the patterns are excluded from the index. Documents that don't match
       * the patterns are included in the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the name of the attached file.
       */
      public fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: List<String>)

      /**
       * @param excludeAttachmentFilePatterns A list of regular expression patterns to exclude
       * certain documents in your Salesforce.
       * Documents that match the patterns are excluded from the index. Documents that don't match
       * the patterns are included in the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the name of the attached file.
       */
      public fun excludeAttachmentFilePatterns(vararg excludeAttachmentFilePatterns: String)

      /**
       * @param includeAttachmentFilePatterns A list of regular expression patterns to include
       * certain documents in your Salesforce.
       * Documents that match the patterns are included in the index. Documents that don't match the
       * patterns are excluded from the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the name of the attached file.
       */
      public fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: List<String>)

      /**
       * @param includeAttachmentFilePatterns A list of regular expression patterns to include
       * certain documents in your Salesforce.
       * Documents that match the patterns are included in the index. Documents that don't match the
       * patterns are excluded from the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the name of the attached file.
       */
      public fun includeAttachmentFilePatterns(vararg includeAttachmentFilePatterns: String)

      /**
       * @param knowledgeArticleConfiguration Configuration information for the knowledge article
       * types that Amazon Kendra indexes.
       * Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge
       * articles, or the custom fields of custom knowledge articles, but not both.
       */
      public fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: IResolvable)

      /**
       * @param knowledgeArticleConfiguration Configuration information for the knowledge article
       * types that Amazon Kendra indexes.
       * Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge
       * articles, or the custom fields of custom knowledge articles, but not both.
       */
      public
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: SalesforceKnowledgeArticleConfigurationProperty)

      /**
       * @param knowledgeArticleConfiguration Configuration information for the knowledge article
       * types that Amazon Kendra indexes.
       * Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge
       * articles, or the custom fields of custom knowledge articles, but not both.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("717fdd3835d3fadefd0088da282d3e63c6bf72afe900df51cf6b1bc4cdb7f04b")
      public
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: SalesforceKnowledgeArticleConfigurationProperty.Builder.() -> Unit)

      /**
       * @param secretArn The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
       * contains the key/value pairs required to connect to your Salesforce instance. 
       * The secret must contain a JSON structure with the following keys:
       *
       * * authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get an OAUTH token.
       * * consumerKey - The application public key generated when you created your Salesforce
       * application.
       * * consumerSecret - The application private key generated when you created your Salesforce
       * application.
       * * password - The password associated with the user logging in to the Salesforce instance.
       * * securityToken - The token associated with the user logging in to the Salesforce instance.
       * * username - The user name of the user logging in to the Salesforce instance.
       */
      public fun secretArn(secretArn: String)

      /**
       * @param serverUrl The instance URL for the Salesforce site that you want to index. 
       */
      public fun serverUrl(serverUrl: String)

      /**
       * @param standardObjectAttachmentConfiguration Configuration information for processing
       * attachments to Salesforce standard objects.
       */
      public
          fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: IResolvable)

      /**
       * @param standardObjectAttachmentConfiguration Configuration information for processing
       * attachments to Salesforce standard objects.
       */
      public
          fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: SalesforceStandardObjectAttachmentConfigurationProperty)

      /**
       * @param standardObjectAttachmentConfiguration Configuration information for processing
       * attachments to Salesforce standard objects.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b89b446b1576b097cd3c009ab9272752ffdc64b2efffdacd5430f35518bce67d")
      public
          fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: SalesforceStandardObjectAttachmentConfigurationProperty.Builder.() -> Unit)

      /**
       * @param standardObjectConfigurations Configuration of the Salesforce standard objects that
       * Amazon Kendra indexes.
       */
      public fun standardObjectConfigurations(standardObjectConfigurations: IResolvable)

      /**
       * @param standardObjectConfigurations Configuration of the Salesforce standard objects that
       * Amazon Kendra indexes.
       */
      public fun standardObjectConfigurations(standardObjectConfigurations: List<Any>)

      /**
       * @param standardObjectConfigurations Configuration of the Salesforce standard objects that
       * Amazon Kendra indexes.
       */
      public fun standardObjectConfigurations(vararg standardObjectConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty.builder()

      /**
       * @param chatterFeedConfiguration Configuration information for Salesforce chatter feeds.
       */
      override fun chatterFeedConfiguration(chatterFeedConfiguration: IResolvable) {
        cdkBuilder.chatterFeedConfiguration(chatterFeedConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param chatterFeedConfiguration Configuration information for Salesforce chatter feeds.
       */
      override
          fun chatterFeedConfiguration(chatterFeedConfiguration: SalesforceChatterFeedConfigurationProperty) {
        cdkBuilder.chatterFeedConfiguration(chatterFeedConfiguration.let(SalesforceChatterFeedConfigurationProperty::unwrap))
      }

      /**
       * @param chatterFeedConfiguration Configuration information for Salesforce chatter feeds.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("68ea8e49d52c80abe84b7b1e8979979927fc2fa72e7d99362d95420fbe6ffc58")
      override
          fun chatterFeedConfiguration(chatterFeedConfiguration: SalesforceChatterFeedConfigurationProperty.Builder.() -> Unit):
          Unit =
          chatterFeedConfiguration(SalesforceChatterFeedConfigurationProperty(chatterFeedConfiguration))

      /**
       * @param crawlAttachments Indicates whether Amazon Kendra should index attachments to
       * Salesforce objects.
       */
      override fun crawlAttachments(crawlAttachments: Boolean) {
        cdkBuilder.crawlAttachments(crawlAttachments)
      }

      /**
       * @param crawlAttachments Indicates whether Amazon Kendra should index attachments to
       * Salesforce objects.
       */
      override fun crawlAttachments(crawlAttachments: IResolvable) {
        cdkBuilder.crawlAttachments(crawlAttachments.let(IResolvable::unwrap))
      }

      /**
       * @param excludeAttachmentFilePatterns A list of regular expression patterns to exclude
       * certain documents in your Salesforce.
       * Documents that match the patterns are excluded from the index. Documents that don't match
       * the patterns are included in the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the name of the attached file.
       */
      override fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: List<String>) {
        cdkBuilder.excludeAttachmentFilePatterns(excludeAttachmentFilePatterns)
      }

      /**
       * @param excludeAttachmentFilePatterns A list of regular expression patterns to exclude
       * certain documents in your Salesforce.
       * Documents that match the patterns are excluded from the index. Documents that don't match
       * the patterns are included in the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the name of the attached file.
       */
      override fun excludeAttachmentFilePatterns(vararg excludeAttachmentFilePatterns: String): Unit
          = excludeAttachmentFilePatterns(excludeAttachmentFilePatterns.toList())

      /**
       * @param includeAttachmentFilePatterns A list of regular expression patterns to include
       * certain documents in your Salesforce.
       * Documents that match the patterns are included in the index. Documents that don't match the
       * patterns are excluded from the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the name of the attached file.
       */
      override fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: List<String>) {
        cdkBuilder.includeAttachmentFilePatterns(includeAttachmentFilePatterns)
      }

      /**
       * @param includeAttachmentFilePatterns A list of regular expression patterns to include
       * certain documents in your Salesforce.
       * Documents that match the patterns are included in the index. Documents that don't match the
       * patterns are excluded from the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the name of the attached file.
       */
      override fun includeAttachmentFilePatterns(vararg includeAttachmentFilePatterns: String): Unit
          = includeAttachmentFilePatterns(includeAttachmentFilePatterns.toList())

      /**
       * @param knowledgeArticleConfiguration Configuration information for the knowledge article
       * types that Amazon Kendra indexes.
       * Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge
       * articles, or the custom fields of custom knowledge articles, but not both.
       */
      override fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: IResolvable) {
        cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param knowledgeArticleConfiguration Configuration information for the knowledge article
       * types that Amazon Kendra indexes.
       * Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge
       * articles, or the custom fields of custom knowledge articles, but not both.
       */
      override
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: SalesforceKnowledgeArticleConfigurationProperty) {
        cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration.let(SalesforceKnowledgeArticleConfigurationProperty::unwrap))
      }

      /**
       * @param knowledgeArticleConfiguration Configuration information for the knowledge article
       * types that Amazon Kendra indexes.
       * Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge
       * articles, or the custom fields of custom knowledge articles, but not both.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("717fdd3835d3fadefd0088da282d3e63c6bf72afe900df51cf6b1bc4cdb7f04b")
      override
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: SalesforceKnowledgeArticleConfigurationProperty.Builder.() -> Unit):
          Unit =
          knowledgeArticleConfiguration(SalesforceKnowledgeArticleConfigurationProperty(knowledgeArticleConfiguration))

      /**
       * @param secretArn The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
       * contains the key/value pairs required to connect to your Salesforce instance. 
       * The secret must contain a JSON structure with the following keys:
       *
       * * authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get an OAUTH token.
       * * consumerKey - The application public key generated when you created your Salesforce
       * application.
       * * consumerSecret - The application private key generated when you created your Salesforce
       * application.
       * * password - The password associated with the user logging in to the Salesforce instance.
       * * securityToken - The token associated with the user logging in to the Salesforce instance.
       * * username - The user name of the user logging in to the Salesforce instance.
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      /**
       * @param serverUrl The instance URL for the Salesforce site that you want to index. 
       */
      override fun serverUrl(serverUrl: String) {
        cdkBuilder.serverUrl(serverUrl)
      }

      /**
       * @param standardObjectAttachmentConfiguration Configuration information for processing
       * attachments to Salesforce standard objects.
       */
      override
          fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: IResolvable) {
        cdkBuilder.standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param standardObjectAttachmentConfiguration Configuration information for processing
       * attachments to Salesforce standard objects.
       */
      override
          fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: SalesforceStandardObjectAttachmentConfigurationProperty) {
        cdkBuilder.standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration.let(SalesforceStandardObjectAttachmentConfigurationProperty::unwrap))
      }

      /**
       * @param standardObjectAttachmentConfiguration Configuration information for processing
       * attachments to Salesforce standard objects.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b89b446b1576b097cd3c009ab9272752ffdc64b2efffdacd5430f35518bce67d")
      override
          fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: SalesforceStandardObjectAttachmentConfigurationProperty.Builder.() -> Unit):
          Unit =
          standardObjectAttachmentConfiguration(SalesforceStandardObjectAttachmentConfigurationProperty(standardObjectAttachmentConfiguration))

      /**
       * @param standardObjectConfigurations Configuration of the Salesforce standard objects that
       * Amazon Kendra indexes.
       */
      override fun standardObjectConfigurations(standardObjectConfigurations: IResolvable) {
        cdkBuilder.standardObjectConfigurations(standardObjectConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param standardObjectConfigurations Configuration of the Salesforce standard objects that
       * Amazon Kendra indexes.
       */
      override fun standardObjectConfigurations(standardObjectConfigurations: List<Any>) {
        cdkBuilder.standardObjectConfigurations(standardObjectConfigurations)
      }

      /**
       * @param standardObjectConfigurations Configuration of the Salesforce standard objects that
       * Amazon Kendra indexes.
       */
      override fun standardObjectConfigurations(vararg standardObjectConfigurations: Any): Unit =
          standardObjectConfigurations(standardObjectConfigurations.toList())

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty,
    ) : CdkObject(cdkObject), SalesforceConfigurationProperty {
      /**
       * Configuration information for Salesforce chatter feeds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-chatterfeedconfiguration)
       */
      override fun chatterFeedConfiguration(): Any? = unwrap(this).getChatterFeedConfiguration()

      /**
       * Indicates whether Amazon Kendra should index attachments to Salesforce objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-crawlattachments)
       */
      override fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

      /**
       * A list of regular expression patterns to exclude certain documents in your Salesforce.
       *
       * Documents that match the patterns are excluded from the index. Documents that don't match
       * the patterns are included in the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the name of the attached file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-excludeattachmentfilepatterns)
       */
      override fun excludeAttachmentFilePatterns(): List<String> =
          unwrap(this).getExcludeAttachmentFilePatterns() ?: emptyList()

      /**
       * A list of regular expression patterns to include certain documents in your Salesforce.
       *
       * Documents that match the patterns are included in the index. Documents that don't match the
       * patterns are excluded from the index. If a document matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the document isn't included in the index.
       *
       * The pattern is applied to the name of the attached file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-includeattachmentfilepatterns)
       */
      override fun includeAttachmentFilePatterns(): List<String> =
          unwrap(this).getIncludeAttachmentFilePatterns() ?: emptyList()

      /**
       * Configuration information for the knowledge article types that Amazon Kendra indexes.
       *
       * Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge
       * articles, or the custom fields of custom knowledge articles, but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-knowledgearticleconfiguration)
       */
      override fun knowledgeArticleConfiguration(): Any? =
          unwrap(this).getKnowledgeArticleConfiguration()

      /**
       * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that contains the key/value
       * pairs required to connect to your Salesforce instance.
       *
       * The secret must contain a JSON structure with the following keys:
       *
       * * authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get an OAUTH token.
       * * consumerKey - The application public key generated when you created your Salesforce
       * application.
       * * consumerSecret - The application private key generated when you created your Salesforce
       * application.
       * * password - The password associated with the user logging in to the Salesforce instance.
       * * securityToken - The token associated with the user logging in to the Salesforce instance.
       * * username - The user name of the user logging in to the Salesforce instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-secretarn)
       */
      override fun secretArn(): String = unwrap(this).getSecretArn()

      /**
       * The instance URL for the Salesforce site that you want to index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-serverurl)
       */
      override fun serverUrl(): String = unwrap(this).getServerUrl()

      /**
       * Configuration information for processing attachments to Salesforce standard objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-standardobjectattachmentconfiguration)
       */
      override fun standardObjectAttachmentConfiguration(): Any? =
          unwrap(this).getStandardObjectAttachmentConfiguration()

      /**
       * Configuration of the Salesforce standard objects that Amazon Kendra indexes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforceconfiguration.html#cfn-kendra-datasource-salesforceconfiguration-standardobjectconfigurations)
       */
      override fun standardObjectConfigurations(): Any? =
          unwrap(this).getStandardObjectConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SalesforceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty):
          SalesforceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty
    }
  }

  /**
   * Provides information about the column that should be used for filtering the query response by
   * groups.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
   * AclConfigurationProperty aclConfigurationProperty = AclConfigurationProperty.builder()
   * .allowedGroupsColumnName("allowedGroupsColumnName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-aclconfiguration.html)
   */
  public interface AclConfigurationProperty {
    /**
     * A list of groups, separated by semi-colons, that filters a query response based on user
     * context.
     *
     * The document is only returned to users that are in one of the groups specified in the
     * `UserContext` field of the [Query](https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html)
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-aclconfiguration.html#cfn-kendra-datasource-aclconfiguration-allowedgroupscolumnname)
     */
    public fun allowedGroupsColumnName(): String

    /**
     * A builder for [AclConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedGroupsColumnName A list of groups, separated by semi-colons, that filters a
       * query response based on user context. 
       * The document is only returned to users that are in one of the groups specified in the
       * `UserContext` field of the
       * [Query](https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html) operation.
       */
      public fun allowedGroupsColumnName(allowedGroupsColumnName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty.builder()

      /**
       * @param allowedGroupsColumnName A list of groups, separated by semi-colons, that filters a
       * query response based on user context. 
       * The document is only returned to users that are in one of the groups specified in the
       * `UserContext` field of the
       * [Query](https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html) operation.
       */
      override fun allowedGroupsColumnName(allowedGroupsColumnName: String) {
        cdkBuilder.allowedGroupsColumnName(allowedGroupsColumnName)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty,
    ) : CdkObject(cdkObject), AclConfigurationProperty {
      /**
       * A list of groups, separated by semi-colons, that filters a query response based on user
       * context.
       *
       * The document is only returned to users that are in one of the groups specified in the
       * `UserContext` field of the
       * [Query](https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html) operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-aclconfiguration.html#cfn-kendra-datasource-aclconfiguration-allowedgroupscolumnname)
       */
      override fun allowedGroupsColumnName(): String = unwrap(this).getAllowedGroupsColumnName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AclConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty):
          AclConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AclConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty
    }
  }

  /**
   * Maps attributes or field names of Confluence pages to Amazon Kendra index field names.
   *
   * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
   * source field names must exist in your Confluence custom metadata.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface ConfluencePageToIndexFieldMappingProperty {
    /**
     * The name of the field in the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencepagetoindexfieldmapping.html#cfn-kendra-datasource-confluencepagetoindexfieldmapping-datasourcefieldname)
     */
    public fun dataSourceFieldName(): String

    /**
     * The format for date fields in the data source.
     *
     * If the field specified in `DataSourceFieldName` is a date field you must specify the date
     * format. If the field is not a date field, an exception is thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencepagetoindexfieldmapping.html#cfn-kendra-datasource-confluencepagetoindexfieldmapping-datefieldformat)
     */
    public fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

    /**
     * The name of the index field to map to the Confluence data source field.
     *
     * The index field type must match the Confluence field type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencepagetoindexfieldmapping.html#cfn-kendra-datasource-confluencepagetoindexfieldmapping-indexfieldname)
     */
    public fun indexFieldName(): String

    /**
     * A builder for [ConfluencePageToIndexFieldMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataSourceFieldName The name of the field in the data source. 
       */
      public fun dataSourceFieldName(dataSourceFieldName: String)

      /**
       * @param dateFieldFormat The format for date fields in the data source.
       * If the field specified in `DataSourceFieldName` is a date field you must specify the date
       * format. If the field is not a date field, an exception is thrown.
       */
      public fun dateFieldFormat(dateFieldFormat: String)

      /**
       * @param indexFieldName The name of the index field to map to the Confluence data source
       * field. 
       * The index field type must match the Confluence field type.
       */
      public fun indexFieldName(indexFieldName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageToIndexFieldMappingProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageToIndexFieldMappingProperty.builder()

      /**
       * @param dataSourceFieldName The name of the field in the data source. 
       */
      override fun dataSourceFieldName(dataSourceFieldName: String) {
        cdkBuilder.dataSourceFieldName(dataSourceFieldName)
      }

      /**
       * @param dateFieldFormat The format for date fields in the data source.
       * If the field specified in `DataSourceFieldName` is a date field you must specify the date
       * format. If the field is not a date field, an exception is thrown.
       */
      override fun dateFieldFormat(dateFieldFormat: String) {
        cdkBuilder.dateFieldFormat(dateFieldFormat)
      }

      /**
       * @param indexFieldName The name of the index field to map to the Confluence data source
       * field. 
       * The index field type must match the Confluence field type.
       */
      override fun indexFieldName(indexFieldName: String) {
        cdkBuilder.indexFieldName(indexFieldName)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageToIndexFieldMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageToIndexFieldMappingProperty,
    ) : CdkObject(cdkObject), ConfluencePageToIndexFieldMappingProperty {
      /**
       * The name of the field in the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencepagetoindexfieldmapping.html#cfn-kendra-datasource-confluencepagetoindexfieldmapping-datasourcefieldname)
       */
      override fun dataSourceFieldName(): String = unwrap(this).getDataSourceFieldName()

      /**
       * The format for date fields in the data source.
       *
       * If the field specified in `DataSourceFieldName` is a date field you must specify the date
       * format. If the field is not a date field, an exception is thrown.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencepagetoindexfieldmapping.html#cfn-kendra-datasource-confluencepagetoindexfieldmapping-datefieldformat)
       */
      override fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

      /**
       * The name of the index field to map to the Confluence data source field.
       *
       * The index field type must match the Confluence field type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencepagetoindexfieldmapping.html#cfn-kendra-datasource-confluencepagetoindexfieldmapping-indexfieldname)
       */
      override fun indexFieldName(): String = unwrap(this).getIndexFieldName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluencePageToIndexFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageToIndexFieldMappingProperty):
          ConfluencePageToIndexFieldMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluencePageToIndexFieldMappingProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageToIndexFieldMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageToIndexFieldMappingProperty
    }
  }

  /**
   * Provides the configuration information of the seed or starting point URLs to crawl.
   *
   * *When selecting websites to index, you must adhere to the [Amazon Acceptable Use
   * Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms. Remember that you must only
   * use the Amazon Kendra web crawler to index your own webpages, or webpages that you have
   * authorization to index.*
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface WebCrawlerSeedUrlConfigurationProperty {
    /**
     * The list of seed or starting point URLs of the websites you want to crawl.
     *
     * The list can include a maximum of 100 seed URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerseedurlconfiguration.html#cfn-kendra-datasource-webcrawlerseedurlconfiguration-seedurls)
     */
    public fun seedUrls(): List<String>

    /**
     * You can choose one of the following modes:.
     *
     * * `HOST_ONLY` —crawl only the website host names. For example, if the seed URL is
     * "abc.example.com", then only URLs with host name "abc.example.com" are crawled.
     * * `SUBDOMAINS` —crawl the website host names with subdomains. For example, if the seed URL is
     * "abc.example.com", then "a.abc.example.com" and "b.abc.example.com" are also crawled.
     * * `EVERYTHING` —crawl the website host names with subdomains and other domains that the web
     * pages link to.
     *
     * The default mode is set to `HOST_ONLY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerseedurlconfiguration.html#cfn-kendra-datasource-webcrawlerseedurlconfiguration-webcrawlermode)
     */
    public fun webCrawlerMode(): String? = unwrap(this).getWebCrawlerMode()

    /**
     * A builder for [WebCrawlerSeedUrlConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param seedUrls The list of seed or starting point URLs of the websites you want to crawl. 
       * The list can include a maximum of 100 seed URLs.
       */
      public fun seedUrls(seedUrls: List<String>)

      /**
       * @param seedUrls The list of seed or starting point URLs of the websites you want to crawl. 
       * The list can include a maximum of 100 seed URLs.
       */
      public fun seedUrls(vararg seedUrls: String)

      /**
       * @param webCrawlerMode You can choose one of the following modes:.
       * * `HOST_ONLY` —crawl only the website host names. For example, if the seed URL is
       * "abc.example.com", then only URLs with host name "abc.example.com" are crawled.
       * * `SUBDOMAINS` —crawl the website host names with subdomains. For example, if the seed URL
       * is "abc.example.com", then "a.abc.example.com" and "b.abc.example.com" are also crawled.
       * * `EVERYTHING` —crawl the website host names with subdomains and other domains that the web
       * pages link to.
       *
       * The default mode is set to `HOST_ONLY` .
       */
      public fun webCrawlerMode(webCrawlerMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty.builder()

      /**
       * @param seedUrls The list of seed or starting point URLs of the websites you want to crawl. 
       * The list can include a maximum of 100 seed URLs.
       */
      override fun seedUrls(seedUrls: List<String>) {
        cdkBuilder.seedUrls(seedUrls)
      }

      /**
       * @param seedUrls The list of seed or starting point URLs of the websites you want to crawl. 
       * The list can include a maximum of 100 seed URLs.
       */
      override fun seedUrls(vararg seedUrls: String): Unit = seedUrls(seedUrls.toList())

      /**
       * @param webCrawlerMode You can choose one of the following modes:.
       * * `HOST_ONLY` —crawl only the website host names. For example, if the seed URL is
       * "abc.example.com", then only URLs with host name "abc.example.com" are crawled.
       * * `SUBDOMAINS` —crawl the website host names with subdomains. For example, if the seed URL
       * is "abc.example.com", then "a.abc.example.com" and "b.abc.example.com" are also crawled.
       * * `EVERYTHING` —crawl the website host names with subdomains and other domains that the web
       * pages link to.
       *
       * The default mode is set to `HOST_ONLY` .
       */
      override fun webCrawlerMode(webCrawlerMode: String) {
        cdkBuilder.webCrawlerMode(webCrawlerMode)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty,
    ) : CdkObject(cdkObject), WebCrawlerSeedUrlConfigurationProperty {
      /**
       * The list of seed or starting point URLs of the websites you want to crawl.
       *
       * The list can include a maximum of 100 seed URLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerseedurlconfiguration.html#cfn-kendra-datasource-webcrawlerseedurlconfiguration-seedurls)
       */
      override fun seedUrls(): List<String> = unwrap(this).getSeedUrls()

      /**
       * You can choose one of the following modes:.
       *
       * * `HOST_ONLY` —crawl only the website host names. For example, if the seed URL is
       * "abc.example.com", then only URLs with host name "abc.example.com" are crawled.
       * * `SUBDOMAINS` —crawl the website host names with subdomains. For example, if the seed URL
       * is "abc.example.com", then "a.abc.example.com" and "b.abc.example.com" are also crawled.
       * * `EVERYTHING` —crawl the website host names with subdomains and other domains that the web
       * pages link to.
       *
       * The default mode is set to `HOST_ONLY` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerseedurlconfiguration.html#cfn-kendra-datasource-webcrawlerseedurlconfiguration-webcrawlermode)
       */
      override fun webCrawlerMode(): String? = unwrap(this).getWebCrawlerMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          WebCrawlerSeedUrlConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty):
          WebCrawlerSeedUrlConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebCrawlerSeedUrlConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty
    }
  }

  /**
   * Provides the configuration information for processing attachments to Salesforce standard
   * objects.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface SalesforceStandardObjectAttachmentConfigurationProperty {
    /**
     * The name of the field used for the document title.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardobjectattachmentconfiguration.html#cfn-kendra-datasource-salesforcestandardobjectattachmentconfiguration-documenttitlefieldname)
     */
    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    /**
     * One or more objects that map fields in attachments to Amazon Kendra index fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardobjectattachmentconfiguration.html#cfn-kendra-datasource-salesforcestandardobjectattachmentconfiguration-fieldmappings)
     */
    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    /**
     * A builder for [SalesforceStandardObjectAttachmentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param documentTitleFieldName The name of the field used for the document title.
       */
      public fun documentTitleFieldName(documentTitleFieldName: String)

      /**
       * @param fieldMappings One or more objects that map fields in attachments to Amazon Kendra
       * index fields.
       */
      public fun fieldMappings(fieldMappings: IResolvable)

      /**
       * @param fieldMappings One or more objects that map fields in attachments to Amazon Kendra
       * index fields.
       */
      public fun fieldMappings(fieldMappings: List<Any>)

      /**
       * @param fieldMappings One or more objects that map fields in attachments to Amazon Kendra
       * index fields.
       */
      public fun fieldMappings(vararg fieldMappings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty.builder()

      /**
       * @param documentTitleFieldName The name of the field used for the document title.
       */
      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      /**
       * @param fieldMappings One or more objects that map fields in attachments to Amazon Kendra
       * index fields.
       */
      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param fieldMappings One or more objects that map fields in attachments to Amazon Kendra
       * index fields.
       */
      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      /**
       * @param fieldMappings One or more objects that map fields in attachments to Amazon Kendra
       * index fields.
       */
      override fun fieldMappings(vararg fieldMappings: Any): Unit =
          fieldMappings(fieldMappings.toList())

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty,
    ) : CdkObject(cdkObject), SalesforceStandardObjectAttachmentConfigurationProperty {
      /**
       * The name of the field used for the document title.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardobjectattachmentconfiguration.html#cfn-kendra-datasource-salesforcestandardobjectattachmentconfiguration-documenttitlefieldname)
       */
      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      /**
       * One or more objects that map fields in attachments to Amazon Kendra index fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardobjectattachmentconfiguration.html#cfn-kendra-datasource-salesforcestandardobjectattachmentconfiguration-fieldmappings)
       */
      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceStandardObjectAttachmentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty):
          SalesforceStandardObjectAttachmentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceStandardObjectAttachmentConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty
    }
  }

  /**
   * Provides the configuration information to an [Amazon Kendra supported
   * database](https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface DatabaseConfigurationProperty {
    /**
     * Information about the database column that provides information for user context filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-databaseconfiguration.html#cfn-kendra-datasource-databaseconfiguration-aclconfiguration)
     */
    public fun aclConfiguration(): Any? = unwrap(this).getAclConfiguration()

    /**
     * Information about where the index should get the document information from the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-databaseconfiguration.html#cfn-kendra-datasource-databaseconfiguration-columnconfiguration)
     */
    public fun columnConfiguration(): Any

    /**
     * Configuration information that's required to connect to a database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-databaseconfiguration.html#cfn-kendra-datasource-databaseconfiguration-connectionconfiguration)
     */
    public fun connectionConfiguration(): Any

    /**
     * The type of database engine that runs the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-databaseconfiguration.html#cfn-kendra-datasource-databaseconfiguration-databaseenginetype)
     */
    public fun databaseEngineType(): String

    /**
     * Provides information about how Amazon Kendra uses quote marks around SQL identifiers when
     * querying a database data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-databaseconfiguration.html#cfn-kendra-datasource-databaseconfiguration-sqlconfiguration)
     */
    public fun sqlConfiguration(): Any? = unwrap(this).getSqlConfiguration()

    /**
     * Provides information for connecting to an Amazon VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-databaseconfiguration.html#cfn-kendra-datasource-databaseconfiguration-vpcconfiguration)
     */
    public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

    /**
     * A builder for [DatabaseConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aclConfiguration Information about the database column that provides information for
       * user context filtering.
       */
      public fun aclConfiguration(aclConfiguration: IResolvable)

      /**
       * @param aclConfiguration Information about the database column that provides information for
       * user context filtering.
       */
      public fun aclConfiguration(aclConfiguration: AclConfigurationProperty)

      /**
       * @param aclConfiguration Information about the database column that provides information for
       * user context filtering.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("597613032f6a5e3b1dd51dc5e4ba5e6d511c7123be64f71e0cfea153ec734aed")
      public fun aclConfiguration(aclConfiguration: AclConfigurationProperty.Builder.() -> Unit)

      /**
       * @param columnConfiguration Information about where the index should get the document
       * information from the database. 
       */
      public fun columnConfiguration(columnConfiguration: IResolvable)

      /**
       * @param columnConfiguration Information about where the index should get the document
       * information from the database. 
       */
      public fun columnConfiguration(columnConfiguration: ColumnConfigurationProperty)

      /**
       * @param columnConfiguration Information about where the index should get the document
       * information from the database. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a79a843cb7aacc95d6e019f396615a8d3d00ba8c21f1c7a257b5fe7605aae5c")
      public
          fun columnConfiguration(columnConfiguration: ColumnConfigurationProperty.Builder.() -> Unit)

      /**
       * @param connectionConfiguration Configuration information that's required to connect to a
       * database. 
       */
      public fun connectionConfiguration(connectionConfiguration: IResolvable)

      /**
       * @param connectionConfiguration Configuration information that's required to connect to a
       * database. 
       */
      public fun connectionConfiguration(connectionConfiguration: ConnectionConfigurationProperty)

      /**
       * @param connectionConfiguration Configuration information that's required to connect to a
       * database. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60e1f87ea045ceafcb905310214daf8007a3f4b75ee1c76c57a32db72c8f4878")
      public
          fun connectionConfiguration(connectionConfiguration: ConnectionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param databaseEngineType The type of database engine that runs the database. 
       */
      public fun databaseEngineType(databaseEngineType: String)

      /**
       * @param sqlConfiguration Provides information about how Amazon Kendra uses quote marks
       * around SQL identifiers when querying a database data source.
       */
      public fun sqlConfiguration(sqlConfiguration: IResolvable)

      /**
       * @param sqlConfiguration Provides information about how Amazon Kendra uses quote marks
       * around SQL identifiers when querying a database data source.
       */
      public fun sqlConfiguration(sqlConfiguration: SqlConfigurationProperty)

      /**
       * @param sqlConfiguration Provides information about how Amazon Kendra uses quote marks
       * around SQL identifiers when querying a database data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd8d5b1c3c5fa7772f6a9977bc8090bae223df6e6bdfb5f24b4f7f9fe096df57")
      public fun sqlConfiguration(sqlConfiguration: SqlConfigurationProperty.Builder.() -> Unit)

      /**
       * @param vpcConfiguration Provides information for connecting to an Amazon VPC.
       */
      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      /**
       * @param vpcConfiguration Provides information for connecting to an Amazon VPC.
       */
      public fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty)

      /**
       * @param vpcConfiguration Provides information for connecting to an Amazon VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a60c2e6e79c6a1516849eac70a6882a6dc4bbf1121378a9818225c243aadbe73")
      public
          fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty.builder()

      /**
       * @param aclConfiguration Information about the database column that provides information for
       * user context filtering.
       */
      override fun aclConfiguration(aclConfiguration: IResolvable) {
        cdkBuilder.aclConfiguration(aclConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param aclConfiguration Information about the database column that provides information for
       * user context filtering.
       */
      override fun aclConfiguration(aclConfiguration: AclConfigurationProperty) {
        cdkBuilder.aclConfiguration(aclConfiguration.let(AclConfigurationProperty::unwrap))
      }

      /**
       * @param aclConfiguration Information about the database column that provides information for
       * user context filtering.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("597613032f6a5e3b1dd51dc5e4ba5e6d511c7123be64f71e0cfea153ec734aed")
      override fun aclConfiguration(aclConfiguration: AclConfigurationProperty.Builder.() -> Unit):
          Unit = aclConfiguration(AclConfigurationProperty(aclConfiguration))

      /**
       * @param columnConfiguration Information about where the index should get the document
       * information from the database. 
       */
      override fun columnConfiguration(columnConfiguration: IResolvable) {
        cdkBuilder.columnConfiguration(columnConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param columnConfiguration Information about where the index should get the document
       * information from the database. 
       */
      override fun columnConfiguration(columnConfiguration: ColumnConfigurationProperty) {
        cdkBuilder.columnConfiguration(columnConfiguration.let(ColumnConfigurationProperty::unwrap))
      }

      /**
       * @param columnConfiguration Information about where the index should get the document
       * information from the database. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a79a843cb7aacc95d6e019f396615a8d3d00ba8c21f1c7a257b5fe7605aae5c")
      override
          fun columnConfiguration(columnConfiguration: ColumnConfigurationProperty.Builder.() -> Unit):
          Unit = columnConfiguration(ColumnConfigurationProperty(columnConfiguration))

      /**
       * @param connectionConfiguration Configuration information that's required to connect to a
       * database. 
       */
      override fun connectionConfiguration(connectionConfiguration: IResolvable) {
        cdkBuilder.connectionConfiguration(connectionConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param connectionConfiguration Configuration information that's required to connect to a
       * database. 
       */
      override
          fun connectionConfiguration(connectionConfiguration: ConnectionConfigurationProperty) {
        cdkBuilder.connectionConfiguration(connectionConfiguration.let(ConnectionConfigurationProperty::unwrap))
      }

      /**
       * @param connectionConfiguration Configuration information that's required to connect to a
       * database. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60e1f87ea045ceafcb905310214daf8007a3f4b75ee1c76c57a32db72c8f4878")
      override
          fun connectionConfiguration(connectionConfiguration: ConnectionConfigurationProperty.Builder.() -> Unit):
          Unit = connectionConfiguration(ConnectionConfigurationProperty(connectionConfiguration))

      /**
       * @param databaseEngineType The type of database engine that runs the database. 
       */
      override fun databaseEngineType(databaseEngineType: String) {
        cdkBuilder.databaseEngineType(databaseEngineType)
      }

      /**
       * @param sqlConfiguration Provides information about how Amazon Kendra uses quote marks
       * around SQL identifiers when querying a database data source.
       */
      override fun sqlConfiguration(sqlConfiguration: IResolvable) {
        cdkBuilder.sqlConfiguration(sqlConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param sqlConfiguration Provides information about how Amazon Kendra uses quote marks
       * around SQL identifiers when querying a database data source.
       */
      override fun sqlConfiguration(sqlConfiguration: SqlConfigurationProperty) {
        cdkBuilder.sqlConfiguration(sqlConfiguration.let(SqlConfigurationProperty::unwrap))
      }

      /**
       * @param sqlConfiguration Provides information about how Amazon Kendra uses quote marks
       * around SQL identifiers when querying a database data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd8d5b1c3c5fa7772f6a9977bc8090bae223df6e6bdfb5f24b4f7f9fe096df57")
      override fun sqlConfiguration(sqlConfiguration: SqlConfigurationProperty.Builder.() -> Unit):
          Unit = sqlConfiguration(SqlConfigurationProperty(sqlConfiguration))

      /**
       * @param vpcConfiguration Provides information for connecting to an Amazon VPC.
       */
      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConfiguration Provides information for connecting to an Amazon VPC.
       */
      override fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(DataSourceVpcConfigurationProperty::unwrap))
      }

      /**
       * @param vpcConfiguration Provides information for connecting to an Amazon VPC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a60c2e6e79c6a1516849eac70a6882a6dc4bbf1121378a9818225c243aadbe73")
      override
          fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(DataSourceVpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty,
    ) : CdkObject(cdkObject), DatabaseConfigurationProperty {
      /**
       * Information about the database column that provides information for user context filtering.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-databaseconfiguration.html#cfn-kendra-datasource-databaseconfiguration-aclconfiguration)
       */
      override fun aclConfiguration(): Any? = unwrap(this).getAclConfiguration()

      /**
       * Information about where the index should get the document information from the database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-databaseconfiguration.html#cfn-kendra-datasource-databaseconfiguration-columnconfiguration)
       */
      override fun columnConfiguration(): Any = unwrap(this).getColumnConfiguration()

      /**
       * Configuration information that's required to connect to a database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-databaseconfiguration.html#cfn-kendra-datasource-databaseconfiguration-connectionconfiguration)
       */
      override fun connectionConfiguration(): Any = unwrap(this).getConnectionConfiguration()

      /**
       * The type of database engine that runs the database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-databaseconfiguration.html#cfn-kendra-datasource-databaseconfiguration-databaseenginetype)
       */
      override fun databaseEngineType(): String = unwrap(this).getDatabaseEngineType()

      /**
       * Provides information about how Amazon Kendra uses quote marks around SQL identifiers when
       * querying a database data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-databaseconfiguration.html#cfn-kendra-datasource-databaseconfiguration-sqlconfiguration)
       */
      override fun sqlConfiguration(): Any? = unwrap(this).getSqlConfiguration()

      /**
       * Provides information for connecting to an Amazon VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-databaseconfiguration.html#cfn-kendra-datasource-databaseconfiguration-vpcconfiguration)
       */
      override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty):
          DatabaseConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty
    }
  }

  /**
   * Provides the configuration information to connect to websites that require basic user
   * authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface WebCrawlerBasicAuthenticationProperty {
    /**
     * Your secret ARN, which you can create in [AWS Secrets
     * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html).
     *
     * You use a secret if basic authentication credentials are required to connect to a website.
     * The secret stores your credentials of user name and password.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerbasicauthentication.html#cfn-kendra-datasource-webcrawlerbasicauthentication-credentials)
     */
    public fun credentials(): String

    /**
     * The name of the website host you want to connect to using authentication credentials.
     *
     * For example, the host name of https://a.example.com/page1.html is "a.example.com".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerbasicauthentication.html#cfn-kendra-datasource-webcrawlerbasicauthentication-host)
     */
    public fun host(): String

    /**
     * The port number of the website host you want to connect to using authentication credentials.
     *
     * For example, the port for https://a.example.com/page1.html is 443, the standard port for
     * HTTPS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerbasicauthentication.html#cfn-kendra-datasource-webcrawlerbasicauthentication-port)
     */
    public fun port(): Number

    /**
     * A builder for [WebCrawlerBasicAuthenticationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param credentials Your secret ARN, which you can create in [AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html). 
       * You use a secret if basic authentication credentials are required to connect to a website.
       * The secret stores your credentials of user name and password.
       */
      public fun credentials(credentials: String)

      /**
       * @param host The name of the website host you want to connect to using authentication
       * credentials. 
       * For example, the host name of https://a.example.com/page1.html is "a.example.com".
       */
      public fun host(host: String)

      /**
       * @param port The port number of the website host you want to connect to using authentication
       * credentials. 
       * For example, the port for https://a.example.com/page1.html is 443, the standard port for
       * HTTPS.
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty.builder()

      /**
       * @param credentials Your secret ARN, which you can create in [AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html). 
       * You use a secret if basic authentication credentials are required to connect to a website.
       * The secret stores your credentials of user name and password.
       */
      override fun credentials(credentials: String) {
        cdkBuilder.credentials(credentials)
      }

      /**
       * @param host The name of the website host you want to connect to using authentication
       * credentials. 
       * For example, the host name of https://a.example.com/page1.html is "a.example.com".
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port The port number of the website host you want to connect to using authentication
       * credentials. 
       * For example, the port for https://a.example.com/page1.html is 443, the standard port for
       * HTTPS.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty,
    ) : CdkObject(cdkObject), WebCrawlerBasicAuthenticationProperty {
      /**
       * Your secret ARN, which you can create in [AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html).
       *
       * You use a secret if basic authentication credentials are required to connect to a website.
       * The secret stores your credentials of user name and password.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerbasicauthentication.html#cfn-kendra-datasource-webcrawlerbasicauthentication-credentials)
       */
      override fun credentials(): String = unwrap(this).getCredentials()

      /**
       * The name of the website host you want to connect to using authentication credentials.
       *
       * For example, the host name of https://a.example.com/page1.html is "a.example.com".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerbasicauthentication.html#cfn-kendra-datasource-webcrawlerbasicauthentication-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * The port number of the website host you want to connect to using authentication
       * credentials.
       *
       * For example, the port for https://a.example.com/page1.html is 443, the standard port for
       * HTTPS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerbasicauthentication.html#cfn-kendra-datasource-webcrawlerbasicauthentication-port)
       */
      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          WebCrawlerBasicAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty):
          WebCrawlerBasicAuthenticationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebCrawlerBasicAuthenticationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty
    }
  }

  /**
   * Specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites
   * you want to crawl.
   *
   * You can include website subdomains. You can list up to 100 seed URLs and up to three sitemap
   * URLs.
   *
   * You can only crawl websites that use the secure communication protocol, Hypertext Transfer
   * Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the
   * website is blocked from crawling.
   *
   * *When selecting websites to index, you must adhere to the [Amazon Acceptable Use
   * Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms. Remember that you must only
   * use the Amazon Kendra web crawler to index your own webpages, or webpages that you have
   * authorization to index.*
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface WebCrawlerUrlsProperty {
    /**
     * Configuration of the seed or starting point URLs of the websites you want to crawl.
     *
     * You can choose to crawl only the website host names, or the website host names with
     * subdomains, or the website host names with subdomains and other domains that the web pages link
     * to.
     *
     * You can list up to 100 seed URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerurls.html#cfn-kendra-datasource-webcrawlerurls-seedurlconfiguration)
     */
    public fun seedUrlConfiguration(): Any? = unwrap(this).getSeedUrlConfiguration()

    /**
     * Configuration of the sitemap URLs of the websites you want to crawl.
     *
     * Only URLs belonging to the same website host names are crawled. You can list up to three
     * sitemap URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerurls.html#cfn-kendra-datasource-webcrawlerurls-sitemapsconfiguration)
     */
    public fun siteMapsConfiguration(): Any? = unwrap(this).getSiteMapsConfiguration()

    /**
     * A builder for [WebCrawlerUrlsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param seedUrlConfiguration Configuration of the seed or starting point URLs of the
       * websites you want to crawl.
       * You can choose to crawl only the website host names, or the website host names with
       * subdomains, or the website host names with subdomains and other domains that the web pages
       * link to.
       *
       * You can list up to 100 seed URLs.
       */
      public fun seedUrlConfiguration(seedUrlConfiguration: IResolvable)

      /**
       * @param seedUrlConfiguration Configuration of the seed or starting point URLs of the
       * websites you want to crawl.
       * You can choose to crawl only the website host names, or the website host names with
       * subdomains, or the website host names with subdomains and other domains that the web pages
       * link to.
       *
       * You can list up to 100 seed URLs.
       */
      public fun seedUrlConfiguration(seedUrlConfiguration: WebCrawlerSeedUrlConfigurationProperty)

      /**
       * @param seedUrlConfiguration Configuration of the seed or starting point URLs of the
       * websites you want to crawl.
       * You can choose to crawl only the website host names, or the website host names with
       * subdomains, or the website host names with subdomains and other domains that the web pages
       * link to.
       *
       * You can list up to 100 seed URLs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82f98e3cc6b19884926eac964217023af22b275e09e65fa53d053724d4d2b6bd")
      public
          fun seedUrlConfiguration(seedUrlConfiguration: WebCrawlerSeedUrlConfigurationProperty.Builder.() -> Unit)

      /**
       * @param siteMapsConfiguration Configuration of the sitemap URLs of the websites you want to
       * crawl.
       * Only URLs belonging to the same website host names are crawled. You can list up to three
       * sitemap URLs.
       */
      public fun siteMapsConfiguration(siteMapsConfiguration: IResolvable)

      /**
       * @param siteMapsConfiguration Configuration of the sitemap URLs of the websites you want to
       * crawl.
       * Only URLs belonging to the same website host names are crawled. You can list up to three
       * sitemap URLs.
       */
      public
          fun siteMapsConfiguration(siteMapsConfiguration: WebCrawlerSiteMapsConfigurationProperty)

      /**
       * @param siteMapsConfiguration Configuration of the sitemap URLs of the websites you want to
       * crawl.
       * Only URLs belonging to the same website host names are crawled. You can list up to three
       * sitemap URLs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42270145f287d26bf5765aa46ea377506996d9f8ff2928c03856ac644e6facd4")
      public
          fun siteMapsConfiguration(siteMapsConfiguration: WebCrawlerSiteMapsConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty.builder()

      /**
       * @param seedUrlConfiguration Configuration of the seed or starting point URLs of the
       * websites you want to crawl.
       * You can choose to crawl only the website host names, or the website host names with
       * subdomains, or the website host names with subdomains and other domains that the web pages
       * link to.
       *
       * You can list up to 100 seed URLs.
       */
      override fun seedUrlConfiguration(seedUrlConfiguration: IResolvable) {
        cdkBuilder.seedUrlConfiguration(seedUrlConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param seedUrlConfiguration Configuration of the seed or starting point URLs of the
       * websites you want to crawl.
       * You can choose to crawl only the website host names, or the website host names with
       * subdomains, or the website host names with subdomains and other domains that the web pages
       * link to.
       *
       * You can list up to 100 seed URLs.
       */
      override
          fun seedUrlConfiguration(seedUrlConfiguration: WebCrawlerSeedUrlConfigurationProperty) {
        cdkBuilder.seedUrlConfiguration(seedUrlConfiguration.let(WebCrawlerSeedUrlConfigurationProperty::unwrap))
      }

      /**
       * @param seedUrlConfiguration Configuration of the seed or starting point URLs of the
       * websites you want to crawl.
       * You can choose to crawl only the website host names, or the website host names with
       * subdomains, or the website host names with subdomains and other domains that the web pages
       * link to.
       *
       * You can list up to 100 seed URLs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82f98e3cc6b19884926eac964217023af22b275e09e65fa53d053724d4d2b6bd")
      override
          fun seedUrlConfiguration(seedUrlConfiguration: WebCrawlerSeedUrlConfigurationProperty.Builder.() -> Unit):
          Unit = seedUrlConfiguration(WebCrawlerSeedUrlConfigurationProperty(seedUrlConfiguration))

      /**
       * @param siteMapsConfiguration Configuration of the sitemap URLs of the websites you want to
       * crawl.
       * Only URLs belonging to the same website host names are crawled. You can list up to three
       * sitemap URLs.
       */
      override fun siteMapsConfiguration(siteMapsConfiguration: IResolvable) {
        cdkBuilder.siteMapsConfiguration(siteMapsConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param siteMapsConfiguration Configuration of the sitemap URLs of the websites you want to
       * crawl.
       * Only URLs belonging to the same website host names are crawled. You can list up to three
       * sitemap URLs.
       */
      override
          fun siteMapsConfiguration(siteMapsConfiguration: WebCrawlerSiteMapsConfigurationProperty) {
        cdkBuilder.siteMapsConfiguration(siteMapsConfiguration.let(WebCrawlerSiteMapsConfigurationProperty::unwrap))
      }

      /**
       * @param siteMapsConfiguration Configuration of the sitemap URLs of the websites you want to
       * crawl.
       * Only URLs belonging to the same website host names are crawled. You can list up to three
       * sitemap URLs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42270145f287d26bf5765aa46ea377506996d9f8ff2928c03856ac644e6facd4")
      override
          fun siteMapsConfiguration(siteMapsConfiguration: WebCrawlerSiteMapsConfigurationProperty.Builder.() -> Unit):
          Unit =
          siteMapsConfiguration(WebCrawlerSiteMapsConfigurationProperty(siteMapsConfiguration))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty,
    ) : CdkObject(cdkObject), WebCrawlerUrlsProperty {
      /**
       * Configuration of the seed or starting point URLs of the websites you want to crawl.
       *
       * You can choose to crawl only the website host names, or the website host names with
       * subdomains, or the website host names with subdomains and other domains that the web pages
       * link to.
       *
       * You can list up to 100 seed URLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerurls.html#cfn-kendra-datasource-webcrawlerurls-seedurlconfiguration)
       */
      override fun seedUrlConfiguration(): Any? = unwrap(this).getSeedUrlConfiguration()

      /**
       * Configuration of the sitemap URLs of the websites you want to crawl.
       *
       * Only URLs belonging to the same website host names are crawled. You can list up to three
       * sitemap URLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerurls.html#cfn-kendra-datasource-webcrawlerurls-sitemapsconfiguration)
       */
      override fun siteMapsConfiguration(): Any? = unwrap(this).getSiteMapsConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WebCrawlerUrlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty):
          WebCrawlerUrlsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebCrawlerUrlsProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty
    }
  }

  /**
   * Configuration of blog settings for the Confluence data source.
   *
   * Blogs are always indexed unless filtered from the index by the `ExclusionPatterns` or
   * `InclusionPatterns` fields in the `ConfluenceConfiguration` object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface ConfluenceBlogConfigurationProperty {
    /**
     * Maps attributes or field names of Confluence blogs to Amazon Kendra index field names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
     * more information, see [Mapping data source
     * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
     * source field names must exist in your Confluence custom metadata.
     *
     * If you specify the `BlogFieldMappings` parameter, you must specify at least one field
     * mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceblogconfiguration.html#cfn-kendra-datasource-confluenceblogconfiguration-blogfieldmappings)
     */
    public fun blogFieldMappings(): Any? = unwrap(this).getBlogFieldMappings()

    /**
     * A builder for [ConfluenceBlogConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blogFieldMappings Maps attributes or field names of Confluence blogs to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `BlogFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      public fun blogFieldMappings(blogFieldMappings: IResolvable)

      /**
       * @param blogFieldMappings Maps attributes or field names of Confluence blogs to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `BlogFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      public fun blogFieldMappings(blogFieldMappings: List<Any>)

      /**
       * @param blogFieldMappings Maps attributes or field names of Confluence blogs to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `BlogFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      public fun blogFieldMappings(vararg blogFieldMappings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty.builder()

      /**
       * @param blogFieldMappings Maps attributes or field names of Confluence blogs to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `BlogFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      override fun blogFieldMappings(blogFieldMappings: IResolvable) {
        cdkBuilder.blogFieldMappings(blogFieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param blogFieldMappings Maps attributes or field names of Confluence blogs to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `BlogFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      override fun blogFieldMappings(blogFieldMappings: List<Any>) {
        cdkBuilder.blogFieldMappings(blogFieldMappings)
      }

      /**
       * @param blogFieldMappings Maps attributes or field names of Confluence blogs to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `BlogFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      override fun blogFieldMappings(vararg blogFieldMappings: Any): Unit =
          blogFieldMappings(blogFieldMappings.toList())

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty,
    ) : CdkObject(cdkObject), ConfluenceBlogConfigurationProperty {
      /**
       * Maps attributes or field names of Confluence blogs to Amazon Kendra index field names.
       *
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `BlogFieldMappings` parameter, you must specify at least one field
       * mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceblogconfiguration.html#cfn-kendra-datasource-confluenceblogconfiguration-blogfieldmappings)
       */
      override fun blogFieldMappings(): Any? = unwrap(this).getBlogFieldMappings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluenceBlogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty):
          ConfluenceBlogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceBlogConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty
    }
  }

  /**
   * Provides information that configures Amazon Kendra to use a SQL database.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
   * SqlConfigurationProperty sqlConfigurationProperty = SqlConfigurationProperty.builder()
   * .queryIdentifiersEnclosingOption("queryIdentifiersEnclosingOption")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sqlconfiguration.html)
   */
  public interface SqlConfigurationProperty {
    /**
     * Determines whether Amazon Kendra encloses SQL identifiers for tables and column names in
     * double quotes (") when making a database query.
     *
     * You can set the value to `DOUBLE_QUOTES` or `NONE` .
     *
     * By default, Amazon Kendra passes SQL identifiers the way that they are entered into the data
     * source configuration. It does not change the case of identifiers or enclose them in quotes.
     *
     * PostgreSQL internally converts uppercase characters to lower case characters in identifiers
     * unless they are quoted. Choosing this option encloses identifiers in quotes so that PostgreSQL
     * does not convert the character's case.
     *
     * For MySQL databases, you must enable the ansi_quotes option when you set this field to
     * `DOUBLE_QUOTES` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sqlconfiguration.html#cfn-kendra-datasource-sqlconfiguration-queryidentifiersenclosingoption)
     */
    public fun queryIdentifiersEnclosingOption(): String? =
        unwrap(this).getQueryIdentifiersEnclosingOption()

    /**
     * A builder for [SqlConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param queryIdentifiersEnclosingOption Determines whether Amazon Kendra encloses SQL
       * identifiers for tables and column names in double quotes (") when making a database query.
       * You can set the value to `DOUBLE_QUOTES` or `NONE` .
       *
       * By default, Amazon Kendra passes SQL identifiers the way that they are entered into the
       * data source configuration. It does not change the case of identifiers or enclose them in
       * quotes.
       *
       * PostgreSQL internally converts uppercase characters to lower case characters in identifiers
       * unless they are quoted. Choosing this option encloses identifiers in quotes so that PostgreSQL
       * does not convert the character's case.
       *
       * For MySQL databases, you must enable the ansi_quotes option when you set this field to
       * `DOUBLE_QUOTES` .
       */
      public fun queryIdentifiersEnclosingOption(queryIdentifiersEnclosingOption: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty.builder()

      /**
       * @param queryIdentifiersEnclosingOption Determines whether Amazon Kendra encloses SQL
       * identifiers for tables and column names in double quotes (") when making a database query.
       * You can set the value to `DOUBLE_QUOTES` or `NONE` .
       *
       * By default, Amazon Kendra passes SQL identifiers the way that they are entered into the
       * data source configuration. It does not change the case of identifiers or enclose them in
       * quotes.
       *
       * PostgreSQL internally converts uppercase characters to lower case characters in identifiers
       * unless they are quoted. Choosing this option encloses identifiers in quotes so that PostgreSQL
       * does not convert the character's case.
       *
       * For MySQL databases, you must enable the ansi_quotes option when you set this field to
       * `DOUBLE_QUOTES` .
       */
      override fun queryIdentifiersEnclosingOption(queryIdentifiersEnclosingOption: String) {
        cdkBuilder.queryIdentifiersEnclosingOption(queryIdentifiersEnclosingOption)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty,
    ) : CdkObject(cdkObject), SqlConfigurationProperty {
      /**
       * Determines whether Amazon Kendra encloses SQL identifiers for tables and column names in
       * double quotes (") when making a database query.
       *
       * You can set the value to `DOUBLE_QUOTES` or `NONE` .
       *
       * By default, Amazon Kendra passes SQL identifiers the way that they are entered into the
       * data source configuration. It does not change the case of identifiers or enclose them in
       * quotes.
       *
       * PostgreSQL internally converts uppercase characters to lower case characters in identifiers
       * unless they are quoted. Choosing this option encloses identifiers in quotes so that PostgreSQL
       * does not convert the character's case.
       *
       * For MySQL databases, you must enable the ansi_quotes option when you set this field to
       * `DOUBLE_QUOTES` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sqlconfiguration.html#cfn-kendra-datasource-sqlconfiguration-queryidentifiersenclosingoption)
       */
      override fun queryIdentifiersEnclosingOption(): String? =
          unwrap(this).getQueryIdentifiersEnclosingOption()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SqlConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty):
          SqlConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqlConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty
    }
  }

  /**
   * Information required to find a specific file in an Amazon S3 bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
   * S3PathProperty s3PathProperty = S3PathProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3path.html)
   */
  public interface S3PathProperty {
    /**
     * The name of the S3 bucket that contains the file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3path.html#cfn-kendra-datasource-s3path-bucket)
     */
    public fun bucket(): String

    /**
     * The name of the file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3path.html#cfn-kendra-datasource-s3path-key)
     */
    public fun key(): String

    /**
     * A builder for [S3PathProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the S3 bucket that contains the file. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key The name of the file. 
       */
      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty.builder()

      /**
       * @param bucket The name of the S3 bucket that contains the file. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key The name of the file. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build(): software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty,
    ) : CdkObject(cdkObject), S3PathProperty {
      /**
       * The name of the S3 bucket that contains the file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3path.html#cfn-kendra-datasource-s3path-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The name of the file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3path.html#cfn-kendra-datasource-s3path-key)
       */
      override fun key(): String = unwrap(this).getKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3PathProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty):
          S3PathProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3PathProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty
    }
  }

  /**
   * Maps attributes or field names of Confluence spaces to Amazon Kendra index field names.
   *
   * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
   * source field names must exist in your Confluence custom metadata.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface ConfluenceSpaceToIndexFieldMappingProperty {
    /**
     * The name of the field in the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespacetoindexfieldmapping.html#cfn-kendra-datasource-confluencespacetoindexfieldmapping-datasourcefieldname)
     */
    public fun dataSourceFieldName(): String

    /**
     * The format for date fields in the data source.
     *
     * If the field specified in `DataSourceFieldName` is a date field you must specify the date
     * format. If the field is not a date field, an exception is thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespacetoindexfieldmapping.html#cfn-kendra-datasource-confluencespacetoindexfieldmapping-datefieldformat)
     */
    public fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

    /**
     * The name of the index field to map to the Confluence data source field.
     *
     * The index field type must match the Confluence field type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespacetoindexfieldmapping.html#cfn-kendra-datasource-confluencespacetoindexfieldmapping-indexfieldname)
     */
    public fun indexFieldName(): String

    /**
     * A builder for [ConfluenceSpaceToIndexFieldMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataSourceFieldName The name of the field in the data source. 
       */
      public fun dataSourceFieldName(dataSourceFieldName: String)

      /**
       * @param dateFieldFormat The format for date fields in the data source.
       * If the field specified in `DataSourceFieldName` is a date field you must specify the date
       * format. If the field is not a date field, an exception is thrown.
       */
      public fun dateFieldFormat(dateFieldFormat: String)

      /**
       * @param indexFieldName The name of the index field to map to the Confluence data source
       * field. 
       * The index field type must match the Confluence field type.
       */
      public fun indexFieldName(indexFieldName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty.builder()

      /**
       * @param dataSourceFieldName The name of the field in the data source. 
       */
      override fun dataSourceFieldName(dataSourceFieldName: String) {
        cdkBuilder.dataSourceFieldName(dataSourceFieldName)
      }

      /**
       * @param dateFieldFormat The format for date fields in the data source.
       * If the field specified in `DataSourceFieldName` is a date field you must specify the date
       * format. If the field is not a date field, an exception is thrown.
       */
      override fun dateFieldFormat(dateFieldFormat: String) {
        cdkBuilder.dateFieldFormat(dateFieldFormat)
      }

      /**
       * @param indexFieldName The name of the index field to map to the Confluence data source
       * field. 
       * The index field type must match the Confluence field type.
       */
      override fun indexFieldName(indexFieldName: String) {
        cdkBuilder.indexFieldName(indexFieldName)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty,
    ) : CdkObject(cdkObject), ConfluenceSpaceToIndexFieldMappingProperty {
      /**
       * The name of the field in the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespacetoindexfieldmapping.html#cfn-kendra-datasource-confluencespacetoindexfieldmapping-datasourcefieldname)
       */
      override fun dataSourceFieldName(): String = unwrap(this).getDataSourceFieldName()

      /**
       * The format for date fields in the data source.
       *
       * If the field specified in `DataSourceFieldName` is a date field you must specify the date
       * format. If the field is not a date field, an exception is thrown.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespacetoindexfieldmapping.html#cfn-kendra-datasource-confluencespacetoindexfieldmapping-datefieldformat)
       */
      override fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

      /**
       * The name of the index field to map to the Confluence data source field.
       *
       * The index field type must match the Confluence field type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespacetoindexfieldmapping.html#cfn-kendra-datasource-confluencespacetoindexfieldmapping-indexfieldname)
       */
      override fun indexFieldName(): String = unwrap(this).getIndexFieldName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluenceSpaceToIndexFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty):
          ConfluenceSpaceToIndexFieldMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceSpaceToIndexFieldMappingProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty
    }
  }

  /**
   * Maps attributes or field names of Confluence blog to Amazon Kendra index field names.
   *
   * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
   * source field names must exist in your Confluence custom metadata.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface ConfluenceBlogToIndexFieldMappingProperty {
    /**
     * The name of the field in the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceblogtoindexfieldmapping.html#cfn-kendra-datasource-confluenceblogtoindexfieldmapping-datasourcefieldname)
     */
    public fun dataSourceFieldName(): String

    /**
     * The format for date fields in the data source.
     *
     * If the field specified in `DataSourceFieldName` is a date field you must specify the date
     * format. If the field is not a date field, an exception is thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceblogtoindexfieldmapping.html#cfn-kendra-datasource-confluenceblogtoindexfieldmapping-datefieldformat)
     */
    public fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

    /**
     * The name of the index field to map to the Confluence data source field.
     *
     * The index field type must match the Confluence field type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceblogtoindexfieldmapping.html#cfn-kendra-datasource-confluenceblogtoindexfieldmapping-indexfieldname)
     */
    public fun indexFieldName(): String

    /**
     * A builder for [ConfluenceBlogToIndexFieldMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataSourceFieldName The name of the field in the data source. 
       */
      public fun dataSourceFieldName(dataSourceFieldName: String)

      /**
       * @param dateFieldFormat The format for date fields in the data source.
       * If the field specified in `DataSourceFieldName` is a date field you must specify the date
       * format. If the field is not a date field, an exception is thrown.
       */
      public fun dateFieldFormat(dateFieldFormat: String)

      /**
       * @param indexFieldName The name of the index field to map to the Confluence data source
       * field. 
       * The index field type must match the Confluence field type.
       */
      public fun indexFieldName(indexFieldName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty.builder()

      /**
       * @param dataSourceFieldName The name of the field in the data source. 
       */
      override fun dataSourceFieldName(dataSourceFieldName: String) {
        cdkBuilder.dataSourceFieldName(dataSourceFieldName)
      }

      /**
       * @param dateFieldFormat The format for date fields in the data source.
       * If the field specified in `DataSourceFieldName` is a date field you must specify the date
       * format. If the field is not a date field, an exception is thrown.
       */
      override fun dateFieldFormat(dateFieldFormat: String) {
        cdkBuilder.dateFieldFormat(dateFieldFormat)
      }

      /**
       * @param indexFieldName The name of the index field to map to the Confluence data source
       * field. 
       * The index field type must match the Confluence field type.
       */
      override fun indexFieldName(indexFieldName: String) {
        cdkBuilder.indexFieldName(indexFieldName)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty,
    ) : CdkObject(cdkObject), ConfluenceBlogToIndexFieldMappingProperty {
      /**
       * The name of the field in the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceblogtoindexfieldmapping.html#cfn-kendra-datasource-confluenceblogtoindexfieldmapping-datasourcefieldname)
       */
      override fun dataSourceFieldName(): String = unwrap(this).getDataSourceFieldName()

      /**
       * The format for date fields in the data source.
       *
       * If the field specified in `DataSourceFieldName` is a date field you must specify the date
       * format. If the field is not a date field, an exception is thrown.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceblogtoindexfieldmapping.html#cfn-kendra-datasource-confluenceblogtoindexfieldmapping-datefieldformat)
       */
      override fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

      /**
       * The name of the index field to map to the Confluence data source field.
       *
       * The index field type must match the Confluence field type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceblogtoindexfieldmapping.html#cfn-kendra-datasource-confluenceblogtoindexfieldmapping-indexfieldname)
       */
      override fun indexFieldName(): String = unwrap(this).getIndexFieldName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluenceBlogToIndexFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty):
          ConfluenceBlogToIndexFieldMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceBlogToIndexFieldMappingProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty
    }
  }

  /**
   * Provides the configuration information for a web proxy to connect to website hosts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface ProxyConfigurationProperty {
    /**
     * Your secret ARN, which you can create in [AWS Secrets
     * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html).
     *
     * The credentials are optional. You use a secret if web proxy credentials are required to
     * connect to a website host. Amazon Kendra currently support basic authentication to connect to a
     * web proxy server. The secret stores your credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-proxyconfiguration.html#cfn-kendra-datasource-proxyconfiguration-credentials)
     */
    public fun credentials(): String? = unwrap(this).getCredentials()

    /**
     * The name of the website host you want to connect to via a web proxy server.
     *
     * For example, the host name of https://a.example.com/page1.html is "a.example.com".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-proxyconfiguration.html#cfn-kendra-datasource-proxyconfiguration-host)
     */
    public fun host(): String

    /**
     * The port number of the website host you want to connect to via a web proxy server.
     *
     * For example, the port for https://a.example.com/page1.html is 443, the standard port for
     * HTTPS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-proxyconfiguration.html#cfn-kendra-datasource-proxyconfiguration-port)
     */
    public fun port(): Number

    /**
     * A builder for [ProxyConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param credentials Your secret ARN, which you can create in [AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html).
       * The credentials are optional. You use a secret if web proxy credentials are required to
       * connect to a website host. Amazon Kendra currently support basic authentication to connect to
       * a web proxy server. The secret stores your credentials.
       */
      public fun credentials(credentials: String)

      /**
       * @param host The name of the website host you want to connect to via a web proxy server. 
       * For example, the host name of https://a.example.com/page1.html is "a.example.com".
       */
      public fun host(host: String)

      /**
       * @param port The port number of the website host you want to connect to via a web proxy
       * server. 
       * For example, the port for https://a.example.com/page1.html is 443, the standard port for
       * HTTPS.
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty.builder()

      /**
       * @param credentials Your secret ARN, which you can create in [AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html).
       * The credentials are optional. You use a secret if web proxy credentials are required to
       * connect to a website host. Amazon Kendra currently support basic authentication to connect to
       * a web proxy server. The secret stores your credentials.
       */
      override fun credentials(credentials: String) {
        cdkBuilder.credentials(credentials)
      }

      /**
       * @param host The name of the website host you want to connect to via a web proxy server. 
       * For example, the host name of https://a.example.com/page1.html is "a.example.com".
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param port The port number of the website host you want to connect to via a web proxy
       * server. 
       * For example, the port for https://a.example.com/page1.html is 443, the standard port for
       * HTTPS.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty,
    ) : CdkObject(cdkObject), ProxyConfigurationProperty {
      /**
       * Your secret ARN, which you can create in [AWS Secrets
       * Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html).
       *
       * The credentials are optional. You use a secret if web proxy credentials are required to
       * connect to a website host. Amazon Kendra currently support basic authentication to connect to
       * a web proxy server. The secret stores your credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-proxyconfiguration.html#cfn-kendra-datasource-proxyconfiguration-credentials)
       */
      override fun credentials(): String? = unwrap(this).getCredentials()

      /**
       * The name of the website host you want to connect to via a web proxy server.
       *
       * For example, the host name of https://a.example.com/page1.html is "a.example.com".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-proxyconfiguration.html#cfn-kendra-datasource-proxyconfiguration-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * The port number of the website host you want to connect to via a web proxy server.
       *
       * For example, the port for https://a.example.com/page1.html is 443, the standard port for
       * HTTPS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-proxyconfiguration.html#cfn-kendra-datasource-proxyconfiguration-port)
       */
      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProxyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty):
          ProxyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProxyConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty
    }
  }

  /**
   * Specifies access control list files for the documents in a data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
   * AccessControlListConfigurationProperty accessControlListConfigurationProperty =
   * AccessControlListConfigurationProperty.builder()
   * .keyPath("keyPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-accesscontrollistconfiguration.html)
   */
  public interface AccessControlListConfigurationProperty {
    /**
     * Path to the AWS S3 bucket that contains the access control list files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-accesscontrollistconfiguration.html#cfn-kendra-datasource-accesscontrollistconfiguration-keypath)
     */
    public fun keyPath(): String? = unwrap(this).getKeyPath()

    /**
     * A builder for [AccessControlListConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyPath Path to the AWS S3 bucket that contains the access control list files.
       */
      public fun keyPath(keyPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty.builder()

      /**
       * @param keyPath Path to the AWS S3 bucket that contains the access control list files.
       */
      override fun keyPath(keyPath: String) {
        cdkBuilder.keyPath(keyPath)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty,
    ) : CdkObject(cdkObject), AccessControlListConfigurationProperty {
      /**
       * Path to the AWS S3 bucket that contains the access control list files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-accesscontrollistconfiguration.html#cfn-kendra-datasource-accesscontrollistconfiguration-keypath)
       */
      override fun keyPath(): String? = unwrap(this).getKeyPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccessControlListConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty):
          AccessControlListConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessControlListConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty
    }
  }

  /**
   * Maps attributes or field names of Confluence attachments to Amazon Kendra index field names.
   *
   * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confuence data
   * source field names must exist in your Confluence custom metadata.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface ConfluenceAttachmentToIndexFieldMappingProperty {
    /**
     * The name of the field in the data source.
     *
     * You must first create the index field using the `UpdateIndex` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceattachmenttoindexfieldmapping.html#cfn-kendra-datasource-confluenceattachmenttoindexfieldmapping-datasourcefieldname)
     */
    public fun dataSourceFieldName(): String

    /**
     * The format for date fields in the data source.
     *
     * If the field specified in `DataSourceFieldName` is a date field you must specify the date
     * format. If the field is not a date field, an exception is thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceattachmenttoindexfieldmapping.html#cfn-kendra-datasource-confluenceattachmenttoindexfieldmapping-datefieldformat)
     */
    public fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

    /**
     * The name of the index field to map to the Confluence data source field.
     *
     * The index field type must match the Confluence field type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceattachmenttoindexfieldmapping.html#cfn-kendra-datasource-confluenceattachmenttoindexfieldmapping-indexfieldname)
     */
    public fun indexFieldName(): String

    /**
     * A builder for [ConfluenceAttachmentToIndexFieldMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataSourceFieldName The name of the field in the data source. 
       * You must first create the index field using the `UpdateIndex` API.
       */
      public fun dataSourceFieldName(dataSourceFieldName: String)

      /**
       * @param dateFieldFormat The format for date fields in the data source.
       * If the field specified in `DataSourceFieldName` is a date field you must specify the date
       * format. If the field is not a date field, an exception is thrown.
       */
      public fun dateFieldFormat(dateFieldFormat: String)

      /**
       * @param indexFieldName The name of the index field to map to the Confluence data source
       * field. 
       * The index field type must match the Confluence field type.
       */
      public fun indexFieldName(indexFieldName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty.builder()

      /**
       * @param dataSourceFieldName The name of the field in the data source. 
       * You must first create the index field using the `UpdateIndex` API.
       */
      override fun dataSourceFieldName(dataSourceFieldName: String) {
        cdkBuilder.dataSourceFieldName(dataSourceFieldName)
      }

      /**
       * @param dateFieldFormat The format for date fields in the data source.
       * If the field specified in `DataSourceFieldName` is a date field you must specify the date
       * format. If the field is not a date field, an exception is thrown.
       */
      override fun dateFieldFormat(dateFieldFormat: String) {
        cdkBuilder.dateFieldFormat(dateFieldFormat)
      }

      /**
       * @param indexFieldName The name of the index field to map to the Confluence data source
       * field. 
       * The index field type must match the Confluence field type.
       */
      override fun indexFieldName(indexFieldName: String) {
        cdkBuilder.indexFieldName(indexFieldName)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty,
    ) : CdkObject(cdkObject), ConfluenceAttachmentToIndexFieldMappingProperty {
      /**
       * The name of the field in the data source.
       *
       * You must first create the index field using the `UpdateIndex` API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceattachmenttoindexfieldmapping.html#cfn-kendra-datasource-confluenceattachmenttoindexfieldmapping-datasourcefieldname)
       */
      override fun dataSourceFieldName(): String = unwrap(this).getDataSourceFieldName()

      /**
       * The format for date fields in the data source.
       *
       * If the field specified in `DataSourceFieldName` is a date field you must specify the date
       * format. If the field is not a date field, an exception is thrown.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceattachmenttoindexfieldmapping.html#cfn-kendra-datasource-confluenceattachmenttoindexfieldmapping-datefieldformat)
       */
      override fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

      /**
       * The name of the index field to map to the Confluence data source field.
       *
       * The index field type must match the Confluence field type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceattachmenttoindexfieldmapping.html#cfn-kendra-datasource-confluenceattachmenttoindexfieldmapping-indexfieldname)
       */
      override fun indexFieldName(): String = unwrap(this).getIndexFieldName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluenceAttachmentToIndexFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty):
          ConfluenceAttachmentToIndexFieldMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceAttachmentToIndexFieldMappingProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty
    }
  }

  /**
   * Configuration of attachment settings for the Confluence data source.
   *
   * Attachment settings are optional, if you don't specify settings attachments, Amazon Kendra
   * won't index them.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface ConfluenceAttachmentConfigurationProperty {
    /**
     * Maps attributes or field names of Confluence attachments to Amazon Kendra index field names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
     * more information, see [Mapping data source
     * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
     * source field names must exist in your Confluence custom metadata.
     *
     * If you specify the `AttachentFieldMappings` parameter, you must specify at least one field
     * mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceattachmentconfiguration.html#cfn-kendra-datasource-confluenceattachmentconfiguration-attachmentfieldmappings)
     */
    public fun attachmentFieldMappings(): Any? = unwrap(this).getAttachmentFieldMappings()

    /**
     * `TRUE` to index attachments of pages and blogs in Confluence.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceattachmentconfiguration.html#cfn-kendra-datasource-confluenceattachmentconfiguration-crawlattachments)
     */
    public fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

    /**
     * A builder for [ConfluenceAttachmentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attachmentFieldMappings Maps attributes or field names of Confluence attachments to
       * Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `AttachentFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      public fun attachmentFieldMappings(attachmentFieldMappings: IResolvable)

      /**
       * @param attachmentFieldMappings Maps attributes or field names of Confluence attachments to
       * Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `AttachentFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      public fun attachmentFieldMappings(attachmentFieldMappings: List<Any>)

      /**
       * @param attachmentFieldMappings Maps attributes or field names of Confluence attachments to
       * Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `AttachentFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      public fun attachmentFieldMappings(vararg attachmentFieldMappings: Any)

      /**
       * @param crawlAttachments `TRUE` to index attachments of pages and blogs in Confluence.
       */
      public fun crawlAttachments(crawlAttachments: Boolean)

      /**
       * @param crawlAttachments `TRUE` to index attachments of pages and blogs in Confluence.
       */
      public fun crawlAttachments(crawlAttachments: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty.builder()

      /**
       * @param attachmentFieldMappings Maps attributes or field names of Confluence attachments to
       * Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `AttachentFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      override fun attachmentFieldMappings(attachmentFieldMappings: IResolvable) {
        cdkBuilder.attachmentFieldMappings(attachmentFieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param attachmentFieldMappings Maps attributes or field names of Confluence attachments to
       * Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `AttachentFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      override fun attachmentFieldMappings(attachmentFieldMappings: List<Any>) {
        cdkBuilder.attachmentFieldMappings(attachmentFieldMappings)
      }

      /**
       * @param attachmentFieldMappings Maps attributes or field names of Confluence attachments to
       * Amazon Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `AttachentFieldMappings` parameter, you must specify at least one field
       * mapping.
       */
      override fun attachmentFieldMappings(vararg attachmentFieldMappings: Any): Unit =
          attachmentFieldMappings(attachmentFieldMappings.toList())

      /**
       * @param crawlAttachments `TRUE` to index attachments of pages and blogs in Confluence.
       */
      override fun crawlAttachments(crawlAttachments: Boolean) {
        cdkBuilder.crawlAttachments(crawlAttachments)
      }

      /**
       * @param crawlAttachments `TRUE` to index attachments of pages and blogs in Confluence.
       */
      override fun crawlAttachments(crawlAttachments: IResolvable) {
        cdkBuilder.crawlAttachments(crawlAttachments.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty,
    ) : CdkObject(cdkObject), ConfluenceAttachmentConfigurationProperty {
      /**
       * Maps attributes or field names of Confluence attachments to Amazon Kendra index field
       * names.
       *
       * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
       * source field names must exist in your Confluence custom metadata.
       *
       * If you specify the `AttachentFieldMappings` parameter, you must specify at least one field
       * mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceattachmentconfiguration.html#cfn-kendra-datasource-confluenceattachmentconfiguration-attachmentfieldmappings)
       */
      override fun attachmentFieldMappings(): Any? = unwrap(this).getAttachmentFieldMappings()

      /**
       * `TRUE` to index attachments of pages and blogs in Confluence.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceattachmentconfiguration.html#cfn-kendra-datasource-confluenceattachmentconfiguration-crawlattachments)
       */
      override fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluenceAttachmentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty):
          ConfluenceAttachmentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceAttachmentConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty
    }
  }

  /**
   * Provides the configuration information for applying basic logic to alter document metadata and
   * content when ingesting documents into Amazon Kendra.
   *
   * To apply advanced logic, to go beyond what you can do with basic logic, see
   * [HookConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_HookConfiguration.html) .
   *
   * For more information, see [Customizing document metadata during the ingestion
   * process](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface InlineCustomDocumentEnrichmentConfigurationProperty {
    /**
     * Configuration of the condition used for the target document attribute or metadata field when
     * ingesting documents into Amazon Kendra.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-inlinecustomdocumentenrichmentconfiguration.html#cfn-kendra-datasource-inlinecustomdocumentenrichmentconfiguration-condition)
     */
    public fun condition(): Any? = unwrap(this).getCondition()

    /**
     * `TRUE` to delete content if the condition used for the target attribute is met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-inlinecustomdocumentenrichmentconfiguration.html#cfn-kendra-datasource-inlinecustomdocumentenrichmentconfiguration-documentcontentdeletion)
     */
    public fun documentContentDeletion(): Any? = unwrap(this).getDocumentContentDeletion()

    /**
     * Configuration of the target document attribute or metadata field when ingesting documents
     * into Amazon Kendra.
     *
     * You can also include a value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-inlinecustomdocumentenrichmentconfiguration.html#cfn-kendra-datasource-inlinecustomdocumentenrichmentconfiguration-target)
     */
    public fun target(): Any? = unwrap(this).getTarget()

    /**
     * A builder for [InlineCustomDocumentEnrichmentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param condition Configuration of the condition used for the target document attribute or
       * metadata field when ingesting documents into Amazon Kendra.
       */
      public fun condition(condition: IResolvable)

      /**
       * @param condition Configuration of the condition used for the target document attribute or
       * metadata field when ingesting documents into Amazon Kendra.
       */
      public fun condition(condition: DocumentAttributeConditionProperty)

      /**
       * @param condition Configuration of the condition used for the target document attribute or
       * metadata field when ingesting documents into Amazon Kendra.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("372eb10ee98294f51fc68306591bc84442eccbfa064b67783a71dda041a0902a")
      public fun condition(condition: DocumentAttributeConditionProperty.Builder.() -> Unit)

      /**
       * @param documentContentDeletion `TRUE` to delete content if the condition used for the
       * target attribute is met.
       */
      public fun documentContentDeletion(documentContentDeletion: Boolean)

      /**
       * @param documentContentDeletion `TRUE` to delete content if the condition used for the
       * target attribute is met.
       */
      public fun documentContentDeletion(documentContentDeletion: IResolvable)

      /**
       * @param target Configuration of the target document attribute or metadata field when
       * ingesting documents into Amazon Kendra.
       * You can also include a value.
       */
      public fun target(target: IResolvable)

      /**
       * @param target Configuration of the target document attribute or metadata field when
       * ingesting documents into Amazon Kendra.
       * You can also include a value.
       */
      public fun target(target: DocumentAttributeTargetProperty)

      /**
       * @param target Configuration of the target document attribute or metadata field when
       * ingesting documents into Amazon Kendra.
       * You can also include a value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1ba879dc4c824e5d2166f0aa9878e17fb1bcac8b563f403834655e16a2bef59")
      public fun target(target: DocumentAttributeTargetProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty.builder()

      /**
       * @param condition Configuration of the condition used for the target document attribute or
       * metadata field when ingesting documents into Amazon Kendra.
       */
      override fun condition(condition: IResolvable) {
        cdkBuilder.condition(condition.let(IResolvable::unwrap))
      }

      /**
       * @param condition Configuration of the condition used for the target document attribute or
       * metadata field when ingesting documents into Amazon Kendra.
       */
      override fun condition(condition: DocumentAttributeConditionProperty) {
        cdkBuilder.condition(condition.let(DocumentAttributeConditionProperty::unwrap))
      }

      /**
       * @param condition Configuration of the condition used for the target document attribute or
       * metadata field when ingesting documents into Amazon Kendra.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("372eb10ee98294f51fc68306591bc84442eccbfa064b67783a71dda041a0902a")
      override fun condition(condition: DocumentAttributeConditionProperty.Builder.() -> Unit): Unit
          = condition(DocumentAttributeConditionProperty(condition))

      /**
       * @param documentContentDeletion `TRUE` to delete content if the condition used for the
       * target attribute is met.
       */
      override fun documentContentDeletion(documentContentDeletion: Boolean) {
        cdkBuilder.documentContentDeletion(documentContentDeletion)
      }

      /**
       * @param documentContentDeletion `TRUE` to delete content if the condition used for the
       * target attribute is met.
       */
      override fun documentContentDeletion(documentContentDeletion: IResolvable) {
        cdkBuilder.documentContentDeletion(documentContentDeletion.let(IResolvable::unwrap))
      }

      /**
       * @param target Configuration of the target document attribute or metadata field when
       * ingesting documents into Amazon Kendra.
       * You can also include a value.
       */
      override fun target(target: IResolvable) {
        cdkBuilder.target(target.let(IResolvable::unwrap))
      }

      /**
       * @param target Configuration of the target document attribute or metadata field when
       * ingesting documents into Amazon Kendra.
       * You can also include a value.
       */
      override fun target(target: DocumentAttributeTargetProperty) {
        cdkBuilder.target(target.let(DocumentAttributeTargetProperty::unwrap))
      }

      /**
       * @param target Configuration of the target document attribute or metadata field when
       * ingesting documents into Amazon Kendra.
       * You can also include a value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1ba879dc4c824e5d2166f0aa9878e17fb1bcac8b563f403834655e16a2bef59")
      override fun target(target: DocumentAttributeTargetProperty.Builder.() -> Unit): Unit =
          target(DocumentAttributeTargetProperty(target))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty,
    ) : CdkObject(cdkObject), InlineCustomDocumentEnrichmentConfigurationProperty {
      /**
       * Configuration of the condition used for the target document attribute or metadata field
       * when ingesting documents into Amazon Kendra.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-inlinecustomdocumentenrichmentconfiguration.html#cfn-kendra-datasource-inlinecustomdocumentenrichmentconfiguration-condition)
       */
      override fun condition(): Any? = unwrap(this).getCondition()

      /**
       * `TRUE` to delete content if the condition used for the target attribute is met.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-inlinecustomdocumentenrichmentconfiguration.html#cfn-kendra-datasource-inlinecustomdocumentenrichmentconfiguration-documentcontentdeletion)
       */
      override fun documentContentDeletion(): Any? = unwrap(this).getDocumentContentDeletion()

      /**
       * Configuration of the target document attribute or metadata field when ingesting documents
       * into Amazon Kendra.
       *
       * You can also include a value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-inlinecustomdocumentenrichmentconfiguration.html#cfn-kendra-datasource-inlinecustomdocumentenrichmentconfiguration-target)
       */
      override fun target(): Any? = unwrap(this).getTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InlineCustomDocumentEnrichmentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty):
          InlineCustomDocumentEnrichmentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InlineCustomDocumentEnrichmentConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty
    }
  }

  /**
   * Provides the configuration information to connect to an Amazon S3 bucket.
   *
   *
   * Amazon Kendra now supports an upgraded Amazon S3 connector.
   *
   * You must now use the
   * [TemplateConfiguration](https://docs.aws.amazon.com/kendra/latest/APIReference/API_TemplateConfiguration.html)
   * object instead of the `S3DataSourceConfiguration` object to configure your connector.
   *
   * Connectors configured using the older console and API architecture will continue to function as
   * configured. However, you won't be able to edit or update them. If you want to edit or update your
   * connector configuration, you must create a new connector.
   *
   * We recommended migrating your connector workflow to the upgraded version. Support for
   * connectors configured using the older architecture is scheduled to end by June 2024.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface S3DataSourceConfigurationProperty {
    /**
     * Provides the path to the S3 bucket that contains the user context filtering files for the
     * data source.
     *
     * For the format of the file, see [Access control for S3 data
     * sources](https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3datasourceconfiguration.html#cfn-kendra-datasource-s3datasourceconfiguration-accesscontrollistconfiguration)
     */
    public fun accessControlListConfiguration(): Any? =
        unwrap(this).getAccessControlListConfiguration()

    /**
     * The name of the bucket that contains the documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3datasourceconfiguration.html#cfn-kendra-datasource-s3datasourceconfiguration-bucketname)
     */
    public fun bucketName(): String

    /**
     * Specifies document metadata files that contain information such as the document access
     * control information, source URI, document author, and custom attributes.
     *
     * Each metadata file contains metadata about a single document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3datasourceconfiguration.html#cfn-kendra-datasource-s3datasourceconfiguration-documentsmetadataconfiguration)
     */
    public fun documentsMetadataConfiguration(): Any? =
        unwrap(this).getDocumentsMetadataConfiguration()

    /**
     * A list of glob patterns (patterns that can expand a wildcard pattern into a list of path
     * names that match the given pattern) for certain file names and file types to exclude from your
     * index.
     *
     * If a document matches both an inclusion and exclusion prefix or pattern, the exclusion prefix
     * takes precendence and the document is not indexed. Examples of glob patterns include:
     *
     * * `/myapp/config/ *` - All files inside config directory
     * * `/ ** / *.png` - All .png files in all directories
     * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
     * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
     * * `** /!(*.module).ts` - All .ts files but not .module.ts
     * * **.png , *.jpg* excludes all PNG and JPEG image files in a directory (files with the
     * extensions .png and .jpg).
     * * **internal** excludes all files in a directory that contain 'internal' in the file name,
     * such as 'internal', 'internal_only', 'company_internal'.
     * * *** / *internal** excludes all internal-related files in a directory and its
     * subdirectories.
     *
     * For more examples, see [Use of Exclude and Include
     * Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
     * in the AWS CLI Command Reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3datasourceconfiguration.html#cfn-kendra-datasource-s3datasourceconfiguration-exclusionpatterns)
     */
    public fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
        emptyList()

    /**
     * A list of glob patterns (patterns that can expand a wildcard pattern into a list of path
     * names that match the given pattern) for certain file names and file types to include in your
     * index.
     *
     * If a document matches both an inclusion and exclusion prefix or pattern, the exclusion prefix
     * takes precendence and the document is not indexed. Examples of glob patterns include:
     *
     * * `/myapp/config/ *` - All files inside config directory
     * * `/ ** / *.png` - All .png files in all directories
     * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
     * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
     * * `** /!(*.module).ts` - All .ts files but not .module.ts
     * * **.png , *.jpg* includes all PNG and JPEG image files in a directory (files with the
     * extensions .png and .jpg).
     * * **internal** includes all files in a directory that contain 'internal' in the file name,
     * such as 'internal', 'internal_only', 'company_internal'.
     * * *** / *internal** includes all internal-related files in a directory and its
     * subdirectories.
     *
     * For more examples, see [Use of Exclude and Include
     * Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
     * in the AWS CLI Command Reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3datasourceconfiguration.html#cfn-kendra-datasource-s3datasourceconfiguration-inclusionpatterns)
     */
    public fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
        emptyList()

    /**
     * A list of S3 prefixes for the documents that should be included in the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3datasourceconfiguration.html#cfn-kendra-datasource-s3datasourceconfiguration-inclusionprefixes)
     */
    public fun inclusionPrefixes(): List<String> = unwrap(this).getInclusionPrefixes() ?:
        emptyList()

    /**
     * A builder for [S3DataSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessControlListConfiguration Provides the path to the S3 bucket that contains the
       * user context filtering files for the data source.
       * For the format of the file, see [Access control for S3 data
       * sources](https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html) .
       */
      public fun accessControlListConfiguration(accessControlListConfiguration: IResolvable)

      /**
       * @param accessControlListConfiguration Provides the path to the S3 bucket that contains the
       * user context filtering files for the data source.
       * For the format of the file, see [Access control for S3 data
       * sources](https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html) .
       */
      public
          fun accessControlListConfiguration(accessControlListConfiguration: AccessControlListConfigurationProperty)

      /**
       * @param accessControlListConfiguration Provides the path to the S3 bucket that contains the
       * user context filtering files for the data source.
       * For the format of the file, see [Access control for S3 data
       * sources](https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad7f7d2544abe79db57cd7d122e90ba7101511573636633c85a2332f1c60b76c")
      public
          fun accessControlListConfiguration(accessControlListConfiguration: AccessControlListConfigurationProperty.Builder.() -> Unit)

      /**
       * @param bucketName The name of the bucket that contains the documents. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param documentsMetadataConfiguration Specifies document metadata files that contain
       * information such as the document access control information, source URI, document author, and
       * custom attributes.
       * Each metadata file contains metadata about a single document.
       */
      public fun documentsMetadataConfiguration(documentsMetadataConfiguration: IResolvable)

      /**
       * @param documentsMetadataConfiguration Specifies document metadata files that contain
       * information such as the document access control information, source URI, document author, and
       * custom attributes.
       * Each metadata file contains metadata about a single document.
       */
      public
          fun documentsMetadataConfiguration(documentsMetadataConfiguration: DocumentsMetadataConfigurationProperty)

      /**
       * @param documentsMetadataConfiguration Specifies document metadata files that contain
       * information such as the document access control information, source URI, document author, and
       * custom attributes.
       * Each metadata file contains metadata about a single document.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e62841f85387b18315a1a2a9c0ddbe5b09a6442ce91b81a01d85c19f2e7d41e2")
      public
          fun documentsMetadataConfiguration(documentsMetadataConfiguration: DocumentsMetadataConfigurationProperty.Builder.() -> Unit)

      /**
       * @param exclusionPatterns A list of glob patterns (patterns that can expand a wildcard
       * pattern into a list of path names that match the given pattern) for certain file names and
       * file types to exclude from your index.
       * If a document matches both an inclusion and exclusion prefix or pattern, the exclusion
       * prefix takes precendence and the document is not indexed. Examples of glob patterns include:
       *
       * * `/myapp/config/ *` - All files inside config directory
       * * `/ ** / *.png` - All .png files in all directories
       * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
       * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
       * * `** /!(*.module).ts` - All .ts files but not .module.ts
       * * **.png , *.jpg* excludes all PNG and JPEG image files in a directory (files with the
       * extensions .png and .jpg).
       * * **internal** excludes all files in a directory that contain 'internal' in the file name,
       * such as 'internal', 'internal_only', 'company_internal'.
       * * *** / *internal** excludes all internal-related files in a directory and its
       * subdirectories.
       *
       * For more examples, see [Use of Exclude and Include
       * Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
       * in the AWS CLI Command Reference.
       */
      public fun exclusionPatterns(exclusionPatterns: List<String>)

      /**
       * @param exclusionPatterns A list of glob patterns (patterns that can expand a wildcard
       * pattern into a list of path names that match the given pattern) for certain file names and
       * file types to exclude from your index.
       * If a document matches both an inclusion and exclusion prefix or pattern, the exclusion
       * prefix takes precendence and the document is not indexed. Examples of glob patterns include:
       *
       * * `/myapp/config/ *` - All files inside config directory
       * * `/ ** / *.png` - All .png files in all directories
       * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
       * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
       * * `** /!(*.module).ts` - All .ts files but not .module.ts
       * * **.png , *.jpg* excludes all PNG and JPEG image files in a directory (files with the
       * extensions .png and .jpg).
       * * **internal** excludes all files in a directory that contain 'internal' in the file name,
       * such as 'internal', 'internal_only', 'company_internal'.
       * * *** / *internal** excludes all internal-related files in a directory and its
       * subdirectories.
       *
       * For more examples, see [Use of Exclude and Include
       * Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
       * in the AWS CLI Command Reference.
       */
      public fun exclusionPatterns(vararg exclusionPatterns: String)

      /**
       * @param inclusionPatterns A list of glob patterns (patterns that can expand a wildcard
       * pattern into a list of path names that match the given pattern) for certain file names and
       * file types to include in your index.
       * If a document matches both an inclusion and exclusion prefix or pattern, the exclusion
       * prefix takes precendence and the document is not indexed. Examples of glob patterns include:
       *
       * * `/myapp/config/ *` - All files inside config directory
       * * `/ ** / *.png` - All .png files in all directories
       * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
       * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
       * * `** /!(*.module).ts` - All .ts files but not .module.ts
       * * **.png , *.jpg* includes all PNG and JPEG image files in a directory (files with the
       * extensions .png and .jpg).
       * * **internal** includes all files in a directory that contain 'internal' in the file name,
       * such as 'internal', 'internal_only', 'company_internal'.
       * * *** / *internal** includes all internal-related files in a directory and its
       * subdirectories.
       *
       * For more examples, see [Use of Exclude and Include
       * Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
       * in the AWS CLI Command Reference.
       */
      public fun inclusionPatterns(inclusionPatterns: List<String>)

      /**
       * @param inclusionPatterns A list of glob patterns (patterns that can expand a wildcard
       * pattern into a list of path names that match the given pattern) for certain file names and
       * file types to include in your index.
       * If a document matches both an inclusion and exclusion prefix or pattern, the exclusion
       * prefix takes precendence and the document is not indexed. Examples of glob patterns include:
       *
       * * `/myapp/config/ *` - All files inside config directory
       * * `/ ** / *.png` - All .png files in all directories
       * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
       * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
       * * `** /!(*.module).ts` - All .ts files but not .module.ts
       * * **.png , *.jpg* includes all PNG and JPEG image files in a directory (files with the
       * extensions .png and .jpg).
       * * **internal** includes all files in a directory that contain 'internal' in the file name,
       * such as 'internal', 'internal_only', 'company_internal'.
       * * *** / *internal** includes all internal-related files in a directory and its
       * subdirectories.
       *
       * For more examples, see [Use of Exclude and Include
       * Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
       * in the AWS CLI Command Reference.
       */
      public fun inclusionPatterns(vararg inclusionPatterns: String)

      /**
       * @param inclusionPrefixes A list of S3 prefixes for the documents that should be included in
       * the index.
       */
      public fun inclusionPrefixes(inclusionPrefixes: List<String>)

      /**
       * @param inclusionPrefixes A list of S3 prefixes for the documents that should be included in
       * the index.
       */
      public fun inclusionPrefixes(vararg inclusionPrefixes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty.builder()

      /**
       * @param accessControlListConfiguration Provides the path to the S3 bucket that contains the
       * user context filtering files for the data source.
       * For the format of the file, see [Access control for S3 data
       * sources](https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html) .
       */
      override fun accessControlListConfiguration(accessControlListConfiguration: IResolvable) {
        cdkBuilder.accessControlListConfiguration(accessControlListConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param accessControlListConfiguration Provides the path to the S3 bucket that contains the
       * user context filtering files for the data source.
       * For the format of the file, see [Access control for S3 data
       * sources](https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html) .
       */
      override
          fun accessControlListConfiguration(accessControlListConfiguration: AccessControlListConfigurationProperty) {
        cdkBuilder.accessControlListConfiguration(accessControlListConfiguration.let(AccessControlListConfigurationProperty::unwrap))
      }

      /**
       * @param accessControlListConfiguration Provides the path to the S3 bucket that contains the
       * user context filtering files for the data source.
       * For the format of the file, see [Access control for S3 data
       * sources](https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad7f7d2544abe79db57cd7d122e90ba7101511573636633c85a2332f1c60b76c")
      override
          fun accessControlListConfiguration(accessControlListConfiguration: AccessControlListConfigurationProperty.Builder.() -> Unit):
          Unit =
          accessControlListConfiguration(AccessControlListConfigurationProperty(accessControlListConfiguration))

      /**
       * @param bucketName The name of the bucket that contains the documents. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param documentsMetadataConfiguration Specifies document metadata files that contain
       * information such as the document access control information, source URI, document author, and
       * custom attributes.
       * Each metadata file contains metadata about a single document.
       */
      override fun documentsMetadataConfiguration(documentsMetadataConfiguration: IResolvable) {
        cdkBuilder.documentsMetadataConfiguration(documentsMetadataConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param documentsMetadataConfiguration Specifies document metadata files that contain
       * information such as the document access control information, source URI, document author, and
       * custom attributes.
       * Each metadata file contains metadata about a single document.
       */
      override
          fun documentsMetadataConfiguration(documentsMetadataConfiguration: DocumentsMetadataConfigurationProperty) {
        cdkBuilder.documentsMetadataConfiguration(documentsMetadataConfiguration.let(DocumentsMetadataConfigurationProperty::unwrap))
      }

      /**
       * @param documentsMetadataConfiguration Specifies document metadata files that contain
       * information such as the document access control information, source URI, document author, and
       * custom attributes.
       * Each metadata file contains metadata about a single document.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e62841f85387b18315a1a2a9c0ddbe5b09a6442ce91b81a01d85c19f2e7d41e2")
      override
          fun documentsMetadataConfiguration(documentsMetadataConfiguration: DocumentsMetadataConfigurationProperty.Builder.() -> Unit):
          Unit =
          documentsMetadataConfiguration(DocumentsMetadataConfigurationProperty(documentsMetadataConfiguration))

      /**
       * @param exclusionPatterns A list of glob patterns (patterns that can expand a wildcard
       * pattern into a list of path names that match the given pattern) for certain file names and
       * file types to exclude from your index.
       * If a document matches both an inclusion and exclusion prefix or pattern, the exclusion
       * prefix takes precendence and the document is not indexed. Examples of glob patterns include:
       *
       * * `/myapp/config/ *` - All files inside config directory
       * * `/ ** / *.png` - All .png files in all directories
       * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
       * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
       * * `** /!(*.module).ts` - All .ts files but not .module.ts
       * * **.png , *.jpg* excludes all PNG and JPEG image files in a directory (files with the
       * extensions .png and .jpg).
       * * **internal** excludes all files in a directory that contain 'internal' in the file name,
       * such as 'internal', 'internal_only', 'company_internal'.
       * * *** / *internal** excludes all internal-related files in a directory and its
       * subdirectories.
       *
       * For more examples, see [Use of Exclude and Include
       * Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
       * in the AWS CLI Command Reference.
       */
      override fun exclusionPatterns(exclusionPatterns: List<String>) {
        cdkBuilder.exclusionPatterns(exclusionPatterns)
      }

      /**
       * @param exclusionPatterns A list of glob patterns (patterns that can expand a wildcard
       * pattern into a list of path names that match the given pattern) for certain file names and
       * file types to exclude from your index.
       * If a document matches both an inclusion and exclusion prefix or pattern, the exclusion
       * prefix takes precendence and the document is not indexed. Examples of glob patterns include:
       *
       * * `/myapp/config/ *` - All files inside config directory
       * * `/ ** / *.png` - All .png files in all directories
       * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
       * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
       * * `** /!(*.module).ts` - All .ts files but not .module.ts
       * * **.png , *.jpg* excludes all PNG and JPEG image files in a directory (files with the
       * extensions .png and .jpg).
       * * **internal** excludes all files in a directory that contain 'internal' in the file name,
       * such as 'internal', 'internal_only', 'company_internal'.
       * * *** / *internal** excludes all internal-related files in a directory and its
       * subdirectories.
       *
       * For more examples, see [Use of Exclude and Include
       * Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
       * in the AWS CLI Command Reference.
       */
      override fun exclusionPatterns(vararg exclusionPatterns: String): Unit =
          exclusionPatterns(exclusionPatterns.toList())

      /**
       * @param inclusionPatterns A list of glob patterns (patterns that can expand a wildcard
       * pattern into a list of path names that match the given pattern) for certain file names and
       * file types to include in your index.
       * If a document matches both an inclusion and exclusion prefix or pattern, the exclusion
       * prefix takes precendence and the document is not indexed. Examples of glob patterns include:
       *
       * * `/myapp/config/ *` - All files inside config directory
       * * `/ ** / *.png` - All .png files in all directories
       * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
       * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
       * * `** /!(*.module).ts` - All .ts files but not .module.ts
       * * **.png , *.jpg* includes all PNG and JPEG image files in a directory (files with the
       * extensions .png and .jpg).
       * * **internal** includes all files in a directory that contain 'internal' in the file name,
       * such as 'internal', 'internal_only', 'company_internal'.
       * * *** / *internal** includes all internal-related files in a directory and its
       * subdirectories.
       *
       * For more examples, see [Use of Exclude and Include
       * Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
       * in the AWS CLI Command Reference.
       */
      override fun inclusionPatterns(inclusionPatterns: List<String>) {
        cdkBuilder.inclusionPatterns(inclusionPatterns)
      }

      /**
       * @param inclusionPatterns A list of glob patterns (patterns that can expand a wildcard
       * pattern into a list of path names that match the given pattern) for certain file names and
       * file types to include in your index.
       * If a document matches both an inclusion and exclusion prefix or pattern, the exclusion
       * prefix takes precendence and the document is not indexed. Examples of glob patterns include:
       *
       * * `/myapp/config/ *` - All files inside config directory
       * * `/ ** / *.png` - All .png files in all directories
       * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
       * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
       * * `** /!(*.module).ts` - All .ts files but not .module.ts
       * * **.png , *.jpg* includes all PNG and JPEG image files in a directory (files with the
       * extensions .png and .jpg).
       * * **internal** includes all files in a directory that contain 'internal' in the file name,
       * such as 'internal', 'internal_only', 'company_internal'.
       * * *** / *internal** includes all internal-related files in a directory and its
       * subdirectories.
       *
       * For more examples, see [Use of Exclude and Include
       * Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
       * in the AWS CLI Command Reference.
       */
      override fun inclusionPatterns(vararg inclusionPatterns: String): Unit =
          inclusionPatterns(inclusionPatterns.toList())

      /**
       * @param inclusionPrefixes A list of S3 prefixes for the documents that should be included in
       * the index.
       */
      override fun inclusionPrefixes(inclusionPrefixes: List<String>) {
        cdkBuilder.inclusionPrefixes(inclusionPrefixes)
      }

      /**
       * @param inclusionPrefixes A list of S3 prefixes for the documents that should be included in
       * the index.
       */
      override fun inclusionPrefixes(vararg inclusionPrefixes: String): Unit =
          inclusionPrefixes(inclusionPrefixes.toList())

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty,
    ) : CdkObject(cdkObject), S3DataSourceConfigurationProperty {
      /**
       * Provides the path to the S3 bucket that contains the user context filtering files for the
       * data source.
       *
       * For the format of the file, see [Access control for S3 data
       * sources](https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3datasourceconfiguration.html#cfn-kendra-datasource-s3datasourceconfiguration-accesscontrollistconfiguration)
       */
      override fun accessControlListConfiguration(): Any? =
          unwrap(this).getAccessControlListConfiguration()

      /**
       * The name of the bucket that contains the documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3datasourceconfiguration.html#cfn-kendra-datasource-s3datasourceconfiguration-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * Specifies document metadata files that contain information such as the document access
       * control information, source URI, document author, and custom attributes.
       *
       * Each metadata file contains metadata about a single document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3datasourceconfiguration.html#cfn-kendra-datasource-s3datasourceconfiguration-documentsmetadataconfiguration)
       */
      override fun documentsMetadataConfiguration(): Any? =
          unwrap(this).getDocumentsMetadataConfiguration()

      /**
       * A list of glob patterns (patterns that can expand a wildcard pattern into a list of path
       * names that match the given pattern) for certain file names and file types to exclude from your
       * index.
       *
       * If a document matches both an inclusion and exclusion prefix or pattern, the exclusion
       * prefix takes precendence and the document is not indexed. Examples of glob patterns include:
       *
       * * `/myapp/config/ *` - All files inside config directory
       * * `/ ** / *.png` - All .png files in all directories
       * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
       * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
       * * `** /!(*.module).ts` - All .ts files but not .module.ts
       * * **.png , *.jpg* excludes all PNG and JPEG image files in a directory (files with the
       * extensions .png and .jpg).
       * * **internal** excludes all files in a directory that contain 'internal' in the file name,
       * such as 'internal', 'internal_only', 'company_internal'.
       * * *** / *internal** excludes all internal-related files in a directory and its
       * subdirectories.
       *
       * For more examples, see [Use of Exclude and Include
       * Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
       * in the AWS CLI Command Reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3datasourceconfiguration.html#cfn-kendra-datasource-s3datasourceconfiguration-exclusionpatterns)
       */
      override fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
          emptyList()

      /**
       * A list of glob patterns (patterns that can expand a wildcard pattern into a list of path
       * names that match the given pattern) for certain file names and file types to include in your
       * index.
       *
       * If a document matches both an inclusion and exclusion prefix or pattern, the exclusion
       * prefix takes precendence and the document is not indexed. Examples of glob patterns include:
       *
       * * `/myapp/config/ *` - All files inside config directory
       * * `/ ** / *.png` - All .png files in all directories
       * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
       * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
       * * `** /!(*.module).ts` - All .ts files but not .module.ts
       * * **.png , *.jpg* includes all PNG and JPEG image files in a directory (files with the
       * extensions .png and .jpg).
       * * **internal** includes all files in a directory that contain 'internal' in the file name,
       * such as 'internal', 'internal_only', 'company_internal'.
       * * *** / *internal** includes all internal-related files in a directory and its
       * subdirectories.
       *
       * For more examples, see [Use of Exclude and Include
       * Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
       * in the AWS CLI Command Reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3datasourceconfiguration.html#cfn-kendra-datasource-s3datasourceconfiguration-inclusionpatterns)
       */
      override fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
          emptyList()

      /**
       * A list of S3 prefixes for the documents that should be included in the index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3datasourceconfiguration.html#cfn-kendra-datasource-s3datasourceconfiguration-inclusionprefixes)
       */
      override fun inclusionPrefixes(): List<String> = unwrap(this).getInclusionPrefixes() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3DataSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty):
          S3DataSourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DataSourceConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty
    }
  }

  /**
   * Provides information about how Amazon Kendra should use the columns of a database in an index.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface ColumnConfigurationProperty {
    /**
     * One to five columns that indicate when a document in the database has changed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-columnconfiguration.html#cfn-kendra-datasource-columnconfiguration-changedetectingcolumns)
     */
    public fun changeDetectingColumns(): List<String>

    /**
     * The column that contains the contents of the document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-columnconfiguration.html#cfn-kendra-datasource-columnconfiguration-documentdatacolumnname)
     */
    public fun documentDataColumnName(): String

    /**
     * The column that provides the document's identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-columnconfiguration.html#cfn-kendra-datasource-columnconfiguration-documentidcolumnname)
     */
    public fun documentIdColumnName(): String

    /**
     * The column that contains the title of the document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-columnconfiguration.html#cfn-kendra-datasource-columnconfiguration-documenttitlecolumnname)
     */
    public fun documentTitleColumnName(): String? = unwrap(this).getDocumentTitleColumnName()

    /**
     * An array of objects that map database column names to the corresponding fields in an index.
     *
     * You must first create the fields in the index using the
     * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-columnconfiguration.html#cfn-kendra-datasource-columnconfiguration-fieldmappings)
     */
    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    /**
     * A builder for [ColumnConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param changeDetectingColumns One to five columns that indicate when a document in the
       * database has changed. 
       */
      public fun changeDetectingColumns(changeDetectingColumns: List<String>)

      /**
       * @param changeDetectingColumns One to five columns that indicate when a document in the
       * database has changed. 
       */
      public fun changeDetectingColumns(vararg changeDetectingColumns: String)

      /**
       * @param documentDataColumnName The column that contains the contents of the document. 
       */
      public fun documentDataColumnName(documentDataColumnName: String)

      /**
       * @param documentIdColumnName The column that provides the document's identifier. 
       */
      public fun documentIdColumnName(documentIdColumnName: String)

      /**
       * @param documentTitleColumnName The column that contains the title of the document.
       */
      public fun documentTitleColumnName(documentTitleColumnName: String)

      /**
       * @param fieldMappings An array of objects that map database column names to the
       * corresponding fields in an index.
       * You must first create the fields in the index using the
       * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation.
       */
      public fun fieldMappings(fieldMappings: IResolvable)

      /**
       * @param fieldMappings An array of objects that map database column names to the
       * corresponding fields in an index.
       * You must first create the fields in the index using the
       * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation.
       */
      public fun fieldMappings(fieldMappings: List<Any>)

      /**
       * @param fieldMappings An array of objects that map database column names to the
       * corresponding fields in an index.
       * You must first create the fields in the index using the
       * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation.
       */
      public fun fieldMappings(vararg fieldMappings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty.builder()

      /**
       * @param changeDetectingColumns One to five columns that indicate when a document in the
       * database has changed. 
       */
      override fun changeDetectingColumns(changeDetectingColumns: List<String>) {
        cdkBuilder.changeDetectingColumns(changeDetectingColumns)
      }

      /**
       * @param changeDetectingColumns One to five columns that indicate when a document in the
       * database has changed. 
       */
      override fun changeDetectingColumns(vararg changeDetectingColumns: String): Unit =
          changeDetectingColumns(changeDetectingColumns.toList())

      /**
       * @param documentDataColumnName The column that contains the contents of the document. 
       */
      override fun documentDataColumnName(documentDataColumnName: String) {
        cdkBuilder.documentDataColumnName(documentDataColumnName)
      }

      /**
       * @param documentIdColumnName The column that provides the document's identifier. 
       */
      override fun documentIdColumnName(documentIdColumnName: String) {
        cdkBuilder.documentIdColumnName(documentIdColumnName)
      }

      /**
       * @param documentTitleColumnName The column that contains the title of the document.
       */
      override fun documentTitleColumnName(documentTitleColumnName: String) {
        cdkBuilder.documentTitleColumnName(documentTitleColumnName)
      }

      /**
       * @param fieldMappings An array of objects that map database column names to the
       * corresponding fields in an index.
       * You must first create the fields in the index using the
       * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation.
       */
      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param fieldMappings An array of objects that map database column names to the
       * corresponding fields in an index.
       * You must first create the fields in the index using the
       * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation.
       */
      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      /**
       * @param fieldMappings An array of objects that map database column names to the
       * corresponding fields in an index.
       * You must first create the fields in the index using the
       * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation.
       */
      override fun fieldMappings(vararg fieldMappings: Any): Unit =
          fieldMappings(fieldMappings.toList())

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty,
    ) : CdkObject(cdkObject), ColumnConfigurationProperty {
      /**
       * One to five columns that indicate when a document in the database has changed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-columnconfiguration.html#cfn-kendra-datasource-columnconfiguration-changedetectingcolumns)
       */
      override fun changeDetectingColumns(): List<String> = unwrap(this).getChangeDetectingColumns()

      /**
       * The column that contains the contents of the document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-columnconfiguration.html#cfn-kendra-datasource-columnconfiguration-documentdatacolumnname)
       */
      override fun documentDataColumnName(): String = unwrap(this).getDocumentDataColumnName()

      /**
       * The column that provides the document's identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-columnconfiguration.html#cfn-kendra-datasource-columnconfiguration-documentidcolumnname)
       */
      override fun documentIdColumnName(): String = unwrap(this).getDocumentIdColumnName()

      /**
       * The column that contains the title of the document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-columnconfiguration.html#cfn-kendra-datasource-columnconfiguration-documenttitlecolumnname)
       */
      override fun documentTitleColumnName(): String? = unwrap(this).getDocumentTitleColumnName()

      /**
       * An array of objects that map database column names to the corresponding fields in an index.
       *
       * You must first create the fields in the index using the
       * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-columnconfiguration.html#cfn-kendra-datasource-columnconfiguration-fieldmappings)
       */
      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty):
          ColumnConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty
    }
  }

  /**
   * Provides the configuration information for crawling knowledge articles in the ServiceNow site.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface ServiceNowKnowledgeArticleConfigurationProperty {
    /**
     * `TRUE` to index attachments to knowledge articles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html#cfn-kendra-datasource-servicenowknowledgearticleconfiguration-crawlattachments)
     */
    public fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

    /**
     * The name of the ServiceNow field that is mapped to the index document contents field in the
     * Amazon Kendra index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html#cfn-kendra-datasource-servicenowknowledgearticleconfiguration-documentdatafieldname)
     */
    public fun documentDataFieldName(): String

    /**
     * The name of the ServiceNow field that is mapped to the index document title field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html#cfn-kendra-datasource-servicenowknowledgearticleconfiguration-documenttitlefieldname)
     */
    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    /**
     * A list of regular expression patterns applied to exclude certain knowledge article
     * attachments.
     *
     * Attachments that match the patterns are excluded from the index. Items that don't match the
     * patterns are included in the index. If an item matches both an inclusion and exclusion pattern,
     * the exclusion pattern takes precedence and the item isn't included in the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html#cfn-kendra-datasource-servicenowknowledgearticleconfiguration-excludeattachmentfilepatterns)
     */
    public fun excludeAttachmentFilePatterns(): List<String> =
        unwrap(this).getExcludeAttachmentFilePatterns() ?: emptyList()

    /**
     * Maps attributes or field names of knoweldge articles to Amazon Kendra index field names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
     * more information, see [Mapping data source
     * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
     * source field names must exist in your ServiceNow custom metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html#cfn-kendra-datasource-servicenowknowledgearticleconfiguration-fieldmappings)
     */
    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    /**
     * A query that selects the knowledge articles to index.
     *
     * The query can return articles from multiple knowledge bases, and the knowledge bases can be
     * public or private.
     *
     * The query string must be one generated by the ServiceNow console. For more information, see
     * [Specifying documents to index with a
     * query](https://docs.aws.amazon.com/kendra/latest/dg/servicenow-query.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html#cfn-kendra-datasource-servicenowknowledgearticleconfiguration-filterquery)
     */
    public fun filterQuery(): String? = unwrap(this).getFilterQuery()

    /**
     * A list of regular expression patterns applied to include knowledge article attachments.
     *
     * Attachments that match the patterns are included in the index. Items that don't match the
     * patterns are excluded from the index. If an item matches both an inclusion and exclusion
     * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html#cfn-kendra-datasource-servicenowknowledgearticleconfiguration-includeattachmentfilepatterns)
     */
    public fun includeAttachmentFilePatterns(): List<String> =
        unwrap(this).getIncludeAttachmentFilePatterns() ?: emptyList()

    /**
     * A builder for [ServiceNowKnowledgeArticleConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crawlAttachments `TRUE` to index attachments to knowledge articles.
       */
      public fun crawlAttachments(crawlAttachments: Boolean)

      /**
       * @param crawlAttachments `TRUE` to index attachments to knowledge articles.
       */
      public fun crawlAttachments(crawlAttachments: IResolvable)

      /**
       * @param documentDataFieldName The name of the ServiceNow field that is mapped to the index
       * document contents field in the Amazon Kendra index. 
       */
      public fun documentDataFieldName(documentDataFieldName: String)

      /**
       * @param documentTitleFieldName The name of the ServiceNow field that is mapped to the index
       * document title field.
       */
      public fun documentTitleFieldName(documentTitleFieldName: String)

      /**
       * @param excludeAttachmentFilePatterns A list of regular expression patterns applied to
       * exclude certain knowledge article attachments.
       * Attachments that match the patterns are excluded from the index. Items that don't match the
       * patterns are included in the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      public fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: List<String>)

      /**
       * @param excludeAttachmentFilePatterns A list of regular expression patterns applied to
       * exclude certain knowledge article attachments.
       * Attachments that match the patterns are excluded from the index. Items that don't match the
       * patterns are included in the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      public fun excludeAttachmentFilePatterns(vararg excludeAttachmentFilePatterns: String)

      /**
       * @param fieldMappings Maps attributes or field names of knoweldge articles to Amazon Kendra
       * index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
       * source field names must exist in your ServiceNow custom metadata.
       */
      public fun fieldMappings(fieldMappings: IResolvable)

      /**
       * @param fieldMappings Maps attributes or field names of knoweldge articles to Amazon Kendra
       * index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
       * source field names must exist in your ServiceNow custom metadata.
       */
      public fun fieldMappings(fieldMappings: List<Any>)

      /**
       * @param fieldMappings Maps attributes or field names of knoweldge articles to Amazon Kendra
       * index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
       * source field names must exist in your ServiceNow custom metadata.
       */
      public fun fieldMappings(vararg fieldMappings: Any)

      /**
       * @param filterQuery A query that selects the knowledge articles to index.
       * The query can return articles from multiple knowledge bases, and the knowledge bases can be
       * public or private.
       *
       * The query string must be one generated by the ServiceNow console. For more information, see
       * [Specifying documents to index with a
       * query](https://docs.aws.amazon.com/kendra/latest/dg/servicenow-query.html) .
       */
      public fun filterQuery(filterQuery: String)

      /**
       * @param includeAttachmentFilePatterns A list of regular expression patterns applied to
       * include knowledge article attachments.
       * Attachments that match the patterns are included in the index. Items that don't match the
       * patterns are excluded from the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      public fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: List<String>)

      /**
       * @param includeAttachmentFilePatterns A list of regular expression patterns applied to
       * include knowledge article attachments.
       * Attachments that match the patterns are included in the index. Items that don't match the
       * patterns are excluded from the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      public fun includeAttachmentFilePatterns(vararg includeAttachmentFilePatterns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty.builder()

      /**
       * @param crawlAttachments `TRUE` to index attachments to knowledge articles.
       */
      override fun crawlAttachments(crawlAttachments: Boolean) {
        cdkBuilder.crawlAttachments(crawlAttachments)
      }

      /**
       * @param crawlAttachments `TRUE` to index attachments to knowledge articles.
       */
      override fun crawlAttachments(crawlAttachments: IResolvable) {
        cdkBuilder.crawlAttachments(crawlAttachments.let(IResolvable::unwrap))
      }

      /**
       * @param documentDataFieldName The name of the ServiceNow field that is mapped to the index
       * document contents field in the Amazon Kendra index. 
       */
      override fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
      }

      /**
       * @param documentTitleFieldName The name of the ServiceNow field that is mapped to the index
       * document title field.
       */
      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      /**
       * @param excludeAttachmentFilePatterns A list of regular expression patterns applied to
       * exclude certain knowledge article attachments.
       * Attachments that match the patterns are excluded from the index. Items that don't match the
       * patterns are included in the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      override fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: List<String>) {
        cdkBuilder.excludeAttachmentFilePatterns(excludeAttachmentFilePatterns)
      }

      /**
       * @param excludeAttachmentFilePatterns A list of regular expression patterns applied to
       * exclude certain knowledge article attachments.
       * Attachments that match the patterns are excluded from the index. Items that don't match the
       * patterns are included in the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      override fun excludeAttachmentFilePatterns(vararg excludeAttachmentFilePatterns: String): Unit
          = excludeAttachmentFilePatterns(excludeAttachmentFilePatterns.toList())

      /**
       * @param fieldMappings Maps attributes or field names of knoweldge articles to Amazon Kendra
       * index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
       * source field names must exist in your ServiceNow custom metadata.
       */
      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param fieldMappings Maps attributes or field names of knoweldge articles to Amazon Kendra
       * index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
       * source field names must exist in your ServiceNow custom metadata.
       */
      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      /**
       * @param fieldMappings Maps attributes or field names of knoweldge articles to Amazon Kendra
       * index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
       * source field names must exist in your ServiceNow custom metadata.
       */
      override fun fieldMappings(vararg fieldMappings: Any): Unit =
          fieldMappings(fieldMappings.toList())

      /**
       * @param filterQuery A query that selects the knowledge articles to index.
       * The query can return articles from multiple knowledge bases, and the knowledge bases can be
       * public or private.
       *
       * The query string must be one generated by the ServiceNow console. For more information, see
       * [Specifying documents to index with a
       * query](https://docs.aws.amazon.com/kendra/latest/dg/servicenow-query.html) .
       */
      override fun filterQuery(filterQuery: String) {
        cdkBuilder.filterQuery(filterQuery)
      }

      /**
       * @param includeAttachmentFilePatterns A list of regular expression patterns applied to
       * include knowledge article attachments.
       * Attachments that match the patterns are included in the index. Items that don't match the
       * patterns are excluded from the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      override fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: List<String>) {
        cdkBuilder.includeAttachmentFilePatterns(includeAttachmentFilePatterns)
      }

      /**
       * @param includeAttachmentFilePatterns A list of regular expression patterns applied to
       * include knowledge article attachments.
       * Attachments that match the patterns are included in the index. Items that don't match the
       * patterns are excluded from the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      override fun includeAttachmentFilePatterns(vararg includeAttachmentFilePatterns: String): Unit
          = includeAttachmentFilePatterns(includeAttachmentFilePatterns.toList())

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty,
    ) : CdkObject(cdkObject), ServiceNowKnowledgeArticleConfigurationProperty {
      /**
       * `TRUE` to index attachments to knowledge articles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html#cfn-kendra-datasource-servicenowknowledgearticleconfiguration-crawlattachments)
       */
      override fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

      /**
       * The name of the ServiceNow field that is mapped to the index document contents field in the
       * Amazon Kendra index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html#cfn-kendra-datasource-servicenowknowledgearticleconfiguration-documentdatafieldname)
       */
      override fun documentDataFieldName(): String = unwrap(this).getDocumentDataFieldName()

      /**
       * The name of the ServiceNow field that is mapped to the index document title field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html#cfn-kendra-datasource-servicenowknowledgearticleconfiguration-documenttitlefieldname)
       */
      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      /**
       * A list of regular expression patterns applied to exclude certain knowledge article
       * attachments.
       *
       * Attachments that match the patterns are excluded from the index. Items that don't match the
       * patterns are included in the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html#cfn-kendra-datasource-servicenowknowledgearticleconfiguration-excludeattachmentfilepatterns)
       */
      override fun excludeAttachmentFilePatterns(): List<String> =
          unwrap(this).getExcludeAttachmentFilePatterns() ?: emptyList()

      /**
       * Maps attributes or field names of knoweldge articles to Amazon Kendra index field names.
       *
       * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
       * more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
       * source field names must exist in your ServiceNow custom metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html#cfn-kendra-datasource-servicenowknowledgearticleconfiguration-fieldmappings)
       */
      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      /**
       * A query that selects the knowledge articles to index.
       *
       * The query can return articles from multiple knowledge bases, and the knowledge bases can be
       * public or private.
       *
       * The query string must be one generated by the ServiceNow console. For more information, see
       * [Specifying documents to index with a
       * query](https://docs.aws.amazon.com/kendra/latest/dg/servicenow-query.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html#cfn-kendra-datasource-servicenowknowledgearticleconfiguration-filterquery)
       */
      override fun filterQuery(): String? = unwrap(this).getFilterQuery()

      /**
       * A list of regular expression patterns applied to include knowledge article attachments.
       *
       * Attachments that match the patterns are included in the index. Items that don't match the
       * patterns are excluded from the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html#cfn-kendra-datasource-servicenowknowledgearticleconfiguration-includeattachmentfilepatterns)
       */
      override fun includeAttachmentFilePatterns(): List<String> =
          unwrap(this).getIncludeAttachmentFilePatterns() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceNowKnowledgeArticleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty):
          ServiceNowKnowledgeArticleConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceNowKnowledgeArticleConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty
    }
  }

  /**
   * Provides the configuration information to connect to Google Drive as your data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kendra.*;
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
  public interface GoogleDriveConfigurationProperty {
    /**
     * A list of MIME types to exclude from the index. All documents matching the specified MIME
     * type are excluded.
     *
     * For a list of MIME types, see [Using a Google Workspace Drive data
     * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html#cfn-kendra-datasource-googledriveconfiguration-excludemimetypes)
     */
    public fun excludeMimeTypes(): List<String> = unwrap(this).getExcludeMimeTypes() ?: emptyList()

    /**
     * A list of identifiers or shared drives to exclude from the index.
     *
     * All files and folders stored on the shared drive are excluded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html#cfn-kendra-datasource-googledriveconfiguration-excludeshareddrives)
     */
    public fun excludeSharedDrives(): List<String> = unwrap(this).getExcludeSharedDrives() ?:
        emptyList()

    /**
     * A list of email addresses of the users.
     *
     * Documents owned by these users are excluded from the index. Documents shared with excluded
     * users are indexed unless they are excluded in another way.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html#cfn-kendra-datasource-googledriveconfiguration-excludeuseraccounts)
     */
    public fun excludeUserAccounts(): List<String> = unwrap(this).getExcludeUserAccounts() ?:
        emptyList()

    /**
     * A list of regular expression patterns to exclude certain items in your Google Drive,
     * including shared drives and users' My Drives.
     *
     * Items that match the patterns are excluded from the index. Items that don't match the
     * patterns are included in the index. If an item matches both an inclusion and exclusion pattern,
     * the exclusion pattern takes precedence and the item isn't included in the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html#cfn-kendra-datasource-googledriveconfiguration-exclusionpatterns)
     */
    public fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
        emptyList()

    /**
     * Maps Google Drive data source attributes or field names to Amazon Kendra index field names.
     *
     * To create custom fields, use the `UpdateIndex` API before you map to Google Drive fields. For
     * more information, see [Mapping data source
     * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Google Drive data
     * source field names must exist in your Google Drive custom metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html#cfn-kendra-datasource-googledriveconfiguration-fieldmappings)
     */
    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    /**
     * A list of regular expression patterns to include certain items in your Google Drive,
     * including shared drives and users' My Drives.
     *
     * Items that match the patterns are included in the index. Items that don't match the patterns
     * are excluded from the index. If an item matches both an inclusion and exclusion pattern, the
     * exclusion pattern takes precedence and the item isn't included in the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html#cfn-kendra-datasource-googledriveconfiguration-inclusionpatterns)
     */
    public fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
        emptyList()

    /**
     * The Amazon Resource Name (ARN) of a AWS Secrets Manager secret that contains the credentials
     * required to connect to Google Drive.
     *
     * For more information, see [Using a Google Workspace Drive data
     * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html#cfn-kendra-datasource-googledriveconfiguration-secretarn)
     */
    public fun secretArn(): String

    /**
     * A builder for [GoogleDriveConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param excludeMimeTypes A list of MIME types to exclude from the index. All documents
       * matching the specified MIME type are excluded.
       * For a list of MIME types, see [Using a Google Workspace Drive data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html) .
       */
      public fun excludeMimeTypes(excludeMimeTypes: List<String>)

      /**
       * @param excludeMimeTypes A list of MIME types to exclude from the index. All documents
       * matching the specified MIME type are excluded.
       * For a list of MIME types, see [Using a Google Workspace Drive data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html) .
       */
      public fun excludeMimeTypes(vararg excludeMimeTypes: String)

      /**
       * @param excludeSharedDrives A list of identifiers or shared drives to exclude from the
       * index.
       * All files and folders stored on the shared drive are excluded.
       */
      public fun excludeSharedDrives(excludeSharedDrives: List<String>)

      /**
       * @param excludeSharedDrives A list of identifiers or shared drives to exclude from the
       * index.
       * All files and folders stored on the shared drive are excluded.
       */
      public fun excludeSharedDrives(vararg excludeSharedDrives: String)

      /**
       * @param excludeUserAccounts A list of email addresses of the users.
       * Documents owned by these users are excluded from the index. Documents shared with excluded
       * users are indexed unless they are excluded in another way.
       */
      public fun excludeUserAccounts(excludeUserAccounts: List<String>)

      /**
       * @param excludeUserAccounts A list of email addresses of the users.
       * Documents owned by these users are excluded from the index. Documents shared with excluded
       * users are indexed unless they are excluded in another way.
       */
      public fun excludeUserAccounts(vararg excludeUserAccounts: String)

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain items in
       * your Google Drive, including shared drives and users' My Drives.
       * Items that match the patterns are excluded from the index. Items that don't match the
       * patterns are included in the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      public fun exclusionPatterns(exclusionPatterns: List<String>)

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain items in
       * your Google Drive, including shared drives and users' My Drives.
       * Items that match the patterns are excluded from the index. Items that don't match the
       * patterns are included in the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      public fun exclusionPatterns(vararg exclusionPatterns: String)

      /**
       * @param fieldMappings Maps Google Drive data source attributes or field names to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Google Drive fields.
       * For more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Google Drive
       * data source field names must exist in your Google Drive custom metadata.
       */
      public fun fieldMappings(fieldMappings: IResolvable)

      /**
       * @param fieldMappings Maps Google Drive data source attributes or field names to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Google Drive fields.
       * For more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Google Drive
       * data source field names must exist in your Google Drive custom metadata.
       */
      public fun fieldMappings(fieldMappings: List<Any>)

      /**
       * @param fieldMappings Maps Google Drive data source attributes or field names to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Google Drive fields.
       * For more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Google Drive
       * data source field names must exist in your Google Drive custom metadata.
       */
      public fun fieldMappings(vararg fieldMappings: Any)

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain items in
       * your Google Drive, including shared drives and users' My Drives.
       * Items that match the patterns are included in the index. Items that don't match the
       * patterns are excluded from the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      public fun inclusionPatterns(inclusionPatterns: List<String>)

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain items in
       * your Google Drive, including shared drives and users' My Drives.
       * Items that match the patterns are included in the index. Items that don't match the
       * patterns are excluded from the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      public fun inclusionPatterns(vararg inclusionPatterns: String)

      /**
       * @param secretArn The Amazon Resource Name (ARN) of a AWS Secrets Manager secret that
       * contains the credentials required to connect to Google Drive. 
       * For more information, see [Using a Google Workspace Drive data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html) .
       */
      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty.builder()

      /**
       * @param excludeMimeTypes A list of MIME types to exclude from the index. All documents
       * matching the specified MIME type are excluded.
       * For a list of MIME types, see [Using a Google Workspace Drive data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html) .
       */
      override fun excludeMimeTypes(excludeMimeTypes: List<String>) {
        cdkBuilder.excludeMimeTypes(excludeMimeTypes)
      }

      /**
       * @param excludeMimeTypes A list of MIME types to exclude from the index. All documents
       * matching the specified MIME type are excluded.
       * For a list of MIME types, see [Using a Google Workspace Drive data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html) .
       */
      override fun excludeMimeTypes(vararg excludeMimeTypes: String): Unit =
          excludeMimeTypes(excludeMimeTypes.toList())

      /**
       * @param excludeSharedDrives A list of identifiers or shared drives to exclude from the
       * index.
       * All files and folders stored on the shared drive are excluded.
       */
      override fun excludeSharedDrives(excludeSharedDrives: List<String>) {
        cdkBuilder.excludeSharedDrives(excludeSharedDrives)
      }

      /**
       * @param excludeSharedDrives A list of identifiers or shared drives to exclude from the
       * index.
       * All files and folders stored on the shared drive are excluded.
       */
      override fun excludeSharedDrives(vararg excludeSharedDrives: String): Unit =
          excludeSharedDrives(excludeSharedDrives.toList())

      /**
       * @param excludeUserAccounts A list of email addresses of the users.
       * Documents owned by these users are excluded from the index. Documents shared with excluded
       * users are indexed unless they are excluded in another way.
       */
      override fun excludeUserAccounts(excludeUserAccounts: List<String>) {
        cdkBuilder.excludeUserAccounts(excludeUserAccounts)
      }

      /**
       * @param excludeUserAccounts A list of email addresses of the users.
       * Documents owned by these users are excluded from the index. Documents shared with excluded
       * users are indexed unless they are excluded in another way.
       */
      override fun excludeUserAccounts(vararg excludeUserAccounts: String): Unit =
          excludeUserAccounts(excludeUserAccounts.toList())

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain items in
       * your Google Drive, including shared drives and users' My Drives.
       * Items that match the patterns are excluded from the index. Items that don't match the
       * patterns are included in the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      override fun exclusionPatterns(exclusionPatterns: List<String>) {
        cdkBuilder.exclusionPatterns(exclusionPatterns)
      }

      /**
       * @param exclusionPatterns A list of regular expression patterns to exclude certain items in
       * your Google Drive, including shared drives and users' My Drives.
       * Items that match the patterns are excluded from the index. Items that don't match the
       * patterns are included in the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      override fun exclusionPatterns(vararg exclusionPatterns: String): Unit =
          exclusionPatterns(exclusionPatterns.toList())

      /**
       * @param fieldMappings Maps Google Drive data source attributes or field names to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Google Drive fields.
       * For more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Google Drive
       * data source field names must exist in your Google Drive custom metadata.
       */
      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      /**
       * @param fieldMappings Maps Google Drive data source attributes or field names to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Google Drive fields.
       * For more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Google Drive
       * data source field names must exist in your Google Drive custom metadata.
       */
      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      /**
       * @param fieldMappings Maps Google Drive data source attributes or field names to Amazon
       * Kendra index field names.
       * To create custom fields, use the `UpdateIndex` API before you map to Google Drive fields.
       * For more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Google Drive
       * data source field names must exist in your Google Drive custom metadata.
       */
      override fun fieldMappings(vararg fieldMappings: Any): Unit =
          fieldMappings(fieldMappings.toList())

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain items in
       * your Google Drive, including shared drives and users' My Drives.
       * Items that match the patterns are included in the index. Items that don't match the
       * patterns are excluded from the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      override fun inclusionPatterns(inclusionPatterns: List<String>) {
        cdkBuilder.inclusionPatterns(inclusionPatterns)
      }

      /**
       * @param inclusionPatterns A list of regular expression patterns to include certain items in
       * your Google Drive, including shared drives and users' My Drives.
       * Items that match the patterns are included in the index. Items that don't match the
       * patterns are excluded from the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       */
      override fun inclusionPatterns(vararg inclusionPatterns: String): Unit =
          inclusionPatterns(inclusionPatterns.toList())

      /**
       * @param secretArn The Amazon Resource Name (ARN) of a AWS Secrets Manager secret that
       * contains the credentials required to connect to Google Drive. 
       * For more information, see [Using a Google Workspace Drive data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html) .
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty,
    ) : CdkObject(cdkObject), GoogleDriveConfigurationProperty {
      /**
       * A list of MIME types to exclude from the index. All documents matching the specified MIME
       * type are excluded.
       *
       * For a list of MIME types, see [Using a Google Workspace Drive data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html#cfn-kendra-datasource-googledriveconfiguration-excludemimetypes)
       */
      override fun excludeMimeTypes(): List<String> = unwrap(this).getExcludeMimeTypes() ?:
          emptyList()

      /**
       * A list of identifiers or shared drives to exclude from the index.
       *
       * All files and folders stored on the shared drive are excluded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html#cfn-kendra-datasource-googledriveconfiguration-excludeshareddrives)
       */
      override fun excludeSharedDrives(): List<String> = unwrap(this).getExcludeSharedDrives() ?:
          emptyList()

      /**
       * A list of email addresses of the users.
       *
       * Documents owned by these users are excluded from the index. Documents shared with excluded
       * users are indexed unless they are excluded in another way.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html#cfn-kendra-datasource-googledriveconfiguration-excludeuseraccounts)
       */
      override fun excludeUserAccounts(): List<String> = unwrap(this).getExcludeUserAccounts() ?:
          emptyList()

      /**
       * A list of regular expression patterns to exclude certain items in your Google Drive,
       * including shared drives and users' My Drives.
       *
       * Items that match the patterns are excluded from the index. Items that don't match the
       * patterns are included in the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html#cfn-kendra-datasource-googledriveconfiguration-exclusionpatterns)
       */
      override fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
          emptyList()

      /**
       * Maps Google Drive data source attributes or field names to Amazon Kendra index field names.
       *
       * To create custom fields, use the `UpdateIndex` API before you map to Google Drive fields.
       * For more information, see [Mapping data source
       * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Google Drive
       * data source field names must exist in your Google Drive custom metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html#cfn-kendra-datasource-googledriveconfiguration-fieldmappings)
       */
      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      /**
       * A list of regular expression patterns to include certain items in your Google Drive,
       * including shared drives and users' My Drives.
       *
       * Items that match the patterns are included in the index. Items that don't match the
       * patterns are excluded from the index. If an item matches both an inclusion and exclusion
       * pattern, the exclusion pattern takes precedence and the item isn't included in the index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html#cfn-kendra-datasource-googledriveconfiguration-inclusionpatterns)
       */
      override fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
          emptyList()

      /**
       * The Amazon Resource Name (ARN) of a AWS Secrets Manager secret that contains the
       * credentials required to connect to Google Drive.
       *
       * For more information, see [Using a Google Workspace Drive data
       * source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-google-drive.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-googledriveconfiguration.html#cfn-kendra-datasource-googledriveconfiguration-secretarn)
       */
      override fun secretArn(): String = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GoogleDriveConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty):
          GoogleDriveConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GoogleDriveConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty
    }
  }
}
