@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an intelligent prompt router resource for Amazon Bedrock .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnIntelligentPromptRouter cfnIntelligentPromptRouter =
 * CfnIntelligentPromptRouter.Builder.create(this, "MyCfnIntelligentPromptRouter")
 * .fallbackModel(PromptRouterTargetModelProperty.builder()
 * .modelArn("modelArn")
 * .build())
 * .models(List.of(PromptRouterTargetModelProperty.builder()
 * .modelArn("modelArn")
 * .build()))
 * .promptRouterName("promptRouterName")
 * .routingCriteria(RoutingCriteriaProperty.builder()
 * .responseQualityDifference(123)
 * .build())
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html)
 */
public open class CfnIntelligentPromptRouter(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIntelligentPromptRouterProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIntelligentPromptRouterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIntelligentPromptRouterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIntelligentPromptRouterProps(props)
  )

  /**
   * Indicates the time that the prompt router was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon Resource Name (ARN) of the prompt router.
   */
  public open fun attrPromptRouterArn(): String = unwrap(this).getAttrPromptRouterArn()

  /**
   * The router's status.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The router's type.
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   * When the router was updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * An optional description of the prompt router to help identify its purpose.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * An optional description of the prompt router to help identify its purpose.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The default model to use when the routing criteria is not met.
   */
  public open fun fallbackModel(): Any = unwrap(this).getFallbackModel()

  /**
   * The default model to use when the routing criteria is not met.
   */
  public open fun fallbackModel(`value`: IResolvable) {
    unwrap(this).setFallbackModel(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The default model to use when the routing criteria is not met.
   */
  public open fun fallbackModel(`value`: PromptRouterTargetModelProperty) {
    unwrap(this).setFallbackModel(`value`.let(PromptRouterTargetModelProperty.Companion::unwrap))
  }

  /**
   * The default model to use when the routing criteria is not met.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("88be0d4a8af8f19132f30e78908cd92441c5c860b8ef8a7ba9af0e6410c24745")
  public open fun fallbackModel(`value`: PromptRouterTargetModelProperty.Builder.() -> Unit): Unit =
      fallbackModel(PromptRouterTargetModelProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A list of foundation models that the prompt router can route requests to.
   */
  public open fun models(): Any = unwrap(this).getModels()

  /**
   * A list of foundation models that the prompt router can route requests to.
   */
  public open fun models(`value`: IResolvable) {
    unwrap(this).setModels(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of foundation models that the prompt router can route requests to.
   */
  public open fun models(`value`: List<Any>) {
    unwrap(this).setModels(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of foundation models that the prompt router can route requests to.
   */
  public open fun models(vararg `value`: Any): Unit = models(`value`.toList())

  /**
   * The name of the prompt router.
   */
  public open fun promptRouterName(): String = unwrap(this).getPromptRouterName()

  /**
   * The name of the prompt router.
   */
  public open fun promptRouterName(`value`: String) {
    unwrap(this).setPromptRouterName(`value`)
  }

  /**
   * Routing criteria for a prompt router.
   */
  public open fun routingCriteria(): Any = unwrap(this).getRoutingCriteria()

  /**
   * Routing criteria for a prompt router.
   */
  public open fun routingCriteria(`value`: IResolvable) {
    unwrap(this).setRoutingCriteria(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Routing criteria for a prompt router.
   */
  public open fun routingCriteria(`value`: RoutingCriteriaProperty) {
    unwrap(this).setRoutingCriteria(`value`.let(RoutingCriteriaProperty.Companion::unwrap))
  }

  /**
   * Routing criteria for a prompt router.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7d3b4ce0fdf7c4f8fc2c0a201e388fbddcc555ffcc0286ad9ddeb2bced29f26b")
  public open fun routingCriteria(`value`: RoutingCriteriaProperty.Builder.() -> Unit): Unit =
      routingCriteria(RoutingCriteriaProperty(`value`))

  /**
   * An array of key-value pairs to apply to this resource as tags.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource as tags.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource as tags.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnIntelligentPromptRouter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional description of the prompt router to help identify its purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-description)
     * @param description An optional description of the prompt router to help identify its purpose.
     * 
     */
    public fun description(description: String)

    /**
     * The default model to use when the routing criteria is not met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-fallbackmodel)
     * @param fallbackModel The default model to use when the routing criteria is not met. 
     */
    public fun fallbackModel(fallbackModel: IResolvable)

    /**
     * The default model to use when the routing criteria is not met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-fallbackmodel)
     * @param fallbackModel The default model to use when the routing criteria is not met. 
     */
    public fun fallbackModel(fallbackModel: PromptRouterTargetModelProperty)

    /**
     * The default model to use when the routing criteria is not met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-fallbackmodel)
     * @param fallbackModel The default model to use when the routing criteria is not met. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6a6201bdc79fb95da6691bc3f9af78b4245e7e306849b0e000f8b82398b94584")
    public fun fallbackModel(fallbackModel: PromptRouterTargetModelProperty.Builder.() -> Unit)

    /**
     * A list of foundation models that the prompt router can route requests to.
     *
     * At least one model must be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-models)
     * @param models A list of foundation models that the prompt router can route requests to. 
     */
    public fun models(models: IResolvable)

    /**
     * A list of foundation models that the prompt router can route requests to.
     *
     * At least one model must be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-models)
     * @param models A list of foundation models that the prompt router can route requests to. 
     */
    public fun models(models: List<Any>)

    /**
     * A list of foundation models that the prompt router can route requests to.
     *
     * At least one model must be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-models)
     * @param models A list of foundation models that the prompt router can route requests to. 
     */
    public fun models(vararg models: Any)

    /**
     * The name of the prompt router.
     *
     * The name must be unique within your AWS account in the current region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-promptroutername)
     * @param promptRouterName The name of the prompt router. 
     */
    public fun promptRouterName(promptRouterName: String)

    /**
     * Routing criteria for a prompt router.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-routingcriteria)
     * @param routingCriteria Routing criteria for a prompt router. 
     */
    public fun routingCriteria(routingCriteria: IResolvable)

    /**
     * Routing criteria for a prompt router.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-routingcriteria)
     * @param routingCriteria Routing criteria for a prompt router. 
     */
    public fun routingCriteria(routingCriteria: RoutingCriteriaProperty)

    /**
     * Routing criteria for a prompt router.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-routingcriteria)
     * @param routingCriteria Routing criteria for a prompt router. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2932faacf78ca726ad4939e7367f3760990fe8d946c79aa6751250ebf46affdc")
    public fun routingCriteria(routingCriteria: RoutingCriteriaProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource as tags.
     *
     * You can use tags to categorize and manage your AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-tags)
     * @param tags An array of key-value pairs to apply to this resource as tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource as tags.
     *
     * You can use tags to categorize and manage your AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-tags)
     * @param tags An array of key-value pairs to apply to this resource as tags. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.Builder =
        software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.Builder.create(scope, id)

    /**
     * An optional description of the prompt router to help identify its purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-description)
     * @param description An optional description of the prompt router to help identify its purpose.
     * 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The default model to use when the routing criteria is not met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-fallbackmodel)
     * @param fallbackModel The default model to use when the routing criteria is not met. 
     */
    override fun fallbackModel(fallbackModel: IResolvable) {
      cdkBuilder.fallbackModel(fallbackModel.let(IResolvable.Companion::unwrap))
    }

    /**
     * The default model to use when the routing criteria is not met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-fallbackmodel)
     * @param fallbackModel The default model to use when the routing criteria is not met. 
     */
    override fun fallbackModel(fallbackModel: PromptRouterTargetModelProperty) {
      cdkBuilder.fallbackModel(fallbackModel.let(PromptRouterTargetModelProperty.Companion::unwrap))
    }

    /**
     * The default model to use when the routing criteria is not met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-fallbackmodel)
     * @param fallbackModel The default model to use when the routing criteria is not met. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6a6201bdc79fb95da6691bc3f9af78b4245e7e306849b0e000f8b82398b94584")
    override fun fallbackModel(fallbackModel: PromptRouterTargetModelProperty.Builder.() -> Unit):
        Unit = fallbackModel(PromptRouterTargetModelProperty(fallbackModel))

    /**
     * A list of foundation models that the prompt router can route requests to.
     *
     * At least one model must be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-models)
     * @param models A list of foundation models that the prompt router can route requests to. 
     */
    override fun models(models: IResolvable) {
      cdkBuilder.models(models.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of foundation models that the prompt router can route requests to.
     *
     * At least one model must be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-models)
     * @param models A list of foundation models that the prompt router can route requests to. 
     */
    override fun models(models: List<Any>) {
      cdkBuilder.models(models.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of foundation models that the prompt router can route requests to.
     *
     * At least one model must be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-models)
     * @param models A list of foundation models that the prompt router can route requests to. 
     */
    override fun models(vararg models: Any): Unit = models(models.toList())

    /**
     * The name of the prompt router.
     *
     * The name must be unique within your AWS account in the current region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-promptroutername)
     * @param promptRouterName The name of the prompt router. 
     */
    override fun promptRouterName(promptRouterName: String) {
      cdkBuilder.promptRouterName(promptRouterName)
    }

    /**
     * Routing criteria for a prompt router.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-routingcriteria)
     * @param routingCriteria Routing criteria for a prompt router. 
     */
    override fun routingCriteria(routingCriteria: IResolvable) {
      cdkBuilder.routingCriteria(routingCriteria.let(IResolvable.Companion::unwrap))
    }

    /**
     * Routing criteria for a prompt router.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-routingcriteria)
     * @param routingCriteria Routing criteria for a prompt router. 
     */
    override fun routingCriteria(routingCriteria: RoutingCriteriaProperty) {
      cdkBuilder.routingCriteria(routingCriteria.let(RoutingCriteriaProperty.Companion::unwrap))
    }

    /**
     * Routing criteria for a prompt router.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-routingcriteria)
     * @param routingCriteria Routing criteria for a prompt router. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2932faacf78ca726ad4939e7367f3760990fe8d946c79aa6751250ebf46affdc")
    override fun routingCriteria(routingCriteria: RoutingCriteriaProperty.Builder.() -> Unit): Unit
        = routingCriteria(RoutingCriteriaProperty(routingCriteria))

    /**
     * An array of key-value pairs to apply to this resource as tags.
     *
     * You can use tags to categorize and manage your AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-tags)
     * @param tags An array of key-value pairs to apply to this resource as tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource as tags.
     *
     * You can use tags to categorize and manage your AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-tags)
     * @param tags An array of key-value pairs to apply to this resource as tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIntelligentPromptRouter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIntelligentPromptRouter(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter):
        CfnIntelligentPromptRouter = CfnIntelligentPromptRouter(cdkObject)

    internal fun unwrap(wrapped: CfnIntelligentPromptRouter):
        software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter = wrapped.cdkObject as
        software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter
  }

  /**
   * The target model for a prompt router.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptRouterTargetModelProperty promptRouterTargetModelProperty =
   * PromptRouterTargetModelProperty.builder()
   * .modelArn("modelArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-intelligentpromptrouter-promptroutertargetmodel.html)
   */
  public interface PromptRouterTargetModelProperty {
    /**
     * The target model's ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-intelligentpromptrouter-promptroutertargetmodel.html#cfn-bedrock-intelligentpromptrouter-promptroutertargetmodel-modelarn)
     */
    public fun modelArn(): String

    /**
     * A builder for [PromptRouterTargetModelProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param modelArn The target model's ARN. 
       */
      public fun modelArn(modelArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.PromptRouterTargetModelProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.PromptRouterTargetModelProperty.builder()

      /**
       * @param modelArn The target model's ARN. 
       */
      override fun modelArn(modelArn: String) {
        cdkBuilder.modelArn(modelArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.PromptRouterTargetModelProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.PromptRouterTargetModelProperty,
    ) : CdkObject(cdkObject),
        PromptRouterTargetModelProperty {
      /**
       * The target model's ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-intelligentpromptrouter-promptroutertargetmodel.html#cfn-bedrock-intelligentpromptrouter-promptroutertargetmodel-modelarn)
       */
      override fun modelArn(): String = unwrap(this).getModelArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptRouterTargetModelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.PromptRouterTargetModelProperty):
          PromptRouterTargetModelProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptRouterTargetModelProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptRouterTargetModelProperty):
          software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.PromptRouterTargetModelProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.PromptRouterTargetModelProperty
    }
  }

  /**
   * Routing criteria for a prompt router.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RoutingCriteriaProperty routingCriteriaProperty = RoutingCriteriaProperty.builder()
   * .responseQualityDifference(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-intelligentpromptrouter-routingcriteria.html)
   */
  public interface RoutingCriteriaProperty {
    /**
     * The criteria's response quality difference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-intelligentpromptrouter-routingcriteria.html#cfn-bedrock-intelligentpromptrouter-routingcriteria-responsequalitydifference)
     */
    public fun responseQualityDifference(): Number

    /**
     * A builder for [RoutingCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param responseQualityDifference The criteria's response quality difference. 
       */
      public fun responseQualityDifference(responseQualityDifference: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.RoutingCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.RoutingCriteriaProperty.builder()

      /**
       * @param responseQualityDifference The criteria's response quality difference. 
       */
      override fun responseQualityDifference(responseQualityDifference: Number) {
        cdkBuilder.responseQualityDifference(responseQualityDifference)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.RoutingCriteriaProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.RoutingCriteriaProperty,
    ) : CdkObject(cdkObject),
        RoutingCriteriaProperty {
      /**
       * The criteria's response quality difference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-intelligentpromptrouter-routingcriteria.html#cfn-bedrock-intelligentpromptrouter-routingcriteria-responsequalitydifference)
       */
      override fun responseQualityDifference(): Number = unwrap(this).getResponseQualityDifference()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RoutingCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.RoutingCriteriaProperty):
          RoutingCriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as? RoutingCriteriaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoutingCriteriaProperty):
          software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.RoutingCriteriaProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouter.RoutingCriteriaProperty
    }
  }
}
