@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnUserPoolGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUserPoolGroup.Builder = CfnUserPoolGroup.Builder.create(scope, id)

  /**
   * A string containing the description of the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-description)
   * @param description A string containing the description of the group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the group.
   *
   * Must be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-groupname)
   * @param groupName The name of the group. 
   */
  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  /**
   * A non-negative integer value that specifies the precedence of this group relative to the other
   * groups that a user can belong to in the user pool.
   *
   * Zero is the highest precedence value. Groups with lower `Precedence` values take precedence
   * over groups with higher or null `Precedence` values. If a user belongs to two or more groups, it
   * is the group with the lowest precedence value whose role ARN is given in the user's tokens for the
   * `cognito:roles` and `cognito:preferred_role` claims.
   *
   * Two groups can have the same `Precedence` value. If this happens, neither group takes
   * precedence over the other. If two groups with the same `Precedence` have the same role ARN, that
   * role is used in the `cognito:preferred_role` claim in tokens for users in each group. If the two
   * groups have different role ARNs, the `cognito:preferred_role` claim isn't set in users' tokens.
   *
   * The default `Precedence` value is null. The maximum `Precedence` value is `2^31-1` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-precedence)
   * @param precedence A non-negative integer value that specifies the precedence of this group
   * relative to the other groups that a user can belong to in the user pool. 
   */
  public fun precedence(precedence: Number) {
    cdkBuilder.precedence(precedence)
  }

  /**
   * The role Amazon Resource Name (ARN) for the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-rolearn)
   * @param roleArn The role Amazon Resource Name (ARN) for the group. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * The user pool ID for the user pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html#cfn-cognito-userpoolgroup-userpoolid)
   * @param userPoolId The user pool ID for the user pool. 
   */
  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun build(): CfnUserPoolGroup = cdkBuilder.build()
}
