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
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

/**
 * A version of a theme.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ThemeVersionProperty themeVersionProperty = ThemeVersionProperty.builder()
 * .arn("arn")
 * .baseThemeId("baseThemeId")
 * .configuration(ThemeConfigurationProperty.builder()
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
 * .build())
 * .createdTime("createdTime")
 * .description("description")
 * .errors(List.of(ThemeErrorProperty.builder()
 * .message("message")
 * .type("type")
 * .build()))
 * .status("status")
 * .versionNumber(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-themeversion.html)
 */
@CdkDslMarker
public class CfnThemeThemeVersionPropertyDsl {
    private val cdkBuilder: CfnTheme.ThemeVersionProperty.Builder =
        CfnTheme.ThemeVersionProperty.builder()

    private val _errors: MutableList<Any> = mutableListOf()

    /** @param arn The Amazon Resource Name (ARN) of the resource. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /**
     * @param baseThemeId The Amazon QuickSight-defined ID of the theme that a custom theme inherits
     *   from. All themes initially inherit from a default Amazon QuickSight theme.
     */
    public fun baseThemeId(baseThemeId: String) {
        cdkBuilder.baseThemeId(baseThemeId)
    }

    /**
     * @param configuration The theme configuration, which contains all the theme display
     *   properties.
     */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * @param configuration The theme configuration, which contains all the theme display
     *   properties.
     */
    public fun configuration(configuration: CfnTheme.ThemeConfigurationProperty) {
        cdkBuilder.configuration(configuration)
    }

    /** @param createdTime The date and time that this theme version was created. */
    public fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
    }

    /** @param description The description of the theme. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param errors Errors associated with the theme. */
    public fun errors(vararg errors: Any) {
        _errors.addAll(listOf(*errors))
    }

    /** @param errors Errors associated with the theme. */
    public fun errors(errors: Collection<Any>) {
        _errors.addAll(errors)
    }

    /** @param errors Errors associated with the theme. */
    public fun errors(errors: IResolvable) {
        cdkBuilder.errors(errors)
    }

    /** @param status The status of the theme version. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /** @param versionNumber The version number of the theme. */
    public fun versionNumber(versionNumber: Number) {
        cdkBuilder.versionNumber(versionNumber)
    }

    public fun build(): CfnTheme.ThemeVersionProperty {
        if (_errors.isNotEmpty()) cdkBuilder.errors(_errors)
        return cdkBuilder.build()
    }
}
