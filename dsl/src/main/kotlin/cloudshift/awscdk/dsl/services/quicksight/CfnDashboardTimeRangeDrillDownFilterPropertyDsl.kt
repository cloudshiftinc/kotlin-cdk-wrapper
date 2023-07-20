@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTimeRangeDrillDownFilterPropertyDsl {
  private val cdkBuilder: CfnDashboard.TimeRangeDrillDownFilterProperty.Builder =
      CfnDashboard.TimeRangeDrillDownFilterProperty.builder()

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  public fun rangeMaximum(rangeMaximum: String) {
    cdkBuilder.rangeMaximum(rangeMaximum)
  }

  public fun rangeMinimum(rangeMinimum: String) {
    cdkBuilder.rangeMinimum(rangeMinimum)
  }

  public fun timeGranularity(timeGranularity: String) {
    cdkBuilder.timeGranularity(timeGranularity)
  }

  public fun build(): CfnDashboard.TimeRangeDrillDownFilterProperty = cdkBuilder.build()
}
