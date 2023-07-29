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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props
import software.constructs.Construct

public object kinesisanalytics {
    /**
     * The `AWS::KinesisAnalytics::Application` resource creates an Amazon Kinesis Data Analytics
     * application.
     *
     * For more information, see the
     * [Amazon Kinesis Data Analytics Developer Guide](https://docs.aws.amazon.com//kinesisanalytics/latest/dev/what-is.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
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
    public inline fun cfnApplication(
        scope: Construct,
        id: String,
        block: CfnApplicationDsl.() -> Unit = {},
    ): CfnApplication {
        val builder = CfnApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides additional mapping information when the record format uses delimiters, such as CSV.
     *
     * For example, the following sample records use CSV format, where the records use the *'\n'* as
     * the row delimiter and a comma (",") as the column delimiter:
     *
     * `"name1", "address1"`
     *
     * `"name2", "address2"`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CSVMappingParametersProperty cSVMappingParametersProperty =
     * CSVMappingParametersProperty.builder()
     * .recordColumnDelimiter("recordColumnDelimiter")
     * .recordRowDelimiter("recordRowDelimiter")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html)
     */
    public inline fun cfnApplicationCSVMappingParametersProperty(
        block: CfnApplicationCSVMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplication.CSVMappingParametersProperty {
        val builder = CfnApplicationCSVMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds an Amazon CloudWatch log stream to monitor application configuration errors.
     *
     * Only one *ApplicationCloudWatchLoggingOption* resource can be attached per application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CfnApplicationCloudWatchLoggingOptionV2 cfnApplicationCloudWatchLoggingOptionV2 =
     * CfnApplicationCloudWatchLoggingOptionV2.Builder.create(this,
     * "MyCfnApplicationCloudWatchLoggingOptionV2")
     * .applicationName("applicationName")
     * .cloudWatchLoggingOption(CloudWatchLoggingOptionProperty.builder()
     * .logStreamArn("logStreamArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html)
     */
    public inline fun cfnApplicationCloudWatchLoggingOptionV2(
        scope: Construct,
        id: String,
        block: CfnApplicationCloudWatchLoggingOptionV2Dsl.() -> Unit = {},
    ): CfnApplicationCloudWatchLoggingOptionV2 {
        val builder = CfnApplicationCloudWatchLoggingOptionV2Dsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
     * Resource Name (ARN).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CloudWatchLoggingOptionProperty cloudWatchLoggingOptionProperty =
     * CloudWatchLoggingOptionProperty.builder()
     * .logStreamArn("logStreamArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html)
     */
    public inline fun cfnApplicationCloudWatchLoggingOptionV2CloudWatchLoggingOptionProperty(
        block:
            CfnApplicationCloudWatchLoggingOptionV2CloudWatchLoggingOptionPropertyDsl.() -> Unit =
            {}
    ): CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty {
        val builder = CfnApplicationCloudWatchLoggingOptionV2CloudWatchLoggingOptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplicationCloudWatchLoggingOption`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CfnApplicationCloudWatchLoggingOptionV2Props cfnApplicationCloudWatchLoggingOptionV2Props =
     * CfnApplicationCloudWatchLoggingOptionV2Props.builder()
     * .applicationName("applicationName")
     * .cloudWatchLoggingOption(CloudWatchLoggingOptionProperty.builder()
     * .logStreamArn("logStreamArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html)
     */
    public inline fun cfnApplicationCloudWatchLoggingOptionV2Props(
        block: CfnApplicationCloudWatchLoggingOptionV2PropsDsl.() -> Unit = {}
    ): CfnApplicationCloudWatchLoggingOptionV2Props {
        val builder = CfnApplicationCloudWatchLoggingOptionV2PropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that contains the Amazon Resource Name (ARN) of the
     * [AWS Lambda](https://docs.aws.amazon.com/lambda/) function that is used to preprocess records
     * in the stream, and the ARN of the IAM role that is used to access the AWS Lambda function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * InputLambdaProcessorProperty inputLambdaProcessorProperty =
     * InputLambdaProcessorProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
     */
    public inline fun cfnApplicationInputLambdaProcessorProperty(
        block: CfnApplicationInputLambdaProcessorPropertyDsl.() -> Unit = {}
    ): CfnApplication.InputLambdaProcessorProperty {
        val builder = CfnApplicationInputLambdaProcessorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the number of in-application streams to create for a given streaming source.
     *
     * For information about parallelism, see
     * [Configuring Application Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * InputParallelismProperty inputParallelismProperty = InputParallelismProperty.builder()
     * .count(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputparallelism.html)
     */
    public inline fun cfnApplicationInputParallelismProperty(
        block: CfnApplicationInputParallelismPropertyDsl.() -> Unit = {}
    ): CfnApplication.InputParallelismProperty {
        val builder = CfnApplicationInputParallelismPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides a description of a processor that is used to preprocess the records in the stream
     * before being processed by your application code.
     *
     * Currently, the only input processor available is
     * [AWS Lambda](https://docs.aws.amazon.com/lambda/) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * InputProcessingConfigurationProperty inputProcessingConfigurationProperty =
     * InputProcessingConfigurationProperty.builder()
     * .inputLambdaProcessor(InputLambdaProcessorProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html)
     */
    public inline fun cfnApplicationInputProcessingConfigurationProperty(
        block: CfnApplicationInputProcessingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.InputProcessingConfigurationProperty {
        val builder = CfnApplicationInputProcessingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When you configure the application input, you specify the streaming source, the
     * in-application stream name that is created, and the mapping between the two.
     *
     * For more information, see
     * [Configuring Application Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * InputProperty inputProperty = InputProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html)
     */
    public inline fun cfnApplicationInputProperty(
        block: CfnApplicationInputPropertyDsl.() -> Unit = {}
    ): CfnApplication.InputProperty {
        val builder = CfnApplicationInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the format of the data in the streaming source, and how each data element maps to
     * corresponding columns in the in-application stream that is being created.
     *
     * Also used to describe the format of the reference data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * InputSchemaProperty inputSchemaProperty = InputSchemaProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html)
     */
    public inline fun cfnApplicationInputSchemaProperty(
        block: CfnApplicationInputSchemaPropertyDsl.() -> Unit = {}
    ): CfnApplication.InputSchemaProperty {
        val builder = CfnApplicationInputSchemaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides additional mapping information when JSON is the record format on the streaming
     * source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * JSONMappingParametersProperty jSONMappingParametersProperty =
     * JSONMappingParametersProperty.builder()
     * .recordRowPath("recordRowPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-jsonmappingparameters.html)
     */
    public inline fun cfnApplicationJSONMappingParametersProperty(
        block: CfnApplicationJSONMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplication.JSONMappingParametersProperty {
        val builder = CfnApplicationJSONMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies an Amazon Kinesis Firehose delivery stream as the streaming source.
     *
     * You provide the delivery stream's Amazon Resource Name (ARN) and an IAM role ARN that enables
     * Amazon Kinesis Analytics to access the stream on your behalf.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * KinesisFirehoseInputProperty kinesisFirehoseInputProperty =
     * KinesisFirehoseInputProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html)
     */
    public inline fun cfnApplicationKinesisFirehoseInputProperty(
        block: CfnApplicationKinesisFirehoseInputPropertyDsl.() -> Unit = {}
    ): CfnApplication.KinesisFirehoseInputProperty {
        val builder = CfnApplicationKinesisFirehoseInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies an Amazon Kinesis stream as the streaming source.
     *
     * You provide the stream's Amazon Resource Name (ARN) and an IAM role ARN that enables Amazon
     * Kinesis Analytics to access the stream on your behalf.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * KinesisStreamsInputProperty kinesisStreamsInputProperty = KinesisStreamsInputProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisstreamsinput.html)
     */
    public inline fun cfnApplicationKinesisStreamsInputProperty(
        block: CfnApplicationKinesisStreamsInputPropertyDsl.() -> Unit = {}
    ): CfnApplication.KinesisStreamsInputProperty {
        val builder = CfnApplicationKinesisStreamsInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When configuring application input at the time of creating or updating an application,
     * provides additional mapping information specific to the record format (such as JSON, CSV, or
     * record fields delimited by some delimiter) on the streaming source.
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
    public inline fun cfnApplicationMappingParametersProperty(
        block: CfnApplicationMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplication.MappingParametersProperty {
        val builder = CfnApplicationMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds an external destination to your Amazon Kinesis Analytics application.
     *
     * If you want Amazon Kinesis Analytics to deliver data from an in-application stream within
     * your application to an external destination (such as an Amazon Kinesis stream, an Amazon
     * Kinesis Firehose delivery stream, or an Amazon Lambda function), you add the relevant
     * configuration to your application using this operation. You can configure one or more outputs
     * for your application. Each output configuration maps an in-application stream and an external
     * destination.
     *
     * You can use one of the output configurations to deliver data from your in-application error
     * stream to an external destination so that you can analyze the errors. For more information,
     * see
     * [Understanding Application Output (Destination)](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html)
     * .
     *
     * Any configuration update, including adding a streaming source using this operation, results
     * in a new version of the application. You can use the `DescribeApplication` operation to find
     * the current application version.
     *
     * For the limits on the number of application inputs and outputs you can configure, see
     * [Limits](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html) .
     *
     * This operation requires permissions to perform the `kinesisanalytics:AddApplicationOutput`
     * action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CfnApplicationOutput cfnApplicationOutput = CfnApplicationOutput.Builder.create(this,
     * "MyCfnApplicationOutput")
     * .applicationName("applicationName")
     * .output(OutputProperty.builder()
     * .destinationSchema(DestinationSchemaProperty.builder()
     * .recordFormatType("recordFormatType")
     * .build())
     * // the properties below are optional
     * .kinesisFirehoseOutput(KinesisFirehoseOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build())
     * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build())
     * .lambdaOutput(LambdaOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build())
     * .name("name")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html)
     */
    public inline fun cfnApplicationOutput(
        scope: Construct,
        id: String,
        block: CfnApplicationOutputDsl.() -> Unit = {},
    ): CfnApplicationOutput {
        val builder = CfnApplicationOutputDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the data format when records are written to the destination.
     *
     * For more information, see
     * [Configuring Application Output](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * DestinationSchemaProperty destinationSchemaProperty = DestinationSchemaProperty.builder()
     * .recordFormatType("recordFormatType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html)
     */
    public inline fun cfnApplicationOutputDestinationSchemaProperty(
        block: CfnApplicationOutputDestinationSchemaPropertyDsl.() -> Unit = {}
    ): CfnApplicationOutput.DestinationSchemaProperty {
        val builder = CfnApplicationOutputDestinationSchemaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When configuring application output, identifies an Amazon Kinesis Firehose delivery stream as
     * the destination.
     *
     * You provide the stream Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis
     * Analytics to write to the stream on your behalf.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * KinesisFirehoseOutputProperty kinesisFirehoseOutputProperty =
     * KinesisFirehoseOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html)
     */
    public inline fun cfnApplicationOutputKinesisFirehoseOutputProperty(
        block: CfnApplicationOutputKinesisFirehoseOutputPropertyDsl.() -> Unit = {}
    ): CfnApplicationOutput.KinesisFirehoseOutputProperty {
        val builder = CfnApplicationOutputKinesisFirehoseOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When configuring application output, identifies an Amazon Kinesis stream as the destination.
     *
     * You provide the stream Amazon Resource Name (ARN) and also an IAM role ARN that Amazon
     * Kinesis Analytics can use to write to the stream on your behalf.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * KinesisStreamsOutputProperty kinesisStreamsOutputProperty =
     * KinesisStreamsOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html)
     */
    public inline fun cfnApplicationOutputKinesisStreamsOutputProperty(
        block: CfnApplicationOutputKinesisStreamsOutputPropertyDsl.() -> Unit = {}
    ): CfnApplicationOutput.KinesisStreamsOutputProperty {
        val builder = CfnApplicationOutputKinesisStreamsOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When configuring application output, identifies an AWS Lambda function as the destination.
     *
     * You provide the function Amazon Resource Name (ARN) and also an IAM role ARN that Amazon
     * Kinesis Analytics can use to write to the function on your behalf.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * LambdaOutputProperty lambdaOutputProperty = LambdaOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html)
     */
    public inline fun cfnApplicationOutputLambdaOutputProperty(
        block: CfnApplicationOutputLambdaOutputPropertyDsl.() -> Unit = {}
    ): CfnApplicationOutput.LambdaOutputProperty {
        val builder = CfnApplicationOutputLambdaOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes application output configuration in which you identify an in-application stream and
     * a destination where you want the in-application stream data to be written.
     *
     * The destination can be an Amazon Kinesis stream or an Amazon Kinesis Firehose delivery
     * stream.
     *
     * For limits on how many destinations an application can write and other limitations, see
     * [Limits](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * OutputProperty outputProperty = OutputProperty.builder()
     * .destinationSchema(DestinationSchemaProperty.builder()
     * .recordFormatType("recordFormatType")
     * .build())
     * // the properties below are optional
     * .kinesisFirehoseOutput(KinesisFirehoseOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build())
     * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build())
     * .lambdaOutput(LambdaOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build())
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html)
     */
    public inline fun cfnApplicationOutputOutputProperty(
        block: CfnApplicationOutputOutputPropertyDsl.() -> Unit = {}
    ): CfnApplicationOutput.OutputProperty {
        val builder = CfnApplicationOutputOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplicationOutput`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CfnApplicationOutputProps cfnApplicationOutputProps = CfnApplicationOutputProps.builder()
     * .applicationName("applicationName")
     * .output(OutputProperty.builder()
     * .destinationSchema(DestinationSchemaProperty.builder()
     * .recordFormatType("recordFormatType")
     * .build())
     * // the properties below are optional
     * .kinesisFirehoseOutput(KinesisFirehoseOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build())
     * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build())
     * .lambdaOutput(LambdaOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .roleArn("roleArn")
     * .build())
     * .name("name")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html)
     */
    public inline fun cfnApplicationOutputProps(
        block: CfnApplicationOutputPropsDsl.() -> Unit = {}
    ): CfnApplicationOutputProps {
        val builder = CfnApplicationOutputPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds an external destination to your SQL-based Amazon Kinesis Data Analytics application.
     *
     * If you want Kinesis Data Analytics to deliver data from an in-application stream within your
     * application to an external destination (such as an Kinesis data stream, a Kinesis Data
     * Firehose delivery stream, or an Amazon Lambda function), you add the relevant configuration
     * to your application using this operation. You can configure one or more outputs for your
     * application. Each output configuration maps an in-application stream and an external
     * destination.
     *
     * You can use one of the output configurations to deliver data from your in-application error
     * stream to an external destination so that you can analyze the errors.
     *
     * Any configuration update, including adding a streaming source using this operation, results
     * in a new version of the application. You can use the
     * [DescribeApplication](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_DescribeApplication.html)
     * operation to find the current application version.
     *
     * Creation of multiple outputs should be sequential (use of DependsOn) to avoid a problem with
     * a stale application version ( *ConcurrentModificationException* ).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CfnApplicationOutputV2 cfnApplicationOutputV2 = CfnApplicationOutputV2.Builder.create(this,
     * "MyCfnApplicationOutputV2")
     * .applicationName("applicationName")
     * .output(OutputProperty.builder()
     * .destinationSchema(DestinationSchemaProperty.builder()
     * .recordFormatType("recordFormatType")
     * .build())
     * // the properties below are optional
     * .kinesisFirehoseOutput(KinesisFirehoseOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .lambdaOutput(LambdaOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .name("name")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html)
     */
    public inline fun cfnApplicationOutputV2(
        scope: Construct,
        id: String,
        block: CfnApplicationOutputV2Dsl.() -> Unit = {},
    ): CfnApplicationOutputV2 {
        val builder = CfnApplicationOutputV2Dsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the data format when records are written to the destination in a SQL-based Kinesis
     * Data Analytics application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * DestinationSchemaProperty destinationSchemaProperty = DestinationSchemaProperty.builder()
     * .recordFormatType("recordFormatType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html)
     */
    public inline fun cfnApplicationOutputV2DestinationSchemaProperty(
        block: CfnApplicationOutputV2DestinationSchemaPropertyDsl.() -> Unit = {}
    ): CfnApplicationOutputV2.DestinationSchemaProperty {
        val builder = CfnApplicationOutputV2DestinationSchemaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, when configuring application output,
     * identifies a Kinesis Data Firehose delivery stream as the destination.
     *
     * You provide the stream Amazon Resource Name (ARN) of the delivery stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * KinesisFirehoseOutputProperty kinesisFirehoseOutputProperty =
     * KinesisFirehoseOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisfirehoseoutput.html)
     */
    public inline fun cfnApplicationOutputV2KinesisFirehoseOutputProperty(
        block: CfnApplicationOutputV2KinesisFirehoseOutputPropertyDsl.() -> Unit = {}
    ): CfnApplicationOutputV2.KinesisFirehoseOutputProperty {
        val builder = CfnApplicationOutputV2KinesisFirehoseOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When you configure a SQL-based Kinesis Data Analytics application's output, identifies a
     * Kinesis data stream as the destination.
     *
     * You provide the stream Amazon Resource Name (ARN).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * KinesisStreamsOutputProperty kinesisStreamsOutputProperty =
     * KinesisStreamsOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html)
     */
    public inline fun cfnApplicationOutputV2KinesisStreamsOutputProperty(
        block: CfnApplicationOutputV2KinesisStreamsOutputPropertyDsl.() -> Unit = {}
    ): CfnApplicationOutputV2.KinesisStreamsOutputProperty {
        val builder = CfnApplicationOutputV2KinesisStreamsOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When you configure a SQL-based Kinesis Data Analytics application's output, identifies an
     * Amazon Lambda function as the destination.
     *
     * You provide the function Amazon Resource Name (ARN) of the Lambda function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * LambdaOutputProperty lambdaOutputProperty = LambdaOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-lambdaoutput.html)
     */
    public inline fun cfnApplicationOutputV2LambdaOutputProperty(
        block: CfnApplicationOutputV2LambdaOutputPropertyDsl.() -> Unit = {}
    ): CfnApplicationOutputV2.LambdaOutputProperty {
        val builder = CfnApplicationOutputV2LambdaOutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
     * identify an in-application stream and a destination where you want the in-application stream
     * data to be written.
     *
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * OutputProperty outputProperty = OutputProperty.builder()
     * .destinationSchema(DestinationSchemaProperty.builder()
     * .recordFormatType("recordFormatType")
     * .build())
     * // the properties below are optional
     * .kinesisFirehoseOutput(KinesisFirehoseOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .lambdaOutput(LambdaOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html)
     */
    public inline fun cfnApplicationOutputV2OutputProperty(
        block: CfnApplicationOutputV2OutputPropertyDsl.() -> Unit = {}
    ): CfnApplicationOutputV2.OutputProperty {
        val builder = CfnApplicationOutputV2OutputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplicationOutput`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CfnApplicationOutputV2Props cfnApplicationOutputV2Props = CfnApplicationOutputV2Props.builder()
     * .applicationName("applicationName")
     * .output(OutputProperty.builder()
     * .destinationSchema(DestinationSchemaProperty.builder()
     * .recordFormatType("recordFormatType")
     * .build())
     * // the properties below are optional
     * .kinesisFirehoseOutput(KinesisFirehoseOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .lambdaOutput(LambdaOutputProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .name("name")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html)
     */
    public inline fun cfnApplicationOutputV2Props(
        block: CfnApplicationOutputV2PropsDsl.() -> Unit = {}
    ): CfnApplicationOutputV2Props {
        val builder = CfnApplicationOutputV2PropsDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnApplicationProps(
        block: CfnApplicationPropsDsl.() -> Unit = {}
    ): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the mapping of each data element in the streaming source to the corresponding
     * column in the in-application stream.
     *
     * Also used to describe the format of the reference data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * RecordColumnProperty recordColumnProperty = RecordColumnProperty.builder()
     * .name("name")
     * .sqlType("sqlType")
     * // the properties below are optional
     * .mapping("mapping")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html)
     */
    public inline fun cfnApplicationRecordColumnProperty(
        block: CfnApplicationRecordColumnPropertyDsl.() -> Unit = {}
    ): CfnApplication.RecordColumnProperty {
        val builder = CfnApplicationRecordColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the record format and relevant mapping information that should be applied to
     * schematize the records on the stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * RecordFormatProperty recordFormatProperty = RecordFormatProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html)
     */
    public inline fun cfnApplicationRecordFormatProperty(
        block: CfnApplicationRecordFormatPropertyDsl.() -> Unit = {}
    ): CfnApplication.RecordFormatProperty {
        val builder = CfnApplicationRecordFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds a reference data source to an existing application.
     *
     * Amazon Kinesis Analytics reads reference data (that is, an Amazon S3 object) and creates an
     * in-application table within your application. In the request, you provide the source (S3
     * bucket name and object key name), name of the in-application table to create, and the
     * necessary mapping information that describes how data in Amazon S3 object maps to columns in
     * the resulting in-application table.
     *
     * For conceptual information, see
     * [Configuring Application Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html)
     * . For the limits on data sources you can add to your application, see
     * [Limits](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html) .
     *
     * This operation requires permissions to perform the `kinesisanalytics:AddApplicationOutput`
     * action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CfnApplicationReferenceDataSource cfnApplicationReferenceDataSource =
     * CfnApplicationReferenceDataSource.Builder.create(this, "MyCfnApplicationReferenceDataSource")
     * .applicationName("applicationName")
     * .referenceDataSource(ReferenceDataSourceProperty.builder()
     * .referenceSchema(ReferenceSchemaProperty.builder()
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
     * // the properties below are optional
     * .s3ReferenceDataSource(S3ReferenceDataSourceProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * .referenceRoleArn("referenceRoleArn")
     * .build())
     * .tableName("tableName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html)
     */
    public inline fun cfnApplicationReferenceDataSource(
        scope: Construct,
        id: String,
        block: CfnApplicationReferenceDataSourceDsl.() -> Unit = {},
    ): CfnApplicationReferenceDataSource {
        val builder = CfnApplicationReferenceDataSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides additional mapping information when the record format uses delimiters, such as CSV.
     *
     * For example, the following sample records use CSV format, where the records use the *'\n'* as
     * the row delimiter and a comma (",") as the column delimiter:
     *
     * `"name1", "address1"`
     *
     * `"name2", "address2"`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CSVMappingParametersProperty cSVMappingParametersProperty =
     * CSVMappingParametersProperty.builder()
     * .recordColumnDelimiter("recordColumnDelimiter")
     * .recordRowDelimiter("recordRowDelimiter")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html)
     */
    public inline fun cfnApplicationReferenceDataSourceCSVMappingParametersProperty(
        block: CfnApplicationReferenceDataSourceCSVMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.CSVMappingParametersProperty {
        val builder = CfnApplicationReferenceDataSourceCSVMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides additional mapping information when JSON is the record format on the streaming
     * source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * JSONMappingParametersProperty jSONMappingParametersProperty =
     * JSONMappingParametersProperty.builder()
     * .recordRowPath("recordRowPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters.html)
     */
    public inline fun cfnApplicationReferenceDataSourceJSONMappingParametersProperty(
        block: CfnApplicationReferenceDataSourceJSONMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.JSONMappingParametersProperty {
        val builder = CfnApplicationReferenceDataSourceJSONMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When configuring application input at the time of creating or updating an application,
     * provides additional mapping information specific to the record format (such as JSON, CSV, or
     * record fields delimited by some delimiter) on the streaming source.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html)
     */
    public inline fun cfnApplicationReferenceDataSourceMappingParametersProperty(
        block: CfnApplicationReferenceDataSourceMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.MappingParametersProperty {
        val builder = CfnApplicationReferenceDataSourceMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplicationReferenceDataSource`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CfnApplicationReferenceDataSourceProps cfnApplicationReferenceDataSourceProps =
     * CfnApplicationReferenceDataSourceProps.builder()
     * .applicationName("applicationName")
     * .referenceDataSource(ReferenceDataSourceProperty.builder()
     * .referenceSchema(ReferenceSchemaProperty.builder()
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
     * // the properties below are optional
     * .s3ReferenceDataSource(S3ReferenceDataSourceProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * .referenceRoleArn("referenceRoleArn")
     * .build())
     * .tableName("tableName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html)
     */
    public inline fun cfnApplicationReferenceDataSourceProps(
        block: CfnApplicationReferenceDataSourcePropsDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSourceProps {
        val builder = CfnApplicationReferenceDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the mapping of each data element in the streaming source to the corresponding
     * column in the in-application stream.
     *
     * Also used to describe the format of the reference data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * RecordColumnProperty recordColumnProperty = RecordColumnProperty.builder()
     * .name("name")
     * .sqlType("sqlType")
     * // the properties below are optional
     * .mapping("mapping")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html)
     */
    public inline fun cfnApplicationReferenceDataSourceRecordColumnProperty(
        block: CfnApplicationReferenceDataSourceRecordColumnPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.RecordColumnProperty {
        val builder = CfnApplicationReferenceDataSourceRecordColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the record format and relevant mapping information that should be applied to
     * schematize the records on the stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * RecordFormatProperty recordFormatProperty = RecordFormatProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html)
     */
    public inline fun cfnApplicationReferenceDataSourceRecordFormatProperty(
        block: CfnApplicationReferenceDataSourceRecordFormatPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.RecordFormatProperty {
        val builder = CfnApplicationReferenceDataSourceRecordFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the reference data source by providing the source information (S3 bucket name and
     * object key name), the resulting in-application table name that is created, and the necessary
     * schema to map the data elements in the Amazon S3 object to the in-application table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * ReferenceDataSourceProperty referenceDataSourceProperty = ReferenceDataSourceProperty.builder()
     * .referenceSchema(ReferenceSchemaProperty.builder()
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
     * // the properties below are optional
     * .s3ReferenceDataSource(S3ReferenceDataSourceProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * .referenceRoleArn("referenceRoleArn")
     * .build())
     * .tableName("tableName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html)
     */
    public inline fun cfnApplicationReferenceDataSourceReferenceDataSourceProperty(
        block: CfnApplicationReferenceDataSourceReferenceDataSourcePropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.ReferenceDataSourceProperty {
        val builder = CfnApplicationReferenceDataSourceReferenceDataSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The ReferenceSchema property type specifies the format of the data in the reference source
     * for a SQL-based Amazon Kinesis Data Analytics application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * ReferenceSchemaProperty referenceSchemaProperty = ReferenceSchemaProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html)
     */
    public inline fun cfnApplicationReferenceDataSourceReferenceSchemaProperty(
        block: CfnApplicationReferenceDataSourceReferenceSchemaPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.ReferenceSchemaProperty {
        val builder = CfnApplicationReferenceDataSourceReferenceSchemaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies the S3 bucket and object that contains the reference data.
     *
     * Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on your
     * behalf.
     *
     * An Amazon Kinesis Analytics application loads reference data only once. If the data changes,
     * you call the
     * [UpdateApplication](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_UpdateApplication.html)
     * operation to trigger reloading of data into your application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * S3ReferenceDataSourceProperty s3ReferenceDataSourceProperty =
     * S3ReferenceDataSourceProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * .referenceRoleArn("referenceRoleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html)
     */
    public inline fun cfnApplicationReferenceDataSourceS3ReferenceDataSourceProperty(
        block: CfnApplicationReferenceDataSourceS3ReferenceDataSourcePropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty {
        val builder = CfnApplicationReferenceDataSourceS3ReferenceDataSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds a reference data source to an existing SQL-based Kinesis Data Analytics application.
     *
     * Kinesis Data Analytics reads reference data (that is, an Amazon S3 object) and creates an
     * in-application table within your application. In the request, you provide the source (S3
     * bucket name and object key name), name of the in-application table to create, and the
     * necessary mapping information that describes how data in an Amazon S3 object maps to columns
     * in the resulting in-application table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CfnApplicationReferenceDataSourceV2 cfnApplicationReferenceDataSourceV2 =
     * CfnApplicationReferenceDataSourceV2.Builder.create(this, "MyCfnApplicationReferenceDataSourceV2")
     * .applicationName("applicationName")
     * .referenceDataSource(ReferenceDataSourceProperty.builder()
     * .referenceSchema(ReferenceSchemaProperty.builder()
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
     * // the properties below are optional
     * .s3ReferenceDataSource(S3ReferenceDataSourceProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * .build())
     * .tableName("tableName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html)
     */
    public inline fun cfnApplicationReferenceDataSourceV2(
        scope: Construct,
        id: String,
        block: CfnApplicationReferenceDataSourceV2Dsl.() -> Unit = {},
    ): CfnApplicationReferenceDataSourceV2 {
        val builder = CfnApplicationReferenceDataSourceV2Dsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, provides additional mapping information
     * when the record format uses delimiters, such as CSV.
     *
     * For example, the following sample records use CSV format, where the records use the *'\n'* as
     * the row delimiter and a comma (",") as the column delimiter:
     *
     * `"name1", "address1"`
     *
     * `"name2", "address2"`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CSVMappingParametersProperty cSVMappingParametersProperty =
     * CSVMappingParametersProperty.builder()
     * .recordColumnDelimiter("recordColumnDelimiter")
     * .recordRowDelimiter("recordRowDelimiter")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html)
     */
    public inline fun cfnApplicationReferenceDataSourceV2CSVMappingParametersProperty(
        block: CfnApplicationReferenceDataSourceV2CSVMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty {
        val builder = CfnApplicationReferenceDataSourceV2CSVMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, provides additional mapping information
     * when JSON is the record format on the streaming source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * JSONMappingParametersProperty jSONMappingParametersProperty =
     * JSONMappingParametersProperty.builder()
     * .recordRowPath("recordRowPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html)
     */
    public inline fun cfnApplicationReferenceDataSourceV2JSONMappingParametersProperty(
        block: CfnApplicationReferenceDataSourceV2JSONMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty {
        val builder = CfnApplicationReferenceDataSourceV2JSONMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When you configure a SQL-based Kinesis Data Analytics application's input at the time of
     * creating or updating an application, provides additional mapping information specific to the
     * record format (such as JSON, CSV, or record fields delimited by some delimiter) on the
     * streaming source.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-mappingparameters.html)
     */
    public inline fun cfnApplicationReferenceDataSourceV2MappingParametersProperty(
        block: CfnApplicationReferenceDataSourceV2MappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSourceV2.MappingParametersProperty {
        val builder = CfnApplicationReferenceDataSourceV2MappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplicationReferenceDataSource`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CfnApplicationReferenceDataSourceV2Props cfnApplicationReferenceDataSourceV2Props =
     * CfnApplicationReferenceDataSourceV2Props.builder()
     * .applicationName("applicationName")
     * .referenceDataSource(ReferenceDataSourceProperty.builder()
     * .referenceSchema(ReferenceSchemaProperty.builder()
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
     * // the properties below are optional
     * .s3ReferenceDataSource(S3ReferenceDataSourceProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * .build())
     * .tableName("tableName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html)
     */
    public inline fun cfnApplicationReferenceDataSourceV2Props(
        block: CfnApplicationReferenceDataSourceV2PropsDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSourceV2Props {
        val builder = CfnApplicationReferenceDataSourceV2PropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the mapping of each data
     * element in the streaming source to the corresponding column in the in-application stream.
     *
     * Also used to describe the format of the reference data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * RecordColumnProperty recordColumnProperty = RecordColumnProperty.builder()
     * .name("name")
     * .sqlType("sqlType")
     * // the properties below are optional
     * .mapping("mapping")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn.html)
     */
    public inline fun cfnApplicationReferenceDataSourceV2RecordColumnProperty(
        block: CfnApplicationReferenceDataSourceV2RecordColumnPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSourceV2.RecordColumnProperty {
        val builder = CfnApplicationReferenceDataSourceV2RecordColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the record format and relevant
     * mapping information that should be applied to schematize the records on the stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * RecordFormatProperty recordFormatProperty = RecordFormatProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html)
     */
    public inline fun cfnApplicationReferenceDataSourceV2RecordFormatProperty(
        block: CfnApplicationReferenceDataSourceV2RecordFormatPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSourceV2.RecordFormatProperty {
        val builder = CfnApplicationReferenceDataSourceV2RecordFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
     * providing the source information (Amazon S3 bucket name and object key name), the resulting
     * in-application table name that is created, and the necessary schema to map the data elements
     * in the Amazon S3 object to the in-application table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * ReferenceDataSourceProperty referenceDataSourceProperty = ReferenceDataSourceProperty.builder()
     * .referenceSchema(ReferenceSchemaProperty.builder()
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
     * // the properties below are optional
     * .s3ReferenceDataSource(S3ReferenceDataSourceProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * .build())
     * .tableName("tableName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html)
     */
    public inline fun cfnApplicationReferenceDataSourceV2ReferenceDataSourceProperty(
        block: CfnApplicationReferenceDataSourceV2ReferenceDataSourcePropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty {
        val builder = CfnApplicationReferenceDataSourceV2ReferenceDataSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the format of the data in the
     * streaming source, and how each data element maps to corresponding columns created in the
     * in-application stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * ReferenceSchemaProperty referenceSchemaProperty = ReferenceSchemaProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referenceschema.html)
     */
    public inline fun cfnApplicationReferenceDataSourceV2ReferenceSchemaProperty(
        block: CfnApplicationReferenceDataSourceV2ReferenceSchemaPropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty {
        val builder = CfnApplicationReferenceDataSourceV2ReferenceSchemaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For an SQL-based Amazon Kinesis Data Analytics application, identifies the Amazon S3 bucket
     * and object that contains the reference data.
     *
     * A Kinesis Data Analytics application loads reference data only once. If the data changes, you
     * call the
     * [UpdateApplication](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_UpdateApplication.html)
     * operation to trigger reloading of data into your application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * S3ReferenceDataSourceProperty s3ReferenceDataSourceProperty =
     * S3ReferenceDataSourceProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource.html)
     */
    public inline fun cfnApplicationReferenceDataSourceV2S3ReferenceDataSourceProperty(
        block: CfnApplicationReferenceDataSourceV2S3ReferenceDataSourcePropertyDsl.() -> Unit = {}
    ): CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty {
        val builder = CfnApplicationReferenceDataSourceV2S3ReferenceDataSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an Amazon Kinesis Data Analytics application.
     *
     * For information about creating a Kinesis Data Analytics application, see
     * [Creating an Application](https://docs.aws.amazon.com/kinesisanalytics/latest/java/getting-started.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CfnApplicationV2 cfnApplicationV2 = CfnApplicationV2.Builder.create(this, "MyCfnApplicationV2")
     * .runtimeEnvironment("runtimeEnvironment")
     * .serviceExecutionRole("serviceExecutionRole")
     * // the properties below are optional
     * .applicationConfiguration(ApplicationConfigurationProperty.builder()
     * .applicationCodeConfiguration(ApplicationCodeConfigurationProperty.builder()
     * .codeContent(CodeContentProperty.builder()
     * .s3ContentLocation(S3ContentLocationProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * // the properties below are optional
     * .objectVersion("objectVersion")
     * .build())
     * .textContent("textContent")
     * .zipFileContent("zipFileContent")
     * .build())
     * .codeContentType("codeContentType")
     * .build())
     * .applicationSnapshotConfiguration(ApplicationSnapshotConfigurationProperty.builder()
     * .snapshotsEnabled(false)
     * .build())
     * .environmentProperties(EnvironmentPropertiesProperty.builder()
     * .propertyGroups(List.of(PropertyGroupProperty.builder()
     * .propertyGroupId("propertyGroupId")
     * .propertyMap(Map.of(
     * "propertyMapKey", "propertyMap"))
     * .build()))
     * .build())
     * .flinkApplicationConfiguration(FlinkApplicationConfigurationProperty.builder()
     * .checkpointConfiguration(CheckpointConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .checkpointingEnabled(false)
     * .checkpointInterval(123)
     * .minPauseBetweenCheckpoints(123)
     * .build())
     * .monitoringConfiguration(MonitoringConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .logLevel("logLevel")
     * .metricsLevel("metricsLevel")
     * .build())
     * .parallelismConfiguration(ParallelismConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .autoScalingEnabled(false)
     * .parallelism(123)
     * .parallelismPerKpu(123)
     * .build())
     * .build())
     * .sqlApplicationConfiguration(SqlApplicationConfigurationProperty.builder()
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
     * .build())
     * .vpcConfigurations(List.of(VpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build()))
     * .zeppelinApplicationConfiguration(ZeppelinApplicationConfigurationProperty.builder()
     * .catalogConfiguration(CatalogConfigurationProperty.builder()
     * .glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty.builder()
     * .databaseArn("databaseArn")
     * .build())
     * .build())
     * .customArtifactsConfiguration(List.of(CustomArtifactConfigurationProperty.builder()
     * .artifactType("artifactType")
     * // the properties below are optional
     * .mavenReference(MavenReferenceProperty.builder()
     * .artifactId("artifactId")
     * .groupId("groupId")
     * .version("version")
     * .build())
     * .s3ContentLocation(S3ContentLocationProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * // the properties below are optional
     * .objectVersion("objectVersion")
     * .build())
     * .build()))
     * .deployAsApplicationConfiguration(DeployAsApplicationConfigurationProperty.builder()
     * .s3ContentLocation(S3ContentBaseLocationProperty.builder()
     * .bucketArn("bucketArn")
     * // the properties below are optional
     * .basePath("basePath")
     * .build())
     * .build())
     * .monitoringConfiguration(ZeppelinMonitoringConfigurationProperty.builder()
     * .logLevel("logLevel")
     * .build())
     * .build())
     * .build())
     * .applicationDescription("applicationDescription")
     * .applicationMaintenanceConfiguration(ApplicationMaintenanceConfigurationProperty.builder()
     * .applicationMaintenanceWindowStartTime("applicationMaintenanceWindowStartTime")
     * .build())
     * .applicationMode("applicationMode")
     * .applicationName("applicationName")
     * .runConfiguration(RunConfigurationProperty.builder()
     * .applicationRestoreConfiguration(ApplicationRestoreConfigurationProperty.builder()
     * .applicationRestoreType("applicationRestoreType")
     * // the properties below are optional
     * .snapshotName("snapshotName")
     * .build())
     * .flinkRunConfiguration(FlinkRunConfigurationProperty.builder()
     * .allowNonRestoredState(false)
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html)
     */
    public inline fun cfnApplicationV2(
        scope: Construct,
        id: String,
        block: CfnApplicationV2Dsl.() -> Unit = {},
    ): CfnApplicationV2 {
        val builder = CfnApplicationV2Dsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes code configuration for an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * ApplicationCodeConfigurationProperty applicationCodeConfigurationProperty =
     * ApplicationCodeConfigurationProperty.builder()
     * .codeContent(CodeContentProperty.builder()
     * .s3ContentLocation(S3ContentLocationProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * // the properties below are optional
     * .objectVersion("objectVersion")
     * .build())
     * .textContent("textContent")
     * .zipFileContent("zipFileContent")
     * .build())
     * .codeContentType("codeContentType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html)
     */
    public inline fun cfnApplicationV2ApplicationCodeConfigurationProperty(
        block: CfnApplicationV2ApplicationCodeConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.ApplicationCodeConfigurationProperty {
        val builder = CfnApplicationV2ApplicationCodeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the creation parameters for a Kinesis Data Analytics application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * ApplicationConfigurationProperty applicationConfigurationProperty =
     * ApplicationConfigurationProperty.builder()
     * .applicationCodeConfiguration(ApplicationCodeConfigurationProperty.builder()
     * .codeContent(CodeContentProperty.builder()
     * .s3ContentLocation(S3ContentLocationProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * // the properties below are optional
     * .objectVersion("objectVersion")
     * .build())
     * .textContent("textContent")
     * .zipFileContent("zipFileContent")
     * .build())
     * .codeContentType("codeContentType")
     * .build())
     * .applicationSnapshotConfiguration(ApplicationSnapshotConfigurationProperty.builder()
     * .snapshotsEnabled(false)
     * .build())
     * .environmentProperties(EnvironmentPropertiesProperty.builder()
     * .propertyGroups(List.of(PropertyGroupProperty.builder()
     * .propertyGroupId("propertyGroupId")
     * .propertyMap(Map.of(
     * "propertyMapKey", "propertyMap"))
     * .build()))
     * .build())
     * .flinkApplicationConfiguration(FlinkApplicationConfigurationProperty.builder()
     * .checkpointConfiguration(CheckpointConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .checkpointingEnabled(false)
     * .checkpointInterval(123)
     * .minPauseBetweenCheckpoints(123)
     * .build())
     * .monitoringConfiguration(MonitoringConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .logLevel("logLevel")
     * .metricsLevel("metricsLevel")
     * .build())
     * .parallelismConfiguration(ParallelismConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .autoScalingEnabled(false)
     * .parallelism(123)
     * .parallelismPerKpu(123)
     * .build())
     * .build())
     * .sqlApplicationConfiguration(SqlApplicationConfigurationProperty.builder()
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
     * .build())
     * .vpcConfigurations(List.of(VpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build()))
     * .zeppelinApplicationConfiguration(ZeppelinApplicationConfigurationProperty.builder()
     * .catalogConfiguration(CatalogConfigurationProperty.builder()
     * .glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty.builder()
     * .databaseArn("databaseArn")
     * .build())
     * .build())
     * .customArtifactsConfiguration(List.of(CustomArtifactConfigurationProperty.builder()
     * .artifactType("artifactType")
     * // the properties below are optional
     * .mavenReference(MavenReferenceProperty.builder()
     * .artifactId("artifactId")
     * .groupId("groupId")
     * .version("version")
     * .build())
     * .s3ContentLocation(S3ContentLocationProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * // the properties below are optional
     * .objectVersion("objectVersion")
     * .build())
     * .build()))
     * .deployAsApplicationConfiguration(DeployAsApplicationConfigurationProperty.builder()
     * .s3ContentLocation(S3ContentBaseLocationProperty.builder()
     * .bucketArn("bucketArn")
     * // the properties below are optional
     * .basePath("basePath")
     * .build())
     * .build())
     * .monitoringConfiguration(ZeppelinMonitoringConfigurationProperty.builder()
     * .logLevel("logLevel")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html)
     */
    public inline fun cfnApplicationV2ApplicationConfigurationProperty(
        block: CfnApplicationV2ApplicationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.ApplicationConfigurationProperty {
        val builder = CfnApplicationV2ApplicationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the maintence window parameters for a Kinesis Data Analytics application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * ApplicationMaintenanceConfigurationProperty applicationMaintenanceConfigurationProperty =
     * ApplicationMaintenanceConfigurationProperty.builder()
     * .applicationMaintenanceWindowStartTime("applicationMaintenanceWindowStartTime")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationmaintenanceconfiguration.html)
     */
    public inline fun cfnApplicationV2ApplicationMaintenanceConfigurationProperty(
        block: CfnApplicationV2ApplicationMaintenanceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.ApplicationMaintenanceConfigurationProperty {
        val builder = CfnApplicationV2ApplicationMaintenanceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the method and snapshot to use when restarting an application using previously
     * saved application state.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * ApplicationRestoreConfigurationProperty applicationRestoreConfigurationProperty =
     * ApplicationRestoreConfigurationProperty.builder()
     * .applicationRestoreType("applicationRestoreType")
     * // the properties below are optional
     * .snapshotName("snapshotName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationrestoreconfiguration.html)
     */
    public inline fun cfnApplicationV2ApplicationRestoreConfigurationProperty(
        block: CfnApplicationV2ApplicationRestoreConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.ApplicationRestoreConfigurationProperty {
        val builder = CfnApplicationV2ApplicationRestoreConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * ApplicationSnapshotConfigurationProperty applicationSnapshotConfigurationProperty =
     * ApplicationSnapshotConfigurationProperty.builder()
     * .snapshotsEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html)
     */
    public inline fun cfnApplicationV2ApplicationSnapshotConfigurationProperty(
        block: CfnApplicationV2ApplicationSnapshotConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.ApplicationSnapshotConfigurationProperty {
        val builder = CfnApplicationV2ApplicationSnapshotConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, provides additional mapping information
     * when the record format uses delimiters, such as CSV.
     *
     * For example, the following sample records use CSV format, where the records use the *'\n'* as
     * the row delimiter and a comma (",") as the column delimiter:
     *
     * `"name1", "address1"`
     *
     * `"name2", "address2"`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CSVMappingParametersProperty cSVMappingParametersProperty =
     * CSVMappingParametersProperty.builder()
     * .recordColumnDelimiter("recordColumnDelimiter")
     * .recordRowDelimiter("recordRowDelimiter")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-csvmappingparameters.html)
     */
    public inline fun cfnApplicationV2CSVMappingParametersProperty(
        block: CfnApplicationV2CSVMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.CSVMappingParametersProperty {
        val builder = CfnApplicationV2CSVMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration parameters for the default Amazon Glue database.
     *
     * You use this database for SQL queries that you write in a Kinesis Data Analytics Studio
     * notebook.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CatalogConfigurationProperty catalogConfigurationProperty =
     * CatalogConfigurationProperty.builder()
     * .glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty.builder()
     * .databaseArn("databaseArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-catalogconfiguration.html)
     */
    public inline fun cfnApplicationV2CatalogConfigurationProperty(
        block: CfnApplicationV2CatalogConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.CatalogConfigurationProperty {
        val builder = CfnApplicationV2CatalogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an application's checkpointing configuration.
     *
     * Checkpointing is the process of persisting application state for fault tolerance. For more
     * information, see
     * [Checkpoints for Fault Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
     * in the
     * [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CheckpointConfigurationProperty checkpointConfigurationProperty =
     * CheckpointConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .checkpointingEnabled(false)
     * .checkpointInterval(123)
     * .minPauseBetweenCheckpoints(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html)
     */
    public inline fun cfnApplicationV2CheckpointConfigurationProperty(
        block: CfnApplicationV2CheckpointConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.CheckpointConfigurationProperty {
        val builder = CfnApplicationV2CheckpointConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies either the application code, or the location of the application code, for a
     * Flink-based Kinesis Data Analytics application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CodeContentProperty codeContentProperty = CodeContentProperty.builder()
     * .s3ContentLocation(S3ContentLocationProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * // the properties below are optional
     * .objectVersion("objectVersion")
     * .build())
     * .textContent("textContent")
     * .zipFileContent("zipFileContent")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html)
     */
    public inline fun cfnApplicationV2CodeContentProperty(
        block: CfnApplicationV2CodeContentPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.CodeContentProperty {
        val builder = CfnApplicationV2CodeContentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of connectors and user-defined functions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CustomArtifactConfigurationProperty customArtifactConfigurationProperty =
     * CustomArtifactConfigurationProperty.builder()
     * .artifactType("artifactType")
     * // the properties below are optional
     * .mavenReference(MavenReferenceProperty.builder()
     * .artifactId("artifactId")
     * .groupId("groupId")
     * .version("version")
     * .build())
     * .s3ContentLocation(S3ContentLocationProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * // the properties below are optional
     * .objectVersion("objectVersion")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-customartifactconfiguration.html)
     */
    public inline fun cfnApplicationV2CustomArtifactConfigurationProperty(
        block: CfnApplicationV2CustomArtifactConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.CustomArtifactConfigurationProperty {
        val builder = CfnApplicationV2CustomArtifactConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The information required to deploy a Kinesis Data Analytics Studio notebook as an application
     * with durable state.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * DeployAsApplicationConfigurationProperty deployAsApplicationConfigurationProperty =
     * DeployAsApplicationConfigurationProperty.builder()
     * .s3ContentLocation(S3ContentBaseLocationProperty.builder()
     * .bucketArn("bucketArn")
     * // the properties below are optional
     * .basePath("basePath")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-deployasapplicationconfiguration.html)
     */
    public inline fun cfnApplicationV2DeployAsApplicationConfigurationProperty(
        block: CfnApplicationV2DeployAsApplicationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.DeployAsApplicationConfigurationProperty {
        val builder = CfnApplicationV2DeployAsApplicationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes execution properties for a Flink-based Kinesis Data Analytics application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * EnvironmentPropertiesProperty environmentPropertiesProperty =
     * EnvironmentPropertiesProperty.builder()
     * .propertyGroups(List.of(PropertyGroupProperty.builder()
     * .propertyGroupId("propertyGroupId")
     * .propertyMap(Map.of(
     * "propertyMapKey", "propertyMap"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html)
     */
    public inline fun cfnApplicationV2EnvironmentPropertiesProperty(
        block: CfnApplicationV2EnvironmentPropertiesPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.EnvironmentPropertiesProperty {
        val builder = CfnApplicationV2EnvironmentPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes configuration parameters for a Flink-based Kinesis Data Analytics application or a
     * Studio notebook.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * FlinkApplicationConfigurationProperty flinkApplicationConfigurationProperty =
     * FlinkApplicationConfigurationProperty.builder()
     * .checkpointConfiguration(CheckpointConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .checkpointingEnabled(false)
     * .checkpointInterval(123)
     * .minPauseBetweenCheckpoints(123)
     * .build())
     * .monitoringConfiguration(MonitoringConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .logLevel("logLevel")
     * .metricsLevel("metricsLevel")
     * .build())
     * .parallelismConfiguration(ParallelismConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .autoScalingEnabled(false)
     * .parallelism(123)
     * .parallelismPerKpu(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html)
     */
    public inline fun cfnApplicationV2FlinkApplicationConfigurationProperty(
        block: CfnApplicationV2FlinkApplicationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.FlinkApplicationConfigurationProperty {
        val builder = CfnApplicationV2FlinkApplicationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the starting parameters for a Flink-based Kinesis Data Analytics application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * FlinkRunConfigurationProperty flinkRunConfigurationProperty =
     * FlinkRunConfigurationProperty.builder()
     * .allowNonRestoredState(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkrunconfiguration.html)
     */
    public inline fun cfnApplicationV2FlinkRunConfigurationProperty(
        block: CfnApplicationV2FlinkRunConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.FlinkRunConfigurationProperty {
        val builder = CfnApplicationV2FlinkRunConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of the Glue Data Catalog that you use for Apache Flink SQL queries and
     * table API transforms that you write in an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * GlueDataCatalogConfigurationProperty glueDataCatalogConfigurationProperty =
     * GlueDataCatalogConfigurationProperty.builder()
     * .databaseArn("databaseArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-gluedatacatalogconfiguration.html)
     */
    public inline fun cfnApplicationV2GlueDataCatalogConfigurationProperty(
        block: CfnApplicationV2GlueDataCatalogConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.GlueDataCatalogConfigurationProperty {
        val builder = CfnApplicationV2GlueDataCatalogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that contains the Amazon Resource Name (ARN) of the Amazon Lambda function that is
     * used to preprocess records in the stream in a SQL-based Kinesis Data Analytics application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * InputLambdaProcessorProperty inputLambdaProcessorProperty =
     * InputLambdaProcessorProperty.builder()
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html)
     */
    public inline fun cfnApplicationV2InputLambdaProcessorProperty(
        block: CfnApplicationV2InputLambdaProcessorPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.InputLambdaProcessorProperty {
        val builder = CfnApplicationV2InputLambdaProcessorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the number of in-application
     * streams to create for a given streaming source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * InputParallelismProperty inputParallelismProperty = InputParallelismProperty.builder()
     * .count(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html)
     */
    public inline fun cfnApplicationV2InputParallelismProperty(
        block: CfnApplicationV2InputParallelismPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.InputParallelismProperty {
        val builder = CfnApplicationV2InputParallelismPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For an SQL-based Amazon Kinesis Data Analytics application, describes a processor that is
     * used to preprocess the records in the stream before being processed by your application code.
     *
     * Currently, the only input processor available is
     * [Amazon Lambda](https://docs.aws.amazon.com/lambda/) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * InputProcessingConfigurationProperty inputProcessingConfigurationProperty =
     * InputProcessingConfigurationProperty.builder()
     * .inputLambdaProcessor(InputLambdaProcessorProperty.builder()
     * .resourceArn("resourceArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html)
     */
    public inline fun cfnApplicationV2InputProcessingConfigurationProperty(
        block: CfnApplicationV2InputProcessingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.InputProcessingConfigurationProperty {
        val builder = CfnApplicationV2InputProcessingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When you configure the application input for a SQL-based Kinesis Data Analytics application,
     * you specify the streaming source, the in-application stream name that is created, and the
     * mapping between the two.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * InputProperty inputProperty = InputProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html)
     */
    public inline fun cfnApplicationV2InputProperty(
        block: CfnApplicationV2InputPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.InputProperty {
        val builder = CfnApplicationV2InputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the format of the data in the
     * streaming source, and how each data element maps to corresponding columns created in the
     * in-application stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * InputSchemaProperty inputSchemaProperty = InputSchemaProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html)
     */
    public inline fun cfnApplicationV2InputSchemaProperty(
        block: CfnApplicationV2InputSchemaPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.InputSchemaProperty {
        val builder = CfnApplicationV2InputSchemaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, provides additional mapping information
     * when JSON is the record format on the streaming source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * JSONMappingParametersProperty jSONMappingParametersProperty =
     * JSONMappingParametersProperty.builder()
     * .recordRowPath("recordRowPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-jsonmappingparameters.html)
     */
    public inline fun cfnApplicationV2JSONMappingParametersProperty(
        block: CfnApplicationV2JSONMappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.JSONMappingParametersProperty {
        val builder = CfnApplicationV2JSONMappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, identifies a Kinesis Data Firehose
     * delivery stream as the streaming source.
     *
     * You provide the delivery stream's Amazon Resource Name (ARN).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * KinesisFirehoseInputProperty kinesisFirehoseInputProperty =
     * KinesisFirehoseInputProperty.builder()
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html)
     */
    public inline fun cfnApplicationV2KinesisFirehoseInputProperty(
        block: CfnApplicationV2KinesisFirehoseInputPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.KinesisFirehoseInputProperty {
        val builder = CfnApplicationV2KinesisFirehoseInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies a Kinesis data stream as the streaming source.
     *
     * You provide the stream's Amazon Resource Name (ARN).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * KinesisStreamsInputProperty kinesisStreamsInputProperty = KinesisStreamsInputProperty.builder()
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html)
     */
    public inline fun cfnApplicationV2KinesisStreamsInputProperty(
        block: CfnApplicationV2KinesisStreamsInputPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.KinesisStreamsInputProperty {
        val builder = CfnApplicationV2KinesisStreamsInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When you configure a SQL-based Kinesis Data Analytics application's input at the time of
     * creating or updating an application, provides additional mapping information specific to the
     * record format (such as JSON, CSV, or record fields delimited by some delimiter) on the
     * streaming source.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mappingparameters.html)
     */
    public inline fun cfnApplicationV2MappingParametersProperty(
        block: CfnApplicationV2MappingParametersPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.MappingParametersProperty {
        val builder = CfnApplicationV2MappingParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The information required to specify a Maven reference.
     *
     * You can use Maven references to specify dependency JAR files.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * MavenReferenceProperty mavenReferenceProperty = MavenReferenceProperty.builder()
     * .artifactId("artifactId")
     * .groupId("groupId")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html)
     */
    public inline fun cfnApplicationV2MavenReferenceProperty(
        block: CfnApplicationV2MavenReferencePropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.MavenReferenceProperty {
        val builder = CfnApplicationV2MavenReferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes configuration parameters for Amazon CloudWatch logging for a Java-based Kinesis
     * Data Analytics application.
     *
     * For more information about CloudWatch logging, see
     * [Monitoring](https://docs.aws.amazon.com/kinesisanalytics/latest/java/monitoring-overview) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * MonitoringConfigurationProperty monitoringConfigurationProperty =
     * MonitoringConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .logLevel("logLevel")
     * .metricsLevel("metricsLevel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html)
     */
    public inline fun cfnApplicationV2MonitoringConfigurationProperty(
        block: CfnApplicationV2MonitoringConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.MonitoringConfigurationProperty {
        val builder = CfnApplicationV2MonitoringConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes parameters for how a Flink-based Kinesis Data Analytics application executes
     * multiple tasks simultaneously.
     *
     * For more information about parallelism, see
     * [Parallel Execution](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/dev/parallel.html)
     * in the
     * [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * ParallelismConfigurationProperty parallelismConfigurationProperty =
     * ParallelismConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .autoScalingEnabled(false)
     * .parallelism(123)
     * .parallelismPerKpu(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html)
     */
    public inline fun cfnApplicationV2ParallelismConfigurationProperty(
        block: CfnApplicationV2ParallelismConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.ParallelismConfigurationProperty {
        val builder = CfnApplicationV2ParallelismConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Property key-value pairs passed into an application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * PropertyGroupProperty propertyGroupProperty = PropertyGroupProperty.builder()
     * .propertyGroupId("propertyGroupId")
     * .propertyMap(Map.of(
     * "propertyMapKey", "propertyMap"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html)
     */
    public inline fun cfnApplicationV2PropertyGroupProperty(
        block: CfnApplicationV2PropertyGroupPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.PropertyGroupProperty {
        val builder = CfnApplicationV2PropertyGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplication`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * CfnApplicationV2Props cfnApplicationV2Props = CfnApplicationV2Props.builder()
     * .runtimeEnvironment("runtimeEnvironment")
     * .serviceExecutionRole("serviceExecutionRole")
     * // the properties below are optional
     * .applicationConfiguration(ApplicationConfigurationProperty.builder()
     * .applicationCodeConfiguration(ApplicationCodeConfigurationProperty.builder()
     * .codeContent(CodeContentProperty.builder()
     * .s3ContentLocation(S3ContentLocationProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * // the properties below are optional
     * .objectVersion("objectVersion")
     * .build())
     * .textContent("textContent")
     * .zipFileContent("zipFileContent")
     * .build())
     * .codeContentType("codeContentType")
     * .build())
     * .applicationSnapshotConfiguration(ApplicationSnapshotConfigurationProperty.builder()
     * .snapshotsEnabled(false)
     * .build())
     * .environmentProperties(EnvironmentPropertiesProperty.builder()
     * .propertyGroups(List.of(PropertyGroupProperty.builder()
     * .propertyGroupId("propertyGroupId")
     * .propertyMap(Map.of(
     * "propertyMapKey", "propertyMap"))
     * .build()))
     * .build())
     * .flinkApplicationConfiguration(FlinkApplicationConfigurationProperty.builder()
     * .checkpointConfiguration(CheckpointConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .checkpointingEnabled(false)
     * .checkpointInterval(123)
     * .minPauseBetweenCheckpoints(123)
     * .build())
     * .monitoringConfiguration(MonitoringConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .logLevel("logLevel")
     * .metricsLevel("metricsLevel")
     * .build())
     * .parallelismConfiguration(ParallelismConfigurationProperty.builder()
     * .configurationType("configurationType")
     * // the properties below are optional
     * .autoScalingEnabled(false)
     * .parallelism(123)
     * .parallelismPerKpu(123)
     * .build())
     * .build())
     * .sqlApplicationConfiguration(SqlApplicationConfigurationProperty.builder()
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
     * .build())
     * .vpcConfigurations(List.of(VpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build()))
     * .zeppelinApplicationConfiguration(ZeppelinApplicationConfigurationProperty.builder()
     * .catalogConfiguration(CatalogConfigurationProperty.builder()
     * .glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty.builder()
     * .databaseArn("databaseArn")
     * .build())
     * .build())
     * .customArtifactsConfiguration(List.of(CustomArtifactConfigurationProperty.builder()
     * .artifactType("artifactType")
     * // the properties below are optional
     * .mavenReference(MavenReferenceProperty.builder()
     * .artifactId("artifactId")
     * .groupId("groupId")
     * .version("version")
     * .build())
     * .s3ContentLocation(S3ContentLocationProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * // the properties below are optional
     * .objectVersion("objectVersion")
     * .build())
     * .build()))
     * .deployAsApplicationConfiguration(DeployAsApplicationConfigurationProperty.builder()
     * .s3ContentLocation(S3ContentBaseLocationProperty.builder()
     * .bucketArn("bucketArn")
     * // the properties below are optional
     * .basePath("basePath")
     * .build())
     * .build())
     * .monitoringConfiguration(ZeppelinMonitoringConfigurationProperty.builder()
     * .logLevel("logLevel")
     * .build())
     * .build())
     * .build())
     * .applicationDescription("applicationDescription")
     * .applicationMaintenanceConfiguration(ApplicationMaintenanceConfigurationProperty.builder()
     * .applicationMaintenanceWindowStartTime("applicationMaintenanceWindowStartTime")
     * .build())
     * .applicationMode("applicationMode")
     * .applicationName("applicationName")
     * .runConfiguration(RunConfigurationProperty.builder()
     * .applicationRestoreConfiguration(ApplicationRestoreConfigurationProperty.builder()
     * .applicationRestoreType("applicationRestoreType")
     * // the properties below are optional
     * .snapshotName("snapshotName")
     * .build())
     * .flinkRunConfiguration(FlinkRunConfigurationProperty.builder()
     * .allowNonRestoredState(false)
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html)
     */
    public inline fun cfnApplicationV2Props(
        block: CfnApplicationV2PropsDsl.() -> Unit = {}
    ): CfnApplicationV2Props {
        val builder = CfnApplicationV2PropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the mapping of each data
     * element in the streaming source to the corresponding column in the in-application stream.
     *
     * Also used to describe the format of the reference data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * RecordColumnProperty recordColumnProperty = RecordColumnProperty.builder()
     * .name("name")
     * .sqlType("sqlType")
     * // the properties below are optional
     * .mapping("mapping")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordcolumn.html)
     */
    public inline fun cfnApplicationV2RecordColumnProperty(
        block: CfnApplicationV2RecordColumnPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.RecordColumnProperty {
        val builder = CfnApplicationV2RecordColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the record format and relevant
     * mapping information that should be applied to schematize the records on the stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * RecordFormatProperty recordFormatProperty = RecordFormatProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html)
     */
    public inline fun cfnApplicationV2RecordFormatProperty(
        block: CfnApplicationV2RecordFormatPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.RecordFormatProperty {
        val builder = CfnApplicationV2RecordFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the starting parameters for an Kinesis Data Analytics application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * RunConfigurationProperty runConfigurationProperty = RunConfigurationProperty.builder()
     * .applicationRestoreConfiguration(ApplicationRestoreConfigurationProperty.builder()
     * .applicationRestoreType("applicationRestoreType")
     * // the properties below are optional
     * .snapshotName("snapshotName")
     * .build())
     * .flinkRunConfiguration(FlinkRunConfigurationProperty.builder()
     * .allowNonRestoredState(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-runconfiguration.html)
     */
    public inline fun cfnApplicationV2RunConfigurationProperty(
        block: CfnApplicationV2RunConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.RunConfigurationProperty {
        val builder = CfnApplicationV2RunConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The base location of the Amazon Data Analytics application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * S3ContentBaseLocationProperty s3ContentBaseLocationProperty =
     * S3ContentBaseLocationProperty.builder()
     * .bucketArn("bucketArn")
     * // the properties below are optional
     * .basePath("basePath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentbaselocation.html)
     */
    public inline fun cfnApplicationV2S3ContentBaseLocationProperty(
        block: CfnApplicationV2S3ContentBaseLocationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.S3ContentBaseLocationProperty {
        val builder = CfnApplicationV2S3ContentBaseLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The location of an application or a custom artifact.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * S3ContentLocationProperty s3ContentLocationProperty = S3ContentLocationProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * // the properties below are optional
     * .objectVersion("objectVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html)
     */
    public inline fun cfnApplicationV2S3ContentLocationProperty(
        block: CfnApplicationV2S3ContentLocationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.S3ContentLocationProperty {
        val builder = CfnApplicationV2S3ContentLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the inputs, outputs, and reference data sources for a SQL-based Kinesis Data
     * Analytics application.
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
    public inline fun cfnApplicationV2SqlApplicationConfigurationProperty(
        block: CfnApplicationV2SqlApplicationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.SqlApplicationConfigurationProperty {
        val builder = CfnApplicationV2SqlApplicationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the parameters of a VPC used by the application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-vpcconfiguration.html)
     */
    public inline fun cfnApplicationV2VpcConfigurationProperty(
        block: CfnApplicationV2VpcConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.VpcConfigurationProperty {
        val builder = CfnApplicationV2VpcConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of a Kinesis Data Analytics Studio notebook.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * ZeppelinApplicationConfigurationProperty zeppelinApplicationConfigurationProperty =
     * ZeppelinApplicationConfigurationProperty.builder()
     * .catalogConfiguration(CatalogConfigurationProperty.builder()
     * .glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty.builder()
     * .databaseArn("databaseArn")
     * .build())
     * .build())
     * .customArtifactsConfiguration(List.of(CustomArtifactConfigurationProperty.builder()
     * .artifactType("artifactType")
     * // the properties below are optional
     * .mavenReference(MavenReferenceProperty.builder()
     * .artifactId("artifactId")
     * .groupId("groupId")
     * .version("version")
     * .build())
     * .s3ContentLocation(S3ContentLocationProperty.builder()
     * .bucketArn("bucketArn")
     * .fileKey("fileKey")
     * // the properties below are optional
     * .objectVersion("objectVersion")
     * .build())
     * .build()))
     * .deployAsApplicationConfiguration(DeployAsApplicationConfigurationProperty.builder()
     * .s3ContentLocation(S3ContentBaseLocationProperty.builder()
     * .bucketArn("bucketArn")
     * // the properties below are optional
     * .basePath("basePath")
     * .build())
     * .build())
     * .monitoringConfiguration(ZeppelinMonitoringConfigurationProperty.builder()
     * .logLevel("logLevel")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html)
     */
    public inline fun cfnApplicationV2ZeppelinApplicationConfigurationProperty(
        block: CfnApplicationV2ZeppelinApplicationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.ZeppelinApplicationConfigurationProperty {
        val builder = CfnApplicationV2ZeppelinApplicationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes configuration parameters for Amazon CloudWatch logging for a Kinesis Data Analytics
     * Studio notebook.
     *
     * For more information about CloudWatch logging, see
     * [Monitoring](https://docs.aws.amazon.com/kinesisanalytics/latest/java/monitoring-overview.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesisanalytics.*;
     * ZeppelinMonitoringConfigurationProperty zeppelinMonitoringConfigurationProperty =
     * ZeppelinMonitoringConfigurationProperty.builder()
     * .logLevel("logLevel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinmonitoringconfiguration.html)
     */
    public inline fun cfnApplicationV2ZeppelinMonitoringConfigurationProperty(
        block: CfnApplicationV2ZeppelinMonitoringConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplicationV2.ZeppelinMonitoringConfigurationProperty {
        val builder = CfnApplicationV2ZeppelinMonitoringConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
