@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

/**
 * The theme configuration.
 *
 * This configuration contains all of the display properties for a theme.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ThemeConfigurationProperty themeConfigurationProperty = ThemeConfigurationProperty.builder()
 * .dataColorPalette(DataColorPaletteProperty.builder()
 * .colors(List.of("colors"))
 * .emptyFillColor("emptyFillColor")
 * .minMaxGradient(List.of("minMaxGradient"))
 * .build())
 * .sheet(SheetStyleProperty.builder()
 * .tile(TileStyleProperty.builder()
 * .border(BorderStyleProperty.builder()
 * .show(false)
 * .build())
 * .build())
 * .tileLayout(TileLayoutStyleProperty.builder()
 * .gutter(GutterStyleProperty.builder()
 * .show(false)
 * .build())
 * .margin(MarginStyleProperty.builder()
 * .show(false)
 * .build())
 * .build())
 * .build())
 * .typography(TypographyProperty.builder()
 * .fontFamilies(List.of(FontProperty.builder()
 * .fontFamily("fontFamily")
 * .build()))
 * .build())
 * .uiColorPalette(UIColorPaletteProperty.builder()
 * .accent("accent")
 * .accentForeground("accentForeground")
 * .danger("danger")
 * .dangerForeground("dangerForeground")
 * .dimension("dimension")
 * .dimensionForeground("dimensionForeground")
 * .measure("measure")
 * .measureForeground("measureForeground")
 * .primaryBackground("primaryBackground")
 * .primaryForeground("primaryForeground")
 * .secondaryBackground("secondaryBackground")
 * .secondaryForeground("secondaryForeground")
 * .success("success")
 * .successForeground("successForeground")
 * .warning("warning")
 * .warningForeground("warningForeground")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeconfiguration.html)
 */
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
