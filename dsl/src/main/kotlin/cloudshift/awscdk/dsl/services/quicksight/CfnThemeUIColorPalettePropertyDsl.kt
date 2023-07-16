@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTheme

@CdkDslMarker
public class CfnThemeUIColorPalettePropertyDsl {
  private val cdkBuilder: CfnTheme.UIColorPaletteProperty.Builder =
      CfnTheme.UIColorPaletteProperty.builder()

  public fun accent(accent: String) {
    cdkBuilder.accent(accent)
  }

  public fun accentForeground(accentForeground: String) {
    cdkBuilder.accentForeground(accentForeground)
  }

  public fun danger(danger: String) {
    cdkBuilder.danger(danger)
  }

  public fun dangerForeground(dangerForeground: String) {
    cdkBuilder.dangerForeground(dangerForeground)
  }

  public fun dimension(dimension: String) {
    cdkBuilder.dimension(dimension)
  }

  public fun dimensionForeground(dimensionForeground: String) {
    cdkBuilder.dimensionForeground(dimensionForeground)
  }

  public fun measure(measure: String) {
    cdkBuilder.measure(measure)
  }

  public fun measureForeground(measureForeground: String) {
    cdkBuilder.measureForeground(measureForeground)
  }

  public fun primaryBackground(primaryBackground: String) {
    cdkBuilder.primaryBackground(primaryBackground)
  }

  public fun primaryForeground(primaryForeground: String) {
    cdkBuilder.primaryForeground(primaryForeground)
  }

  public fun secondaryBackground(secondaryBackground: String) {
    cdkBuilder.secondaryBackground(secondaryBackground)
  }

  public fun secondaryForeground(secondaryForeground: String) {
    cdkBuilder.secondaryForeground(secondaryForeground)
  }

  public fun success(success: String) {
    cdkBuilder.success(success)
  }

  public fun successForeground(successForeground: String) {
    cdkBuilder.successForeground(successForeground)
  }

  public fun warning(warning: String) {
    cdkBuilder.warning(warning)
  }

  public fun warningForeground(warningForeground: String) {
    cdkBuilder.warningForeground(warningForeground)
  }

  public fun build(): CfnTheme.UIColorPaletteProperty = cdkBuilder.build()
}
