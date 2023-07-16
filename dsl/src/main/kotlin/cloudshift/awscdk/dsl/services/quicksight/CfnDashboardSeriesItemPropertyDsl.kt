@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSeriesItemPropertyDsl {
  private val cdkBuilder: CfnDashboard.SeriesItemProperty.Builder =
      CfnDashboard.SeriesItemProperty.builder()

  public fun dataFieldSeriesItem(dataFieldSeriesItem: IResolvable) {
    cdkBuilder.dataFieldSeriesItem(dataFieldSeriesItem)
  }

  public fun dataFieldSeriesItem(dataFieldSeriesItem: CfnDashboard.DataFieldSeriesItemProperty) {
    cdkBuilder.dataFieldSeriesItem(dataFieldSeriesItem)
  }

  public fun fieldSeriesItem(fieldSeriesItem: IResolvable) {
    cdkBuilder.fieldSeriesItem(fieldSeriesItem)
  }

  public fun fieldSeriesItem(fieldSeriesItem: CfnDashboard.FieldSeriesItemProperty) {
    cdkBuilder.fieldSeriesItem(fieldSeriesItem)
  }

  public fun build(): CfnDashboard.SeriesItemProperty = cdkBuilder.build()
}
