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
public class CfnChannelAudioDolbyEDecodePropertyDsl {
    private val cdkBuilder: CfnChannel.AudioDolbyEDecodeProperty.Builder =
        CfnChannel.AudioDolbyEDecodeProperty.builder()

    public fun programSelection(programSelection: String) {
        cdkBuilder.programSelection(programSelection)
    }

    public fun build(): CfnChannel.AudioDolbyEDecodeProperty = cdkBuilder.build()
}
