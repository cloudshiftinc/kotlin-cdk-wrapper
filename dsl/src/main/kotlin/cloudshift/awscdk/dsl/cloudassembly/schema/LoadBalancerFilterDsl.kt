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
import software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter
import software.amazon.awscdk.cloudassembly.schema.LoadBalancerType
import software.amazon.awscdk.cloudassembly.schema.Tag
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class LoadBalancerFilterDsl {
    private val cdkBuilder: LoadBalancerFilter.Builder = LoadBalancerFilter.builder()

    private val _loadBalancerTags: MutableList<Tag> = mutableListOf()

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

    public fun build(): LoadBalancerFilter {
        if (_loadBalancerTags.isNotEmpty()) cdkBuilder.loadBalancerTags(_loadBalancerTags)
        return cdkBuilder.build()
    }
}
