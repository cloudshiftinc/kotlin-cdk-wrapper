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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.glue.CfnJob
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnJobConnectionsListPropertyDsl {
    private val cdkBuilder: CfnJob.ConnectionsListProperty.Builder =
        CfnJob.ConnectionsListProperty.builder()

    private val _connections: MutableList<String> = mutableListOf()

    public fun connections(vararg connections: String) {
        _connections.addAll(listOf(*connections))
    }

    public fun connections(connections: Collection<String>) {
        _connections.addAll(connections)
    }

    public fun build(): CfnJob.ConnectionsListProperty {
        if (_connections.isNotEmpty()) cdkBuilder.connections(_connections)
        return cdkBuilder.build()
    }
}
