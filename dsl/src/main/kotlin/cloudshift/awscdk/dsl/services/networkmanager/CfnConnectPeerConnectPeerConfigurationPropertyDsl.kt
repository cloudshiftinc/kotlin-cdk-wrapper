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

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnConnectPeerConnectPeerConfigurationPropertyDsl {
    private val cdkBuilder: CfnConnectPeer.ConnectPeerConfigurationProperty.Builder =
        CfnConnectPeer.ConnectPeerConfigurationProperty.builder()

    private val _bgpConfigurations: MutableList<Any> = mutableListOf()

    private val _insideCidrBlocks: MutableList<String> = mutableListOf()

    public fun bgpConfigurations(vararg bgpConfigurations: Any) {
        _bgpConfigurations.addAll(listOf(*bgpConfigurations))
    }

    public fun bgpConfigurations(bgpConfigurations: Collection<Any>) {
        _bgpConfigurations.addAll(bgpConfigurations)
    }

    public fun bgpConfigurations(bgpConfigurations: IResolvable) {
        cdkBuilder.bgpConfigurations(bgpConfigurations)
    }

    public fun coreNetworkAddress(coreNetworkAddress: String) {
        cdkBuilder.coreNetworkAddress(coreNetworkAddress)
    }

    public fun insideCidrBlocks(vararg insideCidrBlocks: String) {
        _insideCidrBlocks.addAll(listOf(*insideCidrBlocks))
    }

    public fun insideCidrBlocks(insideCidrBlocks: Collection<String>) {
        _insideCidrBlocks.addAll(insideCidrBlocks)
    }

    public fun peerAddress(peerAddress: String) {
        cdkBuilder.peerAddress(peerAddress)
    }

    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnConnectPeer.ConnectPeerConfigurationProperty {
        if (_bgpConfigurations.isNotEmpty()) cdkBuilder.bgpConfigurations(_bgpConfigurations)
        if (_insideCidrBlocks.isNotEmpty()) cdkBuilder.insideCidrBlocks(_insideCidrBlocks)
        return cdkBuilder.build()
    }
}
