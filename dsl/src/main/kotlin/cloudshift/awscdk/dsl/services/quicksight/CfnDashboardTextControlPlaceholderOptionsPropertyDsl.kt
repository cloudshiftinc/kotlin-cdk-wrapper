@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTextControlPlaceholderOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.TextControlPlaceholderOptionsProperty.Builder =
      CfnDashboard.TextControlPlaceholderOptionsProperty.builder()

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.TextControlPlaceholderOptionsProperty = cdkBuilder.build()
}
