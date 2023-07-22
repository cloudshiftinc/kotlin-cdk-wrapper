@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPercentileAggregationPropertyDsl {
  private val cdkBuilder: CfnDashboard.PercentileAggregationProperty.Builder =
      CfnDashboard.PercentileAggregationProperty.builder()

  /**
   * @param percentileValue The percentile value.
   * This value can be any numeric constant 0–100. A percentile value of 50 computes the median
   * value of the measure.
   */
  public fun percentileValue(percentileValue: Number) {
    cdkBuilder.percentileValue(percentileValue)
  }

  public fun build(): CfnDashboard.PercentileAggregationProperty = cdkBuilder.build()
}
