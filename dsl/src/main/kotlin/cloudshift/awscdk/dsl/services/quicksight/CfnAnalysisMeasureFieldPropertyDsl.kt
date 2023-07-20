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
public class CfnAnalysisMeasureFieldPropertyDsl {
    private val cdkBuilder: CfnAnalysis.MeasureFieldProperty.Builder =
        CfnAnalysis.MeasureFieldProperty.builder()

    public fun calculatedMeasureField(calculatedMeasureField: IResolvable) {
        cdkBuilder.calculatedMeasureField(calculatedMeasureField)
    }

    public fun calculatedMeasureField(calculatedMeasureField: CfnAnalysis.CalculatedMeasureFieldProperty) {
        cdkBuilder.calculatedMeasureField(calculatedMeasureField)
    }

    public fun categoricalMeasureField(categoricalMeasureField: IResolvable) {
        cdkBuilder.categoricalMeasureField(categoricalMeasureField)
    }

    public fun categoricalMeasureField(categoricalMeasureField: CfnAnalysis.CategoricalMeasureFieldProperty) {
        cdkBuilder.categoricalMeasureField(categoricalMeasureField)
    }

    public fun dateMeasureField(dateMeasureField: IResolvable) {
        cdkBuilder.dateMeasureField(dateMeasureField)
    }

    public fun dateMeasureField(dateMeasureField: CfnAnalysis.DateMeasureFieldProperty) {
        cdkBuilder.dateMeasureField(dateMeasureField)
    }

    public fun numericalMeasureField(numericalMeasureField: IResolvable) {
        cdkBuilder.numericalMeasureField(numericalMeasureField)
    }

    public fun numericalMeasureField(numericalMeasureField: CfnAnalysis.NumericalMeasureFieldProperty) {
        cdkBuilder.numericalMeasureField(numericalMeasureField)
    }

    public fun build(): CfnAnalysis.MeasureFieldProperty = cdkBuilder.build()
}
