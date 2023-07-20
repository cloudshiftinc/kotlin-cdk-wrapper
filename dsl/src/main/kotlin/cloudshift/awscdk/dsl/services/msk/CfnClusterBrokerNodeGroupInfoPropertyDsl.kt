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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnClusterBrokerNodeGroupInfoPropertyDsl {
    private val cdkBuilder: CfnCluster.BrokerNodeGroupInfoProperty.Builder =
        CfnCluster.BrokerNodeGroupInfoProperty.builder()

    private val _clientSubnets: MutableList<String> = mutableListOf()

    private val _securityGroups: MutableList<String> = mutableListOf()

    public fun brokerAzDistribution(brokerAzDistribution: String) {
        cdkBuilder.brokerAzDistribution(brokerAzDistribution)
    }

    public fun clientSubnets(vararg clientSubnets: String) {
        _clientSubnets.addAll(listOf(*clientSubnets))
    }

    public fun clientSubnets(clientSubnets: Collection<String>) {
        _clientSubnets.addAll(clientSubnets)
    }

    public fun connectivityInfo(connectivityInfo: IResolvable) {
        cdkBuilder.connectivityInfo(connectivityInfo)
    }

    public fun connectivityInfo(connectivityInfo: CfnCluster.ConnectivityInfoProperty) {
        cdkBuilder.connectivityInfo(connectivityInfo)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun storageInfo(storageInfo: IResolvable) {
        cdkBuilder.storageInfo(storageInfo)
    }

    public fun storageInfo(storageInfo: CfnCluster.StorageInfoProperty) {
        cdkBuilder.storageInfo(storageInfo)
    }

    public fun build(): CfnCluster.BrokerNodeGroupInfoProperty {
        if (_clientSubnets.isNotEmpty()) cdkBuilder.clientSubnets(_clientSubnets)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
