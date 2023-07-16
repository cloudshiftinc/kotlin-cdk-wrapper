@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionDynamoDBEventPropertyDsl {
  private val cdkBuilder: CfnFunction.DynamoDBEventProperty.Builder =
      CfnFunction.DynamoDBEventProperty.builder()

  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean) {
    cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
  }

  public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable) {
    cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
  }

  public fun destinationConfig(destinationConfig: IResolvable) {
    cdkBuilder.destinationConfig(destinationConfig)
  }

  public fun destinationConfig(destinationConfig: CfnFunction.DestinationConfigProperty) {
    cdkBuilder.destinationConfig(destinationConfig)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
    cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
  }

  public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
    cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
  }

  public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
    cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
  }

  public fun parallelizationFactor(parallelizationFactor: Number) {
    cdkBuilder.parallelizationFactor(parallelizationFactor)
  }

  public fun startingPosition(startingPosition: String) {
    cdkBuilder.startingPosition(startingPosition)
  }

  public fun stream(stream: String) {
    cdkBuilder.stream(stream)
  }

  public fun build(): CfnFunction.DynamoDBEventProperty = cdkBuilder.build()
}
