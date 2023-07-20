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
import kotlin.Number

@CdkDslMarker
public class CfnChannelArchiveGroupSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.ArchiveGroupSettingsProperty.Builder =
        CfnChannel.ArchiveGroupSettingsProperty.builder()

    public fun archiveCdnSettings(archiveCdnSettings: IResolvable) {
        cdkBuilder.archiveCdnSettings(archiveCdnSettings)
    }

    public fun archiveCdnSettings(archiveCdnSettings: CfnChannel.ArchiveCdnSettingsProperty) {
        cdkBuilder.archiveCdnSettings(archiveCdnSettings)
    }

    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
        cdkBuilder.destination(destination)
    }

    public fun rolloverInterval(rolloverInterval: Number) {
        cdkBuilder.rolloverInterval(rolloverInterval)
    }

    public fun build(): CfnChannel.ArchiveGroupSettingsProperty = cdkBuilder.build()
}
