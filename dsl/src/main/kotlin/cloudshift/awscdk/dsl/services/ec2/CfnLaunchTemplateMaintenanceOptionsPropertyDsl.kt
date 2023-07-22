@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateMaintenanceOptionsPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.MaintenanceOptionsProperty.Builder =
      CfnLaunchTemplate.MaintenanceOptionsProperty.builder()

  /**
   * @param autoRecovery Disables the automatic recovery behavior of your instance or sets it to
   * default.
   */
  public fun autoRecovery(autoRecovery: String) {
    cdkBuilder.autoRecovery(autoRecovery)
  }

  public fun build(): CfnLaunchTemplate.MaintenanceOptionsProperty = cdkBuilder.build()
}
