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
import kotlin.String

@CdkDslMarker
public class CfnTemplatePivotFieldSortOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.PivotFieldSortOptionsProperty.Builder =
        CfnTemplate.PivotFieldSortOptionsProperty.builder()

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun sortBy(sortBy: IResolvable) {
        cdkBuilder.sortBy(sortBy)
    }

    public fun sortBy(sortBy: CfnTemplate.PivotTableSortByProperty) {
        cdkBuilder.sortBy(sortBy)
    }

    public fun build(): CfnTemplate.PivotFieldSortOptionsProperty = cdkBuilder.build()
}
