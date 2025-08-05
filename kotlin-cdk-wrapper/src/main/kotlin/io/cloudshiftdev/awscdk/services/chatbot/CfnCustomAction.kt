@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.chatbot

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * AWS Chatbot is now  .
 *
 * [Learn more](https://docs.aws.amazon.com//chatbot/latest/adminguide/service-rename.html)
 *
 *
 * `Type` attribute values remain unchanged.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.chatbot.*;
 * CfnCustomAction cfnCustomAction = CfnCustomAction.Builder.create(this, "MyCfnCustomAction")
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
public open class CfnCustomAction(
  cdkObject: software.amazon.awscdk.services.chatbot.CfnCustomAction,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomActionProps,
  ) :
      this(software.amazon.awscdk.services.chatbot.CfnCustomAction(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCustomActionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomActionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCustomActionProps(props)
  )

  /**
   * The name of the custom action.
   */
  public open fun actionName(): String = unwrap(this).getActionName()

  /**
   * The name of the custom action.
   */
  public open fun actionName(`value`: String) {
    unwrap(this).setActionName(`value`)
  }

  /**
   * The name used to invoke this action in a chat channel.
   */
  public open fun aliasName(): String? = unwrap(this).getAliasName()

  /**
   * The name used to invoke this action in a chat channel.
   */
  public open fun aliasName(`value`: String) {
    unwrap(this).setAliasName(`value`)
  }

  /**
   * Defines when this custom action button should be attached to a notification.
   */
  public open fun attachments(): Any? = unwrap(this).getAttachments()

  /**
   * Defines when this custom action button should be attached to a notification.
   */
  public open fun attachments(`value`: IResolvable) {
    unwrap(this).setAttachments(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Defines when this custom action button should be attached to a notification.
   */
  public open fun attachments(`value`: List<Any>) {
    unwrap(this).setAttachments(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Defines when this custom action button should be attached to a notification.
   */
  public open fun attachments(vararg `value`: Any): Unit = attachments(`value`.toList())

  /**
   * The fully defined ARN of the custom action.
   */
  public open fun attrCustomActionArn(): String = unwrap(this).getAttrCustomActionArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The definition of the command to run when invoked as an alias or as an action button.
   */
  public open fun definition(): Any = unwrap(this).getDefinition()

  /**
   * The definition of the command to run when invoked as an alias or as an action button.
   */
  public open fun definition(`value`: IResolvable) {
    unwrap(this).setDefinition(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The definition of the command to run when invoked as an alias or as an action button.
   */
  public open fun definition(`value`: CustomActionDefinitionProperty) {
    unwrap(this).setDefinition(`value`.let(CustomActionDefinitionProperty.Companion::unwrap))
  }

  /**
   * The definition of the command to run when invoked as an alias or as an action button.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3cacf49aff7dad90334e9f742c226f65a1c48a531f1dc228971a26296af494b2")
  public open fun definition(`value`: CustomActionDefinitionProperty.Builder.() -> Unit): Unit =
      definition(CustomActionDefinitionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The tags to add to the configuration.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to add to the configuration.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to add to the configuration.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.chatbot.CfnCustomAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the custom action.
     *
     * This name is included in the Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-actionname)
     * @param actionName The name of the custom action. 
     */
    public fun actionName(actionName: String)

    /**
     * The name used to invoke this action in a chat channel.
     *
     * For example, `&#64;Amazon Q run my-alias` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-aliasname)
     * @param aliasName The name used to invoke this action in a chat channel. 
     */
    public fun aliasName(aliasName: String)

    /**
     * Defines when this custom action button should be attached to a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-attachments)
     * @param attachments Defines when this custom action button should be attached to a
     * notification. 
     */
    public fun attachments(attachments: IResolvable)

    /**
     * Defines when this custom action button should be attached to a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-attachments)
     * @param attachments Defines when this custom action button should be attached to a
     * notification. 
     */
    public fun attachments(attachments: List<Any>)

    /**
     * Defines when this custom action button should be attached to a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-attachments)
     * @param attachments Defines when this custom action button should be attached to a
     * notification. 
     */
    public fun attachments(vararg attachments: Any)

    /**
     * The definition of the command to run when invoked as an alias or as an action button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-definition)
     * @param definition The definition of the command to run when invoked as an alias or as an
     * action button. 
     */
    public fun definition(definition: IResolvable)

    /**
     * The definition of the command to run when invoked as an alias or as an action button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-definition)
     * @param definition The definition of the command to run when invoked as an alias or as an
     * action button. 
     */
    public fun definition(definition: CustomActionDefinitionProperty)

    /**
     * The definition of the command to run when invoked as an alias or as an action button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-definition)
     * @param definition The definition of the command to run when invoked as an alias or as an
     * action button. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("426491fbbfa70959f8743e76be1689cfbbfdd6b7e6890a9b40faf81b82624db0")
    public fun definition(definition: CustomActionDefinitionProperty.Builder.() -> Unit)

    /**
     * The tags to add to the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-tags)
     * @param tags The tags to add to the configuration. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to add to the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-tags)
     * @param tags The tags to add to the configuration. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.chatbot.CfnCustomAction.Builder =
        software.amazon.awscdk.services.chatbot.CfnCustomAction.Builder.create(scope, id)

    /**
     * The name of the custom action.
     *
     * This name is included in the Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-actionname)
     * @param actionName The name of the custom action. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * The name used to invoke this action in a chat channel.
     *
     * For example, `&#64;Amazon Q run my-alias` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-aliasname)
     * @param aliasName The name used to invoke this action in a chat channel. 
     */
    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    /**
     * Defines when this custom action button should be attached to a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-attachments)
     * @param attachments Defines when this custom action button should be attached to a
     * notification. 
     */
    override fun attachments(attachments: IResolvable) {
      cdkBuilder.attachments(attachments.let(IResolvable.Companion::unwrap))
    }

    /**
     * Defines when this custom action button should be attached to a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-attachments)
     * @param attachments Defines when this custom action button should be attached to a
     * notification. 
     */
    override fun attachments(attachments: List<Any>) {
      cdkBuilder.attachments(attachments.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Defines when this custom action button should be attached to a notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-attachments)
     * @param attachments Defines when this custom action button should be attached to a
     * notification. 
     */
    override fun attachments(vararg attachments: Any): Unit = attachments(attachments.toList())

    /**
     * The definition of the command to run when invoked as an alias or as an action button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-definition)
     * @param definition The definition of the command to run when invoked as an alias or as an
     * action button. 
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable.Companion::unwrap))
    }

    /**
     * The definition of the command to run when invoked as an alias or as an action button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-definition)
     * @param definition The definition of the command to run when invoked as an alias or as an
     * action button. 
     */
    override fun definition(definition: CustomActionDefinitionProperty) {
      cdkBuilder.definition(definition.let(CustomActionDefinitionProperty.Companion::unwrap))
    }

    /**
     * The definition of the command to run when invoked as an alias or as an action button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-definition)
     * @param definition The definition of the command to run when invoked as an alias or as an
     * action button. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("426491fbbfa70959f8743e76be1689cfbbfdd6b7e6890a9b40faf81b82624db0")
    override fun definition(definition: CustomActionDefinitionProperty.Builder.() -> Unit): Unit =
        definition(CustomActionDefinitionProperty(definition))

    /**
     * The tags to add to the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-tags)
     * @param tags The tags to add to the configuration. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to add to the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-customaction.html#cfn-chatbot-customaction-tags)
     * @param tags The tags to add to the configuration. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.chatbot.CfnCustomAction = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.chatbot.CfnCustomAction.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomAction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomAction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.CfnCustomAction):
        CfnCustomAction = CfnCustomAction(cdkObject)

    internal fun unwrap(wrapped: CfnCustomAction):
        software.amazon.awscdk.services.chatbot.CfnCustomAction = wrapped.cdkObject as
        software.amazon.awscdk.services.chatbot.CfnCustomAction
  }

  /**
   * AWS Chatbot is now  . [Learn
   * more](https://docs.aws.amazon.com//chatbot/latest/adminguide/service-rename.html) &gt;  &gt;
   * `Type` attribute values remain unchanged.
   *
   * A criteria for when a button should be shown based on values in the notification.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.chatbot.*;
   * CustomActionAttachmentCriteriaProperty customActionAttachmentCriteriaProperty =
   * CustomActionAttachmentCriteriaProperty.builder()
   * .operator("operator")
   * .variableName("variableName")
   * // the properties below are optional
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachmentcriteria.html)
   */
  public interface CustomActionAttachmentCriteriaProperty {
    /**
     * The operation to perform on the named variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachmentcriteria.html#cfn-chatbot-customaction-customactionattachmentcriteria-operator)
     */
    public fun `operator`(): String

    /**
     * A value that is compared with the actual value of the variable based on the behavior of the
     * operator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachmentcriteria.html#cfn-chatbot-customaction-customactionattachmentcriteria-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * The name of the variable to operate on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachmentcriteria.html#cfn-chatbot-customaction-customactionattachmentcriteria-variablename)
     */
    public fun variableName(): String

    /**
     * A builder for [CustomActionAttachmentCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param operator The operation to perform on the named variable. 
       */
      public fun `operator`(`operator`: String)

      /**
       * @param value A value that is compared with the actual value of the variable based on the
       * behavior of the operator.
       */
      public fun `value`(`value`: String)

      /**
       * @param variableName The name of the variable to operate on. 
       */
      public fun variableName(variableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionAttachmentCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionAttachmentCriteriaProperty.builder()

      /**
       * @param operator The operation to perform on the named variable. 
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param value A value that is compared with the actual value of the variable based on the
       * behavior of the operator.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      /**
       * @param variableName The name of the variable to operate on. 
       */
      override fun variableName(variableName: String) {
        cdkBuilder.variableName(variableName)
      }

      public fun build():
          software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionAttachmentCriteriaProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionAttachmentCriteriaProperty,
    ) : CdkObject(cdkObject),
        CustomActionAttachmentCriteriaProperty {
      /**
       * The operation to perform on the named variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachmentcriteria.html#cfn-chatbot-customaction-customactionattachmentcriteria-operator)
       */
      override fun `operator`(): String = unwrap(this).getOperator()

      /**
       * A value that is compared with the actual value of the variable based on the behavior of the
       * operator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachmentcriteria.html#cfn-chatbot-customaction-customactionattachmentcriteria-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()

      /**
       * The name of the variable to operate on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachmentcriteria.html#cfn-chatbot-customaction-customactionattachmentcriteria-variablename)
       */
      override fun variableName(): String = unwrap(this).getVariableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomActionAttachmentCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionAttachmentCriteriaProperty):
          CustomActionAttachmentCriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomActionAttachmentCriteriaProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomActionAttachmentCriteriaProperty):
          software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionAttachmentCriteriaProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionAttachmentCriteriaProperty
    }
  }

  /**
   * AWS Chatbot is now  . [Learn
   * more](https://docs.aws.amazon.com//chatbot/latest/adminguide/service-rename.html) &gt;  &gt;
   * `Type` attribute values remain unchanged.
   *
   * Defines when a custom action button should be attached to a notification.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.chatbot.*;
   * CustomActionAttachmentProperty customActionAttachmentProperty =
   * CustomActionAttachmentProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachment.html)
   */
  public interface CustomActionAttachmentProperty {
    /**
     * The text of the button that appears on the notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachment.html#cfn-chatbot-customaction-customactionattachment-buttontext)
     */
    public fun buttonText(): String? = unwrap(this).getButtonText()

    /**
     * The criteria for when a button should be shown based on values in the notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachment.html#cfn-chatbot-customaction-customactionattachment-criteria)
     */
    public fun criteria(): Any? = unwrap(this).getCriteria()

    /**
     * The type of notification that the custom action should be attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachment.html#cfn-chatbot-customaction-customactionattachment-notificationtype)
     */
    public fun notificationType(): String? = unwrap(this).getNotificationType()

    /**
     * The variables to extract from the notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachment.html#cfn-chatbot-customaction-customactionattachment-variables)
     */
    public fun variables(): Any? = unwrap(this).getVariables()

    /**
     * A builder for [CustomActionAttachmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param buttonText The text of the button that appears on the notification.
       */
      public fun buttonText(buttonText: String)

      /**
       * @param criteria The criteria for when a button should be shown based on values in the
       * notification.
       */
      public fun criteria(criteria: IResolvable)

      /**
       * @param criteria The criteria for when a button should be shown based on values in the
       * notification.
       */
      public fun criteria(criteria: List<Any>)

      /**
       * @param criteria The criteria for when a button should be shown based on values in the
       * notification.
       */
      public fun criteria(vararg criteria: Any)

      /**
       * @param notificationType The type of notification that the custom action should be attached
       * to.
       */
      public fun notificationType(notificationType: String)

      /**
       * @param variables The variables to extract from the notification.
       */
      public fun variables(variables: Map<String, String>)

      /**
       * @param variables The variables to extract from the notification.
       */
      public fun variables(variables: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionAttachmentProperty.Builder
          =
          software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionAttachmentProperty.builder()

      /**
       * @param buttonText The text of the button that appears on the notification.
       */
      override fun buttonText(buttonText: String) {
        cdkBuilder.buttonText(buttonText)
      }

      /**
       * @param criteria The criteria for when a button should be shown based on values in the
       * notification.
       */
      override fun criteria(criteria: IResolvable) {
        cdkBuilder.criteria(criteria.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param criteria The criteria for when a button should be shown based on values in the
       * notification.
       */
      override fun criteria(criteria: List<Any>) {
        cdkBuilder.criteria(criteria.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param criteria The criteria for when a button should be shown based on values in the
       * notification.
       */
      override fun criteria(vararg criteria: Any): Unit = criteria(criteria.toList())

      /**
       * @param notificationType The type of notification that the custom action should be attached
       * to.
       */
      override fun notificationType(notificationType: String) {
        cdkBuilder.notificationType(notificationType)
      }

      /**
       * @param variables The variables to extract from the notification.
       */
      override fun variables(variables: Map<String, String>) {
        cdkBuilder.variables(variables)
      }

      /**
       * @param variables The variables to extract from the notification.
       */
      override fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionAttachmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionAttachmentProperty,
    ) : CdkObject(cdkObject),
        CustomActionAttachmentProperty {
      /**
       * The text of the button that appears on the notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachment.html#cfn-chatbot-customaction-customactionattachment-buttontext)
       */
      override fun buttonText(): String? = unwrap(this).getButtonText()

      /**
       * The criteria for when a button should be shown based on values in the notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachment.html#cfn-chatbot-customaction-customactionattachment-criteria)
       */
      override fun criteria(): Any? = unwrap(this).getCriteria()

      /**
       * The type of notification that the custom action should be attached to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachment.html#cfn-chatbot-customaction-customactionattachment-notificationtype)
       */
      override fun notificationType(): String? = unwrap(this).getNotificationType()

      /**
       * The variables to extract from the notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactionattachment.html#cfn-chatbot-customaction-customactionattachment-variables)
       */
      override fun variables(): Any? = unwrap(this).getVariables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomActionAttachmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionAttachmentProperty):
          CustomActionAttachmentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomActionAttachmentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomActionAttachmentProperty):
          software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionAttachmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionAttachmentProperty
    }
  }

  /**
   * AWS Chatbot is now  . [Learn
   * more](https://docs.aws.amazon.com//chatbot/latest/adminguide/service-rename.html) &gt;  &gt;
   * `Type` attribute values remain unchanged.
   *
   * The definition of the command to run when invoked as an alias or as an action button.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.chatbot.*;
   * CustomActionDefinitionProperty customActionDefinitionProperty =
   * CustomActionDefinitionProperty.builder()
   * .commandText("commandText")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactiondefinition.html)
   */
  public interface CustomActionDefinitionProperty {
    /**
     * The command string to run which may include variables by prefixing with a dollar sign ($).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactiondefinition.html#cfn-chatbot-customaction-customactiondefinition-commandtext)
     */
    public fun commandText(): String

    /**
     * A builder for [CustomActionDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param commandText The command string to run which may include variables by prefixing with
       * a dollar sign ($). 
       */
      public fun commandText(commandText: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionDefinitionProperty.builder()

      /**
       * @param commandText The command string to run which may include variables by prefixing with
       * a dollar sign ($). 
       */
      override fun commandText(commandText: String) {
        cdkBuilder.commandText(commandText)
      }

      public fun build():
          software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionDefinitionProperty,
    ) : CdkObject(cdkObject),
        CustomActionDefinitionProperty {
      /**
       * The command string to run which may include variables by prefixing with a dollar sign ($).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-chatbot-customaction-customactiondefinition.html#cfn-chatbot-customaction-customactiondefinition-commandtext)
       */
      override fun commandText(): String = unwrap(this).getCommandText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomActionDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionDefinitionProperty):
          CustomActionDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomActionDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomActionDefinitionProperty):
          software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.chatbot.CfnCustomAction.CustomActionDefinitionProperty
    }
  }
}
