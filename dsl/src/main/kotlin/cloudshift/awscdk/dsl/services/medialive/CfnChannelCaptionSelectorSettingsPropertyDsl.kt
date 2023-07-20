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
public class CfnChannelCaptionSelectorSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.CaptionSelectorSettingsProperty.Builder =
        CfnChannel.CaptionSelectorSettingsProperty.builder()

    public fun ancillarySourceSettings(ancillarySourceSettings: IResolvable) {
        cdkBuilder.ancillarySourceSettings(ancillarySourceSettings)
    }

    public fun ancillarySourceSettings(ancillarySourceSettings: CfnChannel.AncillarySourceSettingsProperty) {
        cdkBuilder.ancillarySourceSettings(ancillarySourceSettings)
    }

    public fun aribSourceSettings(aribSourceSettings: IResolvable) {
        cdkBuilder.aribSourceSettings(aribSourceSettings)
    }

    public fun aribSourceSettings(aribSourceSettings: CfnChannel.AribSourceSettingsProperty) {
        cdkBuilder.aribSourceSettings(aribSourceSettings)
    }

    public fun dvbSubSourceSettings(dvbSubSourceSettings: IResolvable) {
        cdkBuilder.dvbSubSourceSettings(dvbSubSourceSettings)
    }

    public fun dvbSubSourceSettings(dvbSubSourceSettings: CfnChannel.DvbSubSourceSettingsProperty) {
        cdkBuilder.dvbSubSourceSettings(dvbSubSourceSettings)
    }

    public fun embeddedSourceSettings(embeddedSourceSettings: IResolvable) {
        cdkBuilder.embeddedSourceSettings(embeddedSourceSettings)
    }

    public fun embeddedSourceSettings(embeddedSourceSettings: CfnChannel.EmbeddedSourceSettingsProperty) {
        cdkBuilder.embeddedSourceSettings(embeddedSourceSettings)
    }

    public fun scte20SourceSettings(scte20SourceSettings: IResolvable) {
        cdkBuilder.scte20SourceSettings(scte20SourceSettings)
    }

    public fun scte20SourceSettings(scte20SourceSettings: CfnChannel.Scte20SourceSettingsProperty) {
        cdkBuilder.scte20SourceSettings(scte20SourceSettings)
    }

    public fun scte27SourceSettings(scte27SourceSettings: IResolvable) {
        cdkBuilder.scte27SourceSettings(scte27SourceSettings)
    }

    public fun scte27SourceSettings(scte27SourceSettings: CfnChannel.Scte27SourceSettingsProperty) {
        cdkBuilder.scte27SourceSettings(scte27SourceSettings)
    }

    public fun teletextSourceSettings(teletextSourceSettings: IResolvable) {
        cdkBuilder.teletextSourceSettings(teletextSourceSettings)
    }

    public fun teletextSourceSettings(teletextSourceSettings: CfnChannel.TeletextSourceSettingsProperty) {
        cdkBuilder.teletextSourceSettings(teletextSourceSettings)
    }

    public fun build(): CfnChannel.CaptionSelectorSettingsProperty = cdkBuilder.build()
}
