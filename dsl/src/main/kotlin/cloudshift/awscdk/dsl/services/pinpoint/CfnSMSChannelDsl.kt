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
import software.amazon.awscdk.services.pinpoint.CfnSMSChannel
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnSMSChannelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSMSChannel.Builder = CfnSMSChannel.Builder.create(scope, id)

    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun senderId(senderId: String) {
        cdkBuilder.senderId(senderId)
    }

    public fun shortCode(shortCode: String) {
        cdkBuilder.shortCode(shortCode)
    }

    public fun build(): CfnSMSChannel = cdkBuilder.build()
}
