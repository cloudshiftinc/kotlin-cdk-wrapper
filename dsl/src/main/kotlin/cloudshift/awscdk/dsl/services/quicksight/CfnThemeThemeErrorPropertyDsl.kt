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
import software.amazon.awscdk.services.quicksight.CfnTheme
import kotlin.String

@CdkDslMarker
public class CfnThemeThemeErrorPropertyDsl {
    private val cdkBuilder: CfnTheme.ThemeErrorProperty.Builder =
        CfnTheme.ThemeErrorProperty.builder()

    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTheme.ThemeErrorProperty = cdkBuilder.build()
}
