@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

@CdkDslMarker
public class CfnThemeThemeConfigurationPropertyDsl {
    private val cdkBuilder: CfnTheme.ThemeConfigurationProperty.Builder =
        CfnTheme.ThemeConfigurationProperty.builder()

    public fun dataColorPalette(dataColorPalette: IResolvable) {
        cdkBuilder.dataColorPalette(dataColorPalette)
    }

    public fun dataColorPalette(dataColorPalette: CfnTheme.DataColorPaletteProperty) {
        cdkBuilder.dataColorPalette(dataColorPalette)
    }

    public fun sheet(sheet: IResolvable) {
        cdkBuilder.sheet(sheet)
    }

    public fun sheet(sheet: CfnTheme.SheetStyleProperty) {
        cdkBuilder.sheet(sheet)
    }

    public fun typography(typography: IResolvable) {
        cdkBuilder.typography(typography)
    }

    public fun typography(typography: CfnTheme.TypographyProperty) {
        cdkBuilder.typography(typography)
    }

    public fun uiColorPalette(uiColorPalette: IResolvable) {
        cdkBuilder.uiColorPalette(uiColorPalette)
    }

    public fun uiColorPalette(uiColorPalette: CfnTheme.UIColorPaletteProperty) {
        cdkBuilder.uiColorPalette(uiColorPalette)
    }

    public fun build(): CfnTheme.ThemeConfigurationProperty = cdkBuilder.build()
}
