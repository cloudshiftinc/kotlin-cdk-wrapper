@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTheme

/**
 * The theme colors that apply to UI and to charts, excluding data colors.
 *
 * The colors description is a hexadecimal color code that consists of six alphanumerical
 * characters, prefixed with `#` , for example #37BFF5. For more information, see
 * [Using Themes in Amazon QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/themes-in-quicksight.html)
 * in the *Amazon QuickSight User Guide.*
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * UIColorPaletteProperty uIColorPaletteProperty = UIColorPaletteProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-uicolorpalette.html)
 */
@CdkDslMarker
public class CfnThemeUIColorPalettePropertyDsl {
    private val cdkBuilder: CfnTheme.UIColorPaletteProperty.Builder =
        CfnTheme.UIColorPaletteProperty.builder()

    /** @param accent This color is that applies to selected states and buttons. */
    public fun accent(accent: String) {
        cdkBuilder.accent(accent)
    }

    /**
     * @param accentForeground The foreground color that applies to any text or other elements that
     *   appear over the accent color.
     */
    public fun accentForeground(accentForeground: String) {
        cdkBuilder.accentForeground(accentForeground)
    }

    /** @param danger The color that applies to error messages. */
    public fun danger(danger: String) {
        cdkBuilder.danger(danger)
    }

    /**
     * @param dangerForeground The foreground color that applies to any text or other elements that
     *   appear over the error color.
     */
    public fun dangerForeground(dangerForeground: String) {
        cdkBuilder.dangerForeground(dangerForeground)
    }

    /**
     * @param dimension The color that applies to the names of fields that are identified as
     *   dimensions.
     */
    public fun dimension(dimension: String) {
        cdkBuilder.dimension(dimension)
    }

    /**
     * @param dimensionForeground The foreground color that applies to any text or other elements
     *   that appear over the dimension color.
     */
    public fun dimensionForeground(dimensionForeground: String) {
        cdkBuilder.dimensionForeground(dimensionForeground)
    }

    /**
     * @param measure The color that applies to the names of fields that are identified as measures.
     */
    public fun measure(measure: String) {
        cdkBuilder.measure(measure)
    }

    /**
     * @param measureForeground The foreground color that applies to any text or other elements that
     *   appear over the measure color.
     */
    public fun measureForeground(measureForeground: String) {
        cdkBuilder.measureForeground(measureForeground)
    }

    /**
     * @param primaryBackground The background color that applies to visuals and other high emphasis
     *   UI.
     */
    public fun primaryBackground(primaryBackground: String) {
        cdkBuilder.primaryBackground(primaryBackground)
    }

    /**
     * @param primaryForeground The color of text and other foreground elements that appear over the
     *   primary background regions, such as grid lines, borders, table banding, icons, and so on.
     */
    public fun primaryForeground(primaryForeground: String) {
        cdkBuilder.primaryForeground(primaryForeground)
    }

    /**
     * @param secondaryBackground The background color that applies to the sheet background and
     *   sheet controls.
     */
    public fun secondaryBackground(secondaryBackground: String) {
        cdkBuilder.secondaryBackground(secondaryBackground)
    }

    /**
     * @param secondaryForeground The foreground color that applies to any sheet title, sheet
     *   control text, or UI that appears over the secondary background.
     */
    public fun secondaryForeground(secondaryForeground: String) {
        cdkBuilder.secondaryForeground(secondaryForeground)
    }

    /**
     * @param success The color that applies to success messages, for example the check mark for a
     *   successful download.
     */
    public fun success(success: String) {
        cdkBuilder.success(success)
    }

    /**
     * @param successForeground The foreground color that applies to any text or other elements that
     *   appear over the success color.
     */
    public fun successForeground(successForeground: String) {
        cdkBuilder.successForeground(successForeground)
    }

    /** @param warning This color that applies to warning and informational messages. */
    public fun warning(warning: String) {
        cdkBuilder.warning(warning)
    }

    /**
     * @param warningForeground The foreground color that applies to any text or other elements that
     *   appear over the warning color.
     */
    public fun warningForeground(warningForeground: String) {
        cdkBuilder.warningForeground(warningForeground)
    }

    public fun build(): CfnTheme.UIColorPaletteProperty = cdkBuilder.build()
}
