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
public class CfnChannelAudioHlsRenditionSelectionPropertyDsl {
    private val cdkBuilder: CfnChannel.AudioHlsRenditionSelectionProperty.Builder =
        CfnChannel.AudioHlsRenditionSelectionProperty.builder()

    public fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnChannel.AudioHlsRenditionSelectionProperty = cdkBuilder.build()
}
