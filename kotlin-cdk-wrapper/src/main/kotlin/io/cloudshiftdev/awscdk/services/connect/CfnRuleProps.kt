@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnRule`.
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
 * CfnRuleProps cfnRuleProps = CfnRuleProps.builder()
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
public interface CfnRuleProps {
  /**
   * A list of actions to be run when the rule is triggered.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-actions)
   */
  public fun actions(): Any

  /**
   * The conditions of the rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-function)
   */
  public fun function(): String

  /**
   * The Amazon Resource Name (ARN) of the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The name of the rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-name)
   */
  public fun name(): String

  /**
   * The publish status of the rule.
   *
   * *Allowed values* : `DRAFT` | `PUBLISHED`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-publishstatus)
   */
  public fun publishStatus(): String

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The event source to trigger the rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-triggereventsource)
   */
  public fun triggerEventSource(): Any

  /**
   * A builder for [CfnRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions A list of actions to be run when the rule is triggered. 
     */
    public fun actions(actions: IResolvable)

    /**
     * @param actions A list of actions to be run when the rule is triggered. 
     */
    public fun actions(actions: CfnRule.ActionsProperty)

    /**
     * @param actions A list of actions to be run when the rule is triggered. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b6175cf3a99a320d27b1b42ac7669a7015347617a6f092dba6d431bb311da89")
    public fun actions(actions: CfnRule.ActionsProperty.Builder.() -> Unit)

    /**
     * @param function The conditions of the rule. 
     */
    public fun function(function: String)

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param name The name of the rule. 
     */
    public fun name(name: String)

    /**
     * @param publishStatus The publish status of the rule. 
     * *Allowed values* : `DRAFT` | `PUBLISHED`
     */
    public fun publishStatus(publishStatus: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param triggerEventSource The event source to trigger the rule. 
     */
    public fun triggerEventSource(triggerEventSource: IResolvable)

    /**
     * @param triggerEventSource The event source to trigger the rule. 
     */
    public fun triggerEventSource(triggerEventSource: CfnRule.RuleTriggerEventSourceProperty)

    /**
     * @param triggerEventSource The event source to trigger the rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f93c8c6589bfb365271079fc5c2138cc948c15f4d8346537f5ef7dd0d3d5b96")
    public
        fun triggerEventSource(triggerEventSource: CfnRule.RuleTriggerEventSourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnRuleProps.Builder =
        software.amazon.awscdk.services.connect.CfnRuleProps.builder()

    /**
     * @param actions A list of actions to be run when the rule is triggered. 
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    /**
     * @param actions A list of actions to be run when the rule is triggered. 
     */
    override fun actions(actions: CfnRule.ActionsProperty) {
      cdkBuilder.actions(actions.let(CfnRule.ActionsProperty::unwrap))
    }

    /**
     * @param actions A list of actions to be run when the rule is triggered. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b6175cf3a99a320d27b1b42ac7669a7015347617a6f092dba6d431bb311da89")
    override fun actions(actions: CfnRule.ActionsProperty.Builder.() -> Unit): Unit =
        actions(CfnRule.ActionsProperty(actions))

    /**
     * @param function The conditions of the rule. 
     */
    override fun function(function: String) {
      cdkBuilder.function(function)
    }

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param name The name of the rule. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param publishStatus The publish status of the rule. 
     * *Allowed values* : `DRAFT` | `PUBLISHED`
     */
    override fun publishStatus(publishStatus: String) {
      cdkBuilder.publishStatus(publishStatus)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param triggerEventSource The event source to trigger the rule. 
     */
    override fun triggerEventSource(triggerEventSource: IResolvable) {
      cdkBuilder.triggerEventSource(triggerEventSource.let(IResolvable::unwrap))
    }

    /**
     * @param triggerEventSource The event source to trigger the rule. 
     */
    override fun triggerEventSource(triggerEventSource: CfnRule.RuleTriggerEventSourceProperty) {
      cdkBuilder.triggerEventSource(triggerEventSource.let(CfnRule.RuleTriggerEventSourceProperty::unwrap))
    }

    /**
     * @param triggerEventSource The event source to trigger the rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f93c8c6589bfb365271079fc5c2138cc948c15f4d8346537f5ef7dd0d3d5b96")
    override
        fun triggerEventSource(triggerEventSource: CfnRule.RuleTriggerEventSourceProperty.Builder.() -> Unit):
        Unit = triggerEventSource(CfnRule.RuleTriggerEventSourceProperty(triggerEventSource))

    public fun build(): software.amazon.awscdk.services.connect.CfnRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnRuleProps,
  ) : CdkObject(cdkObject), CfnRuleProps {
    /**
     * A list of actions to be run when the rule is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-actions)
     */
    override fun actions(): Any = unwrap(this).getActions()

    /**
     * The conditions of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-function)
     */
    override fun function(): String = unwrap(this).getFunction()

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The name of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The publish status of the rule.
     *
     * *Allowed values* : `DRAFT` | `PUBLISHED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-publishstatus)
     */
    override fun publishStatus(): String = unwrap(this).getPublishStatus()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The event source to trigger the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html#cfn-connect-rule-triggereventsource)
     */
    override fun triggerEventSource(): Any = unwrap(this).getTriggerEventSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRuleProps): CfnRuleProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleProps): software.amazon.awscdk.services.connect.CfnRuleProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnRuleProps
  }
}
