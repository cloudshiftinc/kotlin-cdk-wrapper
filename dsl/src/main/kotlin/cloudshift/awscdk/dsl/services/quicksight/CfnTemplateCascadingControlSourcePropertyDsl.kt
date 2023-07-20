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
public class CfnTemplateCascadingControlSourcePropertyDsl {
    private val cdkBuilder: CfnTemplate.CascadingControlSourceProperty.Builder =
        CfnTemplate.CascadingControlSourceProperty.builder()

    public fun columnToMatch(columnToMatch: IResolvable) {
        cdkBuilder.columnToMatch(columnToMatch)
    }

    public fun columnToMatch(columnToMatch: CfnTemplate.ColumnIdentifierProperty) {
        cdkBuilder.columnToMatch(columnToMatch)
    }

    public fun sourceSheetControlId(sourceSheetControlId: String) {
        cdkBuilder.sourceSheetControlId(sourceSheetControlId)
    }

    public fun build(): CfnTemplate.CascadingControlSourceProperty = cdkBuilder.build()
}
