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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

/**
 * Used to set feature group throughput configuration.
 *
 * There are two modes: `ON_DEMAND` and `PROVISIONED` . With on-demand mode, you are charged for
 * data reads and writes that your application performs on your feature group. You do not need to
 * specify read and write throughput because Feature Store accommodates your workloads as they ramp
 * up and down. You can switch a feature group to on-demand only once in a 24 hour period. With
 * provisioned throughput mode, you specify the read and write capacity per second that you expect
 * your application to require, and you are billed based on those limits. Exceeding provisioned
 * throughput will result in your requests being throttled.
 *
 * Note: `PROVISIONED` throughput mode is supported only for feature groups that are offline-only,
 * or use the
 * [`Standard`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_OnlineStoreConfig.html#sagemaker-Type-OnlineStoreConfig-StorageType)
 * tier online store.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ThroughputConfigProperty throughputConfigProperty = ThroughputConfigProperty.builder()
 * .throughputMode("throughputMode")
 * // the properties below are optional
 * .provisionedReadCapacityUnits(123)
 * .provisionedWriteCapacityUnits(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-throughputconfig.html)
 */
@CdkDslMarker
public class CfnFeatureGroupThroughputConfigPropertyDsl {
    private val cdkBuilder: CfnFeatureGroup.ThroughputConfigProperty.Builder =
        CfnFeatureGroup.ThroughputConfigProperty.builder()

    /**
     * @param provisionedReadCapacityUnits For provisioned feature groups with online store enabled,
     *   this indicates the read throughput you are billed for and can consume without throttling.
     *   This field is not applicable for on-demand feature groups.
     */
    public fun provisionedReadCapacityUnits(provisionedReadCapacityUnits: Number) {
        cdkBuilder.provisionedReadCapacityUnits(provisionedReadCapacityUnits)
    }

    /**
     * @param provisionedWriteCapacityUnits For provisioned feature groups, this indicates the write
     *   throughput you are billed for and can consume without throttling. This field is not
     *   applicable for on-demand feature groups.
     */
    public fun provisionedWriteCapacityUnits(provisionedWriteCapacityUnits: Number) {
        cdkBuilder.provisionedWriteCapacityUnits(provisionedWriteCapacityUnits)
    }

    /**
     * @param throughputMode The mode used for your feature group throughput: `ON_DEMAND` or
     *   `PROVISIONED` .
     */
    public fun throughputMode(throughputMode: String) {
        cdkBuilder.throughputMode(throughputMode)
    }

    public fun build(): CfnFeatureGroup.ThroughputConfigProperty = cdkBuilder.build()
}
