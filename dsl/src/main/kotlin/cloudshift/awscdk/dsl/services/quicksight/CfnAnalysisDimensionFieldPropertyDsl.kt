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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDimensionFieldPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DimensionFieldProperty.Builder =
        CfnAnalysis.DimensionFieldProperty.builder()

    public fun categoricalDimensionField(categoricalDimensionField: IResolvable) {
        cdkBuilder.categoricalDimensionField(categoricalDimensionField)
    }

    public fun categoricalDimensionField(categoricalDimensionField: CfnAnalysis.CategoricalDimensionFieldProperty) {
        cdkBuilder.categoricalDimensionField(categoricalDimensionField)
    }

    public fun dateDimensionField(dateDimensionField: IResolvable) {
        cdkBuilder.dateDimensionField(dateDimensionField)
    }

    public fun dateDimensionField(dateDimensionField: CfnAnalysis.DateDimensionFieldProperty) {
        cdkBuilder.dateDimensionField(dateDimensionField)
    }

    public fun numericalDimensionField(numericalDimensionField: IResolvable) {
        cdkBuilder.numericalDimensionField(numericalDimensionField)
    }

    public fun numericalDimensionField(numericalDimensionField: CfnAnalysis.NumericalDimensionFieldProperty) {
        cdkBuilder.numericalDimensionField(numericalDimensionField)
    }

    public fun build(): CfnAnalysis.DimensionFieldProperty = cdkBuilder.build()
}
