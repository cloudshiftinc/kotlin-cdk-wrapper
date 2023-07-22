@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment
import software.constructs.Construct

/**
 * Adds the specified user to the specified group.
 *
 * Calling this action requires developer credentials.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CfnUserPoolUserToGroupAttachment cfnUserPoolUserToGroupAttachment =
 * CfnUserPoolUserToGroupAttachment.Builder.create(this, "MyCfnUserPoolUserToGroupAttachment")
 * .groupName("groupName")
 * .username("username")
 * .userPoolId("userPoolId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html)
 */
@CdkDslMarker
public class CfnUserPoolUserToGroupAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUserPoolUserToGroupAttachment.Builder =
      CfnUserPoolUserToGroupAttachment.Builder.create(scope, id)

  /**
   * The group name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-groupname)
   * @param groupName The group name. 
   */
  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  /**
   * The user pool ID for the user pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-userpoolid)
   * @param userPoolId The user pool ID for the user pool. 
   */
  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  /**
   * The username for the user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-username)
   * @param username The username for the user. 
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnUserPoolUserToGroupAttachment = cdkBuilder.build()
}
