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
public class CfnChannelArchiveContainerSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.ArchiveContainerSettingsProperty.Builder =
        CfnChannel.ArchiveContainerSettingsProperty.builder()

    public fun m2TsSettings(m2TsSettings: IResolvable) {
        cdkBuilder.m2TsSettings(m2TsSettings)
    }

    public fun m2TsSettings(m2TsSettings: CfnChannel.M2tsSettingsProperty) {
        cdkBuilder.m2TsSettings(m2TsSettings)
    }

    public fun rawSettings(rawSettings: IResolvable) {
        cdkBuilder.rawSettings(rawSettings)
    }

    public fun rawSettings(rawSettings: CfnChannel.RawSettingsProperty) {
        cdkBuilder.rawSettings(rawSettings)
    }

    public fun build(): CfnChannel.ArchiveContainerSettingsProperty = cdkBuilder.build()
}
