@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardGaugeChartOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.GaugeChartOptionsProperty.Builder =
      CfnDashboard.GaugeChartOptionsProperty.builder()

  public fun arc(arc: IResolvable) {
    cdkBuilder.arc(arc)
  }

  public fun arc(arc: CfnDashboard.ArcConfigurationProperty) {
    cdkBuilder.arc(arc)
  }

  public fun arcAxis(arcAxis: IResolvable) {
    cdkBuilder.arcAxis(arcAxis)
  }

  public fun arcAxis(arcAxis: CfnDashboard.ArcAxisConfigurationProperty) {
    cdkBuilder.arcAxis(arcAxis)
  }

  public fun comparison(comparison: IResolvable) {
    cdkBuilder.comparison(comparison)
  }

  public fun comparison(comparison: CfnDashboard.ComparisonConfigurationProperty) {
    cdkBuilder.comparison(comparison)
  }

  public fun primaryValueDisplayType(primaryValueDisplayType: String) {
    cdkBuilder.primaryValueDisplayType(primaryValueDisplayType)
  }

  public fun primaryValueFontConfiguration(primaryValueFontConfiguration: IResolvable) {
    cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
  }

  public
      fun primaryValueFontConfiguration(primaryValueFontConfiguration: CfnDashboard.FontConfigurationProperty) {
    cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
  }

  public fun build(): CfnDashboard.GaugeChartOptionsProperty = cdkBuilder.build()
}
