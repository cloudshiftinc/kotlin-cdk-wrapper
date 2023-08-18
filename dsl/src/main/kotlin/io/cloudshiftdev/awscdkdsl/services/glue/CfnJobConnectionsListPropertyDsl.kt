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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.glue.CfnJob

/**
 * Specifies the connections used by a job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * ConnectionsListProperty connectionsListProperty = ConnectionsListProperty.builder()
 * .connections(List.of("connections"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html)
 */
@CdkDslMarker
public class CfnJobConnectionsListPropertyDsl {
    private val cdkBuilder: CfnJob.ConnectionsListProperty.Builder =
        CfnJob.ConnectionsListProperty.builder()

    private val _connections: MutableList<String> = mutableListOf()

    /** @param connections A list of connections used by the job. */
    public fun connections(vararg connections: String) {
        _connections.addAll(listOf(*connections))
    }

    /** @param connections A list of connections used by the job. */
    public fun connections(connections: Collection<String>) {
        _connections.addAll(connections)
    }

    public fun build(): CfnJob.ConnectionsListProperty {
        if (_connections.isNotEmpty()) cdkBuilder.connections(_connections)
        return cdkBuilder.build()
    }
}
