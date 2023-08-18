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

package io.cloudshiftdev.awscdkdsl.services.codepipeline.actions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps
import software.amazon.awscdk.services.codepipeline.actions.StackSetOrganizationsAutoDeployment

/**
 * Properties for configuring service-managed (Organizations) permissions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.actions.*;
 * OrganizationsDeploymentProps organizationsDeploymentProps =
 * OrganizationsDeploymentProps.builder()
 * .autoDeployment(StackSetOrganizationsAutoDeployment.ENABLED)
 * .build();
 * ```
 */
@CdkDslMarker
public class OrganizationsDeploymentPropsDsl {
    private val cdkBuilder: OrganizationsDeploymentProps.Builder =
        OrganizationsDeploymentProps.builder()

    /**
     * @param autoDeployment Automatically deploy to new accounts added to Organizational Units.
     *   Whether AWS CloudFormation StackSets automatically deploys to AWS Organizations accounts
     *   that are added to a target organization or organizational unit (OU).
     */
    public fun autoDeployment(autoDeployment: StackSetOrganizationsAutoDeployment) {
        cdkBuilder.autoDeployment(autoDeployment)
    }

    public fun build(): OrganizationsDeploymentProps = cdkBuilder.build()
}
