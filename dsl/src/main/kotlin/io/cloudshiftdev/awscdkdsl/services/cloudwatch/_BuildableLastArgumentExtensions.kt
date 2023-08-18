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

package io.cloudshiftdev.awscdkdsl.services.cloudwatch

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Alarm
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
import software.amazon.awscdk.services.cloudwatch.MathExpression
import software.amazon.awscdk.services.cloudwatch.Metric
import software.constructs.Construct

/**
 * Specifies details about how the anomaly detection model is to be trained, including time ranges
 * to exclude when training and updating the model.
 */
public inline fun CfnAnomalyDetector.setConfiguration(
    block: CfnAnomalyDetectorConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAnomalyDetectorConfigurationPropertyDsl()
    builder.apply(block)
    return setConfiguration(builder.build())
}

/** The CloudWatch metric math expression for this anomaly detector. */
public inline fun CfnAnomalyDetector.setMetricMathAnomalyDetector(
    block: CfnAnomalyDetectorMetricMathAnomalyDetectorPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAnomalyDetectorMetricMathAnomalyDetectorPropertyDsl()
    builder.apply(block)
    return setMetricMathAnomalyDetector(builder.build())
}

/** The CloudWatch metric and statistic for this anomaly detector. */
public inline fun CfnAnomalyDetector.setSingleMetricAnomalyDetector(
    block: CfnAnomalyDetectorSingleMetricAnomalyDetectorPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAnomalyDetectorSingleMetricAnomalyDetectorPropertyDsl()
    builder.apply(block)
    return setSingleMetricAnomalyDetector(builder.build())
}

/**
 * Make a new Alarm for this metric.
 *
 * Combines both properties that may adjust the metric (aggregation) as well as alarm properties.
 *
 * @param scope
 * @param id
 * @param props
 */
public inline fun MathExpression.createAlarm(
    scope: Construct,
    id: String,
    block: CreateAlarmOptionsDsl.() -> Unit = {},
): Alarm {
    val builder = CreateAlarmOptionsDsl()
    builder.apply(block)
    return createAlarm(scope, id, builder.build())
}

/**
 * Return a copy of Metric with properties changed.
 *
 * All properties except namespace and metricName can be changed.
 *
 * @param props The set of properties to change.
 */
public inline fun MathExpression.with(
    block: MathExpressionOptionsDsl.() -> Unit = {}
): MathExpression {
    val builder = MathExpressionOptionsDsl()
    builder.apply(block)
    return with(builder.build())
}

/**
 * Make a new Alarm for this metric.
 *
 * Combines both properties that may adjust the metric (aggregation) as well as alarm properties.
 *
 * @param scope
 * @param id
 * @param props
 */
public inline fun Metric.createAlarm(
    scope: Construct,
    id: String,
    block: CreateAlarmOptionsDsl.() -> Unit = {},
): Alarm {
    val builder = CreateAlarmOptionsDsl()
    builder.apply(block)
    return createAlarm(scope, id, builder.build())
}

/**
 * Return a copy of Metric `with` properties changed.
 *
 * All properties except namespace and metricName can be changed.
 *
 * @param props The set of properties to change.
 */
public inline fun Metric.with(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return with(builder.build())
}
