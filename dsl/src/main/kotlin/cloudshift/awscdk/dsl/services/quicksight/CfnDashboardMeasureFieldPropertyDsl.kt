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
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardMeasureFieldPropertyDsl {
    private val cdkBuilder: CfnDashboard.MeasureFieldProperty.Builder =
        CfnDashboard.MeasureFieldProperty.builder()

    public fun calculatedMeasureField(calculatedMeasureField: IResolvable) {
        cdkBuilder.calculatedMeasureField(calculatedMeasureField)
    }

    public fun calculatedMeasureField(calculatedMeasureField: CfnDashboard.CalculatedMeasureFieldProperty) {
        cdkBuilder.calculatedMeasureField(calculatedMeasureField)
    }

    public fun categoricalMeasureField(categoricalMeasureField: IResolvable) {
        cdkBuilder.categoricalMeasureField(categoricalMeasureField)
    }

    public fun categoricalMeasureField(categoricalMeasureField: CfnDashboard.CategoricalMeasureFieldProperty) {
        cdkBuilder.categoricalMeasureField(categoricalMeasureField)
    }

    public fun dateMeasureField(dateMeasureField: IResolvable) {
        cdkBuilder.dateMeasureField(dateMeasureField)
    }

    public fun dateMeasureField(dateMeasureField: CfnDashboard.DateMeasureFieldProperty) {
        cdkBuilder.dateMeasureField(dateMeasureField)
    }

    public fun numericalMeasureField(numericalMeasureField: IResolvable) {
        cdkBuilder.numericalMeasureField(numericalMeasureField)
    }

    public fun numericalMeasureField(numericalMeasureField: CfnDashboard.NumericalMeasureFieldProperty) {
        cdkBuilder.numericalMeasureField(numericalMeasureField)
    }

    public fun build(): CfnDashboard.MeasureFieldProperty = cdkBuilder.build()
}
