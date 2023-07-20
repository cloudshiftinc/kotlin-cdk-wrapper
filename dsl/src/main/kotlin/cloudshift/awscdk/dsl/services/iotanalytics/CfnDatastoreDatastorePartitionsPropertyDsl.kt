@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDatastoreDatastorePartitionsPropertyDsl {
    private val cdkBuilder: CfnDatastore.DatastorePartitionsProperty.Builder =
        CfnDatastore.DatastorePartitionsProperty.builder()

    private val _partitions: MutableList<Any> = mutableListOf()

    public fun partitions(vararg partitions: Any) {
        _partitions.addAll(listOf(*partitions))
    }

    public fun partitions(partitions: Collection<Any>) {
        _partitions.addAll(partitions)
    }

    public fun partitions(partitions: IResolvable) {
        cdkBuilder.partitions(partitions)
    }

    public fun build(): CfnDatastore.DatastorePartitionsProperty {
        if (_partitions.isNotEmpty()) cdkBuilder.partitions(_partitions)
        return cdkBuilder.build()
    }
}
