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
import software.amazon.awscdk.services.appmesh.HttpRetryPolicy
import software.amazon.awscdk.services.appmesh.HttpRouteMatch
import software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions
import software.amazon.awscdk.services.appmesh.HttpTimeout
import software.amazon.awscdk.services.appmesh.WeightedTarget
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class HttpRouteSpecOptionsDsl {
    private val cdkBuilder: HttpRouteSpecOptions.Builder = HttpRouteSpecOptions.builder()

    private val _weightedTargets: MutableList<WeightedTarget> = mutableListOf()

    public fun match(block: HttpRouteMatchDsl.() -> Unit = {}) {
        val builder = HttpRouteMatchDsl()
        builder.apply(block)
        cdkBuilder.match(builder.build())
    }

    public fun match(match: HttpRouteMatch) {
        cdkBuilder.match(match)
    }

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun retryPolicy(block: HttpRetryPolicyDsl.() -> Unit = {}) {
        val builder = HttpRetryPolicyDsl()
        builder.apply(block)
        cdkBuilder.retryPolicy(builder.build())
    }

    public fun retryPolicy(retryPolicy: HttpRetryPolicy) {
        cdkBuilder.retryPolicy(retryPolicy)
    }

    public fun timeout(block: HttpTimeoutDsl.() -> Unit = {}) {
        val builder = HttpTimeoutDsl()
        builder.apply(block)
        cdkBuilder.timeout(builder.build())
    }

    public fun timeout(timeout: HttpTimeout) {
        cdkBuilder.timeout(timeout)
    }

    public fun weightedTargets(weightedTargets: WeightedTargetDsl.() -> Unit) {
        _weightedTargets.add(WeightedTargetDsl().apply(weightedTargets).build())
    }

    public fun weightedTargets(weightedTargets: Collection<WeightedTarget>) {
        _weightedTargets.addAll(weightedTargets)
    }

    public fun build(): HttpRouteSpecOptions {
        if (_weightedTargets.isNotEmpty()) cdkBuilder.weightedTargets(_weightedTargets)
        return cdkBuilder.build()
    }
}
