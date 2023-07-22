@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnStackUserAssociation
import software.constructs.Construct

/**
 * The `AWS::AppStream::StackUserAssociation` resource associates the specified users with the
 * specified stacks for Amazon AppStream 2.0. Users in an AppStream 2.0 user pool cannot be assigned to
 * stacks with fleets that are joined to an Active Directory domain.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnStackUserAssociation cfnStackUserAssociation = CfnStackUserAssociation.Builder.create(this,
 * "MyCfnStackUserAssociation")
 * .authenticationType("authenticationType")
 * .stackName("stackName")
 * .userName("userName")
 * // the properties below are optional
 * .sendEmailNotification(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html)
 */
@CdkDslMarker
public class CfnStackUserAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStackUserAssociation.Builder =
      CfnStackUserAssociation.Builder.create(scope, id)

  /**
   * The authentication type for the user who is associated with the stack.
   *
   * You must specify USERPOOL.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-authenticationtype)
   * @param authenticationType The authentication type for the user who is associated with the
   * stack. 
   */
  public fun authenticationType(authenticationType: String) {
    cdkBuilder.authenticationType(authenticationType)
  }

  /**
   * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-sendemailnotification)
   * @param sendEmailNotification Specifies whether a welcome email is sent to a user after the user
   * is created in the user pool. 
   */
  public fun sendEmailNotification(sendEmailNotification: Boolean) {
    cdkBuilder.sendEmailNotification(sendEmailNotification)
  }

  /**
   * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-sendemailnotification)
   * @param sendEmailNotification Specifies whether a welcome email is sent to a user after the user
   * is created in the user pool. 
   */
  public fun sendEmailNotification(sendEmailNotification: IResolvable) {
    cdkBuilder.sendEmailNotification(sendEmailNotification)
  }

  /**
   * The name of the stack that is associated with the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-stackname)
   * @param stackName The name of the stack that is associated with the user. 
   */
  public fun stackName(stackName: String) {
    cdkBuilder.stackName(stackName)
  }

  /**
   * The email address of the user who is associated with the stack.
   *
   *
   * Users' email addresses are case-sensitive.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-username)
   * @param userName The email address of the user who is associated with the stack. 
   */
  public fun userName(userName: String) {
    cdkBuilder.userName(userName)
  }

  public fun build(): CfnStackUserAssociation = cdkBuilder.build()
}
