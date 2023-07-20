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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLoadBalancerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLoadBalancer.Builder = CfnLoadBalancer.Builder.create(scope, id)

    private val _loadBalancerAttributes: MutableList<Any> = mutableListOf()

    private val _securityGroups: MutableList<String> = mutableListOf()

    private val _subnetMappings: MutableList<Any> = mutableListOf()

    private val _subnets: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
    }

    public fun loadBalancerAttributes(vararg loadBalancerAttributes: Any) {
        _loadBalancerAttributes.addAll(listOf(*loadBalancerAttributes))
    }

    public fun loadBalancerAttributes(loadBalancerAttributes: Collection<Any>) {
        _loadBalancerAttributes.addAll(loadBalancerAttributes)
    }

    public fun loadBalancerAttributes(loadBalancerAttributes: IResolvable) {
        cdkBuilder.loadBalancerAttributes(loadBalancerAttributes)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun scheme(scheme: String) {
        cdkBuilder.scheme(scheme)
    }

    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun subnetMappings(vararg subnetMappings: Any) {
        _subnetMappings.addAll(listOf(*subnetMappings))
    }

    public fun subnetMappings(subnetMappings: Collection<Any>) {
        _subnetMappings.addAll(subnetMappings)
    }

    public fun subnetMappings(subnetMappings: IResolvable) {
        cdkBuilder.subnetMappings(subnetMappings)
    }

    public fun subnets(vararg subnets: String) {
        _subnets.addAll(listOf(*subnets))
    }

    public fun subnets(subnets: Collection<String>) {
        _subnets.addAll(subnets)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnLoadBalancer {
        if (_loadBalancerAttributes.isNotEmpty()) {
            cdkBuilder.loadBalancerAttributes(_loadBalancerAttributes)
        }
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_subnetMappings.isNotEmpty()) cdkBuilder.subnetMappings(_subnetMappings)
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
