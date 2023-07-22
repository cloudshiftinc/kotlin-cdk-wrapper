@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration

/**
 * The configuration of the audit notification target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * AuditNotificationTargetConfigurationsProperty auditNotificationTargetConfigurationsProperty =
 * AuditNotificationTargetConfigurationsProperty.builder()
 * .sns(AuditNotificationTargetProperty.builder()
 * .enabled(false)
 * .roleArn("roleArn")
 * .targetArn("targetArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-accountauditconfiguration-auditnotificationtargetconfigurations.html)
 */
@CdkDslMarker
public class CfnAccountAuditConfigurationAuditNotificationTargetConfigurationsPropertyDsl {
  private val cdkBuilder:
      CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.Builder =
      CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.builder()

  /**
   * @param sns The `Sns` notification target.
   */
  public fun sns(sns: IResolvable) {
    cdkBuilder.sns(sns)
  }

  /**
   * @param sns The `Sns` notification target.
   */
  public fun sns(sns: CfnAccountAuditConfiguration.AuditNotificationTargetProperty) {
    cdkBuilder.sns(sns)
  }

  public fun build(): CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty =
      cdkBuilder.build()
}
