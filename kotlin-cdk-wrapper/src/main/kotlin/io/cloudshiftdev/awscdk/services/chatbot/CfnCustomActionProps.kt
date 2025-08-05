@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.chatbot

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
 * Properties for defining a `CfnCustomAction`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.chatbot.*;
 * CfnCustomActionProps cfnCustomActionProps = CfnCustomActionProps.builder()
 * .actionName("actionName")
 * .definition(CustomActionDefinitionProperty.builder()
 * .commandText("commandText")
 * .build())
 * // the properties below are optional
 * .aliasName("aliasName")
 * .attachments(List.of(CustomActionAttachmentProperty.builder()
 * .buttonText("buttonText")
 * .criteria(List.of(CustomActionAttachmentCriteriaProperty.builder()
 * .operator("operator")
 * .variableName("variableName")
 * // the properties below are optional
 * .value("value")
 * .build()))
 * .notificationType("notificationType")
 * .variables(Map.of(
 * "variablesKey", "variables"))
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html)
 */
public interface CfnCustomActionProps {
  /**
   * The name of the custom action.
   *
   * This name is included in the Amazon Resource Name (ARN).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-actionname)
   */
  public fun actionName(): String

  /**
   * The name used to invoke this action in a chat channel.
   *
   * For example, `&#64;Amazon Q run my-alias` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-aliasname)
   */
  public fun aliasName(): String? = unwrap(this).getAliasName()

  /**
   * Defines when this custom action button should be attached to a notification.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-attachments)
   */
  public fun attachments(): Any? = unwrap(this).getAttachments()

  /**
   * The definition of the command to run when invoked as an alias or as an action button.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-definition)
   */
  public fun definition(): Any

  /**
   * The tags to add to the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCustomActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The name of the custom action. 
     * This name is included in the Amazon Resource Name (ARN).
     */
    public fun actionName(actionName: String)

    /**
     * @param aliasName The name used to invoke this action in a chat channel.
     * For example, `&#64;Amazon Q run my-alias` .
     */
    public fun aliasName(aliasName: String)

    /**
     * @param attachments Defines when this custom action button should be attached to a
     * notification.
     */
    public fun attachments(attachments: IResolvable)

    /**
     * @param attachments Defines when this custom action button should be attached to a
     * notification.
     */
    public fun attachments(attachments: List<Any>)

    /**
     * @param attachments Defines when this custom action button should be attached to a
     * notification.
     */
    public fun attachments(vararg attachments: Any)

    /**
     * @param definition The definition of the command to run when invoked as an alias or as an
     * action button. 
     */
    public fun definition(definition: IResolvable)

    /**
     * @param definition The definition of the command to run when invoked as an alias or as an
     * action button. 
     */
    public fun definition(definition: CfnCustomAction.CustomActionDefinitionProperty)

    /**
     * @param definition The definition of the command to run when invoked as an alias or as an
     * action button. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ceedca7355ebe4dec199f552ff490bf38b72f4291dc4efbc68eb2b660b6f53f")
    public
        fun definition(definition: CfnCustomAction.CustomActionDefinitionProperty.Builder.() -> Unit)

    /**
     * @param tags The tags to add to the configuration.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to the configuration.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.chatbot.CfnCustomActionProps.Builder =
        software.amazon.awscdk.services.chatbot.CfnCustomActionProps.builder()

    /**
     * @param actionName The name of the custom action. 
     * This name is included in the Amazon Resource Name (ARN).
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param aliasName The name used to invoke this action in a chat channel.
     * For example, `&#64;Amazon Q run my-alias` .
     */
    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    /**
     * @param attachments Defines when this custom action button should be attached to a
     * notification.
     */
    override fun attachments(attachments: IResolvable) {
      cdkBuilder.attachments(attachments.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param attachments Defines when this custom action button should be attached to a
     * notification.
     */
    override fun attachments(attachments: List<Any>) {
      cdkBuilder.attachments(attachments.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param attachments Defines when this custom action button should be attached to a
     * notification.
     */
    override fun attachments(vararg attachments: Any): Unit = attachments(attachments.toList())

    /**
     * @param definition The definition of the command to run when invoked as an alias or as an
     * action button. 
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param definition The definition of the command to run when invoked as an alias or as an
     * action button. 
     */
    override fun definition(definition: CfnCustomAction.CustomActionDefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnCustomAction.CustomActionDefinitionProperty.Companion::unwrap))
    }

    /**
     * @param definition The definition of the command to run when invoked as an alias or as an
     * action button. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ceedca7355ebe4dec199f552ff490bf38b72f4291dc4efbc68eb2b660b6f53f")
    override
        fun definition(definition: CfnCustomAction.CustomActionDefinitionProperty.Builder.() -> Unit):
        Unit = definition(CfnCustomAction.CustomActionDefinitionProperty(definition))

    /**
     * @param tags The tags to add to the configuration.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to add to the configuration.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.chatbot.CfnCustomActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.chatbot.CfnCustomActionProps,
  ) : CdkObject(cdkObject),
      CfnCustomActionProps {
    /**
     * The name of the custom action.
     *
     * This name is included in the Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-actionname)
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * The name used to invoke this action in a chat channel.
     *
     * For example, `&#64;Amazon Q run my-alias` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-aliasname)
     */
    override fun aliasName(): String? = unwrap(this).getAliasName()

    /**
     * Defines when this custom action button should be attached to a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-attachments)
     */
    override fun attachments(): Any? = unwrap(this).getAttachments()

    /**
     * The definition of the command to run when invoked as an alias or as an action button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-definition)
     */
    override fun definition(): Any = unwrap(this).getDefinition()

    /**
     * The tags to add to the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.CfnCustomActionProps):
        CfnCustomActionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCustomActionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomActionProps):
        software.amazon.awscdk.services.chatbot.CfnCustomActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.chatbot.CfnCustomActionProps
  }
}
