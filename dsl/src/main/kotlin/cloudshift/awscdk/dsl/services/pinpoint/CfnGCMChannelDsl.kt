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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnGCMChannel
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnGCMChannelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGCMChannel.Builder = CfnGCMChannel.Builder.create(scope, id)

    public fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
    }

    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnGCMChannel = cdkBuilder.build()
}
