@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a notification rule for a resource.
 *
 * The rule specifies the events you want notifications about and the targets (such as Amazon Simple
 * Notification Service topics or AWS Chatbot clients configured for Slack) where you want to receive
 * them.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codestarnotifications.*;
 * CfnNotificationRule cfnNotificationRule = CfnNotificationRule.Builder.create(this,
 * "MyCfnNotificationRule")
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
public open class CfnNotificationRule(
  cdkObject: software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNotificationRuleProps,
  ) :
      this(software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnNotificationRuleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNotificationRuleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNotificationRuleProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the notification rule.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name or email alias of the person who created the notification rule.
   */
  public open fun createdBy(): String? = unwrap(this).getCreatedBy()

  /**
   * The name or email alias of the person who created the notification rule.
   */
  public open fun createdBy(`value`: String) {
    unwrap(this).setCreatedBy(`value`)
  }

  /**
   * The level of detail to include in the notifications for this resource.
   */
  public open fun detailType(): String = unwrap(this).getDetailType()

  /**
   * The level of detail to include in the notifications for this resource.
   */
  public open fun detailType(`value`: String) {
    unwrap(this).setDetailType(`value`)
  }

  /**
   * The event type associated with this notification rule.
   */
  public open fun eventTypeId(): String? = unwrap(this).getEventTypeId()

  /**
   * The event type associated with this notification rule.
   */
  public open fun eventTypeId(`value`: String) {
    unwrap(this).setEventTypeId(`value`)
  }

  /**
   * A list of event types associated with this notification rule.
   */
  public open fun eventTypeIds(): List<String> = unwrap(this).getEventTypeIds()

  /**
   * A list of event types associated with this notification rule.
   */
  public open fun eventTypeIds(`value`: List<String>) {
    unwrap(this).setEventTypeIds(`value`)
  }

  /**
   * A list of event types associated with this notification rule.
   */
  public open fun eventTypeIds(vararg `value`: String): Unit = eventTypeIds(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name for the notification rule.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name for the notification rule.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the resource to associate with the notification rule.
   */
  public open fun resource(): String = unwrap(this).getResource()

  /**
   * The Amazon Resource Name (ARN) of the resource to associate with the notification rule.
   */
  public open fun resource(`value`: String) {
    unwrap(this).setResource(`value`)
  }

  /**
   * The status of the notification rule.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * The status of the notification rule.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags to apply to this notification rule.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * A list of tags to apply to this notification rule.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic or AWS Chatbot client.
   */
  public open fun targetAddress(): String? = unwrap(this).getTargetAddress()

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic or AWS Chatbot client.
   */
  public open fun targetAddress(`value`: String) {
    unwrap(this).setTargetAddress(`value`)
  }

  /**
   * A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot clients to
   * associate with the notification rule.
   */
  public open fun targets(): Any = unwrap(this).getTargets()

  /**
   * A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot clients to
   * associate with the notification rule.
   */
  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot clients to
   * associate with the notification rule.
   */
  public open fun targets(`value`: List<Any>) {
    unwrap(this).setTargets(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot clients to
   * associate with the notification rule.
   */
  public open fun targets(vararg `value`: Any): Unit = targets(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codestarnotifications.CfnNotificationRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name or email alias of the person who created the notification rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-createdby)
     * @param createdBy The name or email alias of the person who created the notification rule. 
     */
    public fun createdBy(createdBy: String)

    /**
     * The level of detail to include in the notifications for this resource.
     *
     * `BASIC` will include only the contents of the event as it would appear in Amazon CloudWatch.
     * `FULL` will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-detailtype)
     * @param detailType The level of detail to include in the notifications for this resource. 
     */
    public fun detailType(detailType: String)

    /**
     * The event type associated with this notification rule.
     *
     * For a complete list of event types and IDs, see [Notification
     * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
     * the *Developer Tools Console User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-eventtypeid)
     * @param eventTypeId The event type associated with this notification rule. 
     */
    public fun eventTypeId(eventTypeId: String)

    /**
     * A list of event types associated with this notification rule.
     *
     * For a complete list of event types and IDs, see [Notification
     * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
     * the *Developer Tools Console User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-eventtypeids)
     * @param eventTypeIds A list of event types associated with this notification rule. 
     */
    public fun eventTypeIds(eventTypeIds: List<String>)

    /**
     * A list of event types associated with this notification rule.
     *
     * For a complete list of event types and IDs, see [Notification
     * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
     * the *Developer Tools Console User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-eventtypeids)
     * @param eventTypeIds A list of event types associated with this notification rule. 
     */
    public fun eventTypeIds(vararg eventTypeIds: String)

    /**
     * The name for the notification rule.
     *
     * Notification rule names must be unique in your AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-name)
     * @param name The name for the notification rule. 
     */
    public fun name(name: String)

    /**
     * The Amazon Resource Name (ARN) of the resource to associate with the notification rule.
     *
     * Supported resources include pipelines in AWS CodePipeline , repositories in AWS CodeCommit ,
     * and build projects in AWS CodeBuild .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-resource)
     * @param resource The Amazon Resource Name (ARN) of the resource to associate with the
     * notification rule. 
     */
    public fun resource(resource: String)

    /**
     * The status of the notification rule.
     *
     * The default value is `ENABLED` . If the status is set to `DISABLED` , notifications aren't
     * sent for the notification rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-status)
     * @param status The status of the notification rule. 
     */
    public fun status(status: String)

    /**
     * A list of tags to apply to this notification rule.
     *
     * Key names cannot start with " `aws` ".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-tags)
     * @param tags A list of tags to apply to this notification rule. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic or AWS Chatbot client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targetaddress)
     * @param targetAddress The Amazon Resource Name (ARN) of the Amazon SNS topic or AWS Chatbot
     * client. 
     */
    public fun targetAddress(targetAddress: String)

    /**
     * A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot clients to
     * associate with the notification rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targets)
     * @param targets A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot
     * clients to associate with the notification rule. 
     */
    public fun targets(targets: IResolvable)

    /**
     * A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot clients to
     * associate with the notification rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targets)
     * @param targets A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot
     * clients to associate with the notification rule. 
     */
    public fun targets(targets: List<Any>)

    /**
     * A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot clients to
     * associate with the notification rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targets)
     * @param targets A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot
     * clients to associate with the notification rule. 
     */
    public fun targets(vararg targets: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.Builder =
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.Builder.create(scope,
        id)

    /**
     * The name or email alias of the person who created the notification rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-createdby)
     * @param createdBy The name or email alias of the person who created the notification rule. 
     */
    override fun createdBy(createdBy: String) {
      cdkBuilder.createdBy(createdBy)
    }

    /**
     * The level of detail to include in the notifications for this resource.
     *
     * `BASIC` will include only the contents of the event as it would appear in Amazon CloudWatch.
     * `FULL` will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-detailtype)
     * @param detailType The level of detail to include in the notifications for this resource. 
     */
    override fun detailType(detailType: String) {
      cdkBuilder.detailType(detailType)
    }

    /**
     * The event type associated with this notification rule.
     *
     * For a complete list of event types and IDs, see [Notification
     * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
     * the *Developer Tools Console User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-eventtypeid)
     * @param eventTypeId The event type associated with this notification rule. 
     */
    override fun eventTypeId(eventTypeId: String) {
      cdkBuilder.eventTypeId(eventTypeId)
    }

    /**
     * A list of event types associated with this notification rule.
     *
     * For a complete list of event types and IDs, see [Notification
     * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
     * the *Developer Tools Console User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-eventtypeids)
     * @param eventTypeIds A list of event types associated with this notification rule. 
     */
    override fun eventTypeIds(eventTypeIds: List<String>) {
      cdkBuilder.eventTypeIds(eventTypeIds)
    }

    /**
     * A list of event types associated with this notification rule.
     *
     * For a complete list of event types and IDs, see [Notification
     * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
     * the *Developer Tools Console User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-eventtypeids)
     * @param eventTypeIds A list of event types associated with this notification rule. 
     */
    override fun eventTypeIds(vararg eventTypeIds: String): Unit =
        eventTypeIds(eventTypeIds.toList())

    /**
     * The name for the notification rule.
     *
     * Notification rule names must be unique in your AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-name)
     * @param name The name for the notification rule. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of the resource to associate with the notification rule.
     *
     * Supported resources include pipelines in AWS CodePipeline , repositories in AWS CodeCommit ,
     * and build projects in AWS CodeBuild .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-resource)
     * @param resource The Amazon Resource Name (ARN) of the resource to associate with the
     * notification rule. 
     */
    override fun resource(resource: String) {
      cdkBuilder.resource(resource)
    }

    /**
     * The status of the notification rule.
     *
     * The default value is `ENABLED` . If the status is set to `DISABLED` , notifications aren't
     * sent for the notification rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-status)
     * @param status The status of the notification rule. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * A list of tags to apply to this notification rule.
     *
     * Key names cannot start with " `aws` ".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-tags)
     * @param tags A list of tags to apply to this notification rule. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic or AWS Chatbot client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targetaddress)
     * @param targetAddress The Amazon Resource Name (ARN) of the Amazon SNS topic or AWS Chatbot
     * client. 
     */
    override fun targetAddress(targetAddress: String) {
      cdkBuilder.targetAddress(targetAddress)
    }

    /**
     * A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot clients to
     * associate with the notification rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targets)
     * @param targets A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot
     * clients to associate with the notification rule. 
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot clients to
     * associate with the notification rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targets)
     * @param targets A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot
     * clients to associate with the notification rule. 
     */
    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot clients to
     * associate with the notification rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targets)
     * @param targets A list of Amazon Resource Names (ARNs) of Amazon SNS topics and AWS Chatbot
     * clients to associate with the notification rule. 
     */
    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    public fun build(): software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNotificationRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNotificationRule(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule):
        CfnNotificationRule = CfnNotificationRule(cdkObject)

    internal fun unwrap(wrapped: CfnNotificationRule):
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule =
        wrapped.cdkObject as
        software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule
  }

  /**
   * Information about the AWS Chatbot topics or AWS Chatbot clients associated with a notification
   * rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codestarnotifications.*;
   * TargetProperty targetProperty = TargetProperty.builder()
   * .targetAddress("targetAddress")
   * .targetType("targetType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html)
   */
  public interface TargetProperty {
    /**
     * The Amazon Resource Name (ARN) of the AWS Chatbot topic or AWS Chatbot client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html#cfn-codestarnotifications-notificationrule-target-targetaddress)
     */
    public fun targetAddress(): String

    /**
     * The target type. Can be an Amazon Simple Notification Service topic or AWS Chatbot client.
     *
     * * Amazon Simple Notification Service topics are specified as `SNS` .
     * * AWS Chatbot clients are specified as `AWSChatbotSlack` .
     * * AWS Chatbot clients for Microsoft Teams are specified as `AWSChatbotMicrosoftTeams` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html#cfn-codestarnotifications-notificationrule-target-targettype)
     */
    public fun targetType(): String

    /**
     * A builder for [TargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetAddress The Amazon Resource Name (ARN) of the AWS Chatbot topic or AWS Chatbot
       * client. 
       */
      public fun targetAddress(targetAddress: String)

      /**
       * @param targetType The target type. Can be an Amazon Simple Notification Service topic or
       * AWS Chatbot client. 
       * * Amazon Simple Notification Service topics are specified as `SNS` .
       * * AWS Chatbot clients are specified as `AWSChatbotSlack` .
       * * AWS Chatbot clients for Microsoft Teams are specified as `AWSChatbotMicrosoftTeams` .
       */
      public fun targetType(targetType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.TargetProperty.Builder
          =
          software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.TargetProperty.builder()

      /**
       * @param targetAddress The Amazon Resource Name (ARN) of the AWS Chatbot topic or AWS Chatbot
       * client. 
       */
      override fun targetAddress(targetAddress: String) {
        cdkBuilder.targetAddress(targetAddress)
      }

      /**
       * @param targetType The target type. Can be an Amazon Simple Notification Service topic or
       * AWS Chatbot client. 
       * * Amazon Simple Notification Service topics are specified as `SNS` .
       * * AWS Chatbot clients are specified as `AWSChatbotSlack` .
       * * AWS Chatbot clients for Microsoft Teams are specified as `AWSChatbotMicrosoftTeams` .
       */
      override fun targetType(targetType: String) {
        cdkBuilder.targetType(targetType)
      }

      public fun build():
          software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.TargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.TargetProperty,
    ) : CdkObject(cdkObject), TargetProperty {
      /**
       * The Amazon Resource Name (ARN) of the AWS Chatbot topic or AWS Chatbot client.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html#cfn-codestarnotifications-notificationrule-target-targetaddress)
       */
      override fun targetAddress(): String = unwrap(this).getTargetAddress()

      /**
       * The target type. Can be an Amazon Simple Notification Service topic or AWS Chatbot client.
       *
       * * Amazon Simple Notification Service topics are specified as `SNS` .
       * * AWS Chatbot clients are specified as `AWSChatbotSlack` .
       * * AWS Chatbot clients for Microsoft Teams are specified as `AWSChatbotMicrosoftTeams` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html#cfn-codestarnotifications-notificationrule-target-targettype)
       */
      override fun targetType(): String = unwrap(this).getTargetType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.TargetProperty):
          TargetProperty = CdkObjectWrappers.wrap(cdkObject) as? TargetProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetProperty):
          software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.TargetProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.TargetProperty
    }
  }
}
