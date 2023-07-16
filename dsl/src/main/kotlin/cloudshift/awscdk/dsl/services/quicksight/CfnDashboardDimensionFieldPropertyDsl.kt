@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDimensionFieldPropertyDsl {
  private val cdkBuilder: CfnDashboard.DimensionFieldProperty.Builder =
      CfnDashboard.DimensionFieldProperty.builder()

  public fun categoricalDimensionField(categoricalDimensionField: IResolvable) {
    cdkBuilder.categoricalDimensionField(categoricalDimensionField)
  }

  public
      fun categoricalDimensionField(categoricalDimensionField: CfnDashboard.CategoricalDimensionFieldProperty) {
    cdkBuilder.categoricalDimensionField(categoricalDimensionField)
  }

  public fun dateDimensionField(dateDimensionField: IResolvable) {
    cdkBuilder.dateDimensionField(dateDimensionField)
  }

  public fun dateDimensionField(dateDimensionField: CfnDashboard.DateDimensionFieldProperty) {
    cdkBuilder.dateDimensionField(dateDimensionField)
  }

  public fun numericalDimensionField(numericalDimensionField: IResolvable) {
    cdkBuilder.numericalDimensionField(numericalDimensionField)
  }

  public
      fun numericalDimensionField(numericalDimensionField: CfnDashboard.NumericalDimensionFieldProperty) {
    cdkBuilder.numericalDimensionField(numericalDimensionField)
  }

  public fun build(): CfnDashboard.DimensionFieldProperty = cdkBuilder.build()
}
