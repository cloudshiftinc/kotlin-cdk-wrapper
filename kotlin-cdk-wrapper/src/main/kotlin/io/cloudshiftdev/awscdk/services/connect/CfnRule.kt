@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a rule for the specified Amazon Connect instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * Object assignContactCategoryActions;
 * Object emptyValue;
 * Object endAssociatedTasksActions;
 * CfnRule cfnRule = CfnRule.Builder.create(this, "MyCfnRule")
 * .actions(ActionsProperty.builder()
 * .assignContactCategoryActions(List.of(assignContactCategoryActions))
 * .createCaseActions(List.of(CreateCaseActionProperty.builder()
 * .fields(List.of(FieldProperty.builder()
 * .id("id")
 * .value(FieldValueProperty.builder()
 * .booleanValue(false)
 * .doubleValue(123)
 * .emptyValue(emptyValue)
 * .stringValue("stringValue")
 * .build())
 * .build()))
 * .templateId("templateId")
 * .build()))
 * .endAssociatedTasksActions(List.of(endAssociatedTasksActions))
 * .eventBridgeActions(List.of(EventBridgeActionProperty.builder()
 * .name("name")
 * .build()))
 * .sendNotificationActions(List.of(SendNotificationActionProperty.builder()
 * .content("content")
 * .contentType("contentType")
 * .deliveryMethod("deliveryMethod")
 * .recipient(NotificationRecipientTypeProperty.builder()
 * .userArns(List.of("userArns"))
 * .userTags(Map.of(
 * "userTagsKey", "userTags"))
 * .build())
 * // the properties below are optional
 * .subject("subject")
 * .build()))
 * .taskActions(List.of(TaskActionProperty.builder()
 * .contactFlowArn("contactFlowArn")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .references(Map.of(
 * "referencesKey", ReferenceProperty.builder()
 * .type("type")
 * .value("value")
 * .build()))
 * .build()))
 * .updateCaseActions(List.of(UpdateCaseActionProperty.builder()
 * .fields(List.of(FieldProperty.builder()
 * .id("id")
 * .value(FieldValueProperty.builder()
 * .booleanValue(false)
 * .doubleValue(123)
 * .emptyValue(emptyValue)
 * .stringValue("stringValue")
 * .build())
 * .build()))
 * .build()))
 * .build())
 * .function("function")
 * .instanceArn("instanceArn")
 * .name("name")
 * .publishStatus("publishStatus")
 * .triggerEventSource(RuleTriggerEventSourceProperty.builder()
 * .eventSourceName("eventSourceName")
 * // the properties below are optional
 * .integrationAssociationArn("integrationAssociationArn")
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html)
 */
