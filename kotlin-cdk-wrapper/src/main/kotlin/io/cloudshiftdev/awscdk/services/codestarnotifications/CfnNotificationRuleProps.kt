@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnNotificationRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codestarnotifications.*;
 * CfnNotificationRuleProps cfnNotificationRuleProps = CfnNotificationRuleProps.builder()
 * .detailType("detailType")
 * .eventTypeIds(List.of("eventTypeIds"))
 * .name("name")
 * .resource("resource")
 * .targets(List.of(TargetProperty.builder()
 * .targetAddress("targetAddress")
 * .targetType("targetType")
 * .build()))
 * // the properties below are optional
 * .createdBy("createdBy")
 * .eventTypeId("eventTypeId")
 * .status("status")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .targetAddress("targetAddress")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html)
 */
public interface CfnNotificationRuleProps {
  /**
   * The name or email alias of the person who created the notification rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-createdby)
   */
  public fun createdBy(): String? = unwrap(this).getCreatedBy()

  /**
   * The level of detail to include in the notifications for this resource.
   *
   * `BASIC` will include only the contents of the event as it would appear in Amazon CloudWatch.
   * `FULL` will include any supplemental information provided by AWS CodeStar Notifications and/or the
   * service for the resource for which the notification is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-detailtype)
   */
  public fun detailType(): String

  /**
   * The event type associated with this notification rule.
   *
   * For a complete list of event types and IDs, see [Notification
   * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
   * the *Developer Tools Console User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-eventtypeid)
   */
  public fun eventTypeId(): String? = unwrap(this).getEventTypeId()

  /**
   * A list of event types associated with this notification rule.
   *
   * For a complete list of event types and IDs, see [Notification
   * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
   * the *Developer Tools Console User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-eventtypeids)
   */
  public fun eventTypeIds(): List<String>

  /**
   * The name for the notification rule.
   *
   * Notification rule names must be unique in your AWS account .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-name)
   */
  public fun name(): String

  /**
   * The Amazon Resource Name (ARN) of the resource to associate with the notification rule.
   *
   * Supported resources include pipelines in AWS CodePipeline , repositories in AWS CodeCommit ,
   * and build projects in AWS CodeBuild .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-resource)
   */
  public fun resource(): String

  /**
   * The status of the notification rule.
   *
   * The default value is `ENABLED` . If the status is set to `DISABLED` , notifications aren't sent
   * for the notification rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * A list of tags to apply to this notification rule.
   *
   * Key names cannot start with " `aws` ".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic or AWS Chatbot client.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targetaddress)
   */
  public fun targetAddress(): String? = unwrap(this).getTargetAddress()

  /**
   * A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot clients to
   * associate with the notification rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targets)
   */
  public fun targets(): Any

  /**
   * A builder for [CfnNotificationRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param createdBy The name or email alias of the person who created the notification rule.
     */
    public fun createdBy(createdBy: String)

    /**
     * @param detailType The level of detail to include in the notifications for this resource. 
     * `BASIC` will include only the contents of the event as it would appear in Amazon CloudWatch.
     * `FULL` will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     */
    public fun detailType(detailType: String)

    /**
     * @param eventTypeId The event type associated with this notification rule.
     * For a complete list of event types and IDs, see [Notification
     * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
     * the *Developer Tools Console User Guide* .
     */
    public fun eventTypeId(eventTypeId: String)

    /**
     * @param eventTypeIds A list of event types associated with this notification rule. 
     * For a complete list of event types and IDs, see [Notification
     * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
     * the *Developer Tools Console User Guide* .
     */
    public fun eventTypeIds(eventTypeIds: List<String>)

    /**
     * @param eventTypeIds A list of event types associated with this notification rule. 
     * For a complete list of event types and IDs, see [Notification
     * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
     * the *Developer Tools Console User Guide* .
     */
    public fun eventTypeIds(vararg eventTypeIds: String)

    /**
     * @param name The name for the notification rule. 
     * Notification rule names must be unique in your AWS account .
     */
    public fun name(name: String)

    /**
     * @param resource The Amazon Resource Name (ARN) of the resource to associate with the
     * notification rule. 
     * Supported resources include pipelines in AWS CodePipeline , repositories in AWS CodeCommit ,
     * and build projects in AWS CodeBuild .
     */
    public fun resource(resource: String)

    /**
     * @param status The status of the notification rule.
     * The default value is `ENABLED` . If the status is set to `DISABLED` , notifications aren't
     * sent for the notification rule.
     */
    public fun status(status: String)

    /**
     * @param tags A list of tags to apply to this notification rule.
     * Key names cannot start with " `aws` ".
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param targetAddress The Amazon Resource Name (ARN) of the Amazon SNS topic or AWS Chatbot
     * client.
     */
    public fun targetAddress(targetAddress: String)

    /**
     * @param targets A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot
     * clients to associate with the notification rule. 
     */
    public fun targets(targets: IResolvable)

