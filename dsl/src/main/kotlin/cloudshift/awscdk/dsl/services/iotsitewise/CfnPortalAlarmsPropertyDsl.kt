@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnPortal

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
