@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFunnelChartAggregatedFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.FunnelChartAggregatedFieldWellsProperty.Builder =
      CfnTemplate.FunnelChartAggregatedFieldWellsProperty.builder()

  private val _category: MutableList<Any> = mutableListOf()

  private val _values: MutableList<Any> = mutableListOf()

  public fun category(vararg category: Any) {
    _category.addAll(listOf(*category))
  }

  public fun category(category: Collection<Any>) {
    _category.addAll(category)
  }

  public fun category(category: IResolvable) {
    cdkBuilder.category(category)
  }

  public fun values(vararg values: Any) {
    _values.addAll(listOf(*values))
  }

  public fun values(values: Collection<Any>) {
    _values.addAll(values)
  }

  public fun values(values: IResolvable) {
    cdkBuilder.values(values)
  }

  public fun build(): CfnTemplate.FunnelChartAggregatedFieldWellsProperty {
    if(_category.isNotEmpty()) cdkBuilder.category(_category)
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
