@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSheetElementConfigurationOverridesPropertyDsl {
  private val cdkBuilder: CfnDashboard.SheetElementConfigurationOverridesProperty.Builder =
      CfnDashboard.SheetElementConfigurationOverridesProperty.builder()

  /**
   * @param visibility Determines whether or not the overrides are visible. Choose one of the
   * following options:.
   * * `VISIBLE`
   * * `HIDDEN`
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.SheetElementConfigurationOverridesProperty = cdkBuilder.build()
}
