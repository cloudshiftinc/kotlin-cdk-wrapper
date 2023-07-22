@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy

/**
 * The identity (IAM Identity Center user, IAM Identity Center group, or IAM user) to which this
 * access policy applies.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * AccessPolicyIdentityProperty accessPolicyIdentityProperty =
 * AccessPolicyIdentityProperty.builder()
 * .iamRole(IamRoleProperty.builder()
 * .arn("arn")
 * .build())
 * .iamUser(IamUserProperty.builder()
 * .arn("arn")
 * .build())
 * .user(UserProperty.builder()
 * .id("id")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyidentity.html)
 */
@CdkDslMarker
public class CfnAccessPolicyAccessPolicyIdentityPropertyDsl {
  private val cdkBuilder: CfnAccessPolicy.AccessPolicyIdentityProperty.Builder =
      CfnAccessPolicy.AccessPolicyIdentityProperty.builder()

  /**
   * @param iamRole An IAM role identity.
   */
  public fun iamRole(iamRole: IResolvable) {
    cdkBuilder.iamRole(iamRole)
  }

  /**
   * @param iamRole An IAM role identity.
   */
  public fun iamRole(iamRole: CfnAccessPolicy.IamRoleProperty) {
    cdkBuilder.iamRole(iamRole)
  }

  /**
   * @param iamUser An IAM user identity.
   */
  public fun iamUser(iamUser: IResolvable) {
    cdkBuilder.iamUser(iamUser)
  }

  /**
   * @param iamUser An IAM user identity.
   */
  public fun iamUser(iamUser: CfnAccessPolicy.IamUserProperty) {
    cdkBuilder.iamUser(iamUser)
  }

  /**
   * @param user The IAM Identity Center user to which this access policy maps.
   */
  public fun user(user: IResolvable) {
    cdkBuilder.user(user)
  }

  /**
   * @param user The IAM Identity Center user to which this access policy maps.
   */
  public fun user(user: CfnAccessPolicy.UserProperty) {
    cdkBuilder.user(user)
  }

  public fun build(): CfnAccessPolicy.AccessPolicyIdentityProperty = cdkBuilder.build()
}
