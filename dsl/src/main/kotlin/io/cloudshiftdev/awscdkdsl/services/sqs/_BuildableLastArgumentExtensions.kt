@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.sqs

import io.cloudshiftdev.awscdkdsl.services.cloudwatch.MetricOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.amazon.awscdk.services.sqs.IQueue
import software.amazon.awscdk.services.sqs.QueueBase

/**
 * Adds a statement to the IAM resource policy associated with this queue.
 *
 * If this queue was created in this stack (`new Queue`), a queue policy will be automatically
 * created upon the first call to `addToPolicy`. If the queue is imported (`Queue.import`), then
 * this is a no-op.
 *
 * @param statement
 */
public inline fun IQueue.addToResourcePolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}

/**
 * Return the given named metric for this Queue.
 *
 * @param metricName
 * @param props
 */
public inline fun IQueue.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(arg0, builder.build())
}

/**
 * The approximate age of the oldest non-deleted message in the queue.
 *
 * Maximum over 5 minutes
 *
 * @param props
 */
public inline fun IQueue.metricApproximateAgeOfOldestMessage(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricApproximateAgeOfOldestMessage(builder.build())
}

/**
 * The number of messages in the queue that are delayed and not available for reading immediately.
 *
 * Maximum over 5 minutes
 *
 * @param props
 */
public inline fun IQueue.metricApproximateNumberOfMessagesDelayed(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricApproximateNumberOfMessagesDelayed(builder.build())
}

/**
 * The number of messages that are in flight.
 *
 * Maximum over 5 minutes
 *
 * @param props
 */
public inline fun IQueue.metricApproximateNumberOfMessagesNotVisible(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricApproximateNumberOfMessagesNotVisible(builder.build())
}

/**
 * The number of messages available for retrieval from the queue.
 *
 * Maximum over 5 minutes
 *
 * @param props
 */
public inline fun IQueue.metricApproximateNumberOfMessagesVisible(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricApproximateNumberOfMessagesVisible(builder.build())
}

/**
 * The number of ReceiveMessage API calls that did not return a message.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun IQueue.metricNumberOfEmptyReceives(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNumberOfEmptyReceives(builder.build())
}

/**
 * The number of messages deleted from the queue.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun IQueue.metricNumberOfMessagesDeleted(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNumberOfMessagesDeleted(builder.build())
}

/**
 * The number of messages returned by calls to the ReceiveMessage action.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun IQueue.metricNumberOfMessagesReceived(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNumberOfMessagesReceived(builder.build())
}

/**
 * The number of messages added to a queue.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun IQueue.metricNumberOfMessagesSent(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNumberOfMessagesSent(builder.build())
}

/**
 * The size of messages added to a queue.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun IQueue.metricSentMessageSize(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSentMessageSize(builder.build())
}

/**
 * Adds a statement to the IAM resource policy associated with this queue.
 *
 * If this queue was created in this stack (`new Queue`), a queue policy will be automatically
 * created upon the first call to `addToPolicy`. If the queue is imported (`Queue.import`), then
 * this is a no-op.
 *
 * @param statement
 */
public inline fun QueueBase.addToResourcePolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}

/**
 * Return the given named metric for this Queue.
 *
 * @param metricName
 * @param props
 */
public inline fun QueueBase.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * The approximate age of the oldest non-deleted message in the queue.
 *
 * Maximum over 5 minutes
 *
 * @param props
 */
public inline fun QueueBase.metricApproximateAgeOfOldestMessage(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricApproximateAgeOfOldestMessage(builder.build())
}

/**
 * The number of messages in the queue that are delayed and not available for reading immediately.
 *
 * Maximum over 5 minutes
 *
 * @param props
 */
public inline fun QueueBase.metricApproximateNumberOfMessagesDelayed(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricApproximateNumberOfMessagesDelayed(builder.build())
}

/**
 * The number of messages that are in flight.
 *
 * Maximum over 5 minutes
 *
 * @param props
 */
public inline fun QueueBase.metricApproximateNumberOfMessagesNotVisible(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricApproximateNumberOfMessagesNotVisible(builder.build())
}

/**
 * The number of messages available for retrieval from the queue.
 *
 * Maximum over 5 minutes
 *
 * @param props
 */
public inline fun QueueBase.metricApproximateNumberOfMessagesVisible(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricApproximateNumberOfMessagesVisible(builder.build())
}

/**
 * The number of ReceiveMessage API calls that did not return a message.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun QueueBase.metricNumberOfEmptyReceives(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNumberOfEmptyReceives(builder.build())
}

/**
 * The number of messages deleted from the queue.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun QueueBase.metricNumberOfMessagesDeleted(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNumberOfMessagesDeleted(builder.build())
}

/**
 * The number of messages returned by calls to the ReceiveMessage action.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun QueueBase.metricNumberOfMessagesReceived(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNumberOfMessagesReceived(builder.build())
}

/**
 * The number of messages added to a queue.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun QueueBase.metricNumberOfMessagesSent(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricNumberOfMessagesSent(builder.build())
}

/**
 * The size of messages added to a queue.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun QueueBase.metricSentMessageSize(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSentMessageSize(builder.build())
}
