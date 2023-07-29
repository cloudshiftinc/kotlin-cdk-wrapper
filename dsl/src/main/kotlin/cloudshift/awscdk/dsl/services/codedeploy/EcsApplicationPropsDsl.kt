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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.EcsApplicationProps

/**
 * Construction properties for `EcsApplication`.
 *
 * Example:
 * ```
 * EcsApplication application = EcsApplication.Builder.create(this, "CodeDeployApplication")
 * .applicationName("MyApplication")
 * .build();
 * ```
 */
@CdkDslMarker
public class EcsApplicationPropsDsl {
    private val cdkBuilder: EcsApplicationProps.Builder = EcsApplicationProps.builder()

    /** @param applicationName The physical, human-readable name of the CodeDeploy Application. */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun build(): EcsApplicationProps = cdkBuilder.build()
}
