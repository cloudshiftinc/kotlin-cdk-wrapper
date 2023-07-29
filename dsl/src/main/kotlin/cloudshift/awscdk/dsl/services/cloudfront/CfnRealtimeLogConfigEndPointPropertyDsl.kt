@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig

/**
 * Contains information about the Amazon Kinesis data stream where you are sending real-time log
 * data in a real-time log configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * EndPointProperty endPointProperty = EndPointProperty.builder()
 * .kinesisStreamConfig(KinesisStreamConfigProperty.builder()
 * .roleArn("roleArn")
 * .streamArn("streamArn")
 * .build())
 * .streamType("streamType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-realtimelogconfig-endpoint.html)
 */
@CdkDslMarker
public class CfnRealtimeLogConfigEndPointPropertyDsl {
    private val cdkBuilder: CfnRealtimeLogConfig.EndPointProperty.Builder =
        CfnRealtimeLogConfig.EndPointProperty.builder()

    /**
     * @param kinesisStreamConfig Contains information about the Amazon Kinesis data stream where
     *   you are sending real-time log data.
     */
    public fun kinesisStreamConfig(kinesisStreamConfig: IResolvable) {
        cdkBuilder.kinesisStreamConfig(kinesisStreamConfig)
    }

    /**
     * @param kinesisStreamConfig Contains information about the Amazon Kinesis data stream where
     *   you are sending real-time log data.
     */
    public fun kinesisStreamConfig(
        kinesisStreamConfig: CfnRealtimeLogConfig.KinesisStreamConfigProperty
    ) {
        cdkBuilder.kinesisStreamConfig(kinesisStreamConfig)
    }

    /**
     * @param streamType The type of data stream where you are sending real-time log data. The only
     *   valid value is `Kinesis` .
     */
    public fun streamType(streamType: String) {
        cdkBuilder.streamType(streamType)
    }

    public fun build(): CfnRealtimeLogConfig.EndPointProperty = cdkBuilder.build()
}
