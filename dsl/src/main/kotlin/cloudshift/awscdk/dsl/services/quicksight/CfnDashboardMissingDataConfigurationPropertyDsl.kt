@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardMissingDataConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.MissingDataConfigurationProperty.Builder =
      CfnDashboard.MissingDataConfigurationProperty.builder()

  /**
   * @param treatmentOption The treatment option that determines how missing data should be
   * rendered. Choose from the following options:.
   * * `INTERPOLATE` : Interpolate missing values between the prior and the next known value.
   * * `SHOW_AS_ZERO` : Show missing values as the value `0` .
   * * `SHOW_AS_BLANK` : Display a blank space when rendering missing data.
   */
  public fun treatmentOption(treatmentOption: String) {
    cdkBuilder.treatmentOption(treatmentOption)
  }

  public fun build(): CfnDashboard.MissingDataConfigurationProperty = cdkBuilder.build()
}
