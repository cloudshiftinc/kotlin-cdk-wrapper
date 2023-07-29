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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

/**
 * The theme display options for sheets.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SheetStyleProperty sheetStyleProperty = SheetStyleProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-sheetstyle.html)
 */
@CdkDslMarker
public class CfnThemeSheetStylePropertyDsl {
    private val cdkBuilder: CfnTheme.SheetStyleProperty.Builder =
        CfnTheme.SheetStyleProperty.builder()

    /** @param tile The display options for tiles. */
    public fun tile(tile: IResolvable) {
        cdkBuilder.tile(tile)
    }

    /** @param tile The display options for tiles. */
    public fun tile(tile: CfnTheme.TileStyleProperty) {
        cdkBuilder.tile(tile)
    }

    /** @param tileLayout The layout options for tiles. */
    public fun tileLayout(tileLayout: IResolvable) {
        cdkBuilder.tileLayout(tileLayout)
    }

    /** @param tileLayout The layout options for tiles. */
    public fun tileLayout(tileLayout: CfnTheme.TileLayoutStyleProperty) {
        cdkBuilder.tileLayout(tileLayout)
    }

    public fun build(): CfnTheme.SheetStyleProperty = cdkBuilder.build()
}
