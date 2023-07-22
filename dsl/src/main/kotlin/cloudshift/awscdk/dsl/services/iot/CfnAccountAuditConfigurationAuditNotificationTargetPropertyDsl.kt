@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration

@CdkDslMarker
public class CfnAccountAuditConfigurationAuditNotificationTargetPropertyDsl {
  private val cdkBuilder: CfnAccountAuditConfiguration.AuditNotificationTargetProperty.Builder =
      CfnAccountAuditConfiguration.AuditNotificationTargetProperty.builder()

  /**
   * @param enabled True if notifications to the target are enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled True if notifications to the target are enabled.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param roleArn The ARN of the role that grants permission to send notifications to the target.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param targetArn The ARN of the target (SNS topic) to which audit notifications are sent.
   */
  public fun targetArn(targetArn: String) {
    cdkBuilder.targetArn(targetArn)
  }

  public fun build(): CfnAccountAuditConfiguration.AuditNotificationTargetProperty =
      cdkBuilder.build()
}
