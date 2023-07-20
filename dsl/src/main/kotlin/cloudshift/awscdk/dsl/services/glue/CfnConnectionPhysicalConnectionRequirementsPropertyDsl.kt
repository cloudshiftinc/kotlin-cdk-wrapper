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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.glue.CfnConnection
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnConnectionPhysicalConnectionRequirementsPropertyDsl {
    private val cdkBuilder: CfnConnection.PhysicalConnectionRequirementsProperty.Builder =
        CfnConnection.PhysicalConnectionRequirementsProperty.builder()

    private val _securityGroupIdList: MutableList<String> = mutableListOf()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun securityGroupIdList(vararg securityGroupIdList: String) {
        _securityGroupIdList.addAll(listOf(*securityGroupIdList))
    }

    public fun securityGroupIdList(securityGroupIdList: Collection<String>) {
        _securityGroupIdList.addAll(securityGroupIdList)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnConnection.PhysicalConnectionRequirementsProperty {
        if (_securityGroupIdList.isNotEmpty()) cdkBuilder.securityGroupIdList(_securityGroupIdList)
        return cdkBuilder.build()
    }
}
