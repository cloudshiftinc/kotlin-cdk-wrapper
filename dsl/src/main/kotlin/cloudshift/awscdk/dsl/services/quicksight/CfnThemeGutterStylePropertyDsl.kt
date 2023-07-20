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
import kotlin.Boolean

@CdkDslMarker
public class CfnThemeGutterStylePropertyDsl {
    private val cdkBuilder: CfnTheme.GutterStyleProperty.Builder =
        CfnTheme.GutterStyleProperty.builder()

    public fun show(show: Boolean) {
        cdkBuilder.show(show)
    }

    public fun show(show: IResolvable) {
        cdkBuilder.show(show)
    }

    public fun build(): CfnTheme.GutterStyleProperty = cdkBuilder.build()
}
