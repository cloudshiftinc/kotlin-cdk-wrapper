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
import software.amazon.awscdk.services.managedblockchain.CfnMember
import kotlin.String

@CdkDslMarker
public class CfnMemberNetworkFabricConfigurationPropertyDsl {
    private val cdkBuilder: CfnMember.NetworkFabricConfigurationProperty.Builder =
        CfnMember.NetworkFabricConfigurationProperty.builder()

    public fun edition(edition: String) {
        cdkBuilder.edition(edition)
    }

    public fun build(): CfnMember.NetworkFabricConfigurationProperty = cdkBuilder.build()
}
