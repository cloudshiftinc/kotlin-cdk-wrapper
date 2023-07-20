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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnTrafficRoute
import software.amazon.awscdk.CfnTrafficRouting
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTrafficRoutingDsl {
    private val cdkBuilder: CfnTrafficRouting.Builder = CfnTrafficRouting.builder()

    private val _targetGroups: MutableList<String> = mutableListOf()

    public fun prodTrafficRoute(block: CfnTrafficRouteDsl.() -> Unit = {}) {
        val builder = CfnTrafficRouteDsl()
        builder.apply(block)
        cdkBuilder.prodTrafficRoute(builder.build())
    }

    public fun prodTrafficRoute(prodTrafficRoute: CfnTrafficRoute) {
        cdkBuilder.prodTrafficRoute(prodTrafficRoute)
    }

    public fun targetGroups(vararg targetGroups: String) {
        _targetGroups.addAll(listOf(*targetGroups))
    }

    public fun targetGroups(targetGroups: Collection<String>) {
        _targetGroups.addAll(targetGroups)
    }

    public fun testTrafficRoute(block: CfnTrafficRouteDsl.() -> Unit = {}) {
        val builder = CfnTrafficRouteDsl()
        builder.apply(block)
        cdkBuilder.testTrafficRoute(builder.build())
    }

    public fun testTrafficRoute(testTrafficRoute: CfnTrafficRoute) {
        cdkBuilder.testTrafficRoute(testTrafficRoute)
    }

    public fun build(): CfnTrafficRouting {
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
