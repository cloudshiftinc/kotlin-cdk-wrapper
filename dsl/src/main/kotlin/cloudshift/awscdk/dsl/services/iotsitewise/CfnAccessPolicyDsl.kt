@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy
import software.constructs.Construct

/**
 * Creates an access policy that grants the specified identity (IAM Identity Center user, IAM
 * Identity Center group, or IAM user) access to the specified AWS IoT SiteWise Monitor portal or
 * project resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * CfnAccessPolicy cfnAccessPolicy = CfnAccessPolicy.Builder.create(this, "MyCfnAccessPolicy")
 * .accessPolicyIdentity(AccessPolicyIdentityProperty.builder()
 * .iamRole(IamRoleProperty.builder()
 * .arn("arn")
 * .build())
 * .iamUser(IamUserProperty.builder()
 * .arn("arn")
 * .build())
 * .user(UserProperty.builder()
 * .id("id")
 * .build())
 * .build())
 * .accessPolicyPermission("accessPolicyPermission")
 * .accessPolicyResource(AccessPolicyResourceProperty.builder()
 * .portal(PortalProperty.builder()
 * .id("id")
 * .build())
 * .project(ProjectProperty.builder()
 * .id("id")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html)
 */
@CdkDslMarker
public class CfnAccessPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAccessPolicy.Builder = CfnAccessPolicy.Builder.create(scope, id)

  /**
   * The identity for this access policy.
   *
   * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity)
   * @param accessPolicyIdentity The identity for this access policy. 
   */
  public fun accessPolicyIdentity(accessPolicyIdentity: IResolvable) {
    cdkBuilder.accessPolicyIdentity(accessPolicyIdentity)
  }

  /**
   * The identity for this access policy.
   *
   * Choose an IAM Identity Center user, an IAM Identity Center group, or an IAM user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyidentity)
   * @param accessPolicyIdentity The identity for this access policy. 
   */
  public
      fun accessPolicyIdentity(accessPolicyIdentity: CfnAccessPolicy.AccessPolicyIdentityProperty) {
    cdkBuilder.accessPolicyIdentity(accessPolicyIdentity)
  }

  /**
   * The permission level for this access policy.
   *
   * Choose either a `ADMINISTRATOR` or `VIEWER` . Note that a project `ADMINISTRATOR` is also known
   * as a project owner.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicypermission)
   * @param accessPolicyPermission The permission level for this access policy. 
   */
  public fun accessPolicyPermission(accessPolicyPermission: String) {
    cdkBuilder.accessPolicyPermission(accessPolicyPermission)
  }

  /**
   * The AWS IoT SiteWise Monitor resource for this access policy.
   *
   * Choose either a portal or a project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyresource)
   * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
   */
  public fun accessPolicyResource(accessPolicyResource: IResolvable) {
    cdkBuilder.accessPolicyResource(accessPolicyResource)
  }

  /**
   * The AWS IoT SiteWise Monitor resource for this access policy.
   *
   * Choose either a portal or a project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html#cfn-iotsitewise-accesspolicy-accesspolicyresource)
   * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy. 
   */
  public
      fun accessPolicyResource(accessPolicyResource: CfnAccessPolicy.AccessPolicyResourceProperty) {
    cdkBuilder.accessPolicyResource(accessPolicyResource)
  }

  public fun build(): CfnAccessPolicy = cdkBuilder.build()
}
