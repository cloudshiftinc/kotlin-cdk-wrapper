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
public class CfnClusterJmxExporterPropertyDsl {
    private val cdkBuilder: CfnCluster.JmxExporterProperty.Builder =
        CfnCluster.JmxExporterProperty.builder()

    public fun enabledInBroker(enabledInBroker: Boolean) {
        cdkBuilder.enabledInBroker(enabledInBroker)
    }

    public fun enabledInBroker(enabledInBroker: IResolvable) {
        cdkBuilder.enabledInBroker(enabledInBroker)
    }

    public fun build(): CfnCluster.JmxExporterProperty = cdkBuilder.build()
}
