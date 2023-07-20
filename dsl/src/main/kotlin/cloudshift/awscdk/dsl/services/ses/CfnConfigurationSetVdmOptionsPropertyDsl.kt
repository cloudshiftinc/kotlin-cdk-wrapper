@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnConfigurationSet

@CdkDslMarker
public class CfnConfigurationSetVdmOptionsPropertyDsl {
  private val cdkBuilder: CfnConfigurationSet.VdmOptionsProperty.Builder =
      CfnConfigurationSet.VdmOptionsProperty.builder()

  public fun dashboardOptions(dashboardOptions: IResolvable) {
    cdkBuilder.dashboardOptions(dashboardOptions)
  }

  public fun dashboardOptions(dashboardOptions: CfnConfigurationSet.DashboardOptionsProperty) {
    cdkBuilder.dashboardOptions(dashboardOptions)
  }

  public fun guardianOptions(guardianOptions: IResolvable) {
    cdkBuilder.guardianOptions(guardianOptions)
  }

  public fun guardianOptions(guardianOptions: CfnConfigurationSet.GuardianOptionsProperty) {
    cdkBuilder.guardianOptions(guardianOptions)
  }

  public fun build(): CfnConfigurationSet.VdmOptionsProperty = cdkBuilder.build()
}
