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

package io.cloudshiftdev.awscdkdsl.services.cloudfront.experimental

import io.cloudshiftdev.awscdkdsl.services.cloudwatch.MetricOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyStatementDsl
import io.cloudshiftdev.awscdkdsl.services.lambda.AliasOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.lambda.EventInvokeConfigOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.lambda.EventSourceMappingOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.lambda.FunctionUrlOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.lambda.PermissionDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.lambda.Alias
import software.amazon.awscdk.services.lambda.EventSourceMapping
import software.amazon.awscdk.services.lambda.FunctionUrl

/**
 * Defines an alias for this version.
 *
 * @param aliasName
 * @param options
 */
public inline fun EdgeFunction.addAlias(
    aliasName: String,
    block: AliasOptionsDsl.() -> Unit = {}
): Alias {
    val builder = AliasOptionsDsl()
    builder.apply(block)
    return addAlias(aliasName, builder.build())
}

/**
 * Adds an event source that maps to this AWS Lambda function.
 *
 * @param id
 * @param options
 */
public inline fun EdgeFunction.addEventSourceMapping(
    id: String,
    block: EventSourceMappingOptionsDsl.() -> Unit = {}
): EventSourceMapping {
    val builder = EventSourceMappingOptionsDsl()
    builder.apply(block)
    return addEventSourceMapping(id, builder.build())
}

/**
 * Adds a url to this lambda function.
 *
 * @param options
 */
public inline fun EdgeFunction.addFunctionUrl(
    block: FunctionUrlOptionsDsl.() -> Unit = {}
): FunctionUrl {
    val builder = FunctionUrlOptionsDsl()
    builder.apply(block)
    return addFunctionUrl(builder.build())
}

/**
 * Adds a permission to the Lambda resource policy.
 *
 * @param id
 * @param permission
 */
public inline fun EdgeFunction.addPermission(id: String, block: PermissionDsl.() -> Unit = {}) {
    val builder = PermissionDsl()
    builder.apply(block)
    return addPermission(id, builder.build())
}

/**
 * Adds a statement to the IAM role assumed by the instance.
 *
 * @param statement
 */
public inline fun EdgeFunction.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToRolePolicy(builder.build())
}

/**
 * Configures options for asynchronous invocation.
 *
 * @param options
 */
public inline fun EdgeFunction.configureAsyncInvoke(
    block: EventInvokeConfigOptionsDsl.() -> Unit = {}
) {
    val builder = EventInvokeConfigOptionsDsl()
    builder.apply(block)
    return configureAsyncInvoke(builder.build())
}

/**
 * Return the given named metric for this Lambda Return the given named metric for this Function.
 *
 * @param metricName
 * @param props
 */
public inline fun EdgeFunction.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * Metric for the Duration of this Lambda How long execution of this Lambda takes.
 *
 * Average over 5 minutes
 *
 * @param props
 */
public inline fun EdgeFunction.metricDuration(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricDuration(builder.build())
}

/**
 * How many invocations of this Lambda fail.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun EdgeFunction.metricErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricErrors(builder.build())
}

/**
 * Metric for the number of invocations of this Lambda How often this Lambda is invoked.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun EdgeFunction.metricInvocations(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricInvocations(builder.build())
}

/**
 * Metric for the number of throttled invocations of this Lambda How often this Lambda is throttled.
 *
 * Sum over 5 minutes
 *
 * @param props
 */
public inline fun EdgeFunction.metricThrottles(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricThrottles(builder.build())
}
