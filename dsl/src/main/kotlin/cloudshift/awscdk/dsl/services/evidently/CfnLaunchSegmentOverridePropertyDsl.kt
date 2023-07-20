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

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnLaunch
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLaunchSegmentOverridePropertyDsl {
    private val cdkBuilder: CfnLaunch.SegmentOverrideProperty.Builder =
        CfnLaunch.SegmentOverrideProperty.builder()

    private val _weights: MutableList<Any> = mutableListOf()

    public fun evaluationOrder(evaluationOrder: Number) {
        cdkBuilder.evaluationOrder(evaluationOrder)
    }

    public fun segment(segment: String) {
        cdkBuilder.segment(segment)
    }

    public fun weights(vararg weights: Any) {
        _weights.addAll(listOf(*weights))
    }

    public fun weights(weights: Collection<Any>) {
        _weights.addAll(weights)
    }

    public fun weights(weights: IResolvable) {
        cdkBuilder.weights(weights)
    }

    public fun build(): CfnLaunch.SegmentOverrideProperty {
        if (_weights.isNotEmpty()) cdkBuilder.weights(_weights)
        return cdkBuilder.build()
    }
}
