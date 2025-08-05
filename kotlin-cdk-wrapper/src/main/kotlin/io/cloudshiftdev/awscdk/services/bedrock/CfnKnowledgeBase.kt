@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a knowledge base as a resource in a top-level template. Minimally, you must specify the
 * following properties:.
 *
 * * Name – Specify a name for the knowledge base.
 * * RoleArn – Specify the Amazon Resource Name (ARN) of the IAM role with permissions to invoke API
 * operations on the knowledge base. For more information, see [Create a service role for Knowledge
 * base for Amazon Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/kb-permissions.html) .
 * * KnowledgeBaseConfiguration – Specify the embeddings configuration of the knowledge base. The
 * following sub-properties are required:
 * * Type – Specify the value `VECTOR` .
 * * StorageConfiguration – Specify information about the vector store in which the data source is
 * stored. The following sub-properties are required:
 * * Type – Specify the vector store service that you are using.
 *
 *
 * Redis Enterprise Cloud vector stores are currently unsupported in AWS CloudFormation .
 *
 *
 * For more information about using knowledge bases in Amazon Bedrock , see [Knowledge base for
 * Amazon Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base.html) .
 *
 * See the *Properties* section below for descriptions of both the required and optional properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnKnowledgeBase cfnKnowledgeBase = CfnKnowledgeBase.Builder.create(this, "MyCfnKnowledgeBase")
 * .knowledgeBaseConfiguration(KnowledgeBaseConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .kendraKnowledgeBaseConfiguration(KendraKnowledgeBaseConfigurationProperty.builder()
 * .kendraIndexArn("kendraIndexArn")
 * .build())
 * .sqlKnowledgeBaseConfiguration(SqlKnowledgeBaseConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .redshiftConfiguration(RedshiftConfigurationProperty.builder()
 * .queryEngineConfiguration(RedshiftQueryEngineConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .provisionedConfiguration(RedshiftProvisionedConfigurationProperty.builder()
 * .authConfiguration(RedshiftProvisionedAuthConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .databaseUser("databaseUser")
 * .usernamePasswordSecretArn("usernamePasswordSecretArn")
 * .build())
 * .clusterIdentifier("clusterIdentifier")
 * .build())
 * .serverlessConfiguration(RedshiftServerlessConfigurationProperty.builder()
 * .authConfiguration(RedshiftServerlessAuthConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .usernamePasswordSecretArn("usernamePasswordSecretArn")
 * .build())
 * .workgroupArn("workgroupArn")
 * .build())
 * .build())
 * .storageConfigurations(List.of(RedshiftQueryEngineStorageConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .awsDataCatalogConfiguration(RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty.builder()
 * .tableNames(List.of("tableNames"))
 * .build())
 * .redshiftConfiguration(RedshiftQueryEngineRedshiftStorageConfigurationProperty.builder()
 * .databaseName("databaseName")
 * .build())
 * .build()))
 * // the properties below are optional
 * .queryGenerationConfiguration(QueryGenerationConfigurationProperty.builder()
 * .executionTimeoutSeconds(123)
 * .generationContext(QueryGenerationContextProperty.builder()
 * .curatedQueries(List.of(CuratedQueryProperty.builder()
 * .naturalLanguage("naturalLanguage")
 * .sql("sql")
 * .build()))
 * .tables(List.of(QueryGenerationTableProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .columns(List.of(QueryGenerationColumnProperty.builder()
 * .description("description")
 * .inclusion("inclusion")
 * .name("name")
 * .build()))
 * .description("description")
 * .inclusion("inclusion")
 * .build()))
 * .build())
 * .build())
 * .build())
 * .build())
 * .vectorKnowledgeBaseConfiguration(VectorKnowledgeBaseConfigurationProperty.builder()
 * .embeddingModelArn("embeddingModelArn")
 * // the properties below are optional
 * .embeddingModelConfiguration(EmbeddingModelConfigurationProperty.builder()
 * .bedrockEmbeddingModelConfiguration(BedrockEmbeddingModelConfigurationProperty.builder()
 * .dimensions(123)
 * .embeddingDataType("embeddingDataType")
 * .build())
 * .build())
 * .supplementalDataStorageConfiguration(SupplementalDataStorageConfigurationProperty.builder()
 * .supplementalDataStorageLocations(List.of(SupplementalDataStorageLocationProperty.builder()
 * .supplementalDataStorageLocationType("supplementalDataStorageLocationType")
 * // the properties below are optional
 * .s3Location(S3LocationProperty.builder()
 * .uri("uri")
 * .build())
 * .build()))
 * .build())
 * .build())
 * .build())
 * .name("name")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .description("description")
 * .storageConfiguration(StorageConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .mongoDbAtlasConfiguration(MongoDbAtlasConfigurationProperty.builder()
 * .collectionName("collectionName")
 * .credentialsSecretArn("credentialsSecretArn")
 * .databaseName("databaseName")
 * .endpoint("endpoint")
 * .fieldMapping(MongoDbAtlasFieldMappingProperty.builder()
 * .metadataField("metadataField")
 * .textField("textField")
 * .vectorField("vectorField")
 * .build())
 * .vectorIndexName("vectorIndexName")
 * // the properties below are optional
 * .endpointServiceName("endpointServiceName")
 * .textIndexName("textIndexName")
 * .build())
 * .neptuneAnalyticsConfiguration(NeptuneAnalyticsConfigurationProperty.builder()
 * .fieldMapping(NeptuneAnalyticsFieldMappingProperty.builder()
 * .metadataField("metadataField")
 * .textField("textField")
 * .build())
 * .graphArn("graphArn")
 * .build())
 * .opensearchManagedClusterConfiguration(OpenSearchManagedClusterConfigurationProperty.builder()
 * .domainArn("domainArn")
 * .domainEndpoint("domainEndpoint")
 * .fieldMapping(OpenSearchManagedClusterFieldMappingProperty.builder()
 * .metadataField("metadataField")
 * .textField("textField")
 * .vectorField("vectorField")
 * .build())
 * .vectorIndexName("vectorIndexName")
 * .build())
 * .opensearchServerlessConfiguration(OpenSearchServerlessConfigurationProperty.builder()
 * .collectionArn("collectionArn")
 * .fieldMapping(OpenSearchServerlessFieldMappingProperty.builder()
 * .metadataField("metadataField")
 * .textField("textField")
 * .vectorField("vectorField")
 * .build())
 * .vectorIndexName("vectorIndexName")
 * .build())
 * .pineconeConfiguration(PineconeConfigurationProperty.builder()
 * .connectionString("connectionString")
 * .credentialsSecretArn("credentialsSecretArn")
 * .fieldMapping(PineconeFieldMappingProperty.builder()
 * .metadataField("metadataField")
 * .textField("textField")
 * .build())
 * // the properties below are optional
 * .namespace("namespace")
 * .build())
 * .rdsConfiguration(RdsConfigurationProperty.builder()
 * .credentialsSecretArn("credentialsSecretArn")
 * .databaseName("databaseName")
 * .fieldMapping(RdsFieldMappingProperty.builder()
 * .metadataField("metadataField")
 * .primaryKeyField("primaryKeyField")
 * .textField("textField")
 * .vectorField("vectorField")
 * // the properties below are optional
 * .customMetadataField("customMetadataField")
 * .build())
 * .resourceArn("resourceArn")
 * .tableName("tableName")
 * .build())
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html)
 */
