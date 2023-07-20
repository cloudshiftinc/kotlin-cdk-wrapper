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
public class CfnChannelOutputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.OutputSettingsProperty.Builder =
        CfnChannel.OutputSettingsProperty.builder()

    public fun archiveOutputSettings(archiveOutputSettings: IResolvable) {
        cdkBuilder.archiveOutputSettings(archiveOutputSettings)
    }

    public fun archiveOutputSettings(archiveOutputSettings: CfnChannel.ArchiveOutputSettingsProperty) {
        cdkBuilder.archiveOutputSettings(archiveOutputSettings)
    }

    public fun frameCaptureOutputSettings(frameCaptureOutputSettings: IResolvable) {
        cdkBuilder.frameCaptureOutputSettings(frameCaptureOutputSettings)
    }

    public fun frameCaptureOutputSettings(frameCaptureOutputSettings: CfnChannel.FrameCaptureOutputSettingsProperty) {
        cdkBuilder.frameCaptureOutputSettings(frameCaptureOutputSettings)
    }

    public fun hlsOutputSettings(hlsOutputSettings: IResolvable) {
        cdkBuilder.hlsOutputSettings(hlsOutputSettings)
    }

    public fun hlsOutputSettings(hlsOutputSettings: CfnChannel.HlsOutputSettingsProperty) {
        cdkBuilder.hlsOutputSettings(hlsOutputSettings)
    }

    public fun mediaPackageOutputSettings(mediaPackageOutputSettings: IResolvable) {
        cdkBuilder.mediaPackageOutputSettings(mediaPackageOutputSettings)
    }

    public fun mediaPackageOutputSettings(mediaPackageOutputSettings: CfnChannel.MediaPackageOutputSettingsProperty) {
        cdkBuilder.mediaPackageOutputSettings(mediaPackageOutputSettings)
    }

    public fun msSmoothOutputSettings(msSmoothOutputSettings: IResolvable) {
        cdkBuilder.msSmoothOutputSettings(msSmoothOutputSettings)
    }

    public fun msSmoothOutputSettings(msSmoothOutputSettings: CfnChannel.MsSmoothOutputSettingsProperty) {
        cdkBuilder.msSmoothOutputSettings(msSmoothOutputSettings)
    }

    public fun multiplexOutputSettings(multiplexOutputSettings: IResolvable) {
        cdkBuilder.multiplexOutputSettings(multiplexOutputSettings)
    }

    public fun multiplexOutputSettings(multiplexOutputSettings: CfnChannel.MultiplexOutputSettingsProperty) {
        cdkBuilder.multiplexOutputSettings(multiplexOutputSettings)
    }

    public fun rtmpOutputSettings(rtmpOutputSettings: IResolvable) {
        cdkBuilder.rtmpOutputSettings(rtmpOutputSettings)
    }

    public fun rtmpOutputSettings(rtmpOutputSettings: CfnChannel.RtmpOutputSettingsProperty) {
        cdkBuilder.rtmpOutputSettings(rtmpOutputSettings)
    }

    public fun udpOutputSettings(udpOutputSettings: IResolvable) {
        cdkBuilder.udpOutputSettings(udpOutputSettings)
    }

    public fun udpOutputSettings(udpOutputSettings: CfnChannel.UdpOutputSettingsProperty) {
        cdkBuilder.udpOutputSettings(udpOutputSettings)
    }

    public fun build(): CfnChannel.OutputSettingsProperty = cdkBuilder.build()
}
