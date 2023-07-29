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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.SystemControl

/**
 * Kernel parameters to set in the container.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * SystemControl systemControl = SystemControl.builder()
 * .namespace("namespace")
 * .value("value")
 * .build();
 * ```
 */
@CdkDslMarker
public class SystemControlDsl {
    private val cdkBuilder: SystemControl.Builder = SystemControl.builder()

    /** @param namespace The namespaced kernel parameter for which to set a value. */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    /** @param value The value for the namespaced kernel parameter specified in namespace. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): SystemControl = cdkBuilder.build()
}
