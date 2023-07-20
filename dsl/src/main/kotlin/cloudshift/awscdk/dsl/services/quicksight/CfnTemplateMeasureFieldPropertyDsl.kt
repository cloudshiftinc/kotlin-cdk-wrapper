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
public class CfnTemplateMeasureFieldPropertyDsl {
    private val cdkBuilder: CfnTemplate.MeasureFieldProperty.Builder =
        CfnTemplate.MeasureFieldProperty.builder()

    public fun calculatedMeasureField(calculatedMeasureField: IResolvable) {
        cdkBuilder.calculatedMeasureField(calculatedMeasureField)
    }

    public fun calculatedMeasureField(calculatedMeasureField: CfnTemplate.CalculatedMeasureFieldProperty) {
        cdkBuilder.calculatedMeasureField(calculatedMeasureField)
    }

    public fun categoricalMeasureField(categoricalMeasureField: IResolvable) {
        cdkBuilder.categoricalMeasureField(categoricalMeasureField)
    }

    public fun categoricalMeasureField(categoricalMeasureField: CfnTemplate.CategoricalMeasureFieldProperty) {
        cdkBuilder.categoricalMeasureField(categoricalMeasureField)
    }

    public fun dateMeasureField(dateMeasureField: IResolvable) {
        cdkBuilder.dateMeasureField(dateMeasureField)
    }

    public fun dateMeasureField(dateMeasureField: CfnTemplate.DateMeasureFieldProperty) {
        cdkBuilder.dateMeasureField(dateMeasureField)
    }

    public fun numericalMeasureField(numericalMeasureField: IResolvable) {
        cdkBuilder.numericalMeasureField(numericalMeasureField)
    }

    public fun numericalMeasureField(numericalMeasureField: CfnTemplate.NumericalMeasureFieldProperty) {
        cdkBuilder.numericalMeasureField(numericalMeasureField)
    }

    public fun build(): CfnTemplate.MeasureFieldProperty = cdkBuilder.build()
}
