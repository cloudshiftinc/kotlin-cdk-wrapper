@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDataSetSchemaPropertyDsl {
  private val cdkBuilder: CfnTemplate.DataSetSchemaProperty.Builder =
      CfnTemplate.DataSetSchemaProperty.builder()

  private val _columnSchemaList: MutableList<Any> = mutableListOf()

  public fun columnSchemaList(vararg columnSchemaList: Any) {
    _columnSchemaList.addAll(listOf(*columnSchemaList))
  }

  public fun columnSchemaList(columnSchemaList: Collection<Any>) {
    _columnSchemaList.addAll(columnSchemaList)
  }

  public fun columnSchemaList(columnSchemaList: IResolvable) {
    cdkBuilder.columnSchemaList(columnSchemaList)
  }

  public fun build(): CfnTemplate.DataSetSchemaProperty {
    if(_columnSchemaList.isNotEmpty()) cdkBuilder.columnSchemaList(_columnSchemaList)
    return cdkBuilder.build()
  }
}
