@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2

@CdkDslMarker
public class CfnApplicationOutputV2OutputPropertyDsl {
  private val cdkBuilder: CfnApplicationOutputV2.OutputProperty.Builder =
      CfnApplicationOutputV2.OutputProperty.builder()

  /**
   * @param destinationSchema Describes the data format when records are written to the destination.
   * 
   */
  public fun destinationSchema(destinationSchema: IResolvable) {
    cdkBuilder.destinationSchema(destinationSchema)
  }

  /**
   * @param destinationSchema Describes the data format when records are written to the destination.
   * 
   */
  public
      fun destinationSchema(destinationSchema: CfnApplicationOutputV2.DestinationSchemaProperty) {
    cdkBuilder.destinationSchema(destinationSchema)
  }

  /**
   * @param kinesisFirehoseOutput Identifies a Kinesis Data Firehose delivery stream as the
   * destination.
   */
  public fun kinesisFirehoseOutput(kinesisFirehoseOutput: IResolvable) {
    cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput)
  }

  /**
   * @param kinesisFirehoseOutput Identifies a Kinesis Data Firehose delivery stream as the
   * destination.
   */
  public
      fun kinesisFirehoseOutput(kinesisFirehoseOutput: CfnApplicationOutputV2.KinesisFirehoseOutputProperty) {
    cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput)
  }

  /**
   * @param kinesisStreamsOutput Identifies a Kinesis data stream as the destination.
   */
  public fun kinesisStreamsOutput(kinesisStreamsOutput: IResolvable) {
    cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput)
  }

  /**
   * @param kinesisStreamsOutput Identifies a Kinesis data stream as the destination.
   */
  public
      fun kinesisStreamsOutput(kinesisStreamsOutput: CfnApplicationOutputV2.KinesisStreamsOutputProperty) {
    cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput)
  }

  /**
   * @param lambdaOutput Identifies an Amazon Lambda function as the destination.
   */
  public fun lambdaOutput(lambdaOutput: IResolvable) {
    cdkBuilder.lambdaOutput(lambdaOutput)
  }

  /**
   * @param lambdaOutput Identifies an Amazon Lambda function as the destination.
   */
  public fun lambdaOutput(lambdaOutput: CfnApplicationOutputV2.LambdaOutputProperty) {
    cdkBuilder.lambdaOutput(lambdaOutput)
  }

  /**
   * @param name The name of the in-application stream.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnApplicationOutputV2.OutputProperty = cdkBuilder.build()
}
