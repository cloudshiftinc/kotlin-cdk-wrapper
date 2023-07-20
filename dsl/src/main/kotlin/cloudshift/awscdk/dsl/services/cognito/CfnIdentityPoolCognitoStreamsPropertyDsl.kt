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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.CfnIdentityPool
import kotlin.String

@CdkDslMarker
public class CfnIdentityPoolCognitoStreamsPropertyDsl {
    private val cdkBuilder: CfnIdentityPool.CognitoStreamsProperty.Builder =
        CfnIdentityPool.CognitoStreamsProperty.builder()

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
    }

    public fun streamingStatus(streamingStatus: String) {
        cdkBuilder.streamingStatus(streamingStatus)
    }

    public fun build(): CfnIdentityPool.CognitoStreamsProperty = cdkBuilder.build()
}
