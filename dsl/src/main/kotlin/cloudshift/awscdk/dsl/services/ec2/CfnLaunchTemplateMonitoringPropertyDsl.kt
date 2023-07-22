@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateMonitoringPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.MonitoringProperty.Builder =
      CfnLaunchTemplate.MonitoringProperty.builder()

  /**
   * @param enabled Specify `true` to enable detailed monitoring.
   * Otherwise, basic monitoring is enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specify `true` to enable detailed monitoring.
   * Otherwise, basic monitoring is enabled.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnLaunchTemplate.MonitoringProperty = cdkBuilder.build()
}
