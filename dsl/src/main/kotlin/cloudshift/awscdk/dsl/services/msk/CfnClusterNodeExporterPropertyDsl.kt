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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster
import kotlin.Boolean

@CdkDslMarker
public class CfnClusterNodeExporterPropertyDsl {
    private val cdkBuilder: CfnCluster.NodeExporterProperty.Builder =
        CfnCluster.NodeExporterProperty.builder()

    public fun enabledInBroker(enabledInBroker: Boolean) {
        cdkBuilder.enabledInBroker(enabledInBroker)
    }

    public fun enabledInBroker(enabledInBroker: IResolvable) {
        cdkBuilder.enabledInBroker(enabledInBroker)
    }

    public fun build(): CfnCluster.NodeExporterProperty = cdkBuilder.build()
}
