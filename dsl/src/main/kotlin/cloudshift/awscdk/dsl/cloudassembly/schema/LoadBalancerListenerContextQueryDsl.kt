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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery
import software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol
import software.amazon.awscdk.cloudassembly.schema.LoadBalancerType
import software.amazon.awscdk.cloudassembly.schema.Tag
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class LoadBalancerListenerContextQueryDsl {
    private val cdkBuilder: LoadBalancerListenerContextQuery.Builder =
        LoadBalancerListenerContextQuery.builder()

    private val _loadBalancerTags: MutableList<Tag> = mutableListOf()

    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    public fun listenerArn(listenerArn: String) {
        cdkBuilder.listenerArn(listenerArn)
    }

    public fun listenerPort(listenerPort: Number) {
        cdkBuilder.listenerPort(listenerPort)
    }

    public fun listenerProtocol(listenerProtocol: LoadBalancerListenerProtocol) {
        cdkBuilder.listenerProtocol(listenerProtocol)
    }

    public fun loadBalancerArn(loadBalancerArn: String) {
        cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    public fun loadBalancerTags(loadBalancerTags: TagDsl.() -> Unit) {
        _loadBalancerTags.add(TagDsl().apply(loadBalancerTags).build())
    }

    public fun loadBalancerTags(loadBalancerTags: Collection<Tag>) {
        _loadBalancerTags.addAll(loadBalancerTags)
    }

    public fun loadBalancerType(loadBalancerType: LoadBalancerType) {
        cdkBuilder.loadBalancerType(loadBalancerType)
    }

    public fun lookupRoleArn(lookupRoleArn: String) {
        cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): LoadBalancerListenerContextQuery {
        if (_loadBalancerTags.isNotEmpty()) cdkBuilder.loadBalancerTags(_loadBalancerTags)
        return cdkBuilder.build()
    }
}
