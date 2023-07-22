@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetProjectOperationPropertyDsl {
  private val cdkBuilder: CfnDataSet.ProjectOperationProperty.Builder =
      CfnDataSet.ProjectOperationProperty.builder()

  private val _projectedColumns: MutableList<String> = mutableListOf()

  /**
   * @param projectedColumns Projected columns. 
   */
  public fun projectedColumns(vararg projectedColumns: String) {
    _projectedColumns.addAll(listOf(*projectedColumns))
  }

  /**
   * @param projectedColumns Projected columns. 
   */
  public fun projectedColumns(projectedColumns: Collection<String>) {
    _projectedColumns.addAll(projectedColumns)
  }

  public fun build(): CfnDataSet.ProjectOperationProperty {
    if(_projectedColumns.isNotEmpty()) cdkBuilder.projectedColumns(_projectedColumns)
    return cdkBuilder.build()
  }
}