    /**
     * @param targets A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot
     * clients to associate with the notification rule. 
     */
    public fun targets(targets: List<Any>)

    /**
     * @param targets A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot
     * clients to associate with the notification rule. 
     */
    public fun targets(vararg targets: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps.Builder =
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps.builder()

    /**
     * @param createdBy The name or email alias of the person who created the notification rule.
     */
    override fun createdBy(createdBy: String) {
      cdkBuilder.createdBy(createdBy)
    }

    /**
     * @param detailType The level of detail to include in the notifications for this resource. 
     * `BASIC` will include only the contents of the event as it would appear in Amazon CloudWatch.
     * `FULL` will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     */
    override fun detailType(detailType: String) {
      cdkBuilder.detailType(detailType)
    }

    /**
     * @param eventTypeId The event type associated with this notification rule.
     * For a complete list of event types and IDs, see [Notification
     * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
     * the *Developer Tools Console User Guide* .
     */
    override fun eventTypeId(eventTypeId: String) {
      cdkBuilder.eventTypeId(eventTypeId)
    }

    /**
     * @param eventTypeIds A list of event types associated with this notification rule. 
     * For a complete list of event types and IDs, see [Notification
     * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
     * the *Developer Tools Console User Guide* .
     */
    override fun eventTypeIds(eventTypeIds: List<String>) {
      cdkBuilder.eventTypeIds(eventTypeIds)
    }

    /**
     * @param eventTypeIds A list of event types associated with this notification rule. 
     * For a complete list of event types and IDs, see [Notification
     * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
     * the *Developer Tools Console User Guide* .
     */
    override fun eventTypeIds(vararg eventTypeIds: String): Unit =
        eventTypeIds(eventTypeIds.toList())

    /**
     * @param name The name for the notification rule. 
     * Notification rule names must be unique in your AWS account .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param resource The Amazon Resource Name (ARN) of the resource to associate with the
     * notification rule. 
     * Supported resources include pipelines in AWS CodePipeline , repositories in AWS CodeCommit ,
     * and build projects in AWS CodeBuild .
     */
    override fun resource(resource: String) {
      cdkBuilder.resource(resource)
    }

    /**
     * @param status The status of the notification rule.
     * The default value is `ENABLED` . If the status is set to `DISABLED` , notifications aren't
     * sent for the notification rule.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags A list of tags to apply to this notification rule.
     * Key names cannot start with " `aws` ".
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param targetAddress The Amazon Resource Name (ARN) of the Amazon SNS topic or AWS Chatbot
     * client.
     */
    override fun targetAddress(targetAddress: String) {
      cdkBuilder.targetAddress(targetAddress)
    }

    /**
     * @param targets A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot
     * clients to associate with the notification rule. 
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    /**
     * @param targets A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot
     * clients to associate with the notification rule. 
     */
    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    /**
     * @param targets A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot
     * clients to associate with the notification rule. 
     */
    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    public fun build():
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps,
  ) : CdkObject(cdkObject), CfnNotificationRuleProps {
    /**
     * The name or email alias of the person who created the notification rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-createdby)
     */
    override fun createdBy(): String? = unwrap(this).getCreatedBy()

    /**
     * The level of detail to include in the notifications for this resource.
     *
     * `BASIC` will include only the contents of the event as it would appear in Amazon CloudWatch.
     * `FULL` will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-detailtype)
     */
    override fun detailType(): String = unwrap(this).getDetailType()

    /**
     * The event type associated with this notification rule.
     *
     * For a complete list of event types and IDs, see [Notification
     * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
     * the *Developer Tools Console User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-eventtypeid)
     */
    override fun eventTypeId(): String? = unwrap(this).getEventTypeId()

    /**
     * A list of event types associated with this notification rule.
     *
     * For a complete list of event types and IDs, see [Notification
     * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
     * the *Developer Tools Console User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-eventtypeids)
     */
    override fun eventTypeIds(): List<String> = unwrap(this).getEventTypeIds()

    /**
     * The name for the notification rule.
     *
     * Notification rule names must be unique in your AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) of the resource to associate with the notification rule.
     *
     * Supported resources include pipelines in AWS CodePipeline , repositories in AWS CodeCommit ,
     * and build projects in AWS CodeBuild .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-resource)
     */
    override fun resource(): String = unwrap(this).getResource()

    /**
     * The status of the notification rule.
     *
     * The default value is `ENABLED` . If the status is set to `DISABLED` , notifications aren't
     * sent for the notification rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * A list of tags to apply to this notification rule.
     *
     * Key names cannot start with " `aws` ".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic or AWS Chatbot client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targetaddress)
     */
    override fun targetAddress(): String? = unwrap(this).getTargetAddress()

    /**
     * A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot clients to
     * associate with the notification rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targets)
     */
    override fun targets(): Any = unwrap(this).getTargets()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNotificationRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps):
        CfnNotificationRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNotificationRuleProps):
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps
  }
}
