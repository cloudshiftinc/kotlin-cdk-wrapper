@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardArcAxisConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ArcAxisConfigurationProperty.Builder =
      CfnDashboard.ArcAxisConfigurationProperty.builder()

  /**
   * @param range The arc axis range of a `GaugeChartVisual` .
   */
  public fun range(range: IResolvable) {
    cdkBuilder.range(range)
  }

  /**
   * @param range The arc axis range of a `GaugeChartVisual` .
   */
  public fun range(range: CfnDashboard.ArcAxisDisplayRangeProperty) {
    cdkBuilder.range(range)
  }

  /**
   * @param reserveRange The reserved range of the arc axis.
   */
  public fun reserveRange(reserveRange: Number) {
    cdkBuilder.reserveRange(reserveRange)
  }

  public fun build(): CfnDashboard.ArcAxisConfigurationProperty = cdkBuilder.build()
}
