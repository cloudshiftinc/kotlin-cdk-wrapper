@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.sns.TopicBase

/**
 * Adds a statement to the IAM resource policy associated with this topic.
 *
 * If this topic was created in this stack (`new Topic`), a topic policy
 * will be automatically created upon the first call to `addToPolicy`. If
 * the topic is imported (`Topic.import`), then this is a no-op.
 *
 * @param statement 
 */
public inline fun ITopic.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

/**
 * Return the given named metric for this Topic.
 *
 * @param metricName 
 * @param props
 */
public inline fun ITopic.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0, builder.build())
}

/**
 * The number of messages published to your Amazon SNS topics.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun ITopic.metricNumberOfMessagesPublished(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfMessagesPublished(builder.build())
}

/**
 * The number of messages successfully delivered from your Amazon SNS topics to subscribing
 * endpoints.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun ITopic.metricNumberOfNotificationsDelivered(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsDelivered(builder.build())
}

/**
 * The number of messages that Amazon SNS failed to deliver.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun ITopic.metricNumberOfNotificationsFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFailed(builder.build())
}

/**
 * The number of messages that were rejected by subscription filter policies.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun ITopic.metricNumberOfNotificationsFilteredOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFilteredOut(builder.build())
}

/**
 * The number of messages that were rejected by subscription filter policies because the messages'
 * attributes are invalid.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline
    fun ITopic.metricNumberOfNotificationsFilteredOutInvalidAttributes(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFilteredOutInvalidAttributes(builder.build())
}

/**
 * The number of messages that were rejected by subscription filter policies because the messages
 * have no attributes.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline
    fun ITopic.metricNumberOfNotificationsFilteredOutNoMessageAttributes(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFilteredOutNoMessageAttributes(builder.build())
}

/**
 * Metric for the size of messages published through this topic.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun ITopic.metricPublishSize(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPublishSize(builder.build())
}

/**
 * The charges you have accrued since the start of the current calendar month for sending SMS
 * messages.
 *
 * Maximum over 5 minutes
 *
 * @param props
 */
public inline fun ITopic.metricSMSMonthToDateSpentUSD(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSMSMonthToDateSpentUSD(builder.build())
}

/**
 * The rate of successful SMS message deliveries.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun ITopic.metricSMSSuccessRate(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSMSSuccessRate(builder.build())
}

/**
 * Adds a statement to the IAM resource policy associated with this topic.
 *
 * If this topic was created in this stack (`new Topic`), a topic policy
 * will be automatically created upon the first call to `addToPolicy`. If
 * the topic is imported (`Topic.import`), then this is a no-op.
 *
 * @param statement 
 */
public inline fun TopicBase.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

/**
 * Return the given named metric for this Topic.
 *
 * @param metricName 
 * @param props
 */
public inline fun TopicBase.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

/**
 * The number of messages published to your Amazon SNS topics.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun TopicBase.metricNumberOfMessagesPublished(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfMessagesPublished(builder.build())
}

/**
 * The number of messages successfully delivered from your Amazon SNS topics to subscribing
 * endpoints.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun TopicBase.metricNumberOfNotificationsDelivered(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsDelivered(builder.build())
}

/**
 * The number of messages that Amazon SNS failed to deliver.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun TopicBase.metricNumberOfNotificationsFailed(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFailed(builder.build())
}

/**
 * The number of messages that were rejected by subscription filter policies.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline
    fun TopicBase.metricNumberOfNotificationsFilteredOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFilteredOut(builder.build())
}

/**
 * The number of messages that were rejected by subscription filter policies because the messages'
 * attributes are invalid.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline
    fun TopicBase.metricNumberOfNotificationsFilteredOutInvalidAttributes(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFilteredOutInvalidAttributes(builder.build())
}

/**
 * The number of messages that were rejected by subscription filter policies because the messages
 * have no attributes.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline
    fun TopicBase.metricNumberOfNotificationsFilteredOutNoMessageAttributes(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFilteredOutNoMessageAttributes(builder.build())
}

/**
 * Metric for the size of messages published through this topic.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun TopicBase.metricPublishSize(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPublishSize(builder.build())
}

/**
 * The charges you have accrued since the start of the current calendar month for sending SMS
 * messages.
 *
 * Maximum over 5 minutes
 *
 * @param props
 */
public inline fun TopicBase.metricSMSMonthToDateSpentUSD(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSMSMonthToDateSpentUSD(builder.build())
}

/**
 * The rate of successful SMS message deliveries.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun TopicBase.metricSMSSuccessRate(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSMSSuccessRate(builder.build())
}
