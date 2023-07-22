@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisVisualPalettePropertyDsl {
  private val cdkBuilder: CfnAnalysis.VisualPaletteProperty.Builder =
      CfnAnalysis.VisualPaletteProperty.builder()

  private val _colorMap: MutableList<Any> = mutableListOf()

  /**
   * @param chartColor The chart color options for the visual palette.
   */
  public fun chartColor(chartColor: String) {
    cdkBuilder.chartColor(chartColor)
  }

  /**
   * @param colorMap The color map options for the visual palette.
   */
  public fun colorMap(vararg colorMap: Any) {
    _colorMap.addAll(listOf(*colorMap))
  }

  /**
   * @param colorMap The color map options for the visual palette.
   */
  public fun colorMap(colorMap: Collection<Any>) {
    _colorMap.addAll(colorMap)
  }

  /**
   * @param colorMap The color map options for the visual palette.
   */
  public fun colorMap(colorMap: IResolvable) {
    cdkBuilder.colorMap(colorMap)
  }

  public fun build(): CfnAnalysis.VisualPaletteProperty {
    if(_colorMap.isNotEmpty()) cdkBuilder.colorMap(_colorMap)
    return cdkBuilder.build()
  }
}
