@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnDataSourceProps cfnDataSourceProps = CfnDataSourceProps.builder()
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
 * .rateLimit(123)
 * .build())
 * .exclusionFilters(List.of("exclusionFilters"))
 * .inclusionFilters(List.of("inclusionFilters"))
 * .scope("scope")
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
 * .bedrockFoundationModelConfiguration(BedrockFoundationModelConfigurationProperty.builder()
 * .modelArn("modelArn")
 * // the properties below are optional
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
public interface CfnDataSourceProps {
  /**
   * The data deletion policy for the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datadeletionpolicy)
   */
  public fun dataDeletionPolicy(): String? = unwrap(this).getDataDeletionPolicy()

  /**
   * The connection configuration for the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datasourceconfiguration)
   */
  public fun dataSourceConfiguration(): Any

  /**
   * The description of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The unique identifier of the knowledge base to which the data source belongs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-knowledgebaseid)
   */
  public fun knowledgeBaseId(): String

  /**
   * The name of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-name)
   */
  public fun name(): String

  /**
   * Contains details about the configuration of the server-side encryption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-serversideencryptionconfiguration)
   */
  public fun serverSideEncryptionConfiguration(): Any? =
      unwrap(this).getServerSideEncryptionConfiguration()

  /**
   * Contains details about how to ingest the documents in the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-vectoringestionconfiguration)
   */
  public fun vectorIngestionConfiguration(): Any? = unwrap(this).getVectorIngestionConfiguration()

  /**
   * A builder for [CfnDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataDeletionPolicy The data deletion policy for the data source.
     */
    public fun dataDeletionPolicy(dataDeletionPolicy: String)

    /**
     * @param dataSourceConfiguration The connection configuration for the data source. 
     */
    public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable)

    /**
     * @param dataSourceConfiguration The connection configuration for the data source. 
     */
    public
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty)

    /**
     * @param dataSourceConfiguration The connection configuration for the data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a4c1c768982411da1bad8b5e946ce39b5959c643170f2361795c4a5af2844e4")
    public
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description The description of the data source.
     */
    public fun description(description: String)

    /**
     * @param knowledgeBaseId The unique identifier of the knowledge base to which the data source
     * belongs. 
     */
    public fun knowledgeBaseId(knowledgeBaseId: String)

    /**
     * @param name The name of the data source. 
     */
    public fun name(name: String)

    /**
     * @param serverSideEncryptionConfiguration Contains details about the configuration of the
     * server-side encryption.
     */
    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

    /**
     * @param serverSideEncryptionConfiguration Contains details about the configuration of the
     * server-side encryption.
     */
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnDataSource.ServerSideEncryptionConfigurationProperty)

    /**
     * @param serverSideEncryptionConfiguration Contains details about the configuration of the
     * server-side encryption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5428395513537e9795b737c8e0faed6130654ce7a5870c3b4febe5afd49a9c5c")
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnDataSource.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in the
     * data source.
     */
    public fun vectorIngestionConfiguration(vectorIngestionConfiguration: IResolvable)

    /**
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in the
     * data source.
     */
    public
        fun vectorIngestionConfiguration(vectorIngestionConfiguration: CfnDataSource.VectorIngestionConfigurationProperty)

    /**
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in the
     * data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3b17843fd7fdda02a94c52ecc146d02221a04e7cc25c64ce4d243579b2073f1")
    public
        fun vectorIngestionConfiguration(vectorIngestionConfiguration: CfnDataSource.VectorIngestionConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnDataSourceProps.Builder =
        software.amazon.awscdk.services.bedrock.CfnDataSourceProps.builder()

    /**
     * @param dataDeletionPolicy The data deletion policy for the data source.
     */
    override fun dataDeletionPolicy(dataDeletionPolicy: String) {
      cdkBuilder.dataDeletionPolicy(dataDeletionPolicy)
    }

    /**
     * @param dataSourceConfiguration The connection configuration for the data source. 
     */
    override fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataSourceConfiguration The connection configuration for the data source. 
     */
    override
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(CfnDataSource.DataSourceConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param dataSourceConfiguration The connection configuration for the data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a4c1c768982411da1bad8b5e946ce39b5959c643170f2361795c4a5af2844e4")
    override
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        dataSourceConfiguration(CfnDataSource.DataSourceConfigurationProperty(dataSourceConfiguration))

    /**
     * @param description The description of the data source.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param knowledgeBaseId The unique identifier of the knowledge base to which the data source
     * belongs. 
     */
    override fun knowledgeBaseId(knowledgeBaseId: String) {
      cdkBuilder.knowledgeBaseId(knowledgeBaseId)
    }

    /**
     * @param name The name of the data source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param serverSideEncryptionConfiguration Contains details about the configuration of the
     * server-side encryption.
     */
    override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param serverSideEncryptionConfiguration Contains details about the configuration of the
     * server-side encryption.
     */
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnDataSource.ServerSideEncryptionConfigurationProperty) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(CfnDataSource.ServerSideEncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param serverSideEncryptionConfiguration Contains details about the configuration of the
     * server-side encryption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5428395513537e9795b737c8e0faed6130654ce7a5870c3b4febe5afd49a9c5c")
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnDataSource.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverSideEncryptionConfiguration(CfnDataSource.ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration))

    /**
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in the
     * data source.
     */
    override fun vectorIngestionConfiguration(vectorIngestionConfiguration: IResolvable) {
      cdkBuilder.vectorIngestionConfiguration(vectorIngestionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in the
     * data source.
     */
    override
        fun vectorIngestionConfiguration(vectorIngestionConfiguration: CfnDataSource.VectorIngestionConfigurationProperty) {
      cdkBuilder.vectorIngestionConfiguration(vectorIngestionConfiguration.let(CfnDataSource.VectorIngestionConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param vectorIngestionConfiguration Contains details about how to ingest the documents in the
     * data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3b17843fd7fdda02a94c52ecc146d02221a04e7cc25c64ce4d243579b2073f1")
    override
        fun vectorIngestionConfiguration(vectorIngestionConfiguration: CfnDataSource.VectorIngestionConfigurationProperty.Builder.() -> Unit):
        Unit =
        vectorIngestionConfiguration(CfnDataSource.VectorIngestionConfigurationProperty(vectorIngestionConfiguration))

    public fun build(): software.amazon.awscdk.services.bedrock.CfnDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSourceProps,
  ) : CdkObject(cdkObject),
      CfnDataSourceProps {
    /**
     * The data deletion policy for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datadeletionpolicy)
     */
    override fun dataDeletionPolicy(): String? = unwrap(this).getDataDeletionPolicy()

    /**
     * The connection configuration for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datasourceconfiguration)
     */
    override fun dataSourceConfiguration(): Any = unwrap(this).getDataSourceConfiguration()

    /**
     * The description of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The unique identifier of the knowledge base to which the data source belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-knowledgebaseid)
     */
    override fun knowledgeBaseId(): String = unwrap(this).getKnowledgeBaseId()

    /**
     * The name of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Contains details about the configuration of the server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-serversideencryptionconfiguration)
     */
    override fun serverSideEncryptionConfiguration(): Any? =
        unwrap(this).getServerSideEncryptionConfiguration()

    /**
     * Contains details about how to ingest the documents in the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-vectoringestionconfiguration)
     */
    override fun vectorIngestionConfiguration(): Any? =
        unwrap(this).getVectorIngestionConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSourceProps):
        CfnDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDataSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataSourceProps):
        software.amazon.awscdk.services.bedrock.CfnDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.bedrock.CfnDataSourceProps
  }
}
