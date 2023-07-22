@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

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
