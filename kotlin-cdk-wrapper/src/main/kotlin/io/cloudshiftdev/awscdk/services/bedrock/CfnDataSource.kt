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
 * Specifies a data source as a resource in a top-level template. Minimally, you must specify the
 * following properties:.
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
 * .s3Configuration(S3DataSourceConfigurationProperty.builder()
 * .bucketArn("bucketArn")
 * // the properties below are optional
 * .bucketOwnerAccountId("bucketOwnerAccountId")
 * .inclusionPrefixes(List.of("inclusionPrefixes"))
 * .build())
 * .type("type")
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
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html)
 */
public open class CfnDataSource(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource,
) : CfnResource(cdkObject), IInspectable {
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
   * The data deletion policy for a data source.
   */
  public open fun dataDeletionPolicy(): String? = unwrap(this).getDataDeletionPolicy()

  /**
   * The data deletion policy for a data source.
   */
  public open fun dataDeletionPolicy(`value`: String) {
    unwrap(this).setDataDeletionPolicy(`value`)
  }

  /**
   * Contains details about how the data source is stored.
   */
  public open fun dataSourceConfiguration(): Any = unwrap(this).getDataSourceConfiguration()

  /**
   * Contains details about how the data source is stored.
   */
  public open fun dataSourceConfiguration(`value`: IResolvable) {
    unwrap(this).setDataSourceConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details about how the data source is stored.
   */
  public open fun dataSourceConfiguration(`value`: DataSourceConfigurationProperty) {
    unwrap(this).setDataSourceConfiguration(`value`.let(DataSourceConfigurationProperty.Companion::unwrap))
  }

  /**
   * Contains details about how the data source is stored.
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
     * The data deletion policy for a data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datadeletionpolicy)
     * @param dataDeletionPolicy The data deletion policy for a data source. 
     */
    public fun dataDeletionPolicy(dataDeletionPolicy: String)

    /**
     * Contains details about how the data source is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datasourceconfiguration)
     * @param dataSourceConfiguration Contains details about how the data source is stored. 
     */
    public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable)

    /**
     * Contains details about how the data source is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datasourceconfiguration)
     * @param dataSourceConfiguration Contains details about how the data source is stored. 
     */
    public fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty)

    /**
     * Contains details about how the data source is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datasourceconfiguration)
     * @param dataSourceConfiguration Contains details about how the data source is stored. 
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
     * The data deletion policy for a data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datadeletionpolicy)
     * @param dataDeletionPolicy The data deletion policy for a data source. 
     */
    override fun dataDeletionPolicy(dataDeletionPolicy: String) {
      cdkBuilder.dataDeletionPolicy(dataDeletionPolicy)
    }

    /**
     * Contains details about how the data source is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datasourceconfiguration)
     * @param dataSourceConfiguration Contains details about how the data source is stored. 
     */
    override fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details about how the data source is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datasourceconfiguration)
     * @param dataSourceConfiguration Contains details about how the data source is stored. 
     */
    override fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(DataSourceConfigurationProperty.Companion::unwrap))
    }

    /**
     * Contains details about how the data source is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-datasource.html#cfn-bedrock-datasource-datasourceconfiguration)
     * @param dataSourceConfiguration Contains details about how the data source is stored. 
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

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.ChunkingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.ChunkingConfigurationProperty,
    ) : CdkObject(cdkObject), ChunkingConfigurationProperty {
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
   * Contains details about how a data source is stored.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * DataSourceConfigurationProperty dataSourceConfigurationProperty =
   * DataSourceConfigurationProperty.builder()
   * .s3Configuration(S3DataSourceConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * // the properties below are optional
   * .bucketOwnerAccountId("bucketOwnerAccountId")
   * .inclusionPrefixes(List.of("inclusionPrefixes"))
   * .build())
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html)
   */
  public interface DataSourceConfigurationProperty {
    /**
     * Contains details about the configuration of the S3 object containing the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-s3configuration)
     */
    public fun s3Configuration(): Any

    /**
     * The type of storage for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-type)
     */
    public fun type(): String

    /**
     * A builder for [DataSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Configuration Contains details about the configuration of the S3 object containing
       * the data source. 
       */
      public fun s3Configuration(s3Configuration: IResolvable)

      /**
       * @param s3Configuration Contains details about the configuration of the S3 object containing
       * the data source. 
       */
      public fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty)

      /**
       * @param s3Configuration Contains details about the configuration of the S3 object containing
       * the data source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("548e7ecb02258f6ed61d218f2d1f893be2816cedb6d9f9e52cbfac7678c73a90")
      public
          fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param type The type of storage for the data source. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnDataSource.DataSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnDataSource.DataSourceConfigurationProperty.builder()

      /**
       * @param s3Configuration Contains details about the configuration of the S3 object containing
       * the data source. 
       */
      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3Configuration Contains details about the configuration of the S3 object containing
       * the data source. 
       */
      override fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DataSourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param s3Configuration Contains details about the configuration of the S3 object containing
       * the data source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("548e7ecb02258f6ed61d218f2d1f893be2816cedb6d9f9e52cbfac7678c73a90")
      override
          fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DataSourceConfigurationProperty(s3Configuration))

      /**
       * @param type The type of storage for the data source. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.DataSourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.DataSourceConfigurationProperty,
    ) : CdkObject(cdkObject), DataSourceConfigurationProperty {
      /**
       * Contains details about the configuration of the S3 object containing the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-s3configuration)
       */
      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()

      /**
       * The type of storage for the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-datasourceconfiguration.html#cfn-bedrock-datasource-datasourceconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()
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
    ) : CdkObject(cdkObject), FixedSizeChunkingConfigurationProperty {
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
   * Contains information about the S3 configuration of the data source.
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
     * The Amazon Resource Name (ARN) of the bucket that contains the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-s3datasourceconfiguration.html#cfn-bedrock-datasource-s3datasourceconfiguration-bucketarn)
     */
    public fun bucketArn(): String

    /**
     * The bucket account owner ID for the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-s3datasourceconfiguration.html#cfn-bedrock-datasource-s3datasourceconfiguration-bucketowneraccountid)
     */
    public fun bucketOwnerAccountId(): String? = unwrap(this).getBucketOwnerAccountId()

    /**
     * A list of S3 prefixes that define the object containing the data sources.
     *
     * For more information, see [Organizing objects using
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
       * @param bucketArn The Amazon Resource Name (ARN) of the bucket that contains the data
       * source. 
       */
      public fun bucketArn(bucketArn: String)

      /**
       * @param bucketOwnerAccountId The bucket account owner ID for the S3 bucket.
       */
      public fun bucketOwnerAccountId(bucketOwnerAccountId: String)

      /**
       * @param inclusionPrefixes A list of S3 prefixes that define the object containing the data
       * sources.
       * For more information, see [Organizing objects using
       * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) .
       */
      public fun inclusionPrefixes(inclusionPrefixes: List<String>)

      /**
       * @param inclusionPrefixes A list of S3 prefixes that define the object containing the data
       * sources.
       * For more information, see [Organizing objects using
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
       * @param bucketArn The Amazon Resource Name (ARN) of the bucket that contains the data
       * source. 
       */
      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      /**
       * @param bucketOwnerAccountId The bucket account owner ID for the S3 bucket.
       */
      override fun bucketOwnerAccountId(bucketOwnerAccountId: String) {
        cdkBuilder.bucketOwnerAccountId(bucketOwnerAccountId)
      }

      /**
       * @param inclusionPrefixes A list of S3 prefixes that define the object containing the data
       * sources.
       * For more information, see [Organizing objects using
       * prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html) .
       */
      override fun inclusionPrefixes(inclusionPrefixes: List<String>) {
        cdkBuilder.inclusionPrefixes(inclusionPrefixes)
      }

      /**
       * @param inclusionPrefixes A list of S3 prefixes that define the object containing the data
       * sources.
       * For more information, see [Organizing objects using
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
    ) : CdkObject(cdkObject), S3DataSourceConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the bucket that contains the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-s3datasourceconfiguration.html#cfn-bedrock-datasource-s3datasourceconfiguration-bucketarn)
       */
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      /**
       * The bucket account owner ID for the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-s3datasourceconfiguration.html#cfn-bedrock-datasource-s3datasourceconfiguration-bucketowneraccountid)
       */
      override fun bucketOwnerAccountId(): String? = unwrap(this).getBucketOwnerAccountId()

      /**
       * A list of S3 prefixes that define the object containing the data sources.
       *
       * For more information, see [Organizing objects using
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
    ) : CdkObject(cdkObject), ServerSideEncryptionConfigurationProperty {
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

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnDataSource.VectorIngestionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnDataSource.VectorIngestionConfigurationProperty,
    ) : CdkObject(cdkObject), VectorIngestionConfigurationProperty {
      /**
       * Details about how to chunk the documents in the data source.
       *
       * A *chunk* refers to an excerpt from a data source that is returned when the knowledge base
       * that it belongs to is queried.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-datasource-vectoringestionconfiguration.html#cfn-bedrock-datasource-vectoringestionconfiguration-chunkingconfiguration)
       */
      override fun chunkingConfiguration(): Any? = unwrap(this).getChunkingConfiguration()
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
}
