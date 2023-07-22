@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateMeasureFieldPropertyDsl {
  private val cdkBuilder: CfnTemplate.MeasureFieldProperty.Builder =
      CfnTemplate.MeasureFieldProperty.builder()

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
      fun calculatedMeasureField(calculatedMeasureField: CfnTemplate.CalculatedMeasureFieldProperty) {
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
      fun categoricalMeasureField(categoricalMeasureField: CfnTemplate.CategoricalMeasureFieldProperty) {
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
  public fun dateMeasureField(dateMeasureField: CfnTemplate.DateMeasureFieldProperty) {
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
      fun numericalMeasureField(numericalMeasureField: CfnTemplate.NumericalMeasureFieldProperty) {
    cdkBuilder.numericalMeasureField(numericalMeasureField)
  }

  public fun build(): CfnTemplate.MeasureFieldProperty = cdkBuilder.build()
}
