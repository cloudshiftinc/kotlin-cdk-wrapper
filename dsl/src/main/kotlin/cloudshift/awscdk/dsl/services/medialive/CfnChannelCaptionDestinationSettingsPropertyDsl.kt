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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelCaptionDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.CaptionDestinationSettingsProperty.Builder =
        CfnChannel.CaptionDestinationSettingsProperty.builder()

    public fun aribDestinationSettings(aribDestinationSettings: IResolvable) {
        cdkBuilder.aribDestinationSettings(aribDestinationSettings)
    }

    public fun aribDestinationSettings(aribDestinationSettings: CfnChannel.AribDestinationSettingsProperty) {
        cdkBuilder.aribDestinationSettings(aribDestinationSettings)
    }

    public fun burnInDestinationSettings(burnInDestinationSettings: IResolvable) {
        cdkBuilder.burnInDestinationSettings(burnInDestinationSettings)
    }

    public fun burnInDestinationSettings(burnInDestinationSettings: CfnChannel.BurnInDestinationSettingsProperty) {
        cdkBuilder.burnInDestinationSettings(burnInDestinationSettings)
    }

    public fun dvbSubDestinationSettings(dvbSubDestinationSettings: IResolvable) {
        cdkBuilder.dvbSubDestinationSettings(dvbSubDestinationSettings)
    }

    public fun dvbSubDestinationSettings(dvbSubDestinationSettings: CfnChannel.DvbSubDestinationSettingsProperty) {
        cdkBuilder.dvbSubDestinationSettings(dvbSubDestinationSettings)
    }

    public fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: IResolvable) {
        cdkBuilder.ebuTtDDestinationSettings(ebuTtDDestinationSettings)
    }

    public fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: CfnChannel.EbuTtDDestinationSettingsProperty) {
        cdkBuilder.ebuTtDDestinationSettings(ebuTtDDestinationSettings)
    }

    public fun embeddedDestinationSettings(embeddedDestinationSettings: IResolvable) {
        cdkBuilder.embeddedDestinationSettings(embeddedDestinationSettings)
    }

    public fun embeddedDestinationSettings(embeddedDestinationSettings: CfnChannel.EmbeddedDestinationSettingsProperty) {
        cdkBuilder.embeddedDestinationSettings(embeddedDestinationSettings)
    }

    public fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: IResolvable) {
        cdkBuilder.embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings)
    }

    public fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty) {
        cdkBuilder.embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings)
    }

    public fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: IResolvable) {
        cdkBuilder.rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings)
    }

    public fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: CfnChannel.RtmpCaptionInfoDestinationSettingsProperty) {
        cdkBuilder.rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings)
    }

    public fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: IResolvable) {
        cdkBuilder.scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings)
    }

    public fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty) {
        cdkBuilder.scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings)
    }

    public fun scte27DestinationSettings(scte27DestinationSettings: IResolvable) {
        cdkBuilder.scte27DestinationSettings(scte27DestinationSettings)
    }

    public fun scte27DestinationSettings(scte27DestinationSettings: CfnChannel.Scte27DestinationSettingsProperty) {
        cdkBuilder.scte27DestinationSettings(scte27DestinationSettings)
    }

    public fun smpteTtDestinationSettings(smpteTtDestinationSettings: IResolvable) {
        cdkBuilder.smpteTtDestinationSettings(smpteTtDestinationSettings)
    }

    public fun smpteTtDestinationSettings(smpteTtDestinationSettings: CfnChannel.SmpteTtDestinationSettingsProperty) {
        cdkBuilder.smpteTtDestinationSettings(smpteTtDestinationSettings)
    }

    public fun teletextDestinationSettings(teletextDestinationSettings: IResolvable) {
        cdkBuilder.teletextDestinationSettings(teletextDestinationSettings)
    }

    public fun teletextDestinationSettings(teletextDestinationSettings: CfnChannel.TeletextDestinationSettingsProperty) {
        cdkBuilder.teletextDestinationSettings(teletextDestinationSettings)
    }

    public fun ttmlDestinationSettings(ttmlDestinationSettings: IResolvable) {
        cdkBuilder.ttmlDestinationSettings(ttmlDestinationSettings)
    }

    public fun ttmlDestinationSettings(ttmlDestinationSettings: CfnChannel.TtmlDestinationSettingsProperty) {
        cdkBuilder.ttmlDestinationSettings(ttmlDestinationSettings)
    }

    public fun webvttDestinationSettings(webvttDestinationSettings: IResolvable) {
        cdkBuilder.webvttDestinationSettings(webvttDestinationSettings)
    }

    public fun webvttDestinationSettings(webvttDestinationSettings: CfnChannel.WebvttDestinationSettingsProperty) {
        cdkBuilder.webvttDestinationSettings(webvttDestinationSettings)
    }

    public fun build(): CfnChannel.CaptionDestinationSettingsProperty = cdkBuilder.build()
}
