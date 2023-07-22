@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardListControlSelectAllOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.ListControlSelectAllOptionsProperty.Builder =
      CfnDashboard.ListControlSelectAllOptionsProperty.builder()

  /**
   * @param visibility The visibility configuration of the `Select all` options in a list control.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.ListControlSelectAllOptionsProperty = cdkBuilder.build()
}
