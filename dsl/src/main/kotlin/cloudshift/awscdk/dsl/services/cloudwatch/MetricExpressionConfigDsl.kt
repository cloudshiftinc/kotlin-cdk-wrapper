@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig

@CdkDslMarker
public class MetricExpressionConfigDsl {
  private val cdkBuilder: MetricExpressionConfig.Builder = MetricExpressionConfig.builder()

  /**
   * @param expression Math expression for the metric. 
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  /**
   * @param period How many seconds to aggregate over. 
   */
  public fun period(period: Number) {
    cdkBuilder.period(period)
  }

  /**
   * @param searchAccount Account to evaluate search expressions within.
   */
  public fun searchAccount(searchAccount: String) {
    cdkBuilder.searchAccount(searchAccount)
  }

  /**
   * @param searchRegion Region to evaluate search expressions within.
   */
  public fun searchRegion(searchRegion: String) {
    cdkBuilder.searchRegion(searchRegion)
  }

  /**
   * @param usingMetrics Metrics used in the math expression. 
   */
  public fun usingMetrics(usingMetrics: Map<String, IMetric>) {
    cdkBuilder.usingMetrics(usingMetrics)
  }

  public fun build(): MetricExpressionConfig = cdkBuilder.build()
}
