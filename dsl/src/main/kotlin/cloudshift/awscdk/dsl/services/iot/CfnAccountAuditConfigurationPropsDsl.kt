@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration
import software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps

@CdkDslMarker
public class CfnAccountAuditConfigurationPropsDsl {
  private val cdkBuilder: CfnAccountAuditConfigurationProps.Builder =
      CfnAccountAuditConfigurationProps.builder()

  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  public fun auditCheckConfigurations(auditCheckConfigurations: IResolvable) {
    cdkBuilder.auditCheckConfigurations(auditCheckConfigurations)
  }

  public
      fun auditCheckConfigurations(auditCheckConfigurations: CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty) {
    cdkBuilder.auditCheckConfigurations(auditCheckConfigurations)
  }

  public
      fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: IResolvable) {
    cdkBuilder.auditNotificationTargetConfigurations(auditNotificationTargetConfigurations)
  }

  public
      fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty) {
    cdkBuilder.auditNotificationTargetConfigurations(auditNotificationTargetConfigurations)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnAccountAuditConfigurationProps = cdkBuilder.build()
}
