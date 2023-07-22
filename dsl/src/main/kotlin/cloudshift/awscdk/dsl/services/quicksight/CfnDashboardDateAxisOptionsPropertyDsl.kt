@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDateAxisOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.DateAxisOptionsProperty.Builder =
      CfnDashboard.DateAxisOptionsProperty.builder()

  /**
   * @param missingDateVisibility Determines whether or not missing dates are displayed.
   */
  public fun missingDateVisibility(missingDateVisibility: String) {
    cdkBuilder.missingDateVisibility(missingDateVisibility)
  }

  public fun build(): CfnDashboard.DateAxisOptionsProperty = cdkBuilder.build()
}
