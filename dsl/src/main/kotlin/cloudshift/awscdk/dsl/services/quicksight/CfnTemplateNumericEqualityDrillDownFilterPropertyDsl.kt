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
import kotlin.Number

@CdkDslMarker
public class CfnTemplateNumericEqualityDrillDownFilterPropertyDsl {
    private val cdkBuilder: CfnTemplate.NumericEqualityDrillDownFilterProperty.Builder =
        CfnTemplate.NumericEqualityDrillDownFilterProperty.builder()

    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTemplate.NumericEqualityDrillDownFilterProperty = cdkBuilder.build()
}
