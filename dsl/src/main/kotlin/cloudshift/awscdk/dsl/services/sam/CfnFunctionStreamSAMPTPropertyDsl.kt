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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionStreamSAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.StreamSAMPTProperty.Builder =
        CfnFunction.StreamSAMPTProperty.builder()

    public fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
    }

    public fun build(): CfnFunction.StreamSAMPTProperty = cdkBuilder.build()
}
