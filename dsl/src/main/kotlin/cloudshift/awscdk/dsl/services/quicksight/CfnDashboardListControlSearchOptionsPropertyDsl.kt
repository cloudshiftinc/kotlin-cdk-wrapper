@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardListControlSearchOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.ListControlSearchOptionsProperty.Builder =
      CfnDashboard.ListControlSearchOptionsProperty.builder()

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.ListControlSearchOptionsProperty = cdkBuilder.build()
}
