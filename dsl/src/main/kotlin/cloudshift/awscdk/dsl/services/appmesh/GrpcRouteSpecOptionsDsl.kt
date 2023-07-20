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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appmesh.GrpcRetryPolicy
import software.amazon.awscdk.services.appmesh.GrpcRouteMatch
import software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions
import software.amazon.awscdk.services.appmesh.GrpcTimeout
import software.amazon.awscdk.services.appmesh.WeightedTarget
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class GrpcRouteSpecOptionsDsl {
    private val cdkBuilder: GrpcRouteSpecOptions.Builder = GrpcRouteSpecOptions.builder()

    private val _weightedTargets: MutableList<WeightedTarget> = mutableListOf()

    public fun match(block: GrpcRouteMatchDsl.() -> Unit = {}) {
        val builder = GrpcRouteMatchDsl()
        builder.apply(block)
        cdkBuilder.match(builder.build())
    }

    public fun match(match: GrpcRouteMatch) {
        cdkBuilder.match(match)
    }

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun retryPolicy(block: GrpcRetryPolicyDsl.() -> Unit = {}) {
        val builder = GrpcRetryPolicyDsl()
        builder.apply(block)
        cdkBuilder.retryPolicy(builder.build())
    }

    public fun retryPolicy(retryPolicy: GrpcRetryPolicy) {
        cdkBuilder.retryPolicy(retryPolicy)
    }

    public fun timeout(block: GrpcTimeoutDsl.() -> Unit = {}) {
        val builder = GrpcTimeoutDsl()
        builder.apply(block)
        cdkBuilder.timeout(builder.build())
    }

    public fun timeout(timeout: GrpcTimeout) {
        cdkBuilder.timeout(timeout)
    }

    public fun weightedTargets(weightedTargets: WeightedTargetDsl.() -> Unit) {
        _weightedTargets.add(WeightedTargetDsl().apply(weightedTargets).build())
    }

    public fun weightedTargets(weightedTargets: Collection<WeightedTarget>) {
        _weightedTargets.addAll(weightedTargets)
    }

    public fun build(): GrpcRouteSpecOptions {
        if (_weightedTargets.isNotEmpty()) cdkBuilder.weightedTargets(_weightedTargets)
        return cdkBuilder.build()
    }
}
