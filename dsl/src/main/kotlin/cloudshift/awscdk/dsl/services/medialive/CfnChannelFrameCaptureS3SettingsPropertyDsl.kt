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
public class CfnChannelFrameCaptureS3SettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.FrameCaptureS3SettingsProperty.Builder =
        CfnChannel.FrameCaptureS3SettingsProperty.builder()

    public fun cannedAcl(cannedAcl: String) {
        cdkBuilder.cannedAcl(cannedAcl)
    }

    public fun build(): CfnChannel.FrameCaptureS3SettingsProperty = cdkBuilder.build()
}
