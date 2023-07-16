@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration

@CdkDslMarker
public class CfnAccountAuditConfigurationAuditNotificationTargetConfigurationsPropertyDsl {
  private val cdkBuilder:
      CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.Builder =
      CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.builder()

  public fun sns(sns: IResolvable) {
    cdkBuilder.sns(sns)
  }

  public fun sns(sns: CfnAccountAuditConfiguration.AuditNotificationTargetProperty) {
    cdkBuilder.sns(sns)
  }

  public fun build(): CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty =
      cdkBuilder.build()
}
