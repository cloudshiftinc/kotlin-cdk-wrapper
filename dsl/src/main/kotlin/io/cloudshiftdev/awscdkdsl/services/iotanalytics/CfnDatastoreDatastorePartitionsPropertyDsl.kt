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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

/**
 * Information about the partition dimensions in a data store.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * DatastorePartitionsProperty datastorePartitionsProperty = DatastorePartitionsProperty.builder()
 * .partitions(List.of(DatastorePartitionProperty.builder()
 * .partition(PartitionProperty.builder()
 * .attributeName("attributeName")
 * .build())
 * .timestampPartition(TimestampPartitionProperty.builder()
 * .attributeName("attributeName")
 * // the properties below are optional
 * .timestampFormat("timestampFormat")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorepartitions.html)
 */
@CdkDslMarker
public class CfnDatastoreDatastorePartitionsPropertyDsl {
    private val cdkBuilder: CfnDatastore.DatastorePartitionsProperty.Builder =
        CfnDatastore.DatastorePartitionsProperty.builder()

    private val _partitions: MutableList<Any> = mutableListOf()

    /** @param partitions A list of partition dimensions in a data store. */
    public fun partitions(vararg partitions: Any) {
        _partitions.addAll(listOf(*partitions))
    }

    /** @param partitions A list of partition dimensions in a data store. */
    public fun partitions(partitions: Collection<Any>) {
        _partitions.addAll(partitions)
    }

    /** @param partitions A list of partition dimensions in a data store. */
    public fun partitions(partitions: IResolvable) {
        cdkBuilder.partitions(partitions)
    }

    public fun build(): CfnDatastore.DatastorePartitionsProperty {
        if (_partitions.isNotEmpty()) cdkBuilder.partitions(_partitions)
        return cdkBuilder.build()
    }
}
