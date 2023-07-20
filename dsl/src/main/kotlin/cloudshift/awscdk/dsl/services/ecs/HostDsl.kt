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
import software.amazon.awscdk.services.ecs.Host
import kotlin.String

@CdkDslMarker
public class HostDsl {
    private val cdkBuilder: Host.Builder = Host.builder()

    public fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): Host = cdkBuilder.build()
}
