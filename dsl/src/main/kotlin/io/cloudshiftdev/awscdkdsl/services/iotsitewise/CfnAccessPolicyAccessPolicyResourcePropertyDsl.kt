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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy

/**
 * The AWS IoT SiteWise Monitor resource for this access policy.
 *
 * Choose either a portal or a project.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * AccessPolicyResourceProperty accessPolicyResourceProperty =
 * AccessPolicyResourceProperty.builder()
 * .portal(PortalProperty.builder()
 * .id("id")
 * .build())
 * .project(ProjectProperty.builder()
 * .id("id")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyresource.html)
 */
@CdkDslMarker
public class CfnAccessPolicyAccessPolicyResourcePropertyDsl {
    private val cdkBuilder: CfnAccessPolicy.AccessPolicyResourceProperty.Builder =
        CfnAccessPolicy.AccessPolicyResourceProperty.builder()

    /** @param portal The AWS IoT SiteWise Monitor portal for this access policy. */
    public fun portal(portal: IResolvable) {
        cdkBuilder.portal(portal)
    }

    /** @param portal The AWS IoT SiteWise Monitor portal for this access policy. */
    public fun portal(portal: CfnAccessPolicy.PortalProperty) {
        cdkBuilder.portal(portal)
    }

    /** @param project The AWS IoT SiteWise Monitor project for this access policy. */
    public fun project(project: IResolvable) {
        cdkBuilder.project(project)
    }

    /** @param project The AWS IoT SiteWise Monitor project for this access policy. */
    public fun project(project: CfnAccessPolicy.ProjectProperty) {
        cdkBuilder.project(project)
    }

    public fun build(): CfnAccessPolicy.AccessPolicyResourceProperty = cdkBuilder.build()
}
