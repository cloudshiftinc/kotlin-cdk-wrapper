@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

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
 * Properties for defining a `CfnIntelligentPromptRouter`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnIntelligentPromptRouterProps cfnIntelligentPromptRouterProps =
 * CfnIntelligentPromptRouterProps.builder()
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
public interface CfnIntelligentPromptRouterProps {
  /**
   * An optional description of the prompt router to help identify its purpose.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The default model to use when the routing criteria is not met.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-fallbackmodel)
   */
  public fun fallbackModel(): Any

  /**
   * A list of foundation models that the prompt router can route requests to.
   *
   * At least one model must be specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-models)
   */
  public fun models(): Any

  /**
   * The name of the prompt router.
   *
   * The name must be unique within your AWS account in the current region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-promptroutername)
   */
  public fun promptRouterName(): String

  /**
   * Routing criteria for a prompt router.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-routingcriteria)
   */
  public fun routingCriteria(): Any

  /**
   * An array of key-value pairs to apply to this resource as tags.
   *
   * You can use tags to categorize and manage your AWS resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnIntelligentPromptRouterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description An optional description of the prompt router to help identify its purpose.
     */
    public fun description(description: String)

    /**
     * @param fallbackModel The default model to use when the routing criteria is not met. 
     */
    public fun fallbackModel(fallbackModel: IResolvable)

    /**
     * @param fallbackModel The default model to use when the routing criteria is not met. 
     */
    public
        fun fallbackModel(fallbackModel: CfnIntelligentPromptRouter.PromptRouterTargetModelProperty)

    /**
     * @param fallbackModel The default model to use when the routing criteria is not met. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55449030e28b6e99cad71e6d30ec5894369b7e712929eda39463b3008bc28693")
    public
        fun fallbackModel(fallbackModel: CfnIntelligentPromptRouter.PromptRouterTargetModelProperty.Builder.() -> Unit)

    /**
     * @param models A list of foundation models that the prompt router can route requests to. 
     * At least one model must be specified.
     */
    public fun models(models: IResolvable)

    /**
     * @param models A list of foundation models that the prompt router can route requests to. 
     * At least one model must be specified.
     */
    public fun models(models: List<Any>)

    /**
     * @param models A list of foundation models that the prompt router can route requests to. 
     * At least one model must be specified.
     */
    public fun models(vararg models: Any)

    /**
     * @param promptRouterName The name of the prompt router. 
     * The name must be unique within your AWS account in the current region.
     */
    public fun promptRouterName(promptRouterName: String)

    /**
     * @param routingCriteria Routing criteria for a prompt router. 
     */
    public fun routingCriteria(routingCriteria: IResolvable)

    /**
     * @param routingCriteria Routing criteria for a prompt router. 
     */
    public fun routingCriteria(routingCriteria: CfnIntelligentPromptRouter.RoutingCriteriaProperty)

