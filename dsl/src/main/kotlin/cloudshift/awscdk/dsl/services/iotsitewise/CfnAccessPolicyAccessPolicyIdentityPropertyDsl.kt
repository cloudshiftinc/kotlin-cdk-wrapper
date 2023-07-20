@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy

@CdkDslMarker
public class CfnAccessPolicyAccessPolicyIdentityPropertyDsl {
  private val cdkBuilder: CfnAccessPolicy.AccessPolicyIdentityProperty.Builder =
      CfnAccessPolicy.AccessPolicyIdentityProperty.builder()

  public fun iamRole(iamRole: IResolvable) {
    cdkBuilder.iamRole(iamRole)
  }

  public fun iamRole(iamRole: CfnAccessPolicy.IamRoleProperty) {
    cdkBuilder.iamRole(iamRole)
  }

  public fun iamUser(iamUser: IResolvable) {
    cdkBuilder.iamUser(iamUser)
  }

  public fun iamUser(iamUser: CfnAccessPolicy.IamUserProperty) {
    cdkBuilder.iamUser(iamUser)
  }

  public fun user(user: IResolvable) {
    cdkBuilder.user(user)
  }

  public fun user(user: CfnAccessPolicy.UserProperty) {
    cdkBuilder.user(user)
  }

  public fun build(): CfnAccessPolicy.AccessPolicyIdentityProperty = cdkBuilder.build()
}
