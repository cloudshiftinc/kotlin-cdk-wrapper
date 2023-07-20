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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.ISubnet
import software.amazon.awscdk.services.ec2.SelectedSubnets
import software.constructs.IDependable
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class SelectedSubnetsDsl {
    private val cdkBuilder: SelectedSubnets.Builder = SelectedSubnets.builder()

    private val _availabilityZones: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _subnets: MutableList<ISubnet> = mutableListOf()

    public fun availabilityZones(vararg availabilityZones: String) {
        _availabilityZones.addAll(listOf(*availabilityZones))
    }

    public fun availabilityZones(availabilityZones: Collection<String>) {
        _availabilityZones.addAll(availabilityZones)
    }

    public fun hasPublic(hasPublic: Boolean) {
        cdkBuilder.hasPublic(hasPublic)
    }

    public fun internetConnectivityEstablished(internetConnectivityEstablished: IDependable) {
        cdkBuilder.internetConnectivityEstablished(internetConnectivityEstablished)
    }

    public fun isPendingLookup(isPendingLookup: Boolean) {
        cdkBuilder.isPendingLookup(isPendingLookup)
    }

    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    public fun subnets(vararg subnets: ISubnet) {
        _subnets.addAll(listOf(*subnets))
    }

    public fun subnets(subnets: Collection<ISubnet>) {
        _subnets.addAll(subnets)
    }

    public fun build(): SelectedSubnets {
        if (_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        return cdkBuilder.build()
    }
}
