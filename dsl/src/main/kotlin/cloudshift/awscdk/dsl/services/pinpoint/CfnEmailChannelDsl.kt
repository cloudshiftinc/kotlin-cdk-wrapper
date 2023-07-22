@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnEmailChannel
import software.constructs.Construct

@CdkDslMarker
public class CfnEmailChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEmailChannel.Builder = CfnEmailChannel.Builder.create(scope, id)

  /**
   * The unique identifier for the Amazon Pinpoint application that you're specifying the email
   * channel for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-applicationid)
   * @param applicationId The unique identifier for the Amazon Pinpoint application that you're
   * specifying the email channel for. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * The [Amazon SES configuration
   * set](https://docs.aws.amazon.com/ses/latest/APIReference/API_ConfigurationSet.html) that you want
   * to apply to messages that you send through the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-configurationset)
   * @param configurationSet The [Amazon SES configuration
   * set](https://docs.aws.amazon.com/ses/latest/APIReference/API_ConfigurationSet.html) that you want
   * to apply to messages that you send through the channel. 
   */
  public fun configurationSet(configurationSet: String) {
    cdkBuilder.configurationSet(configurationSet)
  }

  /**
   * Specifies whether to enable the email channel for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-enabled)
   * @param enabled Specifies whether to enable the email channel for the application. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * Specifies whether to enable the email channel for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-enabled)
   * @param enabled Specifies whether to enable the email channel for the application. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * The verified email address that you want to send email from when you send email through the
   * channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-fromaddress)
   * @param fromAddress The verified email address that you want to send email from when you send
   * email through the channel. 
   */
  public fun fromAddress(fromAddress: String) {
    cdkBuilder.fromAddress(fromAddress)
  }

  /**
   * The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service
   * (Amazon SES), that you want to use when you send email through the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-identity)
   * @param identity The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple
   * Email Service (Amazon SES), that you want to use when you send email through the channel. 
   */
  public fun identity(identity: String) {
    cdkBuilder.identity(identity)
  }

  /**
   * The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to
   * use when it submits email-related event data for the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-rolearn)
   * @param roleArn The ARN of the AWS Identity and Access Management (IAM) role that you want
   * Amazon Pinpoint to use when it submits email-related event data for the channel. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnEmailChannel = cdkBuilder.build()
}
