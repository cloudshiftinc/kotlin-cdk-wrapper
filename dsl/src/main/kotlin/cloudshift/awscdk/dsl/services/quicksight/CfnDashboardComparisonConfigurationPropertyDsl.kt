@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardComparisonConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ComparisonConfigurationProperty.Builder =
      CfnDashboard.ComparisonConfigurationProperty.builder()

  /**
   * @param comparisonFormat The format of the comparison.
   */
  public fun comparisonFormat(comparisonFormat: IResolvable) {
    cdkBuilder.comparisonFormat(comparisonFormat)
  }

  /**
   * @param comparisonFormat The format of the comparison.
   */
  public
      fun comparisonFormat(comparisonFormat: CfnDashboard.ComparisonFormatConfigurationProperty) {
    cdkBuilder.comparisonFormat(comparisonFormat)
  }

  /**
   * @param comparisonMethod The method of the comparison. Choose from the following options:.
   * * `DIFFERENCE`
   * * `PERCENT_DIFFERENCE`
   * * `PERCENT`
   */
  public fun comparisonMethod(comparisonMethod: String) {
    cdkBuilder.comparisonMethod(comparisonMethod)
  }

  public fun build(): CfnDashboard.ComparisonConfigurationProperty = cdkBuilder.build()
}