public open class CfnRule(
  cdkObject: software.amazon.awscdk.services.connect.CfnRule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRuleProps,
  ) :
      this(software.amazon.awscdk.services.connect.CfnRule(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnRuleProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRuleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRuleProps(props)
  )

  /**
   * A list of actions to be run when the rule is triggered.
   */
  public open fun actions(): Any = unwrap(this).getActions()

  /**
   * A list of actions to be run when the rule is triggered.
   */
  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of actions to be run when the rule is triggered.
   */
  public open fun actions(`value`: ActionsProperty) {
    unwrap(this).setActions(`value`.let(ActionsProperty::unwrap))
  }

  /**
   * A list of actions to be run when the rule is triggered.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("54cd589fd18040299b3a837140d51bd6637fdc8f55dc9c8394b5c6ba765937e4")
  public open fun actions(`value`: ActionsProperty.Builder.() -> Unit): Unit =
      actions(ActionsProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the rule.
   */
  public open fun attrRuleArn(): String = unwrap(this).getAttrRuleArn()

  /**
   * The conditions of the rule.
   */
  public open fun function(): String = unwrap(this).getFunction()

  /**
   * The conditions of the rule.
   */
  public open fun function(`value`: String) {
    unwrap(this).setFunction(`value`)
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
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * The name of the rule.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the rule.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The publish status of the rule.
   */
  public open fun publishStatus(): String = unwrap(this).getPublishStatus()

  /**
   * The publish status of the rule.
   */
  public open fun publishStatus(`value`: String) {
    unwrap(this).setPublishStatus(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The event source to trigger the rule.
   */
  public open fun triggerEventSource(): Any = unwrap(this).getTriggerEventSource()

  /**
   * The event source to trigger the rule.
   */
  public open fun triggerEventSource(`value`: IResolvable) {
    unwrap(this).setTriggerEventSource(`value`.let(IResolvable::unwrap))
  }

  /**
   * The event source to trigger the rule.
   */
  public open fun triggerEventSource(`value`: RuleTriggerEventSourceProperty) {
    unwrap(this).setTriggerEventSource(`value`.let(RuleTriggerEventSourceProperty::unwrap))
  }

  /**
   * The event source to trigger the rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db98468c530879b531ecaf2d8532df1da9ed4894f2d186f8b1f32bb65198f6a9")
  public open fun triggerEventSource(`value`: RuleTriggerEventSourceProperty.Builder.() -> Unit):
      Unit = triggerEventSource(RuleTriggerEventSourceProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of actions to be run when the rule is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-actions)
     * @param actions A list of actions to be run when the rule is triggered. 
     */
    public fun actions(actions: IResolvable)

    /**
     * A list of actions to be run when the rule is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-actions)
     * @param actions A list of actions to be run when the rule is triggered. 
     */
    public fun actions(actions: ActionsProperty)

    /**
     * A list of actions to be run when the rule is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-actions)
     * @param actions A list of actions to be run when the rule is triggered. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b67caaa242e4bb9d2be7e79d9f28c5d1275448bf083d71d76ae77046202463f9")
    public fun actions(actions: ActionsProperty.Builder.() -> Unit)

    /**
     * The conditions of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-function)
     * @param function The conditions of the rule. 
     */
    public fun function(function: String)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The name of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-name)
     * @param name The name of the rule. 
     */
    public fun name(name: String)

    /**
     * The publish status of the rule.
     *
     * *Allowed values* : `DRAFT` | `PUBLISHED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-publishstatus)
     * @param publishStatus The publish status of the rule. 
     */
    public fun publishStatus(publishStatus: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The event source to trigger the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-triggereventsource)
     * @param triggerEventSource The event source to trigger the rule. 
     */
    public fun triggerEventSource(triggerEventSource: IResolvable)

    /**
     * The event source to trigger the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-triggereventsource)
     * @param triggerEventSource The event source to trigger the rule. 
     */
    public fun triggerEventSource(triggerEventSource: RuleTriggerEventSourceProperty)

    /**
     * The event source to trigger the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-triggereventsource)
     * @param triggerEventSource The event source to trigger the rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6770d60045eb707d2cdb9bcff23a919cdb0a4e29565bdf23cd7e7d4705b72a81")
    public
        fun triggerEventSource(triggerEventSource: RuleTriggerEventSourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnRule.Builder =
        software.amazon.awscdk.services.connect.CfnRule.Builder.create(scope, id)

    /**
     * A list of actions to be run when the rule is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-actions)
     * @param actions A list of actions to be run when the rule is triggered. 
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    /**
     * A list of actions to be run when the rule is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-actions)
     * @param actions A list of actions to be run when the rule is triggered. 
     */
    override fun actions(actions: ActionsProperty) {
      cdkBuilder.actions(actions.let(ActionsProperty::unwrap))
    }

    /**
     * A list of actions to be run when the rule is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-actions)
     * @param actions A list of actions to be run when the rule is triggered. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b67caaa242e4bb9d2be7e79d9f28c5d1275448bf083d71d76ae77046202463f9")
    override fun actions(actions: ActionsProperty.Builder.() -> Unit): Unit =
        actions(ActionsProperty(actions))

    /**
     * The conditions of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-function)
     * @param function The conditions of the rule. 
     */
    override fun function(function: String) {
      cdkBuilder.function(function)
    }

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The name of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-name)
     * @param name The name of the rule. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The publish status of the rule.
     *
     * *Allowed values* : `DRAFT` | `PUBLISHED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-publishstatus)
     * @param publishStatus The publish status of the rule. 
     */
    override fun publishStatus(publishStatus: String) {
      cdkBuilder.publishStatus(publishStatus)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The event source to trigger the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-triggereventsource)
     * @param triggerEventSource The event source to trigger the rule. 
     */
    override fun triggerEventSource(triggerEventSource: IResolvable) {
      cdkBuilder.triggerEventSource(triggerEventSource.let(IResolvable::unwrap))
    }

    /**
     * The event source to trigger the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-triggereventsource)
     * @param triggerEventSource The event source to trigger the rule. 
     */
    override fun triggerEventSource(triggerEventSource: RuleTriggerEventSourceProperty) {
      cdkBuilder.triggerEventSource(triggerEventSource.let(RuleTriggerEventSourceProperty::unwrap))
    }

    /**
     * The event source to trigger the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-triggereventsource)
     * @param triggerEventSource The event source to trigger the rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6770d60045eb707d2cdb9bcff23a919cdb0a4e29565bdf23cd7e7d4705b72a81")
    override
        fun triggerEventSource(triggerEventSource: RuleTriggerEventSourceProperty.Builder.() -> Unit):
        Unit = triggerEventSource(RuleTriggerEventSourceProperty(triggerEventSource))

    public fun build(): software.amazon.awscdk.services.connect.CfnRule = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule): CfnRule =
        CfnRule(cdkObject)

    internal fun unwrap(wrapped: CfnRule): software.amazon.awscdk.services.connect.CfnRule =
        wrapped.cdkObject as software.amazon.awscdk.services.connect.CfnRule
  }

  /**
   * A list of actions to be run when the rule is triggered.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * Object assignContactCategoryActions;
   * Object emptyValue;
   * Object endAssociatedTasksActions;
   * ActionsProperty actionsProperty = ActionsProperty.builder()
   * .assignContactCategoryActions(List.of(assignContactCategoryActions))
   * .createCaseActions(List.of(CreateCaseActionProperty.builder()
   * .fields(List.of(FieldProperty.builder()
   * .id("id")
   * .value(FieldValueProperty.builder()
   * .booleanValue(false)
   * .doubleValue(123)
   * .emptyValue(emptyValue)
   * .stringValue("stringValue")
   * .build())
   * .build()))
   * .templateId("templateId")
   * .build()))
   * .endAssociatedTasksActions(List.of(endAssociatedTasksActions))
   * .eventBridgeActions(List.of(EventBridgeActionProperty.builder()
   * .name("name")
   * .build()))
   * .sendNotificationActions(List.of(SendNotificationActionProperty.builder()
   * .content("content")
   * .contentType("contentType")
   * .deliveryMethod("deliveryMethod")
   * .recipient(NotificationRecipientTypeProperty.builder()
   * .userArns(List.of("userArns"))
   * .userTags(Map.of(
   * "userTagsKey", "userTags"))
   * .build())
   * // the properties below are optional
   * .subject("subject")
   * .build()))
   * .taskActions(List.of(TaskActionProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .references(Map.of(
   * "referencesKey", ReferenceProperty.builder()
   * .type("type")
   * .value("value")
   * .build()))
   * .build()))
   * .updateCaseActions(List.of(UpdateCaseActionProperty.builder()
   * .fields(List.of(FieldProperty.builder()
   * .id("id")
   * .value(FieldValueProperty.builder()
   * .booleanValue(false)
   * .doubleValue(123)
   * .emptyValue(emptyValue)
   * .stringValue("stringValue")
   * .build())
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html)
   */
  public interface ActionsProperty {
    /**
     * Information about the contact category action.
     *
     * The syntax can be empty, for example, `{}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html#cfn-connect-rule-actions-assigncontactcategoryactions)
     */
    public fun assignContactCategoryActions(): Any? = unwrap(this).getAssignContactCategoryActions()

    /**
     * This action will create a case when a rule is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html#cfn-connect-rule-actions-createcaseactions)
     */
    public fun createCaseActions(): Any? = unwrap(this).getCreateCaseActions()

    /**
     * This action will end associated tasks when a rule is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html#cfn-connect-rule-actions-endassociatedtasksactions)
     */
    public fun endAssociatedTasksActions(): Any? = unwrap(this).getEndAssociatedTasksActions()

    /**
     * Information about the EventBridge action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html#cfn-connect-rule-actions-eventbridgeactions)
     */
    public fun eventBridgeActions(): Any? = unwrap(this).getEventBridgeActions()

    /**
     * Information about the send notification action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html#cfn-connect-rule-actions-sendnotificationactions)
     */
    public fun sendNotificationActions(): Any? = unwrap(this).getSendNotificationActions()

    /**
     * Information about the task action.
     *
     * This field is required if `TriggerEventSource` is one of the following values:
     * `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html#cfn-connect-rule-actions-taskactions)
     */
    public fun taskActions(): Any? = unwrap(this).getTaskActions()

    /**
     * This action will update a case when a rule is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html#cfn-connect-rule-actions-updatecaseactions)
     */
    public fun updateCaseActions(): Any? = unwrap(this).getUpdateCaseActions()

    /**
     * A builder for [ActionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param assignContactCategoryActions Information about the contact category action.
       * The syntax can be empty, for example, `{}` .
       */
      public fun assignContactCategoryActions(assignContactCategoryActions: List<Any>)

      /**
       * @param assignContactCategoryActions Information about the contact category action.
       * The syntax can be empty, for example, `{}` .
       */
      public fun assignContactCategoryActions(vararg assignContactCategoryActions: Any)

      /**
       * @param assignContactCategoryActions Information about the contact category action.
       * The syntax can be empty, for example, `{}` .
       */
      public fun assignContactCategoryActions(assignContactCategoryActions: IResolvable)

      /**
       * @param createCaseActions This action will create a case when a rule is triggered.
       */
      public fun createCaseActions(createCaseActions: IResolvable)

      /**
       * @param createCaseActions This action will create a case when a rule is triggered.
       */
      public fun createCaseActions(createCaseActions: List<Any>)

      /**
       * @param createCaseActions This action will create a case when a rule is triggered.
       */
      public fun createCaseActions(vararg createCaseActions: Any)

      /**
       * @param endAssociatedTasksActions This action will end associated tasks when a rule is
       * triggered.
       */
      public fun endAssociatedTasksActions(endAssociatedTasksActions: List<Any>)

      /**
       * @param endAssociatedTasksActions This action will end associated tasks when a rule is
       * triggered.
       */
      public fun endAssociatedTasksActions(vararg endAssociatedTasksActions: Any)

      /**
       * @param endAssociatedTasksActions This action will end associated tasks when a rule is
       * triggered.
       */
      public fun endAssociatedTasksActions(endAssociatedTasksActions: IResolvable)

      /**
       * @param eventBridgeActions Information about the EventBridge action.
       */
      public fun eventBridgeActions(eventBridgeActions: IResolvable)

      /**
       * @param eventBridgeActions Information about the EventBridge action.
       */
      public fun eventBridgeActions(eventBridgeActions: List<Any>)

      /**
       * @param eventBridgeActions Information about the EventBridge action.
       */
      public fun eventBridgeActions(vararg eventBridgeActions: Any)

      /**
       * @param sendNotificationActions Information about the send notification action.
       */
      public fun sendNotificationActions(sendNotificationActions: IResolvable)

      /**
       * @param sendNotificationActions Information about the send notification action.
       */
      public fun sendNotificationActions(sendNotificationActions: List<Any>)

      /**
       * @param sendNotificationActions Information about the send notification action.
       */
      public fun sendNotificationActions(vararg sendNotificationActions: Any)

      /**
       * @param taskActions Information about the task action.
       * This field is required if `TriggerEventSource` is one of the following values:
       * `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
       */
      public fun taskActions(taskActions: IResolvable)

      /**
       * @param taskActions Information about the task action.
       * This field is required if `TriggerEventSource` is one of the following values:
       * `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
       */
      public fun taskActions(taskActions: List<Any>)

      /**
       * @param taskActions Information about the task action.
       * This field is required if `TriggerEventSource` is one of the following values:
       * `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
       */
      public fun taskActions(vararg taskActions: Any)

      /**
       * @param updateCaseActions This action will update a case when a rule is triggered.
       */
      public fun updateCaseActions(updateCaseActions: IResolvable)

      /**
       * @param updateCaseActions This action will update a case when a rule is triggered.
       */
      public fun updateCaseActions(updateCaseActions: List<Any>)

      /**
       * @param updateCaseActions This action will update a case when a rule is triggered.
       */
      public fun updateCaseActions(vararg updateCaseActions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.ActionsProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.ActionsProperty.builder()

      /**
       * @param assignContactCategoryActions Information about the contact category action.
       * The syntax can be empty, for example, `{}` .
       */
      override fun assignContactCategoryActions(assignContactCategoryActions: List<Any>) {
        cdkBuilder.assignContactCategoryActions(assignContactCategoryActions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param assignContactCategoryActions Information about the contact category action.
       * The syntax can be empty, for example, `{}` .
       */
      override fun assignContactCategoryActions(vararg assignContactCategoryActions: Any): Unit =
          assignContactCategoryActions(assignContactCategoryActions.toList())

      /**
       * @param assignContactCategoryActions Information about the contact category action.
       * The syntax can be empty, for example, `{}` .
       */
      override fun assignContactCategoryActions(assignContactCategoryActions: IResolvable) {
        cdkBuilder.assignContactCategoryActions(assignContactCategoryActions.let(IResolvable::unwrap))
      }

      /**
       * @param createCaseActions This action will create a case when a rule is triggered.
       */
      override fun createCaseActions(createCaseActions: IResolvable) {
        cdkBuilder.createCaseActions(createCaseActions.let(IResolvable::unwrap))
      }

      /**
       * @param createCaseActions This action will create a case when a rule is triggered.
       */
      override fun createCaseActions(createCaseActions: List<Any>) {
        cdkBuilder.createCaseActions(createCaseActions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param createCaseActions This action will create a case when a rule is triggered.
       */
      override fun createCaseActions(vararg createCaseActions: Any): Unit =
          createCaseActions(createCaseActions.toList())

      /**
       * @param endAssociatedTasksActions This action will end associated tasks when a rule is
       * triggered.
       */
      override fun endAssociatedTasksActions(endAssociatedTasksActions: List<Any>) {
        cdkBuilder.endAssociatedTasksActions(endAssociatedTasksActions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param endAssociatedTasksActions This action will end associated tasks when a rule is
       * triggered.
       */
      override fun endAssociatedTasksActions(vararg endAssociatedTasksActions: Any): Unit =
          endAssociatedTasksActions(endAssociatedTasksActions.toList())

      /**
       * @param endAssociatedTasksActions This action will end associated tasks when a rule is
       * triggered.
       */
      override fun endAssociatedTasksActions(endAssociatedTasksActions: IResolvable) {
        cdkBuilder.endAssociatedTasksActions(endAssociatedTasksActions.let(IResolvable::unwrap))
      }

      /**
       * @param eventBridgeActions Information about the EventBridge action.
       */
      override fun eventBridgeActions(eventBridgeActions: IResolvable) {
        cdkBuilder.eventBridgeActions(eventBridgeActions.let(IResolvable::unwrap))
      }

      /**
       * @param eventBridgeActions Information about the EventBridge action.
       */
      override fun eventBridgeActions(eventBridgeActions: List<Any>) {
        cdkBuilder.eventBridgeActions(eventBridgeActions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param eventBridgeActions Information about the EventBridge action.
       */
      override fun eventBridgeActions(vararg eventBridgeActions: Any): Unit =
          eventBridgeActions(eventBridgeActions.toList())

      /**
       * @param sendNotificationActions Information about the send notification action.
       */
      override fun sendNotificationActions(sendNotificationActions: IResolvable) {
        cdkBuilder.sendNotificationActions(sendNotificationActions.let(IResolvable::unwrap))
      }

      /**
       * @param sendNotificationActions Information about the send notification action.
       */
      override fun sendNotificationActions(sendNotificationActions: List<Any>) {
        cdkBuilder.sendNotificationActions(sendNotificationActions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sendNotificationActions Information about the send notification action.
       */
      override fun sendNotificationActions(vararg sendNotificationActions: Any): Unit =
          sendNotificationActions(sendNotificationActions.toList())

      /**
       * @param taskActions Information about the task action.
       * This field is required if `TriggerEventSource` is one of the following values:
       * `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
       */
      override fun taskActions(taskActions: IResolvable) {
        cdkBuilder.taskActions(taskActions.let(IResolvable::unwrap))
      }

      /**
       * @param taskActions Information about the task action.
       * This field is required if `TriggerEventSource` is one of the following values:
       * `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
       */
      override fun taskActions(taskActions: List<Any>) {
        cdkBuilder.taskActions(taskActions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param taskActions Information about the task action.
       * This field is required if `TriggerEventSource` is one of the following values:
       * `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
       */
      override fun taskActions(vararg taskActions: Any): Unit = taskActions(taskActions.toList())

      /**
       * @param updateCaseActions This action will update a case when a rule is triggered.
       */
      override fun updateCaseActions(updateCaseActions: IResolvable) {
        cdkBuilder.updateCaseActions(updateCaseActions.let(IResolvable::unwrap))
      }

      /**
       * @param updateCaseActions This action will update a case when a rule is triggered.
       */
      override fun updateCaseActions(updateCaseActions: List<Any>) {
        cdkBuilder.updateCaseActions(updateCaseActions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param updateCaseActions This action will update a case when a rule is triggered.
       */
      override fun updateCaseActions(vararg updateCaseActions: Any): Unit =
          updateCaseActions(updateCaseActions.toList())

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.ActionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnRule.ActionsProperty,
    ) : CdkObject(cdkObject), ActionsProperty {
      /**
       * Information about the contact category action.
       *
       * The syntax can be empty, for example, `{}` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html#cfn-connect-rule-actions-assigncontactcategoryactions)
       */
      override fun assignContactCategoryActions(): Any? =
          unwrap(this).getAssignContactCategoryActions()

      /**
       * This action will create a case when a rule is triggered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html#cfn-connect-rule-actions-createcaseactions)
       */
      override fun createCaseActions(): Any? = unwrap(this).getCreateCaseActions()

      /**
       * This action will end associated tasks when a rule is triggered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html#cfn-connect-rule-actions-endassociatedtasksactions)
       */
      override fun endAssociatedTasksActions(): Any? = unwrap(this).getEndAssociatedTasksActions()

      /**
       * Information about the EventBridge action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html#cfn-connect-rule-actions-eventbridgeactions)
       */
      override fun eventBridgeActions(): Any? = unwrap(this).getEventBridgeActions()

      /**
       * Information about the send notification action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html#cfn-connect-rule-actions-sendnotificationactions)
       */
      override fun sendNotificationActions(): Any? = unwrap(this).getSendNotificationActions()

      /**
       * Information about the task action.
       *
       * This field is required if `TriggerEventSource` is one of the following values:
       * `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html#cfn-connect-rule-actions-taskactions)
       */
      override fun taskActions(): Any? = unwrap(this).getTaskActions()

      /**
       * This action will update a case when a rule is triggered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html#cfn-connect-rule-actions-updatecaseactions)
       */
      override fun updateCaseActions(): Any? = unwrap(this).getUpdateCaseActions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.ActionsProperty):
          ActionsProperty = CdkObjectWrappers.wrap(cdkObject) as? ActionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionsProperty):
          software.amazon.awscdk.services.connect.CfnRule.ActionsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnRule.ActionsProperty
    }
  }

  /**
   * The definition for create case action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * Object emptyValue;
   * CreateCaseActionProperty createCaseActionProperty = CreateCaseActionProperty.builder()
   * .fields(List.of(FieldProperty.builder()
   * .id("id")
   * .value(FieldValueProperty.builder()
   * .booleanValue(false)
   * .doubleValue(123)
   * .emptyValue(emptyValue)
   * .stringValue("stringValue")
   * .build())
   * .build()))
   * .templateId("templateId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-createcaseaction.html)
   */
  public interface CreateCaseActionProperty {
    /**
     * An array of case fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-createcaseaction.html#cfn-connect-rule-createcaseaction-fields)
     */
    public fun fields(): Any

    /**
     * The Id of template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-createcaseaction.html#cfn-connect-rule-createcaseaction-templateid)
     */
    public fun templateId(): String

    /**
     * A builder for [CreateCaseActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fields An array of case fields. 
       */
      public fun fields(fields: IResolvable)

      /**
       * @param fields An array of case fields. 
       */
      public fun fields(fields: List<Any>)

      /**
       * @param fields An array of case fields. 
       */
      public fun fields(vararg fields: Any)

      /**
       * @param templateId The Id of template. 
       */
      public fun templateId(templateId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.CreateCaseActionProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.CreateCaseActionProperty.builder()

      /**
       * @param fields An array of case fields. 
       */
      override fun fields(fields: IResolvable) {
        cdkBuilder.fields(fields.let(IResolvable::unwrap))
      }

      /**
       * @param fields An array of case fields. 
       */
      override fun fields(fields: List<Any>) {
        cdkBuilder.fields(fields.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param fields An array of case fields. 
       */
      override fun fields(vararg fields: Any): Unit = fields(fields.toList())

      /**
       * @param templateId The Id of template. 
       */
      override fun templateId(templateId: String) {
        cdkBuilder.templateId(templateId)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.CreateCaseActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnRule.CreateCaseActionProperty,
    ) : CdkObject(cdkObject), CreateCaseActionProperty {
      /**
       * An array of case fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-createcaseaction.html#cfn-connect-rule-createcaseaction-fields)
       */
      override fun fields(): Any = unwrap(this).getFields()

      /**
       * The Id of template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-createcaseaction.html#cfn-connect-rule-createcaseaction-templateid)
       */
      override fun templateId(): String = unwrap(this).getTemplateId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CreateCaseActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.CreateCaseActionProperty):
          CreateCaseActionProperty = CdkObjectWrappers.wrap(cdkObject) as? CreateCaseActionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreateCaseActionProperty):
          software.amazon.awscdk.services.connect.CfnRule.CreateCaseActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnRule.CreateCaseActionProperty
    }
  }

  /**
   * The EventBridge action definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * EventBridgeActionProperty eventBridgeActionProperty = EventBridgeActionProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-eventbridgeaction.html)
   */
  public interface EventBridgeActionProperty {
    /**
     * The name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-eventbridgeaction.html#cfn-connect-rule-eventbridgeaction-name)
     */
    public fun name(): String

    /**
     * A builder for [EventBridgeActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.EventBridgeActionProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.EventBridgeActionProperty.builder()

      /**
       * @param name The name. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.EventBridgeActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnRule.EventBridgeActionProperty,
    ) : CdkObject(cdkObject), EventBridgeActionProperty {
      /**
       * The name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-eventbridgeaction.html#cfn-connect-rule-eventbridgeaction-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.EventBridgeActionProperty):
          EventBridgeActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EventBridgeActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBridgeActionProperty):
          software.amazon.awscdk.services.connect.CfnRule.EventBridgeActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnRule.EventBridgeActionProperty
    }
  }

  /**
   * The field of the case.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * Object emptyValue;
   * FieldProperty fieldProperty = FieldProperty.builder()
   * .id("id")
   * .value(FieldValueProperty.builder()
   * .booleanValue(false)
   * .doubleValue(123)
   * .emptyValue(emptyValue)
   * .stringValue("stringValue")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-field.html)
   */
  public interface FieldProperty {
    /**
     * The Id of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-field.html#cfn-connect-rule-field-id)
     */
    public fun id(): String

    /**
     * The value of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-field.html#cfn-connect-rule-field-value)
     */
    public fun `value`(): Any

    /**
     * A builder for [FieldProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The Id of the field. 
       */
      public fun id(id: String)

      /**
       * @param value The value of the field. 
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The value of the field. 
       */
      public fun `value`(`value`: FieldValueProperty)

      /**
       * @param value The value of the field. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39cb40b8cb920f22e478e3d3eed571fc7797d9217007ee67008ff865810ebeeb")
      public fun `value`(`value`: FieldValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.connect.CfnRule.FieldProperty.Builder
          = software.amazon.awscdk.services.connect.CfnRule.FieldProperty.builder()

      /**
       * @param id The Id of the field. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param value The value of the field. 
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      /**
       * @param value The value of the field. 
       */
      override fun `value`(`value`: FieldValueProperty) {
        cdkBuilder.`value`(`value`.let(FieldValueProperty::unwrap))
      }

      /**
       * @param value The value of the field. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39cb40b8cb920f22e478e3d3eed571fc7797d9217007ee67008ff865810ebeeb")
      override fun `value`(`value`: FieldValueProperty.Builder.() -> Unit): Unit =
          `value`(FieldValueProperty(`value`))

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.FieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnRule.FieldProperty,
    ) : CdkObject(cdkObject), FieldProperty {
      /**
       * The Id of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-field.html#cfn-connect-rule-field-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The value of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-field.html#cfn-connect-rule-field-value)
       */
      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.FieldProperty):
          FieldProperty = CdkObjectWrappers.wrap(cdkObject) as? FieldProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldProperty):
          software.amazon.awscdk.services.connect.CfnRule.FieldProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnRule.FieldProperty
    }
  }

  /**
   * Object for case field values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * Object emptyValue;
   * FieldValueProperty fieldValueProperty = FieldValueProperty.builder()
   * .booleanValue(false)
   * .doubleValue(123)
   * .emptyValue(emptyValue)
   * .stringValue("stringValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-fieldvalue.html)
   */
  public interface FieldValueProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-fieldvalue.html#cfn-connect-rule-fieldvalue-booleanvalue)
     */
    public fun booleanValue(): Any? = unwrap(this).getBooleanValue()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-fieldvalue.html#cfn-connect-rule-fieldvalue-doublevalue)
     */
    public fun doubleValue(): Number? = unwrap(this).getDoubleValue()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-fieldvalue.html#cfn-connect-rule-fieldvalue-emptyvalue)
     */
    public fun emptyValue(): Any? = unwrap(this).getEmptyValue()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-fieldvalue.html#cfn-connect-rule-fieldvalue-stringvalue)
     */
    public fun stringValue(): String? = unwrap(this).getStringValue()

    /**
     * A builder for [FieldValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param booleanValue the value to be set.
       */
      public fun booleanValue(booleanValue: Boolean)

      /**
       * @param booleanValue the value to be set.
       */
      public fun booleanValue(booleanValue: IResolvable)

      /**
       * @param doubleValue the value to be set.
       */
      public fun doubleValue(doubleValue: Number)

      /**
       * @param emptyValue the value to be set.
       */
      public fun emptyValue(emptyValue: Any)

      /**
       * @param stringValue the value to be set.
       */
      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.FieldValueProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.FieldValueProperty.builder()

      /**
       * @param booleanValue the value to be set.
       */
      override fun booleanValue(booleanValue: Boolean) {
        cdkBuilder.booleanValue(booleanValue)
      }

      /**
       * @param booleanValue the value to be set.
       */
      override fun booleanValue(booleanValue: IResolvable) {
        cdkBuilder.booleanValue(booleanValue.let(IResolvable::unwrap))
      }

      /**
       * @param doubleValue the value to be set.
       */
      override fun doubleValue(doubleValue: Number) {
        cdkBuilder.doubleValue(doubleValue)
      }

      /**
       * @param emptyValue the value to be set.
       */
      override fun emptyValue(emptyValue: Any) {
        cdkBuilder.emptyValue(emptyValue)
      }

      /**
       * @param stringValue the value to be set.
       */
      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.FieldValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnRule.FieldValueProperty,
    ) : CdkObject(cdkObject), FieldValueProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-fieldvalue.html#cfn-connect-rule-fieldvalue-booleanvalue)
       */
      override fun booleanValue(): Any? = unwrap(this).getBooleanValue()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-fieldvalue.html#cfn-connect-rule-fieldvalue-doublevalue)
       */
      override fun doubleValue(): Number? = unwrap(this).getDoubleValue()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-fieldvalue.html#cfn-connect-rule-fieldvalue-emptyvalue)
       */
      override fun emptyValue(): Any? = unwrap(this).getEmptyValue()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-fieldvalue.html#cfn-connect-rule-fieldvalue-stringvalue)
       */
      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.FieldValueProperty):
          FieldValueProperty = CdkObjectWrappers.wrap(cdkObject) as? FieldValueProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldValueProperty):
          software.amazon.awscdk.services.connect.CfnRule.FieldValueProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnRule.FieldValueProperty
    }
  }

  /**
   * The type of notification recipient.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * NotificationRecipientTypeProperty notificationRecipientTypeProperty =
   * NotificationRecipientTypeProperty.builder()
   * .userArns(List.of("userArns"))
   * .userTags(Map.of(
   * "userTagsKey", "userTags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-notificationrecipienttype.html)
   */
  public interface NotificationRecipientTypeProperty {
    /**
     * The Amazon Resource Name (ARN) of the user account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-notificationrecipienttype.html#cfn-connect-rule-notificationrecipienttype-userarns)
     */
    public fun userArns(): List<String> = unwrap(this).getUserArns() ?: emptyList()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }. Amazon Connect users with the
     * specified tags will be notified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-notificationrecipienttype.html#cfn-connect-rule-notificationrecipienttype-usertags)
     */
    public fun userTags(): Any? = unwrap(this).getUserTags()

    /**
     * A builder for [NotificationRecipientTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param userArns The Amazon Resource Name (ARN) of the user account.
       */
      public fun userArns(userArns: List<String>)

      /**
       * @param userArns The Amazon Resource Name (ARN) of the user account.
       */
      public fun userArns(vararg userArns: String)

      /**
       * @param userTags The tags used to organize, track, or control access for this resource.
       * For example, { "tags": {"key1":"value1", "key2":"value2"} }. Amazon Connect users with the
       * specified tags will be notified.
       */
      public fun userTags(userTags: IResolvable)

      /**
       * @param userTags The tags used to organize, track, or control access for this resource.
       * For example, { "tags": {"key1":"value1", "key2":"value2"} }. Amazon Connect users with the
       * specified tags will be notified.
       */
      public fun userTags(userTags: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.NotificationRecipientTypeProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnRule.NotificationRecipientTypeProperty.builder()

      /**
       * @param userArns The Amazon Resource Name (ARN) of the user account.
       */
      override fun userArns(userArns: List<String>) {
        cdkBuilder.userArns(userArns)
      }

      /**
       * @param userArns The Amazon Resource Name (ARN) of the user account.
       */
      override fun userArns(vararg userArns: String): Unit = userArns(userArns.toList())

      /**
       * @param userTags The tags used to organize, track, or control access for this resource.
       * For example, { "tags": {"key1":"value1", "key2":"value2"} }. Amazon Connect users with the
       * specified tags will be notified.
       */
      override fun userTags(userTags: IResolvable) {
        cdkBuilder.userTags(userTags.let(IResolvable::unwrap))
      }

      /**
       * @param userTags The tags used to organize, track, or control access for this resource.
       * For example, { "tags": {"key1":"value1", "key2":"value2"} }. Amazon Connect users with the
       * specified tags will be notified.
       */
      override fun userTags(userTags: Map<String, String>) {
        cdkBuilder.userTags(userTags)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnRule.NotificationRecipientTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnRule.NotificationRecipientTypeProperty,
    ) : CdkObject(cdkObject), NotificationRecipientTypeProperty {
      /**
       * The Amazon Resource Name (ARN) of the user account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-notificationrecipienttype.html#cfn-connect-rule-notificationrecipienttype-userarns)
       */
      override fun userArns(): List<String> = unwrap(this).getUserArns() ?: emptyList()

      /**
       * The tags used to organize, track, or control access for this resource.
       *
       * For example, { "tags": {"key1":"value1", "key2":"value2"} }. Amazon Connect users with the
       * specified tags will be notified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-notificationrecipienttype.html#cfn-connect-rule-notificationrecipienttype-usertags)
       */
      override fun userTags(): Any? = unwrap(this).getUserTags()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NotificationRecipientTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.NotificationRecipientTypeProperty):
          NotificationRecipientTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NotificationRecipientTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationRecipientTypeProperty):
          software.amazon.awscdk.services.connect.CfnRule.NotificationRecipientTypeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnRule.NotificationRecipientTypeProperty
    }
  }

  /**
   * Information about the reference when the `referenceType` is `URL` .
   *
   * Otherwise, null. (Supports variable injection in the `Value` field.)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * ReferenceProperty referenceProperty = ReferenceProperty.builder()
   * .type("type")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-reference.html)
   */
  public interface ReferenceProperty {
    /**
     * The type of the reference. `DATE` must be of type Epoch timestamp.
     *
     * *Allowed values* : `URL` | `ATTACHMENT` | `NUMBER` | `STRING` | `DATE` | `EMAIL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-reference.html#cfn-connect-rule-reference-type)
     */
    public fun type(): String

    /**
     * A valid value for the reference.
     *
     * For example, for a URL reference, a formatted URL that is displayed to an agent in the
     * Contact Control Panel (CCP).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-reference.html#cfn-connect-rule-reference-value)
     */
    public fun `value`(): String

    /**
     * A builder for [ReferenceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of the reference. `DATE` must be of type Epoch timestamp. 
       * *Allowed values* : `URL` | `ATTACHMENT` | `NUMBER` | `STRING` | `DATE` | `EMAIL`
       */
      public fun type(type: String)

      /**
       * @param value A valid value for the reference. 
       * For example, for a URL reference, a formatted URL that is displayed to an agent in the
       * Contact Control Panel (CCP).
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.ReferenceProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.ReferenceProperty.builder()

      /**
       * @param type The type of the reference. `DATE` must be of type Epoch timestamp. 
       * *Allowed values* : `URL` | `ATTACHMENT` | `NUMBER` | `STRING` | `DATE` | `EMAIL`
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value A valid value for the reference. 
       * For example, for a URL reference, a formatted URL that is displayed to an agent in the
       * Contact Control Panel (CCP).
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.ReferenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnRule.ReferenceProperty,
    ) : CdkObject(cdkObject), ReferenceProperty {
      /**
       * The type of the reference. `DATE` must be of type Epoch timestamp.
       *
       * *Allowed values* : `URL` | `ATTACHMENT` | `NUMBER` | `STRING` | `DATE` | `EMAIL`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-reference.html#cfn-connect-rule-reference-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * A valid value for the reference.
       *
       * For example, for a URL reference, a formatted URL that is displayed to an agent in the
       * Contact Control Panel (CCP).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-reference.html#cfn-connect-rule-reference-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.ReferenceProperty):
          ReferenceProperty = CdkObjectWrappers.wrap(cdkObject) as? ReferenceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceProperty):
          software.amazon.awscdk.services.connect.CfnRule.ReferenceProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnRule.ReferenceProperty
    }
  }

  /**
   * The name of the event source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * RuleTriggerEventSourceProperty ruleTriggerEventSourceProperty =
   * RuleTriggerEventSourceProperty.builder()
   * .eventSourceName("eventSourceName")
   * // the properties below are optional
   * .integrationAssociationArn("integrationAssociationArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-ruletriggereventsource.html)
   */
  public interface RuleTriggerEventSourceProperty {
    /**
     * The name of the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-ruletriggereventsource.html#cfn-connect-rule-ruletriggereventsource-eventsourcename)
     */
    public fun eventSourceName(): String

    /**
     * The Amazon Resource Name (ARN) of the integration association.
     *
     * `IntegrationAssociationArn` is required if `TriggerEventSource` is one of the following
     * values: `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-ruletriggereventsource.html#cfn-connect-rule-ruletriggereventsource-integrationassociationarn)
     */
    public fun integrationAssociationArn(): String? = unwrap(this).getIntegrationAssociationArn()

    /**
     * A builder for [RuleTriggerEventSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventSourceName The name of the event source. 
       */
      public fun eventSourceName(eventSourceName: String)

      /**
       * @param integrationAssociationArn The Amazon Resource Name (ARN) of the integration
       * association.
       * `IntegrationAssociationArn` is required if `TriggerEventSource` is one of the following
       * values: `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
       */
      public fun integrationAssociationArn(integrationAssociationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.RuleTriggerEventSourceProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.RuleTriggerEventSourceProperty.builder()

      /**
       * @param eventSourceName The name of the event source. 
       */
      override fun eventSourceName(eventSourceName: String) {
        cdkBuilder.eventSourceName(eventSourceName)
      }

      /**
       * @param integrationAssociationArn The Amazon Resource Name (ARN) of the integration
       * association.
       * `IntegrationAssociationArn` is required if `TriggerEventSource` is one of the following
       * values: `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
       */
      override fun integrationAssociationArn(integrationAssociationArn: String) {
        cdkBuilder.integrationAssociationArn(integrationAssociationArn)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnRule.RuleTriggerEventSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnRule.RuleTriggerEventSourceProperty,
    ) : CdkObject(cdkObject), RuleTriggerEventSourceProperty {
      /**
       * The name of the event source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-ruletriggereventsource.html#cfn-connect-rule-ruletriggereventsource-eventsourcename)
       */
      override fun eventSourceName(): String = unwrap(this).getEventSourceName()

      /**
       * The Amazon Resource Name (ARN) of the integration association.
       *
       * `IntegrationAssociationArn` is required if `TriggerEventSource` is one of the following
       * values: `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-ruletriggereventsource.html#cfn-connect-rule-ruletriggereventsource-integrationassociationarn)
       */
      override fun integrationAssociationArn(): String? =
          unwrap(this).getIntegrationAssociationArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleTriggerEventSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.RuleTriggerEventSourceProperty):
          RuleTriggerEventSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuleTriggerEventSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleTriggerEventSourceProperty):
          software.amazon.awscdk.services.connect.CfnRule.RuleTriggerEventSourceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnRule.RuleTriggerEventSourceProperty
    }
  }

  /**
   * Information about the send notification action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * SendNotificationActionProperty sendNotificationActionProperty =
   * SendNotificationActionProperty.builder()
   * .content("content")
   * .contentType("contentType")
   * .deliveryMethod("deliveryMethod")
   * .recipient(NotificationRecipientTypeProperty.builder()
   * .userArns(List.of("userArns"))
   * .userTags(Map.of(
   * "userTagsKey", "userTags"))
   * .build())
   * // the properties below are optional
   * .subject("subject")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-sendnotificationaction.html)
   */
  public interface SendNotificationActionProperty {
    /**
     * Notification content.
     *
     * Supports variable injection. For more information, see [JSONPath
     * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
     * in the *Amazon Connect Administrators Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-sendnotificationaction.html#cfn-connect-rule-sendnotificationaction-content)
     */
    public fun content(): String

    /**
     * Content type format.
     *
     * *Allowed value* : `PLAIN_TEXT`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-sendnotificationaction.html#cfn-connect-rule-sendnotificationaction-contenttype)
     */
    public fun contentType(): String

    /**
     * Notification delivery method.
     *
     * *Allowed value* : `EMAIL`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-sendnotificationaction.html#cfn-connect-rule-sendnotificationaction-deliverymethod)
     */
    public fun deliveryMethod(): String

    /**
     * Notification recipient.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-sendnotificationaction.html#cfn-connect-rule-sendnotificationaction-recipient)
     */
    public fun recipient(): Any

    /**
     * The subject of the email if the delivery method is `EMAIL` .
     *
     * Supports variable injection. For more information, see [JSONPath
     * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
     * in the *Amazon Connect Administrators Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-sendnotificationaction.html#cfn-connect-rule-sendnotificationaction-subject)
     */
    public fun subject(): String? = unwrap(this).getSubject()

    /**
     * A builder for [SendNotificationActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param content Notification content. 
       * Supports variable injection. For more information, see [JSONPath
       * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
       * in the *Amazon Connect Administrators Guide* .
       */
      public fun content(content: String)

      /**
       * @param contentType Content type format. 
       * *Allowed value* : `PLAIN_TEXT`
       */
      public fun contentType(contentType: String)

      /**
       * @param deliveryMethod Notification delivery method. 
       * *Allowed value* : `EMAIL`
       */
      public fun deliveryMethod(deliveryMethod: String)

      /**
       * @param recipient Notification recipient. 
       */
      public fun recipient(recipient: IResolvable)

      /**
       * @param recipient Notification recipient. 
       */
      public fun recipient(recipient: NotificationRecipientTypeProperty)

      /**
       * @param recipient Notification recipient. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6214677c1471da5635831c025da1ed2c2693e2d582dd859d8cf1a7f9720cfe2a")
      public fun recipient(recipient: NotificationRecipientTypeProperty.Builder.() -> Unit)

      /**
       * @param subject The subject of the email if the delivery method is `EMAIL` .
       * Supports variable injection. For more information, see [JSONPath
       * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
       * in the *Amazon Connect Administrators Guide* .
       */
      public fun subject(subject: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.SendNotificationActionProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.SendNotificationActionProperty.builder()

      /**
       * @param content Notification content. 
       * Supports variable injection. For more information, see [JSONPath
       * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
       * in the *Amazon Connect Administrators Guide* .
       */
      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      /**
       * @param contentType Content type format. 
       * *Allowed value* : `PLAIN_TEXT`
       */
      override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      /**
       * @param deliveryMethod Notification delivery method. 
       * *Allowed value* : `EMAIL`
       */
      override fun deliveryMethod(deliveryMethod: String) {
        cdkBuilder.deliveryMethod(deliveryMethod)
      }

      /**
       * @param recipient Notification recipient. 
       */
      override fun recipient(recipient: IResolvable) {
        cdkBuilder.recipient(recipient.let(IResolvable::unwrap))
      }

      /**
       * @param recipient Notification recipient. 
       */
      override fun recipient(recipient: NotificationRecipientTypeProperty) {
        cdkBuilder.recipient(recipient.let(NotificationRecipientTypeProperty::unwrap))
      }

      /**
       * @param recipient Notification recipient. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6214677c1471da5635831c025da1ed2c2693e2d582dd859d8cf1a7f9720cfe2a")
      override fun recipient(recipient: NotificationRecipientTypeProperty.Builder.() -> Unit): Unit
          = recipient(NotificationRecipientTypeProperty(recipient))

      /**
       * @param subject The subject of the email if the delivery method is `EMAIL` .
       * Supports variable injection. For more information, see [JSONPath
       * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
       * in the *Amazon Connect Administrators Guide* .
       */
      override fun subject(subject: String) {
        cdkBuilder.subject(subject)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnRule.SendNotificationActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnRule.SendNotificationActionProperty,
    ) : CdkObject(cdkObject), SendNotificationActionProperty {
      /**
       * Notification content.
       *
       * Supports variable injection. For more information, see [JSONPath
       * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
       * in the *Amazon Connect Administrators Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-sendnotificationaction.html#cfn-connect-rule-sendnotificationaction-content)
       */
      override fun content(): String = unwrap(this).getContent()

      /**
       * Content type format.
       *
       * *Allowed value* : `PLAIN_TEXT`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-sendnotificationaction.html#cfn-connect-rule-sendnotificationaction-contenttype)
       */
      override fun contentType(): String = unwrap(this).getContentType()

      /**
       * Notification delivery method.
       *
       * *Allowed value* : `EMAIL`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-sendnotificationaction.html#cfn-connect-rule-sendnotificationaction-deliverymethod)
       */
      override fun deliveryMethod(): String = unwrap(this).getDeliveryMethod()

      /**
       * Notification recipient.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-sendnotificationaction.html#cfn-connect-rule-sendnotificationaction-recipient)
       */
      override fun recipient(): Any = unwrap(this).getRecipient()

      /**
       * The subject of the email if the delivery method is `EMAIL` .
       *
       * Supports variable injection. For more information, see [JSONPath
       * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
       * in the *Amazon Connect Administrators Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-sendnotificationaction.html#cfn-connect-rule-sendnotificationaction-subject)
       */
      override fun subject(): String? = unwrap(this).getSubject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SendNotificationActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.SendNotificationActionProperty):
          SendNotificationActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SendNotificationActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SendNotificationActionProperty):
          software.amazon.awscdk.services.connect.CfnRule.SendNotificationActionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnRule.SendNotificationActionProperty
    }
  }

  /**
   * Information about the task action.
   *
   * This field is required if `TriggerEventSource` is one of the following values:
   * `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * TaskActionProperty taskActionProperty = TaskActionProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .references(Map.of(
   * "referencesKey", ReferenceProperty.builder()
   * .type("type")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-taskaction.html)
   */
  public interface TaskActionProperty {
    /**
     * The Amazon Resource Name (ARN) of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-taskaction.html#cfn-connect-rule-taskaction-contactflowarn)
     */
    public fun contactFlowArn(): String

    /**
     * The description.
     *
     * Supports variable injection. For more information, see [JSONPath
     * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
     * in the *Amazon Connect Administrators Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-taskaction.html#cfn-connect-rule-taskaction-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The name.
     *
     * Supports variable injection. For more information, see [JSONPath
     * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
     * in the *Amazon Connect Administrators Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-taskaction.html#cfn-connect-rule-taskaction-name)
     */
    public fun name(): String

    /**
     * Information about the reference when the `referenceType` is `URL` .
     *
     * Otherwise, null. `URL` is the only accepted type. (Supports variable injection in the `Value`
     * field.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-taskaction.html#cfn-connect-rule-taskaction-references)
     */
    public fun references(): Any? = unwrap(this).getReferences()

    /**
     * A builder for [TaskActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contactFlowArn The Amazon Resource Name (ARN) of the flow. 
       */
      public fun contactFlowArn(contactFlowArn: String)

      /**
       * @param description The description.
       * Supports variable injection. For more information, see [JSONPath
       * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
       * in the *Amazon Connect Administrators Guide* .
       */
      public fun description(description: String)

      /**
       * @param name The name. 
       * Supports variable injection. For more information, see [JSONPath
       * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
       * in the *Amazon Connect Administrators Guide* .
       */
      public fun name(name: String)

      /**
       * @param references Information about the reference when the `referenceType` is `URL` .
       * Otherwise, null. `URL` is the only accepted type. (Supports variable injection in the
       * `Value` field.)
       */
      public fun references(references: IResolvable)

      /**
       * @param references Information about the reference when the `referenceType` is `URL` .
       * Otherwise, null. `URL` is the only accepted type. (Supports variable injection in the
       * `Value` field.)
       */
      public fun references(references: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.TaskActionProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.TaskActionProperty.builder()

      /**
       * @param contactFlowArn The Amazon Resource Name (ARN) of the flow. 
       */
      override fun contactFlowArn(contactFlowArn: String) {
        cdkBuilder.contactFlowArn(contactFlowArn)
      }

      /**
       * @param description The description.
       * Supports variable injection. For more information, see [JSONPath
       * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
       * in the *Amazon Connect Administrators Guide* .
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param name The name. 
       * Supports variable injection. For more information, see [JSONPath
       * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
       * in the *Amazon Connect Administrators Guide* .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param references Information about the reference when the `referenceType` is `URL` .
       * Otherwise, null. `URL` is the only accepted type. (Supports variable injection in the
       * `Value` field.)
       */
      override fun references(references: IResolvable) {
        cdkBuilder.references(references.let(IResolvable::unwrap))
      }

      /**
       * @param references Information about the reference when the `referenceType` is `URL` .
       * Otherwise, null. `URL` is the only accepted type. (Supports variable injection in the
       * `Value` field.)
       */
      override fun references(references: Map<String, Any>) {
        cdkBuilder.references(references.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.TaskActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnRule.TaskActionProperty,
    ) : CdkObject(cdkObject), TaskActionProperty {
      /**
       * The Amazon Resource Name (ARN) of the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-taskaction.html#cfn-connect-rule-taskaction-contactflowarn)
       */
      override fun contactFlowArn(): String = unwrap(this).getContactFlowArn()

      /**
       * The description.
       *
       * Supports variable injection. For more information, see [JSONPath
       * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
       * in the *Amazon Connect Administrators Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-taskaction.html#cfn-connect-rule-taskaction-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The name.
       *
       * Supports variable injection. For more information, see [JSONPath
       * reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
       * in the *Amazon Connect Administrators Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-taskaction.html#cfn-connect-rule-taskaction-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Information about the reference when the `referenceType` is `URL` .
       *
       * Otherwise, null. `URL` is the only accepted type. (Supports variable injection in the
       * `Value` field.)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-taskaction.html#cfn-connect-rule-taskaction-references)
       */
      override fun references(): Any? = unwrap(this).getReferences()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TaskActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.TaskActionProperty):
          TaskActionProperty = CdkObjectWrappers.wrap(cdkObject) as? TaskActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskActionProperty):
          software.amazon.awscdk.services.connect.CfnRule.TaskActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnRule.TaskActionProperty
    }
  }

  /**
   * The definition for update case action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * Object emptyValue;
   * UpdateCaseActionProperty updateCaseActionProperty = UpdateCaseActionProperty.builder()
   * .fields(List.of(FieldProperty.builder()
   * .id("id")
   * .value(FieldValueProperty.builder()
   * .booleanValue(false)
   * .doubleValue(123)
   * .emptyValue(emptyValue)
   * .stringValue("stringValue")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-updatecaseaction.html)
   */
  public interface UpdateCaseActionProperty {
    /**
     * An array of case fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-updatecaseaction.html#cfn-connect-rule-updatecaseaction-fields)
     */
    public fun fields(): Any

    /**
     * A builder for [UpdateCaseActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fields An array of case fields. 
       */
      public fun fields(fields: IResolvable)

      /**
       * @param fields An array of case fields. 
       */
      public fun fields(fields: List<Any>)

      /**
       * @param fields An array of case fields. 
       */
      public fun fields(vararg fields: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRule.UpdateCaseActionProperty.Builder =
          software.amazon.awscdk.services.connect.CfnRule.UpdateCaseActionProperty.builder()

      /**
       * @param fields An array of case fields. 
       */
      override fun fields(fields: IResolvable) {
        cdkBuilder.fields(fields.let(IResolvable::unwrap))
      }

      /**
       * @param fields An array of case fields. 
       */
      override fun fields(fields: List<Any>) {
        cdkBuilder.fields(fields.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param fields An array of case fields. 
       */
      override fun fields(vararg fields: Any): Unit = fields(fields.toList())

      public fun build(): software.amazon.awscdk.services.connect.CfnRule.UpdateCaseActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connect.CfnRule.UpdateCaseActionProperty,
    ) : CdkObject(cdkObject), UpdateCaseActionProperty {
      /**
       * An array of case fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-updatecaseaction.html#cfn-connect-rule-updatecaseaction-fields)
       */
      override fun fields(): Any = unwrap(this).getFields()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UpdateCaseActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRule.UpdateCaseActionProperty):
          UpdateCaseActionProperty = CdkObjectWrappers.wrap(cdkObject) as? UpdateCaseActionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpdateCaseActionProperty):
          software.amazon.awscdk.services.connect.CfnRule.UpdateCaseActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnRule.UpdateCaseActionProperty
    }
  }
}
