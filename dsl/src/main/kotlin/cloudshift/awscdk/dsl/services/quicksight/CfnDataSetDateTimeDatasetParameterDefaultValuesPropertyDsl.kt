@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetDateTimeDatasetParameterDefaultValuesPropertyDsl {
  private val cdkBuilder: CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty.Builder =
      CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty.builder()

  private val _staticValues: MutableList<String> = mutableListOf()

  /**
   * @param staticValues the value to be set.
   */
  public fun staticValues(vararg staticValues: String) {
    _staticValues.addAll(listOf(*staticValues))
  }

  /**
   * @param staticValues the value to be set.
   */
  public fun staticValues(staticValues: Collection<String>) {
    _staticValues.addAll(staticValues)
  }

  public fun build(): CfnDataSet.DateTimeDatasetParameterDefaultValuesProperty {
    if(_staticValues.isNotEmpty()) cdkBuilder.staticValues(_staticValues)
    return cdkBuilder.build()
  }
}
