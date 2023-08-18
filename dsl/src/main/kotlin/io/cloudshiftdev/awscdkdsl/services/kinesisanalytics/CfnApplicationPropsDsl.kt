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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
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
 * .roleArn("roleArn")
 * .build())
 * .build())
 * .kinesisFirehoseInput(KinesisFirehoseInputProperty.builder()
 * .resourceArn("resourceArn")
 * .roleArn("roleArn")
 * .build())
 * .kinesisStreamsInput(KinesisStreamsInputProperty.builder()
 * .resourceArn("resourceArn")
 * .roleArn("roleArn")
 * .build())
 * .build()))
 * // the properties below are optional
 * .applicationCode("applicationCode")
 * .applicationDescription("applicationDescription")
 * .applicationName("applicationName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html)
 */
@CdkDslMarker
public class CfnApplicationPropsDsl {
    private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

    private val _inputs: MutableList<Any> = mutableListOf()

    /**
     * @param applicationCode One or more SQL statements that read input data, transform it, and
     *   generate output. For example, you can write a SQL statement that reads data from one
     *   in-application stream, generates a running average of the number of advertisement clicks by
     *   vendor, and insert resulting rows in another in-application stream using pumps. For more
     *   information about the typical pattern, see
     *   [Application Code](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-app-code.html)
     *   .
     *
     * You can provide such series of SQL statements, where output of one statement can be used as
     * the input for the next statement. You store intermediate results by creating in-application
     * streams and pumps.
     *
     * Note that the application code must create the streams with names specified in the `Outputs`
     * . For example, if your `Outputs` defines output streams named `ExampleOutputStream1` and
     * `ExampleOutputStream2` , then your application code must create these streams.
     */
    public fun applicationCode(applicationCode: String) {
        cdkBuilder.applicationCode(applicationCode)
    }

    /** @param applicationDescription Summary description of the application. */
    public fun applicationDescription(applicationDescription: String) {
        cdkBuilder.applicationDescription(applicationDescription)
    }

    /**
     * @param applicationName Name of your Amazon Kinesis Analytics application (for example,
     *   `sample-app` ).
     */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param inputs Use this parameter to configure the application input. You can configure your
     *   application to receive input from a single streaming source. In this configuration, you map
     *   this streaming source to an in-application stream that is created. Your application code
     *   can then query the in-application stream like a table (you can think of it as a constantly
     *   updating table).
     *
     * For the streaming source, you provide its Amazon Resource Name (ARN) and format of data on
     * the stream (for example, JSON, CSV, etc.). You also must provide an IAM role that Amazon
     * Kinesis Analytics can assume to read this stream on your behalf.
     *
     * To create the in-application stream, you need to specify a schema to transform your data into
     * a schematized version used in SQL. In the schema, you provide the necessary mapping of the
     * data elements in the streaming source to record columns in the in-app stream.
     */
    public fun inputs(vararg inputs: Any) {
        _inputs.addAll(listOf(*inputs))
    }

    /**
     * @param inputs Use this parameter to configure the application input. You can configure your
     *   application to receive input from a single streaming source. In this configuration, you map
     *   this streaming source to an in-application stream that is created. Your application code
     *   can then query the in-application stream like a table (you can think of it as a constantly
     *   updating table).
     *
     * For the streaming source, you provide its Amazon Resource Name (ARN) and format of data on
     * the stream (for example, JSON, CSV, etc.). You also must provide an IAM role that Amazon
     * Kinesis Analytics can assume to read this stream on your behalf.
     *
     * To create the in-application stream, you need to specify a schema to transform your data into
     * a schematized version used in SQL. In the schema, you provide the necessary mapping of the
     * data elements in the streaming source to record columns in the in-app stream.
     */
    public fun inputs(inputs: Collection<Any>) {
        _inputs.addAll(inputs)
    }

    /**
     * @param inputs Use this parameter to configure the application input. You can configure your
     *   application to receive input from a single streaming source. In this configuration, you map
     *   this streaming source to an in-application stream that is created. Your application code
     *   can then query the in-application stream like a table (you can think of it as a constantly
     *   updating table).
     *
     * For the streaming source, you provide its Amazon Resource Name (ARN) and format of data on
     * the stream (for example, JSON, CSV, etc.). You also must provide an IAM role that Amazon
     * Kinesis Analytics can assume to read this stream on your behalf.
     *
     * To create the in-application stream, you need to specify a schema to transform your data into
     * a schematized version used in SQL. In the schema, you provide the necessary mapping of the
     * data elements in the streaming source to record columns in the in-app stream.
     */
    public fun inputs(inputs: IResolvable) {
        cdkBuilder.inputs(inputs)
    }

    public fun build(): CfnApplicationProps {
        if (_inputs.isNotEmpty()) cdkBuilder.inputs(_inputs)
        return cdkBuilder.build()
    }
}
