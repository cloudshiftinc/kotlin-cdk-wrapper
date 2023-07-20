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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig
import kotlin.String

@CdkDslMarker
public class CfnRealtimeLogConfigKinesisStreamConfigPropertyDsl {
    private val cdkBuilder: CfnRealtimeLogConfig.KinesisStreamConfigProperty.Builder =
        CfnRealtimeLogConfig.KinesisStreamConfigProperty.builder()

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
    }

    public fun build(): CfnRealtimeLogConfig.KinesisStreamConfigProperty = cdkBuilder.build()
}
