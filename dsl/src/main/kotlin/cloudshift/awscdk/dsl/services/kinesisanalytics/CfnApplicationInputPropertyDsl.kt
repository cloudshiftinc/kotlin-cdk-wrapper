@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication

/**
 * When you configure the application input, you specify the streaming source, the in-application
 * stream name that is created, and the mapping between the two.
 *
 * For more information, see [Configuring Application
 * Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html) .
 *
 * Example:
 *
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
@CdkDslMarker
public class CfnApplicationInputPropertyDsl {
  private val cdkBuilder: CfnApplication.InputProperty.Builder =
      CfnApplication.InputProperty.builder()

  /**
   * @param inputParallelism Describes the number of in-application streams to create.
   * Data from your source is routed to these in-application input streams.
   *
   * See [Configuring Application
   * Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html) .
   */
  public fun inputParallelism(inputParallelism: IResolvable) {
    cdkBuilder.inputParallelism(inputParallelism)
  }

  /**
   * @param inputParallelism Describes the number of in-application streams to create.
   * Data from your source is routed to these in-application input streams.
   *
   * See [Configuring Application
   * Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html) .
   */
  public fun inputParallelism(inputParallelism: CfnApplication.InputParallelismProperty) {
    cdkBuilder.inputParallelism(inputParallelism)
  }

  /**
   * @param inputProcessingConfiguration The
   * [InputProcessingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html)
   * for the input. An input processor transforms records as they are received from the stream, before
   * the application's SQL code executes. Currently, the only input processing configuration available
   * is
   * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
   * .
   */
  public fun inputProcessingConfiguration(inputProcessingConfiguration: IResolvable) {
    cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration)
  }

  /**
   * @param inputProcessingConfiguration The
   * [InputProcessingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html)
   * for the input. An input processor transforms records as they are received from the stream, before
   * the application's SQL code executes. Currently, the only input processing configuration available
   * is
   * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
   * .
   */
  public
      fun inputProcessingConfiguration(inputProcessingConfiguration: CfnApplication.InputProcessingConfigurationProperty) {
    cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration)
  }

  /**
   * @param inputSchema Describes the format of the data in the streaming source, and how each data
   * element maps to corresponding columns in the in-application stream that is being created. 
   * Also used to describe the format of the reference data source.
   */
  public fun inputSchema(inputSchema: IResolvable) {
    cdkBuilder.inputSchema(inputSchema)
  }

  /**
   * @param inputSchema Describes the format of the data in the streaming source, and how each data
   * element maps to corresponding columns in the in-application stream that is being created. 
   * Also used to describe the format of the reference data source.
   */
  public fun inputSchema(inputSchema: CfnApplication.InputSchemaProperty) {
    cdkBuilder.inputSchema(inputSchema)
  }

  /**
   * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Firehose delivery
   * stream, identifies the delivery stream's ARN and an IAM role that enables Amazon Kinesis Analytics
   * to access the stream on your behalf.
   * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
   */
  public fun kinesisFirehoseInput(kinesisFirehoseInput: IResolvable) {
    cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput)
  }

  /**
   * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Firehose delivery
   * stream, identifies the delivery stream's ARN and an IAM role that enables Amazon Kinesis Analytics
   * to access the stream on your behalf.
   * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
   */
  public
      fun kinesisFirehoseInput(kinesisFirehoseInput: CfnApplication.KinesisFirehoseInputProperty) {
    cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput)
  }

  /**
   * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis stream, identifies the
   * stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to
   * access the stream on your behalf.
   * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
   */
  public fun kinesisStreamsInput(kinesisStreamsInput: IResolvable) {
    cdkBuilder.kinesisStreamsInput(kinesisStreamsInput)
  }

  /**
   * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis stream, identifies the
   * stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to
   * access the stream on your behalf.
   * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
   */
  public fun kinesisStreamsInput(kinesisStreamsInput: CfnApplication.KinesisStreamsInputProperty) {
    cdkBuilder.kinesisStreamsInput(kinesisStreamsInput)
  }

  /**
   * @param namePrefix Name prefix to use when creating an in-application stream. 
   * Suppose that you specify a prefix "MyInApplicationStream." Amazon Kinesis Analytics then
   * creates one or more (as per the `InputParallelism` count you specified) in-application streams
   * with names "MyInApplicationStream_001," "MyInApplicationStream_002," and so on.
   */
  public fun namePrefix(namePrefix: String) {
    cdkBuilder.namePrefix(namePrefix)
  }

  public fun build(): CfnApplication.InputProperty = cdkBuilder.build()
}
