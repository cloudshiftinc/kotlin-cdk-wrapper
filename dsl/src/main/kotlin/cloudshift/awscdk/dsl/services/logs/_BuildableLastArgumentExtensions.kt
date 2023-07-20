@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.amazon.awscdk.services.logs.CrossAccountDestination
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.LogGroup
import software.amazon.awscdk.services.logs.LogStream
import software.amazon.awscdk.services.logs.MetricFilter
import software.amazon.awscdk.services.logs.SubscriptionFilter
import kotlin.String
import kotlin.Unit

public inline fun LogGroup.addMetricFilter(
    id: String,
    block: MetricFilterOptionsDsl.() -> Unit =
        {},
): MetricFilter {
    val builder = MetricFilterOptionsDsl()
    builder.apply(block)
    return addMetricFilter(id, builder.build())
}

public inline fun LogGroup.addStream(id: String, block: StreamOptionsDsl.() -> Unit = {}): LogStream {
    val builder = StreamOptionsDsl()
    builder.apply(block)
    return addStream(id, builder.build())
}

public inline fun LogGroup.addSubscriptionFilter(
    id: String,
    block: SubscriptionFilterOptionsDsl.() -> Unit = {},
): SubscriptionFilter {
    val builder = SubscriptionFilterOptionsDsl()
    builder.apply(block)
    return addSubscriptionFilter(id, builder.build())
}

public inline fun LogGroup.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}

public inline fun CrossAccountDestination.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPolicy(builder.build())
}

public inline fun MetricFilter.metric(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(builder.build())
}

public inline fun ILogGroup.addMetricFilter(
    arg0: String,
    block: MetricFilterOptionsDsl.() -> Unit =
        {},
): MetricFilter {
    val builder = MetricFilterOptionsDsl()
    builder.apply(block)
    return addMetricFilter(arg0, builder.build())
}

public inline fun ILogGroup.addStream(arg0: String, block: StreamOptionsDsl.() -> Unit = {}): LogStream {
    val builder = StreamOptionsDsl()
    builder.apply(block)
    return addStream(arg0, builder.build())
}

public inline fun ILogGroup.addSubscriptionFilter(
    arg0: String,
    block: SubscriptionFilterOptionsDsl.() -> Unit = {},
): SubscriptionFilter {
    val builder = SubscriptionFilterOptionsDsl()
    builder.apply(block)
    return addSubscriptionFilter(arg0, builder.build())
}
