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
import software.amazon.awscdk.services.ec2.SubnetFilter
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ec2.SubnetType
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class SubnetSelectionDsl {
    private val cdkBuilder: SubnetSelection.Builder = SubnetSelection.builder()

    private val _availabilityZones: MutableList<String> = mutableListOf()

    private val _subnetFilters: MutableList<SubnetFilter> = mutableListOf()

    private val _subnets: MutableList<ISubnet> = mutableListOf()

    public fun availabilityZones(vararg availabilityZones: String) {
        _availabilityZones.addAll(listOf(*availabilityZones))
    }

    public fun availabilityZones(availabilityZones: Collection<String>) {
        _availabilityZones.addAll(availabilityZones)
    }

    public fun onePerAz(onePerAz: Boolean) {
        cdkBuilder.onePerAz(onePerAz)
    }

    public fun subnetFilters(vararg subnetFilters: SubnetFilter) {
        _subnetFilters.addAll(listOf(*subnetFilters))
    }

    public fun subnetFilters(subnetFilters: Collection<SubnetFilter>) {
        _subnetFilters.addAll(subnetFilters)
    }

    public fun subnetGroupName(subnetGroupName: String) {
        cdkBuilder.subnetGroupName(subnetGroupName)
    }

    public fun subnetType(subnetType: SubnetType) {
        cdkBuilder.subnetType(subnetType)
    }

    public fun subnets(vararg subnets: ISubnet) {
        _subnets.addAll(listOf(*subnets))
    }

    public fun subnets(subnets: Collection<ISubnet>) {
        _subnets.addAll(subnets)
    }

    public fun build(): SubnetSelection {
        if (_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
        if (_subnetFilters.isNotEmpty()) cdkBuilder.subnetFilters(_subnetFilters)
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        return cdkBuilder.build()
    }
}
