@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardMetricComparisonComputationPropertyDsl {
  private val cdkBuilder: CfnDashboard.MetricComparisonComputationProperty.Builder =
      CfnDashboard.MetricComparisonComputationProperty.builder()

  public fun computationId(computationId: String) {
    cdkBuilder.computationId(computationId)
  }

  public fun fromValue(fromValue: IResolvable) {
    cdkBuilder.fromValue(fromValue)
  }

  public fun fromValue(fromValue: CfnDashboard.MeasureFieldProperty) {
    cdkBuilder.fromValue(fromValue)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun targetValue(targetValue: IResolvable) {
    cdkBuilder.targetValue(targetValue)
  }

  public fun targetValue(targetValue: CfnDashboard.MeasureFieldProperty) {
    cdkBuilder.targetValue(targetValue)
  }

  public fun time(time: IResolvable) {
    cdkBuilder.time(time)
  }

  public fun time(time: CfnDashboard.DimensionFieldProperty) {
    cdkBuilder.time(time)
  }

  public fun build(): CfnDashboard.MetricComparisonComputationProperty = cdkBuilder.build()
}
