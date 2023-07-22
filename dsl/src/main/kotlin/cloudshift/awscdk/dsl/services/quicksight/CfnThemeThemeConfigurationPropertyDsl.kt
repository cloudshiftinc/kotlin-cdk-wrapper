@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

@CdkDslMarker
public class CfnThemeThemeConfigurationPropertyDsl {
  private val cdkBuilder: CfnTheme.ThemeConfigurationProperty.Builder =
      CfnTheme.ThemeConfigurationProperty.builder()

  /**
   * @param dataColorPalette Color properties that apply to chart data colors.
   */
  public fun dataColorPalette(dataColorPalette: IResolvable) {
    cdkBuilder.dataColorPalette(dataColorPalette)
  }

  /**
   * @param dataColorPalette Color properties that apply to chart data colors.
   */
  public fun dataColorPalette(dataColorPalette: CfnTheme.DataColorPaletteProperty) {
    cdkBuilder.dataColorPalette(dataColorPalette)
  }

  /**
   * @param sheet Display options related to sheets.
   */
  public fun sheet(sheet: IResolvable) {
    cdkBuilder.sheet(sheet)
  }

  /**
   * @param sheet Display options related to sheets.
   */
  public fun sheet(sheet: CfnTheme.SheetStyleProperty) {
    cdkBuilder.sheet(sheet)
  }

  /**
   * @param typography the value to be set.
   */
  public fun typography(typography: IResolvable) {
    cdkBuilder.typography(typography)
  }

  /**
   * @param typography the value to be set.
   */
  public fun typography(typography: CfnTheme.TypographyProperty) {
    cdkBuilder.typography(typography)
  }

  /**
   * @param uiColorPalette Color properties that apply to the UI and to charts, excluding the colors
   * that apply to data.
   */
  public fun uiColorPalette(uiColorPalette: IResolvable) {
    cdkBuilder.uiColorPalette(uiColorPalette)
  }

  /**
   * @param uiColorPalette Color properties that apply to the UI and to charts, excluding the colors
   * that apply to data.
   */
  public fun uiColorPalette(uiColorPalette: CfnTheme.UIColorPaletteProperty) {
    cdkBuilder.uiColorPalette(uiColorPalette)
  }

  public fun build(): CfnTheme.ThemeConfigurationProperty = cdkBuilder.build()
}
