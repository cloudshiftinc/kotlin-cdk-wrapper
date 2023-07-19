@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.cloudwatch.MetricConfig
import software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig
import software.amazon.awscdk.services.cloudwatch.MetricStatConfig

@CdkDslMarker
public class MetricConfigDsl {
  private val cdkBuilder: MetricConfig.Builder = MetricConfig.builder()

  public fun mathExpression(block: MetricExpressionConfigDsl.() -> Unit = {}) {
    val builder = MetricExpressionConfigDsl()
    builder.apply(block)
    cdkBuilder.mathExpression(builder.build())
  }

  public fun mathExpression(mathExpression: MetricExpressionConfig) {
    cdkBuilder.mathExpression(mathExpression)
  }

  public fun metricStat(block: MetricStatConfigDsl.() -> Unit = {}) {
    val builder = MetricStatConfigDsl()
    builder.apply(block)
    cdkBuilder.metricStat(builder.build())
  }

  public fun metricStat(metricStat: MetricStatConfig) {
    cdkBuilder.metricStat(metricStat)
  }

  public fun renderingProperties(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.renderingProperties(builder.map)
  }

  public fun renderingProperties(renderingProperties: Map<String, Any>) {
    cdkBuilder.renderingProperties(renderingProperties)
  }

  public fun build(): MetricConfig = cdkBuilder.build()
}
