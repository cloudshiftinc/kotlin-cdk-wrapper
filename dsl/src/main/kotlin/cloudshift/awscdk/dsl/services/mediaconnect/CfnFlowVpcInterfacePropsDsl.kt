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

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFlowVpcInterfacePropsDsl {
    private val cdkBuilder: CfnFlowVpcInterfaceProps.Builder = CfnFlowVpcInterfaceProps.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    public fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnFlowVpcInterfaceProps {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        return cdkBuilder.build()
    }
}
