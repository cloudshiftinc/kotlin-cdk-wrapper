@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Alarm
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
import software.amazon.awscdk.services.cloudwatch.MathExpression
import software.amazon.awscdk.services.cloudwatch.Metric
import software.constructs.Construct

public inline fun Metric.createAlarm(
  scope: Construct,
  id: String,
  block: CreateAlarmOptionsDsl.() -> Unit = {},
): Alarm {
  val builder = CreateAlarmOptionsDsl()
  builder.apply(block)
  return createAlarm(scope, id, builder.build())
}

public inline fun Metric.with(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return with(builder.build())
}

public inline fun MathExpression.createAlarm(
  scope: Construct,
  id: String,
  block: CreateAlarmOptionsDsl.() -> Unit = {},
): Alarm {
  val builder = CreateAlarmOptionsDsl()
  builder.apply(block)
  return createAlarm(scope, id, builder.build())
}

public inline fun MathExpression.with(block: MathExpressionOptionsDsl.() -> Unit = {}):
    MathExpression {
  val builder = MathExpressionOptionsDsl()
  builder.apply(block)
  return with(builder.build())
}

public inline
    fun CfnAnomalyDetector.setConfiguration(block: CfnAnomalyDetectorConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAnomalyDetectorConfigurationPropertyDsl()
  builder.apply(block)
  return setConfiguration(builder.build())
}

public inline
    fun CfnAnomalyDetector.setMetricMathAnomalyDetector(block: CfnAnomalyDetectorMetricMathAnomalyDetectorPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAnomalyDetectorMetricMathAnomalyDetectorPropertyDsl()
  builder.apply(block)
  return setMetricMathAnomalyDetector(builder.build())
}

public inline
    fun CfnAnomalyDetector.setSingleMetricAnomalyDetector(block: CfnAnomalyDetectorSingleMetricAnomalyDetectorPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAnomalyDetectorSingleMetricAnomalyDetectorPropertyDsl()
  builder.apply(block)
  return setSingleMetricAnomalyDetector(builder.build())
}
