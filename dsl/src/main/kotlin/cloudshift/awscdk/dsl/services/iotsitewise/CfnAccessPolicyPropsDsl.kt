@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps

@CdkDslMarker
public class CfnAccessPolicyPropsDsl {
  private val cdkBuilder: CfnAccessPolicyProps.Builder = CfnAccessPolicyProps.builder()

  /**
   * @param accessPolicyIdentity The identity for this access policy. 
   * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
   */
  public fun accessPolicyIdentity(accessPolicyIdentity: IResolvable) {
    cdkBuilder.accessPolicyIdentity(accessPolicyIdentity)
  }

  /**
   * @param accessPolicyIdentity The identity for this access policy. 
   * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
   */
  public
      fun accessPolicyIdentity(accessPolicyIdentity: CfnAccessPolicy.AccessPolicyIdentityProperty) {
    cdkBuilder.accessPolicyIdentity(accessPolicyIdentity)
  }

  /**
   * @param accessPolicyPermission The permission level for this access policy. 
   * Choose either a `ADMINISTRATOR` or `VIEWER` . Note that a project `ADMINISTRATOR` is also known
   * as a project owner.
   */
  public fun accessPolicyPermission(accessPolicyPermission: String) {
    cdkBuilder.accessPolicyPermission(accessPolicyPermission)
  }

  /**
   * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
   * Choose either a portal or a project.
   */
  public fun accessPolicyResource(accessPolicyResource: IResolvable) {
    cdkBuilder.accessPolicyResource(accessPolicyResource)
  }

  /**
   * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
   * Choose either a portal or a project.
   */
  public
      fun accessPolicyResource(accessPolicyResource: CfnAccessPolicy.AccessPolicyResourceProperty) {
    cdkBuilder.accessPolicyResource(accessPolicyResource)
  }

  public fun build(): CfnAccessPolicyProps = cdkBuilder.build()
}
