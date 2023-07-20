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

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector
import kotlin.String

@CdkDslMarker
public class CfnAnomalyDetectorJsonFormatDescriptorPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.JsonFormatDescriptorProperty.Builder =
        CfnAnomalyDetector.JsonFormatDescriptorProperty.builder()

    public fun charset(charset: String) {
        cdkBuilder.charset(charset)
    }

    public fun fileCompression(fileCompression: String) {
        cdkBuilder.fileCompression(fileCompression)
    }

    public fun build(): CfnAnomalyDetector.JsonFormatDescriptorProperty = cdkBuilder.build()
}
