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
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

/**
 * The display options for gutter spacing between tiles on a sheet.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GutterStyleProperty gutterStyleProperty = GutterStyleProperty.builder()
 * .show(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-gutterstyle.html)
 */
@CdkDslMarker
public class CfnThemeGutterStylePropertyDsl {
    private val cdkBuilder: CfnTheme.GutterStyleProperty.Builder =
        CfnTheme.GutterStyleProperty.builder()

    /**
     * @param show This Boolean value controls whether to display a gutter space between sheet
     *   tiles.
     */
    public fun show(show: Boolean) {
        cdkBuilder.show(show)
    }

    /**
     * @param show This Boolean value controls whether to display a gutter space between sheet
     *   tiles.
     */
    public fun show(show: IResolvable) {
        cdkBuilder.show(show)
    }

    public fun build(): CfnTheme.GutterStyleProperty = cdkBuilder.build()
}
