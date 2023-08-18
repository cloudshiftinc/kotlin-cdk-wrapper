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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme

/**
 * Display options related to tiles on a sheet.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TileStyleProperty tileStyleProperty = TileStyleProperty.builder()
 * .border(BorderStyleProperty.builder()
 * .show(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-theme-tilestyle.html)
 */
@CdkDslMarker
public class CfnThemeTileStylePropertyDsl {
    private val cdkBuilder: CfnTheme.TileStyleProperty.Builder =
        CfnTheme.TileStyleProperty.builder()

    /** @param border The border around a tile. */
    public fun border(border: IResolvable) {
        cdkBuilder.border(border)
    }

    /** @param border The border around a tile. */
    public fun border(border: CfnTheme.BorderStyleProperty) {
        cdkBuilder.border(border)
    }

    public fun build(): CfnTheme.TileStyleProperty = cdkBuilder.build()
}
