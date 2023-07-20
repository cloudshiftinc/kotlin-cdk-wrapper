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
import software.amazon.awscdk.services.macie.CfnSession
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnSessionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSession.Builder = CfnSession.Builder.create(scope, id)

    public fun findingPublishingFrequency(findingPublishingFrequency: String) {
        cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnSession = cdkBuilder.build()
}
