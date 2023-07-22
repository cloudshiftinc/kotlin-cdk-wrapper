@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The options that determine the negative value configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NegativeValueConfigurationProperty negativeValueConfigurationProperty =
 * NegativeValueConfigurationProperty.builder()
 * .displayMode("displayMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-negativevalueconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardNegativeValueConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.NegativeValueConfigurationProperty.Builder =
      CfnDashboard.NegativeValueConfigurationProperty.builder()

  /**
   * @param displayMode Determines the display mode of the negative value configuration. 
   */
  public fun displayMode(displayMode: String) {
    cdkBuilder.displayMode(displayMode)
  }

  public fun build(): CfnDashboard.NegativeValueConfigurationProperty = cdkBuilder.build()
}
