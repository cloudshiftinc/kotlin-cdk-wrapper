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

package cloudshift.awscdk.dsl.services.ivs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnRecordingConfigurationThumbnailConfigurationPropertyDsl {
    private val cdkBuilder: CfnRecordingConfiguration.ThumbnailConfigurationProperty.Builder =
        CfnRecordingConfiguration.ThumbnailConfigurationProperty.builder()

    public fun recordingMode(recordingMode: String) {
        cdkBuilder.recordingMode(recordingMode)
    }

    public fun targetIntervalSeconds(targetIntervalSeconds: Number) {
        cdkBuilder.targetIntervalSeconds(targetIntervalSeconds)
    }

    public fun build(): CfnRecordingConfiguration.ThumbnailConfigurationProperty = cdkBuilder.build()
}
