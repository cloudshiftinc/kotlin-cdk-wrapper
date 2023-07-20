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
public class CfnChannelArchiveS3SettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.ArchiveS3SettingsProperty.Builder =
        CfnChannel.ArchiveS3SettingsProperty.builder()

    public fun cannedAcl(cannedAcl: String) {
        cdkBuilder.cannedAcl(cannedAcl)
    }

    public fun build(): CfnChannel.ArchiveS3SettingsProperty = cdkBuilder.build()
}
