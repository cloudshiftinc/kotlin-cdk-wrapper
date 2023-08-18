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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

/**
 * Contains information about a source file's formatting.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * FileFormatDescriptorProperty fileFormatDescriptorProperty =
 * FileFormatDescriptorProperty.builder()
 * .csvFormatDescriptor(CsvFormatDescriptorProperty.builder()
 * .charset("charset")
 * .containsHeader(false)
 * .delimiter("delimiter")
 * .fileCompression("fileCompression")
 * .headerList(List.of("headerList"))
 * .quoteSymbol("quoteSymbol")
 * .build())
 * .jsonFormatDescriptor(JsonFormatDescriptorProperty.builder()
 * .charset("charset")
 * .fileCompression("fileCompression")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-fileformatdescriptor.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorFileFormatDescriptorPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.FileFormatDescriptorProperty.Builder =
        CfnAnomalyDetector.FileFormatDescriptorProperty.builder()

    /**
     * @param csvFormatDescriptor Contains information about how a source CSV data file should be
     *   analyzed.
     */
    public fun csvFormatDescriptor(csvFormatDescriptor: IResolvable) {
        cdkBuilder.csvFormatDescriptor(csvFormatDescriptor)
    }

    /**
     * @param csvFormatDescriptor Contains information about how a source CSV data file should be
     *   analyzed.
     */
    public fun csvFormatDescriptor(
        csvFormatDescriptor: CfnAnomalyDetector.CsvFormatDescriptorProperty
    ) {
        cdkBuilder.csvFormatDescriptor(csvFormatDescriptor)
    }

    /**
     * @param jsonFormatDescriptor Contains information about how a source JSON data file should be
     *   analyzed.
     */
    public fun jsonFormatDescriptor(jsonFormatDescriptor: IResolvable) {
        cdkBuilder.jsonFormatDescriptor(jsonFormatDescriptor)
    }

    /**
     * @param jsonFormatDescriptor Contains information about how a source JSON data file should be
     *   analyzed.
     */
    public fun jsonFormatDescriptor(
        jsonFormatDescriptor: CfnAnomalyDetector.JsonFormatDescriptorProperty
    ) {
        cdkBuilder.jsonFormatDescriptor(jsonFormatDescriptor)
    }

    public fun build(): CfnAnomalyDetector.FileFormatDescriptorProperty = cdkBuilder.build()
}
