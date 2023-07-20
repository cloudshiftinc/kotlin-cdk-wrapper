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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnPrimaryTaskSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPrimaryTaskSet.Builder = CfnPrimaryTaskSet.Builder.create(scope, id)

    public fun cluster(cluster: String) {
        cdkBuilder.cluster(cluster)
    }

    public fun service(service: String) {
        cdkBuilder.service(service)
    }

    public fun taskSetId(taskSetId: String) {
        cdkBuilder.taskSetId(taskSetId)
    }

    public fun build(): CfnPrimaryTaskSet = cdkBuilder.build()
}
