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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.String

@CdkDslMarker
public class CfnChannelMultiplexProgramChannelDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.MultiplexProgramChannelDestinationSettingsProperty.Builder =
        CfnChannel.MultiplexProgramChannelDestinationSettingsProperty.builder()

    public fun multiplexId(multiplexId: String) {
        cdkBuilder.multiplexId(multiplexId)
    }

    public fun programName(programName: String) {
        cdkBuilder.programName(programName)
    }

    public fun build(): CfnChannel.MultiplexProgramChannelDestinationSettingsProperty =
        cdkBuilder.build()
}
