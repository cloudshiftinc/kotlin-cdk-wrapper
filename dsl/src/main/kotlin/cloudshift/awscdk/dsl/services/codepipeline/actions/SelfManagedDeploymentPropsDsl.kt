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
import software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps
import software.amazon.awscdk.services.iam.IRole
import kotlin.String

@CdkDslMarker
public class SelfManagedDeploymentPropsDsl {
    private val cdkBuilder: SelfManagedDeploymentProps.Builder = SelfManagedDeploymentProps.builder()

    public fun administrationRole(administrationRole: IRole) {
        cdkBuilder.administrationRole(administrationRole)
    }

    public fun executionRoleName(executionRoleName: String) {
        cdkBuilder.executionRoleName(executionRoleName)
    }

    public fun build(): SelfManagedDeploymentProps = cdkBuilder.build()
}
