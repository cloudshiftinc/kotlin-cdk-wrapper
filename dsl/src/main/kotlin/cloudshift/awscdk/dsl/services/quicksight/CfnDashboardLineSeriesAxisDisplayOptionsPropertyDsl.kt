@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardLineSeriesAxisDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.LineSeriesAxisDisplayOptionsProperty.Builder =
      CfnDashboard.LineSeriesAxisDisplayOptionsProperty.builder()

  private val _missingDataConfigurations: MutableList<Any> = mutableListOf()

  /**
   * @param axisOptions The options that determine the presentation of the line series axis.
   */
  public fun axisOptions(axisOptions: IResolvable) {
    cdkBuilder.axisOptions(axisOptions)
  }

  /**
   * @param axisOptions The options that determine the presentation of the line series axis.
   */
  public fun axisOptions(axisOptions: CfnDashboard.AxisDisplayOptionsProperty) {
    cdkBuilder.axisOptions(axisOptions)
  }

  /**
   * @param missingDataConfigurations The configuration options that determine how missing data is
   * treated during the rendering of a line chart.
   */
  public fun missingDataConfigurations(vararg missingDataConfigurations: Any) {
    _missingDataConfigurations.addAll(listOf(*missingDataConfigurations))
  }

  /**
   * @param missingDataConfigurations The configuration options that determine how missing data is
   * treated during the rendering of a line chart.
   */
  public fun missingDataConfigurations(missingDataConfigurations: Collection<Any>) {
    _missingDataConfigurations.addAll(missingDataConfigurations)
  }

  /**
   * @param missingDataConfigurations The configuration options that determine how missing data is
   * treated during the rendering of a line chart.
   */
  public fun missingDataConfigurations(missingDataConfigurations: IResolvable) {
    cdkBuilder.missingDataConfigurations(missingDataConfigurations)
  }

  public fun build(): CfnDashboard.LineSeriesAxisDisplayOptionsProperty {
    if(_missingDataConfigurations.isNotEmpty())
        cdkBuilder.missingDataConfigurations(_missingDataConfigurations)
    return cdkBuilder.build()
  }
}
