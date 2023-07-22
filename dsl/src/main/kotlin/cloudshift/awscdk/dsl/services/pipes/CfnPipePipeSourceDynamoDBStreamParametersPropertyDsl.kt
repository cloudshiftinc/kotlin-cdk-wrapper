@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePipeSourceDynamoDBStreamParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeSourceDynamoDBStreamParametersProperty.Builder =
      CfnPipe.PipeSourceDynamoDBStreamParametersProperty.builder()

  /**
   * @param batchSize The maximum number of records to include in each batch.
   */
  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  /**
   * @param deadLetterConfig Define the target queue to send dead-letter queue events to.
   */
  public fun deadLetterConfig(deadLetterConfig: IResolvable) {
    cdkBuilder.deadLetterConfig(deadLetterConfig)
  }

  /**
   * @param deadLetterConfig Define the target queue to send dead-letter queue events to.
   */
  public fun deadLetterConfig(deadLetterConfig: CfnPipe.DeadLetterConfigProperty) {
    cdkBuilder.deadLetterConfig(deadLetterConfig)
  }

  /**
   * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
   */
  public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
    cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
  }

  /**
   * @param maximumRecordAgeInSeconds (Streams only) Discard records older than the specified age.
   * The default value is -1, which sets the maximum age to infinite. When the value is set to
   * infinite, EventBridge never discards old records.
   */
  public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
    cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
  }

  /**
   * @param maximumRetryAttempts (Streams only) Discard records after the specified number of
   * retries.
   * The default value is -1, which sets the maximum number of retries to infinite. When
   * MaximumRetryAttempts is infinite, EventBridge retries failed records until the record expires in
   * the event source.
   */
  public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
    cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
  }

  /**
   * @param onPartialBatchItemFailure (Streams only) Define how to handle item process failures.
   * `AUTOMATIC_BISECT` halves each batch and retry each half until all the records are processed or
   * there is one failed message left in the batch.
   */
  public fun onPartialBatchItemFailure(onPartialBatchItemFailure: String) {
    cdkBuilder.onPartialBatchItemFailure(onPartialBatchItemFailure)
  }

  /**
   * @param parallelizationFactor (Streams only) The number of batches to process concurrently from
   * each shard.
   * The default value is 1.
   */
  public fun parallelizationFactor(parallelizationFactor: Number) {
    cdkBuilder.parallelizationFactor(parallelizationFactor)
  }

  /**
   * @param startingPosition (Streams only) The position in a stream from which to start reading. 
   * *Valid values* : `TRIM_HORIZON | LATEST`
   */
  public fun startingPosition(startingPosition: String) {
    cdkBuilder.startingPosition(startingPosition)
  }

  public fun build(): CfnPipe.PipeSourceDynamoDBStreamParametersProperty = cdkBuilder.build()
}
