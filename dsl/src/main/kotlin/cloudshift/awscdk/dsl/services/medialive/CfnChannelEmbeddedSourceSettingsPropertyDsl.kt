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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnChannelEmbeddedSourceSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.EmbeddedSourceSettingsProperty.Builder =
        CfnChannel.EmbeddedSourceSettingsProperty.builder()

    public fun convert608To708(convert608To708: String) {
        cdkBuilder.convert608To708(convert608To708)
    }

    public fun scte20Detection(scte20Detection: String) {
        cdkBuilder.scte20Detection(scte20Detection)
    }

    public fun source608ChannelNumber(source608ChannelNumber: Number) {
        cdkBuilder.source608ChannelNumber(source608ChannelNumber)
    }

    public fun source608TrackNumber(source608TrackNumber: Number) {
        cdkBuilder.source608TrackNumber(source608TrackNumber)
    }

    public fun build(): CfnChannel.EmbeddedSourceSettingsProperty = cdkBuilder.build()
}
