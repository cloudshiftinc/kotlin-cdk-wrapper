@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTreeMapAggregatedFieldWellsPropertyDsl {
  private val cdkBuilder: CfnTemplate.TreeMapAggregatedFieldWellsProperty.Builder =
      CfnTemplate.TreeMapAggregatedFieldWellsProperty.builder()

  private val _colors: MutableList<Any> = mutableListOf()

  private val _groups: MutableList<Any> = mutableListOf()

  private val _sizes: MutableList<Any> = mutableListOf()

  public fun colors(vararg colors: Any) {
    _colors.addAll(listOf(*colors))
  }

  public fun colors(colors: Collection<Any>) {
    _colors.addAll(colors)
  }

  public fun colors(colors: IResolvable) {
    cdkBuilder.colors(colors)
  }

  public fun groups(vararg groups: Any) {
    _groups.addAll(listOf(*groups))
  }

  public fun groups(groups: Collection<Any>) {
    _groups.addAll(groups)
  }

  public fun groups(groups: IResolvable) {
    cdkBuilder.groups(groups)
  }

  public fun sizes(vararg sizes: Any) {
    _sizes.addAll(listOf(*sizes))
  }

  public fun sizes(sizes: Collection<Any>) {
    _sizes.addAll(sizes)
  }

  public fun sizes(sizes: IResolvable) {
    cdkBuilder.sizes(sizes)
  }

  public fun build(): CfnTemplate.TreeMapAggregatedFieldWellsProperty {
    if(_colors.isNotEmpty()) cdkBuilder.colors(_colors)
    if(_groups.isNotEmpty()) cdkBuilder.groups(_groups)
    if(_sizes.isNotEmpty()) cdkBuilder.sizes(_sizes)
    return cdkBuilder.build()
  }
}
