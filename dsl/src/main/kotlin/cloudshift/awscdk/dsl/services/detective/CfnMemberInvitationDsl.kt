@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.detective

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.detective.CfnMemberInvitation
import software.constructs.Construct

/**
 * The `AWS::Detective::MemberInvitation` resource is an Amazon Detective resource type that creates
 * an invitation to join a Detective behavior graph.
 *
 * The administrator account can choose whether to send an email notification of the invitation to
 * the root user email address of the AWS account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.detective.*;
 * CfnMemberInvitation cfnMemberInvitation = CfnMemberInvitation.Builder.create(this,
 * "MyCfnMemberInvitation")
 * .graphArn("graphArn")
 * .memberEmailAddress("memberEmailAddress")
 * .memberId("memberId")
 * // the properties below are optional
 * .disableEmailNotification(false)
 * .message("message")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html)
 */
@CdkDslMarker
public class CfnMemberInvitationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMemberInvitation.Builder = CfnMemberInvitation.Builder.create(scope,
      id)

  /**
   * Whether to send an invitation email to the member account.
   *
   * If set to true, the member account does not receive an invitation email.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-disableemailnotification)
   * @param disableEmailNotification Whether to send an invitation email to the member account. 
   */
  public fun disableEmailNotification(disableEmailNotification: Boolean) {
    cdkBuilder.disableEmailNotification(disableEmailNotification)
  }

  /**
   * Whether to send an invitation email to the member account.
   *
   * If set to true, the member account does not receive an invitation email.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-disableemailnotification)
   * @param disableEmailNotification Whether to send an invitation email to the member account. 
   */
  public fun disableEmailNotification(disableEmailNotification: IResolvable) {
    cdkBuilder.disableEmailNotification(disableEmailNotification)
  }

  /**
   * The ARN of the behavior graph to invite the account to contribute data to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-grapharn)
   * @param graphArn The ARN of the behavior graph to invite the account to contribute data to. 
   */
  public fun graphArn(graphArn: String) {
    cdkBuilder.graphArn(graphArn)
  }

  /**
   * The root user email address of the invited account.
   *
   * If the email address provided is not the root user email address for the provided account, the
   * invitation creation fails.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberemailaddress)
   * @param memberEmailAddress The root user email address of the invited account. 
   */
  public fun memberEmailAddress(memberEmailAddress: String) {
    cdkBuilder.memberEmailAddress(memberEmailAddress)
  }

  /**
   * The AWS account identifier of the invited account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-memberid)
   * @param memberId The AWS account identifier of the invited account. 
   */
  public fun memberId(memberId: String) {
    cdkBuilder.memberId(memberId)
  }

  /**
   * Customized text to include in the invitation email message.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html#cfn-detective-memberinvitation-message)
   * @param message Customized text to include in the invitation email message. 
   */
  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  public fun build(): CfnMemberInvitation = cdkBuilder.build()
}
