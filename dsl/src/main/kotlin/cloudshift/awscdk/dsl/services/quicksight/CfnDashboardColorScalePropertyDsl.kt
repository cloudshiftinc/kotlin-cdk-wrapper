@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardColorScalePropertyDsl {
  private val cdkBuilder: CfnDashboard.ColorScaleProperty.Builder =
      CfnDashboard.ColorScaleProperty.builder()

  private val _colors: MutableList<Any> = mutableListOf()

  /**
   * @param colorFillType Determines the color fill type. 
   */
  public fun colorFillType(colorFillType: String) {
    cdkBuilder.colorFillType(colorFillType)
  }

  /**
   * @param colors Determines the list of colors that are applied to the visual. 
   */
  public fun colors(vararg colors: Any) {
    _colors.addAll(listOf(*colors))
  }

  /**
   * @param colors Determines the list of colors that are applied to the visual. 
   */
  public fun colors(colors: Collection<Any>) {
    _colors.addAll(colors)
  }

  /**
   * @param colors Determines the list of colors that are applied to the visual. 
   */
  public fun colors(colors: IResolvable) {
    cdkBuilder.colors(colors)
  }

  /**
   * @param nullValueColor Determines the color that is applied to null values.
   */
  public fun nullValueColor(nullValueColor: IResolvable) {
    cdkBuilder.nullValueColor(nullValueColor)
  }

  /**
   * @param nullValueColor Determines the color that is applied to null values.
   */
  public fun nullValueColor(nullValueColor: CfnDashboard.DataColorProperty) {
    cdkBuilder.nullValueColor(nullValueColor)
  }

  public fun build(): CfnDashboard.ColorScaleProperty {
    if(_colors.isNotEmpty()) cdkBuilder.colors(_colors)
    return cdkBuilder.build()
  }
}
