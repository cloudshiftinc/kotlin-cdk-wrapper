@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.lookoutmetrics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

/**
 * Contains information about how a source JSON data file should be analyzed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * JsonFormatDescriptorProperty jsonFormatDescriptorProperty =
 * JsonFormatDescriptorProperty.builder()
 * .charset("charset")
 * .fileCompression("fileCompression")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-jsonformatdescriptor.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorJsonFormatDescriptorPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.JsonFormatDescriptorProperty.Builder =
        CfnAnomalyDetector.JsonFormatDescriptorProperty.builder()

    /** @param charset The character set in which the source JSON file is written. */
    public fun charset(charset: String) {
        cdkBuilder.charset(charset)
    }

    /** @param fileCompression The level of compression of the source CSV file. */
    public fun fileCompression(fileCompression: String) {
        cdkBuilder.fileCompression(fileCompression)
    }

    public fun build(): CfnAnomalyDetector.JsonFormatDescriptorProperty = cdkBuilder.build()
}
