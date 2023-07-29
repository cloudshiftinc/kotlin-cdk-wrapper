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

package cloudshift.awscdk.dsl.services.chatbot

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.chatbot.ISlackChannelConfiguration
import software.amazon.awscdk.services.chatbot.SlackChannelConfiguration
import software.amazon.awscdk.services.cloudwatch.Metric

/**
 * Adds a statement to the IAM role.
 *
 * @param statement
 */
public inline fun ISlackChannelConfiguration.addToRolePolicy(
    block: PolicyStatementDsl.() -> Unit = {}
) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToRolePolicy(builder.build())
}

/**
 * Return the given named metric for this SlackChannelConfiguration.
 *
 * @param metricName
 * @param props
 */
public inline fun ISlackChannelConfiguration.metric(
    arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(arg0, builder.build())
}

/**
 * Adds extra permission to iam-role of Slack channel configuration.
 *
 * @param statement
 */
public inline fun SlackChannelConfiguration.addToRolePolicy(
    block: PolicyStatementDsl.() -> Unit = {}
) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToRolePolicy(builder.build())
}

/**
 * Return the given named metric for this SlackChannelConfiguration.
 *
 * @param metricName
 * @param props
 */
public inline fun SlackChannelConfiguration.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}
