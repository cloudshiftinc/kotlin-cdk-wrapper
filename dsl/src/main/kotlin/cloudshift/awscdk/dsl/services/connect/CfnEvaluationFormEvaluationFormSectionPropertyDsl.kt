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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEvaluationFormEvaluationFormSectionPropertyDsl {
    private val cdkBuilder: CfnEvaluationForm.EvaluationFormSectionProperty.Builder =
        CfnEvaluationForm.EvaluationFormSectionProperty.builder()

    private val _items: MutableList<Any> = mutableListOf()

    public fun instructions(instructions: String) {
        cdkBuilder.instructions(instructions)
    }

    public fun items(vararg items: Any) {
        _items.addAll(listOf(*items))
    }

    public fun items(items: Collection<Any>) {
        _items.addAll(items)
    }

    public fun items(items: IResolvable) {
        cdkBuilder.items(items)
    }

    public fun refId(refId: String) {
        cdkBuilder.refId(refId)
    }

    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnEvaluationForm.EvaluationFormSectionProperty {
        if (_items.isNotEmpty()) cdkBuilder.items(_items)
        return cdkBuilder.build()
    }
}
