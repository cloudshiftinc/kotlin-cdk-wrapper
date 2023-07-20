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

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.docdb.ClusterParameterGroup
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class ClusterParameterGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ClusterParameterGroup.Builder =
        ClusterParameterGroup.Builder.create(scope, id)

    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
        cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun family(family: String) {
        cdkBuilder.family(family)
    }

    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    public fun build(): ClusterParameterGroup = cdkBuilder.build()
}
