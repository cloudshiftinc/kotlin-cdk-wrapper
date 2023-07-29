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

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnMember

/**
 * Configuration properties relevant to the network for the blockchain framework that the network
 * uses.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.managedblockchain.*;
 * NetworkFrameworkConfigurationProperty networkFrameworkConfigurationProperty =
 * NetworkFrameworkConfigurationProperty.builder()
 * .networkFabricConfiguration(NetworkFabricConfigurationProperty.builder()
 * .edition("edition")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkframeworkconfiguration.html)
 */
@CdkDslMarker
public class CfnMemberNetworkFrameworkConfigurationPropertyDsl {
    private val cdkBuilder: CfnMember.NetworkFrameworkConfigurationProperty.Builder =
        CfnMember.NetworkFrameworkConfigurationProperty.builder()

    /**
     * @param networkFabricConfiguration Configuration properties for Hyperledger Fabric for a
     *   member in a Managed Blockchain network that is using the Hyperledger Fabric framework.
     */
    public fun networkFabricConfiguration(networkFabricConfiguration: IResolvable) {
        cdkBuilder.networkFabricConfiguration(networkFabricConfiguration)
    }

    /**
     * @param networkFabricConfiguration Configuration properties for Hyperledger Fabric for a
     *   member in a Managed Blockchain network that is using the Hyperledger Fabric framework.
     */
    public fun networkFabricConfiguration(
        networkFabricConfiguration: CfnMember.NetworkFabricConfigurationProperty
    ) {
        cdkBuilder.networkFabricConfiguration(networkFabricConfiguration)
    }

    public fun build(): CfnMember.NetworkFrameworkConfigurationProperty = cdkBuilder.build()
}
