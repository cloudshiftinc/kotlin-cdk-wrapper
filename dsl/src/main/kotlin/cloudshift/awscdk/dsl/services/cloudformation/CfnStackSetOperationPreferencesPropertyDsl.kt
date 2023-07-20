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

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudformation.CfnStackSet
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStackSetOperationPreferencesPropertyDsl {
    private val cdkBuilder: CfnStackSet.OperationPreferencesProperty.Builder =
        CfnStackSet.OperationPreferencesProperty.builder()

    private val _regionOrder: MutableList<String> = mutableListOf()

    public fun failureToleranceCount(failureToleranceCount: Number) {
        cdkBuilder.failureToleranceCount(failureToleranceCount)
    }

    public fun failureTolerancePercentage(failureTolerancePercentage: Number) {
        cdkBuilder.failureTolerancePercentage(failureTolerancePercentage)
    }

    public fun maxConcurrentCount(maxConcurrentCount: Number) {
        cdkBuilder.maxConcurrentCount(maxConcurrentCount)
    }

    public fun maxConcurrentPercentage(maxConcurrentPercentage: Number) {
        cdkBuilder.maxConcurrentPercentage(maxConcurrentPercentage)
    }

    public fun regionConcurrencyType(regionConcurrencyType: String) {
        cdkBuilder.regionConcurrencyType(regionConcurrencyType)
    }

    public fun regionOrder(vararg regionOrder: String) {
        _regionOrder.addAll(listOf(*regionOrder))
    }

    public fun regionOrder(regionOrder: Collection<String>) {
        _regionOrder.addAll(regionOrder)
    }

    public fun build(): CfnStackSet.OperationPreferencesProperty {
        if (_regionOrder.isNotEmpty()) cdkBuilder.regionOrder(_regionOrder)
        return cdkBuilder.build()
    }
}
