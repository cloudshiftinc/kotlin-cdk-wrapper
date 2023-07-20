@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps
import software.amazon.awscdk.services.codepipeline.actions.StackSetOrganizationsAutoDeployment

@CdkDslMarker
public class OrganizationsDeploymentPropsDsl {
    private val cdkBuilder: OrganizationsDeploymentProps.Builder =
        OrganizationsDeploymentProps.builder()

    public fun autoDeployment(autoDeployment: StackSetOrganizationsAutoDeployment) {
        cdkBuilder.autoDeployment(autoDeployment)
    }

    public fun build(): OrganizationsDeploymentProps = cdkBuilder.build()
}
