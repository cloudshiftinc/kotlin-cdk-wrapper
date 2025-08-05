@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.notifications

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnEventRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.notifications.*;
 * CfnEventRuleProps cfnEventRuleProps = CfnEventRuleProps.builder()
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
public interface CfnEventRuleProps {
  /**
   * An additional event pattern used to further filter the events this `EventRule` receives.
   *
   * For more information, see [Amazon EventBridge event
   * patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) in the
   * *Amazon EventBridge User Guide.*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-eventpattern)
   */
  public fun eventPattern(): String? = unwrap(this).getEventPattern()

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
   */
  public fun eventType(): String

  /**
   * The ARN for the `NotificationConfiguration` associated with this `EventRule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-notificationconfigurationarn)
   */
  public fun notificationConfigurationArn(): String

  /**
   * A list of AWS Regions that send events to this `EventRule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-regions)
   */
  public fun regions(): List<String>

  /**
   * The event source this rule should match with the EventBridge event sources.
   *
   * It must match with atleast one of the valid EventBridge event sources. Only AWS service sourced
   * events are supported. For example, `aws.ec2` and `aws.cloudwatch` . For more information, see
   * [Event delivery from AWS
   * services](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-service-event.html#eb-service-event-delivery-level)
   * in the *Amazon EventBridge User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-source)
   */
  public fun source(): String

  /**
   * A builder for [CfnEventRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param eventPattern An additional event pattern used to further filter the events this
     * `EventRule` receives.
     * For more information, see [Amazon EventBridge event
     * patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) in
     * the *Amazon EventBridge User Guide.*
     */
    public fun eventPattern(eventPattern: String)

    /**
     * @param eventType The event type this rule should match with the EventBridge events. 
     * It must match with atleast one of the valid EventBridge event types. For example, Amazon EC2
     * Instance State change Notification and Amazon CloudWatch State Change. For more information, see
     * [Event delivery from AWS
     * services](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-service-event.html#eb-service-event-delivery-level)
     * in the *Amazon EventBridge User Guide* .
     */
    public fun eventType(eventType: String)

    /**
     * @param notificationConfigurationArn The ARN for the `NotificationConfiguration` associated
     * with this `EventRule` . 
     */
    public fun notificationConfigurationArn(notificationConfigurationArn: String)

    /**
     * @param regions A list of AWS Regions that send events to this `EventRule` . 
     */
    public fun regions(regions: List<String>)

    /**
     * @param regions A list of AWS Regions that send events to this `EventRule` . 
     */
    public fun regions(vararg regions: String)

    /**
     * @param source The event source this rule should match with the EventBridge event sources. 
     * It must match with atleast one of the valid EventBridge event sources. Only AWS service
     * sourced events are supported. For example, `aws.ec2` and `aws.cloudwatch` . For more
     * information, see [Event delivery from AWS
     * services](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-service-event.html#eb-service-event-delivery-level)
     * in the *Amazon EventBridge User Guide* .
     */
    public fun source(source: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.notifications.CfnEventRuleProps.Builder
        = software.amazon.awscdk.services.notifications.CfnEventRuleProps.builder()

    /**
     * @param eventPattern An additional event pattern used to further filter the events this
     * `EventRule` receives.
     * For more information, see [Amazon EventBridge event
     * patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) in
     * the *Amazon EventBridge User Guide.*
     */
    override fun eventPattern(eventPattern: String) {
      cdkBuilder.eventPattern(eventPattern)
    }

    /**
     * @param eventType The event type this rule should match with the EventBridge events. 
     * It must match with atleast one of the valid EventBridge event types. For example, Amazon EC2
     * Instance State change Notification and Amazon CloudWatch State Change. For more information, see
     * [Event delivery from AWS
     * services](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-service-event.html#eb-service-event-delivery-level)
     * in the *Amazon EventBridge User Guide* .
     */
    override fun eventType(eventType: String) {
      cdkBuilder.eventType(eventType)
    }

    /**
     * @param notificationConfigurationArn The ARN for the `NotificationConfiguration` associated
     * with this `EventRule` . 
     */
    override fun notificationConfigurationArn(notificationConfigurationArn: String) {
      cdkBuilder.notificationConfigurationArn(notificationConfigurationArn)
    }

    /**
     * @param regions A list of AWS Regions that send events to this `EventRule` . 
     */
    override fun regions(regions: List<String>) {
      cdkBuilder.regions(regions)
    }

    /**
     * @param regions A list of AWS Regions that send events to this `EventRule` . 
     */
    override fun regions(vararg regions: String): Unit = regions(regions.toList())

    /**
     * @param source The event source this rule should match with the EventBridge event sources. 
     * It must match with atleast one of the valid EventBridge event sources. Only AWS service
     * sourced events are supported. For example, `aws.ec2` and `aws.cloudwatch` . For more
     * information, see [Event delivery from AWS
     * services](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-service-event.html#eb-service-event-delivery-level)
     * in the *Amazon EventBridge User Guide* .
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public fun build(): software.amazon.awscdk.services.notifications.CfnEventRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.notifications.CfnEventRuleProps,
  ) : CdkObject(cdkObject),
      CfnEventRuleProps {
    /**
     * An additional event pattern used to further filter the events this `EventRule` receives.
     *
     * For more information, see [Amazon EventBridge event
     * patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) in
     * the *Amazon EventBridge User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-eventpattern)
     */
    override fun eventPattern(): String? = unwrap(this).getEventPattern()

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
     */
    override fun eventType(): String = unwrap(this).getEventType()

    /**
     * The ARN for the `NotificationConfiguration` associated with this `EventRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-notificationconfigurationarn)
     */
    override fun notificationConfigurationArn(): String =
        unwrap(this).getNotificationConfigurationArn()

    /**
     * A list of AWS Regions that send events to this `EventRule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-eventrule.html#cfn-notifications-eventrule-regions)
     */
    override fun regions(): List<String> = unwrap(this).getRegions()

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
     */
    override fun source(): String = unwrap(this).getSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.notifications.CfnEventRuleProps):
        CfnEventRuleProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEventRuleProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventRuleProps):
        software.amazon.awscdk.services.notifications.CfnEventRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.notifications.CfnEventRuleProps
  }
}
