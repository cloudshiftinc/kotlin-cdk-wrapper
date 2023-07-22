@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appconfig.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentMonitorsPropertyDsl {
  private val cdkBuilder: CfnEnvironment.MonitorsProperty.Builder =
      CfnEnvironment.MonitorsProperty.builder()

  /**
   * @param alarmArn Amazon Resource Name (ARN) of the Amazon CloudWatch alarm.
   */
  public fun alarmArn(alarmArn: String) {
    cdkBuilder.alarmArn(alarmArn)
  }

  /**
   * @param alarmRoleArn ARN of an AWS Identity and Access Management (IAM) role for AWS AppConfig
   * to monitor `AlarmArn` .
   */
  public fun alarmRoleArn(alarmRoleArn: String) {
    cdkBuilder.alarmRoleArn(alarmRoleArn)
  }

  public fun build(): CfnEnvironment.MonitorsProperty = cdkBuilder.build()
}
