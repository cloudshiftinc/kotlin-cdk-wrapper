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
 * The display options for tile borders for visuals.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * BorderStyleProperty borderStyleProperty = BorderStyleProperty.builder()
 * .show(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-borderstyle.html)
 */
@CdkDslMarker
public class CfnThemeBorderStylePropertyDsl {
    private val cdkBuilder: CfnTheme.BorderStyleProperty.Builder =
        CfnTheme.BorderStyleProperty.builder()

    /** @param show The option to enable display of borders for visuals. */
    public fun show(show: Boolean) {
        cdkBuilder.show(show)
    }

    /** @param show The option to enable display of borders for visuals. */
    public fun show(show: IResolvable) {
        cdkBuilder.show(show)
    }

    public fun build(): CfnTheme.BorderStyleProperty = cdkBuilder.build()
}
