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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnStack
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnStackApplicationSettingsPropertyDsl {
    private val cdkBuilder: CfnStack.ApplicationSettingsProperty.Builder =
        CfnStack.ApplicationSettingsProperty.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun settingsGroup(settingsGroup: String) {
        cdkBuilder.settingsGroup(settingsGroup)
    }

    public fun build(): CfnStack.ApplicationSettingsProperty = cdkBuilder.build()
}
