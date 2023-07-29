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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * Describes the inputs, outputs, and reference data sources for a SQL-based Kinesis Data Analytics
 * application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * SqlApplicationConfigurationProperty sqlApplicationConfigurationProperty =
 * SqlApplicationConfigurationProperty.builder()
 * .inputs(List.of(InputProperty.builder()
 * .inputSchema(InputSchemaProperty.builder()
 * .recordColumns(List.of(RecordColumnProperty.builder()
 * .name("name")
 * .sqlType("sqlType")
 * // the properties below are optional
 * .mapping("mapping")
 * .build()))
 * .recordFormat(RecordFormatProperty.builder()
 * .recordFormatType("recordFormatType")
 * // the properties below are optional
 * .mappingParameters(MappingParametersProperty.builder()
 * .csvMappingParameters(CSVMappingParametersProperty.builder()
 * .recordColumnDelimiter("recordColumnDelimiter")
 * .recordRowDelimiter("recordRowDelimiter")
 * .build())
 * .jsonMappingParameters(JSONMappingParametersProperty.builder()
 * .recordRowPath("recordRowPath")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .recordEncoding("recordEncoding")
 * .build())
 * .namePrefix("namePrefix")
 * // the properties below are optional
 * .inputParallelism(InputParallelismProperty.builder()
 * .count(123)
 * .build())
 * .inputProcessingConfiguration(InputProcessingConfigurationProperty.builder()
 * .inputLambdaProcessor(InputLambdaProcessorProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .build())
 * .kinesisFirehoseInput(KinesisFirehoseInputProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .kinesisStreamsInput(KinesisStreamsInputProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationV2SqlApplicationConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.SqlApplicationConfigurationProperty.Builder =
        CfnApplicationV2.SqlApplicationConfigurationProperty.builder()

    private val _inputs: MutableList<Any> = mutableListOf()

    /**
     * @param inputs The array of
     *   [Input](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_Input.html) objects
     *   describing the input streams used by the application.
     */
    public fun inputs(vararg inputs: Any) {
        _inputs.addAll(listOf(*inputs))
    }

    /**
     * @param inputs The array of
     *   [Input](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_Input.html) objects
     *   describing the input streams used by the application.
     */
    public fun inputs(inputs: Collection<Any>) {
        _inputs.addAll(inputs)
    }

    /**
     * @param inputs The array of
     *   [Input](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_Input.html) objects
     *   describing the input streams used by the application.
     */
    public fun inputs(inputs: IResolvable) {
        cdkBuilder.inputs(inputs)
    }

    public fun build(): CfnApplicationV2.SqlApplicationConfigurationProperty {
        if (_inputs.isNotEmpty()) cdkBuilder.inputs(_inputs)
        return cdkBuilder.build()
    }
}
