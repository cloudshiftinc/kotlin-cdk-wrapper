@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.amazon.awscdk.services.logs.CrossAccountDestination
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.LogGroup
import software.amazon.awscdk.services.logs.LogStream
import software.amazon.awscdk.services.logs.MetricFilter
import software.amazon.awscdk.services.logs.SubscriptionFilter

/**
 * Create a new Metric Filter on this Log Group.
 *
 * @param id Unique identifier for the construct in its parent. 
 * @param props Properties for creating the MetricFilter. 
 */
public inline fun LogGroup.addMetricFilter(id: String, block: MetricFilterOptionsDsl.() -> Unit =
    {}): MetricFilter {
  val builder = MetricFilterOptionsDsl()
  builder.apply(block)
  return addMetricFilter(id, builder.build())
}

/**
 * Create a new Log Stream for this Log Group.
 *
 * @param id Unique identifier for the construct in its parent. 
 * @param props Properties for creating the LogStream.
 */
public inline fun LogGroup.addStream(id: String, block: StreamOptionsDsl.() -> Unit = {}):
    LogStream {
  val builder = StreamOptionsDsl()
  builder.apply(block)
  return addStream(id, builder.build())
}

/**
 * Create a new Subscription Filter on this Log Group.
 *
 * @param id Unique identifier for the construct in its parent. 
 * @param props Properties for creating the SubscriptionFilter. 
 */
public inline fun LogGroup.addSubscriptionFilter(id: String,
    block: SubscriptionFilterOptionsDsl.() -> Unit = {}): SubscriptionFilter {
  val builder = SubscriptionFilterOptionsDsl()
  builder.apply(block)
  return addSubscriptionFilter(id, builder.build())
}

/**
 * Adds a statement to the resource policy associated with this log group.
 *
 * A resource policy will be automatically created upon the first call to `addToResourcePolicy`.
 *
 * Any ARN Principals inside of the statement will be converted into AWS Account ID strings
 * because CloudWatch Logs Resource Policies do not accept ARN principals.
 *
 * @param statement The policy statement to add. 
 */
public inline fun LogGroup.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

/**
 * @param statement 
 */
public inline fun CrossAccountDestination.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

/**
 * Return the given named metric for this Metric Filter.
 *
 * Default: avg over 5 minutes
 *
 * @param props
 */
public inline fun MetricFilter.metric(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(builder.build())
}

/**
 * Create a new Metric Filter on this Log Group.
 *
 * @param id Unique identifier for the construct in its parent. 
 * @param props Properties for creating the MetricFilter. 
 */
public inline fun ILogGroup.addMetricFilter(arg0: String, block: MetricFilterOptionsDsl.() -> Unit =
    {}): MetricFilter {
  val builder = MetricFilterOptionsDsl()
  builder.apply(block)
  return addMetricFilter(arg0, builder.build())
}

/**
 * Create a new Log Stream for this Log Group.
 *
 * @param id Unique identifier for the construct in its parent. 
 * @param props Properties for creating the LogStream.
 */
public inline fun ILogGroup.addStream(arg0: String, block: StreamOptionsDsl.() -> Unit = {}):
    LogStream {
  val builder = StreamOptionsDsl()
  builder.apply(block)
  return addStream(arg0, builder.build())
}

/**
 * Create a new Subscription Filter on this Log Group.
 *
 * @param id Unique identifier for the construct in its parent. 
 * @param props Properties for creating the SubscriptionFilter. 
 */
public inline fun ILogGroup.addSubscriptionFilter(arg0: String,
    block: SubscriptionFilterOptionsDsl.() -> Unit = {}): SubscriptionFilter {
  val builder = SubscriptionFilterOptionsDsl()
  builder.apply(block)
  return addSubscriptionFilter(arg0, builder.build())
}
