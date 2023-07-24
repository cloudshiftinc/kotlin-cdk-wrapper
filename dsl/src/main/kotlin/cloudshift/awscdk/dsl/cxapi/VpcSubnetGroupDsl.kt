@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cxapi.VpcSubnet
import software.amazon.awscdk.cxapi.VpcSubnetGroup
import software.amazon.awscdk.cxapi.VpcSubnetGroupType
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * A group of subnets returned by the VPC provider.
 *
 * The included subnets do NOT have to be symmetric!
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cxapi.*;
 * VpcSubnetGroup vpcSubnetGroup = VpcSubnetGroup.builder()
 * .name("name")
 * .subnets(List.of(VpcSubnet.builder()
 * .availabilityZone("availabilityZone")
 * .routeTableId("routeTableId")
 * .subnetId("subnetId")
 * // the properties below are optional
 * .cidr("cidr")
 * .build()))
 * .type(VpcSubnetGroupType.PUBLIC)
 * .build();
 * ```
 */
@CdkDslMarker
public class VpcSubnetGroupDsl {
    private val cdkBuilder: VpcSubnetGroup.Builder = VpcSubnetGroup.builder()

    private val _subnets: MutableList<VpcSubnet> = mutableListOf()

    /**
     * @param name The name of the subnet group, determined by looking at the tags of of the subnets
     * that belong to it.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param subnets The subnets that are part of this group.
     * There is no condition that the subnets have to be symmetric
     * in the group.
     */
    public fun subnets(subnets: VpcSubnetDsl.() -> Unit) {
        _subnets.add(VpcSubnetDsl().apply(subnets).build())
    }

    /**
     * @param subnets The subnets that are part of this group.
     * There is no condition that the subnets have to be symmetric
     * in the group.
     */
    public fun subnets(subnets: Collection<VpcSubnet>) {
        _subnets.addAll(subnets)
    }

    /**
     * @param type The type of the subnet group.
     */
    public fun type(type: VpcSubnetGroupType) {
        cdkBuilder.type(type)
    }

    public fun build(): VpcSubnetGroup {
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        return cdkBuilder.build()
    }
}
