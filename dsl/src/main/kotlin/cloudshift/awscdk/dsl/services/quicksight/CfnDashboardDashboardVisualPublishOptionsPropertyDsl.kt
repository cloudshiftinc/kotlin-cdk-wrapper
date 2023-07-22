@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDashboardVisualPublishOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.DashboardVisualPublishOptionsProperty.Builder =
      CfnDashboard.DashboardVisualPublishOptionsProperty.builder()

  /**
   * @param exportHiddenFieldsOption Determines if hidden fields are included in an exported
   * dashboard.
   */
  public fun exportHiddenFieldsOption(exportHiddenFieldsOption: IResolvable) {
    cdkBuilder.exportHiddenFieldsOption(exportHiddenFieldsOption)
  }

  /**
   * @param exportHiddenFieldsOption Determines if hidden fields are included in an exported
   * dashboard.
   */
  public
      fun exportHiddenFieldsOption(exportHiddenFieldsOption: CfnDashboard.ExportHiddenFieldsOptionProperty) {
    cdkBuilder.exportHiddenFieldsOption(exportHiddenFieldsOption)
  }

  public fun build(): CfnDashboard.DashboardVisualPublishOptionsProperty = cdkBuilder.build()
}
