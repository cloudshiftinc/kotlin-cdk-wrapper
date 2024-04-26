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
 * .build())
 * .build())
 * .name("name")
 * .roleArn("roleArn")
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
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnKnowledgeBaseProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnKnowledgeBase(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnKnowledgeBaseProps::unwrap))
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Contains details about the embeddings configuration of the knowledge base.
   */
  public open fun knowledgeBaseConfiguration(): Any = unwrap(this).getKnowledgeBaseConfiguration()

  /**
   * Contains details about the embeddings configuration of the knowledge base.
   */
  public open fun knowledgeBaseConfiguration(`value`: IResolvable) {
    unwrap(this).setKnowledgeBaseConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains details about the embeddings configuration of the knowledge base.
   */
  public open fun knowledgeBaseConfiguration(`value`: KnowledgeBaseConfigurationProperty) {
    unwrap(this).setKnowledgeBaseConfiguration(`value`.let(KnowledgeBaseConfigurationProperty::unwrap))
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
      cdkBuilder.knowledgeBaseConfiguration(knowledgeBaseConfiguration.let(IResolvable::unwrap))
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
      cdkBuilder.knowledgeBaseConfiguration(knowledgeBaseConfiguration.let(KnowledgeBaseConfigurationProperty::unwrap))
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
   * Contains details about the embeddings configuration of the knowledge base.
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
        cdkBuilder.vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param vectorKnowledgeBaseConfiguration Contains details about the embeddings model
       * that'sused to convert the data source. 
       */
      override
          fun vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration: VectorKnowledgeBaseConfigurationProperty) {
        cdkBuilder.vectorKnowledgeBaseConfiguration(vectorKnowledgeBaseConfiguration.let(VectorKnowledgeBaseConfigurationProperty::unwrap))
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
    ) : CdkObject(cdkObject), KnowledgeBaseConfigurationProperty {
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
     * A builder for [VectorKnowledgeBaseConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param embeddingModelArn The Amazon Resource Name (ARN) of the model used to create vector
       * embeddings for the knowledge base. 
       */
      public fun embeddingModelArn(embeddingModelArn: String)
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

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.VectorKnowledgeBaseConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnKnowledgeBase.VectorKnowledgeBaseConfigurationProperty,
    ) : CdkObject(cdkObject), VectorKnowledgeBaseConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the model used to create vector embeddings for the
       * knowledge base.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-knowledgebase-vectorknowledgebaseconfiguration.html#cfn-bedrock-knowledgebase-vectorknowledgebaseconfiguration-embeddingmodelarn)
       */
      override fun embeddingModelArn(): String = unwrap(this).getEmbeddingModelArn()
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
