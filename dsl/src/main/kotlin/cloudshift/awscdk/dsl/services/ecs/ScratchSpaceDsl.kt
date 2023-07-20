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
import software.amazon.awscdk.services.ecs.ScratchSpace
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class ScratchSpaceDsl {
    private val cdkBuilder: ScratchSpace.Builder = ScratchSpace.builder()

    public fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
    }

    public fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): ScratchSpace = cdkBuilder.build()
}
