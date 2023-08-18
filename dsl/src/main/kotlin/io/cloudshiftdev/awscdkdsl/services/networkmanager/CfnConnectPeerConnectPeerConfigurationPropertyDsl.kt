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

package io.cloudshiftdev.awscdkdsl.services.networkmanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer

/**
 * Describes a core network Connect peer configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * ConnectPeerConfigurationProperty connectPeerConfigurationProperty =
 * ConnectPeerConfigurationProperty.builder()
 * .bgpConfigurations(List.of(ConnectPeerBgpConfigurationProperty.builder()
 * .coreNetworkAddress("coreNetworkAddress")
 * .coreNetworkAsn(123)
 * .peerAddress("peerAddress")
 * .peerAsn(123)
 * .build()))
 * .coreNetworkAddress("coreNetworkAddress")
 * .insideCidrBlocks(List.of("insideCidrBlocks"))
 * .peerAddress("peerAddress")
 * .protocol("protocol")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-connectpeerconfiguration.html)
 */
@CdkDslMarker
public class CfnConnectPeerConnectPeerConfigurationPropertyDsl {
    private val cdkBuilder: CfnConnectPeer.ConnectPeerConfigurationProperty.Builder =
        CfnConnectPeer.ConnectPeerConfigurationProperty.builder()

    private val _bgpConfigurations: MutableList<Any> = mutableListOf()

    private val _insideCidrBlocks: MutableList<String> = mutableListOf()

    /** @param bgpConfigurations The Connect peer BGP configurations. */
    public fun bgpConfigurations(vararg bgpConfigurations: Any) {
        _bgpConfigurations.addAll(listOf(*bgpConfigurations))
    }

    /** @param bgpConfigurations The Connect peer BGP configurations. */
    public fun bgpConfigurations(bgpConfigurations: Collection<Any>) {
        _bgpConfigurations.addAll(bgpConfigurations)
    }

    /** @param bgpConfigurations The Connect peer BGP configurations. */
    public fun bgpConfigurations(bgpConfigurations: IResolvable) {
        cdkBuilder.bgpConfigurations(bgpConfigurations)
    }

    /** @param coreNetworkAddress The IP address of a core network. */
    public fun coreNetworkAddress(coreNetworkAddress: String) {
        cdkBuilder.coreNetworkAddress(coreNetworkAddress)
    }

    /** @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration. */
    public fun insideCidrBlocks(vararg insideCidrBlocks: String) {
        _insideCidrBlocks.addAll(listOf(*insideCidrBlocks))
    }

    /** @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration. */
    public fun insideCidrBlocks(insideCidrBlocks: Collection<String>) {
        _insideCidrBlocks.addAll(insideCidrBlocks)
    }

    /** @param peerAddress The IP address of the Connect peer. */
    public fun peerAddress(peerAddress: String) {
        cdkBuilder.peerAddress(peerAddress)
    }

    /** @param protocol The protocol used for a Connect peer configuration. */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnConnectPeer.ConnectPeerConfigurationProperty {
        if (_bgpConfigurations.isNotEmpty()) cdkBuilder.bgpConfigurations(_bgpConfigurations)
        if (_insideCidrBlocks.isNotEmpty()) cdkBuilder.insideCidrBlocks(_insideCidrBlocks)
        return cdkBuilder.build()
    }
}
