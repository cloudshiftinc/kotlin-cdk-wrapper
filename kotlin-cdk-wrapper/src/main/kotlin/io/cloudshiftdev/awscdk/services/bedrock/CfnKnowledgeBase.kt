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
 * .vectorKnowledgeBaseConfiguration(VectorKnowledgeBaseConfigurationProperty.builder()
 * .embeddingModelArn("embeddingModelArn")
 * // the properties below are optional
 * .embeddingModelConfiguration(EmbeddingModelConfigurationProperty.builder()
 * .bedrockEmbeddingModelConfiguration(BedrockEmbeddingModelConfigurationProperty.builder()
 * .dimensions(123)
 * .build())
 * .build())
 * .build())
 * .build())
 * .name("name")
 * .roleArn("roleArn")
 * .storageConfiguration(StorageConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
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
 * .build())
 * .resourceArn("resourceArn")
 * .tableName("tableName")
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
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
   * The time at which the knowledge base was created.
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
   * The unique identifier of the knowledge base.
   */
  public open fun attrKnowledgeBaseId(): String = unwrap(this).getAttrKnowledgeBaseId()

  /**
   * The status of the knowledge base.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The time at which the knowledge base was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the knowledge base.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the knowledge base.
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
  public open fun storageConfiguration(): Any = unwrap(this).getStorageConfiguration()

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
     * The description of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-description)
     * @param description The description of the knowledge base. 
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
     * The description of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-knowledgebase.html#cfn-bedrock-knowledgebase-description)
     * @param description The description of the knowledge base. 
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
     * A builder for [BedrockEmbeddingModelConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensions The dimensions details for the vector configuration used on the Bedrock
       * embeddings model.
       */
      public fun dimensions(dimensions: Number)
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
   * .vectorKnowledgeBaseConfiguration(VectorKnowledgeBaseConfigurationProperty.builder()
   * .embeddingModelArn("embeddingModelArn")
   * // the properties below are optional
   * .embeddingModelConfiguration(EmbeddingModelConfigurationProperty.builder()
   * .bedrockEmbeddingModelConfiguration(BedrockEmbeddingModelConfigurationProperty.builder()
   * .dimensions(123)
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-knowledgebaseconfiguration.html)
   */
  public interface KnowledgeBaseConfigurationProperty {
    /**
     * The type of data that the data source is converted into for the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-knowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration-type)
     */
    public fun type(): String

    /**
     * Contains details about the embeddings model that'sused to convert the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-knowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration-vectorknowledgebaseconfiguration)
     */
    public fun vectorKnowledgeBaseConfiguration(): Any

    /**
     * A builder for [KnowledgeBaseConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of data that the data source is converted into for the knowledge base.
       * 
       */
      public fun type(type: String)

      /**
       * @param vectorKnowledgeBaseConfiguration Contains details about the embeddings model
       * that'sused to convert the data source. 
       */
      public fun vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration: IResolvable)

      /**
       * @param vectorKnowledgeBaseConfiguration Contains details about the embeddings model
       * that'sused to convert the data source. 
       */
      public
          fun vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration: VectorKnowledgeBaseConfigurationProperty)

      /**
       * @param vectorKnowledgeBaseConfiguration Contains details about the embeddings model
       * that'sused to convert the data source. 
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
       * @param type The type of data that the data source is converted into for the knowledge base.
       * 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param vectorKnowledgeBaseConfiguration Contains details about the embeddings model
       * that'sused to convert the data source. 
       */
      override fun vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration: IResolvable) {
        cdkBuilder.vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vectorKnowledgeBaseConfiguration Contains details about the embeddings model
       * that'sused to convert the data source. 
       */
      override
          fun vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration: VectorKnowledgeBaseConfigurationProperty) {
        cdkBuilder.vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration.let(VectorKnowledgeBaseConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param vectorKnowledgeBaseConfiguration Contains details about the embeddings model
       * that'sused to convert the data source. 
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
       * The type of data that the data source is converted into for the knowledge base.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-knowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * Contains details about the embeddings model that'sused to convert the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-knowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-knowledgebaseconfiguration-vectorknowledgebaseconfiguration)
       */
      override fun vectorKnowledgeBaseConfiguration(): Any =
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-rdsfieldmapping.html)
   */
  public interface RdsFieldMappingProperty {
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
   * .build())
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
