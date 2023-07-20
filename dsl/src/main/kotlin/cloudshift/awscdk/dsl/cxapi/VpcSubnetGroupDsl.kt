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

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cxapi.VpcSubnet
import software.amazon.awscdk.cxapi.VpcSubnetGroup
import software.amazon.awscdk.cxapi.VpcSubnetGroupType
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class VpcSubnetGroupDsl {
    private val cdkBuilder: VpcSubnetGroup.Builder = VpcSubnetGroup.builder()

    private val _subnets: MutableList<VpcSubnet> = mutableListOf()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun subnets(subnets: VpcSubnetDsl.() -> Unit) {
        _subnets.add(VpcSubnetDsl().apply(subnets).build())
    }

    public fun subnets(subnets: Collection<VpcSubnet>) {
        _subnets.addAll(subnets)
    }

    public fun type(type: VpcSubnetGroupType) {
        cdkBuilder.type(type)
    }

    public fun build(): VpcSubnetGroup {
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        return cdkBuilder.build()
    }
}
