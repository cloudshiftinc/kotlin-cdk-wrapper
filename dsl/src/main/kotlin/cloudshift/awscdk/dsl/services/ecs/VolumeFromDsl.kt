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
import software.amazon.awscdk.services.ecs.VolumeFrom
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class VolumeFromDsl {
    private val cdkBuilder: VolumeFrom.Builder = VolumeFrom.builder()

    public fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
    }

    public fun sourceContainer(sourceContainer: String) {
        cdkBuilder.sourceContainer(sourceContainer)
    }

    public fun build(): VolumeFrom = cdkBuilder.build()
}
