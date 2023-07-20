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

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.managedblockchain.CfnNode
import kotlin.String

@CdkDslMarker
public class CfnNodeNodeConfigurationPropertyDsl {
    private val cdkBuilder: CfnNode.NodeConfigurationProperty.Builder =
        CfnNode.NodeConfigurationProperty.builder()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun build(): CfnNode.NodeConfigurationProperty = cdkBuilder.build()
}
