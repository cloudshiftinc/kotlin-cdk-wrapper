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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplateFilledMapConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnTemplate.FilledMapConditionalFormattingProperty.Builder =
        CfnTemplate.FilledMapConditionalFormattingProperty.builder()

    private val _conditionalFormattingOptions: MutableList<Any> = mutableListOf()

    public fun conditionalFormattingOptions(vararg conditionalFormattingOptions: Any) {
        _conditionalFormattingOptions.addAll(listOf(*conditionalFormattingOptions))
    }

    public fun conditionalFormattingOptions(conditionalFormattingOptions: Collection<Any>) {
        _conditionalFormattingOptions.addAll(conditionalFormattingOptions)
    }

    public fun conditionalFormattingOptions(conditionalFormattingOptions: IResolvable) {
        cdkBuilder.conditionalFormattingOptions(conditionalFormattingOptions)
    }

    public fun build(): CfnTemplate.FilledMapConditionalFormattingProperty {
        if (_conditionalFormattingOptions.isNotEmpty()) {
            cdkBuilder.conditionalFormattingOptions(_conditionalFormattingOptions)
        }
        return cdkBuilder.build()
    }
}
