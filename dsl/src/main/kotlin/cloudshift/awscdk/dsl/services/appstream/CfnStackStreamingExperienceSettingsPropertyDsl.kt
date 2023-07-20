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
import software.amazon.awscdk.services.appstream.CfnStack
import kotlin.String

@CdkDslMarker
public class CfnStackStreamingExperienceSettingsPropertyDsl {
    private val cdkBuilder: CfnStack.StreamingExperienceSettingsProperty.Builder =
        CfnStack.StreamingExperienceSettingsProperty.builder()

    public fun preferredProtocol(preferredProtocol: String) {
        cdkBuilder.preferredProtocol(preferredProtocol)
    }

    public fun build(): CfnStack.StreamingExperienceSettingsProperty = cdkBuilder.build()
}
