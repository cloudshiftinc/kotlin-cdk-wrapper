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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.Number

@CdkDslMarker
public class CfnPipeBatchArrayPropertiesPropertyDsl {
    private val cdkBuilder: CfnPipe.BatchArrayPropertiesProperty.Builder =
        CfnPipe.BatchArrayPropertiesProperty.builder()

    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    public fun build(): CfnPipe.BatchArrayPropertiesProperty = cdkBuilder.build()
}
