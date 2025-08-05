@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.notifications

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an
 * [`EventRule`](https://docs.aws.amazon.com/notifications/latest/userguide/glossary.html) that is
 * associated with a specified `NotificationConfiguration` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.notifications.*;
 * CfnEventRule cfnEventRule = CfnEventRule.Builder.create(this, "MyCfnEventRule")
 * .eventType("eventType")
 * .notificationConfigurationArn("notificationConfigurationArn")
 * .regions(List.of("regions"))
 * .source("source")
 * // the properties below are optional
 * .eventPattern("eventPattern")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html)
 */
public open class CfnEventRule(
  cdkObject: software.amazon.awscdk.services.notifications.CfnEventRule,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventRuleProps,
  ) :
      this(software.amazon.awscdk.services.notifications.CfnEventRule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEventRuleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventRuleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventRuleProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the `EventRule` .
   *
   * AWS CloudFormation stack generates this ARN and then uses this ARN associated with the
   * `NotificationConfiguration` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The creation time of the `EventRule` .
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * A list of Amazon EventBridge Managed Rule ARNs associated with this `EventRule` .
   *
   *
   * These are created by AWS User Notifications within your account so your `EventRules` can
   * function.
   */
  public open fun attrManagedRules(): List<String> = unwrap(this).getAttrManagedRules()

  /**
   *
   */
  public open fun attrStatusSummaryByRegion(): IResolvable =
      unwrap(this).getAttrStatusSummaryByRegion().let(IResolvable::wrap)

  /**
   * An additional event pattern used to further filter the events this `EventRule` receives.
   */
  public open fun eventPattern(): String? = unwrap(this).getEventPattern()

  /**
   * An additional event pattern used to further filter the events this `EventRule` receives.
   */
  public open fun eventPattern(`value`: String) {
    unwrap(this).setEventPattern(`value`)
  }

  /**
   * The event type this rule should match with the EventBridge events.
   */
  public open fun eventType(): String = unwrap(this).getEventType()

  /**
   * The event type this rule should match with the EventBridge events.
   */
  public open fun eventType(`value`: String) {
    unwrap(this).setEventType(`value`)
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
   * The ARN for the `NotificationConfiguration` associated with this `EventRule` .
   */
  public open fun notificationConfigurationArn(): String =
      unwrap(this).getNotificationConfigurationArn()

  /**
   * The ARN for the `NotificationConfiguration` associated with this `EventRule` .
   */
  public open fun notificationConfigurationArn(`value`: String) {
    unwrap(this).setNotificationConfigurationArn(`value`)
  }

  /**
   * A list of AWS Regions that send events to this `EventRule` .
   */
  public open fun regions(): List<String> = unwrap(this).getRegions()

  /**
   * A list of AWS Regions that send events to this `EventRule` .
   */
  public open fun regions(`value`: List<String>) {
    unwrap(this).setRegions(`value`)
  }

  /**
   * A list of AWS Regions that send events to this `EventRule` .
   */
  public open fun regions(vararg `value`: String): Unit = regions(`value`.toList())

  /**
   * The event source this rule should match with the EventBridge event sources.
   */
  public open fun source(): String = unwrap(this).getSource()

  /**
   * The event source this rule should match with the EventBridge event sources.
   */
  public open fun source(`value`: String) {
    unwrap(this).setSource(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.notifications.CfnEventRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An additional event pattern used to further filter the events this `EventRule` receives.
     *
     * For more information, see [Amazon EventBridge event
     * patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) in
     * the *Amazon EventBridge User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-eventpattern)
     * @param eventPattern An additional event pattern used to further filter the events this
     * `EventRule` receives. 
     */
    public fun eventPattern(eventPattern: String)

    /**
     * The event type this rule should match with the EventBridge events.
     *
     * It must match with atleast one of the valid EventBridge event types. For example, Amazon EC2
     * Instance State change Notification and Amazon CloudWatch State Change. For more information, see
     * [Event delivery from AWS
     * services](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-service-event.html#eb-service-event-delivery-level)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-eventtype)
     * @param eventType The event type this rule should match with the EventBridge events. 
     */
    public fun eventType(eventType: String)

    /**
     * The ARN for the `NotificationConfiguration` associated with this `EventRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-notificationconfigurationarn)
     * @param notificationConfigurationArn The ARN for the `NotificationConfiguration` associated
     * with this `EventRule` . 
     */
    public fun notificationConfigurationArn(notificationConfigurationArn: String)

    /**
     * A list of AWS Regions that send events to this `EventRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-regions)
     * @param regions A list of AWS Regions that send events to this `EventRule` . 
     */
    public fun regions(regions: List<String>)

    /**
     * A list of AWS Regions that send events to this `EventRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-regions)
     * @param regions A list of AWS Regions that send events to this `EventRule` . 
     */
    public fun regions(vararg regions: String)

    /**
     * The event source this rule should match with the EventBridge event sources.
     *
     * It must match with atleast one of the valid EventBridge event sources. Only AWS service
     * sourced events are supported. For example, `aws.ec2` and `aws.cloudwatch` . For more
     * information, see [Event delivery from AWS
     * services](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-service-event.html#eb-service-event-delivery-level)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-source)
     * @param source The event source this rule should match with the EventBridge event sources. 
     */
    public fun source(source: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.notifications.CfnEventRule.Builder =
        software.amazon.awscdk.services.notifications.CfnEventRule.Builder.create(scope, id)

    /**
     * An additional event pattern used to further filter the events this `EventRule` receives.
     *
     * For more information, see [Amazon EventBridge event
     * patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) in
     * the *Amazon EventBridge User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-eventpattern)
     * @param eventPattern An additional event pattern used to further filter the events this
     * `EventRule` receives. 
     */
    override fun eventPattern(eventPattern: String) {
      cdkBuilder.eventPattern(eventPattern)
    }

    /**
     * The event type this rule should match with the EventBridge events.
     *
     * It must match with atleast one of the valid EventBridge event types. For example, Amazon EC2
     * Instance State change Notification and Amazon CloudWatch State Change. For more information, see
     * [Event delivery from AWS
     * services](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-service-event.html#eb-service-event-delivery-level)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-eventtype)
     * @param eventType The event type this rule should match with the EventBridge events. 
     */
    override fun eventType(eventType: String) {
      cdkBuilder.eventType(eventType)
    }

    /**
     * The ARN for the `NotificationConfiguration` associated with this `EventRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-notificationconfigurationarn)
     * @param notificationConfigurationArn The ARN for the `NotificationConfiguration` associated
     * with this `EventRule` . 
     */
    override fun notificationConfigurationArn(notificationConfigurationArn: String) {
      cdkBuilder.notificationConfigurationArn(notificationConfigurationArn)
    }

    /**
     * A list of AWS Regions that send events to this `EventRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-regions)
     * @param regions A list of AWS Regions that send events to this `EventRule` . 
     */
    override fun regions(regions: List<String>) {
      cdkBuilder.regions(regions)
    }

    /**
     * A list of AWS Regions that send events to this `EventRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-regions)
     * @param regions A list of AWS Regions that send events to this `EventRule` . 
     */
    override fun regions(vararg regions: String): Unit = regions(regions.toList())

    /**
     * The event source this rule should match with the EventBridge event sources.
     *
     * It must match with atleast one of the valid EventBridge event sources. Only AWS service
     * sourced events are supported. For example, `aws.ec2` and `aws.cloudwatch` . For more
     * information, see [Event delivery from AWS
     * services](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-service-event.html#eb-service-event-delivery-level)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-source)
     * @param source The event source this rule should match with the EventBridge event sources. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public fun build(): software.amazon.awscdk.services.notifications.CfnEventRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.notifications.CfnEventRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.notifications.CfnEventRule):
        CfnEventRule = CfnEventRule(cdkObject)

    internal fun unwrap(wrapped: CfnEventRule):
        software.amazon.awscdk.services.notifications.CfnEventRule = wrapped.cdkObject as
        software.amazon.awscdk.services.notifications.CfnEventRule
  }

  /**
   * Provides additional information about the current `EventRule` status.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.notifications.*;
   * EventRuleStatusSummaryProperty eventRuleStatusSummaryProperty =
   * EventRuleStatusSummaryProperty.builder()
   * .reason("reason")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notifications-eventrule-eventrulestatussummary.html)
   */
  public interface EventRuleStatusSummaryProperty {
    /**
     * A human-readable reason for `EventRuleStatus` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notifications-eventrule-eventrulestatussummary.html#cfn-notifications-eventrule-eventrulestatussummary-reason)
     */
    public fun reason(): String

    /**
     * The status of the `EventRule` .
     *
     * * Values:
     * * `ACTIVE`
     * * The `EventRule` can process events.
     * * `INACTIVE`
     * * The `EventRule` may be unable to process events.
     * * `CREATING`
     * * The `EventRule` is being created.
     *
     * Only `GET` and `LIST` calls can be run.
     *
     * * `UPDATING`
     * * The `EventRule` is being updated.
     *
     * Only `GET` and `LIST` calls can be run.
     *
     * * `DELETING`
     * * The `EventRule` is being deleted.
     *
     * Only `GET` and `LIST` calls can be run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notifications-eventrule-eventrulestatussummary.html#cfn-notifications-eventrule-eventrulestatussummary-status)
     */
    public fun status(): String

    /**
     * A builder for [EventRuleStatusSummaryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param reason A human-readable reason for `EventRuleStatus` . 
       */
      public fun reason(reason: String)

      /**
       * @param status The status of the `EventRule` . 
       * * Values:
       * * `ACTIVE`
       * * The `EventRule` can process events.
       * * `INACTIVE`
       * * The `EventRule` may be unable to process events.
       * * `CREATING`
       * * The `EventRule` is being created.
       *
       * Only `GET` and `LIST` calls can be run.
       *
       * * `UPDATING`
       * * The `EventRule` is being updated.
       *
       * Only `GET` and `LIST` calls can be run.
       *
       * * `DELETING`
       * * The `EventRule` is being deleted.
       *
       * Only `GET` and `LIST` calls can be run.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.notifications.CfnEventRule.EventRuleStatusSummaryProperty.Builder
          =
          software.amazon.awscdk.services.notifications.CfnEventRule.EventRuleStatusSummaryProperty.builder()

      /**
       * @param reason A human-readable reason for `EventRuleStatus` . 
       */
      override fun reason(reason: String) {
        cdkBuilder.reason(reason)
      }

      /**
       * @param status The status of the `EventRule` . 
       * * Values:
       * * `ACTIVE`
       * * The `EventRule` can process events.
       * * `INACTIVE`
       * * The `EventRule` may be unable to process events.
       * * `CREATING`
       * * The `EventRule` is being created.
       *
       * Only `GET` and `LIST` calls can be run.
       *
       * * `UPDATING`
       * * The `EventRule` is being updated.
       *
       * Only `GET` and `LIST` calls can be run.
       *
       * * `DELETING`
       * * The `EventRule` is being deleted.
       *
       * Only `GET` and `LIST` calls can be run.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.notifications.CfnEventRule.EventRuleStatusSummaryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.notifications.CfnEventRule.EventRuleStatusSummaryProperty,
    ) : CdkObject(cdkObject),
        EventRuleStatusSummaryProperty {
      /**
       * A human-readable reason for `EventRuleStatus` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notifications-eventrule-eventrulestatussummary.html#cfn-notifications-eventrule-eventrulestatussummary-reason)
       */
      override fun reason(): String = unwrap(this).getReason()

      /**
       * The status of the `EventRule` .
       *
       * * Values:
       * * `ACTIVE`
       * * The `EventRule` can process events.
       * * `INACTIVE`
       * * The `EventRule` may be unable to process events.
       * * `CREATING`
       * * The `EventRule` is being created.
       *
       * Only `GET` and `LIST` calls can be run.
       *
       * * `UPDATING`
       * * The `EventRule` is being updated.
       *
       * Only `GET` and `LIST` calls can be run.
       *
       * * `DELETING`
       * * The `EventRule` is being deleted.
       *
       * Only `GET` and `LIST` calls can be run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-notifications-eventrule-eventrulestatussummary.html#cfn-notifications-eventrule-eventrulestatussummary-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventRuleStatusSummaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.notifications.CfnEventRule.EventRuleStatusSummaryProperty):
          EventRuleStatusSummaryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EventRuleStatusSummaryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventRuleStatusSummaryProperty):
          software.amazon.awscdk.services.notifications.CfnEventRule.EventRuleStatusSummaryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.notifications.CfnEventRule.EventRuleStatusSummaryProperty
    }
  }
}
