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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.eks.AlbController
import software.amazon.awscdk.services.eks.AlbControllerVersion
import software.amazon.awscdk.services.eks.Cluster
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class AlbControllerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: AlbController.Builder = AlbController.Builder.create(scope, id)

    public fun cluster(cluster: Cluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun policy(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.policy(builder.map)
    }

    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    public fun repository(repository: String) {
        cdkBuilder.repository(repository)
    }

    public fun version(version: AlbControllerVersion) {
        cdkBuilder.version(version)
    }

    public fun build(): AlbController = cdkBuilder.build()
}
