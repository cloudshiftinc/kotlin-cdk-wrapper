@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Describes the notification configuration for an Amazon S3 bucket.
 *
 *
 * If you create the target resource and related permissions in the same template, you might have a
 * circular dependency.
 *
 * For example, you might use the `AWS::Lambda::Permission` resource to grant the bucket permission
 * to invoke an AWS Lambda function. However, AWS CloudFormation can't create the bucket until the
 * bucket has permission to invoke the function ( AWS CloudFormation checks whether the bucket can
 * invoke the function). If you're using Refs to pass the bucket name, this leads to a circular
 * dependency.
 *
 * To avoid this dependency, you can create all resources without specifying the notification
 * configuration. Then, update the stack with a notification configuration.
 *
 * For more information on permissions, see
 * [AWS::Lambda::Permission](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html)
 * and [Granting Permissions to Publish Event Notification Messages to a
 * Destination](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#grant-destinations-permissions-to-s3)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * NotificationConfigurationProperty notificationConfigurationProperty =
 * NotificationConfigurationProperty.builder()
 * .eventBridgeConfiguration(EventBridgeConfigurationProperty.builder()
 * .eventBridgeEnabled(false)
 * .build())
 * .lambdaConfigurations(List.of(LambdaConfigurationProperty.builder()
 * .event("event")
 * .function("function")
 * // the properties below are optional
 * .filter(NotificationFilterProperty.builder()
 * .s3Key(S3KeyFilterProperty.builder()
 * .rules(List.of(FilterRuleProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .build()))
 * .queueConfigurations(List.of(QueueConfigurationProperty.builder()
 * .event("event")
 * .queue("queue")
 * // the properties below are optional
 * .filter(NotificationFilterProperty.builder()
 * .s3Key(S3KeyFilterProperty.builder()
 * .rules(List.of(FilterRuleProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .build()))
 * .topicConfigurations(List.of(TopicConfigurationProperty.builder()
 * .event("event")
 * .topic("topic")
 * // the properties below are optional
 * .filter(NotificationFilterProperty.builder()
 * .s3Key(S3KeyFilterProperty.builder()
 * .rules(List.of(FilterRuleProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketNotificationConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.NotificationConfigurationProperty.Builder =
      CfnBucket.NotificationConfigurationProperty.builder()

  private val _lambdaConfigurations: MutableList<Any> = mutableListOf()

  private val _queueConfigurations: MutableList<Any> = mutableListOf()

  private val _topicConfigurations: MutableList<Any> = mutableListOf()

  /**
   * @param eventBridgeConfiguration Enables delivery of events to Amazon EventBridge.
   */
  public fun eventBridgeConfiguration(eventBridgeConfiguration: IResolvable) {
    cdkBuilder.eventBridgeConfiguration(eventBridgeConfiguration)
  }

  /**
   * @param eventBridgeConfiguration Enables delivery of events to Amazon EventBridge.
   */
  public
      fun eventBridgeConfiguration(eventBridgeConfiguration: CfnBucket.EventBridgeConfigurationProperty) {
    cdkBuilder.eventBridgeConfiguration(eventBridgeConfiguration)
  }

  /**
   * @param lambdaConfigurations Describes the AWS Lambda functions to invoke and the events for
   * which to invoke them.
   */
  public fun lambdaConfigurations(vararg lambdaConfigurations: Any) {
    _lambdaConfigurations.addAll(listOf(*lambdaConfigurations))
  }

  /**
   * @param lambdaConfigurations Describes the AWS Lambda functions to invoke and the events for
   * which to invoke them.
   */
  public fun lambdaConfigurations(lambdaConfigurations: Collection<Any>) {
    _lambdaConfigurations.addAll(lambdaConfigurations)
  }

  /**
   * @param lambdaConfigurations Describes the AWS Lambda functions to invoke and the events for
   * which to invoke them.
   */
  public fun lambdaConfigurations(lambdaConfigurations: IResolvable) {
    cdkBuilder.lambdaConfigurations(lambdaConfigurations)
  }

  /**
   * @param queueConfigurations The Amazon Simple Queue Service queues to publish messages to and
   * the events for which to publish messages.
   */
  public fun queueConfigurations(vararg queueConfigurations: Any) {
    _queueConfigurations.addAll(listOf(*queueConfigurations))
  }

  /**
   * @param queueConfigurations The Amazon Simple Queue Service queues to publish messages to and
   * the events for which to publish messages.
   */
  public fun queueConfigurations(queueConfigurations: Collection<Any>) {
    _queueConfigurations.addAll(queueConfigurations)
  }

  /**
   * @param queueConfigurations The Amazon Simple Queue Service queues to publish messages to and
   * the events for which to publish messages.
   */
  public fun queueConfigurations(queueConfigurations: IResolvable) {
    cdkBuilder.queueConfigurations(queueConfigurations)
  }

  /**
   * @param topicConfigurations The topic to which notifications are sent and the events for which
   * notifications are generated.
   */
  public fun topicConfigurations(vararg topicConfigurations: Any) {
    _topicConfigurations.addAll(listOf(*topicConfigurations))
  }

  /**
   * @param topicConfigurations The topic to which notifications are sent and the events for which
   * notifications are generated.
   */
  public fun topicConfigurations(topicConfigurations: Collection<Any>) {
    _topicConfigurations.addAll(topicConfigurations)
  }

  /**
   * @param topicConfigurations The topic to which notifications are sent and the events for which
   * notifications are generated.
   */
  public fun topicConfigurations(topicConfigurations: IResolvable) {
    cdkBuilder.topicConfigurations(topicConfigurations)
  }

  public fun build(): CfnBucket.NotificationConfigurationProperty {
    if(_lambdaConfigurations.isNotEmpty()) cdkBuilder.lambdaConfigurations(_lambdaConfigurations)
    if(_queueConfigurations.isNotEmpty()) cdkBuilder.queueConfigurations(_queueConfigurations)
    if(_topicConfigurations.isNotEmpty()) cdkBuilder.topicConfigurations(_topicConfigurations)
    return cdkBuilder.build()
  }
}
