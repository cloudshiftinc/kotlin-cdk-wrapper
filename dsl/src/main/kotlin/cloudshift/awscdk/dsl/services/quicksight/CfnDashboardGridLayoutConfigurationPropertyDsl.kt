@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardGridLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.GridLayoutConfigurationProperty.Builder =
      CfnDashboard.GridLayoutConfigurationProperty.builder()

  private val _elements: MutableList<Any> = mutableListOf()

  public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  public
      fun canvasSizeOptions(canvasSizeOptions: CfnDashboard.GridLayoutCanvasSizeOptionsProperty) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  public fun elements(vararg elements: Any) {
    _elements.addAll(listOf(*elements))
  }

  public fun elements(elements: Collection<Any>) {
    _elements.addAll(elements)
  }

  public fun elements(elements: IResolvable) {
    cdkBuilder.elements(elements)
  }

  public fun build(): CfnDashboard.GridLayoutConfigurationProperty {
    if(_elements.isNotEmpty()) cdkBuilder.elements(_elements)
    return cdkBuilder.build()
  }
}
