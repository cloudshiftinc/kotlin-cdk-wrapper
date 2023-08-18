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

package io.cloudshiftdev.awscdkdsl.services.iotanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

/**
 * A single dimension to partition a data store.
 *
 * The dimension must be an `AttributePartition` or a `TimestampPartition` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * PartitionProperty partitionProperty = PartitionProperty.builder()
 * .attributeName("attributeName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-partition.html)
 */
@CdkDslMarker
public class CfnDatastorePartitionPropertyDsl {
    private val cdkBuilder: CfnDatastore.PartitionProperty.Builder =
        CfnDatastore.PartitionProperty.builder()

    /** @param attributeName The name of the attribute that defines a partition dimension. */
    public fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
    }

    public fun build(): CfnDatastore.PartitionProperty = cdkBuilder.build()
}
