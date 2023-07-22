@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetTagColumnOperationPropertyDsl {
  private val cdkBuilder: CfnDataSet.TagColumnOperationProperty.Builder =
      CfnDataSet.TagColumnOperationProperty.builder()

  private val _tags: MutableList<CfnDataSet.ColumnTagProperty> = mutableListOf()

  /**
   * @param columnName The column that this operation acts on. 
   */
  public fun columnName(columnName: String) {
    cdkBuilder.columnName(columnName)
  }

  /**
   * @param tags The dataset column tag, currently only used for geospatial type tagging. 
   *
   * This is not tags for the AWS tagging feature.
   */
  public fun tags(tags: CfnDataSetColumnTagPropertyDsl.() -> Unit) {
    _tags.add(CfnDataSetColumnTagPropertyDsl().apply(tags).build())
  }

  /**
   * @param tags The dataset column tag, currently only used for geospatial type tagging. 
   *
   * This is not tags for the AWS tagging feature.
   */
  public fun tags(tags: Collection<CfnDataSet.ColumnTagProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDataSet.TagColumnOperationProperty {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
