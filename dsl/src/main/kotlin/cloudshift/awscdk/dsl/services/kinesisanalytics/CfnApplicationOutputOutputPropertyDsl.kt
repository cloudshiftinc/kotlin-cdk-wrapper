@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput

@CdkDslMarker
public class CfnApplicationOutputOutputPropertyDsl {
  private val cdkBuilder: CfnApplicationOutput.OutputProperty.Builder =
      CfnApplicationOutput.OutputProperty.builder()

  /**
   * @param destinationSchema Describes the data format when records are written to the destination.
   * 
   * For more information, see [Configuring Application
   * Output](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html) .
   */
  public fun destinationSchema(destinationSchema: IResolvable) {
    cdkBuilder.destinationSchema(destinationSchema)
  }

  /**
   * @param destinationSchema Describes the data format when records are written to the destination.
   * 
   * For more information, see [Configuring Application
   * Output](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html) .
   */
  public fun destinationSchema(destinationSchema: CfnApplicationOutput.DestinationSchemaProperty) {
    cdkBuilder.destinationSchema(destinationSchema)
  }

  /**
   * @param kinesisFirehoseOutput Identifies an Amazon Kinesis Firehose delivery stream as the
   * destination.
   */
  public fun kinesisFirehoseOutput(kinesisFirehoseOutput: IResolvable) {
    cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput)
  }

  /**
   * @param kinesisFirehoseOutput Identifies an Amazon Kinesis Firehose delivery stream as the
   * destination.
   */
  public
      fun kinesisFirehoseOutput(kinesisFirehoseOutput: CfnApplicationOutput.KinesisFirehoseOutputProperty) {
    cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput)
  }

  /**
   * @param kinesisStreamsOutput Identifies an Amazon Kinesis stream as the destination.
   */
  public fun kinesisStreamsOutput(kinesisStreamsOutput: IResolvable) {
    cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput)
  }

  /**
   * @param kinesisStreamsOutput Identifies an Amazon Kinesis stream as the destination.
   */
  public
      fun kinesisStreamsOutput(kinesisStreamsOutput: CfnApplicationOutput.KinesisStreamsOutputProperty) {
    cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput)
  }

  /**
   * @param lambdaOutput Identifies an AWS Lambda function as the destination.
   */
  public fun lambdaOutput(lambdaOutput: IResolvable) {
    cdkBuilder.lambdaOutput(lambdaOutput)
  }

  /**
   * @param lambdaOutput Identifies an AWS Lambda function as the destination.
   */
  public fun lambdaOutput(lambdaOutput: CfnApplicationOutput.LambdaOutputProperty) {
    cdkBuilder.lambdaOutput(lambdaOutput)
  }

  /**
   * @param name Name of the in-application stream.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnApplicationOutput.OutputProperty = cdkBuilder.build()
}
