@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Properties with `__Update requires: Replacement__` can result in the creation of a new data
 * source and deletion of the old one.
 *
 * This can happen if you also change the Name of the data source.
 *
 * Specifies a data source as a resource in a top-level template. Minimally, you must specify the
 * following properties:
 *
 * * Name – Specify a name for the data source.
 * * KnowledgeBaseId – Specify the ID of the knowledge base for the data source to belong to.
 * * DataSourceConfiguration – Specify information about the Amazon S3 bucket containing the data
 * source. The following sub-properties are required:
 * * Type – Specify the value `S3` .
 *
 * For more information about setting up data sources in Amazon Bedrock , see [Set up a data source
 * for your knowledge
 * base](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-ds.html) .
 *
 * See the *Properties* section below for descriptions of both the required and optional properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnDataSource cfnDataSource = CfnDataSource.Builder.create(this, "MyCfnDataSource")
 * .dataSourceConfiguration(DataSourceConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .confluenceConfiguration(ConfluenceDataSourceConfigurationProperty.builder()
 * .sourceConfiguration(ConfluenceSourceConfigurationProperty.builder()
 * .authType("authType")
 * .credentialsSecretArn("credentialsSecretArn")
 * .hostType("hostType")
 * .hostUrl("hostUrl")
 * .build())
 * // the properties below are optional
 * .crawlerConfiguration(ConfluenceCrawlerConfigurationProperty.builder()
 * .filterConfiguration(CrawlFilterConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .patternObjectFilter(PatternObjectFilterConfigurationProperty.builder()
 * .filters(List.of(PatternObjectFilterProperty.builder()
 * .objectType("objectType")
 * // the properties below are optional
 * .exclusionFilters(List.of("exclusionFilters"))
 * .inclusionFilters(List.of("inclusionFilters"))
 * .build()))
 * .build())
 * .build())
 * .build())
 * .build())
 * .s3Configuration(S3DataSourceConfigurationProperty.builder()
 * .bucketArn("bucketArn")
 * // the properties below are optional
 * .bucketOwnerAccountId("bucketOwnerAccountId")
 * .inclusionPrefixes(List.of("inclusionPrefixes"))
 * .build())
 * .salesforceConfiguration(SalesforceDataSourceConfigurationProperty.builder()
 * .sourceConfiguration(SalesforceSourceConfigurationProperty.builder()
 * .authType("authType")
 * .credentialsSecretArn("credentialsSecretArn")
 * .hostUrl("hostUrl")
 * .build())
 * // the properties below are optional
 * .crawlerConfiguration(SalesforceCrawlerConfigurationProperty.builder()
 * .filterConfiguration(CrawlFilterConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .patternObjectFilter(PatternObjectFilterConfigurationProperty.builder()
 * .filters(List.of(PatternObjectFilterProperty.builder()
 * .objectType("objectType")
 * // the properties below are optional
 * .exclusionFilters(List.of("exclusionFilters"))
 * .inclusionFilters(List.of("inclusionFilters"))
 * .build()))
 * .build())
 * .build())
 * .build())
 * .build())
 * .sharePointConfiguration(SharePointDataSourceConfigurationProperty.builder()
 * .sourceConfiguration(SharePointSourceConfigurationProperty.builder()
 * .authType("authType")
 * .credentialsSecretArn("credentialsSecretArn")
 * .domain("domain")
 * .hostType("hostType")
 * .siteUrls(List.of("siteUrls"))
 * // the properties below are optional
 * .tenantId("tenantId")
 * .build())
 * // the properties below are optional
 * .crawlerConfiguration(SharePointCrawlerConfigurationProperty.builder()
 * .filterConfiguration(CrawlFilterConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .patternObjectFilter(PatternObjectFilterConfigurationProperty.builder()
 * .filters(List.of(PatternObjectFilterProperty.builder()
 * .objectType("objectType")
 * // the properties below are optional
 * .exclusionFilters(List.of("exclusionFilters"))
 * .inclusionFilters(List.of("inclusionFilters"))
 * .build()))
 * .build())
 * .build())
 * .build())
 * .build())
 * .webConfiguration(WebDataSourceConfigurationProperty.builder()
 * .sourceConfiguration(WebSourceConfigurationProperty.builder()
 * .urlConfiguration(UrlConfigurationProperty.builder()
 * .seedUrls(List.of(SeedUrlProperty.builder()
 * .url("url")
 * .build()))
 * .build())
 * .build())
 * // the properties below are optional
 * .crawlerConfiguration(WebCrawlerConfigurationProperty.builder()
 * .crawlerLimits(WebCrawlerLimitsProperty.builder()
 * .maxPages(123)
 * .rateLimit(123)
 * .build())
 * .exclusionFilters(List.of("exclusionFilters"))
 * .inclusionFilters(List.of("inclusionFilters"))
 * .scope("scope")
 * .userAgent("userAgent")
 * .userAgentHeader("userAgentHeader")
 * .build())
 * .build())
 * .build())
 * .knowledgeBaseId("knowledgeBaseId")
 * .name("name")
 * // the properties below are optional
 * .dataDeletionPolicy("dataDeletionPolicy")
 * .description("description")
 * .serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty.builder()
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .vectorIngestionConfiguration(VectorIngestionConfigurationProperty.builder()
 * .chunkingConfiguration(ChunkingConfigurationProperty.builder()
 * .chunkingStrategy("chunkingStrategy")
 * // the properties below are optional
 * .fixedSizeChunkingConfiguration(FixedSizeChunkingConfigurationProperty.builder()
 * .maxTokens(123)
 * .overlapPercentage(123)
 * .build())
 * .hierarchicalChunkingConfiguration(HierarchicalChunkingConfigurationProperty.builder()
 * .levelConfigurations(List.of(HierarchicalChunkingLevelConfigurationProperty.builder()
 * .maxTokens(123)
 * .build()))
 * .overlapTokens(123)
 * .build())
 * .semanticChunkingConfiguration(SemanticChunkingConfigurationProperty.builder()
 * .breakpointPercentileThreshold(123)
 * .bufferSize(123)
 * .maxTokens(123)
 * .build())
 * .build())
 * .contextEnrichmentConfiguration(ContextEnrichmentConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .bedrockFoundationModelConfiguration(BedrockFoundationModelContextEnrichmentConfigurationProperty.builder()
 * .enrichmentStrategyConfiguration(EnrichmentStrategyConfigurationProperty.builder()
 * .method("method")
 * .build())
 * .modelArn("modelArn")
 * .build())
 * .build())
 * .customTransformationConfiguration(CustomTransformationConfigurationProperty.builder()
 * .intermediateStorage(IntermediateStorageProperty.builder()
 * .s3Location(S3LocationProperty.builder()
 * .uri("uri")
 * .build())
 * .build())
 * .transformations(List.of(TransformationProperty.builder()
 * .stepToApply("stepToApply")
 * .transformationFunction(TransformationFunctionProperty.builder()
 * .transformationLambdaConfiguration(TransformationLambdaConfigurationProperty.builder()
 * .lambdaArn("lambdaArn")
 * .build())
 * .build())
 * .build()))
 * .build())
 * .parsingConfiguration(ParsingConfigurationProperty.builder()
 * .parsingStrategy("parsingStrategy")
 * // the properties below are optional
 * .bedrockDataAutomationConfiguration(BedrockDataAutomationConfigurationProperty.builder()
 * .parsingModality("parsingModality")
 * .build())
 * .bedrockFoundationModelConfiguration(BedrockFoundationModelConfigurationProperty.builder()
 * .modelArn("modelArn")
 * // the properties below are optional
 * .parsingModality("parsingModality")
 * .parsingPrompt(ParsingPromptProperty.builder()
 * .parsingPromptText("parsingPromptText")
 * .build())
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html)
 */
public open class CfnDataSource(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataSourceProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnDataSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDataSourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataSourceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDataSourceProps(props)
  )

  /**
   * The time at which the data source was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * A string used for identifying the crawler or bot when it accesses a web server.
   *
   * The user agent header value consists of the `bedrockbot` , UUID, and a user agent suffix for
   * your crawler (if one is provided). By default, it is set to `bedrockbot_UUID` . You can optionally
   * append a custom suffix to `bedrockbot_UUID` to allowlist a specific user agent permitted to access
   * your source URLs.
   */
  public open fun attrDataSourceConfigurationWebConfigurationCrawlerConfigurationUserAgentHeader():
      String =
      unwrap(this).getAttrDataSourceConfigurationWebConfigurationCrawlerConfigurationUserAgentHeader()

  /**
   * The unique identifier of the data source.
   */
  public open fun attrDataSourceId(): String = unwrap(this).getAttrDataSourceId()

  /**
   * The status of the data source. The following statuses are possible:.
   *
   * * Available – The data source has been created and is ready for ingestion into the knowledge
   * base.
   * * Deleting – The data source is being deleted.
   */
  public open fun attrDataSourceStatus(): String = unwrap(this).getAttrDataSourceStatus()

  /**
   * The detailed reasons on the failure to delete a data source.
   */
  public open fun attrFailureReasons(): List<String> = unwrap(this).getAttrFailureReasons()

  /**
   * The time at which the data source was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The data deletion policy for the data source.
   */
  public open fun dataDeletionPolicy(): String? = unwrap(this).getDataDeletionPolicy()

  /**
   * The data deletion policy for the data source.
   */
  public open fun dataDeletionPolicy(`value`: String) {
    unwrap(this).setDataDeletionPolicy(`value`)
  }

  /**
   * The connection configuration for the data source.
   */
  public open fun dataSourceConfiguration(): Any = unwrap(this).getDataSourceConfiguration()

  /**
   * The connection configuration for the data source.
   */
  public open fun dataSourceConfiguration(`value`: IResolvable) {
    unwrap(this).setDataSourceConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The connection configuration for the data source.
   */
  public open fun dataSourceConfiguration(`value`: DataSourceConfigurationProperty) {
    unwrap(this).setDataSourceConfiguration(`value`.let(DataSourceConfigurationProperty.Companion::unwrap))
  }

  /**
   * The connection configuration for the data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("450511e416fa4de3cf65f957ddfb66669cb9320e233b58185f6c507112c24632")
  public open
      fun dataSourceConfiguration(`value`: DataSourceConfigurationProperty.Builder.() -> Unit): Unit
      = dataSourceConfiguration(DataSourceConfigurationProperty(`value`))

  /**
   * The description of the data source.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the data source.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The unique identifier of the knowledge base to which the data source belongs.
   */
  public open fun knowledgeBaseId(): String = unwrap(this).getKnowledgeBaseId()

  /**
   * The unique identifier of the knowledge base to which the data source belongs.
   */
  public open fun knowledgeBaseId(`value`: String) {
    unwrap(this).setKnowledgeBaseId(`value`)
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
   * Contains details about the configuration of the server-side encryption.
   */
  public open fun serverSideEncryptionConfiguration(): Any? =
      unwrap(this).getServerSideEncryptionConfiguration()

  /**
   * Contains details about the configuration of the server-side encryption.
   */
  public open fun serverSideEncryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details about the configuration of the server-side encryption.
   */
  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(ServerSideEncryptionConfigurationProperty.Companion::unwrap))
  }

  /**
   * Contains details about the configuration of the server-side encryption.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5c831df08edc33329772f664a6ec5e03b72150019c93718da062c6ec680f3f9")
  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
      Unit = serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(`value`))

  /**
   * Contains details about how to ingest the documents in the data source.
   */
  public open fun vectorIngestionConfiguration(): Any? =
      unwrap(this).getVectorIngestionConfiguration()

  /**
   * Contains details about how to ingest the documents in the data source.
   */
  public open fun vectorIngestionConfiguration(`value`: IResolvable) {
    unwrap(this).setVectorIngestionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details about how to ingest the documents in the data source.
   */
  public open fun vectorIngestionConfiguration(`value`: VectorIngestionConfigurationProperty) {
    unwrap(this).setVectorIngestionConfiguration(`value`.let(VectorIngestionConfigurationProperty.Companion::unwrap))
  }

  /**
   * Contains details about how to ingest the documents in the data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b4283f3cf6536a64a2a71740f5c1314b977cba351458cf40aacc6b31a531ed1d")
  public open
      fun vectorIngestionConfiguration(`value`: VectorIngestionConfigurationProperty.Builder.() -> Unit):
      Unit = vectorIngestionConfiguration(VectorIngestionConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnDataSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The data deletion policy for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datadeletionpolicy)
     * @param dataDeletionPolicy The data deletion policy for the data source. 
     */
    public fun dataDeletionPolicy(dataDeletionPolicy: String)

    /**
     * The connection configuration for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datasourceconfiguration)
     * @param dataSourceConfiguration The connection configuration for the data source. 
     */
    public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable)

    /**
     * The connection configuration for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datasourceconfiguration)
     * @param dataSourceConfiguration The connection configuration for the data source. 
     */
    public fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty)

    /**
     * The connection configuration for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datasourceconfiguration)
     * @param dataSourceConfiguration The connection configuration for the data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91e233c010d47768c60bfdc0dba1f7f3220eeb3e31f346e31ef4d80aa4d9984b")
    public
        fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty.Builder.() -> Unit)

    /**
     * The description of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-description)
     * @param description The description of the data source. 
     */
    public fun description(description: String)

    /**
     * The unique identifier of the knowledge base to which the data source belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-knowledgebaseid)
     * @param knowledgeBaseId The unique identifier of the knowledge base to which the data source
     * belongs. 
     */
    public fun knowledgeBaseId(knowledgeBaseId: String)

    /**
     * The name of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-name)
     * @param name The name of the data source. 
     */
    public fun name(name: String)

    /**
     * Contains details about the configuration of the server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration Contains details about the configuration of the
     * server-side encryption. 
     */
    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

    /**
     * Contains details about the configuration of the server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration Contains details about the configuration of the
     * server-side encryption. 
     */
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty)

    /**
     * Contains details about the configuration of the server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration Contains details about the configuration of the
     * server-side encryption. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b7b9405a65f26fee70e40f59bac567a5fd157ebc9bb4bb4cf393ed256289f4d")
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * Contains details about how to ingest the documents in the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-vectoringestionconfiguration)
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in the
     * data source. 
     */
    public fun vectorIngestionConfiguration(vectorIngestionConfiguration: IResolvable)

    /**
     * Contains details about how to ingest the documents in the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-vectoringestionconfiguration)
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in the
     * data source. 
     */
    public
        fun vectorIngestionConfiguration(vectorIngestionConfiguration: VectorIngestionConfigurationProperty)

    /**
     * Contains details about how to ingest the documents in the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-vectoringestionconfiguration)
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in the
     * data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ed565b9bd41dc5d8856de6d7d3b5af02c3d64a4b083b75343bb946ae8923d20")
    public
        fun vectorIngestionConfiguration(vectorIngestionConfiguration: VectorIngestionConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnDataSource.Builder =
        software.amazon.awscdk.services.bedrock.CfnDataSource.Builder.create(scope, id)

    /**
     * The data deletion policy for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datadeletionpolicy)
     * @param dataDeletionPolicy The data deletion policy for the data source. 
     */
    override fun dataDeletionPolicy(dataDeletionPolicy: String) {
      cdkBuilder.dataDeletionPolicy(dataDeletionPolicy)
    }

    /**
     * The connection configuration for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datasourceconfiguration)
     * @param dataSourceConfiguration The connection configuration for the data source. 
     */
    override fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The connection configuration for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datasourceconfiguration)
     * @param dataSourceConfiguration The connection configuration for the data source. 
     */
    override fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(DataSourceConfigurationProperty.Companion::unwrap))
    }

    /**
     * The connection configuration for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datasourceconfiguration)
     * @param dataSourceConfiguration The connection configuration for the data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91e233c010d47768c60bfdc0dba1f7f3220eeb3e31f346e31ef4d80aa4d9984b")
    override
        fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty.Builder.() -> Unit):
        Unit = dataSourceConfiguration(DataSourceConfigurationProperty(dataSourceConfiguration))

    /**
     * The description of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-description)
     * @param description The description of the data source. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The unique identifier of the knowledge base to which the data source belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-knowledgebaseid)
     * @param knowledgeBaseId The unique identifier of the knowledge base to which the data source
     * belongs. 
     */
    override fun knowledgeBaseId(knowledgeBaseId: String) {
      cdkBuilder.knowledgeBaseId(knowledgeBaseId)
    }

    /**
     * The name of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-name)
     * @param name The name of the data source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Contains details about the configuration of the server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration Contains details about the configuration of the
     * server-side encryption. 
     */
    override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details about the configuration of the server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration Contains details about the configuration of the
     * server-side encryption. 
     */
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(ServerSideEncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * Contains details about the configuration of the server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration Contains details about the configuration of the
     * server-side encryption. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b7b9405a65f26fee70e40f59bac567a5fd157ebc9bb4bb4cf393ed256289f4d")
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration))

    /**
     * Contains details about how to ingest the documents in the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-vectoringestionconfiguration)
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in the
     * data source. 
     */
    override fun vectorIngestionConfiguration(vectorIngestionConfiguration: IResolvable) {
      cdkBuilder.vectorIngestionConfiguration(vectorIngestionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details about how to ingest the documents in the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-vectoringestionconfiguration)
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in the
     * data source. 
     */
    override
        fun vectorIngestionConfiguration(vectorIngestionConfiguration: VectorIngestionConfigurationProperty) {
      cdkBuilder.vectorIngestionConfiguration(vectorIngestionConfiguration.let(VectorIngestionConfigurationProperty.Companion::unwrap))
    }

    /**
     * Contains details about how to ingest the documents in the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-vectoringestionconfiguration)
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in the
     * data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ed565b9bd41dc5d8856de6d7d3b5af02c3d64a4b083b75343bb946ae8923d20")
    override
        fun vectorIngestionConfiguration(vectorIngestionConfiguration: VectorIngestionConfigurationProperty.Builder.() -> Unit):
        Unit =
        vectorIngestionConfiguration(VectorIngestionConfigurationProperty(vectorIngestionConfiguration))

    public fun build(): software.amazon.awscdk.services.bedrock.CfnDataSource = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnDataSource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource):
        CfnDataSource = CfnDataSource(cdkObject)

    internal fun unwrap(wrapped: CfnDataSource):
        software.amazon.awscdk.services.bedrock.CfnDataSource = wrapped.cdkObject as
        software.amazon.awscdk.services.bedrock.CfnDataSource
  }

  /**
   * Contains configurations for using Amazon Bedrock Data Automation as the parser for ingesting
   * your data sources.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * BedrockDataAutomationConfigurationProperty bedrockDataAutomationConfigurationProperty =
   * BedrockDataAutomationConfigurationProperty.builder()
   * .parsingModality("parsingModality")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-bedrockdataautomationconfiguration.html)
   */
  public interface BedrockDataAutomationConfigurationProperty {
    /**
     * Specifies whether to enable parsing of multimodal data, including both text and/or images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-bedrockdataautomationconfiguration.html#cfn-bedrock-datasource-bedrockdataautomationconfiguration-parsingmodality)
     */
    public fun parsingModality(): String? = unwrap(this).getParsingModality()

    /**
     * A builder for [BedrockDataAutomationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parsingModality Specifies whether to enable parsing of multimodal data, including
       * both text and/or images.
       */
      public fun parsingModality(parsingModality: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockDataAutomationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockDataAutomationConfigurationProperty.builder()

      /**
       * @param parsingModality Specifies whether to enable parsing of multimodal data, including
       * both text and/or images.
       */
      override fun parsingModality(parsingModality: String) {
        cdkBuilder.parsingModality(parsingModality)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockDataAutomationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockDataAutomationConfigurationProperty,
    ) : CdkObject(cdkObject),
        BedrockDataAutomationConfigurationProperty {
      /**
       * Specifies whether to enable parsing of multimodal data, including both text and/or images.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-bedrockdataautomationconfiguration.html#cfn-bedrock-datasource-bedrockdataautomationconfiguration-parsingmodality)
       */
      override fun parsingModality(): String? = unwrap(this).getParsingModality()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BedrockDataAutomationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockDataAutomationConfigurationProperty):
          BedrockDataAutomationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BedrockDataAutomationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BedrockDataAutomationConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockDataAutomationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockDataAutomationConfigurationProperty
    }
  }

  /**
   * Settings for a foundation model used to parse documents for a data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * BedrockFoundationModelConfigurationProperty bedrockFoundationModelConfigurationProperty =
   * BedrockFoundationModelConfigurationProperty.builder()
   * .modelArn("modelArn")
   * // the properties below are optional
   * .parsingModality("parsingModality")
   * .parsingPrompt(ParsingPromptProperty.builder()
   * .parsingPromptText("parsingPromptText")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-bedrockfoundationmodelconfiguration.html)
   */
  public interface BedrockFoundationModelConfigurationProperty {
    /**
     * The ARN of the foundation model to use for parsing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-bedrockfoundationmodelconfiguration.html#cfn-bedrock-datasource-bedrockfoundationmodelconfiguration-modelarn)
     */
    public fun modelArn(): String

    /**
     * Specifies whether to enable parsing of multimodal data, including both text and/or images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-bedrockfoundationmodelconfiguration.html#cfn-bedrock-datasource-bedrockfoundationmodelconfiguration-parsingmodality)
     */
    public fun parsingModality(): String? = unwrap(this).getParsingModality()

    /**
     * Instructions for interpreting the contents of a document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-bedrockfoundationmodelconfiguration.html#cfn-bedrock-datasource-bedrockfoundationmodelconfiguration-parsingprompt)
     */
    public fun parsingPrompt(): Any? = unwrap(this).getParsingPrompt()

    /**
     * A builder for [BedrockFoundationModelConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param modelArn The ARN of the foundation model to use for parsing. 
       */
      public fun modelArn(modelArn: String)

      /**
       * @param parsingModality Specifies whether to enable parsing of multimodal data, including
       * both text and/or images.
       */
      public fun parsingModality(parsingModality: String)

      /**
       * @param parsingPrompt Instructions for interpreting the contents of a document.
       */
      public fun parsingPrompt(parsingPrompt: IResolvable)

      /**
       * @param parsingPrompt Instructions for interpreting the contents of a document.
       */
      public fun parsingPrompt(parsingPrompt: ParsingPromptProperty)

      /**
       * @param parsingPrompt Instructions for interpreting the contents of a document.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a47d3aca3254cc9e5cff51cd2647e9e6c06ae2aecbe6d8fec91bea541e216c6")
      public fun parsingPrompt(parsingPrompt: ParsingPromptProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockFoundationModelConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockFoundationModelConfigurationProperty.builder()

      /**
       * @param modelArn The ARN of the foundation model to use for parsing. 
       */
      override fun modelArn(modelArn: String) {
        cdkBuilder.modelArn(modelArn)
      }

      /**
       * @param parsingModality Specifies whether to enable parsing of multimodal data, including
       * both text and/or images.
       */
      override fun parsingModality(parsingModality: String) {
        cdkBuilder.parsingModality(parsingModality)
      }

      /**
       * @param parsingPrompt Instructions for interpreting the contents of a document.
       */
      override fun parsingPrompt(parsingPrompt: IResolvable) {
        cdkBuilder.parsingPrompt(parsingPrompt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parsingPrompt Instructions for interpreting the contents of a document.
       */
      override fun parsingPrompt(parsingPrompt: ParsingPromptProperty) {
        cdkBuilder.parsingPrompt(parsingPrompt.let(ParsingPromptProperty.Companion::unwrap))
      }

      /**
       * @param parsingPrompt Instructions for interpreting the contents of a document.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a47d3aca3254cc9e5cff51cd2647e9e6c06ae2aecbe6d8fec91bea541e216c6")
      override fun parsingPrompt(parsingPrompt: ParsingPromptProperty.Builder.() -> Unit): Unit =
          parsingPrompt(ParsingPromptProperty(parsingPrompt))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockFoundationModelConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockFoundationModelConfigurationProperty,
    ) : CdkObject(cdkObject),
        BedrockFoundationModelConfigurationProperty {
      /**
       * The ARN of the foundation model to use for parsing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-bedrockfoundationmodelconfiguration.html#cfn-bedrock-datasource-bedrockfoundationmodelconfiguration-modelarn)
       */
      override fun modelArn(): String = unwrap(this).getModelArn()

      /**
       * Specifies whether to enable parsing of multimodal data, including both text and/or images.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-bedrockfoundationmodelconfiguration.html#cfn-bedrock-datasource-bedrockfoundationmodelconfiguration-parsingmodality)
       */
      override fun parsingModality(): String? = unwrap(this).getParsingModality()

      /**
       * Instructions for interpreting the contents of a document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-bedrockfoundationmodelconfiguration.html#cfn-bedrock-datasource-bedrockfoundationmodelconfiguration-parsingprompt)
       */
      override fun parsingPrompt(): Any? = unwrap(this).getParsingPrompt()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BedrockFoundationModelConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockFoundationModelConfigurationProperty):
          BedrockFoundationModelConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BedrockFoundationModelConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BedrockFoundationModelConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockFoundationModelConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockFoundationModelConfigurationProperty
    }
  }

  /**
   * Context enrichment configuration is used to provide additional context to the RAG application
   * using Amazon Bedrock foundation models.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * BedrockFoundationModelContextEnrichmentConfigurationProperty
   * bedrockFoundationModelContextEnrichmentConfigurationProperty =
   * BedrockFoundationModelContextEnrichmentConfigurationProperty.builder()
   * .enrichmentStrategyConfiguration(EnrichmentStrategyConfigurationProperty.builder()
   * .method("method")
   * .build())
   * .modelArn("modelArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-bedrockfoundationmodelcontextenrichmentconfiguration.html)
   */
  public interface BedrockFoundationModelContextEnrichmentConfigurationProperty {
    /**
     * The enrichment stategy used to provide additional context.
     *
     * For example, Neptune GraphRAG uses Amazon Bedrock foundation models to perform chunk entity
     * extraction.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-bedrockfoundationmodelcontextenrichmentconfiguration.html#cfn-bedrock-datasource-bedrockfoundationmodelcontextenrichmentconfiguration-enrichmentstrategyconfiguration)
     */
    public fun enrichmentStrategyConfiguration(): Any

    /**
     * The Amazon Resource Name (ARN) of the model used to create vector embeddings for the
     * knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-bedrockfoundationmodelcontextenrichmentconfiguration.html#cfn-bedrock-datasource-bedrockfoundationmodelcontextenrichmentconfiguration-modelarn)
     */
    public fun modelArn(): String

    /**
     * A builder for [BedrockFoundationModelContextEnrichmentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enrichmentStrategyConfiguration The enrichment stategy used to provide additional
       * context. 
       * For example, Neptune GraphRAG uses Amazon Bedrock foundation models to perform chunk entity
       * extraction.
       */
      public fun enrichmentStrategyConfiguration(enrichmentStrategyConfiguration: IResolvable)

      /**
       * @param enrichmentStrategyConfiguration The enrichment stategy used to provide additional
       * context. 
       * For example, Neptune GraphRAG uses Amazon Bedrock foundation models to perform chunk entity
       * extraction.
       */
      public
          fun enrichmentStrategyConfiguration(enrichmentStrategyConfiguration: EnrichmentStrategyConfigurationProperty)

      /**
       * @param enrichmentStrategyConfiguration The enrichment stategy used to provide additional
       * context. 
       * For example, Neptune GraphRAG uses Amazon Bedrock foundation models to perform chunk entity
       * extraction.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e2fc1bf893fefc81f825a427136cd7b09824cf9bc0bf87c468748cce0e3b14e")
      public
          fun enrichmentStrategyConfiguration(enrichmentStrategyConfiguration: EnrichmentStrategyConfigurationProperty.Builder.() -> Unit)

      /**
       * @param modelArn The Amazon Resource Name (ARN) of the model used to create vector
       * embeddings for the knowledge base. 
       */
      public fun modelArn(modelArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockFoundationModelContextEnrichmentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockFoundationModelContextEnrichmentConfigurationProperty.builder()

      /**
       * @param enrichmentStrategyConfiguration The enrichment stategy used to provide additional
       * context. 
       * For example, Neptune GraphRAG uses Amazon Bedrock foundation models to perform chunk entity
       * extraction.
       */
      override fun enrichmentStrategyConfiguration(enrichmentStrategyConfiguration: IResolvable) {
        cdkBuilder.enrichmentStrategyConfiguration(enrichmentStrategyConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param enrichmentStrategyConfiguration The enrichment stategy used to provide additional
       * context. 
       * For example, Neptune GraphRAG uses Amazon Bedrock foundation models to perform chunk entity
       * extraction.
       */
      override
          fun enrichmentStrategyConfiguration(enrichmentStrategyConfiguration: EnrichmentStrategyConfigurationProperty) {
        cdkBuilder.enrichmentStrategyConfiguration(enrichmentStrategyConfiguration.let(EnrichmentStrategyConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param enrichmentStrategyConfiguration The enrichment stategy used to provide additional
       * context. 
       * For example, Neptune GraphRAG uses Amazon Bedrock foundation models to perform chunk entity
       * extraction.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e2fc1bf893fefc81f825a427136cd7b09824cf9bc0bf87c468748cce0e3b14e")
      override
          fun enrichmentStrategyConfiguration(enrichmentStrategyConfiguration: EnrichmentStrategyConfigurationProperty.Builder.() -> Unit):
          Unit =
          enrichmentStrategyConfiguration(EnrichmentStrategyConfigurationProperty(enrichmentStrategyConfiguration))

      /**
       * @param modelArn The Amazon Resource Name (ARN) of the model used to create vector
       * embeddings for the knowledge base. 
       */
      override fun modelArn(modelArn: String) {
        cdkBuilder.modelArn(modelArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockFoundationModelContextEnrichmentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockFoundationModelContextEnrichmentConfigurationProperty,
    ) : CdkObject(cdkObject),
        BedrockFoundationModelContextEnrichmentConfigurationProperty {
      /**
       * The enrichment stategy used to provide additional context.
       *
       * For example, Neptune GraphRAG uses Amazon Bedrock foundation models to perform chunk entity
       * extraction.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-bedrockfoundationmodelcontextenrichmentconfiguration.html#cfn-bedrock-datasource-bedrockfoundationmodelcontextenrichmentconfiguration-enrichmentstrategyconfiguration)
       */
      override fun enrichmentStrategyConfiguration(): Any =
          unwrap(this).getEnrichmentStrategyConfiguration()

      /**
       * The Amazon Resource Name (ARN) of the model used to create vector embeddings for the
       * knowledge base.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-bedrockfoundationmodelcontextenrichmentconfiguration.html#cfn-bedrock-datasource-bedrockfoundationmodelcontextenrichmentconfiguration-modelarn)
       */
      override fun modelArn(): String = unwrap(this).getModelArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BedrockFoundationModelContextEnrichmentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockFoundationModelContextEnrichmentConfigurationProperty):
          BedrockFoundationModelContextEnrichmentConfigurationProperty =
          CdkObjectWrappers.wrap(cdkObject) as?
          BedrockFoundationModelContextEnrichmentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BedrockFoundationModelContextEnrichmentConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockFoundationModelContextEnrichmentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.BedrockFoundationModelContextEnrichmentConfigurationProperty
    }
  }

  /**
   * Details about how to chunk the documents in the data source.
   *
   * A *chunk* refers to an excerpt from a data source that is returned when the knowledge base that
   * it belongs to is queried.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ChunkingConfigurationProperty chunkingConfigurationProperty =
   * ChunkingConfigurationProperty.builder()
   * .chunkingStrategy("chunkingStrategy")
   * // the properties below are optional
   * .fixedSizeChunkingConfiguration(FixedSizeChunkingConfigurationProperty.builder()
   * .maxTokens(123)
   * .overlapPercentage(123)
   * .build())
   * .hierarchicalChunkingConfiguration(HierarchicalChunkingConfigurationProperty.builder()
   * .levelConfigurations(List.of(HierarchicalChunkingLevelConfigurationProperty.builder()
   * .maxTokens(123)
   * .build()))
   * .overlapTokens(123)
   * .build())
   * .semanticChunkingConfiguration(SemanticChunkingConfigurationProperty.builder()
   * .breakpointPercentileThreshold(123)
   * .bufferSize(123)
   * .maxTokens(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-chunkingconfiguration.html)
   */
  public interface ChunkingConfigurationProperty {
    /**
     * Knowledge base can split your source data into chunks.
     *
     * A *chunk* refers to an excerpt from a data source that is returned when the knowledge base
     * that it belongs to is queried. You have the following options for chunking your data. If you opt
     * for `NONE` , then you may want to pre-process your files by splitting them up such that each
     * file corresponds to a chunk.
     *
     * * `FIXED_SIZE` – Amazon Bedrock splits your source data into chunks of the approximate size
     * that you set in the `fixedSizeChunkingConfiguration` .
     * * `HIERARCHICAL` – Split documents into layers of chunks where the first layer contains large
     * chunks, and the second layer contains smaller chunks derived from the first layer.
     * * `SEMANTIC` – Split documents into chunks based on groups of similar content derived with
     * natural language processing.
     * * `NONE` – Amazon Bedrock treats each file as one chunk. If you choose this option, you may
     * want to pre-process your documents by splitting them into separate files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-chunkingconfiguration.html#cfn-bedrock-datasource-chunkingconfiguration-chunkingstrategy)
     */
    public fun chunkingStrategy(): String

    /**
     * Configurations for when you choose fixed-size chunking.
     *
     * If you set the `chunkingStrategy` as `NONE` , exclude this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-chunkingconfiguration.html#cfn-bedrock-datasource-chunkingconfiguration-fixedsizechunkingconfiguration)
     */
    public fun fixedSizeChunkingConfiguration(): Any? =
        unwrap(this).getFixedSizeChunkingConfiguration()

    /**
     * Settings for hierarchical document chunking for a data source.
     *
     * Hierarchical chunking splits documents into layers of chunks where the first layer contains
     * large chunks, and the second layer contains smaller chunks derived from the first layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-chunkingconfiguration.html#cfn-bedrock-datasource-chunkingconfiguration-hierarchicalchunkingconfiguration)
     */
    public fun hierarchicalChunkingConfiguration(): Any? =
        unwrap(this).getHierarchicalChunkingConfiguration()

    /**
     * Settings for semantic document chunking for a data source.
     *
     * Semantic chunking splits a document into into smaller documents based on groups of similar
     * content derived from the text with natural language processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-chunkingconfiguration.html#cfn-bedrock-datasource-chunkingconfiguration-semanticchunkingconfiguration)
     */
    public fun semanticChunkingConfiguration(): Any? =
        unwrap(this).getSemanticChunkingConfiguration()

    /**
     * A builder for [ChunkingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param chunkingStrategy Knowledge base can split your source data into chunks. 
       * A *chunk* refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried. You have the following options for chunking your data. If you
       * opt for `NONE` , then you may want to pre-process your files by splitting them up such that
       * each file corresponds to a chunk.
       *
       * * `FIXED_SIZE` – Amazon Bedrock splits your source data into chunks of the approximate size
       * that you set in the `fixedSizeChunkingConfiguration` .
       * * `HIERARCHICAL` – Split documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       * * `SEMANTIC` – Split documents into chunks based on groups of similar content derived with
       * natural language processing.
       * * `NONE` – Amazon Bedrock treats each file as one chunk. If you choose this option, you may
       * want to pre-process your documents by splitting them into separate files.
       */
      public fun chunkingStrategy(chunkingStrategy: String)

      /**
       * @param fixedSizeChunkingConfiguration Configurations for when you choose fixed-size
       * chunking.
       * If you set the `chunkingStrategy` as `NONE` , exclude this field.
       */
      public fun fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration: IResolvable)

      /**
       * @param fixedSizeChunkingConfiguration Configurations for when you choose fixed-size
       * chunking.
       * If you set the `chunkingStrategy` as `NONE` , exclude this field.
       */
      public
          fun fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration: FixedSizeChunkingConfigurationProperty)

      /**
       * @param fixedSizeChunkingConfiguration Configurations for when you choose fixed-size
       * chunking.
       * If you set the `chunkingStrategy` as `NONE` , exclude this field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9c98baa96dc4757da95ec8608c2fcdc9e28b022502d051fe253ec992df9f7d5")
      public
          fun fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration: FixedSizeChunkingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param hierarchicalChunkingConfiguration Settings for hierarchical document chunking for a
       * data source.
       * Hierarchical chunking splits documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       */
      public fun hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration: IResolvable)

      /**
       * @param hierarchicalChunkingConfiguration Settings for hierarchical document chunking for a
       * data source.
       * Hierarchical chunking splits documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       */
      public
          fun hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration: HierarchicalChunkingConfigurationProperty)

      /**
       * @param hierarchicalChunkingConfiguration Settings for hierarchical document chunking for a
       * data source.
       * Hierarchical chunking splits documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b259398a82a54de3bfb5e5955e7f4fdff4f2dbe5f0886ebb67363677817e4b9b")
      public
          fun hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration: HierarchicalChunkingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param semanticChunkingConfiguration Settings for semantic document chunking for a data
       * source.
       * Semantic chunking splits a document into into smaller documents based on groups of similar
       * content derived from the text with natural language processing.
       */
      public fun semanticChunkingConfiguration(semanticChunkingConfiguration: IResolvable)

      /**
       * @param semanticChunkingConfiguration Settings for semantic document chunking for a data
       * source.
       * Semantic chunking splits a document into into smaller documents based on groups of similar
       * content derived from the text with natural language processing.
       */
      public
          fun semanticChunkingConfiguration(semanticChunkingConfiguration: SemanticChunkingConfigurationProperty)

      /**
       * @param semanticChunkingConfiguration Settings for semantic document chunking for a data
       * source.
       * Semantic chunking splits a document into into smaller documents based on groups of similar
       * content derived from the text with natural language processing.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("66c1b56097b00bf8f96b60e7d5cd2ba9e0ff681073fc8f51c04e4d6f684b1993")
      public
          fun semanticChunkingConfiguration(semanticChunkingConfiguration: SemanticChunkingConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.ChunkingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.ChunkingConfigurationProperty.builder()

      /**
       * @param chunkingStrategy Knowledge base can split your source data into chunks. 
       * A *chunk* refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried. You have the following options for chunking your data. If you
       * opt for `NONE` , then you may want to pre-process your files by splitting them up such that
       * each file corresponds to a chunk.
       *
       * * `FIXED_SIZE` – Amazon Bedrock splits your source data into chunks of the approximate size
       * that you set in the `fixedSizeChunkingConfiguration` .
       * * `HIERARCHICAL` – Split documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       * * `SEMANTIC` – Split documents into chunks based on groups of similar content derived with
       * natural language processing.
       * * `NONE` – Amazon Bedrock treats each file as one chunk. If you choose this option, you may
       * want to pre-process your documents by splitting them into separate files.
       */
      override fun chunkingStrategy(chunkingStrategy: String) {
        cdkBuilder.chunkingStrategy(chunkingStrategy)
      }

      /**
       * @param fixedSizeChunkingConfiguration Configurations for when you choose fixed-size
       * chunking.
       * If you set the `chunkingStrategy` as `NONE` , exclude this field.
       */
      override fun fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration: IResolvable) {
        cdkBuilder.fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fixedSizeChunkingConfiguration Configurations for when you choose fixed-size
       * chunking.
       * If you set the `chunkingStrategy` as `NONE` , exclude this field.
       */
      override
          fun fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration: FixedSizeChunkingConfigurationProperty) {
        cdkBuilder.fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration.let(FixedSizeChunkingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param fixedSizeChunkingConfiguration Configurations for when you choose fixed-size
       * chunking.
       * If you set the `chunkingStrategy` as `NONE` , exclude this field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9c98baa96dc4757da95ec8608c2fcdc9e28b022502d051fe253ec992df9f7d5")
      override
          fun fixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration: FixedSizeChunkingConfigurationProperty.Builder.() -> Unit):
          Unit =
          fixedSizeChunkingConfiguration(FixedSizeChunkingConfigurationProperty(fixedSizeChunkingConfiguration))

      /**
       * @param hierarchicalChunkingConfiguration Settings for hierarchical document chunking for a
       * data source.
       * Hierarchical chunking splits documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       */
      override
          fun hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration: IResolvable) {
        cdkBuilder.hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param hierarchicalChunkingConfiguration Settings for hierarchical document chunking for a
       * data source.
       * Hierarchical chunking splits documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       */
      override
          fun hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration: HierarchicalChunkingConfigurationProperty) {
        cdkBuilder.hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration.let(HierarchicalChunkingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param hierarchicalChunkingConfiguration Settings for hierarchical document chunking for a
       * data source.
       * Hierarchical chunking splits documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b259398a82a54de3bfb5e5955e7f4fdff4f2dbe5f0886ebb67363677817e4b9b")
      override
          fun hierarchicalChunkingConfiguration(hierarchicalChunkingConfiguration: HierarchicalChunkingConfigurationProperty.Builder.() -> Unit):
          Unit =
          hierarchicalChunkingConfiguration(HierarchicalChunkingConfigurationProperty(hierarchicalChunkingConfiguration))

      /**
       * @param semanticChunkingConfiguration Settings for semantic document chunking for a data
       * source.
       * Semantic chunking splits a document into into smaller documents based on groups of similar
       * content derived from the text with natural language processing.
       */
      override fun semanticChunkingConfiguration(semanticChunkingConfiguration: IResolvable) {
        cdkBuilder.semanticChunkingConfiguration(semanticChunkingConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param semanticChunkingConfiguration Settings for semantic document chunking for a data
       * source.
       * Semantic chunking splits a document into into smaller documents based on groups of similar
       * content derived from the text with natural language processing.
       */
      override
          fun semanticChunkingConfiguration(semanticChunkingConfiguration: SemanticChunkingConfigurationProperty) {
        cdkBuilder.semanticChunkingConfiguration(semanticChunkingConfiguration.let(SemanticChunkingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param semanticChunkingConfiguration Settings for semantic document chunking for a data
       * source.
       * Semantic chunking splits a document into into smaller documents based on groups of similar
       * content derived from the text with natural language processing.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("66c1b56097b00bf8f96b60e7d5cd2ba9e0ff681073fc8f51c04e4d6f684b1993")
      override
          fun semanticChunkingConfiguration(semanticChunkingConfiguration: SemanticChunkingConfigurationProperty.Builder.() -> Unit):
          Unit =
          semanticChunkingConfiguration(SemanticChunkingConfigurationProperty(semanticChunkingConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.ChunkingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ChunkingConfigurationProperty,
    ) : CdkObject(cdkObject),
        ChunkingConfigurationProperty {
      /**
       * Knowledge base can split your source data into chunks.
       *
       * A *chunk* refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried. You have the following options for chunking your data. If you
       * opt for `NONE` , then you may want to pre-process your files by splitting them up such that
       * each file corresponds to a chunk.
       *
       * * `FIXED_SIZE` – Amazon Bedrock splits your source data into chunks of the approximate size
       * that you set in the `fixedSizeChunkingConfiguration` .
       * * `HIERARCHICAL` – Split documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       * * `SEMANTIC` – Split documents into chunks based on groups of similar content derived with
       * natural language processing.
       * * `NONE` – Amazon Bedrock treats each file as one chunk. If you choose this option, you may
       * want to pre-process your documents by splitting them into separate files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-chunkingconfiguration.html#cfn-bedrock-datasource-chunkingconfiguration-chunkingstrategy)
       */
      override fun chunkingStrategy(): String = unwrap(this).getChunkingStrategy()

      /**
       * Configurations for when you choose fixed-size chunking.
       *
       * If you set the `chunkingStrategy` as `NONE` , exclude this field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-chunkingconfiguration.html#cfn-bedrock-datasource-chunkingconfiguration-fixedsizechunkingconfiguration)
       */
      override fun fixedSizeChunkingConfiguration(): Any? =
          unwrap(this).getFixedSizeChunkingConfiguration()

      /**
       * Settings for hierarchical document chunking for a data source.
       *
       * Hierarchical chunking splits documents into layers of chunks where the first layer contains
       * large chunks, and the second layer contains smaller chunks derived from the first layer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-chunkingconfiguration.html#cfn-bedrock-datasource-chunkingconfiguration-hierarchicalchunkingconfiguration)
       */
      override fun hierarchicalChunkingConfiguration(): Any? =
          unwrap(this).getHierarchicalChunkingConfiguration()

      /**
       * Settings for semantic document chunking for a data source.
       *
       * Semantic chunking splits a document into into smaller documents based on groups of similar
       * content derived from the text with natural language processing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-chunkingconfiguration.html#cfn-bedrock-datasource-chunkingconfiguration-semanticchunkingconfiguration)
       */
      override fun semanticChunkingConfiguration(): Any? =
          unwrap(this).getSemanticChunkingConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ChunkingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ChunkingConfigurationProperty):
          ChunkingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ChunkingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChunkingConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.ChunkingConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.ChunkingConfigurationProperty
    }
  }

  /**
   * The configuration of the Confluence content.
   *
   * For example, configuring specific types of Confluence content.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ConfluenceCrawlerConfigurationProperty confluenceCrawlerConfigurationProperty =
   * ConfluenceCrawlerConfigurationProperty.builder()
   * .filterConfiguration(CrawlFilterConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .patternObjectFilter(PatternObjectFilterConfigurationProperty.builder()
   * .filters(List.of(PatternObjectFilterProperty.builder()
   * .objectType("objectType")
   * // the properties below are optional
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .build()))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencecrawlerconfiguration.html)
   */
  public interface ConfluenceCrawlerConfigurationProperty {
    /**
     * The configuration of filtering the Confluence content.
     *
     * For example, configuring regular expression patterns to include or exclude certain content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencecrawlerconfiguration.html#cfn-bedrock-datasource-confluencecrawlerconfiguration-filterconfiguration)
     */
    public fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

    /**
     * A builder for [ConfluenceCrawlerConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filterConfiguration The configuration of filtering the Confluence content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      public fun filterConfiguration(filterConfiguration: IResolvable)

      /**
       * @param filterConfiguration The configuration of filtering the Confluence content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      public fun filterConfiguration(filterConfiguration: CrawlFilterConfigurationProperty)

      /**
       * @param filterConfiguration The configuration of filtering the Confluence content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc46b29068c39d7106c7415dcc7e230d249b8f5ed0a25097880a7fd0119148ce")
      public
          fun filterConfiguration(filterConfiguration: CrawlFilterConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceCrawlerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceCrawlerConfigurationProperty.builder()

      /**
       * @param filterConfiguration The configuration of filtering the Confluence content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      override fun filterConfiguration(filterConfiguration: IResolvable) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filterConfiguration The configuration of filtering the Confluence content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      override fun filterConfiguration(filterConfiguration: CrawlFilterConfigurationProperty) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(CrawlFilterConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param filterConfiguration The configuration of filtering the Confluence content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc46b29068c39d7106c7415dcc7e230d249b8f5ed0a25097880a7fd0119148ce")
      override
          fun filterConfiguration(filterConfiguration: CrawlFilterConfigurationProperty.Builder.() -> Unit):
          Unit = filterConfiguration(CrawlFilterConfigurationProperty(filterConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceCrawlerConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceCrawlerConfigurationProperty,
    ) : CdkObject(cdkObject),
        ConfluenceCrawlerConfigurationProperty {
      /**
       * The configuration of filtering the Confluence content.
       *
       * For example, configuring regular expression patterns to include or exclude certain content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencecrawlerconfiguration.html#cfn-bedrock-datasource-confluencecrawlerconfiguration-filterconfiguration)
       */
      override fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluenceCrawlerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceCrawlerConfigurationProperty):
          ConfluenceCrawlerConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConfluenceCrawlerConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceCrawlerConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceCrawlerConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceCrawlerConfigurationProperty
    }
  }

  /**
   * The configuration information to connect to Confluence as your data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ConfluenceDataSourceConfigurationProperty confluenceDataSourceConfigurationProperty =
   * ConfluenceDataSourceConfigurationProperty.builder()
   * .sourceConfiguration(ConfluenceSourceConfigurationProperty.builder()
   * .authType("authType")
   * .credentialsSecretArn("credentialsSecretArn")
   * .hostType("hostType")
   * .hostUrl("hostUrl")
   * .build())
   * // the properties below are optional
   * .crawlerConfiguration(ConfluenceCrawlerConfigurationProperty.builder()
   * .filterConfiguration(CrawlFilterConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .patternObjectFilter(PatternObjectFilterConfigurationProperty.builder()
   * .filters(List.of(PatternObjectFilterProperty.builder()
   * .objectType("objectType")
   * // the properties below are optional
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .build()))
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencedatasourceconfiguration.html)
   */
  public interface ConfluenceDataSourceConfigurationProperty {
    /**
     * The configuration of the Confluence content.
     *
     * For example, configuring specific types of Confluence content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencedatasourceconfiguration.html#cfn-bedrock-datasource-confluencedatasourceconfiguration-crawlerconfiguration)
     */
    public fun crawlerConfiguration(): Any? = unwrap(this).getCrawlerConfiguration()

    /**
     * The endpoint information to connect to your Confluence data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencedatasourceconfiguration.html#cfn-bedrock-datasource-confluencedatasourceconfiguration-sourceconfiguration)
     */
    public fun sourceConfiguration(): Any

    /**
     * A builder for [ConfluenceDataSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crawlerConfiguration The configuration of the Confluence content.
       * For example, configuring specific types of Confluence content.
       */
      public fun crawlerConfiguration(crawlerConfiguration: IResolvable)

      /**
       * @param crawlerConfiguration The configuration of the Confluence content.
       * For example, configuring specific types of Confluence content.
       */
      public fun crawlerConfiguration(crawlerConfiguration: ConfluenceCrawlerConfigurationProperty)

      /**
       * @param crawlerConfiguration The configuration of the Confluence content.
       * For example, configuring specific types of Confluence content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b160e400f7bea3cf2a1ddb47dc98ffcc0a80e3b372240725bfa332a1c056372")
      public
          fun crawlerConfiguration(crawlerConfiguration: ConfluenceCrawlerConfigurationProperty.Builder.() -> Unit)

      /**
       * @param sourceConfiguration The endpoint information to connect to your Confluence data
       * source. 
       */
      public fun sourceConfiguration(sourceConfiguration: IResolvable)

      /**
       * @param sourceConfiguration The endpoint information to connect to your Confluence data
       * source. 
       */
      public fun sourceConfiguration(sourceConfiguration: ConfluenceSourceConfigurationProperty)

      /**
       * @param sourceConfiguration The endpoint information to connect to your Confluence data
       * source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d6d7a09a77a5783a1a3585a6211699f8948c562fc592cfb2fe32dd65ac9688e")
      public
          fun sourceConfiguration(sourceConfiguration: ConfluenceSourceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceDataSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceDataSourceConfigurationProperty.builder()

      /**
       * @param crawlerConfiguration The configuration of the Confluence content.
       * For example, configuring specific types of Confluence content.
       */
      override fun crawlerConfiguration(crawlerConfiguration: IResolvable) {
        cdkBuilder.crawlerConfiguration(crawlerConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param crawlerConfiguration The configuration of the Confluence content.
       * For example, configuring specific types of Confluence content.
       */
      override
          fun crawlerConfiguration(crawlerConfiguration: ConfluenceCrawlerConfigurationProperty) {
        cdkBuilder.crawlerConfiguration(crawlerConfiguration.let(ConfluenceCrawlerConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param crawlerConfiguration The configuration of the Confluence content.
       * For example, configuring specific types of Confluence content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b160e400f7bea3cf2a1ddb47dc98ffcc0a80e3b372240725bfa332a1c056372")
      override
          fun crawlerConfiguration(crawlerConfiguration: ConfluenceCrawlerConfigurationProperty.Builder.() -> Unit):
          Unit = crawlerConfiguration(ConfluenceCrawlerConfigurationProperty(crawlerConfiguration))

      /**
       * @param sourceConfiguration The endpoint information to connect to your Confluence data
       * source. 
       */
      override fun sourceConfiguration(sourceConfiguration: IResolvable) {
        cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourceConfiguration The endpoint information to connect to your Confluence data
       * source. 
       */
      override fun sourceConfiguration(sourceConfiguration: ConfluenceSourceConfigurationProperty) {
        cdkBuilder.sourceConfiguration(sourceConfiguration.let(ConfluenceSourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param sourceConfiguration The endpoint information to connect to your Confluence data
       * source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d6d7a09a77a5783a1a3585a6211699f8948c562fc592cfb2fe32dd65ac9688e")
      override
          fun sourceConfiguration(sourceConfiguration: ConfluenceSourceConfigurationProperty.Builder.() -> Unit):
          Unit = sourceConfiguration(ConfluenceSourceConfigurationProperty(sourceConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceDataSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceDataSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        ConfluenceDataSourceConfigurationProperty {
      /**
       * The configuration of the Confluence content.
       *
       * For example, configuring specific types of Confluence content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencedatasourceconfiguration.html#cfn-bedrock-datasource-confluencedatasourceconfiguration-crawlerconfiguration)
       */
      override fun crawlerConfiguration(): Any? = unwrap(this).getCrawlerConfiguration()

      /**
       * The endpoint information to connect to your Confluence data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencedatasourceconfiguration.html#cfn-bedrock-datasource-confluencedatasourceconfiguration-sourceconfiguration)
       */
      override fun sourceConfiguration(): Any = unwrap(this).getSourceConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluenceDataSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceDataSourceConfigurationProperty):
          ConfluenceDataSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConfluenceDataSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceDataSourceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceDataSourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceDataSourceConfigurationProperty
    }
  }

  /**
   * The endpoint information to connect to your Confluence data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ConfluenceSourceConfigurationProperty confluenceSourceConfigurationProperty =
   * ConfluenceSourceConfigurationProperty.builder()
   * .authType("authType")
   * .credentialsSecretArn("credentialsSecretArn")
   * .hostType("hostType")
   * .hostUrl("hostUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencesourceconfiguration.html)
   */
  public interface ConfluenceSourceConfigurationProperty {
    /**
     * The supported authentication type to authenticate and connect to your Confluence instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencesourceconfiguration.html#cfn-bedrock-datasource-confluencesourceconfiguration-authtype)
     */
    public fun authType(): String

    /**
     * The Amazon Resource Name of an AWS Secrets Manager secret that stores your authentication
     * credentials for your Confluence instance URL.
     *
     * For more information on the key-value pairs that must be included in your secret, depending
     * on your authentication type, see [Confluence connection
     * configuration](https://docs.aws.amazon.com/bedrock/latest/userguide/confluence-data-source-connector.html#configuration-confluence-connector)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencesourceconfiguration.html#cfn-bedrock-datasource-confluencesourceconfiguration-credentialssecretarn)
     */
    public fun credentialsSecretArn(): String

    /**
     * The supported host type, whether online/cloud or server/on-premises.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencesourceconfiguration.html#cfn-bedrock-datasource-confluencesourceconfiguration-hosttype)
     */
    public fun hostType(): String

    /**
     * The Confluence host URL or instance URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencesourceconfiguration.html#cfn-bedrock-datasource-confluencesourceconfiguration-hosturl)
     */
    public fun hostUrl(): String

    /**
     * A builder for [ConfluenceSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authType The supported authentication type to authenticate and connect to your
       * Confluence instance. 
       */
      public fun authType(authType: String)

      /**
       * @param credentialsSecretArn The Amazon Resource Name of an AWS Secrets Manager secret that
       * stores your authentication credentials for your Confluence instance URL. 
       * For more information on the key-value pairs that must be included in your secret, depending
       * on your authentication type, see [Confluence connection
       * configuration](https://docs.aws.amazon.com/bedrock/latest/userguide/confluence-data-source-connector.html#configuration-confluence-connector)
       * .
       */
      public fun credentialsSecretArn(credentialsSecretArn: String)

      /**
       * @param hostType The supported host type, whether online/cloud or server/on-premises. 
       */
      public fun hostType(hostType: String)

      /**
       * @param hostUrl The Confluence host URL or instance URL. 
       */
      public fun hostUrl(hostUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceSourceConfigurationProperty.builder()

      /**
       * @param authType The supported authentication type to authenticate and connect to your
       * Confluence instance. 
       */
      override fun authType(authType: String) {
        cdkBuilder.authType(authType)
      }

      /**
       * @param credentialsSecretArn The Amazon Resource Name of an AWS Secrets Manager secret that
       * stores your authentication credentials for your Confluence instance URL. 
       * For more information on the key-value pairs that must be included in your secret, depending
       * on your authentication type, see [Confluence connection
       * configuration](https://docs.aws.amazon.com/bedrock/latest/userguide/confluence-data-source-connector.html#configuration-confluence-connector)
       * .
       */
      override fun credentialsSecretArn(credentialsSecretArn: String) {
        cdkBuilder.credentialsSecretArn(credentialsSecretArn)
      }

      /**
       * @param hostType The supported host type, whether online/cloud or server/on-premises. 
       */
      override fun hostType(hostType: String) {
        cdkBuilder.hostType(hostType)
      }

      /**
       * @param hostUrl The Confluence host URL or instance URL. 
       */
      override fun hostUrl(hostUrl: String) {
        cdkBuilder.hostUrl(hostUrl)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        ConfluenceSourceConfigurationProperty {
      /**
       * The supported authentication type to authenticate and connect to your Confluence instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencesourceconfiguration.html#cfn-bedrock-datasource-confluencesourceconfiguration-authtype)
       */
      override fun authType(): String = unwrap(this).getAuthType()

      /**
       * The Amazon Resource Name of an AWS Secrets Manager secret that stores your authentication
       * credentials for your Confluence instance URL.
       *
       * For more information on the key-value pairs that must be included in your secret, depending
       * on your authentication type, see [Confluence connection
       * configuration](https://docs.aws.amazon.com/bedrock/latest/userguide/confluence-data-source-connector.html#configuration-confluence-connector)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencesourceconfiguration.html#cfn-bedrock-datasource-confluencesourceconfiguration-credentialssecretarn)
       */
      override fun credentialsSecretArn(): String = unwrap(this).getCredentialsSecretArn()

      /**
       * The supported host type, whether online/cloud or server/on-premises.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencesourceconfiguration.html#cfn-bedrock-datasource-confluencesourceconfiguration-hosttype)
       */
      override fun hostType(): String = unwrap(this).getHostType()

      /**
       * The Confluence host URL or instance URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-confluencesourceconfiguration.html#cfn-bedrock-datasource-confluencesourceconfiguration-hosturl)
       */
      override fun hostUrl(): String = unwrap(this).getHostUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluenceSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceSourceConfigurationProperty):
          ConfluenceSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConfluenceSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceSourceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceSourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.ConfluenceSourceConfigurationProperty
    }
  }

  /**
   * Context enrichment configuration is used to provide additional context to the RAG application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ContextEnrichmentConfigurationProperty contextEnrichmentConfigurationProperty =
   * ContextEnrichmentConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .bedrockFoundationModelConfiguration(BedrockFoundationModelContextEnrichmentConfigurationProperty.builder()
   * .enrichmentStrategyConfiguration(EnrichmentStrategyConfigurationProperty.builder()
   * .method("method")
   * .build())
   * .modelArn("modelArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-contextenrichmentconfiguration.html)
   */
  public interface ContextEnrichmentConfigurationProperty {
    /**
     * The configuration of the Amazon Bedrock foundation model used for context enrichment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-contextenrichmentconfiguration.html#cfn-bedrock-datasource-contextenrichmentconfiguration-bedrockfoundationmodelconfiguration)
     */
    public fun bedrockFoundationModelConfiguration(): Any? =
        unwrap(this).getBedrockFoundationModelConfiguration()

    /**
     * The method used for context enrichment.
     *
     * It must be Amazon Bedrock foundation models.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-contextenrichmentconfiguration.html#cfn-bedrock-datasource-contextenrichmentconfiguration-type)
     */
    public fun type(): String

    /**
     * A builder for [ContextEnrichmentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bedrockFoundationModelConfiguration The configuration of the Amazon Bedrock
       * foundation model used for context enrichment.
       */
      public
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: IResolvable)

      /**
       * @param bedrockFoundationModelConfiguration The configuration of the Amazon Bedrock
       * foundation model used for context enrichment.
       */
      public
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: BedrockFoundationModelContextEnrichmentConfigurationProperty)

      /**
       * @param bedrockFoundationModelConfiguration The configuration of the Amazon Bedrock
       * foundation model used for context enrichment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f8f228ee46d48295d66b52b5fcb6b5fb3aad63fbe1da7ddea93b48a0a76b53da")
      public
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: BedrockFoundationModelContextEnrichmentConfigurationProperty.Builder.() -> Unit)

      /**
       * @param type The method used for context enrichment. 
       * It must be Amazon Bedrock foundation models.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.ContextEnrichmentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.ContextEnrichmentConfigurationProperty.builder()

      /**
       * @param bedrockFoundationModelConfiguration The configuration of the Amazon Bedrock
       * foundation model used for context enrichment.
       */
      override
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: IResolvable) {
        cdkBuilder.bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param bedrockFoundationModelConfiguration The configuration of the Amazon Bedrock
       * foundation model used for context enrichment.
       */
      override
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: BedrockFoundationModelContextEnrichmentConfigurationProperty) {
        cdkBuilder.bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration.let(BedrockFoundationModelContextEnrichmentConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param bedrockFoundationModelConfiguration The configuration of the Amazon Bedrock
       * foundation model used for context enrichment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f8f228ee46d48295d66b52b5fcb6b5fb3aad63fbe1da7ddea93b48a0a76b53da")
      override
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: BedrockFoundationModelContextEnrichmentConfigurationProperty.Builder.() -> Unit):
          Unit =
          bedrockFoundationModelConfiguration(BedrockFoundationModelContextEnrichmentConfigurationProperty(bedrockFoundationModelConfiguration))

      /**
       * @param type The method used for context enrichment. 
       * It must be Amazon Bedrock foundation models.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.ContextEnrichmentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ContextEnrichmentConfigurationProperty,
    ) : CdkObject(cdkObject),
        ContextEnrichmentConfigurationProperty {
      /**
       * The configuration of the Amazon Bedrock foundation model used for context enrichment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-contextenrichmentconfiguration.html#cfn-bedrock-datasource-contextenrichmentconfiguration-bedrockfoundationmodelconfiguration)
       */
      override fun bedrockFoundationModelConfiguration(): Any? =
          unwrap(this).getBedrockFoundationModelConfiguration()

      /**
       * The method used for context enrichment.
       *
       * It must be Amazon Bedrock foundation models.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-contextenrichmentconfiguration.html#cfn-bedrock-datasource-contextenrichmentconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ContextEnrichmentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ContextEnrichmentConfigurationProperty):
          ContextEnrichmentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContextEnrichmentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContextEnrichmentConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.ContextEnrichmentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.ContextEnrichmentConfigurationProperty
    }
  }

  /**
   * The configuration of filtering the data source content.
   *
   * For example, configuring regular expression patterns to include or exclude certain content.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * CrawlFilterConfigurationProperty crawlFilterConfigurationProperty =
   * CrawlFilterConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .patternObjectFilter(PatternObjectFilterConfigurationProperty.builder()
   * .filters(List.of(PatternObjectFilterProperty.builder()
   * .objectType("objectType")
   * // the properties below are optional
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-crawlfilterconfiguration.html)
   */
  public interface CrawlFilterConfigurationProperty {
    /**
     * The configuration of filtering certain objects or content types of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-crawlfilterconfiguration.html#cfn-bedrock-datasource-crawlfilterconfiguration-patternobjectfilter)
     */
    public fun patternObjectFilter(): Any? = unwrap(this).getPatternObjectFilter()

    /**
     * The type of filtering that you want to apply to certain objects or content of the data
     * source.
     *
     * For example, the `PATTERN` type is regular expression patterns you can apply to filter your
     * content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-crawlfilterconfiguration.html#cfn-bedrock-datasource-crawlfilterconfiguration-type)
     */
    public fun type(): String

    /**
     * A builder for [CrawlFilterConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param patternObjectFilter The configuration of filtering certain objects or content types
       * of the data source.
       */
      public fun patternObjectFilter(patternObjectFilter: IResolvable)

      /**
       * @param patternObjectFilter The configuration of filtering certain objects or content types
       * of the data source.
       */
      public fun patternObjectFilter(patternObjectFilter: PatternObjectFilterConfigurationProperty)

      /**
       * @param patternObjectFilter The configuration of filtering certain objects or content types
       * of the data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5a86ab5cfd0bc42d0b9d16e98f1dd4cc5e5ee6e67d0ef503b6aedff93eee1d4c")
      public
          fun patternObjectFilter(patternObjectFilter: PatternObjectFilterConfigurationProperty.Builder.() -> Unit)

      /**
       * @param type The type of filtering that you want to apply to certain objects or content of
       * the data source. 
       * For example, the `PATTERN` type is regular expression patterns you can apply to filter your
       * content.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.CrawlFilterConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.CrawlFilterConfigurationProperty.builder()

      /**
       * @param patternObjectFilter The configuration of filtering certain objects or content types
       * of the data source.
       */
      override fun patternObjectFilter(patternObjectFilter: IResolvable) {
        cdkBuilder.patternObjectFilter(patternObjectFilter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param patternObjectFilter The configuration of filtering certain objects or content types
       * of the data source.
       */
      override
          fun patternObjectFilter(patternObjectFilter: PatternObjectFilterConfigurationProperty) {
        cdkBuilder.patternObjectFilter(patternObjectFilter.let(PatternObjectFilterConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param patternObjectFilter The configuration of filtering certain objects or content types
       * of the data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5a86ab5cfd0bc42d0b9d16e98f1dd4cc5e5ee6e67d0ef503b6aedff93eee1d4c")
      override
          fun patternObjectFilter(patternObjectFilter: PatternObjectFilterConfigurationProperty.Builder.() -> Unit):
          Unit = patternObjectFilter(PatternObjectFilterConfigurationProperty(patternObjectFilter))

      /**
       * @param type The type of filtering that you want to apply to certain objects or content of
       * the data source. 
       * For example, the `PATTERN` type is regular expression patterns you can apply to filter your
       * content.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.CrawlFilterConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.CrawlFilterConfigurationProperty,
    ) : CdkObject(cdkObject),
        CrawlFilterConfigurationProperty {
      /**
       * The configuration of filtering certain objects or content types of the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-crawlfilterconfiguration.html#cfn-bedrock-datasource-crawlfilterconfiguration-patternobjectfilter)
       */
      override fun patternObjectFilter(): Any? = unwrap(this).getPatternObjectFilter()

      /**
       * The type of filtering that you want to apply to certain objects or content of the data
       * source.
       *
       * For example, the `PATTERN` type is regular expression patterns you can apply to filter your
       * content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-crawlfilterconfiguration.html#cfn-bedrock-datasource-crawlfilterconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CrawlFilterConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.CrawlFilterConfigurationProperty):
          CrawlFilterConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CrawlFilterConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrawlFilterConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.CrawlFilterConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.CrawlFilterConfigurationProperty
    }
  }

  /**
   * Settings for customizing steps in the data source content ingestion pipeline.
   *
   * You can configure the data source to process documents with a Lambda function after they are
   * parsed and converted into chunks. When you add a post-chunking transformation, the service stores
   * chunked documents in an S3 bucket and invokes a Lambda function to process them.
   *
   * To process chunked documents with a Lambda function, define an S3 bucket path for input and
   * output objects, and a transformation that specifies the Lambda function to invoke. You can use the
   * Lambda function to customize how chunks are split, and the metadata for each chunk.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * CustomTransformationConfigurationProperty customTransformationConfigurationProperty =
   * CustomTransformationConfigurationProperty.builder()
   * .intermediateStorage(IntermediateStorageProperty.builder()
   * .s3Location(S3LocationProperty.builder()
   * .uri("uri")
   * .build())
   * .build())
   * .transformations(List.of(TransformationProperty.builder()
   * .stepToApply("stepToApply")
   * .transformationFunction(TransformationFunctionProperty.builder()
   * .transformationLambdaConfiguration(TransformationLambdaConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build())
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-customtransformationconfiguration.html)
   */
  public interface CustomTransformationConfigurationProperty {
    /**
     * An S3 bucket path for input and output objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-customtransformationconfiguration.html#cfn-bedrock-datasource-customtransformationconfiguration-intermediatestorage)
     */
    public fun intermediateStorage(): Any

    /**
     * A Lambda function that processes documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-customtransformationconfiguration.html#cfn-bedrock-datasource-customtransformationconfiguration-transformations)
     */
    public fun transformations(): Any

    /**
     * A builder for [CustomTransformationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param intermediateStorage An S3 bucket path for input and output objects. 
       */
      public fun intermediateStorage(intermediateStorage: IResolvable)

      /**
       * @param intermediateStorage An S3 bucket path for input and output objects. 
       */
      public fun intermediateStorage(intermediateStorage: IntermediateStorageProperty)

      /**
       * @param intermediateStorage An S3 bucket path for input and output objects. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("449216620f77fa6f20dc41d09f3fc14c54ff75a42cd2ebdb6abd446ff380103b")
      public
          fun intermediateStorage(intermediateStorage: IntermediateStorageProperty.Builder.() -> Unit)

      /**
       * @param transformations A Lambda function that processes documents. 
       */
      public fun transformations(transformations: IResolvable)

      /**
       * @param transformations A Lambda function that processes documents. 
       */
      public fun transformations(transformations: List<Any>)

      /**
       * @param transformations A Lambda function that processes documents. 
       */
      public fun transformations(vararg transformations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.CustomTransformationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.CustomTransformationConfigurationProperty.builder()

      /**
       * @param intermediateStorage An S3 bucket path for input and output objects. 
       */
      override fun intermediateStorage(intermediateStorage: IResolvable) {
        cdkBuilder.intermediateStorage(intermediateStorage.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param intermediateStorage An S3 bucket path for input and output objects. 
       */
      override fun intermediateStorage(intermediateStorage: IntermediateStorageProperty) {
        cdkBuilder.intermediateStorage(intermediateStorage.let(IntermediateStorageProperty.Companion::unwrap))
      }

      /**
       * @param intermediateStorage An S3 bucket path for input and output objects. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("449216620f77fa6f20dc41d09f3fc14c54ff75a42cd2ebdb6abd446ff380103b")
      override
          fun intermediateStorage(intermediateStorage: IntermediateStorageProperty.Builder.() -> Unit):
          Unit = intermediateStorage(IntermediateStorageProperty(intermediateStorage))

      /**
       * @param transformations A Lambda function that processes documents. 
       */
      override fun transformations(transformations: IResolvable) {
        cdkBuilder.transformations(transformations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param transformations A Lambda function that processes documents. 
       */
      override fun transformations(transformations: List<Any>) {
        cdkBuilder.transformations(transformations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param transformations A Lambda function that processes documents. 
       */
      override fun transformations(vararg transformations: Any): Unit =
          transformations(transformations.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.CustomTransformationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.CustomTransformationConfigurationProperty,
    ) : CdkObject(cdkObject),
        CustomTransformationConfigurationProperty {
      /**
       * An S3 bucket path for input and output objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-customtransformationconfiguration.html#cfn-bedrock-datasource-customtransformationconfiguration-intermediatestorage)
       */
      override fun intermediateStorage(): Any = unwrap(this).getIntermediateStorage()

      /**
       * A Lambda function that processes documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-customtransformationconfiguration.html#cfn-bedrock-datasource-customtransformationconfiguration-transformations)
       */
      override fun transformations(): Any = unwrap(this).getTransformations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomTransformationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.CustomTransformationConfigurationProperty):
          CustomTransformationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomTransformationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomTransformationConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.CustomTransformationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.CustomTransformationConfigurationProperty
    }
  }

  /**
   * The connection configuration for the data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * DataSourceConfigurationProperty dataSourceConfigurationProperty =
   * DataSourceConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .confluenceConfiguration(ConfluenceDataSourceConfigurationProperty.builder()
   * .sourceConfiguration(ConfluenceSourceConfigurationProperty.builder()
   * .authType("authType")
   * .credentialsSecretArn("credentialsSecretArn")
   * .hostType("hostType")
   * .hostUrl("hostUrl")
   * .build())
   * // the properties below are optional
   * .crawlerConfiguration(ConfluenceCrawlerConfigurationProperty.builder()
   * .filterConfiguration(CrawlFilterConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .patternObjectFilter(PatternObjectFilterConfigurationProperty.builder()
   * .filters(List.of(PatternObjectFilterProperty.builder()
   * .objectType("objectType")
   * // the properties below are optional
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .build()))
   * .build())
   * .build())
   * .build())
   * .build())
   * .s3Configuration(S3DataSourceConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * // the properties below are optional
   * .bucketOwnerAccountId("bucketOwnerAccountId")
   * .inclusionPrefixes(List.of("inclusionPrefixes"))
   * .build())
   * .salesforceConfiguration(SalesforceDataSourceConfigurationProperty.builder()
   * .sourceConfiguration(SalesforceSourceConfigurationProperty.builder()
   * .authType("authType")
   * .credentialsSecretArn("credentialsSecretArn")
   * .hostUrl("hostUrl")
   * .build())
   * // the properties below are optional
   * .crawlerConfiguration(SalesforceCrawlerConfigurationProperty.builder()
   * .filterConfiguration(CrawlFilterConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .patternObjectFilter(PatternObjectFilterConfigurationProperty.builder()
   * .filters(List.of(PatternObjectFilterProperty.builder()
   * .objectType("objectType")
   * // the properties below are optional
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .build()))
   * .build())
   * .build())
   * .build())
   * .build())
   * .sharePointConfiguration(SharePointDataSourceConfigurationProperty.builder()
   * .sourceConfiguration(SharePointSourceConfigurationProperty.builder()
   * .authType("authType")
   * .credentialsSecretArn("credentialsSecretArn")
   * .domain("domain")
   * .hostType("hostType")
   * .siteUrls(List.of("siteUrls"))
   * // the properties below are optional
   * .tenantId("tenantId")
   * .build())
   * // the properties below are optional
   * .crawlerConfiguration(SharePointCrawlerConfigurationProperty.builder()
   * .filterConfiguration(CrawlFilterConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .patternObjectFilter(PatternObjectFilterConfigurationProperty.builder()
   * .filters(List.of(PatternObjectFilterProperty.builder()
   * .objectType("objectType")
   * // the properties below are optional
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .build()))
   * .build())
   * .build())
   * .build())
   * .build())
   * .webConfiguration(WebDataSourceConfigurationProperty.builder()
   * .sourceConfiguration(WebSourceConfigurationProperty.builder()
   * .urlConfiguration(UrlConfigurationProperty.builder()
   * .seedUrls(List.of(SeedUrlProperty.builder()
   * .url("url")
   * .build()))
   * .build())
   * .build())
   * // the properties below are optional
   * .crawlerConfiguration(WebCrawlerConfigurationProperty.builder()
   * .crawlerLimits(WebCrawlerLimitsProperty.builder()
   * .maxPages(123)
   * .rateLimit(123)
   * .build())
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .scope("scope")
   * .userAgent("userAgent")
   * .userAgentHeader("userAgentHeader")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html)
   */
  public interface DataSourceConfigurationProperty {
    /**
     * The configuration information to connect to Confluence as your data source.
     *
     *
     * Confluence data source connector is in preview release and is subject to change.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-confluenceconfiguration)
     */
    public fun confluenceConfiguration(): Any? = unwrap(this).getConfluenceConfiguration()

    /**
     * The configuration information to connect to Amazon S3 as your data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-s3configuration)
     */
    public fun s3Configuration(): Any? = unwrap(this).getS3Configuration()

    /**
     * The configuration information to connect to Salesforce as your data source.
     *
     *
     * Salesforce data source connector is in preview release and is subject to change.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-salesforceconfiguration)
     */
    public fun salesforceConfiguration(): Any? = unwrap(this).getSalesforceConfiguration()

    /**
     * The configuration information to connect to SharePoint as your data source.
     *
     *
     * SharePoint data source connector is in preview release and is subject to change.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-sharepointconfiguration)
     */
    public fun sharePointConfiguration(): Any? = unwrap(this).getSharePointConfiguration()

    /**
     * The type of data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-type)
     */
    public fun type(): String

    /**
     * The configuration of web URLs to crawl for your data source. You should be authorized to
     * crawl the URLs.
     *
     *
     * Crawling web URLs as your data source is in preview release and is subject to change.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-webconfiguration)
     */
    public fun webConfiguration(): Any? = unwrap(this).getWebConfiguration()

    /**
     * A builder for [DataSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param confluenceConfiguration The configuration information to connect to Confluence as
       * your data source.
       *
       * Confluence data source connector is in preview release and is subject to change.
       */
      public fun confluenceConfiguration(confluenceConfiguration: IResolvable)

      /**
       * @param confluenceConfiguration The configuration information to connect to Confluence as
       * your data source.
       *
       * Confluence data source connector is in preview release and is subject to change.
       */
      public
          fun confluenceConfiguration(confluenceConfiguration: ConfluenceDataSourceConfigurationProperty)

      /**
       * @param confluenceConfiguration The configuration information to connect to Confluence as
       * your data source.
       *
       * Confluence data source connector is in preview release and is subject to change.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1612bc316932bbfb47d1bf73d3595f289db8b1c8a7fa0df9ea3bd7c3f791c149")
      public
          fun confluenceConfiguration(confluenceConfiguration: ConfluenceDataSourceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param s3Configuration The configuration information to connect to Amazon S3 as your data
       * source.
       */
      public fun s3Configuration(s3Configuration: IResolvable)

      /**
       * @param s3Configuration The configuration information to connect to Amazon S3 as your data
       * source.
       */
      public fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty)

      /**
       * @param s3Configuration The configuration information to connect to Amazon S3 as your data
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("548e7ecb02258f6ed61d218f2d1f893be2816cedb6d9f9e52cbfac7678c73a90")
      public
          fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param salesforceConfiguration The configuration information to connect to Salesforce as
       * your data source.
       *
       * Salesforce data source connector is in preview release and is subject to change.
       */
      public fun salesforceConfiguration(salesforceConfiguration: IResolvable)

      /**
       * @param salesforceConfiguration The configuration information to connect to Salesforce as
       * your data source.
       *
       * Salesforce data source connector is in preview release and is subject to change.
       */
      public
          fun salesforceConfiguration(salesforceConfiguration: SalesforceDataSourceConfigurationProperty)

      /**
       * @param salesforceConfiguration The configuration information to connect to Salesforce as
       * your data source.
       *
       * Salesforce data source connector is in preview release and is subject to change.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a013cae6113f39c2ef20a3136d295d33724194ca559e3533b58451405d81956e")
      public
          fun salesforceConfiguration(salesforceConfiguration: SalesforceDataSourceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param sharePointConfiguration The configuration information to connect to SharePoint as
       * your data source.
       *
       * SharePoint data source connector is in preview release and is subject to change.
       */
      public fun sharePointConfiguration(sharePointConfiguration: IResolvable)

      /**
       * @param sharePointConfiguration The configuration information to connect to SharePoint as
       * your data source.
       *
       * SharePoint data source connector is in preview release and is subject to change.
       */
      public
          fun sharePointConfiguration(sharePointConfiguration: SharePointDataSourceConfigurationProperty)

      /**
       * @param sharePointConfiguration The configuration information to connect to SharePoint as
       * your data source.
       *
       * SharePoint data source connector is in preview release and is subject to change.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24bdad08248d1f7c094ca2e105d385ab5d07943be3ad2a295ddb1edc9f4719c4")
      public
          fun sharePointConfiguration(sharePointConfiguration: SharePointDataSourceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param type The type of data source. 
       */
      public fun type(type: String)

      /**
       * @param webConfiguration The configuration of web URLs to crawl for your data source. You
       * should be authorized to crawl the URLs.
       *
       * Crawling web URLs as your data source is in preview release and is subject to change.
       */
      public fun webConfiguration(webConfiguration: IResolvable)

      /**
       * @param webConfiguration The configuration of web URLs to crawl for your data source. You
       * should be authorized to crawl the URLs.
       *
       * Crawling web URLs as your data source is in preview release and is subject to change.
       */
      public fun webConfiguration(webConfiguration: WebDataSourceConfigurationProperty)

      /**
       * @param webConfiguration The configuration of web URLs to crawl for your data source. You
       * should be authorized to crawl the URLs.
       *
       * Crawling web URLs as your data source is in preview release and is subject to change.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2191a6af944679c6fed69f5c04d48f89054a5eac6797b632342f1cfa21c2e046")
      public
          fun webConfiguration(webConfiguration: WebDataSourceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.DataSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.DataSourceConfigurationProperty.builder()

      /**
       * @param confluenceConfiguration The configuration information to connect to Confluence as
       * your data source.
       *
       * Confluence data source connector is in preview release and is subject to change.
       */
      override fun confluenceConfiguration(confluenceConfiguration: IResolvable) {
        cdkBuilder.confluenceConfiguration(confluenceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param confluenceConfiguration The configuration information to connect to Confluence as
       * your data source.
       *
       * Confluence data source connector is in preview release and is subject to change.
       */
      override
          fun confluenceConfiguration(confluenceConfiguration: ConfluenceDataSourceConfigurationProperty) {
        cdkBuilder.confluenceConfiguration(confluenceConfiguration.let(ConfluenceDataSourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param confluenceConfiguration The configuration information to connect to Confluence as
       * your data source.
       *
       * Confluence data source connector is in preview release and is subject to change.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1612bc316932bbfb47d1bf73d3595f289db8b1c8a7fa0df9ea3bd7c3f791c149")
      override
          fun confluenceConfiguration(confluenceConfiguration: ConfluenceDataSourceConfigurationProperty.Builder.() -> Unit):
          Unit =
          confluenceConfiguration(ConfluenceDataSourceConfigurationProperty(confluenceConfiguration))

      /**
       * @param s3Configuration The configuration information to connect to Amazon S3 as your data
       * source.
       */
      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3Configuration The configuration information to connect to Amazon S3 as your data
       * source.
       */
      override fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DataSourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param s3Configuration The configuration information to connect to Amazon S3 as your data
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("548e7ecb02258f6ed61d218f2d1f893be2816cedb6d9f9e52cbfac7678c73a90")
      override
          fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DataSourceConfigurationProperty(s3Configuration))

      /**
       * @param salesforceConfiguration The configuration information to connect to Salesforce as
       * your data source.
       *
       * Salesforce data source connector is in preview release and is subject to change.
       */
      override fun salesforceConfiguration(salesforceConfiguration: IResolvable) {
        cdkBuilder.salesforceConfiguration(salesforceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param salesforceConfiguration The configuration information to connect to Salesforce as
       * your data source.
       *
       * Salesforce data source connector is in preview release and is subject to change.
       */
      override
          fun salesforceConfiguration(salesforceConfiguration: SalesforceDataSourceConfigurationProperty) {
        cdkBuilder.salesforceConfiguration(salesforceConfiguration.let(SalesforceDataSourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param salesforceConfiguration The configuration information to connect to Salesforce as
       * your data source.
       *
       * Salesforce data source connector is in preview release and is subject to change.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a013cae6113f39c2ef20a3136d295d33724194ca559e3533b58451405d81956e")
      override
          fun salesforceConfiguration(salesforceConfiguration: SalesforceDataSourceConfigurationProperty.Builder.() -> Unit):
          Unit =
          salesforceConfiguration(SalesforceDataSourceConfigurationProperty(salesforceConfiguration))

      /**
       * @param sharePointConfiguration The configuration information to connect to SharePoint as
       * your data source.
       *
       * SharePoint data source connector is in preview release and is subject to change.
       */
      override fun sharePointConfiguration(sharePointConfiguration: IResolvable) {
        cdkBuilder.sharePointConfiguration(sharePointConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sharePointConfiguration The configuration information to connect to SharePoint as
       * your data source.
       *
       * SharePoint data source connector is in preview release and is subject to change.
       */
      override
          fun sharePointConfiguration(sharePointConfiguration: SharePointDataSourceConfigurationProperty) {
        cdkBuilder.sharePointConfiguration(sharePointConfiguration.let(SharePointDataSourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param sharePointConfiguration The configuration information to connect to SharePoint as
       * your data source.
       *
       * SharePoint data source connector is in preview release and is subject to change.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24bdad08248d1f7c094ca2e105d385ab5d07943be3ad2a295ddb1edc9f4719c4")
      override
          fun sharePointConfiguration(sharePointConfiguration: SharePointDataSourceConfigurationProperty.Builder.() -> Unit):
          Unit =
          sharePointConfiguration(SharePointDataSourceConfigurationProperty(sharePointConfiguration))

      /**
       * @param type The type of data source. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param webConfiguration The configuration of web URLs to crawl for your data source. You
       * should be authorized to crawl the URLs.
       *
       * Crawling web URLs as your data source is in preview release and is subject to change.
       */
      override fun webConfiguration(webConfiguration: IResolvable) {
        cdkBuilder.webConfiguration(webConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param webConfiguration The configuration of web URLs to crawl for your data source. You
       * should be authorized to crawl the URLs.
       *
       * Crawling web URLs as your data source is in preview release and is subject to change.
       */
      override fun webConfiguration(webConfiguration: WebDataSourceConfigurationProperty) {
        cdkBuilder.webConfiguration(webConfiguration.let(WebDataSourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param webConfiguration The configuration of web URLs to crawl for your data source. You
       * should be authorized to crawl the URLs.
       *
       * Crawling web URLs as your data source is in preview release and is subject to change.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2191a6af944679c6fed69f5c04d48f89054a5eac6797b632342f1cfa21c2e046")
      override
          fun webConfiguration(webConfiguration: WebDataSourceConfigurationProperty.Builder.() -> Unit):
          Unit = webConfiguration(WebDataSourceConfigurationProperty(webConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.DataSourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.DataSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        DataSourceConfigurationProperty {
      /**
       * The configuration information to connect to Confluence as your data source.
       *
       *
       * Confluence data source connector is in preview release and is subject to change.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-confluenceconfiguration)
       */
      override fun confluenceConfiguration(): Any? = unwrap(this).getConfluenceConfiguration()

      /**
       * The configuration information to connect to Amazon S3 as your data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-s3configuration)
       */
      override fun s3Configuration(): Any? = unwrap(this).getS3Configuration()

      /**
       * The configuration information to connect to Salesforce as your data source.
       *
       *
       * Salesforce data source connector is in preview release and is subject to change.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-salesforceconfiguration)
       */
      override fun salesforceConfiguration(): Any? = unwrap(this).getSalesforceConfiguration()

      /**
       * The configuration information to connect to SharePoint as your data source.
       *
       *
       * SharePoint data source connector is in preview release and is subject to change.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-sharepointconfiguration)
       */
      override fun sharePointConfiguration(): Any? = unwrap(this).getSharePointConfiguration()

      /**
       * The type of data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The configuration of web URLs to crawl for your data source. You should be authorized to
       * crawl the URLs.
       *
       *
       * Crawling web URLs as your data source is in preview release and is subject to change.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-webconfiguration)
       */
      override fun webConfiguration(): Any? = unwrap(this).getWebConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.DataSourceConfigurationProperty):
          DataSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.DataSourceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.DataSourceConfigurationProperty
    }
  }

  /**
   * The strategy used for performing context enrichment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * EnrichmentStrategyConfigurationProperty enrichmentStrategyConfigurationProperty =
   * EnrichmentStrategyConfigurationProperty.builder()
   * .method("method")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-enrichmentstrategyconfiguration.html)
   */
  public interface EnrichmentStrategyConfigurationProperty {
    /**
     * The method used for the context enrichment strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-enrichmentstrategyconfiguration.html#cfn-bedrock-datasource-enrichmentstrategyconfiguration-method)
     */
    public fun method(): String

    /**
     * A builder for [EnrichmentStrategyConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param method The method used for the context enrichment strategy. 
       */
      public fun method(method: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.EnrichmentStrategyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.EnrichmentStrategyConfigurationProperty.builder()

      /**
       * @param method The method used for the context enrichment strategy. 
       */
      override fun method(method: String) {
        cdkBuilder.method(method)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.EnrichmentStrategyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.EnrichmentStrategyConfigurationProperty,
    ) : CdkObject(cdkObject),
        EnrichmentStrategyConfigurationProperty {
      /**
       * The method used for the context enrichment strategy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-enrichmentstrategyconfiguration.html#cfn-bedrock-datasource-enrichmentstrategyconfiguration-method)
       */
      override fun method(): String = unwrap(this).getMethod()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EnrichmentStrategyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.EnrichmentStrategyConfigurationProperty):
          EnrichmentStrategyConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnrichmentStrategyConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnrichmentStrategyConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.EnrichmentStrategyConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.EnrichmentStrategyConfigurationProperty
    }
  }

  /**
   * Configurations for when you choose fixed-size chunking.
   *
   * If you set the `chunkingStrategy` as `NONE` , exclude this field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FixedSizeChunkingConfigurationProperty fixedSizeChunkingConfigurationProperty =
   * FixedSizeChunkingConfigurationProperty.builder()
   * .maxTokens(123)
   * .overlapPercentage(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-fixedsizechunkingconfiguration.html)
   */
  public interface FixedSizeChunkingConfigurationProperty {
    /**
     * The maximum number of tokens to include in a chunk.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-fixedsizechunkingconfiguration.html#cfn-bedrock-datasource-fixedsizechunkingconfiguration-maxtokens)
     */
    public fun maxTokens(): Number

    /**
     * The percentage of overlap between adjacent chunks of a data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-fixedsizechunkingconfiguration.html#cfn-bedrock-datasource-fixedsizechunkingconfiguration-overlappercentage)
     */
    public fun overlapPercentage(): Number

    /**
     * A builder for [FixedSizeChunkingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxTokens The maximum number of tokens to include in a chunk. 
       */
      public fun maxTokens(maxTokens: Number)

      /**
       * @param overlapPercentage The percentage of overlap between adjacent chunks of a data
       * source. 
       */
      public fun overlapPercentage(overlapPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.FixedSizeChunkingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.FixedSizeChunkingConfigurationProperty.builder()

      /**
       * @param maxTokens The maximum number of tokens to include in a chunk. 
       */
      override fun maxTokens(maxTokens: Number) {
        cdkBuilder.maxTokens(maxTokens)
      }

      /**
       * @param overlapPercentage The percentage of overlap between adjacent chunks of a data
       * source. 
       */
      override fun overlapPercentage(overlapPercentage: Number) {
        cdkBuilder.overlapPercentage(overlapPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.FixedSizeChunkingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.FixedSizeChunkingConfigurationProperty,
    ) : CdkObject(cdkObject),
        FixedSizeChunkingConfigurationProperty {
      /**
       * The maximum number of tokens to include in a chunk.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-fixedsizechunkingconfiguration.html#cfn-bedrock-datasource-fixedsizechunkingconfiguration-maxtokens)
       */
      override fun maxTokens(): Number = unwrap(this).getMaxTokens()

      /**
       * The percentage of overlap between adjacent chunks of a data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-fixedsizechunkingconfiguration.html#cfn-bedrock-datasource-fixedsizechunkingconfiguration-overlappercentage)
       */
      override fun overlapPercentage(): Number = unwrap(this).getOverlapPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FixedSizeChunkingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.FixedSizeChunkingConfigurationProperty):
          FixedSizeChunkingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FixedSizeChunkingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FixedSizeChunkingConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.FixedSizeChunkingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.FixedSizeChunkingConfigurationProperty
    }
  }

  /**
   * Settings for hierarchical document chunking for a data source.
   *
   * Hierarchical chunking splits documents into layers of chunks where the first layer contains
   * large chunks, and the second layer contains smaller chunks derived from the first layer.
   *
   * You configure the number of tokens to overlap, or repeat across adjacent chunks. For example,
   * if you set overlap tokens to 60, the last 60 tokens in the first chunk are also included at the
   * beginning of the second chunk. For each layer, you must also configure the maximum number of
   * tokens in a chunk.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * HierarchicalChunkingConfigurationProperty hierarchicalChunkingConfigurationProperty =
   * HierarchicalChunkingConfigurationProperty.builder()
   * .levelConfigurations(List.of(HierarchicalChunkingLevelConfigurationProperty.builder()
   * .maxTokens(123)
   * .build()))
   * .overlapTokens(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-hierarchicalchunkingconfiguration.html)
   */
  public interface HierarchicalChunkingConfigurationProperty {
    /**
     * Token settings for each layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-hierarchicalchunkingconfiguration.html#cfn-bedrock-datasource-hierarchicalchunkingconfiguration-levelconfigurations)
     */
    public fun levelConfigurations(): Any

    /**
     * The number of tokens to repeat across chunks in the same layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-hierarchicalchunkingconfiguration.html#cfn-bedrock-datasource-hierarchicalchunkingconfiguration-overlaptokens)
     */
    public fun overlapTokens(): Number

    /**
     * A builder for [HierarchicalChunkingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param levelConfigurations Token settings for each layer. 
       */
      public fun levelConfigurations(levelConfigurations: IResolvable)

      /**
       * @param levelConfigurations Token settings for each layer. 
       */
      public fun levelConfigurations(levelConfigurations: List<Any>)

      /**
       * @param levelConfigurations Token settings for each layer. 
       */
      public fun levelConfigurations(vararg levelConfigurations: Any)

      /**
       * @param overlapTokens The number of tokens to repeat across chunks in the same layer. 
       */
      public fun overlapTokens(overlapTokens: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.HierarchicalChunkingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.HierarchicalChunkingConfigurationProperty.builder()

      /**
       * @param levelConfigurations Token settings for each layer. 
       */
      override fun levelConfigurations(levelConfigurations: IResolvable) {
        cdkBuilder.levelConfigurations(levelConfigurations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param levelConfigurations Token settings for each layer. 
       */
      override fun levelConfigurations(levelConfigurations: List<Any>) {
        cdkBuilder.levelConfigurations(levelConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param levelConfigurations Token settings for each layer. 
       */
      override fun levelConfigurations(vararg levelConfigurations: Any): Unit =
          levelConfigurations(levelConfigurations.toList())

      /**
       * @param overlapTokens The number of tokens to repeat across chunks in the same layer. 
       */
      override fun overlapTokens(overlapTokens: Number) {
        cdkBuilder.overlapTokens(overlapTokens)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.HierarchicalChunkingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.HierarchicalChunkingConfigurationProperty,
    ) : CdkObject(cdkObject),
        HierarchicalChunkingConfigurationProperty {
      /**
       * Token settings for each layer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-hierarchicalchunkingconfiguration.html#cfn-bedrock-datasource-hierarchicalchunkingconfiguration-levelconfigurations)
       */
      override fun levelConfigurations(): Any = unwrap(this).getLevelConfigurations()

      /**
       * The number of tokens to repeat across chunks in the same layer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-hierarchicalchunkingconfiguration.html#cfn-bedrock-datasource-hierarchicalchunkingconfiguration-overlaptokens)
       */
      override fun overlapTokens(): Number = unwrap(this).getOverlapTokens()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HierarchicalChunkingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.HierarchicalChunkingConfigurationProperty):
          HierarchicalChunkingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HierarchicalChunkingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HierarchicalChunkingConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.HierarchicalChunkingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.HierarchicalChunkingConfigurationProperty
    }
  }

  /**
   * Token settings for a layer in a hierarchical chunking configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * HierarchicalChunkingLevelConfigurationProperty hierarchicalChunkingLevelConfigurationProperty =
   * HierarchicalChunkingLevelConfigurationProperty.builder()
   * .maxTokens(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-hierarchicalchunkinglevelconfiguration.html)
   */
  public interface HierarchicalChunkingLevelConfigurationProperty {
    /**
     * The maximum number of tokens that a chunk can contain in this layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-hierarchicalchunkinglevelconfiguration.html#cfn-bedrock-datasource-hierarchicalchunkinglevelconfiguration-maxtokens)
     */
    public fun maxTokens(): Number

    /**
     * A builder for [HierarchicalChunkingLevelConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxTokens The maximum number of tokens that a chunk can contain in this layer. 
       */
      public fun maxTokens(maxTokens: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.HierarchicalChunkingLevelConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.HierarchicalChunkingLevelConfigurationProperty.builder()

      /**
       * @param maxTokens The maximum number of tokens that a chunk can contain in this layer. 
       */
      override fun maxTokens(maxTokens: Number) {
        cdkBuilder.maxTokens(maxTokens)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.HierarchicalChunkingLevelConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.HierarchicalChunkingLevelConfigurationProperty,
    ) : CdkObject(cdkObject),
        HierarchicalChunkingLevelConfigurationProperty {
      /**
       * The maximum number of tokens that a chunk can contain in this layer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-hierarchicalchunkinglevelconfiguration.html#cfn-bedrock-datasource-hierarchicalchunkinglevelconfiguration-maxtokens)
       */
      override fun maxTokens(): Number = unwrap(this).getMaxTokens()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HierarchicalChunkingLevelConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.HierarchicalChunkingLevelConfigurationProperty):
          HierarchicalChunkingLevelConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HierarchicalChunkingLevelConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HierarchicalChunkingLevelConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.HierarchicalChunkingLevelConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.HierarchicalChunkingLevelConfigurationProperty
    }
  }

  /**
   * A location for storing content from data sources temporarily as it is processed by custom
   * components in the ingestion pipeline.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * IntermediateStorageProperty intermediateStorageProperty = IntermediateStorageProperty.builder()
   * .s3Location(S3LocationProperty.builder()
   * .uri("uri")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-intermediatestorage.html)
   */
  public interface IntermediateStorageProperty {
    /**
     * An S3 bucket path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-intermediatestorage.html#cfn-bedrock-datasource-intermediatestorage-s3location)
     */
    public fun s3Location(): Any

    /**
     * A builder for [IntermediateStorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Location An S3 bucket path. 
       */
      public fun s3Location(s3Location: IResolvable)

      /**
       * @param s3Location An S3 bucket path. 
       */
      public fun s3Location(s3Location: S3LocationProperty)

      /**
       * @param s3Location An S3 bucket path. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11f0f97d36fad6804c443016b968862e873abbede56c9de2a8f16b609972fef9")
      public fun s3Location(s3Location: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.IntermediateStorageProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.IntermediateStorageProperty.builder()

      /**
       * @param s3Location An S3 bucket path. 
       */
      override fun s3Location(s3Location: IResolvable) {
        cdkBuilder.s3Location(s3Location.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3Location An S3 bucket path. 
       */
      override fun s3Location(s3Location: S3LocationProperty) {
        cdkBuilder.s3Location(s3Location.let(S3LocationProperty.Companion::unwrap))
      }

      /**
       * @param s3Location An S3 bucket path. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11f0f97d36fad6804c443016b968862e873abbede56c9de2a8f16b609972fef9")
      override fun s3Location(s3Location: S3LocationProperty.Builder.() -> Unit): Unit =
          s3Location(S3LocationProperty(s3Location))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.IntermediateStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.IntermediateStorageProperty,
    ) : CdkObject(cdkObject),
        IntermediateStorageProperty {
      /**
       * An S3 bucket path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-intermediatestorage.html#cfn-bedrock-datasource-intermediatestorage-s3location)
       */
      override fun s3Location(): Any = unwrap(this).getS3Location()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntermediateStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.IntermediateStorageProperty):
          IntermediateStorageProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IntermediateStorageProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntermediateStorageProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.IntermediateStorageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.IntermediateStorageProperty
    }
  }

  /**
   * Settings for parsing document contents.
   *
   * If you exclude this field, the default parser converts the contents of each document into text
   * before splitting it into chunks. Specify the parsing strategy to use in the `parsingStrategy`
   * field and include the relevant configuration, or omit it to use the Amazon Bedrock default parser.
   * For more information, see [Parsing options for your data
   * source](https://docs.aws.amazon.com/bedrock/latest/userguide/kb-advanced-parsing.html) .
   *
   *
   * If you specify `BEDROCK_DATA_AUTOMATION` or `BEDROCK_FOUNDATION_MODEL` and it fails to parse a
   * file, the Amazon Bedrock default parser will be used instead.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ParsingConfigurationProperty parsingConfigurationProperty =
   * ParsingConfigurationProperty.builder()
   * .parsingStrategy("parsingStrategy")
   * // the properties below are optional
   * .bedrockDataAutomationConfiguration(BedrockDataAutomationConfigurationProperty.builder()
   * .parsingModality("parsingModality")
   * .build())
   * .bedrockFoundationModelConfiguration(BedrockFoundationModelConfigurationProperty.builder()
   * .modelArn("modelArn")
   * // the properties below are optional
   * .parsingModality("parsingModality")
   * .parsingPrompt(ParsingPromptProperty.builder()
   * .parsingPromptText("parsingPromptText")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-parsingconfiguration.html)
   */
  public interface ParsingConfigurationProperty {
    /**
     * If you specify `BEDROCK_DATA_AUTOMATION` as the parsing strategy for ingesting your data
     * source, use this object to modify configurations for using the Amazon Bedrock Data Automation
     * parser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-parsingconfiguration.html#cfn-bedrock-datasource-parsingconfiguration-bedrockdataautomationconfiguration)
     */
    public fun bedrockDataAutomationConfiguration(): Any? =
        unwrap(this).getBedrockDataAutomationConfiguration()

    /**
     * If you specify `BEDROCK_FOUNDATION_MODEL` as the parsing strategy for ingesting your data
     * source, use this object to modify configurations for using a foundation model to parse
     * documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-parsingconfiguration.html#cfn-bedrock-datasource-parsingconfiguration-bedrockfoundationmodelconfiguration)
     */
    public fun bedrockFoundationModelConfiguration(): Any? =
        unwrap(this).getBedrockFoundationModelConfiguration()

    /**
     * The parsing strategy for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-parsingconfiguration.html#cfn-bedrock-datasource-parsingconfiguration-parsingstrategy)
     */
    public fun parsingStrategy(): String

    /**
     * A builder for [ParsingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bedrockDataAutomationConfiguration If you specify `BEDROCK_DATA_AUTOMATION` as the
       * parsing strategy for ingesting your data source, use this object to modify configurations for
       * using the Amazon Bedrock Data Automation parser.
       */
      public fun bedrockDataAutomationConfiguration(bedrockDataAutomationConfiguration: IResolvable)

      /**
       * @param bedrockDataAutomationConfiguration If you specify `BEDROCK_DATA_AUTOMATION` as the
       * parsing strategy for ingesting your data source, use this object to modify configurations for
       * using the Amazon Bedrock Data Automation parser.
       */
      public
          fun bedrockDataAutomationConfiguration(bedrockDataAutomationConfiguration: BedrockDataAutomationConfigurationProperty)

      /**
       * @param bedrockDataAutomationConfiguration If you specify `BEDROCK_DATA_AUTOMATION` as the
       * parsing strategy for ingesting your data source, use this object to modify configurations for
       * using the Amazon Bedrock Data Automation parser.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("891e559fa87ef2d9a513a39f248293c7ffa853feffdf0dedf0e7af8b159b2886")
      public
          fun bedrockDataAutomationConfiguration(bedrockDataAutomationConfiguration: BedrockDataAutomationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param bedrockFoundationModelConfiguration If you specify `BEDROCK_FOUNDATION_MODEL` as the
       * parsing strategy for ingesting your data source, use this object to modify configurations for
       * using a foundation model to parse documents.
       */
      public
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: IResolvable)

      /**
       * @param bedrockFoundationModelConfiguration If you specify `BEDROCK_FOUNDATION_MODEL` as the
       * parsing strategy for ingesting your data source, use this object to modify configurations for
       * using a foundation model to parse documents.
       */
      public
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: BedrockFoundationModelConfigurationProperty)

      /**
       * @param bedrockFoundationModelConfiguration If you specify `BEDROCK_FOUNDATION_MODEL` as the
       * parsing strategy for ingesting your data source, use this object to modify configurations for
       * using a foundation model to parse documents.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ca0d63d2261f8329ba49af91b7a2211b1818236da7c3e615b8efc52551e174b")
      public
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: BedrockFoundationModelConfigurationProperty.Builder.() -> Unit)

      /**
       * @param parsingStrategy The parsing strategy for the data source. 
       */
      public fun parsingStrategy(parsingStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.ParsingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.ParsingConfigurationProperty.builder()

      /**
       * @param bedrockDataAutomationConfiguration If you specify `BEDROCK_DATA_AUTOMATION` as the
       * parsing strategy for ingesting your data source, use this object to modify configurations for
       * using the Amazon Bedrock Data Automation parser.
       */
      override
          fun bedrockDataAutomationConfiguration(bedrockDataAutomationConfiguration: IResolvable) {
        cdkBuilder.bedrockDataAutomationConfiguration(bedrockDataAutomationConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param bedrockDataAutomationConfiguration If you specify `BEDROCK_DATA_AUTOMATION` as the
       * parsing strategy for ingesting your data source, use this object to modify configurations for
       * using the Amazon Bedrock Data Automation parser.
       */
      override
          fun bedrockDataAutomationConfiguration(bedrockDataAutomationConfiguration: BedrockDataAutomationConfigurationProperty) {
        cdkBuilder.bedrockDataAutomationConfiguration(bedrockDataAutomationConfiguration.let(BedrockDataAutomationConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param bedrockDataAutomationConfiguration If you specify `BEDROCK_DATA_AUTOMATION` as the
       * parsing strategy for ingesting your data source, use this object to modify configurations for
       * using the Amazon Bedrock Data Automation parser.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("891e559fa87ef2d9a513a39f248293c7ffa853feffdf0dedf0e7af8b159b2886")
      override
          fun bedrockDataAutomationConfiguration(bedrockDataAutomationConfiguration: BedrockDataAutomationConfigurationProperty.Builder.() -> Unit):
          Unit =
          bedrockDataAutomationConfiguration(BedrockDataAutomationConfigurationProperty(bedrockDataAutomationConfiguration))

      /**
       * @param bedrockFoundationModelConfiguration If you specify `BEDROCK_FOUNDATION_MODEL` as the
       * parsing strategy for ingesting your data source, use this object to modify configurations for
       * using a foundation model to parse documents.
       */
      override
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: IResolvable) {
        cdkBuilder.bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param bedrockFoundationModelConfiguration If you specify `BEDROCK_FOUNDATION_MODEL` as the
       * parsing strategy for ingesting your data source, use this object to modify configurations for
       * using a foundation model to parse documents.
       */
      override
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: BedrockFoundationModelConfigurationProperty) {
        cdkBuilder.bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration.let(BedrockFoundationModelConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param bedrockFoundationModelConfiguration If you specify `BEDROCK_FOUNDATION_MODEL` as the
       * parsing strategy for ingesting your data source, use this object to modify configurations for
       * using a foundation model to parse documents.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ca0d63d2261f8329ba49af91b7a2211b1818236da7c3e615b8efc52551e174b")
      override
          fun bedrockFoundationModelConfiguration(bedrockFoundationModelConfiguration: BedrockFoundationModelConfigurationProperty.Builder.() -> Unit):
          Unit =
          bedrockFoundationModelConfiguration(BedrockFoundationModelConfigurationProperty(bedrockFoundationModelConfiguration))

      /**
       * @param parsingStrategy The parsing strategy for the data source. 
       */
      override fun parsingStrategy(parsingStrategy: String) {
        cdkBuilder.parsingStrategy(parsingStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.ParsingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ParsingConfigurationProperty,
    ) : CdkObject(cdkObject),
        ParsingConfigurationProperty {
      /**
       * If you specify `BEDROCK_DATA_AUTOMATION` as the parsing strategy for ingesting your data
       * source, use this object to modify configurations for using the Amazon Bedrock Data Automation
       * parser.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-parsingconfiguration.html#cfn-bedrock-datasource-parsingconfiguration-bedrockdataautomationconfiguration)
       */
      override fun bedrockDataAutomationConfiguration(): Any? =
          unwrap(this).getBedrockDataAutomationConfiguration()

      /**
       * If you specify `BEDROCK_FOUNDATION_MODEL` as the parsing strategy for ingesting your data
       * source, use this object to modify configurations for using a foundation model to parse
       * documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-parsingconfiguration.html#cfn-bedrock-datasource-parsingconfiguration-bedrockfoundationmodelconfiguration)
       */
      override fun bedrockFoundationModelConfiguration(): Any? =
          unwrap(this).getBedrockFoundationModelConfiguration()

      /**
       * The parsing strategy for the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-parsingconfiguration.html#cfn-bedrock-datasource-parsingconfiguration-parsingstrategy)
       */
      override fun parsingStrategy(): String = unwrap(this).getParsingStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParsingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ParsingConfigurationProperty):
          ParsingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ParsingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParsingConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.ParsingConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.ParsingConfigurationProperty
    }
  }

  /**
   * Instructions for interpreting the contents of a document.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ParsingPromptProperty parsingPromptProperty = ParsingPromptProperty.builder()
   * .parsingPromptText("parsingPromptText")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-parsingprompt.html)
   */
  public interface ParsingPromptProperty {
    /**
     * Instructions for interpreting the contents of a document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-parsingprompt.html#cfn-bedrock-datasource-parsingprompt-parsingprompttext)
     */
    public fun parsingPromptText(): String

    /**
     * A builder for [ParsingPromptProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parsingPromptText Instructions for interpreting the contents of a document. 
       */
      public fun parsingPromptText(parsingPromptText: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.ParsingPromptProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnDataSource.ParsingPromptProperty.builder()

      /**
       * @param parsingPromptText Instructions for interpreting the contents of a document. 
       */
      override fun parsingPromptText(parsingPromptText: String) {
        cdkBuilder.parsingPromptText(parsingPromptText)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.ParsingPromptProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ParsingPromptProperty,
    ) : CdkObject(cdkObject),
        ParsingPromptProperty {
      /**
       * Instructions for interpreting the contents of a document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-parsingprompt.html#cfn-bedrock-datasource-parsingprompt-parsingprompttext)
       */
      override fun parsingPromptText(): String = unwrap(this).getParsingPromptText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParsingPromptProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ParsingPromptProperty):
          ParsingPromptProperty = CdkObjectWrappers.wrap(cdkObject) as? ParsingPromptProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParsingPromptProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.ParsingPromptProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.ParsingPromptProperty
    }
  }

  /**
   * The configuration of filtering certain objects or content types of the data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PatternObjectFilterConfigurationProperty patternObjectFilterConfigurationProperty =
   * PatternObjectFilterConfigurationProperty.builder()
   * .filters(List.of(PatternObjectFilterProperty.builder()
   * .objectType("objectType")
   * // the properties below are optional
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-patternobjectfilterconfiguration.html)
   */
  public interface PatternObjectFilterConfigurationProperty {
    /**
     * The configuration of specific filters applied to your data source content.
     *
     * You can filter out or include certain content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-patternobjectfilterconfiguration.html#cfn-bedrock-datasource-patternobjectfilterconfiguration-filters)
     */
    public fun filters(): Any

    /**
     * A builder for [PatternObjectFilterConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filters The configuration of specific filters applied to your data source content. 
       * You can filter out or include certain content.
       */
      public fun filters(filters: IResolvable)

      /**
       * @param filters The configuration of specific filters applied to your data source content. 
       * You can filter out or include certain content.
       */
      public fun filters(filters: List<Any>)

      /**
       * @param filters The configuration of specific filters applied to your data source content. 
       * You can filter out or include certain content.
       */
      public fun filters(vararg filters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.PatternObjectFilterConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.PatternObjectFilterConfigurationProperty.builder()

      /**
       * @param filters The configuration of specific filters applied to your data source content. 
       * You can filter out or include certain content.
       */
      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filters The configuration of specific filters applied to your data source content. 
       * You can filter out or include certain content.
       */
      override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param filters The configuration of specific filters applied to your data source content. 
       * You can filter out or include certain content.
       */
      override fun filters(vararg filters: Any): Unit = filters(filters.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.PatternObjectFilterConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.PatternObjectFilterConfigurationProperty,
    ) : CdkObject(cdkObject),
        PatternObjectFilterConfigurationProperty {
      /**
       * The configuration of specific filters applied to your data source content.
       *
       * You can filter out or include certain content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-patternobjectfilterconfiguration.html#cfn-bedrock-datasource-patternobjectfilterconfiguration-filters)
       */
      override fun filters(): Any = unwrap(this).getFilters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PatternObjectFilterConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.PatternObjectFilterConfigurationProperty):
          PatternObjectFilterConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PatternObjectFilterConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PatternObjectFilterConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.PatternObjectFilterConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.PatternObjectFilterConfigurationProperty
    }
  }

  /**
   * The specific filters applied to your data source content.
   *
   * You can filter out or include certain content.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PatternObjectFilterProperty patternObjectFilterProperty = PatternObjectFilterProperty.builder()
   * .objectType("objectType")
   * // the properties below are optional
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-patternobjectfilter.html)
   */
  public interface PatternObjectFilterProperty {
    /**
     * A list of one or more exclusion regular expression patterns to exclude certain object types
     * that adhere to the pattern.
     *
     * If you specify an inclusion and exclusion filter/pattern and both match a document, the
     * exclusion filter takes precedence and the document isn’t crawled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-patternobjectfilter.html#cfn-bedrock-datasource-patternobjectfilter-exclusionfilters)
     */
    public fun exclusionFilters(): List<String> = unwrap(this).getExclusionFilters() ?: emptyList()

    /**
     * A list of one or more inclusion regular expression patterns to include certain object types
     * that adhere to the pattern.
     *
     * If you specify an inclusion and exclusion filter/pattern and both match a document, the
     * exclusion filter takes precedence and the document isn’t crawled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-patternobjectfilter.html#cfn-bedrock-datasource-patternobjectfilter-inclusionfilters)
     */
    public fun inclusionFilters(): List<String> = unwrap(this).getInclusionFilters() ?: emptyList()

    /**
     * The supported object type or content type of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-patternobjectfilter.html#cfn-bedrock-datasource-patternobjectfilter-objecttype)
     */
    public fun objectType(): String

    /**
     * A builder for [PatternObjectFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exclusionFilters A list of one or more exclusion regular expression patterns to
       * exclude certain object types that adhere to the pattern.
       * If you specify an inclusion and exclusion filter/pattern and both match a document, the
       * exclusion filter takes precedence and the document isn’t crawled.
       */
      public fun exclusionFilters(exclusionFilters: List<String>)

      /**
       * @param exclusionFilters A list of one or more exclusion regular expression patterns to
       * exclude certain object types that adhere to the pattern.
       * If you specify an inclusion and exclusion filter/pattern and both match a document, the
       * exclusion filter takes precedence and the document isn’t crawled.
       */
      public fun exclusionFilters(vararg exclusionFilters: String)

      /**
       * @param inclusionFilters A list of one or more inclusion regular expression patterns to
       * include certain object types that adhere to the pattern.
       * If you specify an inclusion and exclusion filter/pattern and both match a document, the
       * exclusion filter takes precedence and the document isn’t crawled.
       */
      public fun inclusionFilters(inclusionFilters: List<String>)

      /**
       * @param inclusionFilters A list of one or more inclusion regular expression patterns to
       * include certain object types that adhere to the pattern.
       * If you specify an inclusion and exclusion filter/pattern and both match a document, the
       * exclusion filter takes precedence and the document isn’t crawled.
       */
      public fun inclusionFilters(vararg inclusionFilters: String)

      /**
       * @param objectType The supported object type or content type of the data source. 
       */
      public fun objectType(objectType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.PatternObjectFilterProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.PatternObjectFilterProperty.builder()

      /**
       * @param exclusionFilters A list of one or more exclusion regular expression patterns to
       * exclude certain object types that adhere to the pattern.
       * If you specify an inclusion and exclusion filter/pattern and both match a document, the
       * exclusion filter takes precedence and the document isn’t crawled.
       */
      override fun exclusionFilters(exclusionFilters: List<String>) {
        cdkBuilder.exclusionFilters(exclusionFilters)
      }

      /**
       * @param exclusionFilters A list of one or more exclusion regular expression patterns to
       * exclude certain object types that adhere to the pattern.
       * If you specify an inclusion and exclusion filter/pattern and both match a document, the
       * exclusion filter takes precedence and the document isn’t crawled.
       */
      override fun exclusionFilters(vararg exclusionFilters: String): Unit =
          exclusionFilters(exclusionFilters.toList())

      /**
       * @param inclusionFilters A list of one or more inclusion regular expression patterns to
       * include certain object types that adhere to the pattern.
       * If you specify an inclusion and exclusion filter/pattern and both match a document, the
       * exclusion filter takes precedence and the document isn’t crawled.
       */
      override fun inclusionFilters(inclusionFilters: List<String>) {
        cdkBuilder.inclusionFilters(inclusionFilters)
      }

      /**
       * @param inclusionFilters A list of one or more inclusion regular expression patterns to
       * include certain object types that adhere to the pattern.
       * If you specify an inclusion and exclusion filter/pattern and both match a document, the
       * exclusion filter takes precedence and the document isn’t crawled.
       */
      override fun inclusionFilters(vararg inclusionFilters: String): Unit =
          inclusionFilters(inclusionFilters.toList())

      /**
       * @param objectType The supported object type or content type of the data source. 
       */
      override fun objectType(objectType: String) {
        cdkBuilder.objectType(objectType)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.PatternObjectFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.PatternObjectFilterProperty,
    ) : CdkObject(cdkObject),
        PatternObjectFilterProperty {
      /**
       * A list of one or more exclusion regular expression patterns to exclude certain object types
       * that adhere to the pattern.
       *
       * If you specify an inclusion and exclusion filter/pattern and both match a document, the
       * exclusion filter takes precedence and the document isn’t crawled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-patternobjectfilter.html#cfn-bedrock-datasource-patternobjectfilter-exclusionfilters)
       */
      override fun exclusionFilters(): List<String> = unwrap(this).getExclusionFilters() ?:
          emptyList()

      /**
       * A list of one or more inclusion regular expression patterns to include certain object types
       * that adhere to the pattern.
       *
       * If you specify an inclusion and exclusion filter/pattern and both match a document, the
       * exclusion filter takes precedence and the document isn’t crawled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-patternobjectfilter.html#cfn-bedrock-datasource-patternobjectfilter-inclusionfilters)
       */
      override fun inclusionFilters(): List<String> = unwrap(this).getInclusionFilters() ?:
          emptyList()

      /**
       * The supported object type or content type of the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-patternobjectfilter.html#cfn-bedrock-datasource-patternobjectfilter-objecttype)
       */
      override fun objectType(): String = unwrap(this).getObjectType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PatternObjectFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.PatternObjectFilterProperty):
          PatternObjectFilterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PatternObjectFilterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PatternObjectFilterProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.PatternObjectFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.PatternObjectFilterProperty
    }
  }

  /**
   * The configuration information to connect to Amazon S3 as your data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * S3DataSourceConfigurationProperty s3DataSourceConfigurationProperty =
   * S3DataSourceConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * // the properties below are optional
   * .bucketOwnerAccountId("bucketOwnerAccountId")
   * .inclusionPrefixes(List.of("inclusionPrefixes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-s3datasourceconfiguration.html)
   */
  public interface S3DataSourceConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the S3 bucket that contains your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-s3datasourceconfiguration.html#cfn-bedrock-datasource-s3datasourceconfiguration-bucketarn)
     */
    public fun bucketArn(): String

    /**
     * The account ID for the owner of the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-s3datasourceconfiguration.html#cfn-bedrock-datasource-s3datasourceconfiguration-bucketowneraccountid)
     */
    public fun bucketOwnerAccountId(): String? = unwrap(this).getBucketOwnerAccountId()

    /**
     * A list of S3 prefixes to include certain files or content.
     *
     * This field is an array with a maximum of one item, which can contain a string that has a
     * maximum length of 300 characters. For more information, see [Organizing objects using
     * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-s3datasourceconfiguration.html#cfn-bedrock-datasource-s3datasourceconfiguration-inclusionprefixes)
     */
    public fun inclusionPrefixes(): List<String> = unwrap(this).getInclusionPrefixes() ?:
        emptyList()

    /**
     * A builder for [S3DataSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketArn The Amazon Resource Name (ARN) of the S3 bucket that contains your data. 
       */
      public fun bucketArn(bucketArn: String)

      /**
       * @param bucketOwnerAccountId The account ID for the owner of the S3 bucket.
       */
      public fun bucketOwnerAccountId(bucketOwnerAccountId: String)

      /**
       * @param inclusionPrefixes A list of S3 prefixes to include certain files or content.
       * This field is an array with a maximum of one item, which can contain a string that has a
       * maximum length of 300 characters. For more information, see [Organizing objects using
       * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) .
       */
      public fun inclusionPrefixes(inclusionPrefixes: List<String>)

      /**
       * @param inclusionPrefixes A list of S3 prefixes to include certain files or content.
       * This field is an array with a maximum of one item, which can contain a string that has a
       * maximum length of 300 characters. For more information, see [Organizing objects using
       * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) .
       */
      public fun inclusionPrefixes(vararg inclusionPrefixes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.S3DataSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.S3DataSourceConfigurationProperty.builder()

      /**
       * @param bucketArn The Amazon Resource Name (ARN) of the S3 bucket that contains your data. 
       */
      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      /**
       * @param bucketOwnerAccountId The account ID for the owner of the S3 bucket.
       */
      override fun bucketOwnerAccountId(bucketOwnerAccountId: String) {
        cdkBuilder.bucketOwnerAccountId(bucketOwnerAccountId)
      }

      /**
       * @param inclusionPrefixes A list of S3 prefixes to include certain files or content.
       * This field is an array with a maximum of one item, which can contain a string that has a
       * maximum length of 300 characters. For more information, see [Organizing objects using
       * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) .
       */
      override fun inclusionPrefixes(inclusionPrefixes: List<String>) {
        cdkBuilder.inclusionPrefixes(inclusionPrefixes)
      }

      /**
       * @param inclusionPrefixes A list of S3 prefixes to include certain files or content.
       * This field is an array with a maximum of one item, which can contain a string that has a
       * maximum length of 300 characters. For more information, see [Organizing objects using
       * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) .
       */
      override fun inclusionPrefixes(vararg inclusionPrefixes: String): Unit =
          inclusionPrefixes(inclusionPrefixes.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.S3DataSourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.S3DataSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        S3DataSourceConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the S3 bucket that contains your data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-s3datasourceconfiguration.html#cfn-bedrock-datasource-s3datasourceconfiguration-bucketarn)
       */
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      /**
       * The account ID for the owner of the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-s3datasourceconfiguration.html#cfn-bedrock-datasource-s3datasourceconfiguration-bucketowneraccountid)
       */
      override fun bucketOwnerAccountId(): String? = unwrap(this).getBucketOwnerAccountId()

      /**
       * A list of S3 prefixes to include certain files or content.
       *
       * This field is an array with a maximum of one item, which can contain a string that has a
       * maximum length of 300 characters. For more information, see [Organizing objects using
       * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-s3datasourceconfiguration.html#cfn-bedrock-datasource-s3datasourceconfiguration-inclusionprefixes)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.S3DataSourceConfigurationProperty):
          S3DataSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3DataSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DataSourceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.S3DataSourceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.S3DataSourceConfigurationProperty
    }
  }

  /**
   * A storage location in an Amazon S3 bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .uri("uri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * An object URI starting with `s3://` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-s3location.html#cfn-bedrock-datasource-s3location-uri)
     */
    public fun uri(): String

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param uri An object URI starting with `s3://` . 
       */
      public fun uri(uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.S3LocationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnDataSource.S3LocationProperty.builder()

      /**
       * @param uri An object URI starting with `s3://` . 
       */
      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnDataSource.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.S3LocationProperty,
    ) : CdkObject(cdkObject),
        S3LocationProperty {
      /**
       * An object URI starting with `s3://` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-s3location.html#cfn-bedrock-datasource-s3location-uri)
       */
      override fun uri(): String = unwrap(this).getUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.S3LocationProperty
    }
  }

  /**
   * The configuration of the Salesforce content.
   *
   * For example, configuring specific types of Salesforce content.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SalesforceCrawlerConfigurationProperty salesforceCrawlerConfigurationProperty =
   * SalesforceCrawlerConfigurationProperty.builder()
   * .filterConfiguration(CrawlFilterConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .patternObjectFilter(PatternObjectFilterConfigurationProperty.builder()
   * .filters(List.of(PatternObjectFilterProperty.builder()
   * .objectType("objectType")
   * // the properties below are optional
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .build()))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-salesforcecrawlerconfiguration.html)
   */
  public interface SalesforceCrawlerConfigurationProperty {
    /**
     * The configuration of filtering the Salesforce content.
     *
     * For example, configuring regular expression patterns to include or exclude certain content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-salesforcecrawlerconfiguration.html#cfn-bedrock-datasource-salesforcecrawlerconfiguration-filterconfiguration)
     */
    public fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

    /**
     * A builder for [SalesforceCrawlerConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filterConfiguration The configuration of filtering the Salesforce content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      public fun filterConfiguration(filterConfiguration: IResolvable)

      /**
       * @param filterConfiguration The configuration of filtering the Salesforce content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      public fun filterConfiguration(filterConfiguration: CrawlFilterConfigurationProperty)

      /**
       * @param filterConfiguration The configuration of filtering the Salesforce content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb3e2fe6e99c522298918d06da51dadb8018d29800aeeaed86747b57007052ff")
      public
          fun filterConfiguration(filterConfiguration: CrawlFilterConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceCrawlerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceCrawlerConfigurationProperty.builder()

      /**
       * @param filterConfiguration The configuration of filtering the Salesforce content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      override fun filterConfiguration(filterConfiguration: IResolvable) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filterConfiguration The configuration of filtering the Salesforce content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      override fun filterConfiguration(filterConfiguration: CrawlFilterConfigurationProperty) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(CrawlFilterConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param filterConfiguration The configuration of filtering the Salesforce content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb3e2fe6e99c522298918d06da51dadb8018d29800aeeaed86747b57007052ff")
      override
          fun filterConfiguration(filterConfiguration: CrawlFilterConfigurationProperty.Builder.() -> Unit):
          Unit = filterConfiguration(CrawlFilterConfigurationProperty(filterConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceCrawlerConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceCrawlerConfigurationProperty,
    ) : CdkObject(cdkObject),
        SalesforceCrawlerConfigurationProperty {
      /**
       * The configuration of filtering the Salesforce content.
       *
       * For example, configuring regular expression patterns to include or exclude certain content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-salesforcecrawlerconfiguration.html#cfn-bedrock-datasource-salesforcecrawlerconfiguration-filterconfiguration)
       */
      override fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceCrawlerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceCrawlerConfigurationProperty):
          SalesforceCrawlerConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SalesforceCrawlerConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceCrawlerConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceCrawlerConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceCrawlerConfigurationProperty
    }
  }

  /**
   * The configuration information to connect to Salesforce as your data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SalesforceDataSourceConfigurationProperty salesforceDataSourceConfigurationProperty =
   * SalesforceDataSourceConfigurationProperty.builder()
   * .sourceConfiguration(SalesforceSourceConfigurationProperty.builder()
   * .authType("authType")
   * .credentialsSecretArn("credentialsSecretArn")
   * .hostUrl("hostUrl")
   * .build())
   * // the properties below are optional
   * .crawlerConfiguration(SalesforceCrawlerConfigurationProperty.builder()
   * .filterConfiguration(CrawlFilterConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .patternObjectFilter(PatternObjectFilterConfigurationProperty.builder()
   * .filters(List.of(PatternObjectFilterProperty.builder()
   * .objectType("objectType")
   * // the properties below are optional
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .build()))
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-salesforcedatasourceconfiguration.html)
   */
  public interface SalesforceDataSourceConfigurationProperty {
    /**
     * The configuration of the Salesforce content.
     *
     * For example, configuring specific types of Salesforce content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-salesforcedatasourceconfiguration.html#cfn-bedrock-datasource-salesforcedatasourceconfiguration-crawlerconfiguration)
     */
    public fun crawlerConfiguration(): Any? = unwrap(this).getCrawlerConfiguration()

    /**
     * The endpoint information to connect to your Salesforce data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-salesforcedatasourceconfiguration.html#cfn-bedrock-datasource-salesforcedatasourceconfiguration-sourceconfiguration)
     */
    public fun sourceConfiguration(): Any

    /**
     * A builder for [SalesforceDataSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crawlerConfiguration The configuration of the Salesforce content.
       * For example, configuring specific types of Salesforce content.
       */
      public fun crawlerConfiguration(crawlerConfiguration: IResolvable)

      /**
       * @param crawlerConfiguration The configuration of the Salesforce content.
       * For example, configuring specific types of Salesforce content.
       */
      public fun crawlerConfiguration(crawlerConfiguration: SalesforceCrawlerConfigurationProperty)

      /**
       * @param crawlerConfiguration The configuration of the Salesforce content.
       * For example, configuring specific types of Salesforce content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1a4a5bebd3702f118e20fe7d9b85d9e7229e1a81e0a94038696aa95b5bb535a")
      public
          fun crawlerConfiguration(crawlerConfiguration: SalesforceCrawlerConfigurationProperty.Builder.() -> Unit)

      /**
       * @param sourceConfiguration The endpoint information to connect to your Salesforce data
       * source. 
       */
      public fun sourceConfiguration(sourceConfiguration: IResolvable)

      /**
       * @param sourceConfiguration The endpoint information to connect to your Salesforce data
       * source. 
       */
      public fun sourceConfiguration(sourceConfiguration: SalesforceSourceConfigurationProperty)

      /**
       * @param sourceConfiguration The endpoint information to connect to your Salesforce data
       * source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b0e116ceb2fad780b6bcc1b5e37fc1beb7b9d0670a7a283a6e56023cceb0f92")
      public
          fun sourceConfiguration(sourceConfiguration: SalesforceSourceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceDataSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceDataSourceConfigurationProperty.builder()

      /**
       * @param crawlerConfiguration The configuration of the Salesforce content.
       * For example, configuring specific types of Salesforce content.
       */
      override fun crawlerConfiguration(crawlerConfiguration: IResolvable) {
        cdkBuilder.crawlerConfiguration(crawlerConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param crawlerConfiguration The configuration of the Salesforce content.
       * For example, configuring specific types of Salesforce content.
       */
      override
          fun crawlerConfiguration(crawlerConfiguration: SalesforceCrawlerConfigurationProperty) {
        cdkBuilder.crawlerConfiguration(crawlerConfiguration.let(SalesforceCrawlerConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param crawlerConfiguration The configuration of the Salesforce content.
       * For example, configuring specific types of Salesforce content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1a4a5bebd3702f118e20fe7d9b85d9e7229e1a81e0a94038696aa95b5bb535a")
      override
          fun crawlerConfiguration(crawlerConfiguration: SalesforceCrawlerConfigurationProperty.Builder.() -> Unit):
          Unit = crawlerConfiguration(SalesforceCrawlerConfigurationProperty(crawlerConfiguration))

      /**
       * @param sourceConfiguration The endpoint information to connect to your Salesforce data
       * source. 
       */
      override fun sourceConfiguration(sourceConfiguration: IResolvable) {
        cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourceConfiguration The endpoint information to connect to your Salesforce data
       * source. 
       */
      override fun sourceConfiguration(sourceConfiguration: SalesforceSourceConfigurationProperty) {
        cdkBuilder.sourceConfiguration(sourceConfiguration.let(SalesforceSourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param sourceConfiguration The endpoint information to connect to your Salesforce data
       * source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b0e116ceb2fad780b6bcc1b5e37fc1beb7b9d0670a7a283a6e56023cceb0f92")
      override
          fun sourceConfiguration(sourceConfiguration: SalesforceSourceConfigurationProperty.Builder.() -> Unit):
          Unit = sourceConfiguration(SalesforceSourceConfigurationProperty(sourceConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceDataSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceDataSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        SalesforceDataSourceConfigurationProperty {
      /**
       * The configuration of the Salesforce content.
       *
       * For example, configuring specific types of Salesforce content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-salesforcedatasourceconfiguration.html#cfn-bedrock-datasource-salesforcedatasourceconfiguration-crawlerconfiguration)
       */
      override fun crawlerConfiguration(): Any? = unwrap(this).getCrawlerConfiguration()

      /**
       * The endpoint information to connect to your Salesforce data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-salesforcedatasourceconfiguration.html#cfn-bedrock-datasource-salesforcedatasourceconfiguration-sourceconfiguration)
       */
      override fun sourceConfiguration(): Any = unwrap(this).getSourceConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceDataSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceDataSourceConfigurationProperty):
          SalesforceDataSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SalesforceDataSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceDataSourceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceDataSourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceDataSourceConfigurationProperty
    }
  }

  /**
   * The endpoint information to connect to your Salesforce data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SalesforceSourceConfigurationProperty salesforceSourceConfigurationProperty =
   * SalesforceSourceConfigurationProperty.builder()
   * .authType("authType")
   * .credentialsSecretArn("credentialsSecretArn")
   * .hostUrl("hostUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-salesforcesourceconfiguration.html)
   */
  public interface SalesforceSourceConfigurationProperty {
    /**
     * The supported authentication type to authenticate and connect to your Salesforce instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-salesforcesourceconfiguration.html#cfn-bedrock-datasource-salesforcesourceconfiguration-authtype)
     */
    public fun authType(): String

    /**
     * The Amazon Resource Name of an AWS Secrets Manager secret that stores your authentication
     * credentials for your Salesforce instance URL.
     *
     * For more information on the key-value pairs that must be included in your secret, depending
     * on your authentication type, see [Salesforce connection
     * configuration](https://docs.aws.amazon.com/bedrock/latest/userguide/salesforce-data-source-connector.html#configuration-salesforce-connector)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-salesforcesourceconfiguration.html#cfn-bedrock-datasource-salesforcesourceconfiguration-credentialssecretarn)
     */
    public fun credentialsSecretArn(): String

    /**
     * The Salesforce host URL or instance URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-salesforcesourceconfiguration.html#cfn-bedrock-datasource-salesforcesourceconfiguration-hosturl)
     */
    public fun hostUrl(): String

    /**
     * A builder for [SalesforceSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authType The supported authentication type to authenticate and connect to your
       * Salesforce instance. 
       */
      public fun authType(authType: String)

      /**
       * @param credentialsSecretArn The Amazon Resource Name of an AWS Secrets Manager secret that
       * stores your authentication credentials for your Salesforce instance URL. 
       * For more information on the key-value pairs that must be included in your secret, depending
       * on your authentication type, see [Salesforce connection
       * configuration](https://docs.aws.amazon.com/bedrock/latest/userguide/salesforce-data-source-connector.html#configuration-salesforce-connector)
       * .
       */
      public fun credentialsSecretArn(credentialsSecretArn: String)

      /**
       * @param hostUrl The Salesforce host URL or instance URL. 
       */
      public fun hostUrl(hostUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceSourceConfigurationProperty.builder()

      /**
       * @param authType The supported authentication type to authenticate and connect to your
       * Salesforce instance. 
       */
      override fun authType(authType: String) {
        cdkBuilder.authType(authType)
      }

      /**
       * @param credentialsSecretArn The Amazon Resource Name of an AWS Secrets Manager secret that
       * stores your authentication credentials for your Salesforce instance URL. 
       * For more information on the key-value pairs that must be included in your secret, depending
       * on your authentication type, see [Salesforce connection
       * configuration](https://docs.aws.amazon.com/bedrock/latest/userguide/salesforce-data-source-connector.html#configuration-salesforce-connector)
       * .
       */
      override fun credentialsSecretArn(credentialsSecretArn: String) {
        cdkBuilder.credentialsSecretArn(credentialsSecretArn)
      }

      /**
       * @param hostUrl The Salesforce host URL or instance URL. 
       */
      override fun hostUrl(hostUrl: String) {
        cdkBuilder.hostUrl(hostUrl)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        SalesforceSourceConfigurationProperty {
      /**
       * The supported authentication type to authenticate and connect to your Salesforce instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-salesforcesourceconfiguration.html#cfn-bedrock-datasource-salesforcesourceconfiguration-authtype)
       */
      override fun authType(): String = unwrap(this).getAuthType()

      /**
       * The Amazon Resource Name of an AWS Secrets Manager secret that stores your authentication
       * credentials for your Salesforce instance URL.
       *
       * For more information on the key-value pairs that must be included in your secret, depending
       * on your authentication type, see [Salesforce connection
       * configuration](https://docs.aws.amazon.com/bedrock/latest/userguide/salesforce-data-source-connector.html#configuration-salesforce-connector)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-salesforcesourceconfiguration.html#cfn-bedrock-datasource-salesforcesourceconfiguration-credentialssecretarn)
       */
      override fun credentialsSecretArn(): String = unwrap(this).getCredentialsSecretArn()

      /**
       * The Salesforce host URL or instance URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-salesforcesourceconfiguration.html#cfn-bedrock-datasource-salesforcesourceconfiguration-hosturl)
       */
      override fun hostUrl(): String = unwrap(this).getHostUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceSourceConfigurationProperty):
          SalesforceSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SalesforceSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceSourceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceSourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.SalesforceSourceConfigurationProperty
    }
  }

  /**
   * The seed or starting point URL.
   *
   * You should be authorized to crawl the URL.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SeedUrlProperty seedUrlProperty = SeedUrlProperty.builder()
   * .url("url")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-seedurl.html)
   */
  public interface SeedUrlProperty {
    /**
     * A seed or starting point URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-seedurl.html#cfn-bedrock-datasource-seedurl-url)
     */
    public fun url(): String

    /**
     * A builder for [SeedUrlProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param url A seed or starting point URL. 
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.SeedUrlProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnDataSource.SeedUrlProperty.builder()

      /**
       * @param url A seed or starting point URL. 
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnDataSource.SeedUrlProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SeedUrlProperty,
    ) : CdkObject(cdkObject),
        SeedUrlProperty {
      /**
       * A seed or starting point URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-seedurl.html#cfn-bedrock-datasource-seedurl-url)
       */
      override fun url(): String = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SeedUrlProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SeedUrlProperty):
          SeedUrlProperty = CdkObjectWrappers.wrap(cdkObject) as? SeedUrlProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SeedUrlProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.SeedUrlProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.SeedUrlProperty
    }
  }

  /**
   * Settings for semantic document chunking for a data source.
   *
   * Semantic chunking splits a document into into smaller documents based on groups of similar
   * content derived from the text with natural language processing.
   *
   * With semantic chunking, each sentence is compared to the next to determine how similar they
   * are. You specify a threshold in the form of a percentile, where adjacent sentences that are less
   * similar than that percentage of sentence pairs are divided into separate chunks. For example, if
   * you set the threshold to 90, then the 10 percent of sentence pairs that are least similar are
   * split. So if you have 101 sentences, 100 sentence pairs are compared, and the 10 with the least
   * similarity are split, creating 11 chunks. These chunks are further split if they exceed the max
   * token size.
   *
   * You must also specify a buffer size, which determines whether sentences are compared in
   * isolation, or within a moving context window that includes the previous and following sentence.
   * For example, if you set the buffer size to `1` , the embedding for sentence 10 is derived from
   * sentences 9, 10, and 11 combined.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SemanticChunkingConfigurationProperty semanticChunkingConfigurationProperty =
   * SemanticChunkingConfigurationProperty.builder()
   * .breakpointPercentileThreshold(123)
   * .bufferSize(123)
   * .maxTokens(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-semanticchunkingconfiguration.html)
   */
  public interface SemanticChunkingConfigurationProperty {
    /**
     * The dissimilarity threshold for splitting chunks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-semanticchunkingconfiguration.html#cfn-bedrock-datasource-semanticchunkingconfiguration-breakpointpercentilethreshold)
     */
    public fun breakpointPercentileThreshold(): Number

    /**
     * The buffer size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-semanticchunkingconfiguration.html#cfn-bedrock-datasource-semanticchunkingconfiguration-buffersize)
     */
    public fun bufferSize(): Number

    /**
     * The maximum number of tokens that a chunk can contain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-semanticchunkingconfiguration.html#cfn-bedrock-datasource-semanticchunkingconfiguration-maxtokens)
     */
    public fun maxTokens(): Number

    /**
     * A builder for [SemanticChunkingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param breakpointPercentileThreshold The dissimilarity threshold for splitting chunks. 
       */
      public fun breakpointPercentileThreshold(breakpointPercentileThreshold: Number)

      /**
       * @param bufferSize The buffer size. 
       */
      public fun bufferSize(bufferSize: Number)

      /**
       * @param maxTokens The maximum number of tokens that a chunk can contain. 
       */
      public fun maxTokens(maxTokens: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.SemanticChunkingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.SemanticChunkingConfigurationProperty.builder()

      /**
       * @param breakpointPercentileThreshold The dissimilarity threshold for splitting chunks. 
       */
      override fun breakpointPercentileThreshold(breakpointPercentileThreshold: Number) {
        cdkBuilder.breakpointPercentileThreshold(breakpointPercentileThreshold)
      }

      /**
       * @param bufferSize The buffer size. 
       */
      override fun bufferSize(bufferSize: Number) {
        cdkBuilder.bufferSize(bufferSize)
      }

      /**
       * @param maxTokens The maximum number of tokens that a chunk can contain. 
       */
      override fun maxTokens(maxTokens: Number) {
        cdkBuilder.maxTokens(maxTokens)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.SemanticChunkingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SemanticChunkingConfigurationProperty,
    ) : CdkObject(cdkObject),
        SemanticChunkingConfigurationProperty {
      /**
       * The dissimilarity threshold for splitting chunks.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-semanticchunkingconfiguration.html#cfn-bedrock-datasource-semanticchunkingconfiguration-breakpointpercentilethreshold)
       */
      override fun breakpointPercentileThreshold(): Number =
          unwrap(this).getBreakpointPercentileThreshold()

      /**
       * The buffer size.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-semanticchunkingconfiguration.html#cfn-bedrock-datasource-semanticchunkingconfiguration-buffersize)
       */
      override fun bufferSize(): Number = unwrap(this).getBufferSize()

      /**
       * The maximum number of tokens that a chunk can contain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-semanticchunkingconfiguration.html#cfn-bedrock-datasource-semanticchunkingconfiguration-maxtokens)
       */
      override fun maxTokens(): Number = unwrap(this).getMaxTokens()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SemanticChunkingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SemanticChunkingConfigurationProperty):
          SemanticChunkingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SemanticChunkingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SemanticChunkingConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.SemanticChunkingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.SemanticChunkingConfigurationProperty
    }
  }

  /**
   * Contains the configuration for server-side encryption.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ServerSideEncryptionConfigurationProperty serverSideEncryptionConfigurationProperty =
   * ServerSideEncryptionConfigurationProperty.builder()
   * .kmsKeyArn("kmsKeyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-serversideencryptionconfiguration.html)
   */
  public interface ServerSideEncryptionConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key used to encrypt the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-serversideencryptionconfiguration.html#cfn-bedrock-datasource-serversideencryptionconfiguration-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * A builder for [ServerSideEncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS KMS key used to encrypt the
       * resource.
       */
      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.ServerSideEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.ServerSideEncryptionConfigurationProperty.builder()

      /**
       * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS KMS key used to encrypt the
       * resource.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.ServerSideEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ServerSideEncryptionConfigurationProperty,
    ) : CdkObject(cdkObject),
        ServerSideEncryptionConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the AWS KMS key used to encrypt the resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-serversideencryptionconfiguration.html#cfn-bedrock-datasource-serversideencryptionconfiguration-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerSideEncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ServerSideEncryptionConfigurationProperty):
          ServerSideEncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServerSideEncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerSideEncryptionConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.ServerSideEncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.ServerSideEncryptionConfigurationProperty
    }
  }

  /**
   * The configuration of the SharePoint content.
   *
   * For example, configuring specific types of SharePoint content.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SharePointCrawlerConfigurationProperty sharePointCrawlerConfigurationProperty =
   * SharePointCrawlerConfigurationProperty.builder()
   * .filterConfiguration(CrawlFilterConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .patternObjectFilter(PatternObjectFilterConfigurationProperty.builder()
   * .filters(List.of(PatternObjectFilterProperty.builder()
   * .objectType("objectType")
   * // the properties below are optional
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .build()))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointcrawlerconfiguration.html)
   */
  public interface SharePointCrawlerConfigurationProperty {
    /**
     * The configuration of filtering the SharePoint content.
     *
     * For example, configuring regular expression patterns to include or exclude certain content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointcrawlerconfiguration.html#cfn-bedrock-datasource-sharepointcrawlerconfiguration-filterconfiguration)
     */
    public fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

    /**
     * A builder for [SharePointCrawlerConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filterConfiguration The configuration of filtering the SharePoint content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      public fun filterConfiguration(filterConfiguration: IResolvable)

      /**
       * @param filterConfiguration The configuration of filtering the SharePoint content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      public fun filterConfiguration(filterConfiguration: CrawlFilterConfigurationProperty)

      /**
       * @param filterConfiguration The configuration of filtering the SharePoint content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cf98b8cbad3c087be8c6c4663b83b3a702cdfdd349bff7ae96226cd896f1cd7")
      public
          fun filterConfiguration(filterConfiguration: CrawlFilterConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointCrawlerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointCrawlerConfigurationProperty.builder()

      /**
       * @param filterConfiguration The configuration of filtering the SharePoint content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      override fun filterConfiguration(filterConfiguration: IResolvable) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filterConfiguration The configuration of filtering the SharePoint content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      override fun filterConfiguration(filterConfiguration: CrawlFilterConfigurationProperty) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(CrawlFilterConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param filterConfiguration The configuration of filtering the SharePoint content.
       * For example, configuring regular expression patterns to include or exclude certain content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cf98b8cbad3c087be8c6c4663b83b3a702cdfdd349bff7ae96226cd896f1cd7")
      override
          fun filterConfiguration(filterConfiguration: CrawlFilterConfigurationProperty.Builder.() -> Unit):
          Unit = filterConfiguration(CrawlFilterConfigurationProperty(filterConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointCrawlerConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointCrawlerConfigurationProperty,
    ) : CdkObject(cdkObject),
        SharePointCrawlerConfigurationProperty {
      /**
       * The configuration of filtering the SharePoint content.
       *
       * For example, configuring regular expression patterns to include or exclude certain content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointcrawlerconfiguration.html#cfn-bedrock-datasource-sharepointcrawlerconfiguration-filterconfiguration)
       */
      override fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SharePointCrawlerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointCrawlerConfigurationProperty):
          SharePointCrawlerConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SharePointCrawlerConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SharePointCrawlerConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointCrawlerConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointCrawlerConfigurationProperty
    }
  }

  /**
   * The configuration information to connect to SharePoint as your data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SharePointDataSourceConfigurationProperty sharePointDataSourceConfigurationProperty =
   * SharePointDataSourceConfigurationProperty.builder()
   * .sourceConfiguration(SharePointSourceConfigurationProperty.builder()
   * .authType("authType")
   * .credentialsSecretArn("credentialsSecretArn")
   * .domain("domain")
   * .hostType("hostType")
   * .siteUrls(List.of("siteUrls"))
   * // the properties below are optional
   * .tenantId("tenantId")
   * .build())
   * // the properties below are optional
   * .crawlerConfiguration(SharePointCrawlerConfigurationProperty.builder()
   * .filterConfiguration(CrawlFilterConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .patternObjectFilter(PatternObjectFilterConfigurationProperty.builder()
   * .filters(List.of(PatternObjectFilterProperty.builder()
   * .objectType("objectType")
   * // the properties below are optional
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .build()))
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointdatasourceconfiguration.html)
   */
  public interface SharePointDataSourceConfigurationProperty {
    /**
     * The configuration of the SharePoint content.
     *
     * For example, configuring specific types of SharePoint content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointdatasourceconfiguration.html#cfn-bedrock-datasource-sharepointdatasourceconfiguration-crawlerconfiguration)
     */
    public fun crawlerConfiguration(): Any? = unwrap(this).getCrawlerConfiguration()

    /**
     * The endpoint information to connect to your SharePoint data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointdatasourceconfiguration.html#cfn-bedrock-datasource-sharepointdatasourceconfiguration-sourceconfiguration)
     */
    public fun sourceConfiguration(): Any

    /**
     * A builder for [SharePointDataSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crawlerConfiguration The configuration of the SharePoint content.
       * For example, configuring specific types of SharePoint content.
       */
      public fun crawlerConfiguration(crawlerConfiguration: IResolvable)

      /**
       * @param crawlerConfiguration The configuration of the SharePoint content.
       * For example, configuring specific types of SharePoint content.
       */
      public fun crawlerConfiguration(crawlerConfiguration: SharePointCrawlerConfigurationProperty)

      /**
       * @param crawlerConfiguration The configuration of the SharePoint content.
       * For example, configuring specific types of SharePoint content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31b434b7d52b4bc754f637c6b4cbdd3f5774e4f984807c7c0403b32201f7b415")
      public
          fun crawlerConfiguration(crawlerConfiguration: SharePointCrawlerConfigurationProperty.Builder.() -> Unit)

      /**
       * @param sourceConfiguration The endpoint information to connect to your SharePoint data
       * source. 
       */
      public fun sourceConfiguration(sourceConfiguration: IResolvable)

      /**
       * @param sourceConfiguration The endpoint information to connect to your SharePoint data
       * source. 
       */
      public fun sourceConfiguration(sourceConfiguration: SharePointSourceConfigurationProperty)

      /**
       * @param sourceConfiguration The endpoint information to connect to your SharePoint data
       * source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e436fb07e856f66dfd0c5f5082d1328d43720e4b5de78e263f68e6b7e0954a6f")
      public
          fun sourceConfiguration(sourceConfiguration: SharePointSourceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointDataSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointDataSourceConfigurationProperty.builder()

      /**
       * @param crawlerConfiguration The configuration of the SharePoint content.
       * For example, configuring specific types of SharePoint content.
       */
      override fun crawlerConfiguration(crawlerConfiguration: IResolvable) {
        cdkBuilder.crawlerConfiguration(crawlerConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param crawlerConfiguration The configuration of the SharePoint content.
       * For example, configuring specific types of SharePoint content.
       */
      override
          fun crawlerConfiguration(crawlerConfiguration: SharePointCrawlerConfigurationProperty) {
        cdkBuilder.crawlerConfiguration(crawlerConfiguration.let(SharePointCrawlerConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param crawlerConfiguration The configuration of the SharePoint content.
       * For example, configuring specific types of SharePoint content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31b434b7d52b4bc754f637c6b4cbdd3f5774e4f984807c7c0403b32201f7b415")
      override
          fun crawlerConfiguration(crawlerConfiguration: SharePointCrawlerConfigurationProperty.Builder.() -> Unit):
          Unit = crawlerConfiguration(SharePointCrawlerConfigurationProperty(crawlerConfiguration))

      /**
       * @param sourceConfiguration The endpoint information to connect to your SharePoint data
       * source. 
       */
      override fun sourceConfiguration(sourceConfiguration: IResolvable) {
        cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourceConfiguration The endpoint information to connect to your SharePoint data
       * source. 
       */
      override fun sourceConfiguration(sourceConfiguration: SharePointSourceConfigurationProperty) {
        cdkBuilder.sourceConfiguration(sourceConfiguration.let(SharePointSourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param sourceConfiguration The endpoint information to connect to your SharePoint data
       * source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e436fb07e856f66dfd0c5f5082d1328d43720e4b5de78e263f68e6b7e0954a6f")
      override
          fun sourceConfiguration(sourceConfiguration: SharePointSourceConfigurationProperty.Builder.() -> Unit):
          Unit = sourceConfiguration(SharePointSourceConfigurationProperty(sourceConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointDataSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointDataSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        SharePointDataSourceConfigurationProperty {
      /**
       * The configuration of the SharePoint content.
       *
       * For example, configuring specific types of SharePoint content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointdatasourceconfiguration.html#cfn-bedrock-datasource-sharepointdatasourceconfiguration-crawlerconfiguration)
       */
      override fun crawlerConfiguration(): Any? = unwrap(this).getCrawlerConfiguration()

      /**
       * The endpoint information to connect to your SharePoint data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointdatasourceconfiguration.html#cfn-bedrock-datasource-sharepointdatasourceconfiguration-sourceconfiguration)
       */
      override fun sourceConfiguration(): Any = unwrap(this).getSourceConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SharePointDataSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointDataSourceConfigurationProperty):
          SharePointDataSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SharePointDataSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SharePointDataSourceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointDataSourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointDataSourceConfigurationProperty
    }
  }

  /**
   * The endpoint information to connect to your SharePoint data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SharePointSourceConfigurationProperty sharePointSourceConfigurationProperty =
   * SharePointSourceConfigurationProperty.builder()
   * .authType("authType")
   * .credentialsSecretArn("credentialsSecretArn")
   * .domain("domain")
   * .hostType("hostType")
   * .siteUrls(List.of("siteUrls"))
   * // the properties below are optional
   * .tenantId("tenantId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointsourceconfiguration.html)
   */
  public interface SharePointSourceConfigurationProperty {
    /**
     * The supported authentication type to authenticate and connect to your SharePoint site/sites.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointsourceconfiguration.html#cfn-bedrock-datasource-sharepointsourceconfiguration-authtype)
     */
    public fun authType(): String

    /**
     * The Amazon Resource Name of an AWS Secrets Manager secret that stores your authentication
     * credentials for your SharePoint site/sites.
     *
     * For more information on the key-value pairs that must be included in your secret, depending
     * on your authentication type, see [SharePoint connection
     * configuration](https://docs.aws.amazon.com/bedrock/latest/userguide/sharepoint-data-source-connector.html#configuration-sharepoint-connector)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointsourceconfiguration.html#cfn-bedrock-datasource-sharepointsourceconfiguration-credentialssecretarn)
     */
    public fun credentialsSecretArn(): String

    /**
     * The domain of your SharePoint instance or site URL/URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointsourceconfiguration.html#cfn-bedrock-datasource-sharepointsourceconfiguration-domain)
     */
    public fun domain(): String

    /**
     * The supported host type, whether online/cloud or server/on-premises.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointsourceconfiguration.html#cfn-bedrock-datasource-sharepointsourceconfiguration-hosttype)
     */
    public fun hostType(): String

    /**
     * A list of one or more SharePoint site URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointsourceconfiguration.html#cfn-bedrock-datasource-sharepointsourceconfiguration-siteurls)
     */
    public fun siteUrls(): List<String>

    /**
     * The identifier of your Microsoft 365 tenant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointsourceconfiguration.html#cfn-bedrock-datasource-sharepointsourceconfiguration-tenantid)
     */
    public fun tenantId(): String? = unwrap(this).getTenantId()

    /**
     * A builder for [SharePointSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authType The supported authentication type to authenticate and connect to your
       * SharePoint site/sites. 
       */
      public fun authType(authType: String)

      /**
       * @param credentialsSecretArn The Amazon Resource Name of an AWS Secrets Manager secret that
       * stores your authentication credentials for your SharePoint site/sites. 
       * For more information on the key-value pairs that must be included in your secret, depending
       * on your authentication type, see [SharePoint connection
       * configuration](https://docs.aws.amazon.com/bedrock/latest/userguide/sharepoint-data-source-connector.html#configuration-sharepoint-connector)
       * .
       */
      public fun credentialsSecretArn(credentialsSecretArn: String)

      /**
       * @param domain The domain of your SharePoint instance or site URL/URLs. 
       */
      public fun domain(domain: String)

      /**
       * @param hostType The supported host type, whether online/cloud or server/on-premises. 
       */
      public fun hostType(hostType: String)

      /**
       * @param siteUrls A list of one or more SharePoint site URLs. 
       */
      public fun siteUrls(siteUrls: List<String>)

      /**
       * @param siteUrls A list of one or more SharePoint site URLs. 
       */
      public fun siteUrls(vararg siteUrls: String)

      /**
       * @param tenantId The identifier of your Microsoft 365 tenant.
       */
      public fun tenantId(tenantId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointSourceConfigurationProperty.builder()

      /**
       * @param authType The supported authentication type to authenticate and connect to your
       * SharePoint site/sites. 
       */
      override fun authType(authType: String) {
        cdkBuilder.authType(authType)
      }

      /**
       * @param credentialsSecretArn The Amazon Resource Name of an AWS Secrets Manager secret that
       * stores your authentication credentials for your SharePoint site/sites. 
       * For more information on the key-value pairs that must be included in your secret, depending
       * on your authentication type, see [SharePoint connection
       * configuration](https://docs.aws.amazon.com/bedrock/latest/userguide/sharepoint-data-source-connector.html#configuration-sharepoint-connector)
       * .
       */
      override fun credentialsSecretArn(credentialsSecretArn: String) {
        cdkBuilder.credentialsSecretArn(credentialsSecretArn)
      }

      /**
       * @param domain The domain of your SharePoint instance or site URL/URLs. 
       */
      override fun domain(domain: String) {
        cdkBuilder.domain(domain)
      }

      /**
       * @param hostType The supported host type, whether online/cloud or server/on-premises. 
       */
      override fun hostType(hostType: String) {
        cdkBuilder.hostType(hostType)
      }

      /**
       * @param siteUrls A list of one or more SharePoint site URLs. 
       */
      override fun siteUrls(siteUrls: List<String>) {
        cdkBuilder.siteUrls(siteUrls)
      }

      /**
       * @param siteUrls A list of one or more SharePoint site URLs. 
       */
      override fun siteUrls(vararg siteUrls: String): Unit = siteUrls(siteUrls.toList())

      /**
       * @param tenantId The identifier of your Microsoft 365 tenant.
       */
      override fun tenantId(tenantId: String) {
        cdkBuilder.tenantId(tenantId)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        SharePointSourceConfigurationProperty {
      /**
       * The supported authentication type to authenticate and connect to your SharePoint
       * site/sites.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointsourceconfiguration.html#cfn-bedrock-datasource-sharepointsourceconfiguration-authtype)
       */
      override fun authType(): String = unwrap(this).getAuthType()

      /**
       * The Amazon Resource Name of an AWS Secrets Manager secret that stores your authentication
       * credentials for your SharePoint site/sites.
       *
       * For more information on the key-value pairs that must be included in your secret, depending
       * on your authentication type, see [SharePoint connection
       * configuration](https://docs.aws.amazon.com/bedrock/latest/userguide/sharepoint-data-source-connector.html#configuration-sharepoint-connector)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointsourceconfiguration.html#cfn-bedrock-datasource-sharepointsourceconfiguration-credentialssecretarn)
       */
      override fun credentialsSecretArn(): String = unwrap(this).getCredentialsSecretArn()

      /**
       * The domain of your SharePoint instance or site URL/URLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointsourceconfiguration.html#cfn-bedrock-datasource-sharepointsourceconfiguration-domain)
       */
      override fun domain(): String = unwrap(this).getDomain()

      /**
       * The supported host type, whether online/cloud or server/on-premises.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointsourceconfiguration.html#cfn-bedrock-datasource-sharepointsourceconfiguration-hosttype)
       */
      override fun hostType(): String = unwrap(this).getHostType()

      /**
       * A list of one or more SharePoint site URLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointsourceconfiguration.html#cfn-bedrock-datasource-sharepointsourceconfiguration-siteurls)
       */
      override fun siteUrls(): List<String> = unwrap(this).getSiteUrls()

      /**
       * The identifier of your Microsoft 365 tenant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-sharepointsourceconfiguration.html#cfn-bedrock-datasource-sharepointsourceconfiguration-tenantid)
       */
      override fun tenantId(): String? = unwrap(this).getTenantId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SharePointSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointSourceConfigurationProperty):
          SharePointSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SharePointSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SharePointSourceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointSourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.SharePointSourceConfigurationProperty
    }
  }

  /**
   * A Lambda function that processes documents.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * TransformationFunctionProperty transformationFunctionProperty =
   * TransformationFunctionProperty.builder()
   * .transformationLambdaConfiguration(TransformationLambdaConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-transformationfunction.html)
   */
  public interface TransformationFunctionProperty {
    /**
     * The Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-transformationfunction.html#cfn-bedrock-datasource-transformationfunction-transformationlambdaconfiguration)
     */
    public fun transformationLambdaConfiguration(): Any

    /**
     * A builder for [TransformationFunctionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param transformationLambdaConfiguration The Lambda function. 
       */
      public fun transformationLambdaConfiguration(transformationLambdaConfiguration: IResolvable)

      /**
       * @param transformationLambdaConfiguration The Lambda function. 
       */
      public
          fun transformationLambdaConfiguration(transformationLambdaConfiguration: TransformationLambdaConfigurationProperty)

      /**
       * @param transformationLambdaConfiguration The Lambda function. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73b96800404fdcf8eee7a1203ab28cf40fff91fb85ac388befb204737252fad3")
      public
          fun transformationLambdaConfiguration(transformationLambdaConfiguration: TransformationLambdaConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationFunctionProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationFunctionProperty.builder()

      /**
       * @param transformationLambdaConfiguration The Lambda function. 
       */
      override
          fun transformationLambdaConfiguration(transformationLambdaConfiguration: IResolvable) {
        cdkBuilder.transformationLambdaConfiguration(transformationLambdaConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param transformationLambdaConfiguration The Lambda function. 
       */
      override
          fun transformationLambdaConfiguration(transformationLambdaConfiguration: TransformationLambdaConfigurationProperty) {
        cdkBuilder.transformationLambdaConfiguration(transformationLambdaConfiguration.let(TransformationLambdaConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param transformationLambdaConfiguration The Lambda function. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73b96800404fdcf8eee7a1203ab28cf40fff91fb85ac388befb204737252fad3")
      override
          fun transformationLambdaConfiguration(transformationLambdaConfiguration: TransformationLambdaConfigurationProperty.Builder.() -> Unit):
          Unit =
          transformationLambdaConfiguration(TransformationLambdaConfigurationProperty(transformationLambdaConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationFunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationFunctionProperty,
    ) : CdkObject(cdkObject),
        TransformationFunctionProperty {
      /**
       * The Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-transformationfunction.html#cfn-bedrock-datasource-transformationfunction-transformationlambdaconfiguration)
       */
      override fun transformationLambdaConfiguration(): Any =
          unwrap(this).getTransformationLambdaConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransformationFunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationFunctionProperty):
          TransformationFunctionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TransformationFunctionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformationFunctionProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationFunctionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationFunctionProperty
    }
  }

  /**
   * A Lambda function that processes documents.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * TransformationLambdaConfigurationProperty transformationLambdaConfigurationProperty =
   * TransformationLambdaConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-transformationlambdaconfiguration.html)
   */
  public interface TransformationLambdaConfigurationProperty {
    /**
     * The function's ARN identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-transformationlambdaconfiguration.html#cfn-bedrock-datasource-transformationlambdaconfiguration-lambdaarn)
     */
    public fun lambdaArn(): String

    /**
     * A builder for [TransformationLambdaConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambdaArn The function's ARN identifier. 
       */
      public fun lambdaArn(lambdaArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationLambdaConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationLambdaConfigurationProperty.builder()

      /**
       * @param lambdaArn The function's ARN identifier. 
       */
      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationLambdaConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationLambdaConfigurationProperty,
    ) : CdkObject(cdkObject),
        TransformationLambdaConfigurationProperty {
      /**
       * The function's ARN identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-transformationlambdaconfiguration.html#cfn-bedrock-datasource-transformationlambdaconfiguration-lambdaarn)
       */
      override fun lambdaArn(): String = unwrap(this).getLambdaArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TransformationLambdaConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationLambdaConfigurationProperty):
          TransformationLambdaConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TransformationLambdaConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformationLambdaConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationLambdaConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationLambdaConfigurationProperty
    }
  }

  /**
   * A custom processing step for documents moving through a data source ingestion pipeline.
   *
   * To process documents after they have been converted into chunks, set the step to apply to
   * `POST_CHUNKING` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * TransformationProperty transformationProperty = TransformationProperty.builder()
   * .stepToApply("stepToApply")
   * .transformationFunction(TransformationFunctionProperty.builder()
   * .transformationLambdaConfiguration(TransformationLambdaConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-transformation.html)
   */
  public interface TransformationProperty {
    /**
     * When the service applies the transformation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-transformation.html#cfn-bedrock-datasource-transformation-steptoapply)
     */
    public fun stepToApply(): String

    /**
     * A Lambda function that processes documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-transformation.html#cfn-bedrock-datasource-transformation-transformationfunction)
     */
    public fun transformationFunction(): Any

    /**
     * A builder for [TransformationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param stepToApply When the service applies the transformation. 
       */
      public fun stepToApply(stepToApply: String)

      /**
       * @param transformationFunction A Lambda function that processes documents. 
       */
      public fun transformationFunction(transformationFunction: IResolvable)

      /**
       * @param transformationFunction A Lambda function that processes documents. 
       */
      public fun transformationFunction(transformationFunction: TransformationFunctionProperty)

      /**
       * @param transformationFunction A Lambda function that processes documents. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6aa6e900d9c086a1e62954b674bf511e6014c644b9de3bea96fa7f54013d9d99")
      public
          fun transformationFunction(transformationFunction: TransformationFunctionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationProperty.builder()

      /**
       * @param stepToApply When the service applies the transformation. 
       */
      override fun stepToApply(stepToApply: String) {
        cdkBuilder.stepToApply(stepToApply)
      }

      /**
       * @param transformationFunction A Lambda function that processes documents. 
       */
      override fun transformationFunction(transformationFunction: IResolvable) {
        cdkBuilder.transformationFunction(transformationFunction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param transformationFunction A Lambda function that processes documents. 
       */
      override fun transformationFunction(transformationFunction: TransformationFunctionProperty) {
        cdkBuilder.transformationFunction(transformationFunction.let(TransformationFunctionProperty.Companion::unwrap))
      }

      /**
       * @param transformationFunction A Lambda function that processes documents. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6aa6e900d9c086a1e62954b674bf511e6014c644b9de3bea96fa7f54013d9d99")
      override
          fun transformationFunction(transformationFunction: TransformationFunctionProperty.Builder.() -> Unit):
          Unit = transformationFunction(TransformationFunctionProperty(transformationFunction))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationProperty,
    ) : CdkObject(cdkObject),
        TransformationProperty {
      /**
       * When the service applies the transformation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-transformation.html#cfn-bedrock-datasource-transformation-steptoapply)
       */
      override fun stepToApply(): String = unwrap(this).getStepToApply()

      /**
       * A Lambda function that processes documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-transformation.html#cfn-bedrock-datasource-transformation-transformationfunction)
       */
      override fun transformationFunction(): Any = unwrap(this).getTransformationFunction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationProperty):
          TransformationProperty = CdkObjectWrappers.wrap(cdkObject) as? TransformationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.TransformationProperty
    }
  }

  /**
   * The configuration of web URLs that you want to crawl.
   *
   * You should be authorized to crawl the URLs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * UrlConfigurationProperty urlConfigurationProperty = UrlConfigurationProperty.builder()
   * .seedUrls(List.of(SeedUrlProperty.builder()
   * .url("url")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-urlconfiguration.html)
   */
  public interface UrlConfigurationProperty {
    /**
     * One or more seed or starting point URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-urlconfiguration.html#cfn-bedrock-datasource-urlconfiguration-seedurls)
     */
    public fun seedUrls(): Any

    /**
     * A builder for [UrlConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param seedUrls One or more seed or starting point URLs. 
       */
      public fun seedUrls(seedUrls: IResolvable)

      /**
       * @param seedUrls One or more seed or starting point URLs. 
       */
      public fun seedUrls(seedUrls: List<Any>)

      /**
       * @param seedUrls One or more seed or starting point URLs. 
       */
      public fun seedUrls(vararg seedUrls: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.UrlConfigurationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnDataSource.UrlConfigurationProperty.builder()

      /**
       * @param seedUrls One or more seed or starting point URLs. 
       */
      override fun seedUrls(seedUrls: IResolvable) {
        cdkBuilder.seedUrls(seedUrls.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param seedUrls One or more seed or starting point URLs. 
       */
      override fun seedUrls(seedUrls: List<Any>) {
        cdkBuilder.seedUrls(seedUrls.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param seedUrls One or more seed or starting point URLs. 
       */
      override fun seedUrls(vararg seedUrls: Any): Unit = seedUrls(seedUrls.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.UrlConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.UrlConfigurationProperty,
    ) : CdkObject(cdkObject),
        UrlConfigurationProperty {
      /**
       * One or more seed or starting point URLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-urlconfiguration.html#cfn-bedrock-datasource-urlconfiguration-seedurls)
       */
      override fun seedUrls(): Any = unwrap(this).getSeedUrls()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UrlConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.UrlConfigurationProperty):
          UrlConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? UrlConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UrlConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.UrlConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.UrlConfigurationProperty
    }
  }

  /**
   * Contains details about how to ingest the documents in a data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * VectorIngestionConfigurationProperty vectorIngestionConfigurationProperty =
   * VectorIngestionConfigurationProperty.builder()
   * .chunkingConfiguration(ChunkingConfigurationProperty.builder()
   * .chunkingStrategy("chunkingStrategy")
   * // the properties below are optional
   * .fixedSizeChunkingConfiguration(FixedSizeChunkingConfigurationProperty.builder()
   * .maxTokens(123)
   * .overlapPercentage(123)
   * .build())
   * .hierarchicalChunkingConfiguration(HierarchicalChunkingConfigurationProperty.builder()
   * .levelConfigurations(List.of(HierarchicalChunkingLevelConfigurationProperty.builder()
   * .maxTokens(123)
   * .build()))
   * .overlapTokens(123)
   * .build())
   * .semanticChunkingConfiguration(SemanticChunkingConfigurationProperty.builder()
   * .breakpointPercentileThreshold(123)
   * .bufferSize(123)
   * .maxTokens(123)
   * .build())
   * .build())
   * .contextEnrichmentConfiguration(ContextEnrichmentConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .bedrockFoundationModelConfiguration(BedrockFoundationModelContextEnrichmentConfigurationProperty.builder()
   * .enrichmentStrategyConfiguration(EnrichmentStrategyConfigurationProperty.builder()
   * .method("method")
   * .build())
   * .modelArn("modelArn")
   * .build())
   * .build())
   * .customTransformationConfiguration(CustomTransformationConfigurationProperty.builder()
   * .intermediateStorage(IntermediateStorageProperty.builder()
   * .s3Location(S3LocationProperty.builder()
   * .uri("uri")
   * .build())
   * .build())
   * .transformations(List.of(TransformationProperty.builder()
   * .stepToApply("stepToApply")
   * .transformationFunction(TransformationFunctionProperty.builder()
   * .transformationLambdaConfiguration(TransformationLambdaConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build())
   * .build())
   * .build()))
   * .build())
   * .parsingConfiguration(ParsingConfigurationProperty.builder()
   * .parsingStrategy("parsingStrategy")
   * // the properties below are optional
   * .bedrockDataAutomationConfiguration(BedrockDataAutomationConfigurationProperty.builder()
   * .parsingModality("parsingModality")
   * .build())
   * .bedrockFoundationModelConfiguration(BedrockFoundationModelConfigurationProperty.builder()
   * .modelArn("modelArn")
   * // the properties below are optional
   * .parsingModality("parsingModality")
   * .parsingPrompt(ParsingPromptProperty.builder()
   * .parsingPromptText("parsingPromptText")
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-vectoringestionconfiguration.html)
   */
  public interface VectorIngestionConfigurationProperty {
    /**
     * Details about how to chunk the documents in the data source.
     *
     * A *chunk* refers to an excerpt from a data source that is returned when the knowledge base
     * that it belongs to is queried.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-vectoringestionconfiguration.html#cfn-bedrock-datasource-vectoringestionconfiguration-chunkingconfiguration)
     */
    public fun chunkingConfiguration(): Any? = unwrap(this).getChunkingConfiguration()

    /**
     * The context enrichment configuration used for ingestion of the data into the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-vectoringestionconfiguration.html#cfn-bedrock-datasource-vectoringestionconfiguration-contextenrichmentconfiguration)
     */
    public fun contextEnrichmentConfiguration(): Any? =
        unwrap(this).getContextEnrichmentConfiguration()

    /**
     * A custom document transformer for parsed data source documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-vectoringestionconfiguration.html#cfn-bedrock-datasource-vectoringestionconfiguration-customtransformationconfiguration)
     */
    public fun customTransformationConfiguration(): Any? =
        unwrap(this).getCustomTransformationConfiguration()

    /**
     * Configurations for a parser to use for parsing documents in your data source.
     *
     * If you exclude this field, the default parser will be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-vectoringestionconfiguration.html#cfn-bedrock-datasource-vectoringestionconfiguration-parsingconfiguration)
     */
    public fun parsingConfiguration(): Any? = unwrap(this).getParsingConfiguration()

    /**
     * A builder for [VectorIngestionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param chunkingConfiguration Details about how to chunk the documents in the data source.
       * A *chunk* refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried.
       */
      public fun chunkingConfiguration(chunkingConfiguration: IResolvable)

      /**
       * @param chunkingConfiguration Details about how to chunk the documents in the data source.
       * A *chunk* refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried.
       */
      public fun chunkingConfiguration(chunkingConfiguration: ChunkingConfigurationProperty)

      /**
       * @param chunkingConfiguration Details about how to chunk the documents in the data source.
       * A *chunk* refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c44d549c914ff158cdb23c41be0b341d8b85e7b602c0d8c95a2f8f31bc6da3c4")
      public
          fun chunkingConfiguration(chunkingConfiguration: ChunkingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param contextEnrichmentConfiguration The context enrichment configuration used for
       * ingestion of the data into the vector store.
       */
      public fun contextEnrichmentConfiguration(contextEnrichmentConfiguration: IResolvable)

      /**
       * @param contextEnrichmentConfiguration The context enrichment configuration used for
       * ingestion of the data into the vector store.
       */
      public
          fun contextEnrichmentConfiguration(contextEnrichmentConfiguration: ContextEnrichmentConfigurationProperty)

      /**
       * @param contextEnrichmentConfiguration The context enrichment configuration used for
       * ingestion of the data into the vector store.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9583acb1cccdea5023a0b2e64fd5614a3657cb14261a639748f21e5a9a5ec1ca")
      public
          fun contextEnrichmentConfiguration(contextEnrichmentConfiguration: ContextEnrichmentConfigurationProperty.Builder.() -> Unit)

      /**
       * @param customTransformationConfiguration A custom document transformer for parsed data
       * source documents.
       */
      public fun customTransformationConfiguration(customTransformationConfiguration: IResolvable)

      /**
       * @param customTransformationConfiguration A custom document transformer for parsed data
       * source documents.
       */
      public
          fun customTransformationConfiguration(customTransformationConfiguration: CustomTransformationConfigurationProperty)

      /**
       * @param customTransformationConfiguration A custom document transformer for parsed data
       * source documents.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f974569fcef9ebf6cdff9df315f920694990fcef748fc39e4939ed9c31c309d")
      public
          fun customTransformationConfiguration(customTransformationConfiguration: CustomTransformationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param parsingConfiguration Configurations for a parser to use for parsing documents in
       * your data source.
       * If you exclude this field, the default parser will be used.
       */
      public fun parsingConfiguration(parsingConfiguration: IResolvable)

      /**
       * @param parsingConfiguration Configurations for a parser to use for parsing documents in
       * your data source.
       * If you exclude this field, the default parser will be used.
       */
      public fun parsingConfiguration(parsingConfiguration: ParsingConfigurationProperty)

      /**
       * @param parsingConfiguration Configurations for a parser to use for parsing documents in
       * your data source.
       * If you exclude this field, the default parser will be used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("992577a2f174620e35a00071c4b317dd3f21d37a965ade40f5bb4c5e912a2fab")
      public
          fun parsingConfiguration(parsingConfiguration: ParsingConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.VectorIngestionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.VectorIngestionConfigurationProperty.builder()

      /**
       * @param chunkingConfiguration Details about how to chunk the documents in the data source.
       * A *chunk* refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried.
       */
      override fun chunkingConfiguration(chunkingConfiguration: IResolvable) {
        cdkBuilder.chunkingConfiguration(chunkingConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param chunkingConfiguration Details about how to chunk the documents in the data source.
       * A *chunk* refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried.
       */
      override fun chunkingConfiguration(chunkingConfiguration: ChunkingConfigurationProperty) {
        cdkBuilder.chunkingConfiguration(chunkingConfiguration.let(ChunkingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param chunkingConfiguration Details about how to chunk the documents in the data source.
       * A *chunk* refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c44d549c914ff158cdb23c41be0b341d8b85e7b602c0d8c95a2f8f31bc6da3c4")
      override
          fun chunkingConfiguration(chunkingConfiguration: ChunkingConfigurationProperty.Builder.() -> Unit):
          Unit = chunkingConfiguration(ChunkingConfigurationProperty(chunkingConfiguration))

      /**
       * @param contextEnrichmentConfiguration The context enrichment configuration used for
       * ingestion of the data into the vector store.
       */
      override fun contextEnrichmentConfiguration(contextEnrichmentConfiguration: IResolvable) {
        cdkBuilder.contextEnrichmentConfiguration(contextEnrichmentConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param contextEnrichmentConfiguration The context enrichment configuration used for
       * ingestion of the data into the vector store.
       */
      override
          fun contextEnrichmentConfiguration(contextEnrichmentConfiguration: ContextEnrichmentConfigurationProperty) {
        cdkBuilder.contextEnrichmentConfiguration(contextEnrichmentConfiguration.let(ContextEnrichmentConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param contextEnrichmentConfiguration The context enrichment configuration used for
       * ingestion of the data into the vector store.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9583acb1cccdea5023a0b2e64fd5614a3657cb14261a639748f21e5a9a5ec1ca")
      override
          fun contextEnrichmentConfiguration(contextEnrichmentConfiguration: ContextEnrichmentConfigurationProperty.Builder.() -> Unit):
          Unit =
          contextEnrichmentConfiguration(ContextEnrichmentConfigurationProperty(contextEnrichmentConfiguration))

      /**
       * @param customTransformationConfiguration A custom document transformer for parsed data
       * source documents.
       */
      override
          fun customTransformationConfiguration(customTransformationConfiguration: IResolvable) {
        cdkBuilder.customTransformationConfiguration(customTransformationConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customTransformationConfiguration A custom document transformer for parsed data
       * source documents.
       */
      override
          fun customTransformationConfiguration(customTransformationConfiguration: CustomTransformationConfigurationProperty) {
        cdkBuilder.customTransformationConfiguration(customTransformationConfiguration.let(CustomTransformationConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param customTransformationConfiguration A custom document transformer for parsed data
       * source documents.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f974569fcef9ebf6cdff9df315f920694990fcef748fc39e4939ed9c31c309d")
      override
          fun customTransformationConfiguration(customTransformationConfiguration: CustomTransformationConfigurationProperty.Builder.() -> Unit):
          Unit =
          customTransformationConfiguration(CustomTransformationConfigurationProperty(customTransformationConfiguration))

      /**
       * @param parsingConfiguration Configurations for a parser to use for parsing documents in
       * your data source.
       * If you exclude this field, the default parser will be used.
       */
      override fun parsingConfiguration(parsingConfiguration: IResolvable) {
        cdkBuilder.parsingConfiguration(parsingConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parsingConfiguration Configurations for a parser to use for parsing documents in
       * your data source.
       * If you exclude this field, the default parser will be used.
       */
      override fun parsingConfiguration(parsingConfiguration: ParsingConfigurationProperty) {
        cdkBuilder.parsingConfiguration(parsingConfiguration.let(ParsingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param parsingConfiguration Configurations for a parser to use for parsing documents in
       * your data source.
       * If you exclude this field, the default parser will be used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("992577a2f174620e35a00071c4b317dd3f21d37a965ade40f5bb4c5e912a2fab")
      override
          fun parsingConfiguration(parsingConfiguration: ParsingConfigurationProperty.Builder.() -> Unit):
          Unit = parsingConfiguration(ParsingConfigurationProperty(parsingConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.VectorIngestionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.VectorIngestionConfigurationProperty,
    ) : CdkObject(cdkObject),
        VectorIngestionConfigurationProperty {
      /**
       * Details about how to chunk the documents in the data source.
       *
       * A *chunk* refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-vectoringestionconfiguration.html#cfn-bedrock-datasource-vectoringestionconfiguration-chunkingconfiguration)
       */
      override fun chunkingConfiguration(): Any? = unwrap(this).getChunkingConfiguration()

      /**
       * The context enrichment configuration used for ingestion of the data into the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-vectoringestionconfiguration.html#cfn-bedrock-datasource-vectoringestionconfiguration-contextenrichmentconfiguration)
       */
      override fun contextEnrichmentConfiguration(): Any? =
          unwrap(this).getContextEnrichmentConfiguration()

      /**
       * A custom document transformer for parsed data source documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-vectoringestionconfiguration.html#cfn-bedrock-datasource-vectoringestionconfiguration-customtransformationconfiguration)
       */
      override fun customTransformationConfiguration(): Any? =
          unwrap(this).getCustomTransformationConfiguration()

      /**
       * Configurations for a parser to use for parsing documents in your data source.
       *
       * If you exclude this field, the default parser will be used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-vectoringestionconfiguration.html#cfn-bedrock-datasource-vectoringestionconfiguration-parsingconfiguration)
       */
      override fun parsingConfiguration(): Any? = unwrap(this).getParsingConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VectorIngestionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.VectorIngestionConfigurationProperty):
          VectorIngestionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VectorIngestionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VectorIngestionConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.VectorIngestionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.VectorIngestionConfigurationProperty
    }
  }

  /**
   * The configuration of web URLs that you want to crawl.
   *
   * You should be authorized to crawl the URLs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * WebCrawlerConfigurationProperty webCrawlerConfigurationProperty =
   * WebCrawlerConfigurationProperty.builder()
   * .crawlerLimits(WebCrawlerLimitsProperty.builder()
   * .maxPages(123)
   * .rateLimit(123)
   * .build())
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .scope("scope")
   * .userAgent("userAgent")
   * .userAgentHeader("userAgentHeader")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerconfiguration.html)
   */
  public interface WebCrawlerConfigurationProperty {
    /**
     * The configuration of crawl limits for the web URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerconfiguration.html#cfn-bedrock-datasource-webcrawlerconfiguration-crawlerlimits)
     */
    public fun crawlerLimits(): Any? = unwrap(this).getCrawlerLimits()

    /**
     * A list of one or more exclusion regular expression patterns to exclude certain URLs.
     *
     * If you specify an inclusion and exclusion filter/pattern and both match a URL, the exclusion
     * filter takes precedence and the web content of the URL isn’t crawled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerconfiguration.html#cfn-bedrock-datasource-webcrawlerconfiguration-exclusionfilters)
     */
    public fun exclusionFilters(): List<String> = unwrap(this).getExclusionFilters() ?: emptyList()

    /**
     * A list of one or more inclusion regular expression patterns to include certain URLs.
     *
     * If you specify an inclusion and exclusion filter/pattern and both match a URL, the exclusion
     * filter takes precedence and the web content of the URL isn’t crawled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerconfiguration.html#cfn-bedrock-datasource-webcrawlerconfiguration-inclusionfilters)
     */
    public fun inclusionFilters(): List<String> = unwrap(this).getInclusionFilters() ?: emptyList()

    /**
     * The scope of what is crawled for your URLs.
     *
     * You can choose to crawl only web pages that belong to the same host or primary domain. For
     * example, only web pages that contain the seed URL
     * "https://docs.aws.amazon.com/bedrock/latest/userguide/" and no other domains. You can choose to
     * include sub domains in addition to the host or primary domain. For example, web pages that
     * contain "aws.amazon.com" can also include sub domain "docs.aws.amazon.com".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerconfiguration.html#cfn-bedrock-datasource-webcrawlerconfiguration-scope)
     */
    public fun scope(): String? = unwrap(this).getScope()

    /**
     * Returns the user agent suffix for your web crawler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerconfiguration.html#cfn-bedrock-datasource-webcrawlerconfiguration-useragent)
     */
    public fun userAgent(): String? = unwrap(this).getUserAgent()

    /**
     * A string used for identifying the crawler or bot when it accesses a web server.
     *
     * The user agent header value consists of the `bedrockbot` , UUID, and a user agent suffix for
     * your crawler (if one is provided). By default, it is set to `bedrockbot_UUID` . You can
     * optionally append a custom suffix to `bedrockbot_UUID` to allowlist a specific user agent
     * permitted to access your source URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerconfiguration.html#cfn-bedrock-datasource-webcrawlerconfiguration-useragentheader)
     */
    public fun userAgentHeader(): String? = unwrap(this).getUserAgentHeader()

    /**
     * A builder for [WebCrawlerConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crawlerLimits The configuration of crawl limits for the web URLs.
       */
      public fun crawlerLimits(crawlerLimits: IResolvable)

      /**
       * @param crawlerLimits The configuration of crawl limits for the web URLs.
       */
      public fun crawlerLimits(crawlerLimits: WebCrawlerLimitsProperty)

      /**
       * @param crawlerLimits The configuration of crawl limits for the web URLs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d2a1be4f11e9816ddf857db222b630b3e8055db7c0241bcba0b9daca03d34ea")
      public fun crawlerLimits(crawlerLimits: WebCrawlerLimitsProperty.Builder.() -> Unit)

      /**
       * @param exclusionFilters A list of one or more exclusion regular expression patterns to
       * exclude certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      public fun exclusionFilters(exclusionFilters: List<String>)

      /**
       * @param exclusionFilters A list of one or more exclusion regular expression patterns to
       * exclude certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      public fun exclusionFilters(vararg exclusionFilters: String)

      /**
       * @param inclusionFilters A list of one or more inclusion regular expression patterns to
       * include certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      public fun inclusionFilters(inclusionFilters: List<String>)

      /**
       * @param inclusionFilters A list of one or more inclusion regular expression patterns to
       * include certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      public fun inclusionFilters(vararg inclusionFilters: String)

      /**
       * @param scope The scope of what is crawled for your URLs.
       * You can choose to crawl only web pages that belong to the same host or primary domain. For
       * example, only web pages that contain the seed URL
       * "https://docs.aws.amazon.com/bedrock/latest/userguide/" and no other domains. You can choose
       * to include sub domains in addition to the host or primary domain. For example, web pages that
       * contain "aws.amazon.com" can also include sub domain "docs.aws.amazon.com".
       */
      public fun scope(scope: String)

      /**
       * @param userAgent Returns the user agent suffix for your web crawler.
       */
      public fun userAgent(userAgent: String)

      /**
       * @param userAgentHeader A string used for identifying the crawler or bot when it accesses a
       * web server.
       * The user agent header value consists of the `bedrockbot` , UUID, and a user agent suffix
       * for your crawler (if one is provided). By default, it is set to `bedrockbot_UUID` . You can
       * optionally append a custom suffix to `bedrockbot_UUID` to allowlist a specific user agent
       * permitted to access your source URLs.
       */
      public fun userAgentHeader(userAgentHeader: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebCrawlerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebCrawlerConfigurationProperty.builder()

      /**
       * @param crawlerLimits The configuration of crawl limits for the web URLs.
       */
      override fun crawlerLimits(crawlerLimits: IResolvable) {
        cdkBuilder.crawlerLimits(crawlerLimits.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param crawlerLimits The configuration of crawl limits for the web URLs.
       */
      override fun crawlerLimits(crawlerLimits: WebCrawlerLimitsProperty) {
        cdkBuilder.crawlerLimits(crawlerLimits.let(WebCrawlerLimitsProperty.Companion::unwrap))
      }

      /**
       * @param crawlerLimits The configuration of crawl limits for the web URLs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d2a1be4f11e9816ddf857db222b630b3e8055db7c0241bcba0b9daca03d34ea")
      override fun crawlerLimits(crawlerLimits: WebCrawlerLimitsProperty.Builder.() -> Unit): Unit =
          crawlerLimits(WebCrawlerLimitsProperty(crawlerLimits))

      /**
       * @param exclusionFilters A list of one or more exclusion regular expression patterns to
       * exclude certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      override fun exclusionFilters(exclusionFilters: List<String>) {
        cdkBuilder.exclusionFilters(exclusionFilters)
      }

      /**
       * @param exclusionFilters A list of one or more exclusion regular expression patterns to
       * exclude certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      override fun exclusionFilters(vararg exclusionFilters: String): Unit =
          exclusionFilters(exclusionFilters.toList())

      /**
       * @param inclusionFilters A list of one or more inclusion regular expression patterns to
       * include certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      override fun inclusionFilters(inclusionFilters: List<String>) {
        cdkBuilder.inclusionFilters(inclusionFilters)
      }

      /**
       * @param inclusionFilters A list of one or more inclusion regular expression patterns to
       * include certain URLs.
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       */
      override fun inclusionFilters(vararg inclusionFilters: String): Unit =
          inclusionFilters(inclusionFilters.toList())

      /**
       * @param scope The scope of what is crawled for your URLs.
       * You can choose to crawl only web pages that belong to the same host or primary domain. For
       * example, only web pages that contain the seed URL
       * "https://docs.aws.amazon.com/bedrock/latest/userguide/" and no other domains. You can choose
       * to include sub domains in addition to the host or primary domain. For example, web pages that
       * contain "aws.amazon.com" can also include sub domain "docs.aws.amazon.com".
       */
      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      /**
       * @param userAgent Returns the user agent suffix for your web crawler.
       */
      override fun userAgent(userAgent: String) {
        cdkBuilder.userAgent(userAgent)
      }

      /**
       * @param userAgentHeader A string used for identifying the crawler or bot when it accesses a
       * web server.
       * The user agent header value consists of the `bedrockbot` , UUID, and a user agent suffix
       * for your crawler (if one is provided). By default, it is set to `bedrockbot_UUID` . You can
       * optionally append a custom suffix to `bedrockbot_UUID` to allowlist a specific user agent
       * permitted to access your source URLs.
       */
      override fun userAgentHeader(userAgentHeader: String) {
        cdkBuilder.userAgentHeader(userAgentHeader)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebCrawlerConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.WebCrawlerConfigurationProperty,
    ) : CdkObject(cdkObject),
        WebCrawlerConfigurationProperty {
      /**
       * The configuration of crawl limits for the web URLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerconfiguration.html#cfn-bedrock-datasource-webcrawlerconfiguration-crawlerlimits)
       */
      override fun crawlerLimits(): Any? = unwrap(this).getCrawlerLimits()

      /**
       * A list of one or more exclusion regular expression patterns to exclude certain URLs.
       *
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerconfiguration.html#cfn-bedrock-datasource-webcrawlerconfiguration-exclusionfilters)
       */
      override fun exclusionFilters(): List<String> = unwrap(this).getExclusionFilters() ?:
          emptyList()

      /**
       * A list of one or more inclusion regular expression patterns to include certain URLs.
       *
       * If you specify an inclusion and exclusion filter/pattern and both match a URL, the
       * exclusion filter takes precedence and the web content of the URL isn’t crawled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerconfiguration.html#cfn-bedrock-datasource-webcrawlerconfiguration-inclusionfilters)
       */
      override fun inclusionFilters(): List<String> = unwrap(this).getInclusionFilters() ?:
          emptyList()

      /**
       * The scope of what is crawled for your URLs.
       *
       * You can choose to crawl only web pages that belong to the same host or primary domain. For
       * example, only web pages that contain the seed URL
       * "https://docs.aws.amazon.com/bedrock/latest/userguide/" and no other domains. You can choose
       * to include sub domains in addition to the host or primary domain. For example, web pages that
       * contain "aws.amazon.com" can also include sub domain "docs.aws.amazon.com".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerconfiguration.html#cfn-bedrock-datasource-webcrawlerconfiguration-scope)
       */
      override fun scope(): String? = unwrap(this).getScope()

      /**
       * Returns the user agent suffix for your web crawler.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerconfiguration.html#cfn-bedrock-datasource-webcrawlerconfiguration-useragent)
       */
      override fun userAgent(): String? = unwrap(this).getUserAgent()

      /**
       * A string used for identifying the crawler or bot when it accesses a web server.
       *
       * The user agent header value consists of the `bedrockbot` , UUID, and a user agent suffix
       * for your crawler (if one is provided). By default, it is set to `bedrockbot_UUID` . You can
       * optionally append a custom suffix to `bedrockbot_UUID` to allowlist a specific user agent
       * permitted to access your source URLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerconfiguration.html#cfn-bedrock-datasource-webcrawlerconfiguration-useragentheader)
       */
      override fun userAgentHeader(): String? = unwrap(this).getUserAgentHeader()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WebCrawlerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.WebCrawlerConfigurationProperty):
          WebCrawlerConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WebCrawlerConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebCrawlerConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebCrawlerConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebCrawlerConfigurationProperty
    }
  }

  /**
   * The rate limits for the URLs that you want to crawl.
   *
   * You should be authorized to crawl the URLs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * WebCrawlerLimitsProperty webCrawlerLimitsProperty = WebCrawlerLimitsProperty.builder()
   * .maxPages(123)
   * .rateLimit(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerlimits.html)
   */
  public interface WebCrawlerLimitsProperty {
    /**
     * The max number of web pages crawled from your source URLs, up to 25,000 pages.
     *
     * If the web pages exceed this limit, the data source sync will fail and no web pages will be
     * ingested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerlimits.html#cfn-bedrock-datasource-webcrawlerlimits-maxpages)
     */
    public fun maxPages(): Number? = unwrap(this).getMaxPages()

    /**
     * The max rate at which pages are crawled, up to 300 per minute per host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerlimits.html#cfn-bedrock-datasource-webcrawlerlimits-ratelimit)
     */
    public fun rateLimit(): Number? = unwrap(this).getRateLimit()

    /**
     * A builder for [WebCrawlerLimitsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxPages The max number of web pages crawled from your source URLs, up to 25,000
       * pages.
       * If the web pages exceed this limit, the data source sync will fail and no web pages will be
       * ingested.
       */
      public fun maxPages(maxPages: Number)

      /**
       * @param rateLimit The max rate at which pages are crawled, up to 300 per minute per host.
       */
      public fun rateLimit(rateLimit: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebCrawlerLimitsProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebCrawlerLimitsProperty.builder()

      /**
       * @param maxPages The max number of web pages crawled from your source URLs, up to 25,000
       * pages.
       * If the web pages exceed this limit, the data source sync will fail and no web pages will be
       * ingested.
       */
      override fun maxPages(maxPages: Number) {
        cdkBuilder.maxPages(maxPages)
      }

      /**
       * @param rateLimit The max rate at which pages are crawled, up to 300 per minute per host.
       */
      override fun rateLimit(rateLimit: Number) {
        cdkBuilder.rateLimit(rateLimit)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebCrawlerLimitsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.WebCrawlerLimitsProperty,
    ) : CdkObject(cdkObject),
        WebCrawlerLimitsProperty {
      /**
       * The max number of web pages crawled from your source URLs, up to 25,000 pages.
       *
       * If the web pages exceed this limit, the data source sync will fail and no web pages will be
       * ingested.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerlimits.html#cfn-bedrock-datasource-webcrawlerlimits-maxpages)
       */
      override fun maxPages(): Number? = unwrap(this).getMaxPages()

      /**
       * The max rate at which pages are crawled, up to 300 per minute per host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webcrawlerlimits.html#cfn-bedrock-datasource-webcrawlerlimits-ratelimit)
       */
      override fun rateLimit(): Number? = unwrap(this).getRateLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WebCrawlerLimitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.WebCrawlerLimitsProperty):
          WebCrawlerLimitsProperty = CdkObjectWrappers.wrap(cdkObject) as? WebCrawlerLimitsProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebCrawlerLimitsProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebCrawlerLimitsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebCrawlerLimitsProperty
    }
  }

  /**
   * The configuration details for the web data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * WebDataSourceConfigurationProperty webDataSourceConfigurationProperty =
   * WebDataSourceConfigurationProperty.builder()
   * .sourceConfiguration(WebSourceConfigurationProperty.builder()
   * .urlConfiguration(UrlConfigurationProperty.builder()
   * .seedUrls(List.of(SeedUrlProperty.builder()
   * .url("url")
   * .build()))
   * .build())
   * .build())
   * // the properties below are optional
   * .crawlerConfiguration(WebCrawlerConfigurationProperty.builder()
   * .crawlerLimits(WebCrawlerLimitsProperty.builder()
   * .maxPages(123)
   * .rateLimit(123)
   * .build())
   * .exclusionFilters(List.of("exclusionFilters"))
   * .inclusionFilters(List.of("inclusionFilters"))
   * .scope("scope")
   * .userAgent("userAgent")
   * .userAgentHeader("userAgentHeader")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webdatasourceconfiguration.html)
   */
  public interface WebDataSourceConfigurationProperty {
    /**
     * The Web Crawler configuration details for the web data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webdatasourceconfiguration.html#cfn-bedrock-datasource-webdatasourceconfiguration-crawlerconfiguration)
     */
    public fun crawlerConfiguration(): Any? = unwrap(this).getCrawlerConfiguration()

    /**
     * The source configuration details for the web data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webdatasourceconfiguration.html#cfn-bedrock-datasource-webdatasourceconfiguration-sourceconfiguration)
     */
    public fun sourceConfiguration(): Any

    /**
     * A builder for [WebDataSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crawlerConfiguration The Web Crawler configuration details for the web data source.
       */
      public fun crawlerConfiguration(crawlerConfiguration: IResolvable)

      /**
       * @param crawlerConfiguration The Web Crawler configuration details for the web data source.
       */
      public fun crawlerConfiguration(crawlerConfiguration: WebCrawlerConfigurationProperty)

      /**
       * @param crawlerConfiguration The Web Crawler configuration details for the web data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcbcc73bb855ef883a68733a4be82abfe154a430e4d9410047e6e14300870117")
      public
          fun crawlerConfiguration(crawlerConfiguration: WebCrawlerConfigurationProperty.Builder.() -> Unit)

      /**
       * @param sourceConfiguration The source configuration details for the web data source. 
       */
      public fun sourceConfiguration(sourceConfiguration: IResolvable)

      /**
       * @param sourceConfiguration The source configuration details for the web data source. 
       */
      public fun sourceConfiguration(sourceConfiguration: WebSourceConfigurationProperty)

      /**
       * @param sourceConfiguration The source configuration details for the web data source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("201ad0724113c8482ffb6d21bf45cd3523b1d5f6683baf1ffc5763898dd28605")
      public
          fun sourceConfiguration(sourceConfiguration: WebSourceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebDataSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebDataSourceConfigurationProperty.builder()

      /**
       * @param crawlerConfiguration The Web Crawler configuration details for the web data source.
       */
      override fun crawlerConfiguration(crawlerConfiguration: IResolvable) {
        cdkBuilder.crawlerConfiguration(crawlerConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param crawlerConfiguration The Web Crawler configuration details for the web data source.
       */
      override fun crawlerConfiguration(crawlerConfiguration: WebCrawlerConfigurationProperty) {
        cdkBuilder.crawlerConfiguration(crawlerConfiguration.let(WebCrawlerConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param crawlerConfiguration The Web Crawler configuration details for the web data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcbcc73bb855ef883a68733a4be82abfe154a430e4d9410047e6e14300870117")
      override
          fun crawlerConfiguration(crawlerConfiguration: WebCrawlerConfigurationProperty.Builder.() -> Unit):
          Unit = crawlerConfiguration(WebCrawlerConfigurationProperty(crawlerConfiguration))

      /**
       * @param sourceConfiguration The source configuration details for the web data source. 
       */
      override fun sourceConfiguration(sourceConfiguration: IResolvable) {
        cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourceConfiguration The source configuration details for the web data source. 
       */
      override fun sourceConfiguration(sourceConfiguration: WebSourceConfigurationProperty) {
        cdkBuilder.sourceConfiguration(sourceConfiguration.let(WebSourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param sourceConfiguration The source configuration details for the web data source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("201ad0724113c8482ffb6d21bf45cd3523b1d5f6683baf1ffc5763898dd28605")
      override
          fun sourceConfiguration(sourceConfiguration: WebSourceConfigurationProperty.Builder.() -> Unit):
          Unit = sourceConfiguration(WebSourceConfigurationProperty(sourceConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebDataSourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.WebDataSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        WebDataSourceConfigurationProperty {
      /**
       * The Web Crawler configuration details for the web data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webdatasourceconfiguration.html#cfn-bedrock-datasource-webdatasourceconfiguration-crawlerconfiguration)
       */
      override fun crawlerConfiguration(): Any? = unwrap(this).getCrawlerConfiguration()

      /**
       * The source configuration details for the web data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-webdatasourceconfiguration.html#cfn-bedrock-datasource-webdatasourceconfiguration-sourceconfiguration)
       */
      override fun sourceConfiguration(): Any = unwrap(this).getSourceConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          WebDataSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.WebDataSourceConfigurationProperty):
          WebDataSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WebDataSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebDataSourceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebDataSourceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebDataSourceConfigurationProperty
    }
  }

  /**
   * The configuration of the URL/URLs for the web content that you want to crawl.
   *
   * You should be authorized to crawl the URLs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * WebSourceConfigurationProperty webSourceConfigurationProperty =
   * WebSourceConfigurationProperty.builder()
   * .urlConfiguration(UrlConfigurationProperty.builder()
   * .seedUrls(List.of(SeedUrlProperty.builder()
   * .url("url")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-websourceconfiguration.html)
   */
  public interface WebSourceConfigurationProperty {
    /**
     * The configuration of the URL/URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-websourceconfiguration.html#cfn-bedrock-datasource-websourceconfiguration-urlconfiguration)
     */
    public fun urlConfiguration(): Any

    /**
     * A builder for [WebSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param urlConfiguration The configuration of the URL/URLs. 
       */
      public fun urlConfiguration(urlConfiguration: IResolvable)

      /**
       * @param urlConfiguration The configuration of the URL/URLs. 
       */
      public fun urlConfiguration(urlConfiguration: UrlConfigurationProperty)

      /**
       * @param urlConfiguration The configuration of the URL/URLs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d62e120ddb78ea1aad3e70dc5195695bde068001b4a43fba4f4f3c218c538689")
      public fun urlConfiguration(urlConfiguration: UrlConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebSourceConfigurationProperty.builder()

      /**
       * @param urlConfiguration The configuration of the URL/URLs. 
       */
      override fun urlConfiguration(urlConfiguration: IResolvable) {
        cdkBuilder.urlConfiguration(urlConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param urlConfiguration The configuration of the URL/URLs. 
       */
      override fun urlConfiguration(urlConfiguration: UrlConfigurationProperty) {
        cdkBuilder.urlConfiguration(urlConfiguration.let(UrlConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param urlConfiguration The configuration of the URL/URLs. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d62e120ddb78ea1aad3e70dc5195695bde068001b4a43fba4f4f3c218c538689")
      override fun urlConfiguration(urlConfiguration: UrlConfigurationProperty.Builder.() -> Unit):
          Unit = urlConfiguration(UrlConfigurationProperty(urlConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebSourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.WebSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        WebSourceConfigurationProperty {
      /**
       * The configuration of the URL/URLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-websourceconfiguration.html#cfn-bedrock-datasource-websourceconfiguration-urlconfiguration)
       */
      override fun urlConfiguration(): Any = unwrap(this).getUrlConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WebSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.WebSourceConfigurationProperty):
          WebSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WebSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebSourceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebSourceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnDataSource.WebSourceConfigurationProperty
    }
  }
}
