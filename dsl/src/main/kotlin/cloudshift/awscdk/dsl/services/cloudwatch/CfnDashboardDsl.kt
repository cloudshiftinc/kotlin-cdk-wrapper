@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.CfnDashboard
import software.constructs.Construct

@CdkDslMarker
public class CfnDashboardDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDashboard.Builder = CfnDashboard.Builder.create(scope, id)

  public fun dashboardBody(dashboardBody: String) {
    cdkBuilder.dashboardBody(dashboardBody)
  }

  public fun dashboardName(dashboardName: String) {
    cdkBuilder.dashboardName(dashboardName)
  }

  public fun build(): CfnDashboard = cdkBuilder.build()
}
