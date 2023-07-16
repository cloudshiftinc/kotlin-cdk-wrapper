@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardCustomActionURLOperationPropertyDsl {
  private val cdkBuilder: CfnDashboard.CustomActionURLOperationProperty.Builder =
      CfnDashboard.CustomActionURLOperationProperty.builder()

  public fun urlTarget(urlTarget: String) {
    cdkBuilder.urlTarget(urlTarget)
  }

  public fun urlTemplate(urlTemplate: String) {
    cdkBuilder.urlTemplate(urlTemplate)
  }

  public fun build(): CfnDashboard.CustomActionURLOperationProperty = cdkBuilder.build()
}
