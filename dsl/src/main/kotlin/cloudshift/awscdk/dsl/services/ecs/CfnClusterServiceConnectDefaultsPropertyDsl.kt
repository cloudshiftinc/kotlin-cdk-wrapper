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
import software.amazon.awscdk.services.ecs.CfnCluster
import kotlin.String

@CdkDslMarker
public class CfnClusterServiceConnectDefaultsPropertyDsl {
    private val cdkBuilder: CfnCluster.ServiceConnectDefaultsProperty.Builder =
        CfnCluster.ServiceConnectDefaultsProperty.builder()

    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun build(): CfnCluster.ServiceConnectDefaultsProperty = cdkBuilder.build()
}
