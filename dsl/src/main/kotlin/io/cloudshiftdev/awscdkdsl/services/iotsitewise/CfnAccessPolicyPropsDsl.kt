@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.iotsitewise

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps

/**
 * Properties for defining a `CfnAccessPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * CfnAccessPolicyProps cfnAccessPolicyProps = CfnAccessPolicyProps.builder()
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
public class CfnAccessPolicyPropsDsl {
    private val cdkBuilder: CfnAccessPolicyProps.Builder = CfnAccessPolicyProps.builder()

    /**
     * @param accessPolicyIdentity The identity for this access policy. Choose an IAM Identity
     *   Center user, an IAM Identity Center group, or an IAM user.
     */
    public fun accessPolicyIdentity(accessPolicyIdentity: IResolvable) {
        cdkBuilder.accessPolicyIdentity(accessPolicyIdentity)
    }

    /**
     * @param accessPolicyIdentity The identity for this access policy. Choose an IAM Identity
     *   Center user, an IAM Identity Center group, or an IAM user.
     */
    public fun accessPolicyIdentity(
        accessPolicyIdentity: CfnAccessPolicy.AccessPolicyIdentityProperty
    ) {
        cdkBuilder.accessPolicyIdentity(accessPolicyIdentity)
    }

    /**
     * @param accessPolicyPermission The permission level for this access policy. Choose either a
     *   `ADMINISTRATOR` or `VIEWER` . Note that a project `ADMINISTRATOR` is also known as a
     *   project owner.
     */
    public fun accessPolicyPermission(accessPolicyPermission: String) {
        cdkBuilder.accessPolicyPermission(accessPolicyPermission)
    }

    /**
     * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy.
     *   Choose either a portal or a project.
     */
    public fun accessPolicyResource(accessPolicyResource: IResolvable) {
        cdkBuilder.accessPolicyResource(accessPolicyResource)
    }

    /**
     * @param accessPolicyResource The AWS IoT SiteWise Monitor resource for this access policy.
     *   Choose either a portal or a project.
     */
    public fun accessPolicyResource(
        accessPolicyResource: CfnAccessPolicy.AccessPolicyResourceProperty
    ) {
        cdkBuilder.accessPolicyResource(accessPolicyResource)
    }

    public fun build(): CfnAccessPolicyProps = cdkBuilder.build()
}
