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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig
import kotlin.String

@CdkDslMarker
public class CfnRealtimeLogConfigEndPointPropertyDsl {
    private val cdkBuilder: CfnRealtimeLogConfig.EndPointProperty.Builder =
        CfnRealtimeLogConfig.EndPointProperty.builder()

    public fun kinesisStreamConfig(kinesisStreamConfig: IResolvable) {
        cdkBuilder.kinesisStreamConfig(kinesisStreamConfig)
    }

    public fun kinesisStreamConfig(kinesisStreamConfig: CfnRealtimeLogConfig.KinesisStreamConfigProperty) {
        cdkBuilder.kinesisStreamConfig(kinesisStreamConfig)
    }

    public fun streamType(streamType: String) {
        cdkBuilder.streamType(streamType)
    }

    public fun build(): CfnRealtimeLogConfig.EndPointProperty = cdkBuilder.build()
}
