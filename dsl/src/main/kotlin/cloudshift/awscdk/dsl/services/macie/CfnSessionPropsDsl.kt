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

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.macie.CfnSessionProps
import kotlin.String

@CdkDslMarker
public class CfnSessionPropsDsl {
    private val cdkBuilder: CfnSessionProps.Builder = CfnSessionProps.builder()

    public fun findingPublishingFrequency(findingPublishingFrequency: String) {
        cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnSessionProps = cdkBuilder.build()
}
