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

@CdkDslMarker
public class CfnTemplateDimensionFieldPropertyDsl {
    private val cdkBuilder: CfnTemplate.DimensionFieldProperty.Builder =
        CfnTemplate.DimensionFieldProperty.builder()

    public fun categoricalDimensionField(categoricalDimensionField: IResolvable) {
        cdkBuilder.categoricalDimensionField(categoricalDimensionField)
    }

    public fun categoricalDimensionField(categoricalDimensionField: CfnTemplate.CategoricalDimensionFieldProperty) {
        cdkBuilder.categoricalDimensionField(categoricalDimensionField)
    }

    public fun dateDimensionField(dateDimensionField: IResolvable) {
        cdkBuilder.dateDimensionField(dateDimensionField)
    }

    public fun dateDimensionField(dateDimensionField: CfnTemplate.DateDimensionFieldProperty) {
        cdkBuilder.dateDimensionField(dateDimensionField)
    }

    public fun numericalDimensionField(numericalDimensionField: IResolvable) {
        cdkBuilder.numericalDimensionField(numericalDimensionField)
    }

    public fun numericalDimensionField(numericalDimensionField: CfnTemplate.NumericalDimensionFieldProperty) {
        cdkBuilder.numericalDimensionField(numericalDimensionField)
    }

    public fun build(): CfnTemplate.DimensionFieldProperty = cdkBuilder.build()
}
