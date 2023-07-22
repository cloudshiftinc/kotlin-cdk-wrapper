@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateLineSeriesAxisDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.LineSeriesAxisDisplayOptionsProperty.Builder =
      CfnTemplate.LineSeriesAxisDisplayOptionsProperty.builder()

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
  public fun axisOptions(axisOptions: CfnTemplate.AxisDisplayOptionsProperty) {
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

  public fun build(): CfnTemplate.LineSeriesAxisDisplayOptionsProperty {
    if(_missingDataConfigurations.isNotEmpty())
        cdkBuilder.missingDataConfigurations(_missingDataConfigurations)
    return cdkBuilder.build()
  }
}
