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

public inline fun ITopic.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

public inline fun ITopic.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0, builder.build())
}

public inline fun ITopic.metricNumberOfMessagesPublished(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfMessagesPublished(builder.build())
}

public inline fun ITopic.metricNumberOfNotificationsDelivered(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsDelivered(builder.build())
}

public inline fun ITopic.metricNumberOfNotificationsFailed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFailed(builder.build())
}

public inline fun ITopic.metricNumberOfNotificationsFilteredOut(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFilteredOut(builder.build())
}

public inline
    fun ITopic.metricNumberOfNotificationsFilteredOutInvalidAttributes(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFilteredOutInvalidAttributes(builder.build())
}

public inline
    fun ITopic.metricNumberOfNotificationsFilteredOutNoMessageAttributes(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFilteredOutNoMessageAttributes(builder.build())
}

public inline fun ITopic.metricPublishSize(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPublishSize(builder.build())
}

public inline fun ITopic.metricSMSMonthToDateSpentUSD(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSMSMonthToDateSpentUSD(builder.build())
}

public inline fun ITopic.metricSMSSuccessRate(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSMSSuccessRate(builder.build())
}

public inline fun TopicBase.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

public inline fun TopicBase.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

public inline fun TopicBase.metricNumberOfMessagesPublished(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfMessagesPublished(builder.build())
}

public inline fun TopicBase.metricNumberOfNotificationsDelivered(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsDelivered(builder.build())
}

public inline fun TopicBase.metricNumberOfNotificationsFailed(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFailed(builder.build())
}

public inline
    fun TopicBase.metricNumberOfNotificationsFilteredOut(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFilteredOut(builder.build())
}

public inline
    fun TopicBase.metricNumberOfNotificationsFilteredOutInvalidAttributes(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFilteredOutInvalidAttributes(builder.build())
}

public inline
    fun TopicBase.metricNumberOfNotificationsFilteredOutNoMessageAttributes(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfNotificationsFilteredOutNoMessageAttributes(builder.build())
}

public inline fun TopicBase.metricPublishSize(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPublishSize(builder.build())
}

public inline fun TopicBase.metricSMSMonthToDateSpentUSD(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSMSMonthToDateSpentUSD(builder.build())
}

public inline fun TopicBase.metricSMSSuccessRate(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSMSSuccessRate(builder.build())
}
