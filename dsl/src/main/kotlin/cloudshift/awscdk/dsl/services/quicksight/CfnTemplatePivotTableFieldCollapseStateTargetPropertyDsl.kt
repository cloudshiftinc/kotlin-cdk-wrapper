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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplatePivotTableFieldCollapseStateTargetPropertyDsl {
    private val cdkBuilder: CfnTemplate.PivotTableFieldCollapseStateTargetProperty.Builder =
        CfnTemplate.PivotTableFieldCollapseStateTargetProperty.builder()

    private val _fieldDataPathValues: MutableList<Any> = mutableListOf()

    public fun fieldDataPathValues(vararg fieldDataPathValues: Any) {
        _fieldDataPathValues.addAll(listOf(*fieldDataPathValues))
    }

    public fun fieldDataPathValues(fieldDataPathValues: Collection<Any>) {
        _fieldDataPathValues.addAll(fieldDataPathValues)
    }

    public fun fieldDataPathValues(fieldDataPathValues: IResolvable) {
        cdkBuilder.fieldDataPathValues(fieldDataPathValues)
    }

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun build(): CfnTemplate.PivotTableFieldCollapseStateTargetProperty {
        if (_fieldDataPathValues.isNotEmpty()) cdkBuilder.fieldDataPathValues(_fieldDataPathValues)
        return cdkBuilder.build()
    }
}
