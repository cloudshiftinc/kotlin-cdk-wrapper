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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * A container specifying replication metrics-related settings enabling replication metrics and
 * events.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * MetricsProperty metricsProperty = MetricsProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .eventThreshold(ReplicationTimeValueProperty.builder()
 * .minutes(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metrics.html)
 */
@CdkDslMarker
public class CfnBucketMetricsPropertyDsl {
    private val cdkBuilder: CfnBucket.MetricsProperty.Builder = CfnBucket.MetricsProperty.builder()

    /**
     * @param eventThreshold A container specifying the time threshold for emitting the
     *   `s3:Replication:OperationMissedThreshold` event.
     */
    public fun eventThreshold(eventThreshold: IResolvable) {
        cdkBuilder.eventThreshold(eventThreshold)
    }

    /**
     * @param eventThreshold A container specifying the time threshold for emitting the
     *   `s3:Replication:OperationMissedThreshold` event.
     */
    public fun eventThreshold(eventThreshold: CfnBucket.ReplicationTimeValueProperty) {
        cdkBuilder.eventThreshold(eventThreshold)
    }

    /** @param status Specifies whether the replication metrics are enabled. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnBucket.MetricsProperty = cdkBuilder.build()
}
