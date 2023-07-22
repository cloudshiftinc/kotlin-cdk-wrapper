@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnPortal

/**
 * Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor portal.
 *
 * You can use the alarm to monitor an asset property and get notified when the asset property value
 * is outside a specified range. For more information, see [Monitoring with
 * alarms](https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html) in the *AWS
 * IoT SiteWise Application Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * AlarmsProperty alarmsProperty = AlarmsProperty.builder()
 * .alarmRoleArn("alarmRoleArn")
 * .notificationLambdaArn("notificationLambdaArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-portal-alarms.html)
 */
@CdkDslMarker
public class CfnPortalAlarmsPropertyDsl {
  private val cdkBuilder: CfnPortal.AlarmsProperty.Builder = CfnPortal.AlarmsProperty.builder()

  /**
   * @param alarmRoleArn The
   * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the IAM role
   * that allows the alarm to perform actions and access AWS resources and services, such as AWS IoT
   * Events .
   */
  public fun alarmRoleArn(alarmRoleArn: String) {
    cdkBuilder.alarmRoleArn(alarmRoleArn)
  }

  /**
   * @param notificationLambdaArn The
   * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the Lambda
   * function that manages alarm notifications. For more information, see [Managing alarm
   * notifications](https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html) in
   * the *AWS IoT Events Developer Guide* .
   */
  public fun notificationLambdaArn(notificationLambdaArn: String) {
    cdkBuilder.notificationLambdaArn(notificationLambdaArn)
  }

  public fun build(): CfnPortal.AlarmsProperty = cdkBuilder.build()
}
