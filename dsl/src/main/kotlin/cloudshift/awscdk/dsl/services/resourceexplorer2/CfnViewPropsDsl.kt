@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourceexplorer2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resourceexplorer2.CfnView
import software.amazon.awscdk.services.resourceexplorer2.CfnViewProps

@CdkDslMarker
public class CfnViewPropsDsl {
  private val cdkBuilder: CfnViewProps.Builder = CfnViewProps.builder()

  private val _includedProperties: MutableList<Any> = mutableListOf()

  public fun filters(filters: IResolvable) {
    cdkBuilder.filters(filters)
  }

  public fun filters(filters: CfnView.FiltersProperty) {
    cdkBuilder.filters(filters)
  }

  public fun includedProperties(vararg includedProperties: Any) {
    _includedProperties.addAll(listOf(*includedProperties))
  }

  public fun includedProperties(includedProperties: Collection<Any>) {
    _includedProperties.addAll(includedProperties)
  }

  public fun includedProperties(includedProperties: IResolvable) {
    cdkBuilder.includedProperties(includedProperties)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun viewName(viewName: String) {
    cdkBuilder.viewName(viewName)
  }

  public fun build(): CfnViewProps {
    if(_includedProperties.isNotEmpty()) cdkBuilder.includedProperties(_includedProperties)
    return cdkBuilder.build()
  }
}
