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

package cloudshift.awscdk.dsl.services.s3.deployment

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext

/**
 * Bind context for ISources.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.s3.deployment.*;
 * Role role;
 * DeploymentSourceContext deploymentSourceContext = DeploymentSourceContext.builder()
 * .handlerRole(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class DeploymentSourceContextDsl {
    private val cdkBuilder: DeploymentSourceContext.Builder = DeploymentSourceContext.builder()

    /** @param handlerRole The role for the handler. */
    public fun handlerRole(handlerRole: IRole) {
        cdkBuilder.handlerRole(handlerRole)
    }

    public fun build(): DeploymentSourceContext = cdkBuilder.build()
}
