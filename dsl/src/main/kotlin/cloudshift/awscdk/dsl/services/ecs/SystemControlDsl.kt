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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.SystemControl
import kotlin.String

@CdkDslMarker
public class SystemControlDsl {
    private val cdkBuilder: SystemControl.Builder = SystemControl.builder()

    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): SystemControl = cdkBuilder.build()
}
