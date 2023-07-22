@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnSecurityProfile

@CdkDslMarker
public class CfnSecurityProfileAlertTargetPropertyDsl {
  private val cdkBuilder: CfnSecurityProfile.AlertTargetProperty.Builder =
      CfnSecurityProfile.AlertTargetProperty.builder()

  /**
   * @param alertTargetArn The Amazon Resource Name (ARN) of the notification target to which alerts
   * are sent. 
   */
  public fun alertTargetArn(alertTargetArn: String) {
    cdkBuilder.alertTargetArn(alertTargetArn)
  }

  /**
   * @param roleArn The ARN of the role that grants permission to send alerts to the notification
   * target. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnSecurityProfile.AlertTargetProperty = cdkBuilder.build()
}
