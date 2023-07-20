@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardExportToCSVOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.ExportToCSVOptionProperty.Builder =
      CfnDashboard.ExportToCSVOptionProperty.builder()

  public fun availabilityStatus(availabilityStatus: String) {
    cdkBuilder.availabilityStatus(availabilityStatus)
  }

  public fun build(): CfnDashboard.ExportToCSVOptionProperty = cdkBuilder.build()
}
