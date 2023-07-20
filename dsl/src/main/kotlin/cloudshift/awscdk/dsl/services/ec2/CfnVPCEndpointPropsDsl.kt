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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVPCEndpointProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVPCEndpointPropsDsl {
    private val cdkBuilder: CfnVPCEndpointProps.Builder = CfnVPCEndpointProps.builder()

    private val _routeTableIds: MutableList<String> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    public fun policyDocument(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.policyDocument(builder.map)
    }

    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun privateDnsEnabled(privateDnsEnabled: Boolean) {
        cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    public fun privateDnsEnabled(privateDnsEnabled: IResolvable) {
        cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    public fun routeTableIds(vararg routeTableIds: String) {
        _routeTableIds.addAll(listOf(*routeTableIds))
    }

    public fun routeTableIds(routeTableIds: Collection<String>) {
        _routeTableIds.addAll(routeTableIds)
    }

    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    public fun vpcEndpointType(vpcEndpointType: String) {
        cdkBuilder.vpcEndpointType(vpcEndpointType)
    }

    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnVPCEndpointProps {
        if (_routeTableIds.isNotEmpty()) cdkBuilder.routeTableIds(_routeTableIds)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
