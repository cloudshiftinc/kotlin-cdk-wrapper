@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The option that determines the decimal places configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DecimalPlacesConfigurationProperty decimalPlacesConfigurationProperty =
 * DecimalPlacesConfigurationProperty.builder()
 * .decimalPlaces(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-decimalplacesconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardDecimalPlacesConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.DecimalPlacesConfigurationProperty.Builder =
      CfnDashboard.DecimalPlacesConfigurationProperty.builder()

  /**
   * @param decimalPlaces The values of the decimal places. 
   */
  public fun decimalPlaces(decimalPlaces: Number) {
    cdkBuilder.decimalPlaces(decimalPlaces)
  }

  public fun build(): CfnDashboard.DecimalPlacesConfigurationProperty = cdkBuilder.build()
}
