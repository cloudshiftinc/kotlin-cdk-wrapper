@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSeriesItemPropertyDsl {
  private val cdkBuilder: CfnDashboard.SeriesItemProperty.Builder =
      CfnDashboard.SeriesItemProperty.builder()

  /**
   * @param dataFieldSeriesItem The data field series item configuration of a line chart.
   */
  public fun dataFieldSeriesItem(dataFieldSeriesItem: IResolvable) {
    cdkBuilder.dataFieldSeriesItem(dataFieldSeriesItem)
  }

  /**
   * @param dataFieldSeriesItem The data field series item configuration of a line chart.
   */
  public fun dataFieldSeriesItem(dataFieldSeriesItem: CfnDashboard.DataFieldSeriesItemProperty) {
    cdkBuilder.dataFieldSeriesItem(dataFieldSeriesItem)
  }

  /**
   * @param fieldSeriesItem The field series item configuration of a line chart.
   */
  public fun fieldSeriesItem(fieldSeriesItem: IResolvable) {
    cdkBuilder.fieldSeriesItem(fieldSeriesItem)
  }

  /**
   * @param fieldSeriesItem The field series item configuration of a line chart.
   */
  public fun fieldSeriesItem(fieldSeriesItem: CfnDashboard.FieldSeriesItemProperty) {
    cdkBuilder.fieldSeriesItem(fieldSeriesItem)
  }

  public fun build(): CfnDashboard.SeriesItemProperty = cdkBuilder.build()
}
