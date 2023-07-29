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
import software.amazon.awscdk.services.codedeploy.ServerApplicationProps

/**
 * Construction properties for `ServerApplication`.
 *
 * Example:
 * ```
 * ServerApplication application = ServerApplication.Builder.create(this, "CodeDeployApplication")
 * .applicationName("MyApplication")
 * .build();
 * ```
 */
@CdkDslMarker
public class ServerApplicationPropsDsl {
    private val cdkBuilder: ServerApplicationProps.Builder = ServerApplicationProps.builder()

    /** @param applicationName The physical, human-readable name of the CodeDeploy Application. */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun build(): ServerApplicationProps = cdkBuilder.build()
}
