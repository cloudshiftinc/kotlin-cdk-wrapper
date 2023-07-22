@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisMeasureFieldPropertyDsl {
  private val cdkBuilder: CfnAnalysis.MeasureFieldProperty.Builder =
      CfnAnalysis.MeasureFieldProperty.builder()

  /**
   * @param calculatedMeasureField The calculated measure field only used in pivot tables.
   */
  public fun calculatedMeasureField(calculatedMeasureField: IResolvable) {
    cdkBuilder.calculatedMeasureField(calculatedMeasureField)
  }

  /**
   * @param calculatedMeasureField The calculated measure field only used in pivot tables.
   */
  public
      fun calculatedMeasureField(calculatedMeasureField: CfnAnalysis.CalculatedMeasureFieldProperty) {
    cdkBuilder.calculatedMeasureField(calculatedMeasureField)
  }

  /**
   * @param categoricalMeasureField The measure type field with categorical type columns.
   */
  public fun categoricalMeasureField(categoricalMeasureField: IResolvable) {
    cdkBuilder.categoricalMeasureField(categoricalMeasureField)
  }

  /**
   * @param categoricalMeasureField The measure type field with categorical type columns.
   */
  public
      fun categoricalMeasureField(categoricalMeasureField: CfnAnalysis.CategoricalMeasureFieldProperty) {
    cdkBuilder.categoricalMeasureField(categoricalMeasureField)
  }

  /**
   * @param dateMeasureField The measure type field with date type columns.
   */
  public fun dateMeasureField(dateMeasureField: IResolvable) {
    cdkBuilder.dateMeasureField(dateMeasureField)
  }

  /**
   * @param dateMeasureField The measure type field with date type columns.
   */
  public fun dateMeasureField(dateMeasureField: CfnAnalysis.DateMeasureFieldProperty) {
    cdkBuilder.dateMeasureField(dateMeasureField)
  }

  /**
   * @param numericalMeasureField The measure type field with numerical type columns.
   */
  public fun numericalMeasureField(numericalMeasureField: IResolvable) {
    cdkBuilder.numericalMeasureField(numericalMeasureField)
  }

  /**
   * @param numericalMeasureField The measure type field with numerical type columns.
   */
  public
      fun numericalMeasureField(numericalMeasureField: CfnAnalysis.NumericalMeasureFieldProperty) {
    cdkBuilder.numericalMeasureField(numericalMeasureField)
  }

  public fun build(): CfnAnalysis.MeasureFieldProperty = cdkBuilder.build()
}
