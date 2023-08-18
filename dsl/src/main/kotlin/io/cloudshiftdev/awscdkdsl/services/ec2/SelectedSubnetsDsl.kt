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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ISubnet
import software.amazon.awscdk.services.ec2.SelectedSubnets
import software.constructs.IDependable

/**
 * Result of selecting a subset of subnets from a VPC.
 *
 * Example:
 * ```
 * Vpc vpc = Vpc.Builder.create(this, "TheVPC")
 * .ipAddresses(IpAddresses.cidr("10.0.0.0/16"))
 * .build();
 * // Iterate the private subnets
 * SelectedSubnets selection = vpc.selectSubnets(SubnetSelection.builder()
 * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
 * .build());
 * for (Object subnet : selection.getSubnets()) {
 * }
 * ```
 */
@CdkDslMarker
public class SelectedSubnetsDsl {
    private val cdkBuilder: SelectedSubnets.Builder = SelectedSubnets.builder()

    private val _availabilityZones: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _subnets: MutableList<ISubnet> = mutableListOf()

    /** @param availabilityZones The respective AZs of each subnet. */
    public fun availabilityZones(vararg availabilityZones: String) {
        _availabilityZones.addAll(listOf(*availabilityZones))
    }

    /** @param availabilityZones The respective AZs of each subnet. */
    public fun availabilityZones(availabilityZones: Collection<String>) {
        _availabilityZones.addAll(availabilityZones)
    }

    /** @param hasPublic Whether any of the given subnets are from the VPC's public subnets. */
    public fun hasPublic(hasPublic: Boolean) {
        cdkBuilder.hasPublic(hasPublic)
    }

    /**
     * @param internetConnectivityEstablished Dependency representing internet connectivity for
     *   these subnets.
     */
    public fun internetConnectivityEstablished(internetConnectivityEstablished: IDependable) {
        cdkBuilder.internetConnectivityEstablished(internetConnectivityEstablished)
    }

    /**
     * @param isPendingLookup The subnet selection is not actually real yet. If this value is true,
     *   don't validate anything about the subnets. The count or identities are not known yet, and
     *   the validation will most likely fail which will prevent a successful lookup.
     */
    public fun isPendingLookup(isPendingLookup: Boolean) {
        cdkBuilder.isPendingLookup(isPendingLookup)
    }

    /** @param subnetIds The subnet IDs. */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /** @param subnetIds The subnet IDs. */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /** @param subnets Selected subnet objects. */
    public fun subnets(vararg subnets: ISubnet) {
        _subnets.addAll(listOf(*subnets))
    }

    /** @param subnets Selected subnet objects. */
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
