@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardGeospatialHeatmapColorScalePropertyDsl {
  private val cdkBuilder: CfnDashboard.GeospatialHeatmapColorScaleProperty.Builder =
      CfnDashboard.GeospatialHeatmapColorScaleProperty.builder()

  private val _colors: MutableList<Any> = mutableListOf()

  public fun colors(vararg colors: Any) {
    _colors.addAll(listOf(*colors))
  }

  public fun colors(colors: Collection<Any>) {
    _colors.addAll(colors)
  }

  public fun colors(colors: IResolvable) {
    cdkBuilder.colors(colors)
  }

  public fun build(): CfnDashboard.GeospatialHeatmapColorScaleProperty {
    if(_colors.isNotEmpty()) cdkBuilder.colors(_colors)
    return cdkBuilder.build()
  }
}
