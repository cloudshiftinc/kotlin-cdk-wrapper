@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPercentileAggregationPropertyDsl {
  private val cdkBuilder: CfnDashboard.PercentileAggregationProperty.Builder =
      CfnDashboard.PercentileAggregationProperty.builder()

  public fun percentileValue(percentileValue: Number) {
    cdkBuilder.percentileValue(percentileValue)
  }

  public fun build(): CfnDashboard.PercentileAggregationProperty = cdkBuilder.build()
}
