@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appconfig.CfnEnvironment

/**
 * Amazon CloudWatch alarms to monitor during the deployment process.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * MonitorsProperty monitorsProperty = MonitorsProperty.builder()
 * .alarmArn("alarmArn")
 * .alarmRoleArn("alarmRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html)
 */
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
