@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateMaintenanceOptionsPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.MaintenanceOptionsProperty.Builder =
      CfnLaunchTemplate.MaintenanceOptionsProperty.builder()

  public fun autoRecovery(autoRecovery: String) {
    cdkBuilder.autoRecovery(autoRecovery)
  }

  public fun build(): CfnLaunchTemplate.MaintenanceOptionsProperty = cdkBuilder.build()
}
