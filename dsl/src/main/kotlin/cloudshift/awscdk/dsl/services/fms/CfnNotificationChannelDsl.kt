@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fms.CfnNotificationChannel
import software.constructs.Construct

@CdkDslMarker
public class CfnNotificationChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNotificationChannel.Builder =
      CfnNotificationChannel.Builder.create(scope, id)

  /**
   * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall
   * Manager activity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snsrolename)
   * @param snsRoleName The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to
   * record AWS Firewall Manager activity. 
   */
  public fun snsRoleName(snsRoleName: String) {
    cdkBuilder.snsRoleName(snsRoleName)
  }

  /**
   * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall
   * Manager .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snstopicarn)
   * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic that collects notifications
   * from AWS Firewall Manager . 
   */
  public fun snsTopicArn(snsTopicArn: String) {
    cdkBuilder.snsTopicArn(snsTopicArn)
  }

  public fun build(): CfnNotificationChannel = cdkBuilder.build()
}
