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

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesis.CfnStream
import kotlin.String

@CdkDslMarker
public class CfnStreamStreamModeDetailsPropertyDsl {
    private val cdkBuilder: CfnStream.StreamModeDetailsProperty.Builder =
        CfnStream.StreamModeDetailsProperty.builder()

    public fun streamMode(streamMode: String) {
        cdkBuilder.streamMode(streamMode)
    }

    public fun build(): CfnStream.StreamModeDetailsProperty = cdkBuilder.build()
}
