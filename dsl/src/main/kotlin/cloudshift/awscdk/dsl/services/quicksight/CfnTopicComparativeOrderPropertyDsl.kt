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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTopic
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTopicComparativeOrderPropertyDsl {
    private val cdkBuilder: CfnTopic.ComparativeOrderProperty.Builder =
        CfnTopic.ComparativeOrderProperty.builder()

    private val _specifedOrder: MutableList<String> = mutableListOf()

    public fun specifedOrder(vararg specifedOrder: String) {
        _specifedOrder.addAll(listOf(*specifedOrder))
    }

    public fun specifedOrder(specifedOrder: Collection<String>) {
        _specifedOrder.addAll(specifedOrder)
    }

    public fun treatUndefinedSpecifiedValues(treatUndefinedSpecifiedValues: String) {
        cdkBuilder.treatUndefinedSpecifiedValues(treatUndefinedSpecifiedValues)
    }

    public fun useOrdering(useOrdering: String) {
        cdkBuilder.useOrdering(useOrdering)
    }

    public fun build(): CfnTopic.ComparativeOrderProperty {
        if (_specifedOrder.isNotEmpty()) cdkBuilder.specifedOrder(_specifedOrder)
        return cdkBuilder.build()
    }
}
