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

  public fun colorFillType(colorFillType: String) {
    cdkBuilder.colorFillType(colorFillType)
  }

  public fun colors(vararg colors: Any) {
    _colors.addAll(listOf(*colors))
  }

  public fun colors(colors: Collection<Any>) {
    _colors.addAll(colors)
  }

  public fun colors(colors: IResolvable) {
    cdkBuilder.colors(colors)
  }

  public fun nullValueColor(nullValueColor: IResolvable) {
    cdkBuilder.nullValueColor(nullValueColor)
  }

  public fun nullValueColor(nullValueColor: CfnDashboard.DataColorProperty) {
    cdkBuilder.nullValueColor(nullValueColor)
  }

  public fun build(): CfnDashboard.ColorScaleProperty {
    if(_colors.isNotEmpty()) cdkBuilder.colors(_colors)
    return cdkBuilder.build()
  }
}
