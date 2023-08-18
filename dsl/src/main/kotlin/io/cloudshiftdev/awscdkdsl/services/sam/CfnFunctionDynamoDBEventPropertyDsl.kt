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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * DynamoDBEventProperty dynamoDBEventProperty = DynamoDBEventProperty.builder()
 * .startingPosition("startingPosition")
 * .stream("stream")
 * // the properties below are optional
 * .batchSize(123)
 * .bisectBatchOnFunctionError(false)
 * .destinationConfig(DestinationConfigProperty.builder()
 * .onFailure(DestinationProperty.builder()
 * .destination("destination")
 * // the properties below are optional
 * .type("type")
 * .build())
 * .build())
 * .enabled(false)
 * .maximumBatchingWindowInSeconds(123)
 * .maximumRecordAgeInSeconds(123)
 * .maximumRetryAttempts(123)
 * .parallelizationFactor(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-dynamodbevent.html)
 */
@CdkDslMarker
public class CfnFunctionDynamoDBEventPropertyDsl {
    private val cdkBuilder: CfnFunction.DynamoDBEventProperty.Builder =
        CfnFunction.DynamoDBEventProperty.builder()

    /** @param batchSize the value to be set. */
    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    /** @param bisectBatchOnFunctionError the value to be set. */
    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean) {
        cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
    }

    /** @param bisectBatchOnFunctionError the value to be set. */
    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable) {
        cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
    }

    /** @param destinationConfig the value to be set. */
    public fun destinationConfig(destinationConfig: IResolvable) {
        cdkBuilder.destinationConfig(destinationConfig)
    }

    /** @param destinationConfig the value to be set. */
    public fun destinationConfig(destinationConfig: CfnFunction.DestinationConfigProperty) {
        cdkBuilder.destinationConfig(destinationConfig)
    }

    /** @param enabled the value to be set. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled the value to be set. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param maximumBatchingWindowInSeconds the value to be set. */
    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    /** @param maximumRecordAgeInSeconds the value to be set. */
    public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
        cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
    }

    /** @param maximumRetryAttempts the value to be set. */
    public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    /** @param parallelizationFactor the value to be set. */
    public fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    /** @param startingPosition the value to be set. */
    public fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
    }

    /** @param stream the value to be set. */
    public fun stream(stream: String) {
        cdkBuilder.stream(stream)
    }

    public fun build(): CfnFunction.DynamoDBEventProperty = cdkBuilder.build()
}
