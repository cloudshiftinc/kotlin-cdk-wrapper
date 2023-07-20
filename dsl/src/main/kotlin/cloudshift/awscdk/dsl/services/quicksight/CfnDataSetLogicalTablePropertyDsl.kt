@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetLogicalTablePropertyDsl {
  private val cdkBuilder: CfnDataSet.LogicalTableProperty.Builder =
      CfnDataSet.LogicalTableProperty.builder()

  private val _dataTransforms: MutableList<Any> = mutableListOf()

  public fun alias(alias: String) {
    cdkBuilder.alias(alias)
  }

  public fun dataTransforms(vararg dataTransforms: Any) {
    _dataTransforms.addAll(listOf(*dataTransforms))
  }

  public fun dataTransforms(dataTransforms: Collection<Any>) {
    _dataTransforms.addAll(dataTransforms)
  }

  public fun dataTransforms(dataTransforms: IResolvable) {
    cdkBuilder.dataTransforms(dataTransforms)
  }

  public fun source(source: IResolvable) {
    cdkBuilder.source(source)
  }

  public fun source(source: CfnDataSet.LogicalTableSourceProperty) {
    cdkBuilder.source(source)
  }

  public fun build(): CfnDataSet.LogicalTableProperty {
    if(_dataTransforms.isNotEmpty()) cdkBuilder.dataTransforms(_dataTransforms)
    return cdkBuilder.build()
  }
}
