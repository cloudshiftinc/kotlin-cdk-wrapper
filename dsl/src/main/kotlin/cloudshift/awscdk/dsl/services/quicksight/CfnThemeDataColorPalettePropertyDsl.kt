@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnTheme

@CdkDslMarker
public class CfnThemeDataColorPalettePropertyDsl {
  private val cdkBuilder: CfnTheme.DataColorPaletteProperty.Builder =
      CfnTheme.DataColorPaletteProperty.builder()

  private val _colors: MutableList<String> = mutableListOf()

  private val _minMaxGradient: MutableList<String> = mutableListOf()

  /**
   * @param colors The hexadecimal codes for the colors.
   */
  public fun colors(vararg colors: String) {
    _colors.addAll(listOf(*colors))
  }

  /**
   * @param colors The hexadecimal codes for the colors.
   */
  public fun colors(colors: Collection<String>) {
    _colors.addAll(colors)
  }

  /**
   * @param emptyFillColor The hexadecimal code of a color that applies to charts where a lack of
   * data is highlighted.
   */
  public fun emptyFillColor(emptyFillColor: String) {
    cdkBuilder.emptyFillColor(emptyFillColor)
  }

  /**
   * @param minMaxGradient The minimum and maximum hexadecimal codes that describe a color gradient.
   */
  public fun minMaxGradient(vararg minMaxGradient: String) {
    _minMaxGradient.addAll(listOf(*minMaxGradient))
  }

  /**
   * @param minMaxGradient The minimum and maximum hexadecimal codes that describe a color gradient.
   */
  public fun minMaxGradient(minMaxGradient: Collection<String>) {
    _minMaxGradient.addAll(minMaxGradient)
  }

  public fun build(): CfnTheme.DataColorPaletteProperty {
    if(_colors.isNotEmpty()) cdkBuilder.colors(_colors)
    if(_minMaxGradient.isNotEmpty()) cdkBuilder.minMaxGradient(_minMaxGradient)
    return cdkBuilder.build()
  }
}