    /**
     * @param routingCriteria Routing criteria for a prompt router. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c43c85a1eec718f32298f4b2e9c493ca9931e8a2e0a4bf5f2f9c4494bbe9b79")
    public
        fun routingCriteria(routingCriteria: CfnIntelligentPromptRouter.RoutingCriteriaProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource as tags.
     * You can use tags to categorize and manage your AWS resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource as tags.
     * You can use tags to categorize and manage your AWS resources.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouterProps.Builder =
        software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouterProps.builder()

    /**
     * @param description An optional description of the prompt router to help identify its purpose.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param fallbackModel The default model to use when the routing criteria is not met. 
     */
    override fun fallbackModel(fallbackModel: IResolvable) {
      cdkBuilder.fallbackModel(fallbackModel.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param fallbackModel The default model to use when the routing criteria is not met. 
     */
    override
        fun fallbackModel(fallbackModel: CfnIntelligentPromptRouter.PromptRouterTargetModelProperty) {
      cdkBuilder.fallbackModel(fallbackModel.let(CfnIntelligentPromptRouter.PromptRouterTargetModelProperty.Companion::unwrap))
    }

    /**
     * @param fallbackModel The default model to use when the routing criteria is not met. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55449030e28b6e99cad71e6d30ec5894369b7e712929eda39463b3008bc28693")
    override
        fun fallbackModel(fallbackModel: CfnIntelligentPromptRouter.PromptRouterTargetModelProperty.Builder.() -> Unit):
        Unit =
        fallbackModel(CfnIntelligentPromptRouter.PromptRouterTargetModelProperty(fallbackModel))

    /**
     * @param models A list of foundation models that the prompt router can route requests to. 
     * At least one model must be specified.
     */
    override fun models(models: IResolvable) {
      cdkBuilder.models(models.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param models A list of foundation models that the prompt router can route requests to. 
     * At least one model must be specified.
     */
    override fun models(models: List<Any>) {
      cdkBuilder.models(models.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param models A list of foundation models that the prompt router can route requests to. 
     * At least one model must be specified.
     */
    override fun models(vararg models: Any): Unit = models(models.toList())

    /**
     * @param promptRouterName The name of the prompt router. 
     * The name must be unique within your AWS account in the current region.
     */
    override fun promptRouterName(promptRouterName: String) {
      cdkBuilder.promptRouterName(promptRouterName)
    }

    /**
     * @param routingCriteria Routing criteria for a prompt router. 
     */
    override fun routingCriteria(routingCriteria: IResolvable) {
      cdkBuilder.routingCriteria(routingCriteria.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param routingCriteria Routing criteria for a prompt router. 
     */
    override
        fun routingCriteria(routingCriteria: CfnIntelligentPromptRouter.RoutingCriteriaProperty) {
      cdkBuilder.routingCriteria(routingCriteria.let(CfnIntelligentPromptRouter.RoutingCriteriaProperty.Companion::unwrap))
    }

    /**
     * @param routingCriteria Routing criteria for a prompt router. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c43c85a1eec718f32298f4b2e9c493ca9931e8a2e0a4bf5f2f9c4494bbe9b79")
    override
        fun routingCriteria(routingCriteria: CfnIntelligentPromptRouter.RoutingCriteriaProperty.Builder.() -> Unit):
        Unit = routingCriteria(CfnIntelligentPromptRouter.RoutingCriteriaProperty(routingCriteria))

    /**
     * @param tags An array of key-value pairs to apply to this resource as tags.
     * You can use tags to categorize and manage your AWS resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource as tags.
     * You can use tags to categorize and manage your AWS resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouterProps,
  ) : CdkObject(cdkObject),
      CfnIntelligentPromptRouterProps {
    /**
     * An optional description of the prompt router to help identify its purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The default model to use when the routing criteria is not met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-fallbackmodel)
     */
    override fun fallbackModel(): Any = unwrap(this).getFallbackModel()

    /**
     * A list of foundation models that the prompt router can route requests to.
     *
     * At least one model must be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-models)
     */
    override fun models(): Any = unwrap(this).getModels()

    /**
     * The name of the prompt router.
     *
     * The name must be unique within your AWS account in the current region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-promptroutername)
     */
    override fun promptRouterName(): String = unwrap(this).getPromptRouterName()

    /**
     * Routing criteria for a prompt router.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-routingcriteria)
     */
    override fun routingCriteria(): Any = unwrap(this).getRoutingCriteria()

    /**
     * An array of key-value pairs to apply to this resource as tags.
     *
     * You can use tags to categorize and manage your AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-intelligentpromptrouter.html#cfn-bedrock-intelligentpromptrouter-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIntelligentPromptRouterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouterProps):
        CfnIntelligentPromptRouterProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnIntelligentPromptRouterProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIntelligentPromptRouterProps):
        software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouterProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.bedrock.CfnIntelligentPromptRouterProps
  }
}
