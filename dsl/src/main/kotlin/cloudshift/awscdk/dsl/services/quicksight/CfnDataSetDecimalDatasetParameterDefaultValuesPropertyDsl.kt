@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetDecimalDatasetParameterDefaultValuesPropertyDsl {
  private val cdkBuilder: CfnDataSet.DecimalDatasetParameterDefaultValuesProperty.Builder =
      CfnDataSet.DecimalDatasetParameterDefaultValuesProperty.builder()

  private val _staticValues: MutableList<Number> = mutableListOf()

  public fun staticValues(vararg staticValues: Number) {
    _staticValues.addAll(listOf(*staticValues))
  }

  public fun staticValues(staticValues: Collection<Number>) {
    _staticValues.addAll(staticValues)
  }

  public fun staticValues(staticValues: IResolvable) {
    cdkBuilder.staticValues(staticValues)
  }

  public fun build(): CfnDataSet.DecimalDatasetParameterDefaultValuesProperty {
    if(_staticValues.isNotEmpty()) cdkBuilder.staticValues(_staticValues)
    return cdkBuilder.build()
  }
}