public open class CfnKnowledgeBase(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnKnowledgeBaseProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnKnowledgeBase(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnKnowledgeBaseProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnKnowledgeBaseProps.Builder.() -> Unit,
  ) : this(scope, id, CfnKnowledgeBaseProps(props)
  )

  /**
   * The time the knowledge base was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * A list of reasons that the API operation on the knowledge base failed.
   */
  public open fun attrFailureReasons(): List<String> = unwrap(this).getAttrFailureReasons()

  /**
   * The Amazon Resource Name (ARN) of the knowledge base.
   */
  public open fun attrKnowledgeBaseArn(): String = unwrap(this).getAttrKnowledgeBaseArn()

  /**
   * The unique identifier for a knowledge base associated with the inline agent.
   */
  public open fun attrKnowledgeBaseId(): String = unwrap(this).getAttrKnowledgeBaseId()

  /**
   * The status of the knowledge base.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The time the knowledge base was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the knowledge base associated with the inline agent.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the knowledge base associated with the inline agent.
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
   * Contains details about the embeddings configuration of the knowledge base.
   */
  public open fun knowledgeBaseConfiguration(): Any = unwrap(this).getKnowledgeBaseConfiguration()

  /**
   * Contains details about the embeddings configuration of the knowledge base.
   */
  public open fun knowledgeBaseConfiguration(`value`: IResolvable) {
    unwrap(this).setKnowledgeBaseConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details about the embeddings configuration of the knowledge base.
   */
  public open fun knowledgeBaseConfiguration(`value`: KnowledgeBaseConfigurationProperty) {
    unwrap(this).setKnowledgeBaseConfiguration(`value`.let(KnowledgeBaseConfigurationProperty.Companion::unwrap))
  }

  /**
   * Contains details about the embeddings configuration of the knowledge base.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fcb8ed0b40e4bbe893862b91aa1789967d4426f915c13d4a9c1d3045cc0bd158")
  public open
      fun knowledgeBaseConfiguration(`value`: KnowledgeBaseConfigurationProperty.Builder.() -> Unit):
      Unit = knowledgeBaseConfiguration(KnowledgeBaseConfigurationProperty(`value`))

  /**
   * The name of the knowledge base.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the knowledge base.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the
   * knowledge base.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the
   * knowledge base.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Contains details about the storage configuration of the knowledge base.
   */
  public open fun storageConfiguration(): Any? = unwrap(this).getStorageConfiguration()

  /**
   * Contains details about the storage configuration of the knowledge base.
   */
  public open fun storageConfiguration(`value`: IResolvable) {
    unwrap(this).setStorageConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details about the storage configuration of the knowledge base.
   */
  public open fun storageConfiguration(`value`: StorageConfigurationProperty) {
    unwrap(this).setStorageConfiguration(`value`.let(StorageConfigurationProperty.Companion::unwrap))
  }

  /**
   * Contains details about the storage configuration of the knowledge base.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4527c78dd25dbb2dcd971fd51d54f2eb5157cadc320a92f88d2736379c0fc4ee")
  public open fun storageConfiguration(`value`: StorageConfigurationProperty.Builder.() -> Unit):
      Unit = storageConfiguration(StorageConfigurationProperty(`value`))

  /**
   * Metadata that you can assign to a resource as key-value pairs.
   *
   * For more information, see the following resources:.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Metadata that you can assign to a resource as key-value pairs.
   *
   * For more information, see the following resources:.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnKnowledgeBase].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the knowledge base associated with the inline agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-description)
     * @param description The description of the knowledge base associated with the inline agent. 
     */
    public fun description(description: String)

    /**
     * Contains details about the embeddings configuration of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration)
     * @param knowledgeBaseConfiguration Contains details about the embeddings configuration of the
     * knowledge base. 
     */
    public fun knowledgeBaseConfiguration(knowledgeBaseConfiguration: IResolvable)

    /**
     * Contains details about the embeddings configuration of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration)
     * @param knowledgeBaseConfiguration Contains details about the embeddings configuration of the
     * knowledge base. 
     */
    public
        fun knowledgeBaseConfiguration(knowledgeBaseConfiguration: KnowledgeBaseConfigurationProperty)

    /**
     * Contains details about the embeddings configuration of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration)
     * @param knowledgeBaseConfiguration Contains details about the embeddings configuration of the
     * knowledge base. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e18c0fc8e887b4409f1e5e1896da5eeecbdd5355f7dce58896e871606ba123b6")
    public
        fun knowledgeBaseConfiguration(knowledgeBaseConfiguration: KnowledgeBaseConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-name)
     * @param name The name of the knowledge base. 
     */
    public fun name(name: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on
     * the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API
     * operations on the knowledge base. 
     */
    public fun roleArn(roleArn: String)

    /**
     * Contains details about the storage configuration of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-storageconfiguration)
     * @param storageConfiguration Contains details about the storage configuration of the knowledge
     * base. 
     */
    public fun storageConfiguration(storageConfiguration: IResolvable)

    /**
     * Contains details about the storage configuration of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-storageconfiguration)
     * @param storageConfiguration Contains details about the storage configuration of the knowledge
     * base. 
     */
    public fun storageConfiguration(storageConfiguration: StorageConfigurationProperty)

    /**
     * Contains details about the storage configuration of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-storageconfiguration)
     * @param storageConfiguration Contains details about the storage configuration of the knowledge
     * base. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8b5f130ccb5166c35b1122274e227f33658a3c8ab9e144fa73149a3df603ce0")
    public
        fun storageConfiguration(storageConfiguration: StorageConfigurationProperty.Builder.() -> Unit)

    /**
     * Metadata that you can assign to a resource as key-value pairs. For more information, see the
     * following resources:.
     *
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-tags)
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.Builder =
        software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.Builder.create(scope, id)

    /**
     * The description of the knowledge base associated with the inline agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-description)
     * @param description The description of the knowledge base associated with the inline agent. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Contains details about the embeddings configuration of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration)
     * @param knowledgeBaseConfiguration Contains details about the embeddings configuration of the
     * knowledge base. 
     */
    override fun knowledgeBaseConfiguration(knowledgeBaseConfiguration: IResolvable) {
      cdkBuilder.knowledgeBaseConfiguration(knowledgeBaseConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details about the embeddings configuration of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration)
     * @param knowledgeBaseConfiguration Contains details about the embeddings configuration of the
     * knowledge base. 
     */
    override
        fun knowledgeBaseConfiguration(knowledgeBaseConfiguration: KnowledgeBaseConfigurationProperty) {
      cdkBuilder.knowledgeBaseConfiguration(knowledgeBaseConfiguration.let(KnowledgeBaseConfigurationProperty.Companion::unwrap))
    }

    /**
     * Contains details about the embeddings configuration of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration)
     * @param knowledgeBaseConfiguration Contains details about the embeddings configuration of the
     * knowledge base. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e18c0fc8e887b4409f1e5e1896da5eeecbdd5355f7dce58896e871606ba123b6")
    override
        fun knowledgeBaseConfiguration(knowledgeBaseConfiguration: KnowledgeBaseConfigurationProperty.Builder.() -> Unit):
        Unit =
        knowledgeBaseConfiguration(KnowledgeBaseConfigurationProperty(knowledgeBaseConfiguration))

    /**
     * The name of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-name)
     * @param name The name of the knowledge base. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on
     * the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API
     * operations on the knowledge base. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * Contains details about the storage configuration of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-storageconfiguration)
     * @param storageConfiguration Contains details about the storage configuration of the knowledge
     * base. 
     */
    override fun storageConfiguration(storageConfiguration: IResolvable) {
      cdkBuilder.storageConfiguration(storageConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details about the storage configuration of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-storageconfiguration)
     * @param storageConfiguration Contains details about the storage configuration of the knowledge
     * base. 
     */
    override fun storageConfiguration(storageConfiguration: StorageConfigurationProperty) {
      cdkBuilder.storageConfiguration(storageConfiguration.let(StorageConfigurationProperty.Companion::unwrap))
    }

    /**
     * Contains details about the storage configuration of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-storageconfiguration)
     * @param storageConfiguration Contains details about the storage configuration of the knowledge
     * base. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8b5f130ccb5166c35b1122274e227f33658a3c8ab9e144fa73149a3df603ce0")
    override
        fun storageConfiguration(storageConfiguration: StorageConfigurationProperty.Builder.() -> Unit):
        Unit = storageConfiguration(StorageConfigurationProperty(storageConfiguration))

    /**
     * Metadata that you can assign to a resource as key-value pairs. For more information, see the
     * following resources:.
     *
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-tags)
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnKnowledgeBase =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnKnowledgeBase {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnKnowledgeBase(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase):
        CfnKnowledgeBase = CfnKnowledgeBase(cdkObject)

    internal fun unwrap(wrapped: CfnKnowledgeBase):
        software.amazon.awscdk.services.bedrock.CfnKnowledgeBase = wrapped.cdkObject as
        software.amazon.awscdk.services.bedrock.CfnKnowledgeBase
  }

  /**
   * The vector configuration details for the Bedrock embeddings model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * BedrockEmbeddingModelConfigurationProperty bedrockEmbeddingModelConfigurationProperty =
   * BedrockEmbeddingModelConfigurationProperty.builder()
   * .dimensions(123)
   * .embeddingDataType("embeddingDataType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-bedrockembeddingmodelconfiguration.html)
   */
  public interface BedrockEmbeddingModelConfigurationProperty {
    /**
     * The dimensions details for the vector configuration used on the Bedrock embeddings model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-bedrockembeddingmodelconfiguration.html#cfn-bedrock-knowledgebase-bedrockembeddingmodelconfiguration-dimensions)
     */
    public fun dimensions(): Number? = unwrap(this).getDimensions()

    /**
     * The data type for the vectors when using a model to convert text into vector embeddings.
     *
     * The model must support the specified data type for vector embeddings. Floating-point
     * (float32) is the default data type, and is supported by most models for vector embeddings. See
     * [Supported embeddings
     * models](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-supported.html) for
     * information on the available models and their vector data types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-bedrockembeddingmodelconfiguration.html#cfn-bedrock-knowledgebase-bedrockembeddingmodelconfiguration-embeddingdatatype)
     */
    public fun embeddingDataType(): String? = unwrap(this).getEmbeddingDataType()

    /**
     * A builder for [BedrockEmbeddingModelConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensions The dimensions details for the vector configuration used on the Bedrock
       * embeddings model.
       */
      public fun dimensions(dimensions: Number)

      /**
       * @param embeddingDataType The data type for the vectors when using a model to convert text
       * into vector embeddings.
       * The model must support the specified data type for vector embeddings. Floating-point
       * (float32) is the default data type, and is supported by most models for vector embeddings. See
       * [Supported embeddings
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-supported.html)
       * for information on the available models and their vector data types.
       */
      public fun embeddingDataType(embeddingDataType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.BedrockEmbeddingModelConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.BedrockEmbeddingModelConfigurationProperty.builder()

      /**
       * @param dimensions The dimensions details for the vector configuration used on the Bedrock
       * embeddings model.
       */
      override fun dimensions(dimensions: Number) {
        cdkBuilder.dimensions(dimensions)
      }

      /**
       * @param embeddingDataType The data type for the vectors when using a model to convert text
       * into vector embeddings.
       * The model must support the specified data type for vector embeddings. Floating-point
       * (float32) is the default data type, and is supported by most models for vector embeddings. See
       * [Supported embeddings
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-supported.html)
       * for information on the available models and their vector data types.
       */
      override fun embeddingDataType(embeddingDataType: String) {
        cdkBuilder.embeddingDataType(embeddingDataType)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.BedrockEmbeddingModelConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.BedrockEmbeddingModelConfigurationProperty,
    ) : CdkObject(cdkObject),
        BedrockEmbeddingModelConfigurationProperty {
      /**
       * The dimensions details for the vector configuration used on the Bedrock embeddings model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-bedrockembeddingmodelconfiguration.html#cfn-bedrock-knowledgebase-bedrockembeddingmodelconfiguration-dimensions)
       */
      override fun dimensions(): Number? = unwrap(this).getDimensions()

      /**
       * The data type for the vectors when using a model to convert text into vector embeddings.
       *
       * The model must support the specified data type for vector embeddings. Floating-point
       * (float32) is the default data type, and is supported by most models for vector embeddings. See
       * [Supported embeddings
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-supported.html)
       * for information on the available models and their vector data types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-bedrockembeddingmodelconfiguration.html#cfn-bedrock-knowledgebase-bedrockembeddingmodelconfiguration-embeddingdatatype)
       */
      override fun embeddingDataType(): String? = unwrap(this).getEmbeddingDataType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BedrockEmbeddingModelConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.BedrockEmbeddingModelConfigurationProperty):
          BedrockEmbeddingModelConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BedrockEmbeddingModelConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BedrockEmbeddingModelConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.BedrockEmbeddingModelConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.BedrockEmbeddingModelConfigurationProperty
    }
  }

  /**
   * Contains configurations for a query, each of which defines information about example queries to
   * help the query engine generate appropriate SQL queries.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * CuratedQueryProperty curatedQueryProperty = CuratedQueryProperty.builder()
   * .naturalLanguage("naturalLanguage")
   * .sql("sql")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-curatedquery.html)
   */
  public interface CuratedQueryProperty {
    /**
     * An example natural language query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-curatedquery.html#cfn-bedrock-knowledgebase-curatedquery-naturallanguage)
     */
    public fun naturalLanguage(): String

    /**
     * The SQL equivalent of the natural language query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-curatedquery.html#cfn-bedrock-knowledgebase-curatedquery-sql)
     */
    public fun sql(): String

    /**
     * A builder for [CuratedQueryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param naturalLanguage An example natural language query. 
       */
      public fun naturalLanguage(naturalLanguage: String)

      /**
       * @param sql The SQL equivalent of the natural language query. 
       */
      public fun sql(sql: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.CuratedQueryProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.CuratedQueryProperty.builder()

      /**
       * @param naturalLanguage An example natural language query. 
       */
      override fun naturalLanguage(naturalLanguage: String) {
        cdkBuilder.naturalLanguage(naturalLanguage)
      }

      /**
       * @param sql The SQL equivalent of the natural language query. 
       */
      override fun sql(sql: String) {
        cdkBuilder.sql(sql)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.CuratedQueryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.CuratedQueryProperty,
    ) : CdkObject(cdkObject),
        CuratedQueryProperty {
      /**
       * An example natural language query.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-curatedquery.html#cfn-bedrock-knowledgebase-curatedquery-naturallanguage)
       */
      override fun naturalLanguage(): String = unwrap(this).getNaturalLanguage()

      /**
       * The SQL equivalent of the natural language query.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-curatedquery.html#cfn-bedrock-knowledgebase-curatedquery-sql)
       */
      override fun sql(): String = unwrap(this).getSql()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CuratedQueryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.CuratedQueryProperty):
          CuratedQueryProperty = CdkObjectWrappers.wrap(cdkObject) as? CuratedQueryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CuratedQueryProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.CuratedQueryProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.CuratedQueryProperty
    }
  }

  /**
   * The configuration details for the embeddings model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * EmbeddingModelConfigurationProperty embeddingModelConfigurationProperty =
   * EmbeddingModelConfigurationProperty.builder()
   * .bedrockEmbeddingModelConfiguration(BedrockEmbeddingModelConfigurationProperty.builder()
   * .dimensions(123)
   * .embeddingDataType("embeddingDataType")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-embeddingmodelconfiguration.html)
   */
  public interface EmbeddingModelConfigurationProperty {
    /**
     * The vector configuration details on the Bedrock embeddings model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-embeddingmodelconfiguration.html#cfn-bedrock-knowledgebase-embeddingmodelconfiguration-bedrockembeddingmodelconfiguration)
     */
    public fun bedrockEmbeddingModelConfiguration(): Any? =
        unwrap(this).getBedrockEmbeddingModelConfiguration()

    /**
     * A builder for [EmbeddingModelConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bedrockEmbeddingModelConfiguration The vector configuration details on the Bedrock
       * embeddings model.
       */
      public fun bedrockEmbeddingModelConfiguration(bedrockEmbeddingModelConfiguration: IResolvable)

      /**
       * @param bedrockEmbeddingModelConfiguration The vector configuration details on the Bedrock
       * embeddings model.
       */
      public
          fun bedrockEmbeddingModelConfiguration(bedrockEmbeddingModelConfiguration: BedrockEmbeddingModelConfigurationProperty)

      /**
       * @param bedrockEmbeddingModelConfiguration The vector configuration details on the Bedrock
       * embeddings model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72420c2fbd5dfcb0301b963bf5b5e58a81e45f21a5f5cf40293b13daaedff8e4")
      public
          fun bedrockEmbeddingModelConfiguration(bedrockEmbeddingModelConfiguration: BedrockEmbeddingModelConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.EmbeddingModelConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.EmbeddingModelConfigurationProperty.builder()

      /**
       * @param bedrockEmbeddingModelConfiguration The vector configuration details on the Bedrock
       * embeddings model.
       */
      override
          fun bedrockEmbeddingModelConfiguration(bedrockEmbeddingModelConfiguration: IResolvable) {
        cdkBuilder.bedrockEmbeddingModelConfiguration(bedrockEmbeddingModelConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param bedrockEmbeddingModelConfiguration The vector configuration details on the Bedrock
       * embeddings model.
       */
      override
          fun bedrockEmbeddingModelConfiguration(bedrockEmbeddingModelConfiguration: BedrockEmbeddingModelConfigurationProperty) {
        cdkBuilder.bedrockEmbeddingModelConfiguration(bedrockEmbeddingModelConfiguration.let(BedrockEmbeddingModelConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param bedrockEmbeddingModelConfiguration The vector configuration details on the Bedrock
       * embeddings model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72420c2fbd5dfcb0301b963bf5b5e58a81e45f21a5f5cf40293b13daaedff8e4")
      override
          fun bedrockEmbeddingModelConfiguration(bedrockEmbeddingModelConfiguration: BedrockEmbeddingModelConfigurationProperty.Builder.() -> Unit):
          Unit =
          bedrockEmbeddingModelConfiguration(BedrockEmbeddingModelConfigurationProperty(bedrockEmbeddingModelConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.EmbeddingModelConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.EmbeddingModelConfigurationProperty,
    ) : CdkObject(cdkObject),
        EmbeddingModelConfigurationProperty {
      /**
       * The vector configuration details on the Bedrock embeddings model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-embeddingmodelconfiguration.html#cfn-bedrock-knowledgebase-embeddingmodelconfiguration-bedrockembeddingmodelconfiguration)
       */
      override fun bedrockEmbeddingModelConfiguration(): Any? =
          unwrap(this).getBedrockEmbeddingModelConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EmbeddingModelConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.EmbeddingModelConfigurationProperty):
          EmbeddingModelConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EmbeddingModelConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmbeddingModelConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.EmbeddingModelConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.EmbeddingModelConfigurationProperty
    }
  }

  /**
   * Settings for an Amazon Kendra knowledge base.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * KendraKnowledgeBaseConfigurationProperty kendraKnowledgeBaseConfigurationProperty =
   * KendraKnowledgeBaseConfigurationProperty.builder()
   * .kendraIndexArn("kendraIndexArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-kendraknowledgebaseconfiguration.html)
   */
  public interface KendraKnowledgeBaseConfigurationProperty {
    /**
     * The ARN of the Amazon Kendra index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-kendraknowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-kendraknowledgebaseconfiguration-kendraindexarn)
     */
    public fun kendraIndexArn(): String

    /**
     * A builder for [KendraKnowledgeBaseConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kendraIndexArn The ARN of the Amazon Kendra index. 
       */
      public fun kendraIndexArn(kendraIndexArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.KendraKnowledgeBaseConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.KendraKnowledgeBaseConfigurationProperty.builder()

      /**
       * @param kendraIndexArn The ARN of the Amazon Kendra index. 
       */
      override fun kendraIndexArn(kendraIndexArn: String) {
        cdkBuilder.kendraIndexArn(kendraIndexArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.KendraKnowledgeBaseConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.KendraKnowledgeBaseConfigurationProperty,
    ) : CdkObject(cdkObject),
        KendraKnowledgeBaseConfigurationProperty {
      /**
       * The ARN of the Amazon Kendra index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-kendraknowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-kendraknowledgebaseconfiguration-kendraindexarn)
       */
      override fun kendraIndexArn(): String = unwrap(this).getKendraIndexArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KendraKnowledgeBaseConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.KendraKnowledgeBaseConfigurationProperty):
          KendraKnowledgeBaseConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KendraKnowledgeBaseConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KendraKnowledgeBaseConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.KendraKnowledgeBaseConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.KendraKnowledgeBaseConfigurationProperty
    }
  }

  /**
   * Configurations to apply to a knowledge base attached to the agent during query.
   *
   * For more information, see [Knowledge base retrieval
   * configurations](https://docs.aws.amazon.com/bedrock/latest/userguide/agents-session-state.html#session-state-kb)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * KnowledgeBaseConfigurationProperty knowledgeBaseConfigurationProperty =
   * KnowledgeBaseConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .kendraKnowledgeBaseConfiguration(KendraKnowledgeBaseConfigurationProperty.builder()
   * .kendraIndexArn("kendraIndexArn")
   * .build())
   * .sqlKnowledgeBaseConfiguration(SqlKnowledgeBaseConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .redshiftConfiguration(RedshiftConfigurationProperty.builder()
   * .queryEngineConfiguration(RedshiftQueryEngineConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .provisionedConfiguration(RedshiftProvisionedConfigurationProperty.builder()
   * .authConfiguration(RedshiftProvisionedAuthConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .databaseUser("databaseUser")
   * .usernamePasswordSecretArn("usernamePasswordSecretArn")
   * .build())
   * .clusterIdentifier("clusterIdentifier")
   * .build())
   * .serverlessConfiguration(RedshiftServerlessConfigurationProperty.builder()
   * .authConfiguration(RedshiftServerlessAuthConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .usernamePasswordSecretArn("usernamePasswordSecretArn")
   * .build())
   * .workgroupArn("workgroupArn")
   * .build())
   * .build())
   * .storageConfigurations(List.of(RedshiftQueryEngineStorageConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .awsDataCatalogConfiguration(RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty.builder()
   * .tableNames(List.of("tableNames"))
   * .build())
   * .redshiftConfiguration(RedshiftQueryEngineRedshiftStorageConfigurationProperty.builder()
   * .databaseName("databaseName")
   * .build())
   * .build()))
   * // the properties below are optional
   * .queryGenerationConfiguration(QueryGenerationConfigurationProperty.builder()
   * .executionTimeoutSeconds(123)
   * .generationContext(QueryGenerationContextProperty.builder()
   * .curatedQueries(List.of(CuratedQueryProperty.builder()
   * .naturalLanguage("naturalLanguage")
   * .sql("sql")
   * .build()))
   * .tables(List.of(QueryGenerationTableProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .columns(List.of(QueryGenerationColumnProperty.builder()
   * .description("description")
   * .inclusion("inclusion")
   * .name("name")
   * .build()))
   * .description("description")
   * .inclusion("inclusion")
   * .build()))
   * .build())
   * .build())
   * .build())
   * .build())
   * .vectorKnowledgeBaseConfiguration(VectorKnowledgeBaseConfigurationProperty.builder()
   * .embeddingModelArn("embeddingModelArn")
   * // the properties below are optional
   * .embeddingModelConfiguration(EmbeddingModelConfigurationProperty.builder()
   * .bedrockEmbeddingModelConfiguration(BedrockEmbeddingModelConfigurationProperty.builder()
   * .dimensions(123)
   * .embeddingDataType("embeddingDataType")
   * .build())
   * .build())
   * .supplementalDataStorageConfiguration(SupplementalDataStorageConfigurationProperty.builder()
   * .supplementalDataStorageLocations(List.of(SupplementalDataStorageLocationProperty.builder()
   * .supplementalDataStorageLocationType("supplementalDataStorageLocationType")
   * // the properties below are optional
   * .s3Location(S3LocationProperty.builder()
   * .uri("uri")
   * .build())
   * .build()))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-knowledgebaseconfiguration.html)
   */
  public interface KnowledgeBaseConfigurationProperty {
    /**
     * Settings for an Amazon Kendra knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-knowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration-kendraknowledgebaseconfiguration)
     */
    public fun kendraKnowledgeBaseConfiguration(): Any? =
        unwrap(this).getKendraKnowledgeBaseConfiguration()

    /**
     * Specifies configurations for a knowledge base connected to an SQL database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-knowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration-sqlknowledgebaseconfiguration)
     */
    public fun sqlKnowledgeBaseConfiguration(): Any? =
        unwrap(this).getSqlKnowledgeBaseConfiguration()

    /**
     * The type of data that the data source is converted into for the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-knowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration-type)
     */
    public fun type(): String

    /**
     * Contains details about the model that's used to convert the data source into vector
     * embeddings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-knowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration-vectorknowledgebaseconfiguration)
     */
    public fun vectorKnowledgeBaseConfiguration(): Any? =
        unwrap(this).getVectorKnowledgeBaseConfiguration()

    /**
     * A builder for [KnowledgeBaseConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kendraKnowledgeBaseConfiguration Settings for an Amazon Kendra knowledge base.
       */
      public fun kendraKnowledgeBaseConfiguration(kendraKnowledgeBaseConfiguration: IResolvable)

      /**
       * @param kendraKnowledgeBaseConfiguration Settings for an Amazon Kendra knowledge base.
       */
      public
          fun kendraKnowledgeBaseConfiguration(kendraKnowledgeBaseConfiguration: KendraKnowledgeBaseConfigurationProperty)

      /**
       * @param kendraKnowledgeBaseConfiguration Settings for an Amazon Kendra knowledge base.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa5bc3c1b48d30f544f93d898723e438f6a40d1f7b6064fee03259cc011e7106")
      public
          fun kendraKnowledgeBaseConfiguration(kendraKnowledgeBaseConfiguration: KendraKnowledgeBaseConfigurationProperty.Builder.() -> Unit)

      /**
       * @param sqlKnowledgeBaseConfiguration Specifies configurations for a knowledge base
       * connected to an SQL database.
       */
      public fun sqlKnowledgeBaseConfiguration(sqlKnowledgeBaseConfiguration: IResolvable)

      /**
       * @param sqlKnowledgeBaseConfiguration Specifies configurations for a knowledge base
       * connected to an SQL database.
       */
      public
          fun sqlKnowledgeBaseConfiguration(sqlKnowledgeBaseConfiguration: SqlKnowledgeBaseConfigurationProperty)

      /**
       * @param sqlKnowledgeBaseConfiguration Specifies configurations for a knowledge base
       * connected to an SQL database.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d39a4477d5f6dd27188998221f07090b55af6097fb8a4400cff003d314ca2e5")
      public
          fun sqlKnowledgeBaseConfiguration(sqlKnowledgeBaseConfiguration: SqlKnowledgeBaseConfigurationProperty.Builder.() -> Unit)

      /**
       * @param type The type of data that the data source is converted into for the knowledge base.
       * 
       */
      public fun type(type: String)

      /**
       * @param vectorKnowledgeBaseConfiguration Contains details about the model that's used to
       * convert the data source into vector embeddings.
       */
      public fun vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration: IResolvable)

      /**
       * @param vectorKnowledgeBaseConfiguration Contains details about the model that's used to
       * convert the data source into vector embeddings.
       */
      public
          fun vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration: VectorKnowledgeBaseConfigurationProperty)

      /**
       * @param vectorKnowledgeBaseConfiguration Contains details about the model that's used to
       * convert the data source into vector embeddings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1436463a51d226fda4896a15739aa86c924098a9d68554af8e2d3e4633b861f")
      public
          fun vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration: VectorKnowledgeBaseConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.KnowledgeBaseConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.KnowledgeBaseConfigurationProperty.builder()

      /**
       * @param kendraKnowledgeBaseConfiguration Settings for an Amazon Kendra knowledge base.
       */
      override fun kendraKnowledgeBaseConfiguration(kendraKnowledgeBaseConfiguration: IResolvable) {
        cdkBuilder.kendraKnowledgeBaseConfiguration(kendraKnowledgeBaseConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kendraKnowledgeBaseConfiguration Settings for an Amazon Kendra knowledge base.
       */
      override
          fun kendraKnowledgeBaseConfiguration(kendraKnowledgeBaseConfiguration: KendraKnowledgeBaseConfigurationProperty) {
        cdkBuilder.kendraKnowledgeBaseConfiguration(kendraKnowledgeBaseConfiguration.let(KendraKnowledgeBaseConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param kendraKnowledgeBaseConfiguration Settings for an Amazon Kendra knowledge base.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa5bc3c1b48d30f544f93d898723e438f6a40d1f7b6064fee03259cc011e7106")
      override
          fun kendraKnowledgeBaseConfiguration(kendraKnowledgeBaseConfiguration: KendraKnowledgeBaseConfigurationProperty.Builder.() -> Unit):
          Unit =
          kendraKnowledgeBaseConfiguration(KendraKnowledgeBaseConfigurationProperty(kendraKnowledgeBaseConfiguration))

      /**
       * @param sqlKnowledgeBaseConfiguration Specifies configurations for a knowledge base
       * connected to an SQL database.
       */
      override fun sqlKnowledgeBaseConfiguration(sqlKnowledgeBaseConfiguration: IResolvable) {
        cdkBuilder.sqlKnowledgeBaseConfiguration(sqlKnowledgeBaseConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sqlKnowledgeBaseConfiguration Specifies configurations for a knowledge base
       * connected to an SQL database.
       */
      override
          fun sqlKnowledgeBaseConfiguration(sqlKnowledgeBaseConfiguration: SqlKnowledgeBaseConfigurationProperty) {
        cdkBuilder.sqlKnowledgeBaseConfiguration(sqlKnowledgeBaseConfiguration.let(SqlKnowledgeBaseConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param sqlKnowledgeBaseConfiguration Specifies configurations for a knowledge base
       * connected to an SQL database.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d39a4477d5f6dd27188998221f07090b55af6097fb8a4400cff003d314ca2e5")
      override
          fun sqlKnowledgeBaseConfiguration(sqlKnowledgeBaseConfiguration: SqlKnowledgeBaseConfigurationProperty.Builder.() -> Unit):
          Unit =
          sqlKnowledgeBaseConfiguration(SqlKnowledgeBaseConfigurationProperty(sqlKnowledgeBaseConfiguration))

      /**
       * @param type The type of data that the data source is converted into for the knowledge base.
       * 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param vectorKnowledgeBaseConfiguration Contains details about the model that's used to
       * convert the data source into vector embeddings.
       */
      override fun vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration: IResolvable) {
        cdkBuilder.vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vectorKnowledgeBaseConfiguration Contains details about the model that's used to
       * convert the data source into vector embeddings.
       */
      override
          fun vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration: VectorKnowledgeBaseConfigurationProperty) {
        cdkBuilder.vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration.let(VectorKnowledgeBaseConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param vectorKnowledgeBaseConfiguration Contains details about the model that's used to
       * convert the data source into vector embeddings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1436463a51d226fda4896a15739aa86c924098a9d68554af8e2d3e4633b861f")
      override
          fun vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration: VectorKnowledgeBaseConfigurationProperty.Builder.() -> Unit):
          Unit =
          vectorKnowledgeBaseConfiguration(VectorKnowledgeBaseConfigurationProperty(vectorKnowledgeBaseConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.KnowledgeBaseConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.KnowledgeBaseConfigurationProperty,
    ) : CdkObject(cdkObject),
        KnowledgeBaseConfigurationProperty {
      /**
       * Settings for an Amazon Kendra knowledge base.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-knowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration-kendraknowledgebaseconfiguration)
       */
      override fun kendraKnowledgeBaseConfiguration(): Any? =
          unwrap(this).getKendraKnowledgeBaseConfiguration()

      /**
       * Specifies configurations for a knowledge base connected to an SQL database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-knowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration-sqlknowledgebaseconfiguration)
       */
      override fun sqlKnowledgeBaseConfiguration(): Any? =
          unwrap(this).getSqlKnowledgeBaseConfiguration()

      /**
       * The type of data that the data source is converted into for the knowledge base.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-knowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * Contains details about the model that's used to convert the data source into vector
       * embeddings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-knowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration-vectorknowledgebaseconfiguration)
       */
      override fun vectorKnowledgeBaseConfiguration(): Any? =
          unwrap(this).getVectorKnowledgeBaseConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KnowledgeBaseConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.KnowledgeBaseConfigurationProperty):
          KnowledgeBaseConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KnowledgeBaseConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KnowledgeBaseConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.KnowledgeBaseConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.KnowledgeBaseConfigurationProperty
    }
  }

  /**
   * Contains details about the storage configuration of the knowledge base in MongoDB Atlas.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * MongoDbAtlasConfigurationProperty mongoDbAtlasConfigurationProperty =
   * MongoDbAtlasConfigurationProperty.builder()
   * .collectionName("collectionName")
   * .credentialsSecretArn("credentialsSecretArn")
   * .databaseName("databaseName")
   * .endpoint("endpoint")
   * .fieldMapping(MongoDbAtlasFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .textField("textField")
   * .vectorField("vectorField")
   * .build())
   * .vectorIndexName("vectorIndexName")
   * // the properties below are optional
   * .endpointServiceName("endpointServiceName")
   * .textIndexName("textIndexName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html)
   */
  public interface MongoDbAtlasConfigurationProperty {
    /**
     * The collection name of the knowledge base in MongoDB Atlas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-collectionname)
     */
    public fun collectionName(): String

    /**
     * The Amazon Resource Name (ARN) of the secret that you created in AWS Secrets Manager that
     * contains user credentials for your MongoDB Atlas cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-credentialssecretarn)
     */
    public fun credentialsSecretArn(): String

    /**
     * The database name in your MongoDB Atlas cluster for your knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-databasename)
     */
    public fun databaseName(): String

    /**
     * The endpoint URL of your MongoDB Atlas cluster for your knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-endpoint)
     */
    public fun endpoint(): String

    /**
     * The name of the VPC endpoint service in your account that is connected to your MongoDB Atlas
     * cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-endpointservicename)
     */
    public fun endpointServiceName(): String? = unwrap(this).getEndpointServiceName()

    /**
     * Contains the names of the fields to which to map information about the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-fieldmapping)
     */
    public fun fieldMapping(): Any

    /**
     * The name of the text search index in the MongoDB collection.
     *
     * This is required for using the hybrid search feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-textindexname)
     */
    public fun textIndexName(): String? = unwrap(this).getTextIndexName()

    /**
     * The name of the MongoDB Atlas vector search index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-vectorindexname)
     */
    public fun vectorIndexName(): String

    /**
     * A builder for [MongoDbAtlasConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param collectionName The collection name of the knowledge base in MongoDB Atlas. 
       */
      public fun collectionName(collectionName: String)

      /**
       * @param credentialsSecretArn The Amazon Resource Name (ARN) of the secret that you created
       * in AWS Secrets Manager that contains user credentials for your MongoDB Atlas cluster. 
       */
      public fun credentialsSecretArn(credentialsSecretArn: String)

      /**
       * @param databaseName The database name in your MongoDB Atlas cluster for your knowledge
       * base. 
       */
      public fun databaseName(databaseName: String)

      /**
       * @param endpoint The endpoint URL of your MongoDB Atlas cluster for your knowledge base. 
       */
      public fun endpoint(endpoint: String)

      /**
       * @param endpointServiceName The name of the VPC endpoint service in your account that is
       * connected to your MongoDB Atlas cluster.
       */
      public fun endpointServiceName(endpointServiceName: String)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      public fun fieldMapping(fieldMapping: IResolvable)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      public fun fieldMapping(fieldMapping: MongoDbAtlasFieldMappingProperty)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0812ebbaa97dba29669834bbfcd4ae269927e13d70bbdaebd0cab58b3558cd72")
      public fun fieldMapping(fieldMapping: MongoDbAtlasFieldMappingProperty.Builder.() -> Unit)

      /**
       * @param textIndexName The name of the text search index in the MongoDB collection.
       * This is required for using the hybrid search feature.
       */
      public fun textIndexName(textIndexName: String)

      /**
       * @param vectorIndexName The name of the MongoDB Atlas vector search index. 
       */
      public fun vectorIndexName(vectorIndexName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.MongoDbAtlasConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.MongoDbAtlasConfigurationProperty.builder()

      /**
       * @param collectionName The collection name of the knowledge base in MongoDB Atlas. 
       */
      override fun collectionName(collectionName: String) {
        cdkBuilder.collectionName(collectionName)
      }

      /**
       * @param credentialsSecretArn The Amazon Resource Name (ARN) of the secret that you created
       * in AWS Secrets Manager that contains user credentials for your MongoDB Atlas cluster. 
       */
      override fun credentialsSecretArn(credentialsSecretArn: String) {
        cdkBuilder.credentialsSecretArn(credentialsSecretArn)
      }

      /**
       * @param databaseName The database name in your MongoDB Atlas cluster for your knowledge
       * base. 
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param endpoint The endpoint URL of your MongoDB Atlas cluster for your knowledge base. 
       */
      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      /**
       * @param endpointServiceName The name of the VPC endpoint service in your account that is
       * connected to your MongoDB Atlas cluster.
       */
      override fun endpointServiceName(endpointServiceName: String) {
        cdkBuilder.endpointServiceName(endpointServiceName)
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      override fun fieldMapping(fieldMapping: IResolvable) {
        cdkBuilder.fieldMapping(fieldMapping.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      override fun fieldMapping(fieldMapping: MongoDbAtlasFieldMappingProperty) {
        cdkBuilder.fieldMapping(fieldMapping.let(MongoDbAtlasFieldMappingProperty.Companion::unwrap))
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0812ebbaa97dba29669834bbfcd4ae269927e13d70bbdaebd0cab58b3558cd72")
      override fun fieldMapping(fieldMapping: MongoDbAtlasFieldMappingProperty.Builder.() -> Unit):
          Unit = fieldMapping(MongoDbAtlasFieldMappingProperty(fieldMapping))

      /**
       * @param textIndexName The name of the text search index in the MongoDB collection.
       * This is required for using the hybrid search feature.
       */
      override fun textIndexName(textIndexName: String) {
        cdkBuilder.textIndexName(textIndexName)
      }

      /**
       * @param vectorIndexName The name of the MongoDB Atlas vector search index. 
       */
      override fun vectorIndexName(vectorIndexName: String) {
        cdkBuilder.vectorIndexName(vectorIndexName)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.MongoDbAtlasConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.MongoDbAtlasConfigurationProperty,
    ) : CdkObject(cdkObject),
        MongoDbAtlasConfigurationProperty {
      /**
       * The collection name of the knowledge base in MongoDB Atlas.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-collectionname)
       */
      override fun collectionName(): String = unwrap(this).getCollectionName()

      /**
       * The Amazon Resource Name (ARN) of the secret that you created in AWS Secrets Manager that
       * contains user credentials for your MongoDB Atlas cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-credentialssecretarn)
       */
      override fun credentialsSecretArn(): String = unwrap(this).getCredentialsSecretArn()

      /**
       * The database name in your MongoDB Atlas cluster for your knowledge base.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * The endpoint URL of your MongoDB Atlas cluster for your knowledge base.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-endpoint)
       */
      override fun endpoint(): String = unwrap(this).getEndpoint()

      /**
       * The name of the VPC endpoint service in your account that is connected to your MongoDB
       * Atlas cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-endpointservicename)
       */
      override fun endpointServiceName(): String? = unwrap(this).getEndpointServiceName()

      /**
       * Contains the names of the fields to which to map information about the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-fieldmapping)
       */
      override fun fieldMapping(): Any = unwrap(this).getFieldMapping()

      /**
       * The name of the text search index in the MongoDB collection.
       *
       * This is required for using the hybrid search feature.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-textindexname)
       */
      override fun textIndexName(): String? = unwrap(this).getTextIndexName()

      /**
       * The name of the MongoDB Atlas vector search index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasconfiguration.html#cfn-bedrock-knowledgebase-mongodbatlasconfiguration-vectorindexname)
       */
      override fun vectorIndexName(): String = unwrap(this).getVectorIndexName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MongoDbAtlasConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.MongoDbAtlasConfigurationProperty):
          MongoDbAtlasConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MongoDbAtlasConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MongoDbAtlasConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.MongoDbAtlasConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.MongoDbAtlasConfigurationProperty
    }
  }

  /**
   * Contains the names of the fields to which to map information about the vector store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * MongoDbAtlasFieldMappingProperty mongoDbAtlasFieldMappingProperty =
   * MongoDbAtlasFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .textField("textField")
   * .vectorField("vectorField")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasfieldmapping.html)
   */
  public interface MongoDbAtlasFieldMappingProperty {
    /**
     * The name of the field in which Amazon Bedrock stores metadata about the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasfieldmapping.html#cfn-bedrock-knowledgebase-mongodbatlasfieldmapping-metadatafield)
     */
    public fun metadataField(): String

    /**
     * The name of the field in which Amazon Bedrock stores the raw text from your data.
     *
     * The text is split according to the chunking strategy you choose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasfieldmapping.html#cfn-bedrock-knowledgebase-mongodbatlasfieldmapping-textfield)
     */
    public fun textField(): String

    /**
     * The name of the field in which Amazon Bedrock stores the vector embeddings for your data
     * sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasfieldmapping.html#cfn-bedrock-knowledgebase-mongodbatlasfieldmapping-vectorfield)
     */
    public fun vectorField(): String

    /**
     * A builder for [MongoDbAtlasFieldMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metadataField The name of the field in which Amazon Bedrock stores metadata about
       * the vector store. 
       */
      public fun metadataField(metadataField: String)

      /**
       * @param textField The name of the field in which Amazon Bedrock stores the raw text from
       * your data. 
       * The text is split according to the chunking strategy you choose.
       */
      public fun textField(textField: String)

      /**
       * @param vectorField The name of the field in which Amazon Bedrock stores the vector
       * embeddings for your data sources. 
       */
      public fun vectorField(vectorField: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.MongoDbAtlasFieldMappingProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.MongoDbAtlasFieldMappingProperty.builder()

      /**
       * @param metadataField The name of the field in which Amazon Bedrock stores metadata about
       * the vector store. 
       */
      override fun metadataField(metadataField: String) {
        cdkBuilder.metadataField(metadataField)
      }

      /**
       * @param textField The name of the field in which Amazon Bedrock stores the raw text from
       * your data. 
       * The text is split according to the chunking strategy you choose.
       */
      override fun textField(textField: String) {
        cdkBuilder.textField(textField)
      }

      /**
       * @param vectorField The name of the field in which Amazon Bedrock stores the vector
       * embeddings for your data sources. 
       */
      override fun vectorField(vectorField: String) {
        cdkBuilder.vectorField(vectorField)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.MongoDbAtlasFieldMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.MongoDbAtlasFieldMappingProperty,
    ) : CdkObject(cdkObject),
        MongoDbAtlasFieldMappingProperty {
      /**
       * The name of the field in which Amazon Bedrock stores metadata about the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasfieldmapping.html#cfn-bedrock-knowledgebase-mongodbatlasfieldmapping-metadatafield)
       */
      override fun metadataField(): String = unwrap(this).getMetadataField()

      /**
       * The name of the field in which Amazon Bedrock stores the raw text from your data.
       *
       * The text is split according to the chunking strategy you choose.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasfieldmapping.html#cfn-bedrock-knowledgebase-mongodbatlasfieldmapping-textfield)
       */
      override fun textField(): String = unwrap(this).getTextField()

      /**
       * The name of the field in which Amazon Bedrock stores the vector embeddings for your data
       * sources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-mongodbatlasfieldmapping.html#cfn-bedrock-knowledgebase-mongodbatlasfieldmapping-vectorfield)
       */
      override fun vectorField(): String = unwrap(this).getVectorField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MongoDbAtlasFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.MongoDbAtlasFieldMappingProperty):
          MongoDbAtlasFieldMappingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MongoDbAtlasFieldMappingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MongoDbAtlasFieldMappingProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.MongoDbAtlasFieldMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.MongoDbAtlasFieldMappingProperty
    }
  }

  /**
   * Contains details about the storage configuration of the knowledge base in Amazon Neptune
   * Analytics.
   *
   * For more information, see [Create a vector index in Amazon Neptune
   * Analytics](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-neptune.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * NeptuneAnalyticsConfigurationProperty neptuneAnalyticsConfigurationProperty =
   * NeptuneAnalyticsConfigurationProperty.builder()
   * .fieldMapping(NeptuneAnalyticsFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .textField("textField")
   * .build())
   * .graphArn("graphArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-neptuneanalyticsconfiguration.html)
   */
  public interface NeptuneAnalyticsConfigurationProperty {
    /**
     * Contains the names of the fields to which to map information about the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-neptuneanalyticsconfiguration.html#cfn-bedrock-knowledgebase-neptuneanalyticsconfiguration-fieldmapping)
     */
    public fun fieldMapping(): Any

    /**
     * The Amazon Resource Name (ARN) of the Neptune Analytics vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-neptuneanalyticsconfiguration.html#cfn-bedrock-knowledgebase-neptuneanalyticsconfiguration-grapharn)
     */
    public fun graphArn(): String

    /**
     * A builder for [NeptuneAnalyticsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      public fun fieldMapping(fieldMapping: IResolvable)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      public fun fieldMapping(fieldMapping: NeptuneAnalyticsFieldMappingProperty)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3152befddf4b7fb24a7bef22b67e844a7868b93ced26644386705861debdbb5d")
      public fun fieldMapping(fieldMapping: NeptuneAnalyticsFieldMappingProperty.Builder.() -> Unit)

      /**
       * @param graphArn The Amazon Resource Name (ARN) of the Neptune Analytics vector store. 
       */
      public fun graphArn(graphArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.NeptuneAnalyticsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.NeptuneAnalyticsConfigurationProperty.builder()

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      override fun fieldMapping(fieldMapping: IResolvable) {
        cdkBuilder.fieldMapping(fieldMapping.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      override fun fieldMapping(fieldMapping: NeptuneAnalyticsFieldMappingProperty) {
        cdkBuilder.fieldMapping(fieldMapping.let(NeptuneAnalyticsFieldMappingProperty.Companion::unwrap))
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3152befddf4b7fb24a7bef22b67e844a7868b93ced26644386705861debdbb5d")
      override
          fun fieldMapping(fieldMapping: NeptuneAnalyticsFieldMappingProperty.Builder.() -> Unit):
          Unit = fieldMapping(NeptuneAnalyticsFieldMappingProperty(fieldMapping))

      /**
       * @param graphArn The Amazon Resource Name (ARN) of the Neptune Analytics vector store. 
       */
      override fun graphArn(graphArn: String) {
        cdkBuilder.graphArn(graphArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.NeptuneAnalyticsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.NeptuneAnalyticsConfigurationProperty,
    ) : CdkObject(cdkObject),
        NeptuneAnalyticsConfigurationProperty {
      /**
       * Contains the names of the fields to which to map information about the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-neptuneanalyticsconfiguration.html#cfn-bedrock-knowledgebase-neptuneanalyticsconfiguration-fieldmapping)
       */
      override fun fieldMapping(): Any = unwrap(this).getFieldMapping()

      /**
       * The Amazon Resource Name (ARN) of the Neptune Analytics vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-neptuneanalyticsconfiguration.html#cfn-bedrock-knowledgebase-neptuneanalyticsconfiguration-grapharn)
       */
      override fun graphArn(): String = unwrap(this).getGraphArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NeptuneAnalyticsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.NeptuneAnalyticsConfigurationProperty):
          NeptuneAnalyticsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NeptuneAnalyticsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NeptuneAnalyticsConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.NeptuneAnalyticsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.NeptuneAnalyticsConfigurationProperty
    }
  }

  /**
   * Contains the names of the fields to which to map information about the vector store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * NeptuneAnalyticsFieldMappingProperty neptuneAnalyticsFieldMappingProperty =
   * NeptuneAnalyticsFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .textField("textField")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-neptuneanalyticsfieldmapping.html)
   */
  public interface NeptuneAnalyticsFieldMappingProperty {
    /**
     * The name of the field in which Amazon Bedrock stores metadata about the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-neptuneanalyticsfieldmapping.html#cfn-bedrock-knowledgebase-neptuneanalyticsfieldmapping-metadatafield)
     */
    public fun metadataField(): String

    /**
     * The name of the field in which Amazon Bedrock stores the raw text from your data.
     *
     * The text is split according to the chunking strategy you choose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-neptuneanalyticsfieldmapping.html#cfn-bedrock-knowledgebase-neptuneanalyticsfieldmapping-textfield)
     */
    public fun textField(): String

    /**
     * A builder for [NeptuneAnalyticsFieldMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metadataField The name of the field in which Amazon Bedrock stores metadata about
       * the vector store. 
       */
      public fun metadataField(metadataField: String)

      /**
       * @param textField The name of the field in which Amazon Bedrock stores the raw text from
       * your data. 
       * The text is split according to the chunking strategy you choose.
       */
      public fun textField(textField: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.NeptuneAnalyticsFieldMappingProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.NeptuneAnalyticsFieldMappingProperty.builder()

      /**
       * @param metadataField The name of the field in which Amazon Bedrock stores metadata about
       * the vector store. 
       */
      override fun metadataField(metadataField: String) {
        cdkBuilder.metadataField(metadataField)
      }

      /**
       * @param textField The name of the field in which Amazon Bedrock stores the raw text from
       * your data. 
       * The text is split according to the chunking strategy you choose.
       */
      override fun textField(textField: String) {
        cdkBuilder.textField(textField)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.NeptuneAnalyticsFieldMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.NeptuneAnalyticsFieldMappingProperty,
    ) : CdkObject(cdkObject),
        NeptuneAnalyticsFieldMappingProperty {
      /**
       * The name of the field in which Amazon Bedrock stores metadata about the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-neptuneanalyticsfieldmapping.html#cfn-bedrock-knowledgebase-neptuneanalyticsfieldmapping-metadatafield)
       */
      override fun metadataField(): String = unwrap(this).getMetadataField()

      /**
       * The name of the field in which Amazon Bedrock stores the raw text from your data.
       *
       * The text is split according to the chunking strategy you choose.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-neptuneanalyticsfieldmapping.html#cfn-bedrock-knowledgebase-neptuneanalyticsfieldmapping-textfield)
       */
      override fun textField(): String = unwrap(this).getTextField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NeptuneAnalyticsFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.NeptuneAnalyticsFieldMappingProperty):
          NeptuneAnalyticsFieldMappingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NeptuneAnalyticsFieldMappingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NeptuneAnalyticsFieldMappingProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.NeptuneAnalyticsFieldMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.NeptuneAnalyticsFieldMappingProperty
    }
  }

  /**
   * Contains details about the Managed Cluster configuration of the knowledge base in Amazon
   * OpenSearch Service.
   *
   * For more information, see [Create a vector index in OpenSearch Managed
   * Cluster](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-osm.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * OpenSearchManagedClusterConfigurationProperty openSearchManagedClusterConfigurationProperty =
   * OpenSearchManagedClusterConfigurationProperty.builder()
   * .domainArn("domainArn")
   * .domainEndpoint("domainEndpoint")
   * .fieldMapping(OpenSearchManagedClusterFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .textField("textField")
   * .vectorField("vectorField")
   * .build())
   * .vectorIndexName("vectorIndexName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterconfiguration.html)
   */
  public interface OpenSearchManagedClusterConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the OpenSearch domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterconfiguration.html#cfn-bedrock-knowledgebase-opensearchmanagedclusterconfiguration-domainarn)
     */
    public fun domainArn(): String

    /**
     * The endpoint URL the OpenSearch domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterconfiguration.html#cfn-bedrock-knowledgebase-opensearchmanagedclusterconfiguration-domainendpoint)
     */
    public fun domainEndpoint(): String

    /**
     * Contains the names of the fields to which to map information about the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterconfiguration.html#cfn-bedrock-knowledgebase-opensearchmanagedclusterconfiguration-fieldmapping)
     */
    public fun fieldMapping(): Any

    /**
     * The name of the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterconfiguration.html#cfn-bedrock-knowledgebase-opensearchmanagedclusterconfiguration-vectorindexname)
     */
    public fun vectorIndexName(): String

    /**
     * A builder for [OpenSearchManagedClusterConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param domainArn The Amazon Resource Name (ARN) of the OpenSearch domain. 
       */
      public fun domainArn(domainArn: String)

      /**
       * @param domainEndpoint The endpoint URL the OpenSearch domain. 
       */
      public fun domainEndpoint(domainEndpoint: String)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      public fun fieldMapping(fieldMapping: IResolvable)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      public fun fieldMapping(fieldMapping: OpenSearchManagedClusterFieldMappingProperty)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b753401f015f084a8059fc330858916f960b1d13dcab52c98fa18ce2fdd4ab8")
      public
          fun fieldMapping(fieldMapping: OpenSearchManagedClusterFieldMappingProperty.Builder.() -> Unit)

      /**
       * @param vectorIndexName The name of the vector store. 
       */
      public fun vectorIndexName(vectorIndexName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchManagedClusterConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchManagedClusterConfigurationProperty.builder()

      /**
       * @param domainArn The Amazon Resource Name (ARN) of the OpenSearch domain. 
       */
      override fun domainArn(domainArn: String) {
        cdkBuilder.domainArn(domainArn)
      }

      /**
       * @param domainEndpoint The endpoint URL the OpenSearch domain. 
       */
      override fun domainEndpoint(domainEndpoint: String) {
        cdkBuilder.domainEndpoint(domainEndpoint)
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      override fun fieldMapping(fieldMapping: IResolvable) {
        cdkBuilder.fieldMapping(fieldMapping.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      override fun fieldMapping(fieldMapping: OpenSearchManagedClusterFieldMappingProperty) {
        cdkBuilder.fieldMapping(fieldMapping.let(OpenSearchManagedClusterFieldMappingProperty.Companion::unwrap))
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b753401f015f084a8059fc330858916f960b1d13dcab52c98fa18ce2fdd4ab8")
      override
          fun fieldMapping(fieldMapping: OpenSearchManagedClusterFieldMappingProperty.Builder.() -> Unit):
          Unit = fieldMapping(OpenSearchManagedClusterFieldMappingProperty(fieldMapping))

      /**
       * @param vectorIndexName The name of the vector store. 
       */
      override fun vectorIndexName(vectorIndexName: String) {
        cdkBuilder.vectorIndexName(vectorIndexName)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchManagedClusterConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchManagedClusterConfigurationProperty,
    ) : CdkObject(cdkObject),
        OpenSearchManagedClusterConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the OpenSearch domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterconfiguration.html#cfn-bedrock-knowledgebase-opensearchmanagedclusterconfiguration-domainarn)
       */
      override fun domainArn(): String = unwrap(this).getDomainArn()

      /**
       * The endpoint URL the OpenSearch domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterconfiguration.html#cfn-bedrock-knowledgebase-opensearchmanagedclusterconfiguration-domainendpoint)
       */
      override fun domainEndpoint(): String = unwrap(this).getDomainEndpoint()

      /**
       * Contains the names of the fields to which to map information about the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterconfiguration.html#cfn-bedrock-knowledgebase-opensearchmanagedclusterconfiguration-fieldmapping)
       */
      override fun fieldMapping(): Any = unwrap(this).getFieldMapping()

      /**
       * The name of the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterconfiguration.html#cfn-bedrock-knowledgebase-opensearchmanagedclusterconfiguration-vectorindexname)
       */
      override fun vectorIndexName(): String = unwrap(this).getVectorIndexName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OpenSearchManagedClusterConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchManagedClusterConfigurationProperty):
          OpenSearchManagedClusterConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenSearchManagedClusterConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenSearchManagedClusterConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchManagedClusterConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchManagedClusterConfigurationProperty
    }
  }

  /**
   * Contains the names of the fields to which to map information about the vector store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * OpenSearchManagedClusterFieldMappingProperty openSearchManagedClusterFieldMappingProperty =
   * OpenSearchManagedClusterFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .textField("textField")
   * .vectorField("vectorField")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterfieldmapping.html)
   */
  public interface OpenSearchManagedClusterFieldMappingProperty {
    /**
     * The name of the field in which Amazon Bedrock stores metadata about the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterfieldmapping.html#cfn-bedrock-knowledgebase-opensearchmanagedclusterfieldmapping-metadatafield)
     */
    public fun metadataField(): String

    /**
     * The name of the field in which Amazon Bedrock stores the raw text from your data.
     *
     * The text is split according to the chunking strategy you choose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterfieldmapping.html#cfn-bedrock-knowledgebase-opensearchmanagedclusterfieldmapping-textfield)
     */
    public fun textField(): String

    /**
     * The name of the field in which Amazon Bedrock stores the vector embeddings for your data
     * sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterfieldmapping.html#cfn-bedrock-knowledgebase-opensearchmanagedclusterfieldmapping-vectorfield)
     */
    public fun vectorField(): String

    /**
     * A builder for [OpenSearchManagedClusterFieldMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metadataField The name of the field in which Amazon Bedrock stores metadata about
       * the vector store. 
       */
      public fun metadataField(metadataField: String)

      /**
       * @param textField The name of the field in which Amazon Bedrock stores the raw text from
       * your data. 
       * The text is split according to the chunking strategy you choose.
       */
      public fun textField(textField: String)

      /**
       * @param vectorField The name of the field in which Amazon Bedrock stores the vector
       * embeddings for your data sources. 
       */
      public fun vectorField(vectorField: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchManagedClusterFieldMappingProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchManagedClusterFieldMappingProperty.builder()

      /**
       * @param metadataField The name of the field in which Amazon Bedrock stores metadata about
       * the vector store. 
       */
      override fun metadataField(metadataField: String) {
        cdkBuilder.metadataField(metadataField)
      }

      /**
       * @param textField The name of the field in which Amazon Bedrock stores the raw text from
       * your data. 
       * The text is split according to the chunking strategy you choose.
       */
      override fun textField(textField: String) {
        cdkBuilder.textField(textField)
      }

      /**
       * @param vectorField The name of the field in which Amazon Bedrock stores the vector
       * embeddings for your data sources. 
       */
      override fun vectorField(vectorField: String) {
        cdkBuilder.vectorField(vectorField)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchManagedClusterFieldMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchManagedClusterFieldMappingProperty,
    ) : CdkObject(cdkObject),
        OpenSearchManagedClusterFieldMappingProperty {
      /**
       * The name of the field in which Amazon Bedrock stores metadata about the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterfieldmapping.html#cfn-bedrock-knowledgebase-opensearchmanagedclusterfieldmapping-metadatafield)
       */
      override fun metadataField(): String = unwrap(this).getMetadataField()

      /**
       * The name of the field in which Amazon Bedrock stores the raw text from your data.
       *
       * The text is split according to the chunking strategy you choose.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterfieldmapping.html#cfn-bedrock-knowledgebase-opensearchmanagedclusterfieldmapping-textfield)
       */
      override fun textField(): String = unwrap(this).getTextField()

      /**
       * The name of the field in which Amazon Bedrock stores the vector embeddings for your data
       * sources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchmanagedclusterfieldmapping.html#cfn-bedrock-knowledgebase-opensearchmanagedclusterfieldmapping-vectorfield)
       */
      override fun vectorField(): String = unwrap(this).getVectorField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OpenSearchManagedClusterFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchManagedClusterFieldMappingProperty):
          OpenSearchManagedClusterFieldMappingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenSearchManagedClusterFieldMappingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenSearchManagedClusterFieldMappingProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchManagedClusterFieldMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchManagedClusterFieldMappingProperty
    }
  }

  /**
   * Contains details about the storage configuration of the knowledge base in Amazon OpenSearch
   * Service.
   *
   * For more information, see [Create a vector index in Amazon OpenSearch
   * Service](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-oss.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * OpenSearchServerlessConfigurationProperty openSearchServerlessConfigurationProperty =
   * OpenSearchServerlessConfigurationProperty.builder()
   * .collectionArn("collectionArn")
   * .fieldMapping(OpenSearchServerlessFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .textField("textField")
   * .vectorField("vectorField")
   * .build())
   * .vectorIndexName("vectorIndexName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchserverlessconfiguration.html)
   */
  public interface OpenSearchServerlessConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the OpenSearch Service vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchserverlessconfiguration.html#cfn-bedrock-knowledgebase-opensearchserverlessconfiguration-collectionarn)
     */
    public fun collectionArn(): String

    /**
     * Contains the names of the fields to which to map information about the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchserverlessconfiguration.html#cfn-bedrock-knowledgebase-opensearchserverlessconfiguration-fieldmapping)
     */
    public fun fieldMapping(): Any

    /**
     * The name of the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchserverlessconfiguration.html#cfn-bedrock-knowledgebase-opensearchserverlessconfiguration-vectorindexname)
     */
    public fun vectorIndexName(): String

    /**
     * A builder for [OpenSearchServerlessConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param collectionArn The Amazon Resource Name (ARN) of the OpenSearch Service vector store.
       * 
       */
      public fun collectionArn(collectionArn: String)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      public fun fieldMapping(fieldMapping: IResolvable)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      public fun fieldMapping(fieldMapping: OpenSearchServerlessFieldMappingProperty)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9563aeefd0e9e5b661bf7ca65f0095830e098ad42194668f3f9045ec181e49de")
      public
          fun fieldMapping(fieldMapping: OpenSearchServerlessFieldMappingProperty.Builder.() -> Unit)

      /**
       * @param vectorIndexName The name of the vector store. 
       */
      public fun vectorIndexName(vectorIndexName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchServerlessConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchServerlessConfigurationProperty.builder()

      /**
       * @param collectionArn The Amazon Resource Name (ARN) of the OpenSearch Service vector store.
       * 
       */
      override fun collectionArn(collectionArn: String) {
        cdkBuilder.collectionArn(collectionArn)
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      override fun fieldMapping(fieldMapping: IResolvable) {
        cdkBuilder.fieldMapping(fieldMapping.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      override fun fieldMapping(fieldMapping: OpenSearchServerlessFieldMappingProperty) {
        cdkBuilder.fieldMapping(fieldMapping.let(OpenSearchServerlessFieldMappingProperty.Companion::unwrap))
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9563aeefd0e9e5b661bf7ca65f0095830e098ad42194668f3f9045ec181e49de")
      override
          fun fieldMapping(fieldMapping: OpenSearchServerlessFieldMappingProperty.Builder.() -> Unit):
          Unit = fieldMapping(OpenSearchServerlessFieldMappingProperty(fieldMapping))

      /**
       * @param vectorIndexName The name of the vector store. 
       */
      override fun vectorIndexName(vectorIndexName: String) {
        cdkBuilder.vectorIndexName(vectorIndexName)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchServerlessConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchServerlessConfigurationProperty,
    ) : CdkObject(cdkObject),
        OpenSearchServerlessConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the OpenSearch Service vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchserverlessconfiguration.html#cfn-bedrock-knowledgebase-opensearchserverlessconfiguration-collectionarn)
       */
      override fun collectionArn(): String = unwrap(this).getCollectionArn()

      /**
       * Contains the names of the fields to which to map information about the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchserverlessconfiguration.html#cfn-bedrock-knowledgebase-opensearchserverlessconfiguration-fieldmapping)
       */
      override fun fieldMapping(): Any = unwrap(this).getFieldMapping()

      /**
       * The name of the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchserverlessconfiguration.html#cfn-bedrock-knowledgebase-opensearchserverlessconfiguration-vectorindexname)
       */
      override fun vectorIndexName(): String = unwrap(this).getVectorIndexName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OpenSearchServerlessConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchServerlessConfigurationProperty):
          OpenSearchServerlessConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenSearchServerlessConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenSearchServerlessConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchServerlessConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchServerlessConfigurationProperty
    }
  }

  /**
   * Contains the names of the fields to which to map information about the vector store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * OpenSearchServerlessFieldMappingProperty openSearchServerlessFieldMappingProperty =
   * OpenSearchServerlessFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .textField("textField")
   * .vectorField("vectorField")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchserverlessfieldmapping.html)
   */
  public interface OpenSearchServerlessFieldMappingProperty {
    /**
     * The name of the field in which Amazon Bedrock stores metadata about the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchserverlessfieldmapping.html#cfn-bedrock-knowledgebase-opensearchserverlessfieldmapping-metadatafield)
     */
    public fun metadataField(): String

    /**
     * The name of the field in which Amazon Bedrock stores the raw text from your data.
     *
     * The text is split according to the chunking strategy you choose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchserverlessfieldmapping.html#cfn-bedrock-knowledgebase-opensearchserverlessfieldmapping-textfield)
     */
    public fun textField(): String

    /**
     * The name of the field in which Amazon Bedrock stores the vector embeddings for your data
     * sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchserverlessfieldmapping.html#cfn-bedrock-knowledgebase-opensearchserverlessfieldmapping-vectorfield)
     */
    public fun vectorField(): String

    /**
     * A builder for [OpenSearchServerlessFieldMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metadataField The name of the field in which Amazon Bedrock stores metadata about
       * the vector store. 
       */
      public fun metadataField(metadataField: String)

      /**
       * @param textField The name of the field in which Amazon Bedrock stores the raw text from
       * your data. 
       * The text is split according to the chunking strategy you choose.
       */
      public fun textField(textField: String)

      /**
       * @param vectorField The name of the field in which Amazon Bedrock stores the vector
       * embeddings for your data sources. 
       */
      public fun vectorField(vectorField: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchServerlessFieldMappingProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchServerlessFieldMappingProperty.builder()

      /**
       * @param metadataField The name of the field in which Amazon Bedrock stores metadata about
       * the vector store. 
       */
      override fun metadataField(metadataField: String) {
        cdkBuilder.metadataField(metadataField)
      }

      /**
       * @param textField The name of the field in which Amazon Bedrock stores the raw text from
       * your data. 
       * The text is split according to the chunking strategy you choose.
       */
      override fun textField(textField: String) {
        cdkBuilder.textField(textField)
      }

      /**
       * @param vectorField The name of the field in which Amazon Bedrock stores the vector
       * embeddings for your data sources. 
       */
      override fun vectorField(vectorField: String) {
        cdkBuilder.vectorField(vectorField)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchServerlessFieldMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchServerlessFieldMappingProperty,
    ) : CdkObject(cdkObject),
        OpenSearchServerlessFieldMappingProperty {
      /**
       * The name of the field in which Amazon Bedrock stores metadata about the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchserverlessfieldmapping.html#cfn-bedrock-knowledgebase-opensearchserverlessfieldmapping-metadatafield)
       */
      override fun metadataField(): String = unwrap(this).getMetadataField()

      /**
       * The name of the field in which Amazon Bedrock stores the raw text from your data.
       *
       * The text is split according to the chunking strategy you choose.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchserverlessfieldmapping.html#cfn-bedrock-knowledgebase-opensearchserverlessfieldmapping-textfield)
       */
      override fun textField(): String = unwrap(this).getTextField()

      /**
       * The name of the field in which Amazon Bedrock stores the vector embeddings for your data
       * sources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-opensearchserverlessfieldmapping.html#cfn-bedrock-knowledgebase-opensearchserverlessfieldmapping-vectorfield)
       */
      override fun vectorField(): String = unwrap(this).getVectorField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OpenSearchServerlessFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchServerlessFieldMappingProperty):
          OpenSearchServerlessFieldMappingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenSearchServerlessFieldMappingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenSearchServerlessFieldMappingProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchServerlessFieldMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.OpenSearchServerlessFieldMappingProperty
    }
  }

  /**
   * Contains details about the storage configuration of the knowledge base in Pinecone.
   *
   * For more information, see [Create a vector index in
   * Pinecone](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-pinecone.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PineconeConfigurationProperty pineconeConfigurationProperty =
   * PineconeConfigurationProperty.builder()
   * .connectionString("connectionString")
   * .credentialsSecretArn("credentialsSecretArn")
   * .fieldMapping(PineconeFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .textField("textField")
   * .build())
   * // the properties below are optional
   * .namespace("namespace")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-pineconeconfiguration.html)
   */
  public interface PineconeConfigurationProperty {
    /**
     * The endpoint URL for your index management page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-pineconeconfiguration.html#cfn-bedrock-knowledgebase-pineconeconfiguration-connectionstring)
     */
    public fun connectionString(): String

    /**
     * The Amazon Resource Name (ARN) of the secret that you created in AWS Secrets Manager that is
     * linked to your Pinecone API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-pineconeconfiguration.html#cfn-bedrock-knowledgebase-pineconeconfiguration-credentialssecretarn)
     */
    public fun credentialsSecretArn(): String

    /**
     * Contains the names of the fields to which to map information about the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-pineconeconfiguration.html#cfn-bedrock-knowledgebase-pineconeconfiguration-fieldmapping)
     */
    public fun fieldMapping(): Any

    /**
     * The namespace to be used to write new data to your database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-pineconeconfiguration.html#cfn-bedrock-knowledgebase-pineconeconfiguration-namespace)
     */
    public fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * A builder for [PineconeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectionString The endpoint URL for your index management page. 
       */
      public fun connectionString(connectionString: String)

      /**
       * @param credentialsSecretArn The Amazon Resource Name (ARN) of the secret that you created
       * in AWS Secrets Manager that is linked to your Pinecone API key. 
       */
      public fun credentialsSecretArn(credentialsSecretArn: String)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      public fun fieldMapping(fieldMapping: IResolvable)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      public fun fieldMapping(fieldMapping: PineconeFieldMappingProperty)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ffbf056f34eed9fee60b10349505326f63292225d9fe7d0d4ce1d77123bf3ba")
      public fun fieldMapping(fieldMapping: PineconeFieldMappingProperty.Builder.() -> Unit)

      /**
       * @param namespace The namespace to be used to write new data to your database.
       */
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.PineconeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.PineconeConfigurationProperty.builder()

      /**
       * @param connectionString The endpoint URL for your index management page. 
       */
      override fun connectionString(connectionString: String) {
        cdkBuilder.connectionString(connectionString)
      }

      /**
       * @param credentialsSecretArn The Amazon Resource Name (ARN) of the secret that you created
       * in AWS Secrets Manager that is linked to your Pinecone API key. 
       */
      override fun credentialsSecretArn(credentialsSecretArn: String) {
        cdkBuilder.credentialsSecretArn(credentialsSecretArn)
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      override fun fieldMapping(fieldMapping: IResolvable) {
        cdkBuilder.fieldMapping(fieldMapping.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      override fun fieldMapping(fieldMapping: PineconeFieldMappingProperty) {
        cdkBuilder.fieldMapping(fieldMapping.let(PineconeFieldMappingProperty.Companion::unwrap))
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ffbf056f34eed9fee60b10349505326f63292225d9fe7d0d4ce1d77123bf3ba")
      override fun fieldMapping(fieldMapping: PineconeFieldMappingProperty.Builder.() -> Unit): Unit
          = fieldMapping(PineconeFieldMappingProperty(fieldMapping))

      /**
       * @param namespace The namespace to be used to write new data to your database.
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.PineconeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.PineconeConfigurationProperty,
    ) : CdkObject(cdkObject),
        PineconeConfigurationProperty {
      /**
       * The endpoint URL for your index management page.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-pineconeconfiguration.html#cfn-bedrock-knowledgebase-pineconeconfiguration-connectionstring)
       */
      override fun connectionString(): String = unwrap(this).getConnectionString()

      /**
       * The Amazon Resource Name (ARN) of the secret that you created in AWS Secrets Manager that
       * is linked to your Pinecone API key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-pineconeconfiguration.html#cfn-bedrock-knowledgebase-pineconeconfiguration-credentialssecretarn)
       */
      override fun credentialsSecretArn(): String = unwrap(this).getCredentialsSecretArn()

      /**
       * Contains the names of the fields to which to map information about the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-pineconeconfiguration.html#cfn-bedrock-knowledgebase-pineconeconfiguration-fieldmapping)
       */
      override fun fieldMapping(): Any = unwrap(this).getFieldMapping()

      /**
       * The namespace to be used to write new data to your database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-pineconeconfiguration.html#cfn-bedrock-knowledgebase-pineconeconfiguration-namespace)
       */
      override fun namespace(): String? = unwrap(this).getNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PineconeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.PineconeConfigurationProperty):
          PineconeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PineconeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PineconeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.PineconeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.PineconeConfigurationProperty
    }
  }

  /**
   * Contains the names of the fields to which to map information about the vector store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PineconeFieldMappingProperty pineconeFieldMappingProperty =
   * PineconeFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .textField("textField")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-pineconefieldmapping.html)
   */
  public interface PineconeFieldMappingProperty {
    /**
     * The name of the field in which Amazon Bedrock stores metadata about the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-pineconefieldmapping.html#cfn-bedrock-knowledgebase-pineconefieldmapping-metadatafield)
     */
    public fun metadataField(): String

    /**
     * The name of the field in which Amazon Bedrock stores the raw text from your data.
     *
     * The text is split according to the chunking strategy you choose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-pineconefieldmapping.html#cfn-bedrock-knowledgebase-pineconefieldmapping-textfield)
     */
    public fun textField(): String

    /**
     * A builder for [PineconeFieldMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metadataField The name of the field in which Amazon Bedrock stores metadata about
       * the vector store. 
       */
      public fun metadataField(metadataField: String)

      /**
       * @param textField The name of the field in which Amazon Bedrock stores the raw text from
       * your data. 
       * The text is split according to the chunking strategy you choose.
       */
      public fun textField(textField: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.PineconeFieldMappingProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.PineconeFieldMappingProperty.builder()

      /**
       * @param metadataField The name of the field in which Amazon Bedrock stores metadata about
       * the vector store. 
       */
      override fun metadataField(metadataField: String) {
        cdkBuilder.metadataField(metadataField)
      }

      /**
       * @param textField The name of the field in which Amazon Bedrock stores the raw text from
       * your data. 
       * The text is split according to the chunking strategy you choose.
       */
      override fun textField(textField: String) {
        cdkBuilder.textField(textField)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.PineconeFieldMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.PineconeFieldMappingProperty,
    ) : CdkObject(cdkObject),
        PineconeFieldMappingProperty {
      /**
       * The name of the field in which Amazon Bedrock stores metadata about the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-pineconefieldmapping.html#cfn-bedrock-knowledgebase-pineconefieldmapping-metadatafield)
       */
      override fun metadataField(): String = unwrap(this).getMetadataField()

      /**
       * The name of the field in which Amazon Bedrock stores the raw text from your data.
       *
       * The text is split according to the chunking strategy you choose.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-pineconefieldmapping.html#cfn-bedrock-knowledgebase-pineconefieldmapping-textfield)
       */
      override fun textField(): String = unwrap(this).getTextField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PineconeFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.PineconeFieldMappingProperty):
          PineconeFieldMappingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PineconeFieldMappingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PineconeFieldMappingProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.PineconeFieldMappingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.PineconeFieldMappingProperty
    }
  }

  /**
   * Contains information about a column in the current table for the query engine to consider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * QueryGenerationColumnProperty queryGenerationColumnProperty =
   * QueryGenerationColumnProperty.builder()
   * .description("description")
   * .inclusion("inclusion")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationcolumn.html)
   */
  public interface QueryGenerationColumnProperty {
    /**
     * A description of the column that helps the query engine understand the contents of the
     * column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationcolumn.html#cfn-bedrock-knowledgebase-querygenerationcolumn-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies whether to include or exclude the column during query generation.
     *
     * If you specify `EXCLUDE` , the column will be ignored. If you specify `INCLUDE` , all other
     * columns in the table will be ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationcolumn.html#cfn-bedrock-knowledgebase-querygenerationcolumn-inclusion)
     */
    public fun inclusion(): String? = unwrap(this).getInclusion()

    /**
     * The name of the column for which the other fields in this object apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationcolumn.html#cfn-bedrock-knowledgebase-querygenerationcolumn-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [QueryGenerationColumnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description A description of the column that helps the query engine understand the
       * contents of the column.
       */
      public fun description(description: String)

      /**
       * @param inclusion Specifies whether to include or exclude the column during query
       * generation.
       * If you specify `EXCLUDE` , the column will be ignored. If you specify `INCLUDE` , all other
       * columns in the table will be ignored.
       */
      public fun inclusion(inclusion: String)

      /**
       * @param name The name of the column for which the other fields in this object apply.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationColumnProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationColumnProperty.builder()

      /**
       * @param description A description of the column that helps the query engine understand the
       * contents of the column.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param inclusion Specifies whether to include or exclude the column during query
       * generation.
       * If you specify `EXCLUDE` , the column will be ignored. If you specify `INCLUDE` , all other
       * columns in the table will be ignored.
       */
      override fun inclusion(inclusion: String) {
        cdkBuilder.inclusion(inclusion)
      }

      /**
       * @param name The name of the column for which the other fields in this object apply.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationColumnProperty,
    ) : CdkObject(cdkObject),
        QueryGenerationColumnProperty {
      /**
       * A description of the column that helps the query engine understand the contents of the
       * column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationcolumn.html#cfn-bedrock-knowledgebase-querygenerationcolumn-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Specifies whether to include or exclude the column during query generation.
       *
       * If you specify `EXCLUDE` , the column will be ignored. If you specify `INCLUDE` , all other
       * columns in the table will be ignored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationcolumn.html#cfn-bedrock-knowledgebase-querygenerationcolumn-inclusion)
       */
      override fun inclusion(): String? = unwrap(this).getInclusion()

      /**
       * The name of the column for which the other fields in this object apply.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationcolumn.html#cfn-bedrock-knowledgebase-querygenerationcolumn-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryGenerationColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationColumnProperty):
          QueryGenerationColumnProperty = CdkObjectWrappers.wrap(cdkObject) as?
          QueryGenerationColumnProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryGenerationColumnProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationColumnProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationColumnProperty
    }
  }

  /**
   * Contains configurations for query generation.
   *
   * For more information, see [Build a knowledge base by connecting to a structured data
   * source](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-build-structured.html)
   * in the Amazon Bedrock User Guide..
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * QueryGenerationConfigurationProperty queryGenerationConfigurationProperty =
   * QueryGenerationConfigurationProperty.builder()
   * .executionTimeoutSeconds(123)
   * .generationContext(QueryGenerationContextProperty.builder()
   * .curatedQueries(List.of(CuratedQueryProperty.builder()
   * .naturalLanguage("naturalLanguage")
   * .sql("sql")
   * .build()))
   * .tables(List.of(QueryGenerationTableProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .columns(List.of(QueryGenerationColumnProperty.builder()
   * .description("description")
   * .inclusion("inclusion")
   * .name("name")
   * .build()))
   * .description("description")
   * .inclusion("inclusion")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationconfiguration.html)
   */
  public interface QueryGenerationConfigurationProperty {
    /**
     * The time after which query generation will time out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationconfiguration.html#cfn-bedrock-knowledgebase-querygenerationconfiguration-executiontimeoutseconds)
     */
    public fun executionTimeoutSeconds(): Number? = unwrap(this).getExecutionTimeoutSeconds()

    /**
     * Specifies configurations for context to use during query generation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationconfiguration.html#cfn-bedrock-knowledgebase-querygenerationconfiguration-generationcontext)
     */
    public fun generationContext(): Any? = unwrap(this).getGenerationContext()

    /**
     * A builder for [QueryGenerationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param executionTimeoutSeconds The time after which query generation will time out.
       */
      public fun executionTimeoutSeconds(executionTimeoutSeconds: Number)

      /**
       * @param generationContext Specifies configurations for context to use during query
       * generation.
       */
      public fun generationContext(generationContext: IResolvable)

      /**
       * @param generationContext Specifies configurations for context to use during query
       * generation.
       */
      public fun generationContext(generationContext: QueryGenerationContextProperty)

      /**
       * @param generationContext Specifies configurations for context to use during query
       * generation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("459b7327746e6fb475e6965e51d2a8d833186a6eced350b07d6a84421da2a80e")
      public
          fun generationContext(generationContext: QueryGenerationContextProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationConfigurationProperty.builder()

      /**
       * @param executionTimeoutSeconds The time after which query generation will time out.
       */
      override fun executionTimeoutSeconds(executionTimeoutSeconds: Number) {
        cdkBuilder.executionTimeoutSeconds(executionTimeoutSeconds)
      }

      /**
       * @param generationContext Specifies configurations for context to use during query
       * generation.
       */
      override fun generationContext(generationContext: IResolvable) {
        cdkBuilder.generationContext(generationContext.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param generationContext Specifies configurations for context to use during query
       * generation.
       */
      override fun generationContext(generationContext: QueryGenerationContextProperty) {
        cdkBuilder.generationContext(generationContext.let(QueryGenerationContextProperty.Companion::unwrap))
      }

      /**
       * @param generationContext Specifies configurations for context to use during query
       * generation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("459b7327746e6fb475e6965e51d2a8d833186a6eced350b07d6a84421da2a80e")
      override
          fun generationContext(generationContext: QueryGenerationContextProperty.Builder.() -> Unit):
          Unit = generationContext(QueryGenerationContextProperty(generationContext))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationConfigurationProperty,
    ) : CdkObject(cdkObject),
        QueryGenerationConfigurationProperty {
      /**
       * The time after which query generation will time out.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationconfiguration.html#cfn-bedrock-knowledgebase-querygenerationconfiguration-executiontimeoutseconds)
       */
      override fun executionTimeoutSeconds(): Number? = unwrap(this).getExecutionTimeoutSeconds()

      /**
       * Specifies configurations for context to use during query generation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationconfiguration.html#cfn-bedrock-knowledgebase-querygenerationconfiguration-generationcontext)
       */
      override fun generationContext(): Any? = unwrap(this).getGenerationContext()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          QueryGenerationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationConfigurationProperty):
          QueryGenerationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          QueryGenerationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryGenerationConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationConfigurationProperty
    }
  }

  /**
   * Contains configurations for context to use during query generation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * QueryGenerationContextProperty queryGenerationContextProperty =
   * QueryGenerationContextProperty.builder()
   * .curatedQueries(List.of(CuratedQueryProperty.builder()
   * .naturalLanguage("naturalLanguage")
   * .sql("sql")
   * .build()))
   * .tables(List.of(QueryGenerationTableProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .columns(List.of(QueryGenerationColumnProperty.builder()
   * .description("description")
   * .inclusion("inclusion")
   * .name("name")
   * .build()))
   * .description("description")
   * .inclusion("inclusion")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationcontext.html)
   */
  public interface QueryGenerationContextProperty {
    /**
     * An array of objects, each of which defines information about example queries to help the
     * query engine generate appropriate SQL queries.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationcontext.html#cfn-bedrock-knowledgebase-querygenerationcontext-curatedqueries)
     */
    public fun curatedQueries(): Any? = unwrap(this).getCuratedQueries()

    /**
     * An array of objects, each of which defines information about a table in the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationcontext.html#cfn-bedrock-knowledgebase-querygenerationcontext-tables)
     */
    public fun tables(): Any? = unwrap(this).getTables()

    /**
     * A builder for [QueryGenerationContextProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param curatedQueries An array of objects, each of which defines information about example
       * queries to help the query engine generate appropriate SQL queries.
       */
      public fun curatedQueries(curatedQueries: IResolvable)

      /**
       * @param curatedQueries An array of objects, each of which defines information about example
       * queries to help the query engine generate appropriate SQL queries.
       */
      public fun curatedQueries(curatedQueries: List<Any>)

      /**
       * @param curatedQueries An array of objects, each of which defines information about example
       * queries to help the query engine generate appropriate SQL queries.
       */
      public fun curatedQueries(vararg curatedQueries: Any)

      /**
       * @param tables An array of objects, each of which defines information about a table in the
       * database.
       */
      public fun tables(tables: IResolvable)

      /**
       * @param tables An array of objects, each of which defines information about a table in the
       * database.
       */
      public fun tables(tables: List<Any>)

      /**
       * @param tables An array of objects, each of which defines information about a table in the
       * database.
       */
      public fun tables(vararg tables: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationContextProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationContextProperty.builder()

      /**
       * @param curatedQueries An array of objects, each of which defines information about example
       * queries to help the query engine generate appropriate SQL queries.
       */
      override fun curatedQueries(curatedQueries: IResolvable) {
        cdkBuilder.curatedQueries(curatedQueries.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param curatedQueries An array of objects, each of which defines information about example
       * queries to help the query engine generate appropriate SQL queries.
       */
      override fun curatedQueries(curatedQueries: List<Any>) {
        cdkBuilder.curatedQueries(curatedQueries.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param curatedQueries An array of objects, each of which defines information about example
       * queries to help the query engine generate appropriate SQL queries.
       */
      override fun curatedQueries(vararg curatedQueries: Any): Unit =
          curatedQueries(curatedQueries.toList())

      /**
       * @param tables An array of objects, each of which defines information about a table in the
       * database.
       */
      override fun tables(tables: IResolvable) {
        cdkBuilder.tables(tables.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tables An array of objects, each of which defines information about a table in the
       * database.
       */
      override fun tables(tables: List<Any>) {
        cdkBuilder.tables(tables.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param tables An array of objects, each of which defines information about a table in the
       * database.
       */
      override fun tables(vararg tables: Any): Unit = tables(tables.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationContextProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationContextProperty,
    ) : CdkObject(cdkObject),
        QueryGenerationContextProperty {
      /**
       * An array of objects, each of which defines information about example queries to help the
       * query engine generate appropriate SQL queries.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationcontext.html#cfn-bedrock-knowledgebase-querygenerationcontext-curatedqueries)
       */
      override fun curatedQueries(): Any? = unwrap(this).getCuratedQueries()

      /**
       * An array of objects, each of which defines information about a table in the database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationcontext.html#cfn-bedrock-knowledgebase-querygenerationcontext-tables)
       */
      override fun tables(): Any? = unwrap(this).getTables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryGenerationContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationContextProperty):
          QueryGenerationContextProperty = CdkObjectWrappers.wrap(cdkObject) as?
          QueryGenerationContextProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryGenerationContextProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationContextProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationContextProperty
    }
  }

  /**
   * Contains information about a table for the query engine to consider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * QueryGenerationTableProperty queryGenerationTableProperty =
   * QueryGenerationTableProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .columns(List.of(QueryGenerationColumnProperty.builder()
   * .description("description")
   * .inclusion("inclusion")
   * .name("name")
   * .build()))
   * .description("description")
   * .inclusion("inclusion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationtable.html)
   */
  public interface QueryGenerationTableProperty {
    /**
     * An array of objects, each of which defines information about a column in the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationtable.html#cfn-bedrock-knowledgebase-querygenerationtable-columns)
     */
    public fun columns(): Any? = unwrap(this).getColumns()

    /**
     * A description of the table that helps the query engine understand the contents of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationtable.html#cfn-bedrock-knowledgebase-querygenerationtable-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies whether to include or exclude the table during query generation.
     *
     * If you specify `EXCLUDE` , the table will be ignored. If you specify `INCLUDE` , all other
     * tables will be ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationtable.html#cfn-bedrock-knowledgebase-querygenerationtable-inclusion)
     */
    public fun inclusion(): String? = unwrap(this).getInclusion()

    /**
     * The name of the table for which the other fields in this object apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationtable.html#cfn-bedrock-knowledgebase-querygenerationtable-name)
     */
    public fun name(): String

    /**
     * A builder for [QueryGenerationTableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columns An array of objects, each of which defines information about a column in the
       * table.
       */
      public fun columns(columns: IResolvable)

      /**
       * @param columns An array of objects, each of which defines information about a column in the
       * table.
       */
      public fun columns(columns: List<Any>)

      /**
       * @param columns An array of objects, each of which defines information about a column in the
       * table.
       */
      public fun columns(vararg columns: Any)

      /**
       * @param description A description of the table that helps the query engine understand the
       * contents of the table.
       */
      public fun description(description: String)

      /**
       * @param inclusion Specifies whether to include or exclude the table during query generation.
       * If you specify `EXCLUDE` , the table will be ignored. If you specify `INCLUDE` , all other
       * tables will be ignored.
       */
      public fun inclusion(inclusion: String)

      /**
       * @param name The name of the table for which the other fields in this object apply. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationTableProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationTableProperty.builder()

      /**
       * @param columns An array of objects, each of which defines information about a column in the
       * table.
       */
      override fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param columns An array of objects, each of which defines information about a column in the
       * table.
       */
      override fun columns(columns: List<Any>) {
        cdkBuilder.columns(columns.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param columns An array of objects, each of which defines information about a column in the
       * table.
       */
      override fun columns(vararg columns: Any): Unit = columns(columns.toList())

      /**
       * @param description A description of the table that helps the query engine understand the
       * contents of the table.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param inclusion Specifies whether to include or exclude the table during query generation.
       * If you specify `EXCLUDE` , the table will be ignored. If you specify `INCLUDE` , all other
       * tables will be ignored.
       */
      override fun inclusion(inclusion: String) {
        cdkBuilder.inclusion(inclusion)
      }

      /**
       * @param name The name of the table for which the other fields in this object apply. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationTableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationTableProperty,
    ) : CdkObject(cdkObject),
        QueryGenerationTableProperty {
      /**
       * An array of objects, each of which defines information about a column in the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationtable.html#cfn-bedrock-knowledgebase-querygenerationtable-columns)
       */
      override fun columns(): Any? = unwrap(this).getColumns()

      /**
       * A description of the table that helps the query engine understand the contents of the
       * table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationtable.html#cfn-bedrock-knowledgebase-querygenerationtable-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Specifies whether to include or exclude the table during query generation.
       *
       * If you specify `EXCLUDE` , the table will be ignored. If you specify `INCLUDE` , all other
       * tables will be ignored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationtable.html#cfn-bedrock-knowledgebase-querygenerationtable-inclusion)
       */
      override fun inclusion(): String? = unwrap(this).getInclusion()

      /**
       * The name of the table for which the other fields in this object apply.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-querygenerationtable.html#cfn-bedrock-knowledgebase-querygenerationtable-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryGenerationTableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationTableProperty):
          QueryGenerationTableProperty = CdkObjectWrappers.wrap(cdkObject) as?
          QueryGenerationTableProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryGenerationTableProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationTableProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.QueryGenerationTableProperty
    }
  }

  /**
   * Contains details about the storage configuration of the knowledge base in Amazon RDS.
   *
   * For more information, see [Create a vector index in Amazon
   * RDS](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RdsConfigurationProperty rdsConfigurationProperty = RdsConfigurationProperty.builder()
   * .credentialsSecretArn("credentialsSecretArn")
   * .databaseName("databaseName")
   * .fieldMapping(RdsFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .primaryKeyField("primaryKeyField")
   * .textField("textField")
   * .vectorField("vectorField")
   * // the properties below are optional
   * .customMetadataField("customMetadataField")
   * .build())
   * .resourceArn("resourceArn")
   * .tableName("tableName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsconfiguration.html)
   */
  public interface RdsConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the secret that you created in AWS Secrets Manager that is
     * linked to your Amazon RDS database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsconfiguration.html#cfn-bedrock-knowledgebase-rdsconfiguration-credentialssecretarn)
     */
    public fun credentialsSecretArn(): String

    /**
     * The name of your Amazon RDS database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsconfiguration.html#cfn-bedrock-knowledgebase-rdsconfiguration-databasename)
     */
    public fun databaseName(): String

    /**
     * Contains the names of the fields to which to map information about the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsconfiguration.html#cfn-bedrock-knowledgebase-rdsconfiguration-fieldmapping)
     */
    public fun fieldMapping(): Any

    /**
     * The Amazon Resource Name (ARN) of the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsconfiguration.html#cfn-bedrock-knowledgebase-rdsconfiguration-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * The name of the table in the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsconfiguration.html#cfn-bedrock-knowledgebase-rdsconfiguration-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [RdsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param credentialsSecretArn The Amazon Resource Name (ARN) of the secret that you created
       * in AWS Secrets Manager that is linked to your Amazon RDS database. 
       */
      public fun credentialsSecretArn(credentialsSecretArn: String)

      /**
       * @param databaseName The name of your Amazon RDS database. 
       */
      public fun databaseName(databaseName: String)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      public fun fieldMapping(fieldMapping: IResolvable)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      public fun fieldMapping(fieldMapping: RdsFieldMappingProperty)

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f70f239eb7b16bf37db6ff1c31e551302695b9b6758f2d88eb674c8aa2a244eb")
      public fun fieldMapping(fieldMapping: RdsFieldMappingProperty.Builder.() -> Unit)

      /**
       * @param resourceArn The Amazon Resource Name (ARN) of the vector store. 
       */
      public fun resourceArn(resourceArn: String)

      /**
       * @param tableName The name of the table in the database. 
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RdsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RdsConfigurationProperty.builder()

      /**
       * @param credentialsSecretArn The Amazon Resource Name (ARN) of the secret that you created
       * in AWS Secrets Manager that is linked to your Amazon RDS database. 
       */
      override fun credentialsSecretArn(credentialsSecretArn: String) {
        cdkBuilder.credentialsSecretArn(credentialsSecretArn)
      }

      /**
       * @param databaseName The name of your Amazon RDS database. 
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      override fun fieldMapping(fieldMapping: IResolvable) {
        cdkBuilder.fieldMapping(fieldMapping.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      override fun fieldMapping(fieldMapping: RdsFieldMappingProperty) {
        cdkBuilder.fieldMapping(fieldMapping.let(RdsFieldMappingProperty.Companion::unwrap))
      }

      /**
       * @param fieldMapping Contains the names of the fields to which to map information about the
       * vector store. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f70f239eb7b16bf37db6ff1c31e551302695b9b6758f2d88eb674c8aa2a244eb")
      override fun fieldMapping(fieldMapping: RdsFieldMappingProperty.Builder.() -> Unit): Unit =
          fieldMapping(RdsFieldMappingProperty(fieldMapping))

      /**
       * @param resourceArn The Amazon Resource Name (ARN) of the vector store. 
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      /**
       * @param tableName The name of the table in the database. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RdsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RdsConfigurationProperty,
    ) : CdkObject(cdkObject),
        RdsConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the secret that you created in AWS Secrets Manager that
       * is linked to your Amazon RDS database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsconfiguration.html#cfn-bedrock-knowledgebase-rdsconfiguration-credentialssecretarn)
       */
      override fun credentialsSecretArn(): String = unwrap(this).getCredentialsSecretArn()

      /**
       * The name of your Amazon RDS database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsconfiguration.html#cfn-bedrock-knowledgebase-rdsconfiguration-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * Contains the names of the fields to which to map information about the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsconfiguration.html#cfn-bedrock-knowledgebase-rdsconfiguration-fieldmapping)
       */
      override fun fieldMapping(): Any = unwrap(this).getFieldMapping()

      /**
       * The Amazon Resource Name (ARN) of the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsconfiguration.html#cfn-bedrock-knowledgebase-rdsconfiguration-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()

      /**
       * The name of the table in the database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsconfiguration.html#cfn-bedrock-knowledgebase-rdsconfiguration-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RdsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RdsConfigurationProperty):
          RdsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? RdsConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RdsConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RdsConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RdsConfigurationProperty
    }
  }

  /**
   * Contains the names of the fields to which to map information about the vector store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RdsFieldMappingProperty rdsFieldMappingProperty = RdsFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .primaryKeyField("primaryKeyField")
   * .textField("textField")
   * .vectorField("vectorField")
   * // the properties below are optional
   * .customMetadataField("customMetadataField")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsfieldmapping.html)
   */
  public interface RdsFieldMappingProperty {
    /**
     * Provide a name for the universal metadata field where Amazon Bedrock will store any custom
     * metadata from your data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsfieldmapping.html#cfn-bedrock-knowledgebase-rdsfieldmapping-custommetadatafield)
     */
    public fun customMetadataField(): String? = unwrap(this).getCustomMetadataField()

    /**
     * The name of the field in which Amazon Bedrock stores metadata about the vector store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsfieldmapping.html#cfn-bedrock-knowledgebase-rdsfieldmapping-metadatafield)
     */
    public fun metadataField(): String

    /**
     * The name of the field in which Amazon Bedrock stores the ID for each entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsfieldmapping.html#cfn-bedrock-knowledgebase-rdsfieldmapping-primarykeyfield)
     */
    public fun primaryKeyField(): String

    /**
     * The name of the field in which Amazon Bedrock stores the raw text from your data.
     *
     * The text is split according to the chunking strategy you choose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsfieldmapping.html#cfn-bedrock-knowledgebase-rdsfieldmapping-textfield)
     */
    public fun textField(): String

    /**
     * The name of the field in which Amazon Bedrock stores the vector embeddings for your data
     * sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsfieldmapping.html#cfn-bedrock-knowledgebase-rdsfieldmapping-vectorfield)
     */
    public fun vectorField(): String

    /**
     * A builder for [RdsFieldMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customMetadataField Provide a name for the universal metadata field where Amazon
       * Bedrock will store any custom metadata from your data source.
       */
      public fun customMetadataField(customMetadataField: String)

      /**
       * @param metadataField The name of the field in which Amazon Bedrock stores metadata about
       * the vector store. 
       */
      public fun metadataField(metadataField: String)

      /**
       * @param primaryKeyField The name of the field in which Amazon Bedrock stores the ID for each
       * entry. 
       */
      public fun primaryKeyField(primaryKeyField: String)

      /**
       * @param textField The name of the field in which Amazon Bedrock stores the raw text from
       * your data. 
       * The text is split according to the chunking strategy you choose.
       */
      public fun textField(textField: String)

      /**
       * @param vectorField The name of the field in which Amazon Bedrock stores the vector
       * embeddings for your data sources. 
       */
      public fun vectorField(vectorField: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RdsFieldMappingProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RdsFieldMappingProperty.builder()

      /**
       * @param customMetadataField Provide a name for the universal metadata field where Amazon
       * Bedrock will store any custom metadata from your data source.
       */
      override fun customMetadataField(customMetadataField: String) {
        cdkBuilder.customMetadataField(customMetadataField)
      }

      /**
       * @param metadataField The name of the field in which Amazon Bedrock stores metadata about
       * the vector store. 
       */
      override fun metadataField(metadataField: String) {
        cdkBuilder.metadataField(metadataField)
      }

      /**
       * @param primaryKeyField The name of the field in which Amazon Bedrock stores the ID for each
       * entry. 
       */
      override fun primaryKeyField(primaryKeyField: String) {
        cdkBuilder.primaryKeyField(primaryKeyField)
      }

      /**
       * @param textField The name of the field in which Amazon Bedrock stores the raw text from
       * your data. 
       * The text is split according to the chunking strategy you choose.
       */
      override fun textField(textField: String) {
        cdkBuilder.textField(textField)
      }

      /**
       * @param vectorField The name of the field in which Amazon Bedrock stores the vector
       * embeddings for your data sources. 
       */
      override fun vectorField(vectorField: String) {
        cdkBuilder.vectorField(vectorField)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RdsFieldMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RdsFieldMappingProperty,
    ) : CdkObject(cdkObject),
        RdsFieldMappingProperty {
      /**
       * Provide a name for the universal metadata field where Amazon Bedrock will store any custom
       * metadata from your data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsfieldmapping.html#cfn-bedrock-knowledgebase-rdsfieldmapping-custommetadatafield)
       */
      override fun customMetadataField(): String? = unwrap(this).getCustomMetadataField()

      /**
       * The name of the field in which Amazon Bedrock stores metadata about the vector store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsfieldmapping.html#cfn-bedrock-knowledgebase-rdsfieldmapping-metadatafield)
       */
      override fun metadataField(): String = unwrap(this).getMetadataField()

      /**
       * The name of the field in which Amazon Bedrock stores the ID for each entry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsfieldmapping.html#cfn-bedrock-knowledgebase-rdsfieldmapping-primarykeyfield)
       */
      override fun primaryKeyField(): String = unwrap(this).getPrimaryKeyField()

      /**
       * The name of the field in which Amazon Bedrock stores the raw text from your data.
       *
       * The text is split according to the chunking strategy you choose.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsfieldmapping.html#cfn-bedrock-knowledgebase-rdsfieldmapping-textfield)
       */
      override fun textField(): String = unwrap(this).getTextField()

      /**
       * The name of the field in which Amazon Bedrock stores the vector embeddings for your data
       * sources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsfieldmapping.html#cfn-bedrock-knowledgebase-rdsfieldmapping-vectorfield)
       */
      override fun vectorField(): String = unwrap(this).getVectorField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RdsFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RdsFieldMappingProperty):
          RdsFieldMappingProperty = CdkObjectWrappers.wrap(cdkObject) as? RdsFieldMappingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RdsFieldMappingProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RdsFieldMappingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RdsFieldMappingProperty
    }
  }

  /**
   * Contains configurations for an Amazon Redshift database.
   *
   * For more information, see [Build a knowledge base by connecting to a structured data
   * source](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-build-structured.html)
   * in the Amazon Bedrock User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RedshiftConfigurationProperty redshiftConfigurationProperty =
   * RedshiftConfigurationProperty.builder()
   * .queryEngineConfiguration(RedshiftQueryEngineConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .provisionedConfiguration(RedshiftProvisionedConfigurationProperty.builder()
   * .authConfiguration(RedshiftProvisionedAuthConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .databaseUser("databaseUser")
   * .usernamePasswordSecretArn("usernamePasswordSecretArn")
   * .build())
   * .clusterIdentifier("clusterIdentifier")
   * .build())
   * .serverlessConfiguration(RedshiftServerlessConfigurationProperty.builder()
   * .authConfiguration(RedshiftServerlessAuthConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .usernamePasswordSecretArn("usernamePasswordSecretArn")
   * .build())
   * .workgroupArn("workgroupArn")
   * .build())
   * .build())
   * .storageConfigurations(List.of(RedshiftQueryEngineStorageConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .awsDataCatalogConfiguration(RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty.builder()
   * .tableNames(List.of("tableNames"))
   * .build())
   * .redshiftConfiguration(RedshiftQueryEngineRedshiftStorageConfigurationProperty.builder()
   * .databaseName("databaseName")
   * .build())
   * .build()))
   * // the properties below are optional
   * .queryGenerationConfiguration(QueryGenerationConfigurationProperty.builder()
   * .executionTimeoutSeconds(123)
   * .generationContext(QueryGenerationContextProperty.builder()
   * .curatedQueries(List.of(CuratedQueryProperty.builder()
   * .naturalLanguage("naturalLanguage")
   * .sql("sql")
   * .build()))
   * .tables(List.of(QueryGenerationTableProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .columns(List.of(QueryGenerationColumnProperty.builder()
   * .description("description")
   * .inclusion("inclusion")
   * .name("name")
   * .build()))
   * .description("description")
   * .inclusion("inclusion")
   * .build()))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftconfiguration.html)
   */
  public interface RedshiftConfigurationProperty {
    /**
     * Specifies configurations for an Amazon Redshift query engine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftconfiguration.html#cfn-bedrock-knowledgebase-redshiftconfiguration-queryengineconfiguration)
     */
    public fun queryEngineConfiguration(): Any

    /**
     * Specifies configurations for generating queries.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftconfiguration.html#cfn-bedrock-knowledgebase-redshiftconfiguration-querygenerationconfiguration)
     */
    public fun queryGenerationConfiguration(): Any? = unwrap(this).getQueryGenerationConfiguration()

    /**
     * Specifies configurations for Amazon Redshift database storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftconfiguration.html#cfn-bedrock-knowledgebase-redshiftconfiguration-storageconfigurations)
     */
    public fun storageConfigurations(): Any

    /**
     * A builder for [RedshiftConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param queryEngineConfiguration Specifies configurations for an Amazon Redshift query
       * engine. 
       */
      public fun queryEngineConfiguration(queryEngineConfiguration: IResolvable)

      /**
       * @param queryEngineConfiguration Specifies configurations for an Amazon Redshift query
       * engine. 
       */
      public
          fun queryEngineConfiguration(queryEngineConfiguration: RedshiftQueryEngineConfigurationProperty)

      /**
       * @param queryEngineConfiguration Specifies configurations for an Amazon Redshift query
       * engine. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("905984c4c9801f1f3e298c28f4490f5c26a275ff6bba8590cd98337688846a12")
      public
          fun queryEngineConfiguration(queryEngineConfiguration: RedshiftQueryEngineConfigurationProperty.Builder.() -> Unit)

      /**
       * @param queryGenerationConfiguration Specifies configurations for generating queries.
       */
      public fun queryGenerationConfiguration(queryGenerationConfiguration: IResolvable)

      /**
       * @param queryGenerationConfiguration Specifies configurations for generating queries.
       */
      public
          fun queryGenerationConfiguration(queryGenerationConfiguration: QueryGenerationConfigurationProperty)

      /**
       * @param queryGenerationConfiguration Specifies configurations for generating queries.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("985b6b671525b1e4d4e1b48a70f9158e59d680ba60df5789b6365a588eb14298")
      public
          fun queryGenerationConfiguration(queryGenerationConfiguration: QueryGenerationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param storageConfigurations Specifies configurations for Amazon Redshift database storage.
       * 
       */
      public fun storageConfigurations(storageConfigurations: IResolvable)

      /**
       * @param storageConfigurations Specifies configurations for Amazon Redshift database storage.
       * 
       */
      public fun storageConfigurations(storageConfigurations: List<Any>)

      /**
       * @param storageConfigurations Specifies configurations for Amazon Redshift database storage.
       * 
       */
      public fun storageConfigurations(vararg storageConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftConfigurationProperty.builder()

      /**
       * @param queryEngineConfiguration Specifies configurations for an Amazon Redshift query
       * engine. 
       */
      override fun queryEngineConfiguration(queryEngineConfiguration: IResolvable) {
        cdkBuilder.queryEngineConfiguration(queryEngineConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param queryEngineConfiguration Specifies configurations for an Amazon Redshift query
       * engine. 
       */
      override
          fun queryEngineConfiguration(queryEngineConfiguration: RedshiftQueryEngineConfigurationProperty) {
        cdkBuilder.queryEngineConfiguration(queryEngineConfiguration.let(RedshiftQueryEngineConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param queryEngineConfiguration Specifies configurations for an Amazon Redshift query
       * engine. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("905984c4c9801f1f3e298c28f4490f5c26a275ff6bba8590cd98337688846a12")
      override
          fun queryEngineConfiguration(queryEngineConfiguration: RedshiftQueryEngineConfigurationProperty.Builder.() -> Unit):
          Unit =
          queryEngineConfiguration(RedshiftQueryEngineConfigurationProperty(queryEngineConfiguration))

      /**
       * @param queryGenerationConfiguration Specifies configurations for generating queries.
       */
      override fun queryGenerationConfiguration(queryGenerationConfiguration: IResolvable) {
        cdkBuilder.queryGenerationConfiguration(queryGenerationConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param queryGenerationConfiguration Specifies configurations for generating queries.
       */
      override
          fun queryGenerationConfiguration(queryGenerationConfiguration: QueryGenerationConfigurationProperty) {
        cdkBuilder.queryGenerationConfiguration(queryGenerationConfiguration.let(QueryGenerationConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param queryGenerationConfiguration Specifies configurations for generating queries.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("985b6b671525b1e4d4e1b48a70f9158e59d680ba60df5789b6365a588eb14298")
      override
          fun queryGenerationConfiguration(queryGenerationConfiguration: QueryGenerationConfigurationProperty.Builder.() -> Unit):
          Unit =
          queryGenerationConfiguration(QueryGenerationConfigurationProperty(queryGenerationConfiguration))

      /**
       * @param storageConfigurations Specifies configurations for Amazon Redshift database storage.
       * 
       */
      override fun storageConfigurations(storageConfigurations: IResolvable) {
        cdkBuilder.storageConfigurations(storageConfigurations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param storageConfigurations Specifies configurations for Amazon Redshift database storage.
       * 
       */
      override fun storageConfigurations(storageConfigurations: List<Any>) {
        cdkBuilder.storageConfigurations(storageConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param storageConfigurations Specifies configurations for Amazon Redshift database storage.
       * 
       */
      override fun storageConfigurations(vararg storageConfigurations: Any): Unit =
          storageConfigurations(storageConfigurations.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftConfigurationProperty,
    ) : CdkObject(cdkObject),
        RedshiftConfigurationProperty {
      /**
       * Specifies configurations for an Amazon Redshift query engine.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftconfiguration.html#cfn-bedrock-knowledgebase-redshiftconfiguration-queryengineconfiguration)
       */
      override fun queryEngineConfiguration(): Any = unwrap(this).getQueryEngineConfiguration()

      /**
       * Specifies configurations for generating queries.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftconfiguration.html#cfn-bedrock-knowledgebase-redshiftconfiguration-querygenerationconfiguration)
       */
      override fun queryGenerationConfiguration(): Any? =
          unwrap(this).getQueryGenerationConfiguration()

      /**
       * Specifies configurations for Amazon Redshift database storage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftconfiguration.html#cfn-bedrock-knowledgebase-redshiftconfiguration-storageconfigurations)
       */
      override fun storageConfigurations(): Any = unwrap(this).getStorageConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftConfigurationProperty):
          RedshiftConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RedshiftConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftConfigurationProperty
    }
  }

  /**
   * Contains configurations for authentication to an Amazon Redshift provisioned data warehouse.
   *
   * Specify the type of authentication to use in the `type` field and include the corresponding
   * field. If you specify IAM authentication, you don't need to include another field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RedshiftProvisionedAuthConfigurationProperty redshiftProvisionedAuthConfigurationProperty =
   * RedshiftProvisionedAuthConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .databaseUser("databaseUser")
   * .usernamePasswordSecretArn("usernamePasswordSecretArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftprovisionedauthconfiguration.html)
   */
  public interface RedshiftProvisionedAuthConfigurationProperty {
    /**
     * The database username for authentication to an Amazon Redshift provisioned data warehouse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftprovisionedauthconfiguration.html#cfn-bedrock-knowledgebase-redshiftprovisionedauthconfiguration-databaseuser)
     */
    public fun databaseUser(): String? = unwrap(this).getDatabaseUser()

    /**
     * The type of authentication to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftprovisionedauthconfiguration.html#cfn-bedrock-knowledgebase-redshiftprovisionedauthconfiguration-type)
     */
    public fun type(): String

    /**
     * The ARN of an Secrets Manager secret for authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftprovisionedauthconfiguration.html#cfn-bedrock-knowledgebase-redshiftprovisionedauthconfiguration-usernamepasswordsecretarn)
     */
    public fun usernamePasswordSecretArn(): String? = unwrap(this).getUsernamePasswordSecretArn()

    /**
     * A builder for [RedshiftProvisionedAuthConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param databaseUser The database username for authentication to an Amazon Redshift
       * provisioned data warehouse.
       */
      public fun databaseUser(databaseUser: String)

      /**
       * @param type The type of authentication to use. 
       */
      public fun type(type: String)

      /**
       * @param usernamePasswordSecretArn The ARN of an Secrets Manager secret for authentication.
       */
      public fun usernamePasswordSecretArn(usernamePasswordSecretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftProvisionedAuthConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftProvisionedAuthConfigurationProperty.builder()

      /**
       * @param databaseUser The database username for authentication to an Amazon Redshift
       * provisioned data warehouse.
       */
      override fun databaseUser(databaseUser: String) {
        cdkBuilder.databaseUser(databaseUser)
      }

      /**
       * @param type The type of authentication to use. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param usernamePasswordSecretArn The ARN of an Secrets Manager secret for authentication.
       */
      override fun usernamePasswordSecretArn(usernamePasswordSecretArn: String) {
        cdkBuilder.usernamePasswordSecretArn(usernamePasswordSecretArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftProvisionedAuthConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftProvisionedAuthConfigurationProperty,
    ) : CdkObject(cdkObject),
        RedshiftProvisionedAuthConfigurationProperty {
      /**
       * The database username for authentication to an Amazon Redshift provisioned data warehouse.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftprovisionedauthconfiguration.html#cfn-bedrock-knowledgebase-redshiftprovisionedauthconfiguration-databaseuser)
       */
      override fun databaseUser(): String? = unwrap(this).getDatabaseUser()

      /**
       * The type of authentication to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftprovisionedauthconfiguration.html#cfn-bedrock-knowledgebase-redshiftprovisionedauthconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The ARN of an Secrets Manager secret for authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftprovisionedauthconfiguration.html#cfn-bedrock-knowledgebase-redshiftprovisionedauthconfiguration-usernamepasswordsecretarn)
       */
      override fun usernamePasswordSecretArn(): String? =
          unwrap(this).getUsernamePasswordSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftProvisionedAuthConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftProvisionedAuthConfigurationProperty):
          RedshiftProvisionedAuthConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RedshiftProvisionedAuthConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftProvisionedAuthConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftProvisionedAuthConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftProvisionedAuthConfigurationProperty
    }
  }

  /**
   * Contains configurations for a provisioned Amazon Redshift query engine.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RedshiftProvisionedConfigurationProperty redshiftProvisionedConfigurationProperty =
   * RedshiftProvisionedConfigurationProperty.builder()
   * .authConfiguration(RedshiftProvisionedAuthConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .databaseUser("databaseUser")
   * .usernamePasswordSecretArn("usernamePasswordSecretArn")
   * .build())
   * .clusterIdentifier("clusterIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftprovisionedconfiguration.html)
   */
  public interface RedshiftProvisionedConfigurationProperty {
    /**
     * Specifies configurations for authentication to Amazon Redshift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftprovisionedconfiguration.html#cfn-bedrock-knowledgebase-redshiftprovisionedconfiguration-authconfiguration)
     */
    public fun authConfiguration(): Any

    /**
     * The ID of the Amazon Redshift cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftprovisionedconfiguration.html#cfn-bedrock-knowledgebase-redshiftprovisionedconfiguration-clusteridentifier)
     */
    public fun clusterIdentifier(): String

    /**
     * A builder for [RedshiftProvisionedConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authConfiguration Specifies configurations for authentication to Amazon Redshift. 
       */
      public fun authConfiguration(authConfiguration: IResolvable)

      /**
       * @param authConfiguration Specifies configurations for authentication to Amazon Redshift. 
       */
      public fun authConfiguration(authConfiguration: RedshiftProvisionedAuthConfigurationProperty)

      /**
       * @param authConfiguration Specifies configurations for authentication to Amazon Redshift. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("985e9a32797badcef97519710d3c6bd630504a605cee4333279b98399fb79dd4")
      public
          fun authConfiguration(authConfiguration: RedshiftProvisionedAuthConfigurationProperty.Builder.() -> Unit)

      /**
       * @param clusterIdentifier The ID of the Amazon Redshift cluster. 
       */
      public fun clusterIdentifier(clusterIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftProvisionedConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftProvisionedConfigurationProperty.builder()

      /**
       * @param authConfiguration Specifies configurations for authentication to Amazon Redshift. 
       */
      override fun authConfiguration(authConfiguration: IResolvable) {
        cdkBuilder.authConfiguration(authConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param authConfiguration Specifies configurations for authentication to Amazon Redshift. 
       */
      override
          fun authConfiguration(authConfiguration: RedshiftProvisionedAuthConfigurationProperty) {
        cdkBuilder.authConfiguration(authConfiguration.let(RedshiftProvisionedAuthConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param authConfiguration Specifies configurations for authentication to Amazon Redshift. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("985e9a32797badcef97519710d3c6bd630504a605cee4333279b98399fb79dd4")
      override
          fun authConfiguration(authConfiguration: RedshiftProvisionedAuthConfigurationProperty.Builder.() -> Unit):
          Unit = authConfiguration(RedshiftProvisionedAuthConfigurationProperty(authConfiguration))

      /**
       * @param clusterIdentifier The ID of the Amazon Redshift cluster. 
       */
      override fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftProvisionedConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftProvisionedConfigurationProperty,
    ) : CdkObject(cdkObject),
        RedshiftProvisionedConfigurationProperty {
      /**
       * Specifies configurations for authentication to Amazon Redshift.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftprovisionedconfiguration.html#cfn-bedrock-knowledgebase-redshiftprovisionedconfiguration-authconfiguration)
       */
      override fun authConfiguration(): Any = unwrap(this).getAuthConfiguration()

      /**
       * The ID of the Amazon Redshift cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftprovisionedconfiguration.html#cfn-bedrock-knowledgebase-redshiftprovisionedconfiguration-clusteridentifier)
       */
      override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftProvisionedConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftProvisionedConfigurationProperty):
          RedshiftProvisionedConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RedshiftProvisionedConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftProvisionedConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftProvisionedConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftProvisionedConfigurationProperty
    }
  }

  /**
   * Contains configurations for storage in AWS Glue Data Catalog.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty
   * redshiftQueryEngineAwsDataCatalogStorageConfigurationProperty =
   * RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty.builder()
   * .tableNames(List.of("tableNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryengineawsdatacatalogstorageconfiguration.html)
   */
  public interface RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty {
    /**
     * A list of names of the tables to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryengineawsdatacatalogstorageconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryengineawsdatacatalogstorageconfiguration-tablenames)
     */
    public fun tableNames(): List<String>

    /**
     * A builder for [RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param tableNames A list of names of the tables to use. 
       */
      public fun tableNames(tableNames: List<String>)

      /**
       * @param tableNames A list of names of the tables to use. 
       */
      public fun tableNames(vararg tableNames: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty.builder()

      /**
       * @param tableNames A list of names of the tables to use. 
       */
      override fun tableNames(tableNames: List<String>) {
        cdkBuilder.tableNames(tableNames)
      }

      /**
       * @param tableNames A list of names of the tables to use. 
       */
      override fun tableNames(vararg tableNames: String): Unit = tableNames(tableNames.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty,
    ) : CdkObject(cdkObject),
        RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty {
      /**
       * A list of names of the tables to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryengineawsdatacatalogstorageconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryengineawsdatacatalogstorageconfiguration-tablenames)
       */
      override fun tableNames(): List<String> = unwrap(this).getTableNames()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty):
          RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty =
          CdkObjectWrappers.wrap(cdkObject) as?
          RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty
    }
  }

  /**
   * Contains configurations for an Amazon Redshift query engine.
   *
   * Specify the type of query engine in `type` and include the corresponding field. For more
   * information, see [Build a knowledge base by connecting to a structured data
   * source](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-build-structured.html)
   * in the Amazon Bedrock User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RedshiftQueryEngineConfigurationProperty redshiftQueryEngineConfigurationProperty =
   * RedshiftQueryEngineConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .provisionedConfiguration(RedshiftProvisionedConfigurationProperty.builder()
   * .authConfiguration(RedshiftProvisionedAuthConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .databaseUser("databaseUser")
   * .usernamePasswordSecretArn("usernamePasswordSecretArn")
   * .build())
   * .clusterIdentifier("clusterIdentifier")
   * .build())
   * .serverlessConfiguration(RedshiftServerlessConfigurationProperty.builder()
   * .authConfiguration(RedshiftServerlessAuthConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .usernamePasswordSecretArn("usernamePasswordSecretArn")
   * .build())
   * .workgroupArn("workgroupArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryengineconfiguration.html)
   */
  public interface RedshiftQueryEngineConfigurationProperty {
    /**
     * Specifies configurations for a provisioned Amazon Redshift query engine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryengineconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryengineconfiguration-provisionedconfiguration)
     */
    public fun provisionedConfiguration(): Any? = unwrap(this).getProvisionedConfiguration()

    /**
     * Specifies configurations for a serverless Amazon Redshift query engine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryengineconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryengineconfiguration-serverlessconfiguration)
     */
    public fun serverlessConfiguration(): Any? = unwrap(this).getServerlessConfiguration()

    /**
     * The type of query engine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryengineconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryengineconfiguration-type)
     */
    public fun type(): String

    /**
     * A builder for [RedshiftQueryEngineConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param provisionedConfiguration Specifies configurations for a provisioned Amazon Redshift
       * query engine.
       */
      public fun provisionedConfiguration(provisionedConfiguration: IResolvable)

      /**
       * @param provisionedConfiguration Specifies configurations for a provisioned Amazon Redshift
       * query engine.
       */
      public
          fun provisionedConfiguration(provisionedConfiguration: RedshiftProvisionedConfigurationProperty)

      /**
       * @param provisionedConfiguration Specifies configurations for a provisioned Amazon Redshift
       * query engine.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41fefc4e7648a051d31e7745768162b0ed0261cd46f28c328f795af8fe934c39")
      public
          fun provisionedConfiguration(provisionedConfiguration: RedshiftProvisionedConfigurationProperty.Builder.() -> Unit)

      /**
       * @param serverlessConfiguration Specifies configurations for a serverless Amazon Redshift
       * query engine.
       */
      public fun serverlessConfiguration(serverlessConfiguration: IResolvable)

      /**
       * @param serverlessConfiguration Specifies configurations for a serverless Amazon Redshift
       * query engine.
       */
      public
          fun serverlessConfiguration(serverlessConfiguration: RedshiftServerlessConfigurationProperty)

      /**
       * @param serverlessConfiguration Specifies configurations for a serverless Amazon Redshift
       * query engine.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed69b2ada9fc0843376dcdb3a2619c6df61e3ea143ee5accb1bff313307028de")
      public
          fun serverlessConfiguration(serverlessConfiguration: RedshiftServerlessConfigurationProperty.Builder.() -> Unit)

      /**
       * @param type The type of query engine. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineConfigurationProperty.builder()

      /**
       * @param provisionedConfiguration Specifies configurations for a provisioned Amazon Redshift
       * query engine.
       */
      override fun provisionedConfiguration(provisionedConfiguration: IResolvable) {
        cdkBuilder.provisionedConfiguration(provisionedConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param provisionedConfiguration Specifies configurations for a provisioned Amazon Redshift
       * query engine.
       */
      override
          fun provisionedConfiguration(provisionedConfiguration: RedshiftProvisionedConfigurationProperty) {
        cdkBuilder.provisionedConfiguration(provisionedConfiguration.let(RedshiftProvisionedConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param provisionedConfiguration Specifies configurations for a provisioned Amazon Redshift
       * query engine.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41fefc4e7648a051d31e7745768162b0ed0261cd46f28c328f795af8fe934c39")
      override
          fun provisionedConfiguration(provisionedConfiguration: RedshiftProvisionedConfigurationProperty.Builder.() -> Unit):
          Unit =
          provisionedConfiguration(RedshiftProvisionedConfigurationProperty(provisionedConfiguration))

      /**
       * @param serverlessConfiguration Specifies configurations for a serverless Amazon Redshift
       * query engine.
       */
      override fun serverlessConfiguration(serverlessConfiguration: IResolvable) {
        cdkBuilder.serverlessConfiguration(serverlessConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param serverlessConfiguration Specifies configurations for a serverless Amazon Redshift
       * query engine.
       */
      override
          fun serverlessConfiguration(serverlessConfiguration: RedshiftServerlessConfigurationProperty) {
        cdkBuilder.serverlessConfiguration(serverlessConfiguration.let(RedshiftServerlessConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param serverlessConfiguration Specifies configurations for a serverless Amazon Redshift
       * query engine.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed69b2ada9fc0843376dcdb3a2619c6df61e3ea143ee5accb1bff313307028de")
      override
          fun serverlessConfiguration(serverlessConfiguration: RedshiftServerlessConfigurationProperty.Builder.() -> Unit):
          Unit =
          serverlessConfiguration(RedshiftServerlessConfigurationProperty(serverlessConfiguration))

      /**
       * @param type The type of query engine. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineConfigurationProperty,
    ) : CdkObject(cdkObject),
        RedshiftQueryEngineConfigurationProperty {
      /**
       * Specifies configurations for a provisioned Amazon Redshift query engine.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryengineconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryengineconfiguration-provisionedconfiguration)
       */
      override fun provisionedConfiguration(): Any? = unwrap(this).getProvisionedConfiguration()

      /**
       * Specifies configurations for a serverless Amazon Redshift query engine.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryengineconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryengineconfiguration-serverlessconfiguration)
       */
      override fun serverlessConfiguration(): Any? = unwrap(this).getServerlessConfiguration()

      /**
       * The type of query engine.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryengineconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryengineconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftQueryEngineConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineConfigurationProperty):
          RedshiftQueryEngineConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RedshiftQueryEngineConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftQueryEngineConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineConfigurationProperty
    }
  }

  /**
   * Contains configurations for storage in Amazon Redshift.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RedshiftQueryEngineRedshiftStorageConfigurationProperty
   * redshiftQueryEngineRedshiftStorageConfigurationProperty =
   * RedshiftQueryEngineRedshiftStorageConfigurationProperty.builder()
   * .databaseName("databaseName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryengineredshiftstorageconfiguration.html)
   */
  public interface RedshiftQueryEngineRedshiftStorageConfigurationProperty {
    /**
     * The name of the Amazon Redshift database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryengineredshiftstorageconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryengineredshiftstorageconfiguration-databasename)
     */
    public fun databaseName(): String

    /**
     * A builder for [RedshiftQueryEngineRedshiftStorageConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param databaseName The name of the Amazon Redshift database. 
       */
      public fun databaseName(databaseName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineRedshiftStorageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineRedshiftStorageConfigurationProperty.builder()

      /**
       * @param databaseName The name of the Amazon Redshift database. 
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineRedshiftStorageConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineRedshiftStorageConfigurationProperty,
    ) : CdkObject(cdkObject),
        RedshiftQueryEngineRedshiftStorageConfigurationProperty {
      /**
       * The name of the Amazon Redshift database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryengineredshiftstorageconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryengineredshiftstorageconfiguration-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftQueryEngineRedshiftStorageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineRedshiftStorageConfigurationProperty):
          RedshiftQueryEngineRedshiftStorageConfigurationProperty =
          CdkObjectWrappers.wrap(cdkObject) as?
          RedshiftQueryEngineRedshiftStorageConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftQueryEngineRedshiftStorageConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineRedshiftStorageConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineRedshiftStorageConfigurationProperty
    }
  }

  /**
   * Contains configurations for Amazon Redshift data storage.
   *
   * Specify the data storage service to use in the `type` field and include the corresponding
   * field. For more information, see [Build a knowledge base by connecting to a structured data
   * source](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-build-structured.html)
   * in the Amazon Bedrock User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RedshiftQueryEngineStorageConfigurationProperty redshiftQueryEngineStorageConfigurationProperty
   * = RedshiftQueryEngineStorageConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .awsDataCatalogConfiguration(RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty.builder()
   * .tableNames(List.of("tableNames"))
   * .build())
   * .redshiftConfiguration(RedshiftQueryEngineRedshiftStorageConfigurationProperty.builder()
   * .databaseName("databaseName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryenginestorageconfiguration.html)
   */
  public interface RedshiftQueryEngineStorageConfigurationProperty {
    /**
     * Specifies configurations for storage in AWS Glue Data Catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryenginestorageconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryenginestorageconfiguration-awsdatacatalogconfiguration)
     */
    public fun awsDataCatalogConfiguration(): Any? = unwrap(this).getAwsDataCatalogConfiguration()

    /**
     * Specifies configurations for storage in Amazon Redshift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryenginestorageconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryenginestorageconfiguration-redshiftconfiguration)
     */
    public fun redshiftConfiguration(): Any? = unwrap(this).getRedshiftConfiguration()

    /**
     * The data storage service to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryenginestorageconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryenginestorageconfiguration-type)
     */
    public fun type(): String

    /**
     * A builder for [RedshiftQueryEngineStorageConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsDataCatalogConfiguration Specifies configurations for storage in AWS Glue Data
       * Catalog.
       */
      public fun awsDataCatalogConfiguration(awsDataCatalogConfiguration: IResolvable)

      /**
       * @param awsDataCatalogConfiguration Specifies configurations for storage in AWS Glue Data
       * Catalog.
       */
      public
          fun awsDataCatalogConfiguration(awsDataCatalogConfiguration: RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty)

      /**
       * @param awsDataCatalogConfiguration Specifies configurations for storage in AWS Glue Data
       * Catalog.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("041edbd99819672453fd89ab66c05a9768e7eb43506affcd764f1161105e224c")
      public
          fun awsDataCatalogConfiguration(awsDataCatalogConfiguration: RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty.Builder.() -> Unit)

      /**
       * @param redshiftConfiguration Specifies configurations for storage in Amazon Redshift.
       */
      public fun redshiftConfiguration(redshiftConfiguration: IResolvable)

      /**
       * @param redshiftConfiguration Specifies configurations for storage in Amazon Redshift.
       */
      public
          fun redshiftConfiguration(redshiftConfiguration: RedshiftQueryEngineRedshiftStorageConfigurationProperty)

      /**
       * @param redshiftConfiguration Specifies configurations for storage in Amazon Redshift.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59821c61a9ea256ed7ce2dfaccf407eb185f67e9e663b481eb1309982e41a1c0")
      public
          fun redshiftConfiguration(redshiftConfiguration: RedshiftQueryEngineRedshiftStorageConfigurationProperty.Builder.() -> Unit)

      /**
       * @param type The data storage service to use. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineStorageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineStorageConfigurationProperty.builder()

      /**
       * @param awsDataCatalogConfiguration Specifies configurations for storage in AWS Glue Data
       * Catalog.
       */
      override fun awsDataCatalogConfiguration(awsDataCatalogConfiguration: IResolvable) {
        cdkBuilder.awsDataCatalogConfiguration(awsDataCatalogConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param awsDataCatalogConfiguration Specifies configurations for storage in AWS Glue Data
       * Catalog.
       */
      override
          fun awsDataCatalogConfiguration(awsDataCatalogConfiguration: RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty) {
        cdkBuilder.awsDataCatalogConfiguration(awsDataCatalogConfiguration.let(RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param awsDataCatalogConfiguration Specifies configurations for storage in AWS Glue Data
       * Catalog.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("041edbd99819672453fd89ab66c05a9768e7eb43506affcd764f1161105e224c")
      override
          fun awsDataCatalogConfiguration(awsDataCatalogConfiguration: RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty.Builder.() -> Unit):
          Unit =
          awsDataCatalogConfiguration(RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty(awsDataCatalogConfiguration))

      /**
       * @param redshiftConfiguration Specifies configurations for storage in Amazon Redshift.
       */
      override fun redshiftConfiguration(redshiftConfiguration: IResolvable) {
        cdkBuilder.redshiftConfiguration(redshiftConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param redshiftConfiguration Specifies configurations for storage in Amazon Redshift.
       */
      override
          fun redshiftConfiguration(redshiftConfiguration: RedshiftQueryEngineRedshiftStorageConfigurationProperty) {
        cdkBuilder.redshiftConfiguration(redshiftConfiguration.let(RedshiftQueryEngineRedshiftStorageConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param redshiftConfiguration Specifies configurations for storage in Amazon Redshift.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59821c61a9ea256ed7ce2dfaccf407eb185f67e9e663b481eb1309982e41a1c0")
      override
          fun redshiftConfiguration(redshiftConfiguration: RedshiftQueryEngineRedshiftStorageConfigurationProperty.Builder.() -> Unit):
          Unit =
          redshiftConfiguration(RedshiftQueryEngineRedshiftStorageConfigurationProperty(redshiftConfiguration))

      /**
       * @param type The data storage service to use. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineStorageConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineStorageConfigurationProperty,
    ) : CdkObject(cdkObject),
        RedshiftQueryEngineStorageConfigurationProperty {
      /**
       * Specifies configurations for storage in AWS Glue Data Catalog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryenginestorageconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryenginestorageconfiguration-awsdatacatalogconfiguration)
       */
      override fun awsDataCatalogConfiguration(): Any? =
          unwrap(this).getAwsDataCatalogConfiguration()

      /**
       * Specifies configurations for storage in Amazon Redshift.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryenginestorageconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryenginestorageconfiguration-redshiftconfiguration)
       */
      override fun redshiftConfiguration(): Any? = unwrap(this).getRedshiftConfiguration()

      /**
       * The data storage service to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftqueryenginestorageconfiguration.html#cfn-bedrock-knowledgebase-redshiftqueryenginestorageconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftQueryEngineStorageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineStorageConfigurationProperty):
          RedshiftQueryEngineStorageConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RedshiftQueryEngineStorageConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftQueryEngineStorageConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineStorageConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftQueryEngineStorageConfigurationProperty
    }
  }

  /**
   * Specifies configurations for authentication to a Redshift Serverless.
   *
   * Specify the type of authentication to use in the `type` field and include the corresponding
   * field. If you specify IAM authentication, you don't need to include another field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RedshiftServerlessAuthConfigurationProperty redshiftServerlessAuthConfigurationProperty =
   * RedshiftServerlessAuthConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .usernamePasswordSecretArn("usernamePasswordSecretArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftserverlessauthconfiguration.html)
   */
  public interface RedshiftServerlessAuthConfigurationProperty {
    /**
     * The type of authentication to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftserverlessauthconfiguration.html#cfn-bedrock-knowledgebase-redshiftserverlessauthconfiguration-type)
     */
    public fun type(): String

    /**
     * The ARN of an Secrets Manager secret for authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftserverlessauthconfiguration.html#cfn-bedrock-knowledgebase-redshiftserverlessauthconfiguration-usernamepasswordsecretarn)
     */
    public fun usernamePasswordSecretArn(): String? = unwrap(this).getUsernamePasswordSecretArn()

    /**
     * A builder for [RedshiftServerlessAuthConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of authentication to use. 
       */
      public fun type(type: String)

      /**
       * @param usernamePasswordSecretArn The ARN of an Secrets Manager secret for authentication.
       */
      public fun usernamePasswordSecretArn(usernamePasswordSecretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftServerlessAuthConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftServerlessAuthConfigurationProperty.builder()

      /**
       * @param type The type of authentication to use. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param usernamePasswordSecretArn The ARN of an Secrets Manager secret for authentication.
       */
      override fun usernamePasswordSecretArn(usernamePasswordSecretArn: String) {
        cdkBuilder.usernamePasswordSecretArn(usernamePasswordSecretArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftServerlessAuthConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftServerlessAuthConfigurationProperty,
    ) : CdkObject(cdkObject),
        RedshiftServerlessAuthConfigurationProperty {
      /**
       * The type of authentication to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftserverlessauthconfiguration.html#cfn-bedrock-knowledgebase-redshiftserverlessauthconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The ARN of an Secrets Manager secret for authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftserverlessauthconfiguration.html#cfn-bedrock-knowledgebase-redshiftserverlessauthconfiguration-usernamepasswordsecretarn)
       */
      override fun usernamePasswordSecretArn(): String? =
          unwrap(this).getUsernamePasswordSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftServerlessAuthConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftServerlessAuthConfigurationProperty):
          RedshiftServerlessAuthConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RedshiftServerlessAuthConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftServerlessAuthConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftServerlessAuthConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftServerlessAuthConfigurationProperty
    }
  }

  /**
   * Contains configurations for authentication to Amazon Redshift Serverless.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RedshiftServerlessConfigurationProperty redshiftServerlessConfigurationProperty =
   * RedshiftServerlessConfigurationProperty.builder()
   * .authConfiguration(RedshiftServerlessAuthConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .usernamePasswordSecretArn("usernamePasswordSecretArn")
   * .build())
   * .workgroupArn("workgroupArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftserverlessconfiguration.html)
   */
  public interface RedshiftServerlessConfigurationProperty {
    /**
     * Specifies configurations for authentication to an Amazon Redshift provisioned data warehouse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftserverlessconfiguration.html#cfn-bedrock-knowledgebase-redshiftserverlessconfiguration-authconfiguration)
     */
    public fun authConfiguration(): Any

    /**
     * The ARN of the Amazon Redshift workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftserverlessconfiguration.html#cfn-bedrock-knowledgebase-redshiftserverlessconfiguration-workgrouparn)
     */
    public fun workgroupArn(): String

    /**
     * A builder for [RedshiftServerlessConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authConfiguration Specifies configurations for authentication to an Amazon Redshift
       * provisioned data warehouse. 
       */
      public fun authConfiguration(authConfiguration: IResolvable)

      /**
       * @param authConfiguration Specifies configurations for authentication to an Amazon Redshift
       * provisioned data warehouse. 
       */
      public fun authConfiguration(authConfiguration: RedshiftServerlessAuthConfigurationProperty)

      /**
       * @param authConfiguration Specifies configurations for authentication to an Amazon Redshift
       * provisioned data warehouse. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ada3e80d40167959339dbc77e07a8b167e52d5be8442fd3ee6238a1571ce833e")
      public
          fun authConfiguration(authConfiguration: RedshiftServerlessAuthConfigurationProperty.Builder.() -> Unit)

      /**
       * @param workgroupArn The ARN of the Amazon Redshift workgroup. 
       */
      public fun workgroupArn(workgroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftServerlessConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftServerlessConfigurationProperty.builder()

      /**
       * @param authConfiguration Specifies configurations for authentication to an Amazon Redshift
       * provisioned data warehouse. 
       */
      override fun authConfiguration(authConfiguration: IResolvable) {
        cdkBuilder.authConfiguration(authConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param authConfiguration Specifies configurations for authentication to an Amazon Redshift
       * provisioned data warehouse. 
       */
      override
          fun authConfiguration(authConfiguration: RedshiftServerlessAuthConfigurationProperty) {
        cdkBuilder.authConfiguration(authConfiguration.let(RedshiftServerlessAuthConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param authConfiguration Specifies configurations for authentication to an Amazon Redshift
       * provisioned data warehouse. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ada3e80d40167959339dbc77e07a8b167e52d5be8442fd3ee6238a1571ce833e")
      override
          fun authConfiguration(authConfiguration: RedshiftServerlessAuthConfigurationProperty.Builder.() -> Unit):
          Unit = authConfiguration(RedshiftServerlessAuthConfigurationProperty(authConfiguration))

      /**
       * @param workgroupArn The ARN of the Amazon Redshift workgroup. 
       */
      override fun workgroupArn(workgroupArn: String) {
        cdkBuilder.workgroupArn(workgroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftServerlessConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftServerlessConfigurationProperty,
    ) : CdkObject(cdkObject),
        RedshiftServerlessConfigurationProperty {
      /**
       * Specifies configurations for authentication to an Amazon Redshift provisioned data
       * warehouse.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftserverlessconfiguration.html#cfn-bedrock-knowledgebase-redshiftserverlessconfiguration-authconfiguration)
       */
      override fun authConfiguration(): Any = unwrap(this).getAuthConfiguration()

      /**
       * The ARN of the Amazon Redshift workgroup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-redshiftserverlessconfiguration.html#cfn-bedrock-knowledgebase-redshiftserverlessconfiguration-workgrouparn)
       */
      override fun workgroupArn(): String = unwrap(this).getWorkgroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftServerlessConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftServerlessConfigurationProperty):
          RedshiftServerlessConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RedshiftServerlessConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftServerlessConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftServerlessConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.RedshiftServerlessConfigurationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * An object URI starting with `s3://` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-s3location.html#cfn-bedrock-knowledgebase-s3location-uri)
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
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.S3LocationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.S3LocationProperty.builder()

      /**
       * @param uri An object URI starting with `s3://` . 
       */
      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.S3LocationProperty,
    ) : CdkObject(cdkObject),
        S3LocationProperty {
      /**
       * An object URI starting with `s3://` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-s3location.html#cfn-bedrock-knowledgebase-s3location-uri)
       */
      override fun uri(): String = unwrap(this).getUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.S3LocationProperty
    }
  }

  /**
   * Contains configurations for a knowledge base connected to an SQL database.
   *
   * Specify the SQL database type in the `type` field and include the corresponding field. For more
   * information, see [Build a knowledge base by connecting to a structured data
   * source](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-build-structured.html)
   * in the Amazon Bedrock User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SqlKnowledgeBaseConfigurationProperty sqlKnowledgeBaseConfigurationProperty =
   * SqlKnowledgeBaseConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .redshiftConfiguration(RedshiftConfigurationProperty.builder()
   * .queryEngineConfiguration(RedshiftQueryEngineConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .provisionedConfiguration(RedshiftProvisionedConfigurationProperty.builder()
   * .authConfiguration(RedshiftProvisionedAuthConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .databaseUser("databaseUser")
   * .usernamePasswordSecretArn("usernamePasswordSecretArn")
   * .build())
   * .clusterIdentifier("clusterIdentifier")
   * .build())
   * .serverlessConfiguration(RedshiftServerlessConfigurationProperty.builder()
   * .authConfiguration(RedshiftServerlessAuthConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .usernamePasswordSecretArn("usernamePasswordSecretArn")
   * .build())
   * .workgroupArn("workgroupArn")
   * .build())
   * .build())
   * .storageConfigurations(List.of(RedshiftQueryEngineStorageConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .awsDataCatalogConfiguration(RedshiftQueryEngineAwsDataCatalogStorageConfigurationProperty.builder()
   * .tableNames(List.of("tableNames"))
   * .build())
   * .redshiftConfiguration(RedshiftQueryEngineRedshiftStorageConfigurationProperty.builder()
   * .databaseName("databaseName")
   * .build())
   * .build()))
   * // the properties below are optional
   * .queryGenerationConfiguration(QueryGenerationConfigurationProperty.builder()
   * .executionTimeoutSeconds(123)
   * .generationContext(QueryGenerationContextProperty.builder()
   * .curatedQueries(List.of(CuratedQueryProperty.builder()
   * .naturalLanguage("naturalLanguage")
   * .sql("sql")
   * .build()))
   * .tables(List.of(QueryGenerationTableProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .columns(List.of(QueryGenerationColumnProperty.builder()
   * .description("description")
   * .inclusion("inclusion")
   * .name("name")
   * .build()))
   * .description("description")
   * .inclusion("inclusion")
   * .build()))
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-sqlknowledgebaseconfiguration.html)
   */
  public interface SqlKnowledgeBaseConfigurationProperty {
    /**
     * Specifies configurations for a knowledge base connected to an Amazon Redshift database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-sqlknowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-sqlknowledgebaseconfiguration-redshiftconfiguration)
     */
    public fun redshiftConfiguration(): Any? = unwrap(this).getRedshiftConfiguration()

    /**
     * The type of SQL database to connect to the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-sqlknowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-sqlknowledgebaseconfiguration-type)
     */
    public fun type(): String

    /**
     * A builder for [SqlKnowledgeBaseConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param redshiftConfiguration Specifies configurations for a knowledge base connected to an
       * Amazon Redshift database.
       */
      public fun redshiftConfiguration(redshiftConfiguration: IResolvable)

      /**
       * @param redshiftConfiguration Specifies configurations for a knowledge base connected to an
       * Amazon Redshift database.
       */
      public fun redshiftConfiguration(redshiftConfiguration: RedshiftConfigurationProperty)

      /**
       * @param redshiftConfiguration Specifies configurations for a knowledge base connected to an
       * Amazon Redshift database.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("825e30ad72b27311b7272a7ec2be176b77b48812a74ff28d6254941172f40c59")
      public
          fun redshiftConfiguration(redshiftConfiguration: RedshiftConfigurationProperty.Builder.() -> Unit)

      /**
       * @param type The type of SQL database to connect to the knowledge base. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SqlKnowledgeBaseConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SqlKnowledgeBaseConfigurationProperty.builder()

      /**
       * @param redshiftConfiguration Specifies configurations for a knowledge base connected to an
       * Amazon Redshift database.
       */
      override fun redshiftConfiguration(redshiftConfiguration: IResolvable) {
        cdkBuilder.redshiftConfiguration(redshiftConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param redshiftConfiguration Specifies configurations for a knowledge base connected to an
       * Amazon Redshift database.
       */
      override fun redshiftConfiguration(redshiftConfiguration: RedshiftConfigurationProperty) {
        cdkBuilder.redshiftConfiguration(redshiftConfiguration.let(RedshiftConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param redshiftConfiguration Specifies configurations for a knowledge base connected to an
       * Amazon Redshift database.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("825e30ad72b27311b7272a7ec2be176b77b48812a74ff28d6254941172f40c59")
      override
          fun redshiftConfiguration(redshiftConfiguration: RedshiftConfigurationProperty.Builder.() -> Unit):
          Unit = redshiftConfiguration(RedshiftConfigurationProperty(redshiftConfiguration))

      /**
       * @param type The type of SQL database to connect to the knowledge base. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SqlKnowledgeBaseConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SqlKnowledgeBaseConfigurationProperty,
    ) : CdkObject(cdkObject),
        SqlKnowledgeBaseConfigurationProperty {
      /**
       * Specifies configurations for a knowledge base connected to an Amazon Redshift database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-sqlknowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-sqlknowledgebaseconfiguration-redshiftconfiguration)
       */
      override fun redshiftConfiguration(): Any? = unwrap(this).getRedshiftConfiguration()

      /**
       * The type of SQL database to connect to the knowledge base.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-sqlknowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-sqlknowledgebaseconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SqlKnowledgeBaseConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SqlKnowledgeBaseConfigurationProperty):
          SqlKnowledgeBaseConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SqlKnowledgeBaseConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqlKnowledgeBaseConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SqlKnowledgeBaseConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SqlKnowledgeBaseConfigurationProperty
    }
  }

  /**
   * Contains the storage configuration of the knowledge base.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * StorageConfigurationProperty storageConfigurationProperty =
   * StorageConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .mongoDbAtlasConfiguration(MongoDbAtlasConfigurationProperty.builder()
   * .collectionName("collectionName")
   * .credentialsSecretArn("credentialsSecretArn")
   * .databaseName("databaseName")
   * .endpoint("endpoint")
   * .fieldMapping(MongoDbAtlasFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .textField("textField")
   * .vectorField("vectorField")
   * .build())
   * .vectorIndexName("vectorIndexName")
   * // the properties below are optional
   * .endpointServiceName("endpointServiceName")
   * .textIndexName("textIndexName")
   * .build())
   * .neptuneAnalyticsConfiguration(NeptuneAnalyticsConfigurationProperty.builder()
   * .fieldMapping(NeptuneAnalyticsFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .textField("textField")
   * .build())
   * .graphArn("graphArn")
   * .build())
   * .opensearchManagedClusterConfiguration(OpenSearchManagedClusterConfigurationProperty.builder()
   * .domainArn("domainArn")
   * .domainEndpoint("domainEndpoint")
   * .fieldMapping(OpenSearchManagedClusterFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .textField("textField")
   * .vectorField("vectorField")
   * .build())
   * .vectorIndexName("vectorIndexName")
   * .build())
   * .opensearchServerlessConfiguration(OpenSearchServerlessConfigurationProperty.builder()
   * .collectionArn("collectionArn")
   * .fieldMapping(OpenSearchServerlessFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .textField("textField")
   * .vectorField("vectorField")
   * .build())
   * .vectorIndexName("vectorIndexName")
   * .build())
   * .pineconeConfiguration(PineconeConfigurationProperty.builder()
   * .connectionString("connectionString")
   * .credentialsSecretArn("credentialsSecretArn")
   * .fieldMapping(PineconeFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .textField("textField")
   * .build())
   * // the properties below are optional
   * .namespace("namespace")
   * .build())
   * .rdsConfiguration(RdsConfigurationProperty.builder()
   * .credentialsSecretArn("credentialsSecretArn")
   * .databaseName("databaseName")
   * .fieldMapping(RdsFieldMappingProperty.builder()
   * .metadataField("metadataField")
   * .primaryKeyField("primaryKeyField")
   * .textField("textField")
   * .vectorField("vectorField")
   * // the properties below are optional
   * .customMetadataField("customMetadataField")
   * .build())
   * .resourceArn("resourceArn")
   * .tableName("tableName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-storageconfiguration.html)
   */
  public interface StorageConfigurationProperty {
    /**
     * Contains the storage configuration of the knowledge base in MongoDB Atlas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-storageconfiguration.html#cfn-bedrock-knowledgebase-storageconfiguration-mongodbatlasconfiguration)
     */
    public fun mongoDbAtlasConfiguration(): Any? = unwrap(this).getMongoDbAtlasConfiguration()

    /**
     * Contains details about the Neptune Analytics configuration of the knowledge base in Amazon
     * Neptune.
     *
     * For more information, see [Create a vector index in Amazon Neptune
     * Analytics.](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-neptune.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-storageconfiguration.html#cfn-bedrock-knowledgebase-storageconfiguration-neptuneanalyticsconfiguration)
     */
    public fun neptuneAnalyticsConfiguration(): Any? =
        unwrap(this).getNeptuneAnalyticsConfiguration()

    /**
     * Contains details about the storage configuration of the knowledge base in OpenSearch Managed
     * Cluster.
     *
     * For more information, see [Create a vector index in Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-osm.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-storageconfiguration.html#cfn-bedrock-knowledgebase-storageconfiguration-opensearchmanagedclusterconfiguration)
     */
    public fun opensearchManagedClusterConfiguration(): Any? =
        unwrap(this).getOpensearchManagedClusterConfiguration()

    /**
     * Contains the storage configuration of the knowledge base in Amazon OpenSearch Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-storageconfiguration.html#cfn-bedrock-knowledgebase-storageconfiguration-opensearchserverlessconfiguration)
     */
    public fun opensearchServerlessConfiguration(): Any? =
        unwrap(this).getOpensearchServerlessConfiguration()

    /**
     * Contains the storage configuration of the knowledge base in Pinecone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-storageconfiguration.html#cfn-bedrock-knowledgebase-storageconfiguration-pineconeconfiguration)
     */
    public fun pineconeConfiguration(): Any? = unwrap(this).getPineconeConfiguration()

    /**
     * Contains details about the storage configuration of the knowledge base in Amazon RDS.
     *
     * For more information, see [Create a vector index in Amazon
     * RDS](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-storageconfiguration.html#cfn-bedrock-knowledgebase-storageconfiguration-rdsconfiguration)
     */
    public fun rdsConfiguration(): Any? = unwrap(this).getRdsConfiguration()

    /**
     * The vector store service in which the knowledge base is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-storageconfiguration.html#cfn-bedrock-knowledgebase-storageconfiguration-type)
     */
    public fun type(): String

    /**
     * A builder for [StorageConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mongoDbAtlasConfiguration Contains the storage configuration of the knowledge base
       * in MongoDB Atlas.
       */
      public fun mongoDbAtlasConfiguration(mongoDbAtlasConfiguration: IResolvable)

      /**
       * @param mongoDbAtlasConfiguration Contains the storage configuration of the knowledge base
       * in MongoDB Atlas.
       */
      public
          fun mongoDbAtlasConfiguration(mongoDbAtlasConfiguration: MongoDbAtlasConfigurationProperty)

      /**
       * @param mongoDbAtlasConfiguration Contains the storage configuration of the knowledge base
       * in MongoDB Atlas.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6ae595b02f6f6f81cda37dfd1cd5cf522f9458cdd2191d2f9f10ecb6ceba4fc")
      public
          fun mongoDbAtlasConfiguration(mongoDbAtlasConfiguration: MongoDbAtlasConfigurationProperty.Builder.() -> Unit)

      /**
       * @param neptuneAnalyticsConfiguration Contains details about the Neptune Analytics
       * configuration of the knowledge base in Amazon Neptune.
       * For more information, see [Create a vector index in Amazon Neptune
       * Analytics.](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-neptune.html)
       * .
       */
      public fun neptuneAnalyticsConfiguration(neptuneAnalyticsConfiguration: IResolvable)

      /**
       * @param neptuneAnalyticsConfiguration Contains details about the Neptune Analytics
       * configuration of the knowledge base in Amazon Neptune.
       * For more information, see [Create a vector index in Amazon Neptune
       * Analytics.](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-neptune.html)
       * .
       */
      public
          fun neptuneAnalyticsConfiguration(neptuneAnalyticsConfiguration: NeptuneAnalyticsConfigurationProperty)

      /**
       * @param neptuneAnalyticsConfiguration Contains details about the Neptune Analytics
       * configuration of the knowledge base in Amazon Neptune.
       * For more information, see [Create a vector index in Amazon Neptune
       * Analytics.](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-neptune.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("763f7690489e64dc0e4eeffda3aa488534ab7c2a519c277e27d43d912674691b")
      public
          fun neptuneAnalyticsConfiguration(neptuneAnalyticsConfiguration: NeptuneAnalyticsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param opensearchManagedClusterConfiguration Contains details about the storage
       * configuration of the knowledge base in OpenSearch Managed Cluster.
       * For more information, see [Create a vector index in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-osm.html) .
       */
      public
          fun opensearchManagedClusterConfiguration(opensearchManagedClusterConfiguration: IResolvable)

      /**
       * @param opensearchManagedClusterConfiguration Contains details about the storage
       * configuration of the knowledge base in OpenSearch Managed Cluster.
       * For more information, see [Create a vector index in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-osm.html) .
       */
      public
          fun opensearchManagedClusterConfiguration(opensearchManagedClusterConfiguration: OpenSearchManagedClusterConfigurationProperty)

      /**
       * @param opensearchManagedClusterConfiguration Contains details about the storage
       * configuration of the knowledge base in OpenSearch Managed Cluster.
       * For more information, see [Create a vector index in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-osm.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf19db16b275beeb23609d110d1fd904465157a61ca78b2be29f5ebd979cce8d")
      public
          fun opensearchManagedClusterConfiguration(opensearchManagedClusterConfiguration: OpenSearchManagedClusterConfigurationProperty.Builder.() -> Unit)

      /**
       * @param opensearchServerlessConfiguration Contains the storage configuration of the
       * knowledge base in Amazon OpenSearch Service.
       */
      public fun opensearchServerlessConfiguration(opensearchServerlessConfiguration: IResolvable)

      /**
       * @param opensearchServerlessConfiguration Contains the storage configuration of the
       * knowledge base in Amazon OpenSearch Service.
       */
      public
          fun opensearchServerlessConfiguration(opensearchServerlessConfiguration: OpenSearchServerlessConfigurationProperty)

      /**
       * @param opensearchServerlessConfiguration Contains the storage configuration of the
       * knowledge base in Amazon OpenSearch Service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2349201097292d6fc5e2b1e8974fe674db7d759d9896e39714fe2468984ff92")
      public
          fun opensearchServerlessConfiguration(opensearchServerlessConfiguration: OpenSearchServerlessConfigurationProperty.Builder.() -> Unit)

      /**
       * @param pineconeConfiguration Contains the storage configuration of the knowledge base in
       * Pinecone.
       */
      public fun pineconeConfiguration(pineconeConfiguration: IResolvable)

      /**
       * @param pineconeConfiguration Contains the storage configuration of the knowledge base in
       * Pinecone.
       */
      public fun pineconeConfiguration(pineconeConfiguration: PineconeConfigurationProperty)

      /**
       * @param pineconeConfiguration Contains the storage configuration of the knowledge base in
       * Pinecone.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a22403fbaf2e6d610970325f96c7f16c6647e86f6f8e1a50c36756a1cafeed9f")
      public
          fun pineconeConfiguration(pineconeConfiguration: PineconeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param rdsConfiguration Contains details about the storage configuration of the knowledge
       * base in Amazon RDS.
       * For more information, see [Create a vector index in Amazon
       * RDS](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html) .
       */
      public fun rdsConfiguration(rdsConfiguration: IResolvable)

      /**
       * @param rdsConfiguration Contains details about the storage configuration of the knowledge
       * base in Amazon RDS.
       * For more information, see [Create a vector index in Amazon
       * RDS](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html) .
       */
      public fun rdsConfiguration(rdsConfiguration: RdsConfigurationProperty)

      /**
       * @param rdsConfiguration Contains details about the storage configuration of the knowledge
       * base in Amazon RDS.
       * For more information, see [Create a vector index in Amazon
       * RDS](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d66149e07a8a7503180a19c82354dd95fe43aefcc711bc8ebee57f706573f9d3")
      public fun rdsConfiguration(rdsConfiguration: RdsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param type The vector store service in which the knowledge base is stored. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.StorageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.StorageConfigurationProperty.builder()

      /**
       * @param mongoDbAtlasConfiguration Contains the storage configuration of the knowledge base
       * in MongoDB Atlas.
       */
      override fun mongoDbAtlasConfiguration(mongoDbAtlasConfiguration: IResolvable) {
        cdkBuilder.mongoDbAtlasConfiguration(mongoDbAtlasConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mongoDbAtlasConfiguration Contains the storage configuration of the knowledge base
       * in MongoDB Atlas.
       */
      override
          fun mongoDbAtlasConfiguration(mongoDbAtlasConfiguration: MongoDbAtlasConfigurationProperty) {
        cdkBuilder.mongoDbAtlasConfiguration(mongoDbAtlasConfiguration.let(MongoDbAtlasConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param mongoDbAtlasConfiguration Contains the storage configuration of the knowledge base
       * in MongoDB Atlas.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6ae595b02f6f6f81cda37dfd1cd5cf522f9458cdd2191d2f9f10ecb6ceba4fc")
      override
          fun mongoDbAtlasConfiguration(mongoDbAtlasConfiguration: MongoDbAtlasConfigurationProperty.Builder.() -> Unit):
          Unit =
          mongoDbAtlasConfiguration(MongoDbAtlasConfigurationProperty(mongoDbAtlasConfiguration))

      /**
       * @param neptuneAnalyticsConfiguration Contains details about the Neptune Analytics
       * configuration of the knowledge base in Amazon Neptune.
       * For more information, see [Create a vector index in Amazon Neptune
       * Analytics.](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-neptune.html)
       * .
       */
      override fun neptuneAnalyticsConfiguration(neptuneAnalyticsConfiguration: IResolvable) {
        cdkBuilder.neptuneAnalyticsConfiguration(neptuneAnalyticsConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param neptuneAnalyticsConfiguration Contains details about the Neptune Analytics
       * configuration of the knowledge base in Amazon Neptune.
       * For more information, see [Create a vector index in Amazon Neptune
       * Analytics.](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-neptune.html)
       * .
       */
      override
          fun neptuneAnalyticsConfiguration(neptuneAnalyticsConfiguration: NeptuneAnalyticsConfigurationProperty) {
        cdkBuilder.neptuneAnalyticsConfiguration(neptuneAnalyticsConfiguration.let(NeptuneAnalyticsConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param neptuneAnalyticsConfiguration Contains details about the Neptune Analytics
       * configuration of the knowledge base in Amazon Neptune.
       * For more information, see [Create a vector index in Amazon Neptune
       * Analytics.](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-neptune.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("763f7690489e64dc0e4eeffda3aa488534ab7c2a519c277e27d43d912674691b")
      override
          fun neptuneAnalyticsConfiguration(neptuneAnalyticsConfiguration: NeptuneAnalyticsConfigurationProperty.Builder.() -> Unit):
          Unit =
          neptuneAnalyticsConfiguration(NeptuneAnalyticsConfigurationProperty(neptuneAnalyticsConfiguration))

      /**
       * @param opensearchManagedClusterConfiguration Contains details about the storage
       * configuration of the knowledge base in OpenSearch Managed Cluster.
       * For more information, see [Create a vector index in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-osm.html) .
       */
      override
          fun opensearchManagedClusterConfiguration(opensearchManagedClusterConfiguration: IResolvable) {
        cdkBuilder.opensearchManagedClusterConfiguration(opensearchManagedClusterConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param opensearchManagedClusterConfiguration Contains details about the storage
       * configuration of the knowledge base in OpenSearch Managed Cluster.
       * For more information, see [Create a vector index in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-osm.html) .
       */
      override
          fun opensearchManagedClusterConfiguration(opensearchManagedClusterConfiguration: OpenSearchManagedClusterConfigurationProperty) {
        cdkBuilder.opensearchManagedClusterConfiguration(opensearchManagedClusterConfiguration.let(OpenSearchManagedClusterConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param opensearchManagedClusterConfiguration Contains details about the storage
       * configuration of the knowledge base in OpenSearch Managed Cluster.
       * For more information, see [Create a vector index in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-osm.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf19db16b275beeb23609d110d1fd904465157a61ca78b2be29f5ebd979cce8d")
      override
          fun opensearchManagedClusterConfiguration(opensearchManagedClusterConfiguration: OpenSearchManagedClusterConfigurationProperty.Builder.() -> Unit):
          Unit =
          opensearchManagedClusterConfiguration(OpenSearchManagedClusterConfigurationProperty(opensearchManagedClusterConfiguration))

      /**
       * @param opensearchServerlessConfiguration Contains the storage configuration of the
       * knowledge base in Amazon OpenSearch Service.
       */
      override
          fun opensearchServerlessConfiguration(opensearchServerlessConfiguration: IResolvable) {
        cdkBuilder.opensearchServerlessConfiguration(opensearchServerlessConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param opensearchServerlessConfiguration Contains the storage configuration of the
       * knowledge base in Amazon OpenSearch Service.
       */
      override
          fun opensearchServerlessConfiguration(opensearchServerlessConfiguration: OpenSearchServerlessConfigurationProperty) {
        cdkBuilder.opensearchServerlessConfiguration(opensearchServerlessConfiguration.let(OpenSearchServerlessConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param opensearchServerlessConfiguration Contains the storage configuration of the
       * knowledge base in Amazon OpenSearch Service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2349201097292d6fc5e2b1e8974fe674db7d759d9896e39714fe2468984ff92")
      override
          fun opensearchServerlessConfiguration(opensearchServerlessConfiguration: OpenSearchServerlessConfigurationProperty.Builder.() -> Unit):
          Unit =
          opensearchServerlessConfiguration(OpenSearchServerlessConfigurationProperty(opensearchServerlessConfiguration))

      /**
       * @param pineconeConfiguration Contains the storage configuration of the knowledge base in
       * Pinecone.
       */
      override fun pineconeConfiguration(pineconeConfiguration: IResolvable) {
        cdkBuilder.pineconeConfiguration(pineconeConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param pineconeConfiguration Contains the storage configuration of the knowledge base in
       * Pinecone.
       */
      override fun pineconeConfiguration(pineconeConfiguration: PineconeConfigurationProperty) {
        cdkBuilder.pineconeConfiguration(pineconeConfiguration.let(PineconeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param pineconeConfiguration Contains the storage configuration of the knowledge base in
       * Pinecone.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a22403fbaf2e6d610970325f96c7f16c6647e86f6f8e1a50c36756a1cafeed9f")
      override
          fun pineconeConfiguration(pineconeConfiguration: PineconeConfigurationProperty.Builder.() -> Unit):
          Unit = pineconeConfiguration(PineconeConfigurationProperty(pineconeConfiguration))

      /**
       * @param rdsConfiguration Contains details about the storage configuration of the knowledge
       * base in Amazon RDS.
       * For more information, see [Create a vector index in Amazon
       * RDS](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html) .
       */
      override fun rdsConfiguration(rdsConfiguration: IResolvable) {
        cdkBuilder.rdsConfiguration(rdsConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rdsConfiguration Contains details about the storage configuration of the knowledge
       * base in Amazon RDS.
       * For more information, see [Create a vector index in Amazon
       * RDS](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html) .
       */
      override fun rdsConfiguration(rdsConfiguration: RdsConfigurationProperty) {
        cdkBuilder.rdsConfiguration(rdsConfiguration.let(RdsConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param rdsConfiguration Contains details about the storage configuration of the knowledge
       * base in Amazon RDS.
       * For more information, see [Create a vector index in Amazon
       * RDS](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d66149e07a8a7503180a19c82354dd95fe43aefcc711bc8ebee57f706573f9d3")
      override fun rdsConfiguration(rdsConfiguration: RdsConfigurationProperty.Builder.() -> Unit):
          Unit = rdsConfiguration(RdsConfigurationProperty(rdsConfiguration))

      /**
       * @param type The vector store service in which the knowledge base is stored. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.StorageConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.StorageConfigurationProperty,
    ) : CdkObject(cdkObject),
        StorageConfigurationProperty {
      /**
       * Contains the storage configuration of the knowledge base in MongoDB Atlas.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-storageconfiguration.html#cfn-bedrock-knowledgebase-storageconfiguration-mongodbatlasconfiguration)
       */
      override fun mongoDbAtlasConfiguration(): Any? = unwrap(this).getMongoDbAtlasConfiguration()

      /**
       * Contains details about the Neptune Analytics configuration of the knowledge base in Amazon
       * Neptune.
       *
       * For more information, see [Create a vector index in Amazon Neptune
       * Analytics.](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-neptune.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-storageconfiguration.html#cfn-bedrock-knowledgebase-storageconfiguration-neptuneanalyticsconfiguration)
       */
      override fun neptuneAnalyticsConfiguration(): Any? =
          unwrap(this).getNeptuneAnalyticsConfiguration()

      /**
       * Contains details about the storage configuration of the knowledge base in OpenSearch
       * Managed Cluster.
       *
       * For more information, see [Create a vector index in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-osm.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-storageconfiguration.html#cfn-bedrock-knowledgebase-storageconfiguration-opensearchmanagedclusterconfiguration)
       */
      override fun opensearchManagedClusterConfiguration(): Any? =
          unwrap(this).getOpensearchManagedClusterConfiguration()

      /**
       * Contains the storage configuration of the knowledge base in Amazon OpenSearch Service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-storageconfiguration.html#cfn-bedrock-knowledgebase-storageconfiguration-opensearchserverlessconfiguration)
       */
      override fun opensearchServerlessConfiguration(): Any? =
          unwrap(this).getOpensearchServerlessConfiguration()

      /**
       * Contains the storage configuration of the knowledge base in Pinecone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-storageconfiguration.html#cfn-bedrock-knowledgebase-storageconfiguration-pineconeconfiguration)
       */
      override fun pineconeConfiguration(): Any? = unwrap(this).getPineconeConfiguration()

      /**
       * Contains details about the storage configuration of the knowledge base in Amazon RDS.
       *
       * For more information, see [Create a vector index in Amazon
       * RDS](https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-storageconfiguration.html#cfn-bedrock-knowledgebase-storageconfiguration-rdsconfiguration)
       */
      override fun rdsConfiguration(): Any? = unwrap(this).getRdsConfiguration()

      /**
       * The vector store service in which the knowledge base is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-storageconfiguration.html#cfn-bedrock-knowledgebase-storageconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StorageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.StorageConfigurationProperty):
          StorageConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StorageConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.StorageConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.StorageConfigurationProperty
    }
  }

  /**
   * Specifies configurations for the storage location of the images extracted from multimodal
   * documents in your data source.
   *
   * These images can be retrieved and returned to the end user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SupplementalDataStorageConfigurationProperty supplementalDataStorageConfigurationProperty =
   * SupplementalDataStorageConfigurationProperty.builder()
   * .supplementalDataStorageLocations(List.of(SupplementalDataStorageLocationProperty.builder()
   * .supplementalDataStorageLocationType("supplementalDataStorageLocationType")
   * // the properties below are optional
   * .s3Location(S3LocationProperty.builder()
   * .uri("uri")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-supplementaldatastorageconfiguration.html)
   */
  public interface SupplementalDataStorageConfigurationProperty {
    /**
     * List of supplemental data storage locations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-supplementaldatastorageconfiguration.html#cfn-bedrock-knowledgebase-supplementaldatastorageconfiguration-supplementaldatastoragelocations)
     */
    public fun supplementalDataStorageLocations(): Any

    /**
     * A builder for [SupplementalDataStorageConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param supplementalDataStorageLocations List of supplemental data storage locations. 
       */
      public fun supplementalDataStorageLocations(supplementalDataStorageLocations: IResolvable)

      /**
       * @param supplementalDataStorageLocations List of supplemental data storage locations. 
       */
      public fun supplementalDataStorageLocations(supplementalDataStorageLocations: List<Any>)

      /**
       * @param supplementalDataStorageLocations List of supplemental data storage locations. 
       */
      public fun supplementalDataStorageLocations(vararg supplementalDataStorageLocations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SupplementalDataStorageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SupplementalDataStorageConfigurationProperty.builder()

      /**
       * @param supplementalDataStorageLocations List of supplemental data storage locations. 
       */
      override fun supplementalDataStorageLocations(supplementalDataStorageLocations: IResolvable) {
        cdkBuilder.supplementalDataStorageLocations(supplementalDataStorageLocations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param supplementalDataStorageLocations List of supplemental data storage locations. 
       */
      override fun supplementalDataStorageLocations(supplementalDataStorageLocations: List<Any>) {
        cdkBuilder.supplementalDataStorageLocations(supplementalDataStorageLocations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param supplementalDataStorageLocations List of supplemental data storage locations. 
       */
      override fun supplementalDataStorageLocations(vararg supplementalDataStorageLocations: Any):
          Unit = supplementalDataStorageLocations(supplementalDataStorageLocations.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SupplementalDataStorageConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SupplementalDataStorageConfigurationProperty,
    ) : CdkObject(cdkObject),
        SupplementalDataStorageConfigurationProperty {
      /**
       * List of supplemental data storage locations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-supplementaldatastorageconfiguration.html#cfn-bedrock-knowledgebase-supplementaldatastorageconfiguration-supplementaldatastoragelocations)
       */
      override fun supplementalDataStorageLocations(): Any =
          unwrap(this).getSupplementalDataStorageLocations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SupplementalDataStorageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SupplementalDataStorageConfigurationProperty):
          SupplementalDataStorageConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SupplementalDataStorageConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SupplementalDataStorageConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SupplementalDataStorageConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SupplementalDataStorageConfigurationProperty
    }
  }

  /**
   * Contains information about a storage location for images extracted from multimodal documents in
   * your data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SupplementalDataStorageLocationProperty supplementalDataStorageLocationProperty =
   * SupplementalDataStorageLocationProperty.builder()
   * .supplementalDataStorageLocationType("supplementalDataStorageLocationType")
   * // the properties below are optional
   * .s3Location(S3LocationProperty.builder()
   * .uri("uri")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-supplementaldatastoragelocation.html)
   */
  public interface SupplementalDataStorageLocationProperty {
    /**
     * Contains information about the Amazon S3 location for the extracted images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-supplementaldatastoragelocation.html#cfn-bedrock-knowledgebase-supplementaldatastoragelocation-s3location)
     */
    public fun s3Location(): Any? = unwrap(this).getS3Location()

    /**
     * Supplemental data storage location type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-supplementaldatastoragelocation.html#cfn-bedrock-knowledgebase-supplementaldatastoragelocation-supplementaldatastoragelocationtype)
     */
    public fun supplementalDataStorageLocationType(): String

    /**
     * A builder for [SupplementalDataStorageLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Location Contains information about the Amazon S3 location for the extracted
       * images.
       */
      public fun s3Location(s3Location: IResolvable)

      /**
       * @param s3Location Contains information about the Amazon S3 location for the extracted
       * images.
       */
      public fun s3Location(s3Location: S3LocationProperty)

      /**
       * @param s3Location Contains information about the Amazon S3 location for the extracted
       * images.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("668a0b54a947b14142052d723c35d02c0a0101c5f6373c72260685ee1a95df9e")
      public fun s3Location(s3Location: S3LocationProperty.Builder.() -> Unit)

      /**
       * @param supplementalDataStorageLocationType Supplemental data storage location type. 
       */
      public fun supplementalDataStorageLocationType(supplementalDataStorageLocationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SupplementalDataStorageLocationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SupplementalDataStorageLocationProperty.builder()

      /**
       * @param s3Location Contains information about the Amazon S3 location for the extracted
       * images.
       */
      override fun s3Location(s3Location: IResolvable) {
        cdkBuilder.s3Location(s3Location.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3Location Contains information about the Amazon S3 location for the extracted
       * images.
       */
      override fun s3Location(s3Location: S3LocationProperty) {
        cdkBuilder.s3Location(s3Location.let(S3LocationProperty.Companion::unwrap))
      }

      /**
       * @param s3Location Contains information about the Amazon S3 location for the extracted
       * images.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("668a0b54a947b14142052d723c35d02c0a0101c5f6373c72260685ee1a95df9e")
      override fun s3Location(s3Location: S3LocationProperty.Builder.() -> Unit): Unit =
          s3Location(S3LocationProperty(s3Location))

      /**
       * @param supplementalDataStorageLocationType Supplemental data storage location type. 
       */
      override
          fun supplementalDataStorageLocationType(supplementalDataStorageLocationType: String) {
        cdkBuilder.supplementalDataStorageLocationType(supplementalDataStorageLocationType)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SupplementalDataStorageLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SupplementalDataStorageLocationProperty,
    ) : CdkObject(cdkObject),
        SupplementalDataStorageLocationProperty {
      /**
       * Contains information about the Amazon S3 location for the extracted images.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-supplementaldatastoragelocation.html#cfn-bedrock-knowledgebase-supplementaldatastoragelocation-s3location)
       */
      override fun s3Location(): Any? = unwrap(this).getS3Location()

      /**
       * Supplemental data storage location type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-supplementaldatastoragelocation.html#cfn-bedrock-knowledgebase-supplementaldatastoragelocation-supplementaldatastoragelocationtype)
       */
      override fun supplementalDataStorageLocationType(): String =
          unwrap(this).getSupplementalDataStorageLocationType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SupplementalDataStorageLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SupplementalDataStorageLocationProperty):
          SupplementalDataStorageLocationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SupplementalDataStorageLocationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SupplementalDataStorageLocationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SupplementalDataStorageLocationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.SupplementalDataStorageLocationProperty
    }
  }

  /**
   * Contains details about the model used to create vector embeddings for the knowledge base.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * VectorKnowledgeBaseConfigurationProperty vectorKnowledgeBaseConfigurationProperty =
   * VectorKnowledgeBaseConfigurationProperty.builder()
   * .embeddingModelArn("embeddingModelArn")
   * // the properties below are optional
   * .embeddingModelConfiguration(EmbeddingModelConfigurationProperty.builder()
   * .bedrockEmbeddingModelConfiguration(BedrockEmbeddingModelConfigurationProperty.builder()
   * .dimensions(123)
   * .embeddingDataType("embeddingDataType")
   * .build())
   * .build())
   * .supplementalDataStorageConfiguration(SupplementalDataStorageConfigurationProperty.builder()
   * .supplementalDataStorageLocations(List.of(SupplementalDataStorageLocationProperty.builder()
   * .supplementalDataStorageLocationType("supplementalDataStorageLocationType")
   * // the properties below are optional
   * .s3Location(S3LocationProperty.builder()
   * .uri("uri")
   * .build())
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-vectorknowledgebaseconfiguration.html)
   */
  public interface VectorKnowledgeBaseConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the model used to create vector embeddings for the
     * knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-vectorknowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-vectorknowledgebaseconfiguration-embeddingmodelarn)
     */
    public fun embeddingModelArn(): String

    /**
     * The embeddings model configuration details for the vector model used in Knowledge Base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-vectorknowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-vectorknowledgebaseconfiguration-embeddingmodelconfiguration)
     */
    public fun embeddingModelConfiguration(): Any? = unwrap(this).getEmbeddingModelConfiguration()

    /**
     * If you include multimodal data from your data source, use this object to specify
     * configurations for the storage location of the images extracted from your documents.
     *
     * These images can be retrieved and returned to the end user. They can also be used in
     * generation when using
     * [RetrieveAndGenerate](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-vectorknowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-vectorknowledgebaseconfiguration-supplementaldatastorageconfiguration)
     */
    public fun supplementalDataStorageConfiguration(): Any? =
        unwrap(this).getSupplementalDataStorageConfiguration()

    /**
     * A builder for [VectorKnowledgeBaseConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param embeddingModelArn The Amazon Resource Name (ARN) of the model used to create vector
       * embeddings for the knowledge base. 
       */
      public fun embeddingModelArn(embeddingModelArn: String)

      /**
       * @param embeddingModelConfiguration The embeddings model configuration details for the
       * vector model used in Knowledge Base.
       */
      public fun embeddingModelConfiguration(embeddingModelConfiguration: IResolvable)

      /**
       * @param embeddingModelConfiguration The embeddings model configuration details for the
       * vector model used in Knowledge Base.
       */
      public
          fun embeddingModelConfiguration(embeddingModelConfiguration: EmbeddingModelConfigurationProperty)

      /**
       * @param embeddingModelConfiguration The embeddings model configuration details for the
       * vector model used in Knowledge Base.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("38170d9af7d2c9e074ba25342b9b34f11f5d34e34d36410e027a205a972027e6")
      public
          fun embeddingModelConfiguration(embeddingModelConfiguration: EmbeddingModelConfigurationProperty.Builder.() -> Unit)

      /**
       * @param supplementalDataStorageConfiguration If you include multimodal data from your data
       * source, use this object to specify configurations for the storage location of the images
       * extracted from your documents.
       * These images can be retrieved and returned to the end user. They can also be used in
       * generation when using
       * [RetrieveAndGenerate](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html)
       * .
       */
      public
          fun supplementalDataStorageConfiguration(supplementalDataStorageConfiguration: IResolvable)

      /**
       * @param supplementalDataStorageConfiguration If you include multimodal data from your data
       * source, use this object to specify configurations for the storage location of the images
       * extracted from your documents.
       * These images can be retrieved and returned to the end user. They can also be used in
       * generation when using
       * [RetrieveAndGenerate](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html)
       * .
       */
      public
          fun supplementalDataStorageConfiguration(supplementalDataStorageConfiguration: SupplementalDataStorageConfigurationProperty)

      /**
       * @param supplementalDataStorageConfiguration If you include multimodal data from your data
       * source, use this object to specify configurations for the storage location of the images
       * extracted from your documents.
       * These images can be retrieved and returned to the end user. They can also be used in
       * generation when using
       * [RetrieveAndGenerate](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("851fdb52faef057b03c21a246d344144de41217cedd2734bcaa2f96fe3d02a68")
      public
          fun supplementalDataStorageConfiguration(supplementalDataStorageConfiguration: SupplementalDataStorageConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.VectorKnowledgeBaseConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.VectorKnowledgeBaseConfigurationProperty.builder()

      /**
       * @param embeddingModelArn The Amazon Resource Name (ARN) of the model used to create vector
       * embeddings for the knowledge base. 
       */
      override fun embeddingModelArn(embeddingModelArn: String) {
        cdkBuilder.embeddingModelArn(embeddingModelArn)
      }

      /**
       * @param embeddingModelConfiguration The embeddings model configuration details for the
       * vector model used in Knowledge Base.
       */
      override fun embeddingModelConfiguration(embeddingModelConfiguration: IResolvable) {
        cdkBuilder.embeddingModelConfiguration(embeddingModelConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param embeddingModelConfiguration The embeddings model configuration details for the
       * vector model used in Knowledge Base.
       */
      override
          fun embeddingModelConfiguration(embeddingModelConfiguration: EmbeddingModelConfigurationProperty) {
        cdkBuilder.embeddingModelConfiguration(embeddingModelConfiguration.let(EmbeddingModelConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param embeddingModelConfiguration The embeddings model configuration details for the
       * vector model used in Knowledge Base.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("38170d9af7d2c9e074ba25342b9b34f11f5d34e34d36410e027a205a972027e6")
      override
          fun embeddingModelConfiguration(embeddingModelConfiguration: EmbeddingModelConfigurationProperty.Builder.() -> Unit):
          Unit =
          embeddingModelConfiguration(EmbeddingModelConfigurationProperty(embeddingModelConfiguration))

      /**
       * @param supplementalDataStorageConfiguration If you include multimodal data from your data
       * source, use this object to specify configurations for the storage location of the images
       * extracted from your documents.
       * These images can be retrieved and returned to the end user. They can also be used in
       * generation when using
       * [RetrieveAndGenerate](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html)
       * .
       */
      override
          fun supplementalDataStorageConfiguration(supplementalDataStorageConfiguration: IResolvable) {
        cdkBuilder.supplementalDataStorageConfiguration(supplementalDataStorageConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param supplementalDataStorageConfiguration If you include multimodal data from your data
       * source, use this object to specify configurations for the storage location of the images
       * extracted from your documents.
       * These images can be retrieved and returned to the end user. They can also be used in
       * generation when using
       * [RetrieveAndGenerate](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html)
       * .
       */
      override
          fun supplementalDataStorageConfiguration(supplementalDataStorageConfiguration: SupplementalDataStorageConfigurationProperty) {
        cdkBuilder.supplementalDataStorageConfiguration(supplementalDataStorageConfiguration.let(SupplementalDataStorageConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param supplementalDataStorageConfiguration If you include multimodal data from your data
       * source, use this object to specify configurations for the storage location of the images
       * extracted from your documents.
       * These images can be retrieved and returned to the end user. They can also be used in
       * generation when using
       * [RetrieveAndGenerate](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("851fdb52faef057b03c21a246d344144de41217cedd2734bcaa2f96fe3d02a68")
      override
          fun supplementalDataStorageConfiguration(supplementalDataStorageConfiguration: SupplementalDataStorageConfigurationProperty.Builder.() -> Unit):
          Unit =
          supplementalDataStorageConfiguration(SupplementalDataStorageConfigurationProperty(supplementalDataStorageConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.VectorKnowledgeBaseConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.VectorKnowledgeBaseConfigurationProperty,
    ) : CdkObject(cdkObject),
        VectorKnowledgeBaseConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the model used to create vector embeddings for the
       * knowledge base.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-vectorknowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-vectorknowledgebaseconfiguration-embeddingmodelarn)
       */
      override fun embeddingModelArn(): String = unwrap(this).getEmbeddingModelArn()

      /**
       * The embeddings model configuration details for the vector model used in Knowledge Base.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-vectorknowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-vectorknowledgebaseconfiguration-embeddingmodelconfiguration)
       */
      override fun embeddingModelConfiguration(): Any? =
          unwrap(this).getEmbeddingModelConfiguration()

      /**
       * If you include multimodal data from your data source, use this object to specify
       * configurations for the storage location of the images extracted from your documents.
       *
       * These images can be retrieved and returned to the end user. They can also be used in
       * generation when using
       * [RetrieveAndGenerate](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-vectorknowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-vectorknowledgebaseconfiguration-supplementaldatastorageconfiguration)
       */
      override fun supplementalDataStorageConfiguration(): Any? =
          unwrap(this).getSupplementalDataStorageConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VectorKnowledgeBaseConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.VectorKnowledgeBaseConfigurationProperty):
          VectorKnowledgeBaseConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VectorKnowledgeBaseConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VectorKnowledgeBaseConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.VectorKnowledgeBaseConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.VectorKnowledgeBaseConfigurationProperty
    }
  }
}
