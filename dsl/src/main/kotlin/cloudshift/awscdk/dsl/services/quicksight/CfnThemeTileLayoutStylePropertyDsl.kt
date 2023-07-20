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
public class CfnThemeTileLayoutStylePropertyDsl {
    private val cdkBuilder: CfnTheme.TileLayoutStyleProperty.Builder =
        CfnTheme.TileLayoutStyleProperty.builder()

    public fun gutter(gutter: IResolvable) {
        cdkBuilder.gutter(gutter)
    }

    public fun gutter(gutter: CfnTheme.GutterStyleProperty) {
        cdkBuilder.gutter(gutter)
    }

    public fun margin(margin: IResolvable) {
        cdkBuilder.margin(margin)
    }

    public fun margin(margin: CfnTheme.MarginStyleProperty) {
        cdkBuilder.margin(margin)
    }

    public fun build(): CfnTheme.TileLayoutStyleProperty = cdkBuilder.build()
}
