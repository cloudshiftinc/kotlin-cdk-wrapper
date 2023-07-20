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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnNode
import software.amazon.awscdk.services.managedblockchain.CfnNodeProps
import kotlin.String

@CdkDslMarker
public class CfnNodePropsDsl {
    private val cdkBuilder: CfnNodeProps.Builder = CfnNodeProps.builder()

    public fun memberId(memberId: String) {
        cdkBuilder.memberId(memberId)
    }

    public fun networkId(networkId: String) {
        cdkBuilder.networkId(networkId)
    }

    public fun nodeConfiguration(nodeConfiguration: IResolvable) {
        cdkBuilder.nodeConfiguration(nodeConfiguration)
    }

    public fun nodeConfiguration(nodeConfiguration: CfnNode.NodeConfigurationProperty) {
        cdkBuilder.nodeConfiguration(nodeConfiguration)
    }

    public fun build(): CfnNodeProps = cdkBuilder.build()
}
