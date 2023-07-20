@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sqs

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.amazon.awscdk.services.sqs.IQueue
import software.amazon.awscdk.services.sqs.QueueBase

public inline fun IQueue.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

public inline fun IQueue.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0, builder.build())
}

public inline fun IQueue.metricApproximateAgeOfOldestMessage(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricApproximateAgeOfOldestMessage(builder.build())
}

public inline fun IQueue.metricApproximateNumberOfMessagesDelayed(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricApproximateNumberOfMessagesDelayed(builder.build())
}

public inline
    fun IQueue.metricApproximateNumberOfMessagesNotVisible(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricApproximateNumberOfMessagesNotVisible(builder.build())
}

public inline fun IQueue.metricApproximateNumberOfMessagesVisible(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricApproximateNumberOfMessagesVisible(builder.build())
}

public inline fun IQueue.metricNumberOfEmptyReceives(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfEmptyReceives(builder.build())
}

public inline fun IQueue.metricNumberOfMessagesDeleted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfMessagesDeleted(builder.build())
}

public inline fun IQueue.metricNumberOfMessagesReceived(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfMessagesReceived(builder.build())
}

public inline fun IQueue.metricNumberOfMessagesSent(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfMessagesSent(builder.build())
}

public inline fun IQueue.metricSentMessageSize(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSentMessageSize(builder.build())
}

public inline fun QueueBase.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

public inline fun QueueBase.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

public inline fun QueueBase.metricApproximateAgeOfOldestMessage(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricApproximateAgeOfOldestMessage(builder.build())
}

public inline
    fun QueueBase.metricApproximateNumberOfMessagesDelayed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricApproximateNumberOfMessagesDelayed(builder.build())
}

public inline
    fun QueueBase.metricApproximateNumberOfMessagesNotVisible(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricApproximateNumberOfMessagesNotVisible(builder.build())
}

public inline
    fun QueueBase.metricApproximateNumberOfMessagesVisible(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricApproximateNumberOfMessagesVisible(builder.build())
}

public inline fun QueueBase.metricNumberOfEmptyReceives(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfEmptyReceives(builder.build())
}

public inline fun QueueBase.metricNumberOfMessagesDeleted(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfMessagesDeleted(builder.build())
}

public inline fun QueueBase.metricNumberOfMessagesReceived(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfMessagesReceived(builder.build())
}

public inline fun QueueBase.metricNumberOfMessagesSent(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNumberOfMessagesSent(builder.build())
}

public inline fun QueueBase.metricSentMessageSize(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSentMessageSize(builder.build())
}
