@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

/**
 * The display options for the layout of tiles on a sheet.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TileLayoutStyleProperty tileLayoutStyleProperty = TileLayoutStyleProperty.builder()
 * .gutter(GutterStyleProperty.builder()
 * .show(false)
 * .build())
 * .margin(MarginStyleProperty.builder()
 * .show(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-tilelayoutstyle.html)
 */
@CdkDslMarker
public class CfnThemeTileLayoutStylePropertyDsl {
    private val cdkBuilder: CfnTheme.TileLayoutStyleProperty.Builder =
        CfnTheme.TileLayoutStyleProperty.builder()

    /**
     * @param gutter The gutter settings that apply between tiles.
     */
    public fun gutter(gutter: IResolvable) {
        cdkBuilder.gutter(gutter)
    }

    /**
     * @param gutter The gutter settings that apply between tiles.
     */
    public fun gutter(gutter: CfnTheme.GutterStyleProperty) {
        cdkBuilder.gutter(gutter)
    }

    /**
     * @param margin The margin settings that apply around the outside edge of sheets.
     */
    public fun margin(margin: IResolvable) {
        cdkBuilder.margin(margin)
    }

    /**
     * @param margin The margin settings that apply around the outside edge of sheets.
     */
    public fun margin(margin: CfnTheme.MarginStyleProperty) {
        cdkBuilder.margin(margin)
    }

    public fun build(): CfnTheme.TileLayoutStyleProperty = cdkBuilder.build()
}
