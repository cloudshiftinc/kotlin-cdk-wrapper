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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings
import kotlin.String

@CdkDslMarker
public class CfnApplicationSettingsQuietTimePropertyDsl {
    private val cdkBuilder: CfnApplicationSettings.QuietTimeProperty.Builder =
        CfnApplicationSettings.QuietTimeProperty.builder()

    public fun end(end: String) {
        cdkBuilder.end(end)
    }

    public fun start(start: String) {
        cdkBuilder.start(start)
    }

    public fun build(): CfnApplicationSettings.QuietTimeProperty = cdkBuilder.build()
}
