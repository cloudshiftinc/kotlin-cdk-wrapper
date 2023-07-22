@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetIntegerDatasetParameterDefaultValuesPropertyDsl {
  private val cdkBuilder: CfnDataSet.IntegerDatasetParameterDefaultValuesProperty.Builder =
      CfnDataSet.IntegerDatasetParameterDefaultValuesProperty.builder()

  private val _staticValues: MutableList<Number> = mutableListOf()

  /**
   * @param staticValues the value to be set.
   */
  public fun staticValues(vararg staticValues: Number) {
    _staticValues.addAll(listOf(*staticValues))
  }

  /**
   * @param staticValues the value to be set.
   */
  public fun staticValues(staticValues: Collection<Number>) {
    _staticValues.addAll(staticValues)
  }

  /**
   * @param staticValues the value to be set.
   */
  public fun staticValues(staticValues: IResolvable) {
    cdkBuilder.staticValues(staticValues)
  }

  public fun build(): CfnDataSet.IntegerDatasetParameterDefaultValuesProperty {
    if(_staticValues.isNotEmpty()) cdkBuilder.staticValues(_staticValues)
    return cdkBuilder.build()
  }
}
