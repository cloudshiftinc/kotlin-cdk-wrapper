@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDimensionFieldPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DimensionFieldProperty.Builder =
      CfnAnalysis.DimensionFieldProperty.builder()

  /**
   * @param categoricalDimensionField The dimension type field with categorical type columns.
   */
  public fun categoricalDimensionField(categoricalDimensionField: IResolvable) {
    cdkBuilder.categoricalDimensionField(categoricalDimensionField)
  }

  /**
   * @param categoricalDimensionField The dimension type field with categorical type columns.
   */
  public
      fun categoricalDimensionField(categoricalDimensionField: CfnAnalysis.CategoricalDimensionFieldProperty) {
    cdkBuilder.categoricalDimensionField(categoricalDimensionField)
  }

  /**
   * @param dateDimensionField The dimension type field with date type columns.
   */
  public fun dateDimensionField(dateDimensionField: IResolvable) {
    cdkBuilder.dateDimensionField(dateDimensionField)
  }

  /**
   * @param dateDimensionField The dimension type field with date type columns.
   */
  public fun dateDimensionField(dateDimensionField: CfnAnalysis.DateDimensionFieldProperty) {
    cdkBuilder.dateDimensionField(dateDimensionField)
  }

  /**
   * @param numericalDimensionField The dimension type field with numerical type columns.
   */
  public fun numericalDimensionField(numericalDimensionField: IResolvable) {
    cdkBuilder.numericalDimensionField(numericalDimensionField)
  }

  /**
   * @param numericalDimensionField The dimension type field with numerical type columns.
   */
  public
      fun numericalDimensionField(numericalDimensionField: CfnAnalysis.NumericalDimensionFieldProperty) {
    cdkBuilder.numericalDimensionField(numericalDimensionField)
  }

  public fun build(): CfnAnalysis.DimensionFieldProperty = cdkBuilder.build()
}
