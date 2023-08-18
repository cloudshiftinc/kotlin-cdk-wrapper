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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig
import software.amazon.awscdk.services.s3.BucketNotificationDestinationType
import software.constructs.IDependable

/**
 * Represents the properties of a notification destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * import software.constructs.*;
 * IDependable dependable;
 * BucketNotificationDestinationConfig bucketNotificationDestinationConfig =
 * BucketNotificationDestinationConfig.builder()
 * .arn("arn")
 * .type(BucketNotificationDestinationType.LAMBDA)
 * // the properties below are optional
 * .dependencies(List.of(dependable))
 * .build();
 * ```
 */
@CdkDslMarker
public class BucketNotificationDestinationConfigDsl {
    private val cdkBuilder: BucketNotificationDestinationConfig.Builder =
        BucketNotificationDestinationConfig.builder()

    private val _dependencies: MutableList<IDependable> = mutableListOf()

    /** @param arn The ARN of the destination (i.e. Lambda, SNS, SQS). */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /**
     * @param dependencies Any additional dependencies that should be resolved before the bucket
     *   notification can be configured (for example, the SNS Topic Policy resource).
     */
    public fun dependencies(vararg dependencies: IDependable) {
        _dependencies.addAll(listOf(*dependencies))
    }

    /**
     * @param dependencies Any additional dependencies that should be resolved before the bucket
     *   notification can be configured (for example, the SNS Topic Policy resource).
     */
    public fun dependencies(dependencies: Collection<IDependable>) {
        _dependencies.addAll(dependencies)
    }

    /** @param type The notification type. */
    public fun type(type: BucketNotificationDestinationType) {
        cdkBuilder.type(type)
    }

    public fun build(): BucketNotificationDestinationConfig {
        if (_dependencies.isNotEmpty()) cdkBuilder.dependencies(_dependencies)
        return cdkBuilder.build()
    }
}
