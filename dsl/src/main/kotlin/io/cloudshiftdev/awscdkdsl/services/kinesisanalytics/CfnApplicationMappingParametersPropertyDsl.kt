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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication

/**
 * When configuring application input at the time of creating or updating an application, provides
 * additional mapping information specific to the record format (such as JSON, CSV, or record fields
 * delimited by some delimiter) on the streaming source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * MappingParametersProperty mappingParametersProperty = MappingParametersProperty.builder()
 * .csvMappingParameters(CSVMappingParametersProperty.builder()
 * .recordColumnDelimiter("recordColumnDelimiter")
 * .recordRowDelimiter("recordRowDelimiter")
 * .build())
 * .jsonMappingParameters(JSONMappingParametersProperty.builder()
 * .recordRowPath("recordRowPath")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html)
 */
@CdkDslMarker
public class CfnApplicationMappingParametersPropertyDsl {
    private val cdkBuilder: CfnApplication.MappingParametersProperty.Builder =
        CfnApplication.MappingParametersProperty.builder()

    /**
     * @param csvMappingParameters Provides additional mapping information when the record format
     *   uses delimiters (for example, CSV).
     */
    public fun csvMappingParameters(csvMappingParameters: IResolvable) {
        cdkBuilder.csvMappingParameters(csvMappingParameters)
    }

    /**
     * @param csvMappingParameters Provides additional mapping information when the record format
     *   uses delimiters (for example, CSV).
     */
    public fun csvMappingParameters(
        csvMappingParameters: CfnApplication.CSVMappingParametersProperty
    ) {
        cdkBuilder.csvMappingParameters(csvMappingParameters)
    }

    /**
     * @param jsonMappingParameters Provides additional mapping information when JSON is the record
     *   format on the streaming source.
     */
    public fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters)
    }

    /**
     * @param jsonMappingParameters Provides additional mapping information when JSON is the record
     *   format on the streaming source.
     */
    public fun jsonMappingParameters(
        jsonMappingParameters: CfnApplication.JSONMappingParametersProperty
    ) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters)
    }

    public fun build(): CfnApplication.MappingParametersProperty = cdkBuilder.build()
}
