@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * The `Alarm` property type specifies a CloudWatch alarm to use for an AWS CodeDeploy deployment
 * group.
 *
 * The `Alarm` property of the [CodeDeploy DeploymentGroup
 * AlarmConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html)
 * property contains a list of `Alarm` property types.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * AlarmProperty alarmProperty = AlarmProperty.builder()
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarm.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupAlarmPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.AlarmProperty.Builder =
      CfnDeploymentGroup.AlarmProperty.builder()

  /**
   * @param name The name of the alarm.
   * Maximum length is 255 characters. Each alarm name can be used only once in a list of alarms.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnDeploymentGroup.AlarmProperty = cdkBuilder.build()
}
