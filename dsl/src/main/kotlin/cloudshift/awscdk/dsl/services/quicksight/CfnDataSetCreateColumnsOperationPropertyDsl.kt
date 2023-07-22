@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetCreateColumnsOperationPropertyDsl {
  private val cdkBuilder: CfnDataSet.CreateColumnsOperationProperty.Builder =
      CfnDataSet.CreateColumnsOperationProperty.builder()

  private val _columns: MutableList<Any> = mutableListOf()

  /**
   * @param columns Calculated columns to create. 
   */
  public fun columns(vararg columns: Any) {
    _columns.addAll(listOf(*columns))
  }

  /**
   * @param columns Calculated columns to create. 
   */
  public fun columns(columns: Collection<Any>) {
    _columns.addAll(columns)
  }

  /**
   * @param columns Calculated columns to create. 
   */
  public fun columns(columns: IResolvable) {
    cdkBuilder.columns(columns)
  }

  public fun build(): CfnDataSet.CreateColumnsOperationProperty {
    if(_columns.isNotEmpty()) cdkBuilder.columns(_columns)
    return cdkBuilder.build()
  }
}
