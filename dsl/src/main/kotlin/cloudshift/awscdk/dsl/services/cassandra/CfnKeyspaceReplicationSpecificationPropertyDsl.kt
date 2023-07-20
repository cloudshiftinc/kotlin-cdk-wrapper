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

package cloudshift.awscdk.dsl.services.cassandra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cassandra.CfnKeyspace
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnKeyspaceReplicationSpecificationPropertyDsl {
    private val cdkBuilder: CfnKeyspace.ReplicationSpecificationProperty.Builder =
        CfnKeyspace.ReplicationSpecificationProperty.builder()

    private val _regionList: MutableList<String> = mutableListOf()

    public fun regionList(vararg regionList: String) {
        _regionList.addAll(listOf(*regionList))
    }

    public fun regionList(regionList: Collection<String>) {
        _regionList.addAll(regionList)
    }

    public fun replicationStrategy(replicationStrategy: String) {
        cdkBuilder.replicationStrategy(replicationStrategy)
    }

    public fun build(): CfnKeyspace.ReplicationSpecificationProperty {
        if (_regionList.isNotEmpty()) cdkBuilder.regionList(_regionList)
        return cdkBuilder.build()
    }
}
